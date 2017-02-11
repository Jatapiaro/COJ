import java.util.Scanner;
import java.util.Locale;
public class COJ3424{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nCasos = sc.nextInt();

		for(int i=0;i<nCasos;i++){
			int lengthOfSide = sc.nextInt();
			int innerAngle = sc.nextInt();

			int nSides = numberOfSides(innerAngle);
			//System.out.println("sides: "+nSides);
			//System.out.println("Length: "+lengthOfSide);
			double radius = interiorRadius(nSides);
			double circleArea = areaOfCircle(radius);
			//System.out.println("Cir area: "+circleArea);
			double polArea = areaOfPolygon(nSides,radius,lengthOfSide);
			//System.out.println("Pol area: "+polArea);
			System.out.format(Locale.US,"%.3f%n",polArea-circleArea);
		}
	}

	public static double areaOfPolygon(int sides,double apothem,int lengthOfSides){
		return (sides*lengthOfSides*apothem)/2;
	}

	public static double areaOfCircle(double radius){
		return Math.PI*radius*radius;
	}

	public static double interiorRadius(int nsides){
		double ang = 360/nsides;
		ang/=2;
		double newAng = Math.toRadians(ang);
		return nsides/Math.tan(ang);
	}

	public static int numberOfSides(int angle){
		return (360)/(180-angle);
	}
}