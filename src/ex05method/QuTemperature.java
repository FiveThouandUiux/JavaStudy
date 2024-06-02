package ex05method;

import java.util.Scanner;

/*
 섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라. 공식은 아래와 같습니다 
메소드명 : celsiusToFahrenheit() , fahrenheitToCelsius()
공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8


 */
public class QuTemperature {
	static double celsiusToFahrenheit(double c) {
		double celsius = 1.8 * c +32;
		return celsius;
	}
	
	static double fahrenheitToCelsius(double f) {
		double fahrenheit = (f - 32) / 1.8;
		return fahrenheit;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("섭씨를 입력하세요");
		double c = scanner.nextDouble();
		System.out.println("화씨를 입력하세요");
		double f = scanner.nextDouble();
		
		double celsius = celsiusToFahrenheit(c);
		double fahrenheit = fahrenheitToCelsius(f);
		System.out.printf("섭씨 -> 화씨 : %.1f\n", celsius);
		System.out.printf("화씨 -> 섭씨 : %.1f\n", fahrenheit);
	}

}
