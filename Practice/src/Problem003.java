class Super { protected int x=1; }

class Duper extends Super {
	static int y=2;
	public Duper(int n){
		System.out.println(this.get(n));
	} 
	public int get(int n){ return x += y + n; }
}
public class Problem003 {
	static int a=0;
	public static Boolean inc() { return ++a>0; }

	public static void main(String[] args) {
		Boolean b = Boolean.parseBoolean(args[0]);
		Super p=(( b && inc() ) ? (new Duper(a)) : (new Duper(a+1)));
	}
}