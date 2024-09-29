package poe.spring.domain.portfolio.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import poe.spring.domain.member.model.entity.Member;
import poe.spring.domain.member.model.repository.MemberRepo;
import poe.spring.domain.portfolio.dto.UpdateResponseDto;
import poe.spring.domain.portfolio.model.entity.Portfolio;
import poe.spring.domain.portfolio.model.repository.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PortfolioCrudService {

    private final MemberRepo memberRepo;
    private final PortfolioRepo portfolioRepo;
    private final ItemRepo itemRepo;
    private final CashRepository cashRepository;
    private final CashTransactionRepo cashTransactionRepo;
    private final StockTransactionRepo stockTransactionRepo;

    // TODO Exception Handling 설정 및 Error Response class 추가
    public Long create(Long memberId, String name) {
        Member memberEntity = memberRepo.findById(memberId)
                .orElseThrow(() -> new IllegalArgumentException("Member does not exist."));
        portfolioRepo.findByName(name)
                .ifPresent(portfolio -> {
                    throw new IllegalArgumentException("Portfolio '%s' already exists.".formatted(name));
                });
        Portfolio portfolioEntity =
                Portfolio.builder()
                        .name(name)
                        .member(memberEntity)
                        .build();
        return portfolioRepo.save(portfolioEntity).getId();
    }

    public List<Portfolio> read(Long memberId) {
        List<Portfolio> portfolios = new ArrayList<>();
        portfolios = portfolioRepo.findByMemberId(memberId);
        return portfolios;
    }

    public void update(Long memberId, UpdateResponseDto updateResponseDto) {

    }

    public void delete(Long memberId, Long portfolioId) {
        exceptionHandle(memberId, portfolioId);
        portfolioRepo.deleteById(portfolioId);
    }

    public void exceptionHandle(Long memberId, Long portfolioId) {

        Optional<Member> memberEntity = memberRepo.findById(memberId);
        Optional<Portfolio> portfolioEntity = portfolioRepo.findById(portfolioId);

        if (memberEntity.isPresent() && portfolioEntity.isEmpty())
            throw new IllegalArgumentException("Member does not exist.");
        else if (memberEntity.isEmpty() && portfolioEntity.isPresent())
            throw new IllegalArgumentException("Portfolio does not exist.");
        else if (memberEntity.isEmpty() && portfolioEntity.isEmpty())
            throw new IllegalArgumentException("Member and Portfolio does not exist.");
        else if (!Objects.equals(memberEntity.get().getId(), portfolioEntity.get().getMember().getId()))
            throw new IllegalArgumentException("It's not a member's portfolio.");

    }
}
