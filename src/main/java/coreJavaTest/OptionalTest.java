package coreJavaTest;

import java.util.Optional;

public class OptionalTest {
	public static int count = 0;
public static void main(String[] args) {
	Optional<String> kk = getOptionalValue();
	if(kk.isPresent()) {
		System.out.println(kk.get());
	}else {
		System.out.println(kk.empty().get());
	}
	
	if(count > 0) {
		count++;
		main(null);
	}else {
		//return 0;
	}
	
	 StringBuffer sb = new StringBuffer();
	    sb.append("ab");
	    sb.append("kc");
	    System.out.println(sb.toString()); 
	    Integer i = new Integer(6);
	    System.out.println(i.compareTo(8));
	    System.out.println(i.equals(8));
	    System.out.println(Math.max(12, 23));
}

public static Optional<String> getOptionalValue(){
	return Optional.ofNullable("bc");
}
}
