package poe.spring.domain.member.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import poe.spring.domain.member.dto.ResponseDto;
import poe.spring.domain.member.dto.RequestDto;
import poe.spring.domain.member.model.entity.Member;
import poe.spring.domain.member.model.repository.MemberRepo;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class MemberCrudService {

    private final MemberRepo memberRepo;
    private final ModelMapper modelMapper;

    public Long createUser(RequestDto requestDto) {
        // 사용자 생성 로직
        Member memberEntity = modelMapper.map(requestDto, Member.class);
        return memberRepo.save(memberEntity).getId();
    }

    public ResponseDto readUser(Long id) {
        // 사용자 조회 로직
        Member member = memberRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));
        ResponseDto responseDto = modelMapper.map(member, ResponseDto.class);
        return responseDto;
    }

    public ResponseDto updateUser(Long id, RequestDto requestDto) {
        // 사용자 수정 로직
        Member existingMember = memberRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));
        // 이메일
        existingMember.setEmail(Objects.isNull(requestDto.getEmail()) ?
                existingMember.getEmail() : requestDto.getEmail());
        // 휴대폰 번호
        existingMember.setPhoneNumber(Objects.isNull(requestDto.getPhoneNumber()) ?
                existingMember.getPhoneNumber() : requestDto.getPhoneNumber());
        // 비밀번호
        existingMember.setPassword(Objects.isNull(requestDto.getPassword()) ?
                existingMember.getPassword() : requestDto.getPassword());

        return modelMapper.map(memberRepo.save(existingMember), ResponseDto.class);
    }

    public void deleteUser(Long id) {
        // 사용자 삭제 로직
        Member member = memberRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));
        memberRepo.delete(member);
    }
}
