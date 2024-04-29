package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandlerEnter implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		RpnCalculator.op.complete();
		RpnCalculatorGui.display.setText("");
		
	}

}
