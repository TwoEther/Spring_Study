package hello.org;

import hello.org.discount.DiscountPolicy;
import hello.org.discount.RateDiscountPolicy;
import hello.org.member.MemberService;
import hello.org.member.MemberServiceImpl;
import hello.org.member.MemoryMemberRepository;
import hello.org.member.order.OrderService;
import hello.org.member.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
