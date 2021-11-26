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
			Member[] tempArray =  MemberUI.memberArray; 		//�����迭�� ��� ����
			MemberUI.memberArray = new Member[MemberUI.memberArray.length+1]; 		//���� �迭���� ��ĭ �� ���ο� �迭�� ����
			for (int i=0;i<tempArray.length;i++) {
				MemberUI.memberArray[i]= tempArray[i];  //�����迭 ������ ä��
				
			}
			MemberUI.memberArray[MemberUI.memberArray.length-1]= newMember; 		//������ �ڸ��� �� ��� �� ����
		}
		return registSuccess;

}

}