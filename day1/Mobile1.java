package week1.day1;

public class Mobile1 {

	public void makeCall()
	{
		System.out.println("I will make call");
	}
	public void sendMsg() {

		System.out.println("I am sending message");

	}
	public static void main(String[] args) {
		Mobile1 mobileobj=new Mobile1();
		mobileobj.makeCall();
		mobileobj.sendMsg();


	}

}
