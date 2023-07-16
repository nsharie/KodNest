package classWork;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();
		System.out.println("Enter Two Numbers");
		int a =sc.nextInt();
		int b =sc.nextInt();
		System.out.println("<----------------------------------------->");
		System.out.println("Enter an choice");
		System.out.println("<--------------------MENU----------------->");
		System.out.println("1: ADD");
		System.out.println("2: SUB");
		System.out.println("3: MUL");
		System.out.println("4: DIV");
		System.out.println("5: MOD");
		int ch = sc.nextInt();
			switch(ch) {
				case 1:{
					c1.add(a, b);
					break;
				}
				case 2:{
					c1.sub(a, b);
					break;
				}
				case 3:{
					c1.mul(a, b);
					break;
				}
				case 4:{
					c1.div(a, b);
					break;
				}
				case 5:{
					c1.mod(a, b);
					break;
				}
				default:{
					throw new IllegalArgumentException("Unexcepted value: " + ch);
				}
			}
		}
	}
