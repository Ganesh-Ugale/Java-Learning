package abtractmodifier;

// Service User

/*
 * To Design the Features for Simple and Compound Interest.
 * 
 * */
// NumberProgramImp this class extends here bcz for pow() method
public abstract class SimpleCompoundInterest extends NumberProgramImp{
	
	public abstract double simpleInt(float principal, float roi, float time);
	public abstract float compoundInt(float principal, float roi, float time);
	
}
