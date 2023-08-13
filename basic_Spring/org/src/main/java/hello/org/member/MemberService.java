package hello.org.member;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public interface MemberService {
    void save(Member member);

    void join(Member member);

    Member findMember(Long memberId);
}
