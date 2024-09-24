package poe.spring.member.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import poe.spring.member.dto.MemberDto;
import poe.spring.member.entity.Member;
import poe.spring.member.entity.MemberRepository;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class CRUDService {

    private final MemberRepository memberRepository;
    private final ModelMapper modelMapper;

    public void createUser(MemberDto memberDto) {
        // 사용자 생성 로직
        Member memberEntity = modelMapper.map(memberDto, Member.class);
        memberRepository.save(memberEntity);
    }

    public MemberDto readUser(Long id) {
        // 사용자 조회 로직
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));
        MemberDto memberDto = modelMapper.map(member, MemberDto.class);
        memberDto.setPassword(null);
        return memberDto;
    }

    public MemberDto updateUser(MemberDto memberDto) {
        // 사용자 수정 로직
        Member existingMember = memberRepository.findById(memberDto.getId())
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));
        // 이메일
        existingMember.setEmail(Objects.isNull(memberDto.getEmail()) ?
                existingMember.getEmail() : memberDto.getEmail());
        // 휴대폰 번호
        existingMember.setPhoneNumber(Objects.isNull(memberDto.getPhoneNumber()) ?
                existingMember.getPhoneNumber() : memberDto.getPhoneNumber());
        // 비밀번호
        existingMember.setPassword(Objects.isNull(memberDto.getPassword()) ?
                existingMember.getPassword() : memberDto.getPassword());

        return modelMapper.map(memberRepository.save(existingMember), MemberDto.class);
    }

    public void deleteUser(Long id) {
        // 사용자 삭제 로직
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));
        memberRepository.delete(member);
    }
}
