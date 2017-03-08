import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {
	
	static String line;
	static ArrayList<String> lines = new ArrayList<>();
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		// 1
		/*FileReader fr = new FileReader("U:\\Desktop_2k\\code.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		fr.close();*/
		
		// 2
		/*String[][] myStudents = {
			new String[] { "Sophie", "Stanfield", "Class 5" },
			new String[] { "James", "Kitson", "Class 5" },
			new String[] { "Zoe", "Gaskill", "Class 1" },
			new String[] { "Paul", "Johns", "Class 1" },
			new String[] { "Freya", "Moore", "Class 5" }
		};
		FileWriter fr = new FileWriter("U:\\Desktop_2k\\data.txt");
		for(int i = 0; i < myStudents.length; i++){
			for(int j = 0; j < myStudents[i].length; j++){
				fr.write(myStudents[i][j] + "\t");
			}
			fr.write("\n");
		}
		fr.close();*/
		
		// 3
		/*FileReader fr = new FileReader("U:\\Desktop_2k\\text.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		ArrayList<String> lines = new ArrayList<>();
		while((line = br.readLine()) != null){
			lines.add(line);
		}
		br.close();*/
		
		// 4
		/*boolean[] lotteryNumbers = new boolean[50];
		int numberOfSelectedBalls = 0;
		int winningBall = 0;
		while(numberOfSelectedBalls != 6){
			do {
				winningBall = (int) (Math.random() * 50);
			} while(winningBall == 0);
			if(!lotteryNumbers[winningBall]){
				lotteryNumbers[winningBall] = true;
				numberOfSelectedBalls++;
			}
		}
		
		FileWriter fr = new FileWriter("U:\\Desktop_2k\\lottery.txt");
		fr.write("Winning balls: ");
		for(int i = 0; i < lotteryNumbers.length; i++){
			if(lotteryNumbers[i]) fr.write(i + ", ");
		}
		fr.close();*/
		
		// 5
		FileReader fr = new FileReader("U:\\Desktop_2k\\terms.txt");
		BufferedReader br = new BufferedReader(fr);
		while((line = br.readLine()) != null){
			lines.add(line);
		}
		br.close();
		
		System.out.println("1. Search for a term\n2. Search for a keyword in the descriptions\n3. End");
		String option = s.nextLine();
		if(option.equals("1")) searchByTerm();
		if(option.equals("2")) searchByKeyword();
	}
	
	static void searchByTerm(){
		System.out.println("Term to search for: ");
		String term = s.nextLine();
		boolean found = false;
		for(int i = 0; i < lines.size(); i += 2){
			if(lines.get(i).equals(term)){
				found = true;
				System.out.println("Found: " + lines.get(i + 1));
			}
		}
		if(!found) System.out.println("Not found.");
	}
	
	static void searchByKeyword(){
		System.out.println("Keyword to search for:" );
		String keyword = s.nextLine();
		boolean found = false;
		for(int i = 1; i < lines.size(); i += 2){
			if(lines.get(i).contains(keyword)){
				System.out.println("Found: " + lines.get(i));
			}
		}
	}

}
