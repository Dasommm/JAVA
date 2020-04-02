package com.car;

public class MTest {

	public static void main(String[] args) {
		// car +- 10 , sportsCar +- 15, truck +- 5
		
		Car car1 = new Car();
		car1.accelPedal();
		car1.accelPedal();
		System.out.println(car1);
		car1.breakPedal();
		System.out.println(car1);
		car1.breakPedal();
		System.out.println("---------------");
		Car car2 = new SportsCar("빨간색");
		car2.accelPedal();
		car2.accelPedal();
		System.out.println(car2);
		car2.breakPedal();
		car2.breakPedal();
		
		
				
	}

}
