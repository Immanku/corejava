import java.util.regex.*;//matcher and pattern both included
import java.util.Scanner;
 
 class Demo
{
	
	
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
String t="Best ever movie Dark knight ";
 
 Pattern p = Pattern.compile("B?"+"k+"+"[a-zA-F]");//here we used quantifier B? and character class
 
 Matcher m = p.matcher(t);
		
    
      if (m.find())//doubt
        { System.out.println("Found match!"); 
       }
	   else {
		   System.out.println("not found! ");
	   }
	   System.out.println(Pattern.matches("..b","bab"));//. represent single character
	   System.out.println(Pattern.matches(".ello","hello"));
	   System.out.println("by character classes and quantifiers ...");  
System.out.println(Pattern.matches("[789]{1}[0-9]{9}", sc.nextLine())); // regular expression starting with 789 is accepted 
System.out.println(Pattern.matches("[789][0-9]{9}", sc.nextLine()));  
	   
}
}
