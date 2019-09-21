package java_operators;

/**
 * Example Application: Operators
 * 
 * @author Felipe Fong
 */
public class Main {

	public static void main(String[] args) {

		int intValue;

//		Sum
		intValue = 0;
		intValue++;
		System.out.println(intValue);

		intValue = 0;
		intValue += 1;
		System.out.println(intValue);

		intValue = 0;
		intValue = intValue + 1;
		System.out.println(intValue);

//		Subtraction
		intValue = 1;
		intValue--;
		System.out.println(intValue);

		intValue = 1;
		intValue -= 1;
		System.out.println(intValue);

		intValue = 1;
		intValue = intValue - 1;
		System.out.println(intValue);
		
//		Multiplication
		intValue = 2;
		intValue *= 2;
		System.out.println(intValue);

		intValue = 2;
		intValue = intValue * 2;
		System.out.println(intValue);
		
//		Division
		intValue = 2;
		intValue /= 2;
		System.out.println(intValue);

		intValue = 2;
		intValue = intValue / 2;
		System.out.println(intValue);
				
	}
}
