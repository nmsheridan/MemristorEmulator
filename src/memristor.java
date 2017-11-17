
public class memristor {
	double resistance;
	double resistivityConstant;
	double appliedVoltage;
	double appliedCurrent;
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
			resistance = resistance + resistivityConstant*appliedVoltage*currentPulseTime;
			return;
		}
		else {
			resistance = resistance + resistivityConstant*appliedVoltage*0.0001*currentPulseTime;
			return;
		}
	}
	
	
	
	
}
