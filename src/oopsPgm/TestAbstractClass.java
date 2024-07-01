package oopsPgm;

public class TestAbstractClass extends AbstractClass {

	/*
	 * public void testM() {
	 * 
	 * super.test(); }
	 */

	public static void main(String[] args) {
		//TestAbstractClass ta = new TestAbstractClass();
		AbstractClass.test();
		System.out.println("a = " + AbstractClass.a);
		// ta.testM();
	}

}
