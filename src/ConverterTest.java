import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConverterTest {
	
	Converter inchesToInches;
	Converter inchesToFeet;
	Converter inchesToYard;
	Converter inchesToMile;
	Converter inchesToLeague;
	
	Converter feetToInches;
	Converter feetToFeet;
	Converter feetToYard;
	Converter feetToMile;
	Converter feetToLeague;
	
	Converter yardToInches;
	Converter yardToFeet;
	Converter yardToYard;
	Converter yardToMile;
	Converter yardToLeague;
	
	Converter mileToInches;
	Converter mileToFeet;
	Converter mileToYard;
	Converter mileToMile;
	Converter mileToLeague;
	
	Converter leagueToInches;
	Converter leagueToFeet;
	Converter leagueToYard;
	Converter leagueToMile;
	Converter leagueToLeague;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		inchesToInches = new Converter("Inches", "Inches", 1.0);
		inchesToFeet = new Converter("Inches", "Feet", 1.0);
		inchesToYard = new Converter("Inches", "Yard", 1.0);
		inchesToMile = new Converter("Inches", "Mile", 1.0);
		inchesToLeague = new Converter("Inches", "League", 1.0);
		
		feetToInches = new Converter("Feet", "Inches", 1.0);
		feetToFeet = new Converter("Feet", "Feet", 1.0);
		feetToYard = new Converter("Feet", "Yard", 1.0);
		feetToMile = new Converter("Feet", "Mile", 1.0);
		feetToLeague = new Converter("Feet", "League", 1.0);
		
		yardToInches = new Converter("Yard", "Inches", 1.0);
		yardToFeet = new Converter("Yard", "Feet", 1.0);
		yardToYard = new Converter("Yard", "Yard", 1.0);
		yardToMile = new Converter("Yard", "Mile", 1.0);
		yardToLeague = new Converter("Yard", "League", 1.0);
		
		mileToInches = new Converter("Mile", "Inches", 1.0);
		mileToFeet = new Converter("Mile", "Feet", 1.0);
		mileToYard = new Converter("Mile", "Yard", 1.0);
		mileToMile = new Converter("Mile", "Mile", 1.0);
		mileToLeague = new Converter("Mile", "League", 1.0);
		
		leagueToInches = new Converter("League", "Inches", 1.0);
		leagueToFeet = new Converter("League", "Feet", 1.0);
		leagueToYard = new Converter("League", "Yard", 1.0);
		leagueToMile = new Converter("League", "Mile", 1.0);
		leagueToLeague = new Converter("League", "League", 1.0);

	}

	@After
	public void tearDown() throws Exception {
		inchesToInches = null;
		inchesToFeet = null;
		inchesToYard = null;
		inchesToMile = null;
		inchesToLeague = null;
		
		feetToInches = null;
		feetToFeet = null;
		feetToYard = null;
		feetToMile = null;
		feetToLeague = null;
		
		yardToInches = null;
		yardToFeet = null;
		yardToYard = null;
		yardToMile = null;
		yardToLeague = null;
		
		mileToInches = null;
		mileToFeet = null;
		mileToYard = null;
		mileToMile = null;
		mileToLeague = null;
		
		leagueToInches = null;
		leagueToFeet = null;
		leagueToYard = null;
		leagueToMile = null;
		leagueToLeague = null;
	}

	@Test
	public void testConverter1() {
		assertEquals(inchesToInches.converter(), 1.0, 0.01);
		assertEquals(inchesToFeet.converter(), 0.0833333, 0.01);
		assertEquals(inchesToYard.converter(), 0.0277778, 0.01);
		assertEquals(inchesToMile.converter(), 1.5782840909e-5, 0.01);
		assertEquals(inchesToLeague.converter(), 4.571637560574198E-6, 0.01);
		
		assertEquals(feetToInches.converter(), 12.0, 0.01);
		assertEquals(feetToFeet.converter(), 1.0, 0.01);
		assertEquals(feetToYard.converter(), 0.3333336, 0.01);
		assertEquals(feetToMile.converter(), 0.000189394090909, 0.01);
		assertEquals(feetToLeague.converter(), 4.571637560574198E-6, 0.01);
		
		assertEquals(yardToInches.converter(), 36.0, 0.01);
		assertEquals(yardToFeet.converter(), 3.0, 0.01);
		assertEquals(yardToYard.converter(), 1.0, 0.01);
		assertEquals(yardToMile.converter(), 0.000568182, 0.01);
		assertEquals(yardToLeague.converter(), 1.645789521806711E-4, 0.01);
		
		assertEquals(mileToInches.converter(), 63360, 0.01);
		assertEquals(mileToFeet.converter(), 5280, 0.01);
		assertEquals(mileToYard.converter(), 1760, 0.01);
		assertEquals(mileToMile.converter(), 1.0, 0.01);
		assertEquals(mileToLeague.converter(), 0.2896589558379812, 0.01);
		
		assertEquals(leagueToInches.converter(), 218740, 0.01);
		assertEquals(leagueToFeet.converter(), 18228.3333333, 0.01);
		assertEquals(leagueToYard.converter(), 6076.12, 0.01);
		assertEquals(leagueToMile.converter(), 3.45233585858585, 0.01);
		assertEquals(leagueToLeague.converter(), 1.0, 0.01);
	}
}
