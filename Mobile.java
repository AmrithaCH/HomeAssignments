package week1.day1;

public class Mobile {
	
	public void sendMsg() {System.out.println("Send msg");}
	
	public void makeCall() {System.out.println("Make call");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main method");
		Mobile obj = new Mobile();
		obj.sendMsg();
		obj.makeCall();
		
	}

}
