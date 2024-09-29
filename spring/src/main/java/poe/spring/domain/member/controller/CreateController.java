package poe.spring.domain.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import poe.spring.common.Api;
import poe.spring.domain.member.service.MemberCrudService;
import poe.spring.domain.member.dto.RequestDto;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user/create")
@RequiredArgsConstructor
public class CreateController {

    private final MemberCrudService crudService;

    @PostMapping("/email")
    public ResponseEntity<Api<Map<String, Long>>> createUser(@RequestBody RequestDto requestDto) {

        Long id = crudService.createUser(requestDto);

        Map<String, Long> data = new HashMap<>();
        data.put("member_id", id);

        Api<Map<String, Long>> response = Api.<Map<String, Long>>builder()
                .data(data)
                .statusCode(String.valueOf(HttpStatus.CREATED.value()))
                .resultMessage("Created a new member successfully.").build();
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(response);
    }

    @PostMapping("/email/auth")
    public void authUserEmail() {}

    @PostMapping("/email/auth-confirm")
    public void confirmEmailAuth() {}

    @PostMapping("/sns")
    public void createSnsUser() {}

}
