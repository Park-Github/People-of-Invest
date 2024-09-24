package poe.spring.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

        public void authUserEmail(String email) {
            // 사용자 이메일 인증 로직
        }

        public void confirmEmailAuth(String authNumber) {
            // 사용자 이메일 인증 확인 로직
        }

        public void authUserPhoneNumber(String phoneNumber) {
            // 사용자 휴대폰 인증 로직
        }

        public void confirmPhoneNumberAuth(String authNumber) {
            // 사용자 휴대폰 인증 확인 로직
        }
}
