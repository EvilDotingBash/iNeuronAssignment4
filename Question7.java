package in.neuron.main;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = scan.next();
		boolean flag = false;
		
		for (int i = 0; i < st.length()-1; i++) {
			for (int j = i+1; j < st.length(); j++) {
				if(st.charAt(i)== st.charAt(j))
					flag = true;
			}	
			if(flag)
				break;
			}
		if (!flag) {
			System.out.println("String contains unique characters");
		} else {
			System.out.println("String doesnot contain unique characters");
		}
		scan.close();
	}

}
