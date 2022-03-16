
public class WebApp {

		// TODO Auto-generated method stub
		 private final String message = "Hello World!";


		    public static void main(String[] args) {
		       
		        
		        System.out.println(new WebApp().getMessage());
		    }

		    private final String getMessage() {
		        return message;
		    } 
		    public  String carprice(String str)
		    {  System.out.println("we are inside carprice");
		        return str + " is expensive";
		         }
		    public int add1(int a , int b)
		    {
		         return a+b;    }
		    public int mult1(int a , int b)
		    {  return a*b;
		        }
		    public int div1(int a, int b)
		    { return a/b;}

	}


