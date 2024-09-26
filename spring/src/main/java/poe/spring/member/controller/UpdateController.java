package poe.spring.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poe.spring.common.Api;
import poe.spring.member.dto.RequestDto;
import poe.spring.member.dto.ResponseDto;
import poe.spring.member.service.CRUDService;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/update/user")
@RequiredArgsConstructor
public class UpdateController {

    private final CRUDService crudService;

    @PatchMapping("")
    public ResponseEntity<Api<Map<String, Object>>> updateUser(@RequestBody RequestDto requestDto) {

        // 사용자 수정 로직
        ResponseDto dto = crudService.updateUser(requestDto);

        Map<String, Object> data = convertToMap(dto);
        Api<Map<String, Object>> response = Api.<Map<String, Object>>builder()
                .data(data)
                .statusCode(HttpStatus.OK.getReasonPhrase())
                .resultMessage("Member data updated successfully.").build();
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

    public String snakeCaseConverter(String camelCase) {
        String snakeCase = camelCase.replaceAll("([a-z])([A-Z]+)", "$1_$2").toLowerCase();
        return snakeCase;
    }

    public Map<String, Object> convertToMap(ResponseDto dto) {
        Map<String, Object> data = new HashMap<>();
        Field[] fields = dto.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                if (field.get(dto) != null)
                    data.put(snakeCaseConverter(field.getName()), field.get(dto));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return data;
    }
}
