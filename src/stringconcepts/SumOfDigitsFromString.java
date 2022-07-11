package stringconcepts;

//Goal : Code to add the digits from an alphanumeric string
//let the input be "Te13st24di46g3i45t"
//Removing alphabets : Replace all the non-digit character to ""
//convert the string into array
//Iterate the array and add get character
//convert character into integer value 
//Add the digits and print the sum

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Te13st24di46g3i45t";
		str = str.replaceAll("\\D", "");
		System.out.println("After Replacing characters:: " + str);
		char[] c = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum = sum + Character.getNumericValue(str.charAt(i));
		}

		System.out.println("Sum of the given String is :: " + sum);

	}

}
