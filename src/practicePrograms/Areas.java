package practicePrograms;

import java.util.Scanner;

public class Areas {

	Scanner sc = new Scanner(System.in);

	double calculateSquareArea(double side) {
		double Area = side * side;
		return Area;
	}

	double calculateRectangleArea(double l, double b) {
		return l * b;
	}

	double calculateCircleArea(double r) {
		return Math.PI * r * r;

	}

	double calculateTriangleArea(double b, double h) {

		return 0.5 * b * h;
	}

	 double calculateParallelogramArea(double b, double h) {
		return b * h;
	}

	double calculateTrapeziumArea(int a, int b, double h) {
		return 0.5 * (a + b) * h;
	}
	
	int Rhombus(double diagonal) {
		int result = (int) diagonal* (int)diagonal; 
		return (int)0.5* result;
	}
	
	double Semicircle(double radius) {
		return 0.5*Math.PI*radius*radius;
	}
	
	double CubeSurfaceArea(double side) {
		return 6*side*side;
		
	}
	
	double CylinderCurvedSurfaceArea(double radius, double height) {
		return 2*Math.PI*radius*height;
	}

	void main(String[] args) {

		Areas C = new Areas();
		System.out.println("Enter the side:");
		double base = sc.nextDouble();
		double result = C.calculateSquareArea(base);
		System.out.println("Square Area= " + result);

		System.out.println("Enter the Length: ");
		double length = sc.nextDouble();
		System.out.println("Enter the Breadth: ");
		double breadth = sc.nextDouble();
		double Result = C.calculateRectangleArea(length, breadth);
		System.out.println("Rectangle Area= " + Result);

		System.out.println("Enter the radius: ");
		double Radius = sc.nextDouble();
		double result1 = calculateCircleArea(Radius);
		System.out.println("Circle Area= " + result1);

		/*System.out.println("Enter the Base: ");
		double base = sc.nextDouble();*/
		System.out.println("Enter the Height: ");
		double height = sc.nextDouble();
		double result2 = calculateTriangleArea(base, height);
		System.out.println("Triangle Area= " + result2);
		double result3 = calculateParallelogramArea(base, height);
		System.out.println("Parallelogram Area= " + result3);

		System.out.println("Enter A Value: ");
		int a = sc.nextInt();
		System.out.println("Enter B Value: ");
		int b = sc.nextInt();
		double result4 = calculateTrapeziumArea(a,b,height);
		System.out.println("Trapezium Area= "+ result4);
		
		System.out.println("Enter Diagonal Value: ");
		double d = sc.nextDouble();
		int result5 = Rhombus(d);
		System.out.println("Rhombus Area= "+ result5);
		
		double result6 =Semicircle(Radius);
		System.out.println("Semicircle Area= "+result6);
		
		double result7 =CubeSurfaceArea(base);
		System.out.println("CubeSurface Area= "+result7);
		
		double result8 =CylinderCurvedSurfaceArea(Radius, height);
		System.out.println("CylinderCurvedSurface Area= "+result8);
		
	}

}
