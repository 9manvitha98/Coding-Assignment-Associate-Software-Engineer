package Assignment.com;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = s.nextLine();
        System.out.print("Enter second string: ");
        String str2 = s.nextLine();
        System.out.println("Anagram: " + isAnagram(str1, str2));
        s.close();
		
	}

}
