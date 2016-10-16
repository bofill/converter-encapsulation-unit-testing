
public class Converter {

	static final int INCHES_IN_A_FOOT   = 12;
	static final int INCHES_IN_A_YARD   = 36;
	static final int INCHES_IN_A_MILE   = 63360;
	static final int INCHES_IN_A_LEAGUE = 218740;

	private String unitToConvertFrom;
	private String unitToConvertTo;
	private double valueToConvert;

	public Converter(String unitToConvertFrom, String unitToConvertTo, double valueToConvert) {
		this.unitToConvertFrom = unitToConvertFrom;
		this.unitToConvertTo = unitToConvertTo;		
		this.valueToConvert = valueToConvert;
	}

	public double converter(){
		double valueInInches = convertToInches();
		double resultValue = convertFromInches(valueInInches);
		return resultValue;
	}

	private double convertToInches(){
		switch (unitToConvertFrom){
		case "Inches":
			return valueToConvert;
		case "Feet":
			return (valueToConvert * INCHES_IN_A_FOOT);
		case "Yard":
			return (valueToConvert * INCHES_IN_A_YARD);
		case "Mile":
			return (valueToConvert * INCHES_IN_A_MILE);
		case "League":
			return (valueToConvert * INCHES_IN_A_LEAGUE);
		default:
			return 0.0;
		}
	}

	private double convertFromInches(double valueInInches){
		switch (unitToConvertTo){
		case "Inches":
			return valueInInches;
		case "Feet":
			return (valueInInches / INCHES_IN_A_FOOT);
		case "Yard":
			return (valueInInches / INCHES_IN_A_YARD);
		case "Mile":
			return (valueInInches / INCHES_IN_A_MILE);
		case "League":
			return (valueInInches / INCHES_IN_A_LEAGUE);
		default:
			return 0.0;
		}
	}

	public String getUnitToConvertFrom() {
		return unitToConvertFrom;
	}

	public void setUnitToConvertFrom(String unitToConvertFrom) {
		this.unitToConvertFrom = unitToConvertFrom;
	}

	public String getUnitToConvertTo() {
		return unitToConvertTo;
	}

	public void setUnitToConvertTo(String unitToConvertTo) {
		this.unitToConvertTo = unitToConvertTo;
	}

	public double getValueToConvert() {
		return valueToConvert;
	}

	public void setValueToConvert(double valueToConvert) {
		this.valueToConvert = valueToConvert;
	}
}
