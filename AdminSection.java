import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class AdminSection extends Frame implements ActionListener
{
    JLabel l1 = new JLabel();
    Button b1 = new Button();
    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Font f1 = new Font("Arial", Font.BOLD,25);
    Font f2 = new Font("Arial", Font.BOLD,20);
    
    AdminSection()
    {
        super("Admin Login Page");
        setLocation(450,400);
        setSize(500,200);
        
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource(""));
        Image img=ic.getImage().getScaledInstance(1500,800,Image.SCALE_DEFAULT);
        ImageIcon ic1=new ImageIcon(img);
        l1=new JLabel(ic1);
        
        JMenuBar m1= new JMenuBar();
        JMenu men1 = new JMenu("Add Info");
        JMenuItem ment1=new JMenuItem("Add Librarian");
        
        JMenu men2 = new JMenu("View Info");
        JMenuItem ment2=new JMenuItem("View Librarian");
        
        JMenu men3 = new JMenu("Delete Info");
        JMenuItem ment3=new JMenuItem("Delete Librarian");
        
        JMenu men4 = new JMenu("Exit");
        JMenuItem ment4=new JMenuItem("Logout");
        
        men1.add(ment1);
        men1.add(ment2);
        men1.add(ment3);
        men1.add(ment4);
        
        m1.add(men1);
        m1.add(men2);
        m1.add(men3);
        m1.add(men4);
        
        men1.setFont(f1);
        men2.setFont(f1);
        men3.setFont(f1);
        men4.setFont(f1);
        
        ment1.setFont(f2);
        ment2.setFont(f2);
        ment3.setFont(f2);
        ment4.setFont(f2);
        
        ment1.addActionListener(this);
        ment2.addActionListener(this);
        ment3.addActionListener(this);
        ment4.addActionListener(this);
        
        //setJMenuBar(m1);
        add(l1);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String comnd=e.getActionCommand();
        if(comnd.equals("Add Librarian"))
        {
		System.out.println("Add");
            //new AddLibrarian().setVisible(true);
        }
        else if(comnd.equals("View Librarian"))
        {
		System.out.println("View");
            //new ViewLibrarian().setVisible(true);
        }
        else if(comnd.equals("Delete Librarian"))
        {
		System.out.println("Delete");
            //new DeleteLibrarian().setVisible(true);
        }
        else if(comnd.equals("Logout"))
        {
            System.exit(0);
        }
    }
    
    public static void main(String arg[])
    {
        new AdminSection().setVisible(true);
    }
}
