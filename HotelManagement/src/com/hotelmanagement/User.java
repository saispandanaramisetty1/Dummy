
package com.hotelmanagement;
/**
 * predefined packages
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.io.Serializable;


/**
 * In this we are calling the functionalities of login and user registration
 * @author user
 *
 */
public class User {

	public static void main(String[] args) throws IOException {
		// initializing the scanner
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		System.out.println("Choice option to register 1.Online User 2.Exit");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:

			System.out.println("enter number to perform operation:");
			System.out.println("1.Register 2.Login ");
			int num = sc.nextInt();
			UserRegistration ur = null;
			switch (num) {
			case 1:
				ur = new UserRegistration();
				/**
				 * asking the user to register with name 
				 */
				whileloop: while (flag == 0) {
					System.out.println("enter name");
					String name = sc.next();
					ur.setName(name);
					if (ur.getName() != null) {
						flag = 1;
					}
				}
				/**
				 * asking the user to register with password
				 */
				flag = 0;
				while (flag == 0) {
					System.out.println("enter password");
					String password = sc.next();
					ur.setPassword(password);
					if (ur.getPassword() != null) {
						flag = 1;
					}
				}
				/**
				 * asking the user to register with confirm password
				 */
				flag = 0;
				while (flag == 0) {
					System.out.println("enter confirm password");
					String confirmPassword = sc.next();
					ur.setConfirmPassword(confirmPassword);
					if (ur.getConfirmPassword() != null) {
						flag = 1;
					}
				}
				/**
				 * asking the user to register with mobile number 
				 */
				flag = 0;
				while (flag == 0) {
					System.out.println("enter mobile number");
					String mobileNumber = sc.next();
					ur.setMobileNumber(mobileNumber);
					if (ur.getMobileNumber() != null) {
						flag = 1;
					}
				}
				/**
				 * asking the user to register with address 
				 */
				System.out.println("enter address");
				String address = sc.next();
				ur.setAddress(address);
				flag = 0;
				/**
				 * asking the user to register with emailId 
				 */
				while (flag == 0) {
					System.out.println("enter emailId");
					String emailId = sc.next();
					ur.setEmailId(emailId);
					if (ur.getEmailId() != null) {
						flag = 1;
					}
				}
				System.out.println("Registered successful....");
				BufferedWriter oos = null;
				try {
					File file = new File("Data1");
					//writing the data to the file
					FileWriter fw = new FileWriter(file, true);
					oos = new BufferedWriter(fw);
					//used to get the credentials in next line
					oos.newLine();
					//writing the name to the file
					oos.write(ur.getName());
					oos.write("_");
					
					oos.write(ur.getPassword());
					oos.write("_");
					// checking the password and confirm password are equal storing the password to file
					oos.write(ur.getConfirmPassword());
					oos.write("_");
					//writing the mobile number to the file
					oos.write(ur.getMobileNumber());
					oos.write("_");
					//writing the address to the file
					oos.write(ur.getAddress());
					oos.write("_");
					//writing the emailId to the file
					oos.write(ur.getEmailId());

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (oos != null)
							oos.close();
					} catch (Exception ex) {
						System.out.println("do nothing");
					}
				}
				break;
			case 2:
				//creating object for login
				Login login = new Login();
				int flag1 = 0;
				//enter the name and password for login
				while (flag1 == 0) {
					System.out.println("enter name");
					String name = sc.next();
					login.setName(name);
					System.out.println("enter password");
					String password = sc.next();
					login.setPassword(password);
					BufferedReader ois = null;
					try {
						//FileReader reads the data from the file
						FileReader fr = new FileReader("Data1");
						ois = new BufferedReader(fr);
						Scanner sc1 = new Scanner(ois);
						flag = 0;
						//spliting the string data based on the special symbol
						while (sc1.hasNext()) {
							String s1 = sc1.nextLine();
							String s2[] = s1.split("_");
							for (int i = 0; i < s2.length; i++) {
								//check name and password are matching are not
								if (s2[0].equals(name) && s2[1].equals(password)) {
									flag = 1;
									System.out.println("Login Successful....");
									break;
								}
							}
						}
						//closing the Scanner class reference
						sc1.close();
						if (flag == 1) {
							break;
						}

					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							if (ois != null)
								ois.close();
						} catch (Exception ex) {
							System.out.println("do nothing");
						}
					}
					// if password is mismatched 
					if (flag == 0) {
						System.out.println("user name or password is invalid......");
						System.out.println("1. Forget Password 2.Re-Login");
						int choice1 = sc.nextInt();
						switch (choice1) {
						case 1:
							flag1 = 1;
							int flag2 = 0;
							while (flag2 == 0) {
								System.out.println("enter registered EmailId:");
								String mail = "";
								try {
									mail = sc.next();
								}catch (ArrayIndexOutOfBoundsException e) {
									// TODO: handle exception
								}
								BufferedReader ois1 = null;
								try {
									FileReader fr = new FileReader("Data1");
									ois1 = new BufferedReader(fr);
									Scanner sc1 = new Scanner(ois1);
									flag = 0;
									while (sc1.hasNext()) {
										String s1 = sc1.nextLine();
										String s2[] = s1.split("_");
										if (s2[5].equals(mail)) {
											System.out.println("your password is:" + s2[1]);
											flag2 = 1;
											flag = 0;
											break;
										}

									}
								} catch (FileNotFoundException e) {
									e.printStackTrace();
								} catch (IOException e) {
									e.printStackTrace();
								} finally {
									try {
										if (ois1 != null)
											ois1.close();
									} catch (Exception ex) {
										System.out.println("do nothing");
									}
								}
								if (flag2 == 0) {
									System.out.println("entered Registered email id is invalid.....");
									break;
								}
							}
							break;
						case 2:
							flag1 = 0;
							break;
						}

					}
				}
				break;

			case 3:
			case 4:

			default:
				System.out.println("enter a valid option....");
			}

			break;

		case 2:
		case 3:
			return;
		default:
			System.out.println("enter a valid option to register....");
		}

	}
}
