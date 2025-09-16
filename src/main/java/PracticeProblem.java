public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pluralize(String word){
        String lowWord = word.toLowerCase();
        if (lowWord.endsWith("ife")) {
            return "ives";
        } else if (lowWord.endsWith("ey")) {
            return "eys";
        } else if (lowWord.endsWith("y")) {
            return "ies";
        } else {
            return "s";
        }
    }
    public static int min(int num1, int num2, int num3) {
        num1 = Math.min(num1, num2);
        num2 = Math.min(num2, num3);
        num1 = Math.min(num1, num2);
        return num1;
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}
