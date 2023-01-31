
package in.neuron.main;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = scan.next();
		boolean flag = false;
		int p=st.length();
		System.out.println("Duplicate characters present in string are :: ");
		for (int i = 0; i < p; i++) {
			//flag = false;
			for (int j = i+1; j < p; j++) {
				if(st.charAt(i)== st.charAt(j)&&st.charAt(i)!=' ')
					{flag = true;
					 char c=st.charAt(j);
					 System.out.println(st.charAt(i));
					 st=st.replace(c,' ');
					}
			}
			
		}
		if (!flag) {
			System.out.println("Sorry, No Duplicate characters present in String");
		}
		scan.close();
	}

}
