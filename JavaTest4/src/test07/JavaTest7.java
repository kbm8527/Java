package test07;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class JavaTest7 {
	public static void main(String[] args) {
		printList(createList());
	}
	public static void printList(List<Integer> scoreList) {
		int total = 0;
		int size = scoreList.size();
				
		for(int i = 0; i<size; i++) {
			int score = scoreList.get(i);
			total += score;
			
			System.out.print(score);
			
			if(i == size - 1) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
		}
		
		System.out.println(total);
	}
	
	public static List<Integer> createList() {
		List<Integer>scoreList = new ArrayList<Integer>();
		Random rand = new Random();
		
		for(int i=1; i<=10;i++) {
			int num = rand.nextInt(41) + 60;
			scoreList.add(num);
		}
		return scoreList;
	}
}
