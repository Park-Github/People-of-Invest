package poe.spring.member.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import poe.spring.member.dto.RequestDto;
import poe.spring.member.dto.ResponseDto;
import poe.spring.member.entity.Member;
import poe.spring.member.entity.MemberRepository;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CRUDService {

    private final MemberRepository memberRepository;
    private final ModelMapper modelMapper;

    public Long createUser(RequestDto requestDto) {
        // 사용자 생성 로직
        Member memberEntity = modelMapper.map(requestDto, Member.class);
        return memberRepository.save(memberEntity).getId();
    }

    public ResponseDto readUser(Long id) {
        // 사용자 조회 로직
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));
        ResponseDto requestDto = modelMapper.map(member, ResponseDto.class);
        return requestDto;
    }

    public ResponseDto updateUser(RequestDto requestDto) {
        // 사용자 수정 로직
        Member existingMember = memberRepository.findById(requestDto.getId())
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

        return modelMapper.map(memberRepository.save(existingMember), ResponseDto.class);
    }

    public void deleteUser(Long id) {
        // 사용자 삭제 로직
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));
        memberRepository.delete(member);
    }
}
