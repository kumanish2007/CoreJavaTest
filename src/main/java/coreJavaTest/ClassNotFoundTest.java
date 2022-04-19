package coreJavaTest;

public class ClassNotFoundTest {
public static void main(String[] args) throws ClassNotFoundException {
	A objRef = new A();
	System.out.println(objRef.getValue());
	Class.forName("coreJavaTest.A");
}
}
