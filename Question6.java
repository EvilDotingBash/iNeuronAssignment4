package in.neuron.main;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = scan.next();
		boolean flag = false;
		st = st.toLowerCase();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			flag = false;
			for (int j = 0; j < st.length(); j++) {
				if(st.charAt(j)== ch)
					{flag = true;break;		}	
			}
			if (!flag) {
				break;
			}
		}
		if (flag) {
			System.out.println("String is Pangram");
		} else {
			System.out.println("String is not Panagram");
		}
		scan.close();
	}

}
