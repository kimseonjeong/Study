import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		int num = 0;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String input = br.readLine();
			String[] numstr = input.split(" ");
			for(String str:numstr)
				numberList.add(Integer.parseInt(str));
			
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		int tmp;
		for(int i=0; i<numberList.size(); i++){
			for(int j=i+1; j<numberList.size(); j++){
				if(numberList.get(i)>numberList.get(j)==true){
					tmp = numberList.get(i);
					numberList.set(i, numberList.get(j));
					numberList.set(j, tmp);
				}
			}
		}
		
		for(int z=0; z<numberList.size(); z++)
			System.out.print(numberList.get(z)+" ");
		System.out.print("\n");		
		
		for(int w=0; w<numberList.size(); w++){
			if(numberList.get(w)==num)
				System.out.println(w+1);
		}
		
		
	}

}
