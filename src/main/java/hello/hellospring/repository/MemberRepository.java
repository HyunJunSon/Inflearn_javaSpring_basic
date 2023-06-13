package hello.hellospring.repository;

public interface MemberRepository {
    Member saver(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
