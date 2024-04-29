package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandlerClearAll implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		RpnCalculator.op.reset();
		System.out.println("Cleared");
		RpnCalculatorGui.display.setText(RpnCalculator.op.showVal());

	}

}
