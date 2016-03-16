class Võistlus{
    private int raskustase;
    String[] nimed1 = {"Ray'","Juhani","Ilmari","Vladimiri","Joosepi","Borislavi","Ignati"};
    String[] nimed2 = {"Mängumaa", "Pillerkaar", "Tarakanisõiduparadiis", "Koletisviuhlemised"};
    String[] toimunud = new String[500];
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
	    			System.out.println(prussakas_parim);
	    		}
	    	}
	    	System.out.println(tulemus);
	    	for (Prussakas pruss : osalejad){
	    		System.out.print(pruss.getNimi());
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
}