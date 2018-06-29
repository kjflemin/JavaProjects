/**
 * 
 */
package Basics;

import java.io.Console;
import java.util.Scanner;

/**
 * @author Keith
 *
 */
public class BasicsOfJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	

	}

	public static void doLoop(int mycount) {
		int cnt = 0;
		do {
			System.out.println(mycount + "\n");
			System.out.println(cnt + "Greater than 5\n");
			cnt++;
		} while (cnt < 10);
	}

	public static void forLoop(int mycount) {
		for (int cnt = 1; cnt < mycount; cnt++) {
			System.out.println("cnt\n");
		}
	}

	public static void whileLoop(int mycount) {
		while (mycount > 5) {
			System.out.println(mycount + "\n");
		}
	}

	public static void ifStatement(int myint) {
		if (myint > 5) {
			System.out.println("Greater than 5\n");
		}

		if (myint == 5) {
			System.out.println("equal 5\n");
		} else {
			System.out.println("less than 5\n");
		}

	}

	public static void switchStatement(int myswitch) {

		switch (myswitch) {
		case 1:
			System.out.println("in switch for 1\n");
			break;
		case 2:
		case 3:
			break;
		default:
			break;
		}

	}

	public static void scannerForInput() {
		Scanner scanner = new Scanner(System.in);
		Console console = System.console();

		var valueA = scanner.nextLine();
		System.out.println(valueA + "\n");

		valueA = console.readLine();
		System.out.println(valueA + "\n");
		
		scanner.close();
	}

}
