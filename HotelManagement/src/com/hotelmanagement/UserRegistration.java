package com.hotelmanagement;

import java.io.Serializable;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class UserRegistration implements Serializable
{
	private String name;
	private String password;
	private String confirmPassword;
	private String mobileNumber;
	private String address;
	private String emailId;
	/**
	 * The getName() method returns the name 
	 * @return
	 */
	public String getName() 
	{
		return name;
	}
	/**
	 * The setAddress() method  set the address
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
	public String getAddress() 
	{
		return address;
	}
	/**
	 * The setEmailId method set the email id based on the validateemailId() method
	 * @param emailId
	 */
	public void setEmailId(String emailId)
	{
		if(validateEmailId(emailId))
		{
			this.emailId = emailId;
		}
		else
		{
			System.out.println("please enter valid mail id....");
		}
		
		
	}
	/**
	 * The getEmailId() method returns emailId
	 * @return
	 */
	public String getEmailId() 
	{
		return emailId;
	}
	/**
	 * The setName method set the name based on the validatelength() method
	 * @param name
	 */
	public void setName(String name) 
	{
		
		if(validateLength(name,6,12))
		{
			
			this.name=name;
		}
		else
		{
			System.out.println("name is invalid....name should be min 6 chars and max 12 chars...");
		}
		
	}
	/**
	 * The getpassword method returns the password
	 * @return
	 */
	public String getPassword() 
	{
		return password;
	}
	/**
	 * The setter method to set password
	 * @param password
	 */
	public void setPassword(String password) 
	{
		if(validateLength(password,8,10)&&validateUppercaseAlpha(password)&&validateLowercaseAlpha(password)&&validateDigit(password)&&validateSpecialCharacter(password))
		{
			this.password=password;
		}
		else
		{
			System.out.println("password is invalid.....password should consist of 1 uppercase,1 lowercase,1 digit and 8-10 chars....");
		}
	}
	/**
	 * The getConfirmPassword method returns the password
	 * @return
	 */
	public String getConfirmPassword() 
	{
		return confirmPassword;
	}
	/**
	 * The setconfirmPassword method sets the password based on the validatepassword method  
	 * @param confirmPassword
	 */
	public void setConfirmPassword(String confirmPassword) 
	{
		if(validatePassword(password,confirmPassword))
		{
			this.confirmPassword = confirmPassword;
		}
		else
		{
			System.out.println("password and confirm password doesn't matches....plz re-enter.....");
		}
	}
	/**
	 * The getMobilenumber returns the mobile number
	 * @return
	 */
	public String getMobileNumber() 
	{
		return mobileNumber;
	}
	/**
	 * The setMobileNumber sets the mobile number based on the validatelength and validatedigit
	 * @param mobileNumber
	 */
	public void setMobileNumber(String mobileNumber) 
	{
		if(validateLength(mobileNumber,10,10) && validateDigit1(mobileNumber))
		{
			this.mobileNumber=mobileNumber;
		}
		else
		{
			System.out.println("mobile number should consists of only 10 digits....");
		}
	}
	/**
	 * The validatepassword method checks the password and confirm password is correct
	 * @param confirmPassword2
	 * @param password2
	 * @return
	 */
	public boolean validatePassword(String confirmPassword2, String password2) 
	{
		boolean status = false;
		if(password2.equals(confirmPassword2))
		{
			status = true;
			
		}
		else
		{
			return false;
		}
		return status;
	}
	/**
	 * ValidateEmailId method valiates the mail id based on condition
	 * @param emailId
	 * @return
	 */
	public static boolean validateEmailId(String emailId)
	{
		boolean status = false;
		String email = "^[a-zA-Z0-9_+*&-]+(?:\\."+"[a-zA-Z0-9_+*&-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-z"+"A-Z]{2,7}$";
		Pattern pat = Pattern.compile(email);
		if(pat.matcher(emailId).matches())
		{
			
			status = true;
		
		}
//		else
//		{
//			status = true;
//			return pat.matcher(emailId).matches();
//			
//		}
		return status;
	}
	/**
	 * validatespecial character method returns the boolean value based on condition
	 * @param password2
	 * @return
	 */
	public static boolean validateSpecialCharacter(String password2) 
	{
		boolean status=false;
		for(int i=0;i<password2.length();i++)
		{
			char ch=password2.charAt(i);
			if(ch=='$'||ch=='@'||ch=='_'||ch=='%'||ch=='!'||ch=='^'||ch=='?'||ch=='*'||ch=='&'||ch=='('||ch==')'||ch=='<'||ch=='>'||ch=='{'||ch=='}'||ch=='/'||ch=='\\'||ch==';')
			{
				status=true;
				break;
			}
		}
		return status;
	}
	/**
	 * validatedigit returns v 
	 * @param password2
	 * @return
	 */
	public static boolean validateDigit(String password2) 
	{
		boolean status=false;
		for(int i=0;i<password2.length();i++)
		{
			char ch=password2.charAt(i);
			if(Character.isDigit(ch))
			{
				status=true;
				break;
			}
		}
		return status;
	}
	//validating lowercase character to confirm password.....
	public static boolean validateLowercaseAlpha(String password2) 
	{
		boolean status=false;
		for(int i=0;i<password2.length();i++)
		{
			char ch=password2.charAt(i);
			if(Character.isLowerCase(ch))
			{
				status=true;
				break;
			}
		}
		return status;
	}
	//validating uppercase character to confirm password.....
	public static boolean validateUppercaseAlpha(String password2) 
	{
		boolean status=false;
		for(int i=0;i<password2.length();i++)
		{
			char ch=password2.charAt(i);
			if(Character.isUpperCase(ch))
			{
				status=true;
				break;
			}
		}
		return status;
	}
	//validating valid length to confirm password.....
	public static boolean validateLength(String password2, int min, int max) 
	{
		if(password2.length()>=min && password2.length()<=max)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean validateDigit1(String number)
	{
		boolean status=false;
		for(int i=0;i<number.length();i++)
		{
			char ch=number.charAt(i);
			if(Character.isDigit(ch))
			{
				status=true;
			}
			else
			{
				status=false;
				break;
			}
		}
		return status;
	}
	@Override
	public String toString() {
		return "UserRegistration [name=" + name + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
}