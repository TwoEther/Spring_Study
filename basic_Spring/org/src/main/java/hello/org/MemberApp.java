package hello.org;

import hello.org.member.Grade;
import hello.org.member.Member;
import hello.org.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);


        Member findMember = memberService.findMember(1L);
        System.out.println("newMember : "+member.getName());
        System.out.println("findMember : "+findMember.getName());
    }
}
