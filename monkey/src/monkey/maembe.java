package monkey;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class maembe extends JFrame {
	private JTextField answerfield;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero, add, decimal, sub, multiply, div, equal, reset, delete;
	private String stemp1, stemp2, sanswer;
	private double answer= 0.0;
	private JPanel contentPanel;
	private JLabel b1, b2, b3, b4, b5, b6, b7, b8, b9, b10; 
	private boolean equalsClicked= false, opChosen= false;
	char operation= ' ';
	
	public maembe() {
		super("Calculator");
		
		answerfield = new JTextField(null, 33);
		answerfield.setEditable(false);
		
		nine = new JButton("9");
		eight = new JButton("8");
		seven = new JButton("7");
		six = new JButton("6");
		five = new JButton("5");
		four = new JButton("4");
		three = new JButton("3");
		two = new JButton("2");
		one = new JButton("1");
		zero = new JButton("0");
		decimal = new JButton(".");
		add = new JButton("+");
		sub = new JButton("-");
		multiply = new JButton("x");
		div = new JButton("/");
		equal = new JButton("=");
		reset= new JButton("C");
		delete= new JButton("Del");
		b1= new JLabel("");
		b2= new JLabel("");
		b3= new JLabel("");
		b4= new JLabel("");
		b5= new JLabel("");
		b6= new JLabel("");
		b7= new JLabel("");
		b8= new JLabel("");
		b9= new JLabel("");
		b10= new JLabel("");
		
		Dimension dim = new Dimension(60, 40);
		
		nine.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		six.setPreferredSize(dim);
		five.setPreferredSize(dim);
		four.setPreferredSize(dim);
		three.setPreferredSize(dim);
		two.setPreferredSize(dim);
		one.setPreferredSize(dim);
		zero.setPreferredSize(dim);
		decimal.setPreferredSize(dim);
		add.setPreferredSize(dim);
		sub.setPreferredSize(dim);
		multiply.setPreferredSize(dim);
		div.setPreferredSize(dim);
		equal.setPreferredSize(dim);
		reset.setPreferredSize(dim);
		delete.setPreferredSize(dim);
		answerfield.setPreferredSize(new Dimension(200, 30));
		b1.setPreferredSize(new Dimension(320, 20));
		b2.setPreferredSize(new Dimension(120, 25));
		b3.setPreferredSize(new Dimension(450, 30));
		b4.setPreferredSize(new Dimension(400, 10));
		b5.setPreferredSize(new Dimension(400, 10));
		b6.setPreferredSize(new Dimension(400, 10));
		b7.setPreferredSize(new Dimension(50, 50));
		b8.setPreferredSize(new Dimension(50, 50));
		b9.setPreferredSize(new Dimension(105, 50));
		b10.setPreferredSize(new Dimension(50, 50));
		
		Numbers n= new Numbers();
		Calc c= new Calc();
		
		zero.addActionListener(n); nine.addActionListener(n); eight.addActionListener(n);
		seven.addActionListener(n); six.addActionListener(n); five.addActionListener(n);
		four.addActionListener(n); three.addActionListener(n); two.addActionListener(n);
		one.addActionListener(n);  
		  
		decimal.addActionListener(n); 
		delete.addActionListener(n);
		add.addActionListener(c); sub.addActionListener(c); multiply.addActionListener(c);
		div.addActionListener(c); equal.addActionListener(c); reset.addActionListener(c); 
		
		
		contentPanel= new JPanel();
		contentPanel.setBackground(Color.blue);
		contentPanel.setLayout(new FlowLayout());
		
		contentPanel.add(answerfield, BorderLayout.NORTH);
		contentPanel.add(b1); contentPanel.add(reset); contentPanel.add(b3);
		contentPanel.add(seven); contentPanel.add(eight); contentPanel.add(nine);
		contentPanel.add(b7);
		contentPanel.add(add); contentPanel.add(sub); contentPanel.add(b4);
		contentPanel.add(four); contentPanel.add(five); contentPanel.add(six);
		contentPanel.add(b8);
		contentPanel.add(multiply); contentPanel.add(div); contentPanel.add(b5); 
		contentPanel.add(one); contentPanel.add(two); contentPanel.add(three);
		contentPanel.add(b10);
		contentPanel.add(b2); contentPanel.add(b6); contentPanel.add(zero); 
		contentPanel.add(decimal);  contentPanel.add(b9); 
		contentPanel.add(delete); contentPanel.add(equal); 
		
		
		
		this.setContentPane(contentPanel);
	}
	
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JButton src= (JButton) event.getSource();
			
			if(src.equals(one)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "1";
					}else {
						stemp1= stemp1 + "1";
					}
				}else {
					if(stemp2==null) {
						stemp2= "1";
					}else {
						stemp2= stemp2 + "1";
					}
				}
			}
			
			if(src.equals(two)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "2";
					}else {
						stemp1= stemp1 + "2";
					}
				}else {
					if(stemp2==null) {
						stemp2= "2";
					}else {
						stemp2= stemp2 + "2";
					}
				}
			}
			
			if(src.equals(three)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "3";
					}else {
						stemp1= stemp1 + "3";
					}
				}else {
					if(stemp2==null) {
						stemp2= "3";
					}else {
						stemp2= stemp2 + "3";
					}
				}
			}
			
			if(src.equals(four)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "4";
					}else {
						stemp1= stemp1 + "4";
					}
				}else {
					if(stemp2==null) {
						stemp2= "4";
					}else {
						stemp2= stemp2 + "4";
					}
				}
			}
			
			if(src.equals(five)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "5";
					}else {
						stemp1= stemp1 + "5";
					}
				}else {
					if(stemp2==null) {
						stemp2= "5";
					}else {
						stemp2= stemp2 + "5";
					}
				}
			}
			
			if(src.equals(six)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "6";
					}else {
						stemp1= stemp1 + "6";
					}
				}else {
					if(stemp2==null) {
						stemp2= "6";
					}else {
						stemp2= stemp2 + "6";
					}
				}
			}
			
			if(src.equals(seven)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "7";
					}else {
						stemp1= stemp1 + "7";
					}
				}else {
					if(stemp2==null) {
						stemp2= "7";
					}else {
						stemp2= stemp2 + "7";
					}
				}
			}
			
			if(src.equals(eight)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "8";
					}else {
						stemp1= stemp1 + "8";
					}
				}else {
					if(stemp2==null) {
						stemp2= "8";
					}else {
						stemp2= stemp2 + "8";
					}
				}
			}
			
			if(src.equals(nine)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "9";
					}else {
						stemp1= stemp1 + "9";
					}
				}else {
					if(stemp2==null) {
						stemp2= "9";
					}else {
						stemp2= stemp2 + "9";
					}
				}
			}
			
			if(src.equals(zero)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "0";
					}else {
						stemp1= stemp1 + "0";
					}
				}else {
					if(stemp2==null) {
						stemp2= "0";
					}else {
						stemp2= stemp2 + "0";
					}
				}
			}
			
			if(src.equals(decimal)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1= "0.";
					}else 
						if(stemp1 != null) {
							if(stemp1.contains(".")) {
								System.out.println("There is already a decimal");
							}else {
								stemp1 += ".";
							}
						
					}
				}else {
					if(stemp2==null) {
						stemp2= "0.";
					}else 
						if(stemp2 != null) {
							if(stemp2.contains(".")) {
								System.out.println("There is already a decimal");
							}else {
								stemp2 += ".";
							}
					}
				}
			}
			
			if(src.equals(delete)) {
				if(opChosen==false) {
					if(stemp1==null) {
						System.out.println("No number");
					}else {
						stemp1= stemp1.substring(0, stemp1.length()-1);
					}
				}else {
					if(stemp2== null) {
						System.out.println("No number");
					}else {
						stemp2= stemp2.substring(0, stemp2.length()-1);
					}
				}
			}
			
			if(equalsClicked==false) {
				if(opChosen==false) {
					answerfield.setText(stemp1);
				}else {
					answerfield.setText(stemp2);
				}
			}
		}
	}
	
	private class Calc implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JButton src= (JButton) event.getSource();
			
			if(src.equals(add)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						opChosen= true;
						operation= '+';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Only two operations can be done at a time");
						}
			}
			
			if(src.equals(sub)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						opChosen= true;
						operation= '-';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Only two operations can be done at a time");
						}
			}
			
			if(src.equals(multiply)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						opChosen= true;
						operation= '*';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Only two operations can be done at a time");
						}
			}
			
			if(src.equals(div)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						opChosen= true;
						operation= '/';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Only two operations can be done at a time");
						}
			}
			
			if(src.equals(equal)) {
				if(stemp1==null) {
					System.out.println("_");
				}else
					if(stemp1 !=null && stemp2==null) {
						System.out.println("Input numbers first");
					}
				
				if(stemp1 != null && stemp2 != null) {
					double d1= 0.0, d2= 0.0;
					
					d1= Double.parseDouble(stemp1);
					d2= Double.parseDouble(stemp2);
					
					switch(operation) {
					case '+':
						answer= d1 + d2;
						break;
					case'-':
						answer= d1 - d2;
						break;
					case '*':
						answer= d1 * d2;
						break;
					case '/':
						answer= d1 / d2;
						break;
					}
					
					sanswer= Double.toString(answer);
					answerfield.setText(sanswer);
					if(operation== '/' && d2 == 0.0) {
						answerfield.setText("Cannot divide by zero");
					}
				}
			}
			
			if(src.equals(reset)) {
				stemp1= null; stemp2= null;
				equalsClicked= false;
				opChosen= false;
				operation= ' ';
				answerfield.setText(null);
				sanswer= null;
			}
			
		}
	}
}


