package p0422;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("concat() Test: " + "abc".concat("def"));
		System.out.println("substring() Test: " + "substring".substring(3, 7));
		String color = "red, blue, white";
		String arr[] = color.split(",");
		System.out.println("split() test");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		
		System.out.println("              trim() test :        ".trim());
		System.out.println("toLowerCase() test : ".toLowerCase());
		System.out.println("toUpperCsae() test : ".toUpperCase());
		System.out.println("indexOf() test : " + "abcdefghijk".indexOf("def"));
		System.out.println("lastIndexOf() test : " + "abcdefaghijk".lastIndexOf("a"));
		System.out.println("contains() test : " + "On Air".contains("on"));
		System.out.println("replace() test: " + "hello java".replace("java", "wolrd"));
		System.out.println("endsWith() test : " + "abcdefg".endsWith("fg"));
		System.out.println("startsWith() test : " + "abcdefg".startsWith("abc"));
		System.out.println("comparedTo() test: " + "abcdefg".compareTo("abcdefg"));
		System.out.println("equals() test : " + "abc".equals("abc"));
	}

}
