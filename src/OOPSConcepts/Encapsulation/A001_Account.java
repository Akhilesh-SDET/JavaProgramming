package OOPSConcepts.Encapsulation;

public class A001_Account {
   private int pin;
   private double blance;
   public A001_Account(int pin, double blance) {
	super();
	this.pin = pin;
	this.blance = blance;
   }
   public int getPin() {
	return pin;
   }
   public void setPin(int pin) {
	this.pin = pin;
   }
   public double getBlance() {
	return blance;
   }
   public void setBlance(double blance) {
	this.blance = blance;
   }
   
}
