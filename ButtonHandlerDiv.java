package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandlerDiv implements ActionListener {
	
	public ButtonHandlerDiv() {
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		 Double a,b;
		 a = RpnCalculator.st.pop();
		 b = RpnCalculator.st.pop();
		 RpnCalculator.st.push(b / a);
		 
	}
}
