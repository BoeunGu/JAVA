package svc;

import ui.MemberUI;
import vo.Member;

public class MemberRegistService {
	
	public boolean registMember(Member newMember) throws Exception{
		boolean registSuccess=true;
		
		for(int i=0;i<MemberUI.memberArray.length;i++) {
			if(MemberUI.memberArray[i].getId()==newMember.getId()) {
				registSuccess=false;
				break;
			}
		}
		if(registSuccess) {
			Member[] tempArray =  MemberUI.memberArray; 		//기존배열을 잠깐 저장
			MemberUI.memberArray = new Member[MemberUI.memberArray.length+1]; 		//기존 배열보다 한칸 더 새로운 배열을 생성
			for (int i=0;i<tempArray.length;i++) {
				MemberUI.memberArray[i]= tempArray[i];  //기존배열 내용을 채움
				
			}
			MemberUI.memberArray[MemberUI.memberArray.length-1]= newMember; 		//마지막 자리에 새 멤버 값 넣음
		}
		return registSuccess;

}

}