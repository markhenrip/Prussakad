import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Võistlus{
    private Random rand1 = new Random();
	Scanner scn  = new Scanner(System.in);
    private String nimi = "";
    private int raskustase;
    private static final String[] nimed1 = {"Ray'","Juhani","Ilmari","Vladimiri","Joosepi","Borislavi","Ignati"};
    private static final String[] nimed2 = {"Mängumaa", "Pillerkaar", "Tarakanisõiduparadiis", "Koletisviuhlemised"};
    private String[] toimunud = new String[500];
    public Võistlus(int raskus){
        this.raskustase = raskus;
    }
	public int getRaskustase() {
		return raskustase;
	}
	public void setRaskustase(int raskustase) {
		this.raskustase = raskustase;
	}

	public String[] korralda_võidusõit(Prussakas [] osalejad){
	    String[] tulemus = new String[osalejad.length];
	    int finiššeerinud = 0; //iks dee 2 š-d
	    boolean sõit = true;
	    String prussakas_parim = "";
	    int number = 0;
	    Prussakas dummy = new Prussakas (null, 0, 0);
	    while (sõit == true){
	    	int i = -1; //et remove-da kõrgeim 
	    	int I = 0;
	    	double maksimum = Double.MIN_VALUE;
	    	for (Prussakas pruss: osalejad){
	    		i++;
	    		if (pruss.getKiirus() > maksimum){
	    			I = i;
	    			maksimum = pruss.getKiirus();
	    			prussakas_parim = pruss.getNimi();
	    			System.out.println("###" + prussakas_parim);
	    		}
	    	}
	    	//System.out.println(tulemus);
	    	for (Prussakas pruss : osalejad){
	    		//System.out.print(pruss.getNimi());
	    	}
	    	tulemus[number] = prussakas_parim;
	    	osalejad[I] = dummy;
	    	finiššeerinud++;
	    	if (finiššeerinud == osalejad.length){
	    		sõit = false;
	    	}
	    	number++; // creative I know
	    }
		return tulemus;
	}
	
	
	
	
	public String[] korralda_võidusõit_alt(ArrayList<Prussakas> osalejad){
	    String[] tulemus = new String[osalejad.size()];
	    int finiššeerinud = 0;
	    boolean sõit = true;
	    String prussakas_parim = "";
	    double [] pos = new double[osalejad.size()];
	    for (int i = 0; i < osalejad.size(); i++)pos[i] = 0;
	    while (sõit == true){
	    	
	    	for (Prussakas pruss : osalejad){
	    		pos[osalejad.indexOf(pruss)] += pruss.getKiirus();
	    	}
	    	if (finiššeerinud == osalejad.size())sõit=false;
	    }
	    return tulemus;
	}
}