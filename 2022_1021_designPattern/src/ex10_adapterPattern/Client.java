package ex10_adapterPattern;

public class Client {

	public static void main(String[] args) {
		
		MailSenderA senderA = new SolutionA();
		senderA.send("기존 메일 발송");
		
		senderA = new Adapter(new SolutionB());
		senderA.send("TO-BE 발송 메일");
		
	}

}
