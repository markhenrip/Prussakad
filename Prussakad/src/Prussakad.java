import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Prussakad {
	public static void main(String [] args){
		System.out.println("kartul");
		Prussakas [] juss = new Prussakas[50];
		for (int i = 0; i<50;i++){
			juss[i] = Prussakas.loo_prussakas(1);
		}
		for (Prussakas pruss : juss)System.out.println(pruss.getKiirus());
	}
}