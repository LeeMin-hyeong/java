class A {
	String s;
	int val;
	
	A(String s, int val){
		this.s=s;
        this.val=val;
	}
	public String toString() { return val + s; }
	int getVal(){ return this.val; }
}
class B extends A {
	String s;
	int val;

	B(String s, int val){
		super(s,val);
		this.val=val;
	}
	B(int val){
		super("joo",val);
	}
	public String toString() { return val+s; }
	int getVal() { return val*2; }
}
class C extends B {
	String s;
	int val;
	
	C(String s, int val){
		super(s+s,val);
	}
}
public class OverridingTest {

	public static void main(String[] args) {
		A a = new A("a",1);
		System.out.println(a);

		B b = new B("b",2);
		System.out.println(b);

		B b2 = new B(11);
		System.out.println(b2);

		C c = new C("c",3);
		System.out.println(c);
	}
}