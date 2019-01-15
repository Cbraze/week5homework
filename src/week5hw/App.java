package week5hw;

public class App {

	public static void main(String[] args) {
		

		logger logger = new SpacedLogger();
		
		logger.log("Welcome!");
		logger.error("Oops error.");
		
		logger.close();
	}

}
