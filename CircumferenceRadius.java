import java.util.*;
public class CircumferenceRadius {
	public static Double getCircumference(Double radius) {
		return 2*3.14*radius;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Double radius=sc.nextDouble();
		System.out.println("circumference of radius of circle"+getCircumference(radius));
	}

}
