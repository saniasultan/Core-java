package lamdaexpression;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class LamdaExpression4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
UnaryOperator<Integer> uo=(x)->(-x);
System.out.println(uo.apply(7));
uo=(x)->(x*10);
System.out.println(uo.apply(2));


UnaryOperator<Float> uo1=(x)->(-x);
System.out.println(uo1.apply(7.9f));

UnaryOperator<String> uo2=(x)->(x.toUpperCase());
System.out.println(uo2.apply("sania"));


BinaryOperator<String>  boperator=(s1,s2)->(s1+s2);
System.out.println(boperator.apply("sania","sultan"));

BinaryOperator<Integer>  boperator1=(s1,s2)->(s1+s2);
System.out.println(boperator1.apply(2,4));
	}

}
