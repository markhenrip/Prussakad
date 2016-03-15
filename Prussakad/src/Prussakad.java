import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prussakad {
	public static void main(String [] args){
		Scanner vastus = new Scanner(System.in);
		double raha = 2000.0;
		Prussakas juss = Prussakas.loo_prussakas(1);
		System.out.println("Tere, antud mängus peab tegema pakkumisi prussakate peale.");
		System.out.println("Mäng saab läbi kui raha saab otsa, või oled võimeline ostma oma enda prussaka, mis maksab 5000");
		System.out.println("Kas tahad alustada?")
		String jahei = vastus.next();
		if (jahei.equals("Jah")||jahei.equals("jah")){
			System.out.println("Hakkame pihta, sul on "+ raha);
		}
		else{
			System.out.println("Olgu, head aega");
		}
	}
}


