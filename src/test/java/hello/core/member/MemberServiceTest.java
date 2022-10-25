package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();
    // 회원 가입 및 회원 찾기 메서드를 가진 인터페이스와 구현 클래스를 인스턴스화하여 호출

    @Test
    public void join(){
        // given
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then
        Assertions.assertThat(member).isEqualTo(findMember);

    }

}
