package program.exception.mobile;

public class Utility {
	static boolean numberOrNot(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;

	}

}
