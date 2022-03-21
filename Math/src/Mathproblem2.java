
public class Mathproblem2 {

	public static void main(String[] args) {
		double a =25;
		
		//converting values to radian
		double b = Math.toRadians(a);
		
		//return the trigonometric sine of a 
		System.out.println("Sine value of a is"+ Math.sin(a));
		
		//return the trigonometric tangent value of a 
		System.out.println("Tangent value of a is" + Math.tan(a));
		
		//return the trigonometric arc sine of a
		System.out.println("Arc sine value of a is " + Math.asin(a));

		//return the trigonometric arc cosine value of a 
		System.out.println("Arc cosine value of a  is" + Math.acos(a));
		
		//return the hyperbolic sine of a 
		System.out.println("The hyperbolic value of a is " + Math.cosh(b));
		
		//return the hyperbolic tangent value of a 
		System.out.println("The tangent value of a is" + Math.tanh(b));
		
		

	}

}
