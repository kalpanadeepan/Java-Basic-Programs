package stringconcepts;

/* Goal : Code to print only the even words of a sentence in reverse order
 * input : "Welcome to My world of Testing"
 * output : "Welcome ot My dlrow of gnitseT "
 * even words = odd index
 * Split the sentence into words and store in array
 * Traverse through the loop from 0 to string length -1 
 * check with condition to print the odd indices(even word) in reverse
 * print the odd words as such
 */
public class ReverseEvenPlaceStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Welcome to My world of Testing";
		String[] inArray = input.split(" ");

		for (int i = 0; i < inArray.length; i++) {
			if (i % 2 != 0) {
				for (int j = inArray[i].length() - 1; j >= 0; j--) {
					System.out.print(inArray[i].charAt(j));
				}
				System.out.print(" ");
			} else {
				System.out.print(inArray[i] + " ");
			}
		}

	}

}
