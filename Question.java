package arrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> countrySet=new HashSet<>();
		Scanner s=new Scanner(System.in);
		byte ch;    String cname;
		System.out.println("1:Insert\n2:Remove\n3:DisplayList\n4Exit");
  while(true)
{
 System.out.println("Enter your choice:");
 			ch=s.nextByte();
 	if(ch>=1&&ch<=3){
 			switch(ch)
{
    				case 1:
    					System.out.println("\nEnter country name:");
    					 cname = s.next();
    					countrySet.add(cname);
    						break;
    				case 2:
    					System.out.println("\nEnter Country name u want to remove:");
    					cname=s.next();
    					countrySet.remove(cname);
    						break;
    				case 3:
    					 System.out.println("\nCountries List:");
    					 	for(String cs:countrySet)
    					 	{
    					 		System.out.println(cs);
    					 	}
    						break;
}
}
 	 else if(ch==4)
  {
   System.out.println("\nEnd");
  break;
   }
 	else {
 		System.out.println("\n invalid choice");
 		break;
 	}
}
	}
}


