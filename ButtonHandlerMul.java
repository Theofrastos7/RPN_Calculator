package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandlerMul implements ActionListener {
	
	public ButtonHandlerMul() {
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		  RpnCalculator.st.push(RpnCalculator.st.pop()*RpnCalculator.st.pop());
	}
}
