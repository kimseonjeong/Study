import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		while(num-->0){
			numberList.add(scan.nextInt());
		}
		
		int numadd = scan.nextInt();
		int numaddadd = scan.nextInt();
		
		numberList.add(numaddadd, numadd);
		
		for(int i=0; i<numberList.size(); i++)
			System.out.print(numberList.get(i)+" ");
		
		
	}

}
