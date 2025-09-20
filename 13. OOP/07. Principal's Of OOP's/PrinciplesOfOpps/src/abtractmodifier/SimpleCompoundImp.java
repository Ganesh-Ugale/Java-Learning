package abtractmodifier;

// Service Provider Class

public class SimpleCompoundImp extends SimpleCompoundInterest{
	
	@Override
	public double simpleInt(float principal, float roi, float time) {
		return (principal * roi * time) / 100.0f;
	}
	
	@Override
	public float compoundInt(float principal, float roi, float time) {
		return (principal * pow(1.0f + roi/100.0f, time)) - principal;
	}
}
