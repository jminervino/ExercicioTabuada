package tabuada;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        System.out.println("====================");
        System.out.println("T  A  B  U  A  D  A");
        System.out.println("====================");
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número e descubra sua tabuada: ");
        n = scan.nextInt();
        for(int c = 0; c <= 10; c++){
            System.out.println(n+" x "+c+" = "+(n*c));
        }
	}

}
