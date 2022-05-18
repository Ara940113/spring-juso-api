package site.metacoding.springjusoapi.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import site.metacoding.springjusoapi.domain.user.User;

public class JoinDto {

    @Pattern(regexp = "[a-zA-Z1-9]{4,20}", message = "유저네임은 한글이 들어갈 수 없습니다.")
    @Size(max = 20)
    @NotBlank
    private String username;

    @Size(max = 100)
    @NotBlank
    private String password;

    @Size(max = 300)
    @NotBlank // @NotNull, @NotEmpty 두개의 조합
    private String address;

    public User toEntity() {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAddress(address);
        return user;
    }
}
