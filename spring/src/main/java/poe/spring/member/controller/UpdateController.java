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
@RequestMapping("/update/user")
@RequiredArgsConstructor
public class UpdateController {

    private final CRUDService crudService;

    @PatchMapping("")
    public ResponseEntity<Api<MemberDto>> createUser(@RequestBody MemberDto memberDto) {

        // 사용자 수정 로직
        crudService.updateUser(memberDto);

        Api<MemberDto> response = Api.<MemberDto>builder()
                .statusCode(HttpStatus.OK.getReasonPhrase())
                .resultMessage("Member data updated successfully.").build();
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

}
