package poe.spring.domain.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poe.spring.common.Api;
import poe.spring.common.MapConverter;
import poe.spring.domain.member.dto.ResponseDto;
import poe.spring.domain.member.service.MemberCrudService;

import java.util.Map;

@RestController
@RequestMapping("/user/read/{id}")
@RequiredArgsConstructor
public class ReadController {

    private final MemberCrudService crudService;

    @GetMapping("")
    public ResponseEntity<Api<Map<String, Object>>> readUser(@PathVariable Long id) {

        // 사용자 정보 조회 로직
        ResponseDto responseDto = crudService.readUser(id);

        MapConverter<ResponseDto> mapConverter = new MapConverter<>();
        Map<String, Object> data = mapConverter.convertToMap(responseDto);

        Api<Map<String, Object>> response = Api.<Map<String, Object>>builder()
                .statusCode(HttpStatus.OK.getReasonPhrase())
                .resultMessage("Successfully read member information")
                .data(data)
                .build();
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

}
