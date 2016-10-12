import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		ArrayList<String> scoreList = new ArrayList<String>();
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			String input = br.readLine();
			String[] numStrList = input.split(" ");
			for(String numStr:numStrList){
				numberList.add(Integer.parseInt(numStr));
			}
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
		
		scoreList.add("A+");
		scoreList.add("A+");
		scoreList.add("A");
		scoreList.add("B+");
		scoreList.add("B");
		scoreList.add("C+");
		scoreList.add("C");
		scoreList.add("D+");
		scoreList.add("D");
		scoreList.add("F");
		
		for(int z=0; z<numberList.size(); z++)
			System.out.print(numberList.get(z)+" ");
		
		System.out.print("\n");
		System.out.println(scoreList.get(2));
        
	}

}
