
package in.neuron.main;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = scan.next();
		int c = 0,p = -1, pos = 0;
		
		for (int i = 0; i < st.length()-1; i++) {
			c=0;
			for (int j = i+1; j < st.length(); j++) {
				if(st.charAt(i)== st.charAt(j))
					c++;
			}
			if (c>p) {
				p=c;
				pos = i;
			}
		}
		if(pos>0)
			System.out.println(st.charAt(pos));
		else
			System.out.println("All characters have same occurence");
		scan.close();
	}

}
