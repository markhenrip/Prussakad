class Võistlus{
    private int raskustase;
    String[] nimed1 = {"Ray'","Juhani","Ilmari","Vladimiri","Joosepi","Borislavi"};
    String[] nimed2 = {"Mängumaa", "Pillerkaar", "Tarakanisõiduparadiis"};
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

}