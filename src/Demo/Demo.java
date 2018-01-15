package Demo;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	System.out.println("Please enter any Number ");
	Scanner sn = new Scanner(System.in);
	int var = sn.nextInt();
	int i = 0;
	do{
		System.out.println(i);
		i++;
	}while(i<var);
	System.out.println("---------------------");
	for(int j = 0; j<var; j++)
	{
		System.out.println(j);
	}
	
	
}
}
