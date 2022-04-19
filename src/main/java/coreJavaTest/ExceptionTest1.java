package coreJavaTest;

public class ExceptionTest1 {
public static void main(String[] args) {
	System.out.println(getValue());
}

public static int getValue() {
	int k;
	try {
		k =18;
		return k;
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		return k=20;
	}
}

}
