package lamdaexpression;
interface ifwithreturn{
	int show(int x,int y);
}
public class LamdaExpression3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ifwithreturn i=(a,b)->(a*b);
//		System.out.println("multiplication="+i.show(2, 10));
//		
		ifwithreturn i=(x,y)->{
			System.out.println("x="+x+"\ty="+y);
			return (x*y);
		};
		System.out.println("multiplication="+i.show(2, 10));
	}

}
