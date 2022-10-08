package hello.core.member;

public interface MemberRepository {

    void save(Member member);
    // save function

    Member findById(Long memberId);
    // finding member function
}
