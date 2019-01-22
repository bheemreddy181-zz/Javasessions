package JavaSessions;

public class finally_block {

	public static void main(String args[]) {
		try {
			int data = 25 / 0;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println("Exception Handled");
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}

}
