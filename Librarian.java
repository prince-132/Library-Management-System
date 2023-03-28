import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Librarian extends Frame implements ActionListener
{
	Label l1 = new Label("                Welcome Librarian");
      Label l2 = new Label("Name");
      Label l3 = new Label("Password");
      Button b1 = new Button("Login");
      Button b2 = new Button("Cancel");
	TextField tf1 = new TextField();
      JPasswordField p = new JPasswordField();
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();

	Font f1 = new Font("Arial", Font.BOLD,25);
	Font f2 = new Font("Arial", Font.BOLD,20);

	Librarian()
	{
		super("Librarian Login Page");
            setVisible(true);
        	setLocation(500,300);
        	setSize(500,220);	

		b1.addActionListener(this);
        	b2.addActionListener(this);
		
		l1.setFont(f1);
		l2.setFont(f2);
		l3.setFont(f2);
		b1.setFont(f2);
		b2.setFont(f2);
		tf1.setFont(f2);
		p.setFont(f2);

		p1.setLayout(new GridLayout(2,2,10,10)); //no.of row, col,space b/w row, col
        	p1.add(l2);
        	p1.add(tf1);
        	p1.add(l3);
        	p1.add(p);

		p2.setLayout(new GridLayout(1,1,10,10)); //no.of row, col,space b/w row, col
            p2.add(l1);
		p2.setBackground(Color.BLUE);

		p3.setLayout(new GridLayout(1,2,10,10)); //no.of row, col,space b/w row, col
        	p3.add(b1);
		p3.add(b2);

		setLayout(new BorderLayout(10,10));
        	add(p2,"North");
        	add(p1,"Center");
		add(p3,"South");
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
	public static void main(String arf[])
	{
		new Librarian();
	} 
}