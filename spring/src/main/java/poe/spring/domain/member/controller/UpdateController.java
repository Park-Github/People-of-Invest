package poe.spring.domain.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poe.spring.common.Api;
import poe.spring.common.MapConverter;
import poe.spring.domain.member.dto.ResponseDto;
import poe.spring.domain.member.service.MemberCrudService;
import poe.spring.domain.member.dto.RequestDto;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user/{id}/update")
@RequiredArgsConstructor
public class UpdateController {

    private final MemberCrudService crudService;

    // TODO API 설계 변경: email, password, phoneNumber 변경 각각 다른 API로 처리
    @PatchMapping("")
    public ResponseEntity<Api<Map<String, Object>>> updateUser(
            @PathVariable Long id,
            @RequestBody RequestDto requestDto) {

        // 사용자 수정 로직
        ResponseDto dto = crudService.updateUser(id, requestDto);

        MapConverter<ResponseDto> mapConverter = new MapConverter<>();
        Map<String, Object> data = mapConverter.convertToMap(dto);

        Api<Map<String, Object>> response = Api.<Map<String, Object>>builder()
                .data(data)
                .statusCode(HttpStatus.OK.getReasonPhrase())
                .resultMessage("Member data updated successfully.").build();
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }
}
