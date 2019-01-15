package week5hw;

public class asterikLogger {

	public static void main(String[] args) {
		
		asterikBox("hello craig");
		asterikBox("this is your  asterikBox");
		asterikBox("Short");

	}
	
	/*
	 *  "Hello"
	 *  ***********
	 *  ***Hello***
	 *  ***********
	 */
	private static void asterikBox(String string) {
		int boxLength = string.length() + 6;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < boxLength; i++) {
			sb.append("*");
			
		}
		System.out.println(sb.toString());
		System.out.println("***" + string + "***");
		System.out.println(sb.toString());
	}

}
