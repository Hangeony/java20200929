package chap07.textbook.s070201;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델 : "+dmbCellPhone.model);
		System.out.println("색상 : "+dmbCellPhone.color);
		
		System.out.println("채널 : "+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세여");
		dmbCellPhone.receiveVoice("아뇨 전 뚱이인데요");
		dmbCellPhone.sendVoice("ㅡ ㅡ");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(48);
		System.out.println();
	}

}
