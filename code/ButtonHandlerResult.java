package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandlerResult implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String s = String.valueOf(RpnCalculator.st.pop());
		RpnCalculatorGui.display.setText(s);	
		System.out.println(s);
		
		//RpnCalculatorGui.display.setText(String.valueOf(RpnCalculator.st.pop()));	
	}

}
