import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prussakad {
	public static void main(String [] args){
		Scanner scn  = new Scanner(System.in);
		double raha = 2000.0;
		//System.out.println("kartul");
		//Prussakas [] juss = new Prussakas[10];
		//for (int i = 0; i<10;i++){
			//juss[i] = Prussakas.loo_prussakas(1);
		//}
		//for (Prussakas pruss : juss)System.out.println(pruss.getKiirus());
		//Võistlus comp = new Võistlus(1);
		//String[] neeger = comp.korralda_võidusõit(juss); võidusõit, no h8 to all mah niggas out there especially u Anton
		//for (String sass: neeger)System.out.println(sass);
		System.out.println("Tere, antud mängus peab tegema pakkumisi prussakate peale.");
		System.out.println("Mäng saab läbi kui raha saab otsa, või oled võimeline ostma oma enda prussaka, mis maksab 5000");
		System.out.println("Kas tahad alustada?[jah/ei]");
		String jahei = scn.next();
		boolean mäng_käib = true;
		if (jahei.equals("Jah") || jahei.equals("jah")){
			System.out.println("Alustame!");
			while (mäng_käib == true){
				Prussakas [] juss = new Prussakas[10];
				for (int i = 0; i<10;i++){
					juss[i] = Prussakas.loo_prussakas(1);
				}
				for (Prussakas pruss : juss)System.out.println(pruss.getNimi());
				System.out.println("Sisesta prussaka nimi, kes võidab");
				String pruss_nimi = scn.next();
				System.out.println("Sisesta pakutava raha summa");
				String  pruss_pakkumine = scn.next();
				int pakkumine = Integer.parseInt(pruss_pakkumine);
				if (pakkumine > raha){
					System.out.println("Sul pole nii palju raha");
					break;
				}
				Võistlus comp = new Võistlus(1);
				String[] edetabel = comp.korralda_võidusõit(juss);
				System.out.println("Võitja on "+ edetabel[0]);
				if (!pruss_nimi.equals(edetabel[0])){
					raha = raha-pakkumine;
				}
				else{
					raha = raha + (pakkumine*5);
				}
				if (raha <= 0){
					System.out.println("Sul on probleem! Sa oled rahast tühjaks jooksnud!");
					mäng_käib = false;
				}
				else if (raha >= 5000.0){
					System.out.println("Õnnitlen, sa saad nüüd alustada oma karjääri prussakakasvatajana!");
					mäng_käib = false;
				}
				System.out.println("Sul on " + raha + " eurot.");
				System.out.println();
				if (mäng_käib == true){
				System.out.println("Järgmine võistlus juba algab, valmistu panustamiseks");
				System.out.println();
				}
			}
		}
		else{
			System.out.println("Head aega siis.");
		}
		
		
		/*
		System.out.println("Nüüd algab päris mäng see tähendab minu oma.");
		ArrayList<Prussakas> jussid = new ArrayList<Prussakas>();
		for (int i = 0; i<5;i++){
			jussid.add(Prussakas.loo_prussakas(1));
		}
		for (Prussakas pruss : jussid)System.out.print(pruss.getNimi()+ " ");
		Võistlus mina = new Võistlus(1);
		mina.korralda_võidusõit_alt(jussid);
		
	}*/
	}
}
	