package com;
import com.company.*;
import java.util.*;

public class FirstClass {
    public static void main(String[] s) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!!!");
		for (int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println();
		SecondClass obj = new SecondClass(sc.nextInt(), sc.nextInt());
		System.out.print(obj.getsumm());
		for (int i=1; i<=8; i++){
			for (int j=1; j<=8; j++){
				obj.setnumx(i);
				obj.setnumy(j);
				System.out.print(obj.getsumm() + " ");
				
			}
			System.out.println();
		}
    }
}