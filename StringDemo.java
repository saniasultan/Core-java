package basicprograms;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Abc";
		String s2=new String("efg");
		String s3=null;
		s3="hij";
		System.out.println(s1+s2+s3);
		//string pooling
String str1="cat";
String str2="cat";
String str3=new String("cat");
System.out.println("str1==str2 :"+(str1==str2));
System.out.println("str1==str3:"+(str1==str3));
System.out.println("str1 equals str2:"+(str1.equals(str2)));
System.out.println("str1 equals str3:"+(str1.equals(str3)));
str2="dog";
System.out.println("str1==str2 :"+(str1==str2));
	}

}
