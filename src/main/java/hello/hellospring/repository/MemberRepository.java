package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(Long id); //없으면 null이 나올 수 있으니 optinal이 한번 감싸줌

    Optional<Member> findByName(String name);

    List<Member> findAll();
}
