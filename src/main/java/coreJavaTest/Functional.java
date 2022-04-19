package coreJavaTest;

@FunctionalInterface
public interface Functional {
	 String getName();
	 String toString();
	 boolean equals(Object obj);
	 int hashCode();
	 
	 default void log(String str){
			System.out.println("I1 logging::"+str);
		}
	 static boolean isNull(String str) {
			System.out.println("Interface Null Check");

			return str == null ? true : "".equals(str) ? true : false;
		}
}
