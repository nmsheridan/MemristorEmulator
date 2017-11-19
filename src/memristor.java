
public class memristor {
	double resistance;
	double resistivityConstant;
	double appliedVoltage;
	//double appliedCurrent;
	double thresholdVoltage;
	double currentPulseTime;
	
	public memristor(double thresholdVoltage, double initialResistance) {
		this.thresholdVoltage = thresholdVoltage;
		/*if(initialResistance == void) {
			resistance = 1;
		}*/
		resistance = initialResistance;
	}
	
	private void resistanceFunction() {
		if(appliedVoltage>=thresholdVoltage) {
			double t=0;
			while(t<=currentPulseTime) {
				resistance = resistance + resistivityConstant*appliedVoltage*0.0001/resistance;
				t = t + 0.0001;
			}
			return;
		}
		else {
			double t=0;
			while(t<=currentPulseTime) {
				resistance = resistance + resistivityConstant*appliedVoltage*0.0001*0.0001/resistance;
				t = t + 0.0001;
			}
			return;
		}
	}
	
	public void applyVoltagePulse(double appliedVoltage, double currentPulseTime) {
		this.appliedVoltage = appliedVoltage;
		this.currentPulseTime = currentPulseTime;
		resistanceFunction();
		return;
	}
	
	public double getCurrent() {
		return appliedVoltage/resistance;
	}
	
	
	
}
