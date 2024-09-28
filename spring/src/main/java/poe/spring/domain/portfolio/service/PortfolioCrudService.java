package poe.spring.domain.portfolio.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import poe.spring.domain.member.model.entity.Member;
import poe.spring.domain.member.model.repository.MemberRepo;
import poe.spring.domain.portfolio.dto.PortfolioDto;
import poe.spring.domain.portfolio.model.entity.Portfolio;
import poe.spring.domain.portfolio.model.repository.*;

import java.util.ArrayList;
import java.util.List;

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
    public void create(PortfolioDto portfolioDto) {
        Member memberEntity = memberRepo.findById(portfolioDto.getMemberId())
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));
        Portfolio portfolioEntity =
                Portfolio.builder()
                        .name(portfolioDto.getName())
                        .member(memberEntity)
                        .build();
        portfolioRepo.save(portfolioEntity);
    }

    public List<Portfolio> read(Long memberId) {
        List<Portfolio> portfolios = new ArrayList<>();
        portfolios = portfolioRepo.findByMemberId(memberId);
        return portfolios;
    }

    public void update(PortfolioDto portfolioDto) {

    }

    public void delete(PortfolioDto portfolioDto) {
    }

}
