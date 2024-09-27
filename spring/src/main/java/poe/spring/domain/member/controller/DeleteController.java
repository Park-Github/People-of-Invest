package poe.spring.domain.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poe.spring.common.Api;
import poe.spring.domain.member.service.MemberCrudService;

@RestController
@RequestMapping("/delete/user")
@RequiredArgsConstructor
public class DeleteController {

    private final MemberCrudService crudService;

    @DeleteMapping("")
    public ResponseEntity<Api<Void>> deleteUser(@RequestBody Long id) {

        // 사용자 삭제 로직
        crudService.deleteUser(id);

        Api<Void> response = Api.<Void>builder()
                .statusCode(HttpStatus.OK.getReasonPhrase())
                .resultMessage("Member deleted successfully.").build();
        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

}