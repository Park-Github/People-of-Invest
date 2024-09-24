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
@RequestMapping("/read/user")
@RequiredArgsConstructor
public class ReadController {

    private final CRUDService crudService;

    @GetMapping("")
    public ResponseEntity<Api<MemberDto>> createUser(@RequestBody Long id) {

        // 사용자 정보 조회 로직
        MemberDto responseDto = crudService.readUser(id);

        Api<MemberDto> response = Api.<MemberDto>builder()
                .statusCode(HttpStatus.OK.getReasonPhrase())
                .resultMessage("Successfully read member information")
                .data(responseDto)
                .build();
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

}
