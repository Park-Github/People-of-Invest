package poe.spring.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poe.spring.common.Api;
import poe.spring.member.dto.MemberDto;
import poe.spring.member.entity.Member;
import poe.spring.member.service.CRUDService;

@RestController
@RequestMapping("/delete/user")
@RequiredArgsConstructor
public class DeleteController {

    private final CRUDService crudService;

    @DeleteMapping("")
    public ResponseEntity<Api<MemberDto>> createUser(@RequestBody MemberDto member) {

        // 사용자 삭제 로직
        crudService.deleteUser(member.getId());

        String message = String.format("Member deleted successfully.(id : %s)", member.getId().toString());
        Api<MemberDto> response = Api.<MemberDto>builder()
                .statusCode(HttpStatus.OK.getReasonPhrase())
                .resultMessage(message).build();
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

}
