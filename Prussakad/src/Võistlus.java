import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Võistlus{
    private Random rand1 = new Random();
	Scanner scn  = new Scanner(System.in);
    private String nimi = "";
    private int raskustase;
    private static final String[] nimed1 = {"Ray'","Juhani","Ilmari","Vladimiri","Joosepi","Borislavi","Ignati"};
    private static final String[] nimed2 = {"Mängumaa", "Pillerkaar", "Tarakanisõiduparadiis", "Koletisviuhlemised"}; //siin kuni public Võitsluseni on suurte ambitsioonide varemed
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
	    Prussakas[] joonis = new Prussakas[osalejad.length]; //loon koopia osalevatest prussakatest
	    int j = -1;
	    for (Prussakas elem: osalejad){
	    	j++;
	    	joonis[j] = elem;
	    }
	    int finiššeerinud = 0; //iks dee 2 š-d
	    boolean sõit = true;
	    String prussakas_parim = "";
	    int number = 0;
	    String rada = "";
	    Prussakas dummy = new Prussakas (null, 0, 0); // see asendatakse array-sse, kuna me tahame eemaldada kiireima ja moodustada edetabelit
	    String[] rajad = new String[osalejad.length];
	    j = 0;
	    
	    while (sõit == true){
	    	int i = -1; //et eemaldada kõrgeim 
	    	int I = 0; // i abistaja
	    	double maksimum = Double.MIN_VALUE;
	    	for (Prussakas pruss: osalejad){
	    		i++;
	    		if (pruss.getKiirus() > maksimum){
	    			I = i;
	    			maksimum = pruss.getKiirus();
	    			prussakas_parim = pruss.getNimi(); //siin toimub parima välja selgitamine
	    			//System.out.println("###" + prussakas_parim);
	    		}
	    	}
//	    	for (Prussakas elem_j: joonis){
//	    		rada = "|" + new String(new char[99]).replace("\0", "-") + "|" + elem_j.getNimi(); 
//	    	}
	    	//System.out.println(tulemus);
	    	//for (Prussakas pruss : osalejad){
	    	//	System.out.print(pruss.getNimi());
	    	//}
	    	tulemus[number] = prussakas_parim; //lisame parimad
	    	osalejad[I] = dummy; //asendame parima mõttetu klooniga
	    	finiššeerinud++;
	    	if (finiššeerinud == osalejad.length){ //kui kõik osalejad on finišisse jõudnud
	    		sõit = false;
	    	}
	    	number++; // creative I know
	    }
	    for (Prussakas elem_j: joonis){
    		rada = "|#" + new String(new char[99]).replace("\0", "-") + "|" + elem_j.getNimi();
    		rajad[j] = rada;
    		j++;
    	}
	    
	    while (rajad[rajad.length-1].indexOf("#") < 100){
	    	j = -1;
	    	for (String r: rajad){
	    		j++;
	    		if (r.indexOf("#") < 100){
	    			int teepikkus = (int)Math.round(joonis[j].getKiirus());
	    			int k = r.indexOf("#");
	    			r = r.replace("#", "-");
	    			char[] r2 = r.toCharArray();
	    			if (k + teepikkus < 100)
	    			{
	    				r2[k+teepikkus]='#'; //stringbuilder was found about, after 
	    			}
	    			else 
	    			{
	    				r2[100]='#';
	    			}
	    			rajad[j] = new String(r2);
	    		
	    		}
	    		
	    	}
	    	for(String s : rajad) {System.out.println(s+"");}
	    	System.out.println();
	    	System.out.println("Võistluse jälgimiseks vajuta korduvalt Enterit. ");
	    	//scn.nextLine();
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    	
		return tulemus;
	}
	
	
	
	
//	public Prussakas[] korralda_võidusõit_alt(ArrayList<Prussakas> osalejad){
//	    Prussakas[] tulemus = new Prussakas[osalejad.size()];
//	    int palju1,palju2,finiššeerinud = 0;
//	    double koht,max;
//	    boolean sõit = true;
//	    String prussakas_parim = "";
//	    String kujutlus = "";
//	    double [] pos = new double[osalejad.size()];
//	    for (int i = 0; i < osalejad.size(); i++)pos[i] = 0;
//	    ArrayList<Prussakas> lõpus = new ArrayList<Prussakas>();
//	    while (sõit == true){
//	    	lõpus.clear();
//	    	scn.next();
//	    	for (Prussakas pruss : osalejad){
//	    		koht = pos[osalejad.indexOf(pruss)];
//	    		if (koht < 100 && koht != -10){
//		    		palju1 = (int) Math.round(koht);
//		    		palju2 = 99 - palju1;
//		    		kujutlus = "|" + new String(new char[palju1]).replace("\0", "-")
//		    	    + "#" + new String(new char[palju2]).replace("\0", "-") + "|" + pruss.getNimi();
//		    		pos[osalejad.indexOf(pruss)] += pruss.getKiirus();
//		    		if (koht >= 100 && (lõpus.indexOf(pruss) != -1)){
//		    			lõpus.add(pruss);
//		    			finiššeerinud++;
//		    		}else if (koht >= 100 || koht == -10){
//			    		kujutlus = "|" + new String(new char[99]).replace("\0", "-")+ "#" + "|"+ pruss.getNimi();
//		    		}
//	    		}
//	    		System.out.println(kujutlus);
//	    	}
//	    	for (int i = 0; i < osalejad.size(); i++){
//	    	max = 0;
//		    	if (pos[i] > 100){
//		    		for (int p = 0; p < osalejad.size(); p++){
//		    			if (pos[i] > max){
//		    				max = pos[i];
//		    			}	
//		    		}
//		    		pos[i] = -10;
//		    		tulemus[i] = osalejad.get(i);
//		    	}
//	    	}
//	    	if (finiššeerinud > 0)sõit=false;
//	    }
//	    return tulemus;
//	}
}