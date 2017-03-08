import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		/*System.out.println("What's your name?");
		System.out.println(s.nextLine().length());
		
		System.out.println("Enter your postcode:");
		System.out.println(s.nextLine().toUpperCase());
		
		System.out.println("Enter your password twice:");
		if(s.nextLine().equals(s.nextLine())){
			System.out.println("Your passwords match!");
		} else {
			System.out.println("Your passwords don't match!");
		}
		
		System.out.println("Enter your full name:");
		System.out.println("Hello " + s.nextLine().split(" ")[1]);
	
		System.out.println("Enter your full name including your middle name:");
		String name = s.nextLine();
		System.out.println(String.format("%s%s%s", name.charAt(0), name.split(" ")[1].charAt(0), name.split(" ")[2].charAt(0)));
	
		System.out.println("Enter a saying:");
		System.out.println(s.nextLine().split(" ").length);
	
		System.out.println("Enter a string:");
		String str = s.nextLine();
		for(int i = str.length(); i > 0; i--){
			System.out.print(str.charAt(i - 1));
		}
		
		System.out.println("\nEnter a word:");
		String word = s.nextLine();
		int vowels = 0, consonants = 0;
		String v = "aeiou";
		for(int i = 0; i < word.length(); i++){
			if(v.indexOf(word.charAt(i)) > -1){
				vowels++;
			} else {
				consonants++;
			}
		}
		System.out.println("Vowels: " + vowels + ", consonants: " + consonants);
	
		
		String word = "RANDOM";
		String temp = "012345";
		do {
			System.out.println("Enter a guess:");
			String guess = s.nextLine();
		
			if(guess.length() != word.length()){
				System.out.println("The guess needs to be 6 characters long.");
				continue;
			}
			
			for(int i = 0; i < guess.length(); i++){
				if(guess.charAt(i) == word.charAt(i)){
					temp = temp.replace(String.valueOf(i), guess.substring(i, i + 1));
				}
			}
			System.out.println(temp.replaceAll("\\d", "?"));
			
			guess = s.nextLine();
			if(temp.equals(guess)){
				System.out.println("You've correctly guessed " + word + "!");
				break;
			}
		} while(true);
			
		
		System.out.println("Enter text to encrypt:");
		String text = s.nextLine();
		System.out.println("Enter the key:");
		int key = s.nextInt();
		
		for(int i = 0; i < text.length(); i++){
			char c = text.charAt(i);
			if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
				System.out.print((char) ((int) c + key));
			} else {
				System.out.print(c);
			}
		}
		
			
		System.out.println("Enter a word:");
		String word = s.nextLine();
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
				System.out.println(word + " is not a palindrome!");
				break;
			}
		}
			
			
		System.out.println("Enter an ISBN:");
		String isbn = s.nextLine();
		while(isbn.length() != 13){
			System.out.println("The ISBN needs to be 13 digits:");
			isbn = s.nextLine();
		}
		
		int total = 0;
		for(int i = 0; i < isbn.length() - 1; i++){
			int weight = i % 2 == 0 ? 1 : 3;
			total += weight * Integer.parseInt(isbn.substring(i, i + 1));
		} // 9780349140438
		
		if(Integer.parseInt(isbn.substring(12, 13)) == (10 - total % 10)){
			System.out.println("ISBN is valid!");
		} else {
			System.out.println("ISBN is not valid!");
		}

		
		int balance = 1000;
		int bet = 0;
		do {
			System.out.println("Even: 2x, Multiple of 10: 3x, Prime: 5x, < 5: 2x\nGuess a number:");
			int guess = s.nextInt();
			bet = s.nextInt();
			
			int r = new Random().nextInt(30);
			if(guess == r){
				if(r % 2 == 0) bet *= 2;
				if(r % 10 == 0) bet *= 3;
				if(r < 5) bet *= 2;
				
				boolean prime = true;
				for(int i = r - 1; i > 1; i--){
					if(r % i == 0) prime = false;
				}
				if(prime) bet *= 5;
				System.out.println("You've guessed correctly, payout: " + bet);
			}
			System.out.println("Continue? y/n");
		} while(s.nextLine().equals('y'));
		
		*/
			
	}
}
