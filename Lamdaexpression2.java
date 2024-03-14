package lamdaexpression;
interface ifwithpara{
	void show(String s);
}
public class Lamdaexpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifwithpara i=(s)->System.out.println("string="+s);
	i.show("hello");
	}
	

}
