package in.neuron.main;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = scan.next();
		String str = scan.next();
		boolean flag = false;
		st = st.toLowerCase();
		str = str.toLowerCase();
		if (st.length() == str.length()) {
			for (int i = 0; i < str.length(); i++) {
				flag = false;
				for (int j = 0; j < st.length(); j++) {
					if(st.charAt(i) == str.charAt(j))
						flag = true;
				}
				if(!flag)
				{
					break;
				}
			}
			if (flag) {
				System.out.println("Anagram string");
			} else {
				System.out.println("Not Anagram string");
			}
		} else {
			System.out.println("Not a Anagram string...length must be same");
		}
		
		
		scan.close();
	}
}