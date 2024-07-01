package oopsPgm;

public class VovloCar_for_SuperCall extends Car_for_ThisandSuper  {

	public VovloCar_for_SuperCall(int i, int j) {
		super(10, 20);

		
	}

	public VovloCar_for_SuperCall() {
		super.testSpeed(super.speed = 100);
	}

	public void simpleCalculation() {

		System.out.println(super.a);
	}

	public static void main(String[] args) {
		VovloCar_for_SuperCall v = new VovloCar_for_SuperCall();
		v.simpleCalculation();

	}

}