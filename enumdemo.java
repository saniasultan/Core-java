package basicprograms;

public class enumdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Days d=Days.Sunday;
System.out.println(d);
System.out.println(d.ordinal());
System.out.println(Days.Thursday.ordinal());
for(Days dd:Days.values()){
	
	System.out.println(dd+" "+dd.ordinal());
}
	}

}
