package basicprograms;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte no[]= {22,44,77,88,99};
byte max=0;
for(byte s:no) {
	if(s>max)
		max=s;
	System.out.println(s+2);
	
}
System.out.println("maximum="+max);
byte index=0;
char[] ch= {'a','e','i','o','u'};

for (char c:ch) {
System.out.println("ch["+index+"]="+c);
index++;
}
	}

}
