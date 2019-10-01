package com;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	class UsernamePassword1 {

	public static void main(String[] args) throws FileNotFoundException {
		
	String fileName = "c:\\HR\\Details.txt";
	Scanner scanner = new Scanner(new File(fileName));
	int i=0;
	int count = 0;
	while (scanner.hasNextLine()) {
	count++;
	scanner.nextLine();
	scanner.nextLine();
	}
	String[] employeeIds = new String[count];
	String[] passwords = new String[count];
	Scanner scanner2 = new Scanner(new File(fileName));
	for (int i1 = 0; i1 < count; i1++) {
	employeeIds[i1] = scanner2.nextLine();
	passwords[i1] = scanner2.nextLine();
	}

	for (int i1 = 0; i1 < count; i1++) {
	System.out.println(employeeIds[i1] + " - " + passwords[i1]);
	}

	}

	  }



