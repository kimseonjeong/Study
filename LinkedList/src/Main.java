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
		
		int tmp;
		for(int i=0; i<numberList.size(); i++){
			for(int j=i+1; j<numberList.size(); j++){
				if(numberList.get(i)>numberList.get(j)){
					tmp = numberList.get(i);
					numberList.set(i, numberList.get(j));
					numberList.set(j, tmp);
				}
			}
		}
		
		int addnum = scan.nextInt();
		int addnumnum = scan.nextInt();
		
		numberList.add(addnumnum,addnum);
		
		System.out.println(numberList);
	}

}
