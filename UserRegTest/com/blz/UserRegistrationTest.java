package com.blz;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {

	 UserRegistration userRegistration = new UserRegistration();

	    @Test
	    public void givenFirstName_WhenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.firstName("Sunil");
	            assertEquals(true, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
	        try {
	            boolean result = userRegistration.firstName("sunil");
	            assertEquals(false, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }

	    }

	    @Test
	    public void givenFirstName_null_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.firstName(null);
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.NULL, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenFirstName_emptyString_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.firstName("");
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.EMPTY, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenLastName_WhenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.lastName("Thitame");
	            assertEquals(true, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
	        try {
	            boolean result = userRegistration.lastName("thitame");
	            assertEquals(false, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenLAstName_null_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.firstName(null);
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.NULL, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenLastName_emptyString_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.firstName("");
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.EMPTY, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenEmail_WhenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.email("abc@yahoo.com");
	            assertEquals(true, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
	        try {
	            boolean result = userRegistration.email("abc()*@gmail.com");
	            assertEquals(false, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenEmail_null_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.firstName(null);
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.NULL, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenEmail_emptyString_ShouldThrowUserRegistrationException() {
	        try {
	            boolean result = userRegistration.firstName("");
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.EMPTY, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.phoneNumber("91 7219221821");
	            assertEquals(true, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
	        try {
	            boolean result = userRegistration.phoneNumber("+91 9604315270");
	            assertEquals(false, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPhoneNumber_null_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.phoneNumber(null);
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.NULL, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPhoneNumber_emptyString_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.phoneNumber("");
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.EMPTY, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPasswordRule1_WhenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.passwordRule1("password@123");
	            assertEquals(true, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPasswordRule1_WhenNotProper_ShouldReturnFalse() {
	        try {
	            boolean result = userRegistration.passwordRule1("psw@");
	            assertEquals(false, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPasswordRule1_null_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.passwordRule1(null);
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.NULL, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPassWordRule1_emptyString_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.passwordRule1("");
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.EMPTY, e.type);
	            System.out.println(e);
	        }
	    }


	    @Test
	    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.passwordRule2("passWord@123");
	            assertEquals(true, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
	        try {
	            boolean result = userRegistration.passwordRule2("psw@");
	            assertEquals(false, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPasswordRule2_null_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.passwordRule2(null);
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.NULL, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPassWordRule2_emptyString_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.passwordRule2("");
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.EMPTY, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.passwordRule3("123Aa@123");
	            assertEquals(true, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
	        try {
	            boolean result = userRegistration.passwordRule3("123456789");
	            assertEquals(false, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPassWordRule3_null_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.passwordRule3(null);
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.NULL, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPassWordRule3_emptyString_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.passwordRule3("");
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.EMPTY, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.passwordRule4("@123@Abc");
	            assertEquals(true, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
	        try {
	            boolean result = userRegistration.passwordRule4("rajendraaa$$##@@");
	            assertEquals(false, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPassWordRule4_null_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.passwordRule4(null);
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.NULL, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenPassWordRule4_emptyString_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.passwordRule4("");
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.EMPTY, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenEmail1_WhenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
	            assertEquals(true, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
	        try {
	            boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
	            assertEquals(false, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenEmail1_null_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.email(null);
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.NULL, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenEmail1_emptyString_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.email("");
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.EMPTY, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenEmail2_WhenProper_ShouldReturnTrue() {
	        try {
	            boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
	            assertEquals(true, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenEmail2_WhenNotProper_ShouldReturnFalse() {
	        try {
	            boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
	            assertEquals(false, result);
	        } catch (UserRegistrationException e) {
	            System.out.println(e);
	        }
	    }


	    @Test
	    public void givenEmail2_null_ShouldThrowUserRegistrationException() {
	        try {
	            userRegistration.email(null);
	        } catch (UserRegistrationException e) {
	            assertEquals(UserRegistrationException.type.NULL, e.type);
	            System.out.println(e);
	        }
	    }

	    @Test
	    public void givenEmail2_emptyString_ShouldThrowUserRegistrationException() {
			try {
				userRegistration.email("");
			} catch (UserRegistrationException e) {
				assertEquals(UserRegistrationException.type.EMPTY, e.type);
				System.out.println(e);
			}
	    }
}
