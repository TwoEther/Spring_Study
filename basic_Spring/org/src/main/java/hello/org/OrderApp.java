package hello.org;

import hello.org.member.Grade;
import hello.org.member.Member;
import hello.org.member.MemberService;
import hello.org.member.order.Order;
import hello.org.member.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 50000);

        System.out.println("order.toString() = " + order.toString());
        System.out.println("order = " + order.calculatePrice());

        
    }
}
