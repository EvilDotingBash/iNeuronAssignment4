package in.neuron.main;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = scan.next();
		String b = "";
		
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			b = ch + b;
		}
		if (b.equalsIgnoreCase(st)) {
			System.out.println("Palindrome string");
		} else {
			System.out.println("Not a Palindrome string");
		}
		scan.close();
	}

}
