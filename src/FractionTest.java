
public class FractionTest {
	public static void main(String[] args) {
		Fraction f1 = new Fraction(2, 3);
		System.out.println(f1.getValue() + ""); // should print out .666667

		f1.denominator = 5;
		System.out.println(f1.getValue()); // 0.4
		f1.denominator = 0;
		System.out.println(f1.getValue());
	}
}
