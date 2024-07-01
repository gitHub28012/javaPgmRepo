package newConceptsInJava;

public class Static_OuterClass {

	public static class InnerClass {
          static String name="Tanmay";
		public static void main(String[] args) {
			System.out.println("Running From InnerClass!!");
			String name1 = InnerClass.name="Tanmay";
			System.out.println(name1);
		}
	}
	
	
	
	public static void main(String[] args) {
		
	   	System.out.println(Static_OuterClass.InnerClass.name);
		
		Static_OuterClass.InnerClass.main(args);
	
	}

}
