package collections.overridingwithvariable;

public class AclassTest {

	public static void main(String[] args) {
		A a=new A();
		System.out.println("A class:"+a.x);
		B b=new B();
		System.out.println("B class:"+b.x);
		A a1=new B();
		System.out.println("Ref of A:"+a1.x);

	}

}
