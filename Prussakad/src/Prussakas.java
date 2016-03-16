import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Prussakas{
    private static Random rand_gen = new Random();
    private String nimi;
    private double kiirus;              //cm/s rekordkiirus ligikaudu 1500
    private double vanus;               //päevades
    private static final ArrayList<String> nimed = new ArrayList<String>(Arrays.asList("Coco", "Bernard", "Donald", "Jim", "Craig", "Ryan", "John", "Mango", "Thumper", "Bella", "Kiwi", "Charlie", "Oreo", "Sunny", "Gizmo", "Peanut", "Bonito","Bella", "Bailey", "Max", "Chloe", "Lucy", "Molly", "Charlie", "Daisy", "Buddy", "Maggy", "Sophie", "White Lightning"));
    private static int[] olnudnimed = new int[500];
    private static final String[] rooma_nr = {"I","II","III","IV","V","VI","VII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX"}; // kui samad nimed tekivad
    Prussakas(String nimi, double kiirus, double vanus) {
        this.nimi = nimi;
        this.kiirus = kiirus;
        this.vanus = vanus;
        if (olnudnimed[0] != 0){
            for (int i = 0; i < 500; i++){
                olnudnimed[i] = 0;
            }
        }
    }
    
    public static Prussakas loo_prussakas(int raskustase){
    	double kordaja = 0;
    	switch (raskustase) {
    	case 1: kordaja = 1;
    	case 2: kordaja = 1.25;
    	case 3: kordaja = 1.5;
    	case 10: kordaja = 5;
    	}
    	double kiirus = (8 + rand_gen.nextDouble() * kordaja);
        return new Prussakas(anna_nimi(), kiirus, 1 * rand_gen.nextInt(10));
    }
    
    private static String anna_nimi(){
        String nimi1 = nimed.get(rand_gen.nextInt(nimed.size()-1));
        int koht = nimed.indexOf(nimi1);
        nimi1 = nimi1 + "_" + rooma_nr[olnudnimed[koht]];
        olnudnimed[koht]++;
        return nimi1;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getKiirus() {
        return kiirus;
    }

    public void setKiirus(double kiirus) {
        this.kiirus = kiirus;
    }

    public double getVanus() {
        return vanus;
    }

    public void setVanus(double vanus) {
        this.vanus = vanus;
    }

}