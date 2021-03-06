import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProfileCalculatorTest {
	ProfileCalculator calculator = new ProfileCalculator();

	@Test
	void testCalculateBMI() {
		
		
		//test1
		double curWeight1 = 165.1;
		double curHeight1 = 72.3;
		double bmi1 = calculator.calculateBMI(curWeight1,curHeight1);
		assertEquals(bmi1,22.10897,0.001);
		
		//test2
		double curWeight2 = 200.13;
		double curHeight2 = 88.7;
		double bmi2 = calculator.calculateBMI(curWeight2,curHeight2);
		assertEquals(bmi2,17.80587,0.001);
	}

	@Test
	void testCalculateInactiveBMR() {
		
		//test1
		String gender1 = "MALE";
		double currentWeight1 = 165.1;
		double currentHeight1 = 72.3;
		int age1 = 24;
		assertEquals(calculator.calculateInactiveBMR(gender1, currentWeight1, currentHeight1, age1),1849.58299,0.001);
	
		//test2
		String gender2 = "f";
		double currentWeight2 = 132.1;
		double currentHeight2 = 63.3;
		int age2 = 18;
		assertEquals(calculator.calculateInactiveBMR(gender2, currentWeight2, currentHeight2, age2),1442.545,0.001);
	
	}

}
