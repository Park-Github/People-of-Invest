package poe.spring.domain.member.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SnsMember {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String provider;

    private String token;

    @Column(name = "refresh_token")
    private String refreshToken;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

}
