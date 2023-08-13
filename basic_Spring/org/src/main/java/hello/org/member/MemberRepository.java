package hello.org.member;

import org.springframework.context.annotation.Configuration;


public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
    Member findByMember(Long memberId);
}
