package in.neuron.main;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = scan.next();
		int c=0,v=0,s=0;
		
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if(Character.isLetter(ch))
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					v++;
				else 
					c++;
			}else if (!(Character.isDigit(ch) && Character.isSpaceChar(ch))) {
				s++;
			}
		}
		System.out.println("No of constants "+ c);
		System.out.println("No of vowels "+v);
		System.out.println("No of special characters "+s);
		scan.close();
	}

}
