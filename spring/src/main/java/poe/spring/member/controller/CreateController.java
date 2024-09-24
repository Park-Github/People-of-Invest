package poe.spring.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poe.spring.common.Api;
import poe.spring.member.dto.MemberDto;
import poe.spring.member.entity.Member;
import poe.spring.member.service.CRUDService;

@RestController
@RequestMapping("/create/user")
@RequiredArgsConstructor
public class CreateController {

    private final CRUDService crudService;

    @PostMapping("/email")
    public ResponseEntity<Api<Member>> createUser(@RequestBody MemberDto memberDto) {

        crudService.createUser(memberDto);

        Api<Member> response = Api.<Member>builder()
                .statusCode(HttpStatus.CREATED.getReasonPhrase())
                .resultMessage("Created a new member successfully.").build();
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(response);
    }

    @PostMapping("/email/auth")
    public void authUserEmail(@RequestBody String email) {}

    @PostMapping("/email/auth-confirm")
    public void confirmEmailAuth(@RequestBody String authNumber) {}
}
