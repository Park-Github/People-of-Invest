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
@RequestMapping("/create/user")
@RequiredArgsConstructor
public class CreateController {

    private final MemberCrudService crudService;

    @PostMapping("/email")
    public ResponseEntity<Api<Map<String, Object>>> createUser(@RequestBody RequestDto requestDto) {

        Long id = crudService.createUser(requestDto);

        Map<String, Object> data = new HashMap<>();
        data.put("member_id", id);

        Api<Map<String, Object>> response = Api.<Map<String, Object>>builder()
                .data(data)
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
