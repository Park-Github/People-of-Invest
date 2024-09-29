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

import java.util.Map;

@RestController
@RequestMapping("/user/{id}/update")
@RequiredArgsConstructor
public class UpdateController {

    private final MemberCrudService crudService;
    private final MapConverter<ResponseDto> mapConverter;

    // TODO API 설계 변경: email, password, phoneNumber 변경 각각 다른 API로 처리
    @PatchMapping("/email")
    public ResponseEntity<Api<Map<String, Object>>> updateUserEmail(
            @PathVariable Long id,
            @RequestBody RequestDto requestDto) {

        // 사용자 수정 로직
        ResponseDto dto = crudService.updateUser(id, requestDto);
        dto.setPhoneNumber(null);

        Map<String, Object> data = mapConverter.convertToMap(dto);

        Api<Map<String, Object>> response = Api.<Map<String, Object>>builder()
                .data(data)
                .statusCode(String.valueOf(HttpStatus.OK))
                .resultMessage("Member email updated successfully.").build();
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

    @PatchMapping("/password")
    public ResponseEntity<Api<Void>> updateUserPassword(
            @PathVariable Long id,
            @RequestBody RequestDto requestDto) {

        // 사용자 수정 로직
        crudService.updateUser(id, requestDto);

        Api<Void> response = Api.<Void>builder()
                .statusCode(String.valueOf(HttpStatus.OK))
                .resultMessage("Member password updated successfully.").build();
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

    @PatchMapping("/phone")
    public ResponseEntity<Api<Map<String, Object>>> updateUserPhone(
            @PathVariable Long id,
            @RequestBody RequestDto requestDto) {

        // 사용자 수정 로직
        ResponseDto dto = crudService.updateUser(id, requestDto);
        dto.setEmail(null);

        Map<String, Object> data = mapConverter.convertToMap(dto);

        Api<Map<String, Object>> response = Api.<Map<String, Object>>builder()
                .data(data)
                .statusCode(String.valueOf(HttpStatus.OK))
                .resultMessage("Member phoneNumber updated successfully.").build();
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }
}
