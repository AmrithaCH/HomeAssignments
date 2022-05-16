package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 1234567890;
	boolean isPunctured = false;
	String bikeName = "Pulsar";
	double runningKM = 50.6;


	public static void main(String[] args) {
		
		TwoWheeler twoWheelerObj = new TwoWheeler();
		System.out.println("No of wheels is - "+twoWheelerObj.noOfWheels);
		System.out.println("No of mirrors is - "+twoWheelerObj.noOfMirrors);
		System.out.println("Chasis No- "+twoWheelerObj.chassisNumber);
		System.out.println("Is it punctured- "+twoWheelerObj.isPunctured);
		System.out.println("Bike name is -"+twoWheelerObj.bikeName);
		System.out.println("Running km -"+twoWheelerObj.runningKM);

	}

}
