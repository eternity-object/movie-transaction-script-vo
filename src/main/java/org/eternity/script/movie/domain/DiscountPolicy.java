package org.eternity.script.movie.domain;

import jakarta.persistence.*;
import lombok.*;
import org.eternity.script.generic.Money;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED) @AllArgsConstructor
@Getter @Setter
public class DiscountPolicy {
    public enum PolicyType { PERCENT_POLICY, AMOUNT_POLICY }

    @Id
    @GeneratedValue(generator = "discount_seq")
    private Long id;
    private Long movieId;
    @Enumerated(EnumType.STRING) @Column(columnDefinition = "varchar(20)")
    private PolicyType policyType;
    private Money amount;
    private Double percent;

    public DiscountPolicy(Long movieId, PolicyType policyType, Money amount, Double percent) {
        this.movieId = movieId;
        this.policyType = policyType;
        this.amount = amount;
        this.percent = percent;
    }

    public boolean isAmountPolicy() {
        return PolicyType.AMOUNT_POLICY.equals(policyType);
    }

    public boolean isPercentPolicy() {
        return PolicyType.PERCENT_POLICY.equals(policyType);
    }
}
