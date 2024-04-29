package package1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class RpnCalculatorGui extends Frame{
	
	Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
	Button Adder,Subtractor,Divider,Multiplier,ResultPresenter, Enter, Delete, Dot, Clear, ClearAll;
	static TextField display;
	
	public RpnCalculatorGui(String title){

	super(title);	
	this.setLayout(null);
	this.setFont(new Font("TimesRoman", Font.PLAIN, 14));
	this.setBackground(Color.BLUE);
	
	button0 = createButton("0", 44, 265, 75, 28);
	button1 = createButton("1", 44, 235, 35, 28);
	button2 = createButton("2", 84, 235, 35, 28);
	button3 = createButton("3", 124, 235, 35, 28);
	button4 = createButton("4", 44, 205, 35, 28);
	button5 = createButton("5", 84, 205, 35, 28);
	button6 = createButton("6", 124, 205, 35, 28);
	button7 = createButton("7", 44, 175, 35, 28);
	button8 = createButton("8", 84, 175, 35, 28);
	button9 = createButton("9", 124, 175, 35, 28);
	Dot = createButton(".", 124, 265, 35, 28);
	
	Adder = new Button("+"); 
	Adder.setBounds(165, 265, 35, 28);
	Adder.setFont(new Font("TimesRoman", Font.PLAIN, 14));
	Adder.setForeground(Color.blue);
	Adder.addActionListener(new ButtonHandlerAdd());
	this.add(Adder);
	
	Subtractor = new Button("-"); 
	Subtractor.setBounds(165, 235, 35, 28);
	Subtractor.setFont(new Font("TimesRoman", Font.PLAIN, 14));
	Subtractor.setForeground(Color.blue);
	Subtractor.addActionListener(new ButtonHandlerSub());
	this.add(Subtractor);
	
	Multiplier = new Button("*"); 
	Multiplier.setBounds(165, 205, 35, 28);
	Multiplier.setFont(new Font("TimesRoman", Font.PLAIN, 14));
	Multiplier.setForeground(Color.blue);
	Multiplier.addActionListener(new ButtonHandlerMul());
	this.add(Multiplier);	
	
	Divider = new Button("/"); 
	Divider.setBounds(165, 175, 35, 28);
	Divider.setFont(new Font("TimesRoman", Font.PLAIN, 14));
	Divider.setForeground(Color.blue);
	Divider.addActionListener(new ButtonHandlerDiv());
	this.add(Divider);
	
	ResultPresenter = new Button("="); 
	ResultPresenter.setBounds(205, 265, 45, 28);
	ResultPresenter.setFont(new Font("TimesRoman", Font.PLAIN, 14));
	ResultPresenter.setForeground(Color.blue);
	ResultPresenter.addActionListener(new ButtonHandlerResult());
	this.add(ResultPresenter);
		
	
	Enter = new Button("Enter"); 
	Enter.setBounds(205, 235, 45, 28);
	Enter.setFont(new Font("TimesRoman", Font.PLAIN, 14));
	Enter.setForeground(Color.blue);
	Enter.addActionListener(new ButtonHandlerEnter());
	this.add(Enter);
	
	Delete = new Button("Delete"); 
	Delete.setBounds(205, 205, 45, 28);
	Delete.setFont(new Font("TimesRoman", Font.PLAIN, 14));
	Delete.setForeground(Color.blue);
	Delete.addActionListener(new ButtonHandlerDelete());
	this.add(Delete);
	
	Clear = new Button("Clear"); 
	Clear.setBounds(205, 175, 45, 28);
	Clear.setFont(new Font("TimesRoman", Font.PLAIN, 14));
	Clear.setForeground(Color.blue);
	Clear.addActionListener(new ButtonHandlerClear());
	this.add(Clear);
	
	ClearAll = new Button("ClearAll"); 
	ClearAll.setBounds(195, 145, 55, 28);
	ClearAll.setFont(new Font("TimesRoman", Font.PLAIN, 14));
	ClearAll.setForeground(Color.blue);
	ClearAll.addActionListener(new ButtonHandlerClearAll());
	this.add(ClearAll);
	
	
	display = new TextField("0");
	display.setEditable(false);
	display.setBounds(13,55,257,30);
	this.add(display);
	
	this.setSize(283, 320);
	this.setLocation(40,80);
	this.setVisible(true);
	this.setResizable(false);
	this.addWindowListener(new CloseWindowAndExit());	
		
	}

	
	private Button createButton(String string, int i, int j, int k, int l) {
		var button = new Button(string);
		button.setBounds(i,j,k,l);
		button.setFont(new Font("TimesRoman", Font.PLAIN, 14));
		button.setForeground(Color.black);
		button.addActionListener(new ButtonHandler(string.charAt(0)));
		this.add(button);
		return button;
	}

}

class CloseWindowAndExit extends WindowAdapter {
	public void windowClosing(WindowEvent closeWindowAndExit) {
		System.exit(0);
	}
}
