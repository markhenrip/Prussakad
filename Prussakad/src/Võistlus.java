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
	    int finiššeerinud = 0;
	    boolean sõit = true;
	    while (sõit == true){
	    	if (finiššeerinud == osalejad.length)sõit=false;
	    	
	    }
		return tulemus;
	}
}