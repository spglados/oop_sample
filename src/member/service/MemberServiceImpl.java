package member.service;

import member.Member;
import member.repository.MemberRepository;

public class MemberServiceImpl implements MemberService {
	
	private MemberRepository repsitory;

	// 생성자 의존 주입 DI 
	public MemberServiceImpl(MemberRepository memberRepsitory) {
		this.repsitory = memberRepsitory;
	}
	
	@Override
	public void signUp(Member member) {
		repsitory.save(member);
	}

	@Override
	public Member findByIdMember(Long memberId) {
		return repsitory.findById(memberId);
	}

}
