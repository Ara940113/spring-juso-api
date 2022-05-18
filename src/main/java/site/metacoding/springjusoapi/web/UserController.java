package site.metacoding.springjusoapi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // 메인페이지
    @GetMapping("/")
    public String main() {
        return "main";
    }

    // 로그인 페이지
    @GetMapping("/loginForm")
    public String login() {
        return "loginForm";
    }

    // 회원가입 페이지
    @GetMapping("/joinForm")
    public String join() {
        return "joinForm";
    }

}
