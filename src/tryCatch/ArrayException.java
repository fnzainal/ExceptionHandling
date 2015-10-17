package tryCatch;

public class ArrayException {
	public static void main(String[] args){
		String[] string={"a","b","c","d","e"};
		
		try {
			  System.out.print(string[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("toString() : "+e.toString());
			System.out.print("printStackTrace() : ");e.printStackTrace();
		}
	}
}
