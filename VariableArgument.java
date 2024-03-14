package basicprograms;

public class VariableArgument {
static int addition(int...arr) {
int sum=0;
//	for(byte i=0;i<=arr.length-1;i++) {
//		sum+=arr[i];
//	}

	 for(int b:arr){
	 sum+=b;
	 }
	 
	 return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(addition(2,3,4));
System.out.println(addition(55,45));
System.out.println(addition(10,6));
	}

}
