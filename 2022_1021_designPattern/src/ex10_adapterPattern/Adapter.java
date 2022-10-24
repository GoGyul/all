package ex10_adapterPattern;

public class Adapter implements MailSenderA {

	private  MailSenderB mailSenderB;
	
	public Adapter(SolutionB newSolution) {
		this.mailSenderB = newSolution;
	}
	
	@Override
	public void send(String sendInfo) {
		System.out.println("Using Adapter >>> ");
		mailSenderB.sendApi(sendInfo);
	}

}
