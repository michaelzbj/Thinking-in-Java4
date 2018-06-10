package strings;

//: strings/WhitherStringBuilder.java

public class WhitherStringBuilder {
	
	public String implicit(String[] fields) {
		String result = "";
		for (int i = 0; i < fields.length; i++)
			result += fields[i];
		return result;
	}

	public String explicit(String[] fields) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < fields.length; i++)
			result.append(fields[i]);
		return result.toString();
	}
	
	
//	public static void main(String[] args) {
//		WhitherStringBuilder ws = new WhitherStringBuilder();
//		String[] strings = {"a","b","c"};
//		System.out.println(ws.explicit(strings));
//		System.out.println(ws.implicit(strings));
//	}
	
} /// :~
