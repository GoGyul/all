package ex10_adapterPattern;

public class SolutionB implements MailSenderB {

	@Override
	public void sendApi(String sendInfo) {
		System.out.println("B 솔루션 회사 메일 발송 "+ sendInfo);
	}

	
	
}
