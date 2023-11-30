package com.example.sbb6.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void create(String emailId, String nickname, String password){
        SiteUser user = new SiteUser();
        user.setEmailId(emailId);
        user.setNickname(nickname);
        user.setPassword(passwordEncoder.encode(password));
        this.userRepository.save(user);
    }
}
