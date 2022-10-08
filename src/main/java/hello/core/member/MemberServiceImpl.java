package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    /* memberRepository 인스턴스를 통해 MemoryMemberRepository 클래스에서
     오버라이딩한 save, findById 메서드가 호출된다.
     */

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
