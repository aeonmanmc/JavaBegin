
public class ExceptionTest {

	public static void main(String args[]) {
		int a = 10;

		try {
			int count = args.length;
			args[42] = "20";
			int result = a / count;
			System.out.println(result);
		} catch (ArithmeticException ar) {
			System.out.println("Denominator is zero");
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("invalid index given here");
		}

	}

}
