package in.neuron.main;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = scan.next();
		boolean flag = false;
		int p=st.length();
		String str="";
		System.out.println("Original String is :: "+ st);
		for (int i = 0; i < p; i++) {
			//flag = false;
			for (int j = i+1; j < p; j++) {
				if(st.charAt(i)== st.charAt(j)&&st.charAt(i)!=' ')
					{
					flag = true;
					 char c=st.charAt(j);
					 str=str+st.charAt(i);
					 st=st.replace(c,' ');
					}
			}
			
		}
		if (!flag) {
			System.out.println("Sorry, No duplicates present in string");
		} else {

			System.out.println("String after removing duplicate characters is :: "+str);
		}
		scan.close();
	}

}
