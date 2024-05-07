package xyz.itwill.access;

public class ProtectdeMemberUse {
	public void run() {
		ProtectdeMember member=new ProtectdeMember();
		member.num=100;
		member.display;
	}
	
}
