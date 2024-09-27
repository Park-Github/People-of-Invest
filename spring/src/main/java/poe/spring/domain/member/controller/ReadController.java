package poe.spring.domain.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poe.spring.common.Api;
import poe.spring.domain.member.dto.ResponseDto;
import poe.spring.domain.member.service.MemberCrudService;

@RestController
@RequestMapping("/read/user")
@RequiredArgsConstructor
public class ReadController {

    private final MemberCrudService crudService;

    @GetMapping("")
    public ResponseEntity<Api<ResponseDto>> readUser(@RequestBody Long id) {

        // 사용자 정보 조회 로직
        ResponseDto responseDto = crudService.readUser(id);

        Api<ResponseDto> response = Api.<ResponseDto>builder()
                .statusCode(HttpStatus.OK.getReasonPhrase())
                .resultMessage("Successfully read member information")
                .data(responseDto)
                .build();
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

}