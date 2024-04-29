package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandlerDelete implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		RpnCalculator.op.deleteLastDigit();
		RpnCalculatorGui.display.setText(RpnCalculator.op.showVal());	
		
	}
}
