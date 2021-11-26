package svc;

import ui.MemberUI;
import vo.Member;

public class MemberUpdateService {

	public Member getOldMember(String id) {
		Member oldMember = null;

		for (int i = 0; i < MemberUI.memberArray.length; i++) {
			if (MemberUI.memberArray[i].getId().equals(id)) {
				oldMember = MemberUI.memberArray[i];
				break;
			}
		}
		return oldMember;
	}

	public boolean updateMember(Member newMember) {

		boolean updateSuccess = false;
		for (int i = 0; i < MemberUI.memberArray.length; i++) {
			if (MemberUI.memberArray[i].getId().equals(newMember.getId())) {
				MemberUI.memberArray[i] = newMember;
				updateSuccess = true;
				break;
			}
		}
		return updateSuccess;
	}

}
