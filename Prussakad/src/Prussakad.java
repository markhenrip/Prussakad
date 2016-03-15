import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prussakad {
	public static void main(String [] args){
		Scanner vastus = new Scanner(System.in);
		System.out.println("kartul");
		Prussakas [] juss = new Prussakas[50];
		for (int i = 0; i<50;i++){
			juss[i] = Prussakas.loo_prussakas(1);
		}
		for (Prussakas pruss : juss)System.out.println(pruss.getNimi());
		String jahei = vastus.next();
	}
}