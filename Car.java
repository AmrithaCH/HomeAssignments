package week1.day1;

public class Car {

	public void applybrake() {System.out.println("Apply brake");}
	public void applyGear() {System.out.println("Apply gear");}
	public void switchonAC() {System.out.println("Switch on AC");}
	public void applyAccelerate() {System.out.println("Apply accelerate");}

	public static void main(String[] args) {
		Car carObj = new Car();
		carObj.applyAccelerate();
		carObj.applybrake();
		carObj.applyGear();
		carObj.switchonAC();

	}

}
