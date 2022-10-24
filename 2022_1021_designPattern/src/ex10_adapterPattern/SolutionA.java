package ex10_adapterPattern;

public class SolutionA implements MailSenderA {

	@Override
	public void send(String sendInfo) {
		System.out.println("A 솔루션 회사 메일 발송 " + sendInfo);
	}

	
	
}
