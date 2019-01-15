package week5hw;

public class SpacedLogger implements logger{

	@Override
	public void log(String log) {

		StringBuilder sb = new StringBuilder();
		for(char c: log.toCharArray()) {
			sb.append(c).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
	@Override
	public void error(String error) {
		StringBuilder sb = new StringBuilder();
		for(char c: error.toCharArray()) {
			sb.append(c).append(" ");
		}
		System.out.println("ERROR: " + sb.toString().trim());
	}
	

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
