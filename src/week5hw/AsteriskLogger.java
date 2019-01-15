package week5hw;

public class AsteriskLogger implements logger {

	@Override
	public void log(String log) {
		int boxLength = log.length() + 6;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < boxLength; i++) {
			sb.append("*"); 
			}
		System.out.println(sb.toString());
		System.out.println("***" + log + "***");
		System.out.println(sb.toString());
	}

	@Override
	public void error(String error) {
		int boxLength = error.length() + 13;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < boxLength; i++) {
			sb.append("*");
			}
		System.out.println(sb.toString());
		System.out.println("***ERROR: "+ error + "***");
		System.out.println(sb.toString());
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}


