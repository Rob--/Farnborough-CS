import java.util.Scanner;

public class ISBN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter an ISBN:");
		String isbn = s.nextLine();
		while(isbn.length() != 13 && isbn.length() != 10){
			System.out.println("The ISBN needs to be 13 or 10 digits:");
			isbn = s.nextLine();
		}
		
		if(isbn.length() == 13) System.out.println(check13(isbn) ? "ISBN is valid!" : "ISBN is not valid!");
		if(isbn.length() == 10) System.out.println(check10(isbn) ? "ISBN is valid!" : "ISBN is not valid!");		
	}
	
	static boolean check13(String isbn){
		int total = 0;
		for(int i = 0; i < isbn.length() - 1; i++){
			int weight = i % 2 == 0 ? 1 : 3;
			total += weight * Integer.parseInt(isbn.substring(i, i + 1));
		} // 9780349140438
		
		return Integer.parseInt(isbn.substring(12, 13)) == (10 - total % 10);
	}
	
	static boolean check10(String isbn){
		int total = 0;
		for(int i = 0; i < isbn.length() - 1; i++){
			total += (10 - i) * Integer.parseInt(isbn.substring(i, i + 1));
		} // 9780349140438
		
		return total % 11 == 0;
	}
}
