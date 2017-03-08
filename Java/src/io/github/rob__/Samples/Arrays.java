import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 1
		String[] names = new String[7];
		for(int i = 0; i < names.length; i++){
			System.out.println("Enter name #" + i + ": ");
			names[i] = s.nextLine();
		}
		
		// 2
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++){
			System.out.println("Enter number #" + i + ": ");
			numbers[i] = s.nextInt();
		}
		
		System.out.println("Print numbers? y/n");
		if(s.nextLine().toLowerCase().equals("y")){
			for(int i = 0; i < numbers.length; i++){
				System.out.println(numbers[i]);
			}
		}
		
		//3
		int[] marks = new int[] {98, 78, 66, 81, 66, 77, 12, 55, 26, 87};
		int max = 0;
		for(int i = 0; i < marks.length; i++){
			if(marks[i] > max) max = marks[i];
		}
		System.out.println("Max: " + max);
	
		// 4
		System.out.println("Name to find: ");
		boolean found = findName(names, s.nextLine());
		
		// 5
		System.out.println("Number to find: ");
		int numberToFind = s.nextInt();
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] == numberToFind) System.out.println("Number found!");
		}
		
		// 6
		int index = 0;
		System.out.println("Enter a number to find: ");
		numberToFind = s.nextInt();
		found = false;
		while(!found){
			if(numbers[index++] == numberToFind){
				found = true;
				break;
			}
		}
		System.out.println("Number " + (found ? "found" : "not found") + "!");
		
		// 7
		index = 0;
		System.out.println("Enter a number to find: ");
		numberToFind = s.nextInt();
		found = false;
		do {
			if(numbers[index++] == numberToFind){
				found = true;
				break;
			}
		}while(!found);
		System.out.println("Number " + (found ? "found" : "not found") + "!");
		
		// 8
		found = false;
		String friend = s.nextLine();
		for(int i = 0; i < names.length; i++){
			if(names[i].equals(friend)){
				found = true;
				System.out.println(numbers[i]);
				break;
			}
		}
		if(!found) System.out.println("Friend not found.");
	}
	
	static boolean findName(String[] names, String name){
		for(int i = 0; i < names.length; i++){
			if(names[i].equals(name)) return true;
		}
		return false;
	}
}
