import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] numbers = new int[7];
		for(int i = 0; i < numbers.length; i++){
			do {
				System.out.print("Enter #" + (i + 1) + ": ");
				numbers[i] = s.nextInt();
			} while(numbers[i] < 1 || numbers[i] > 49 || match(numbers, i));
		}
		
		int[] draw = draw();
		int matches = 0;
		boolean bonusMatch = false;
		for(int i = 0; i < draw.length; i++){
			for(int j = 0; j < numbers.length; j++){
				if(numbers[j] != draw[i]) continue;
				
				if(i == draw.length - 1) bonusMatch = true;
				else matches++;
			}
		}
		
		System.out.println("Winning ticket: " + formatNumber(draw));
		System.out.println("Your ticket: " + formatNumber(numbers));
		
		int payout = matches == 3 ? 10 : matches == 4 ? 100 : (matches == 5 && bonusMatch) ? 100000 : matches == 5 ? 10000 : matches == 6 ? 1000000 : 0;
		System.out.println("Matches: " + matches + "\nPayout: �" + payout);
		
		s.close();
	}
	
	public static int rand(){
		return (int) (Math.ceil(Math.random() * 49));
	}
	
	public static int[] draw(){
		return new int[] { rand(), rand(), rand(), rand(), rand(), rand(), rand() };
	}
	
	public static String formatNumber(int[] number){
		String r = "";
		for(int i = 0; i < number.length; i++) r += number[i] + (i == number.length - 1 ? "" : "-");
		return r;
	}
	
	public static boolean match(int[] array, int index){
		for(int i = 0; i < index; i++) if(array[i] == array[index]) return true;		
		return false;
	}
}
