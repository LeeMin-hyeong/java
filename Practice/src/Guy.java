import java.util.ArrayList;

class Guy {
	String s;
	static int guys=0;
	
	public Guy(String s){
		this.s=s;
		guys++;
	}

    public static void main(String[] args){
        //System.out.println("guy : "+Guy.guys);
        Guy chloe = new Guy("Chloe");
        Guy a = new Guy("a");
        Guy c = new Guy("b");

        ArrayList guys = new ArrayList();
        guys.add(new Guy("Chloe"));
        guys.contains(new Guy("Chloe"));
        guys.add(chloe);
        guys.contains(chloe);

        //new Guy();
    }
}