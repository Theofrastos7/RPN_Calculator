package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
	private char s;
	public ButtonHandler(char s) {
		this.s=s;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		RpnCalculator.op.addDigit(s);
		RpnCalculatorGui.display.setText(RpnCalculator.op.showVal());	
	}

}
