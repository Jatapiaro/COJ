import java.util.Scanner;
import java.util.Locale;
public class COJ3424{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nCasos = sc.nextInt();

		for(int i=0;i<nCasos;i++){
			double lengthOfSide = sc.nextDouble();
			double innerAngle = sc.nextDouble();

			double nSides = numberOfSides(innerAngle);

			double radius = interiorRadius(lengthOfSide,innerAngle);
			double circleArea = areaOfCircle(radius);
			//System.out.println("Cir area: "+circleArea);
			double polArea = areaOfPolygon(nSides,radius,lengthOfSide);
			//System.out.println("Pol area: "+polArea);
			System.out.format(Locale.US,"%.3f%n",polArea-circleArea);
		}
	}

	public static double areaOfPolygon(double sides,double apothem,double lengthOfSides){
		return (sides*lengthOfSides*apothem)/2;
	}

	public static double areaOfCircle(double radius){
		return Math.PI*radius*radius;
	}

	public static double interiorRadius(double lengthOfSides,double angle){
		double alpha = Math.toRadians(180-90-(angle/2));
		double beta = Math.toRadians(angle/2);
		double newL = lengthOfSides/2;
		return (newL*Math.sin(beta))/Math.sin(alpha);
	}

	public static double numberOfSides(double angle){
		return (360)/(180-angle);
	}
}