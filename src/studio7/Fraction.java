package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	//constructor
	public Fraction (int n, int d)
	{
		numerator = n;
		denominator = d;
	}
	
	//get 
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	
	//set
	public void setNumerator(int n)
	{
		numerator = n;
	}
	public void setDenominator(int d)
	{
		denominator = d;
	}
	
	public String addFractions (Fraction b)
	{
		int n  = (numerator * b.getDenominator()) + (b.getNumerator() * denominator);
		int d = denominator * b.getDenominator();
		return n+ "/"+ d;
	}
	
	public String subFractions (Fraction b) //subtract b from a
	{
		int n  = (numerator * b.getDenominator()) - (b.getNumerator() * denominator);
		int d = denominator * b.getDenominator();
		return n+ "/"+ d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fraction po = new Fraction (2,3);
		Fraction op = new Fraction (5,6);
		System.out.println(po.addFractions(op));
		System.out.println(po.subFractions(op));
	}

}
