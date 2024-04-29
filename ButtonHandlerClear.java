package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandlerClear implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		RpnCalculator.st.pop();
		System.out.println("Last number cleared");
	}

}
