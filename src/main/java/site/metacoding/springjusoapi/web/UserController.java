package site.metacoding.springjusoapi.web;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.springjusoapi.dto.JoinDto;
import site.metacoding.springjusoapi.handler.ex.CustomException;
import site.metacoding.springjusoapi.service.UserService;

@RequiredArgsConstructor
@Controller
public class UserController {

    // DI
    private final UserService userService;

    // 메인페이지
    @GetMapping("/")
    public String main() {
        return "main";
    }

    // 로그인 페이지
    @GetMapping("/loginForm")
    public String loginForm() {
        return "loginForm";
    }

    // 회원가입 페이지
    @GetMapping("/joinForm")
    public String joinForm() {
        return "joinForm";
    }

    // // 주소창 팝업
    // @GetMapping("/jusoPopup")
    // public String juso() {

    // }

    // 회원가입
    @PostMapping("/join")
    public String join(@Valid JoinDto joinDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            Map<String, String> errorMap = new HashMap<>();
            for (FieldError fe : bindingResult.getFieldErrors()) {
                errorMap.put(fe.getField(), fe.getDefaultMessage());
            }
            // 이부분에서 data리턴인지 html 리턴인지 이것만 구분해서 터트려줘!!
            throw new CustomException(errorMap.toString());
        }

        // 핵심 로직
        userService.회원가입(joinDto.toEntity());
        return "redirect:/loginForm";
    }

}
