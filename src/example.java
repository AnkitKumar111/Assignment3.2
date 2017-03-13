
public class example {
	int x; int y;   //integer will have default value: 0
	String name;    // default: null
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		example pnt = new example();
		 System.out.println ("pnt is " + pnt.name + " " + pnt.x + " " + pnt.y);
	}
}
/*correct option is d:
 The program prints pnt is null 0 0.
 
When we declare a variable without assigning it an explicit value,
the Java compiler will assign a default value.
This default initialization applies for instance variables,
not for method variables.
For variables in method, we have to initialize them explicitly.

*/