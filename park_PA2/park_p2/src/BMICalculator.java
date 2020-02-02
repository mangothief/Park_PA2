import java.util.Scanner;

public class BMICalculator
{
	// Variable declarations.
	private double weight;
	private double height;

	public static void main(String[] args)
	{
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBmi();
		app.displayBmi();
	}
	// Reads users data using two seperate methods.
	public void readUserData()
	{	
		readMeasurementData(readUnitType());
	}

	// Prompts the user which unit of measure they would like to use and then reads it in.
	private int readUnitType()
	{
		System.out.print("To calculate BMI metrically press '1' or for imperially press '2': ");

		Scanner measurementType = new Scanner(System.in);

		int choice = measurementType.nextInt();
		return choice;
	}

	// Determines which measurement the user selected and calls upon two seperate methods.
	private void readMeasurementData(int choice)
	{		
			if(choice == 1)
			{
				readMetricData();
			}
			else if(choice == 2)
			{
				readImperialData();
			}
	}

	// Prompts and reads in user data Metrically, using kilograms and meteres.
	private void readMetricData()
	{
		Scanner metricData =new Scanner(System.in);

		System.out.println("Please enter weight in Kilograms: ");
		double kilograms = metricData.nextDouble();
		setWeight(kilograms);

		System.out.println("Please enter height in Meters: ");
		double meters = metricData.nextDouble();
		setHeight(meters);
	}
	// Prompts and reads in user data Imperially, using pounds and inches.
	private void readImperialData()
	{
		Scanner imperialData =new Scanner(System.in);

		System.out.println("Please enter weight in pounds: ");
		double pounds = 703 * imperialData.nextDouble();
		setWeight(pounds);

		System.out.println("Please enter height in inches: ");
		double inches = imperialData.nextDouble();
		setHeight(inches);
	}

	// Returns weight.
	public double getWeight()
	{
		return this.weight;
	}

	// Sets weight and exits if a negative numbers is entered.
	private void setWeight(double weight)
	{
		if(weight < 0)
		{
			System.exit(0);
		}
		this.weight = weight;
	}

	// Returns weight.
	public double getHeight()
	{
		return this.height;
	}

	// Sets weight and exits if a negative number is entered.
	private void setHeight(double height)
	{
		if(height < 0)
		{
			System.exit(0);
		}
		this.height = height;
	}

	// Calculates User BMI.
	public double calculateBmi()
	{
		double bmi = (getWeight())/(getHeight()* getHeight());
		return bmi;
	}

	// Returns Users BMI.
	public double getBmi()
	{
		return calculateBmi();
	}
	
	// Calculates which catergory the user belongs to base upon BMI.
	private void calculateBmiCategory()
	{	
		if(getBmi() < 18.5)
		{	
			System.out.println("You are considered underweight");
		}
		else if(getBmi() <= 24.9)
		{
			System.out.println("You are considered normal weight");
		}
		else if(getBmi() <= 29.9)
		{
			System.out.println("You are considered overweight");
		}
		else
			System.out.println("You are obese");
	}

	// calls upon the CalculateBmiCategory method.
	public void getBmiCategory()
	{
		calculateBmiCategory();
	}

	// Displays users BMI and Category.
	public void displayBmi()
	{
		getBmiCategory();
		System.out.printf("And your BMI is: %.2f \n", getBmi());
	}

}