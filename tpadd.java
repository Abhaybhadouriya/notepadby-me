package sqlgui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextPane;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JTextArea;
import javax.swing.*;
import javax.swing.event.MenuKeyListener;
import javax.*;
import javafx.application.*;

public class tpadd implements ActionListener  {
	JPanel jp;
	JTextArea ta;
	public tpadd() {
		JFrame jf=new JFrame("TexnoPad by ABHAY");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(800,600);
		
		//jp=new JPanel();
		ta=new JTextArea();
		//jp.add(ta);
			JScrollPane jsp=new JScrollPane(ta);
			jf.add(jsp,BorderLayout.CENTER);
			
			jf.setVisible(true);
			JMenu jm=new JMenu("Menu");
			JMenuBar jmb=new JMenuBar();
			JMenuItem jmoi=new JMenuItem("Open");
			JMenuItem Jmsi=new JMenuItem("Save");
			JMenuItem Jmni=new JMenuItem("New");
			JMenuItem Jmci=new JMenuItem("Close");
			jm.add(jmoi);
			jm.add(Jmni);
			jm.add(Jmsi);
			jm.addSeparator();
			jm.add(Jmci);
			jmb.add(jm);
			
			JMenu jfm=new JMenu("Font");
			JMenuItem jfmi=new JMenuItem("Italic");
			JMenuItem jfmb=new JMenuItem("Bold");
			JMenuItem jfmp=new JMenuItem("Plain");
			JMenuItem jfmc=new JMenuItem("Color");
			jfm.add(jfmp);
			jfm.add(jfmb);
			jfm.add(jfmi);
			jfm.addSeparator();
			jfm.add(jfmc);
			jmb.add(jfm);
			
			JMenu jfs=new JMenu("Size");
			JMenuItem jfs20=new JMenuItem("20");
			JMenuItem jfs24=new JMenuItem("24");
			JMenuItem jfs28=new JMenuItem("28");
			JMenuItem jfs32=new JMenuItem("32");
			JMenuItem jfs36=new JMenuItem("36");
			JMenuItem jfs72=new JMenuItem("72");
			jfs.add(jfs20);
			jfs.addSeparator();
			jfs.add(jfs24);
			jfs.addSeparator();
			jfs.add(jfs28);
			jfs.addSeparator();
			jfs.add(jfs32);
			jfs.addSeparator();
			jfs.add(jfs36);
			jfs.addSeparator();
			jfs.add(jfs72);
			jmb.add(jfs);
			jf.setJMenuBar(jmb);
			
			jmoi.addActionListener(this);
			Jmsi.addActionListener(this);
			Jmni.addActionListener(this);
			Jmci.addActionListener(this);
			jfs20.addActionListener(this);
			jfs24.addActionListener(this);
			jfs28.addActionListener(this);
			jfs32.addActionListener(this);
			jfs36.addActionListener(this);
			jfs72.addActionListener(this);
			jfmi.addActionListener(this);
			jfmb.addActionListener(this);
			jfmp.addActionListener(this);
			jfmc.addActionListener(this);
					
	///	jf.setVisible(true);
	}
	JFileChooser fc=new JFileChooser();
	public void actionPerformed(ActionEvent ae)
	{
		String ms=ae.getActionCommand();
	    
		if(ms.equals("Open"))
		{
			//fc.showDialog(parent, "saf");	
			fc.showDialog(fc,"Open");
			String path=fc.getSelectedFile().getAbsolutePath();
			File file=new File(path);
			FileReader fr =null;
			try {
				fr=new FileReader(file);
			ta.read(fr, null);
			fr.close();
			}
			catch(Exception e)
			{}
		}
		else if(ms.equals("New"))
		{
			ta.setText(null);
		}
		else if(ms.equals("Save"))
		{
			fc.showDialog(fc,"Save");
			FileWriter fw=null;
			try {
				fw=new FileWriter(fc.getSelectedFile().getAbsolutePath());
				ta.write(fw);
				fw.close();
				
			}
			catch(Exception ex)
			{
				
			}
			
			
		}
		else if(ms.equals("Close"))
		{
			System.exit(0);
		}
		else if(ms.equals("Bold"))
		{
			ta.setFont(ta.getFont().deriveFont(Font.BOLD ,ta.getFont().getSize()));

		}
		else if(ms.equals("Plain"))
		{
			ta.setFont(ta.getFont().deriveFont(Font.PLAIN ,ta.getFont().getSize()));
			
		}
		else if(ms.equals("Color"))
		{
			
		}
		else if(ms.equals("Italic"))
		{
			ta.setFont(ta.getFont().deriveFont(Font.ITALIC ,ta.getFont().getSize()));

		}
		else if(ms.equals("20"))
		{
			Font ft=new Font("SansSerif",Font.PLAIN,20);	
			ta.setFont(ft);
		}
		else if(ms.equals("24"))
		{
            Font ft=new Font("SansSerif",Font.PLAIN,24);	
			ta.setFont(ft);	
		}
		else if(ms.equals("28"))
		{
            Font ft=new Font("SansSerif",Font.PLAIN,28);
			ta.setFont(ft);
			
		}
		else if(ms.equals("32"))
		{
            Font ft=new Font("SansSerif",Font.PLAIN,32);
			ta.setFont(ft);
			
		}
		else if(ms.equals("36"))
		{
            Font ft=new Font("SansSerif",Font.PLAIN,36);
			ta.setFont(ft);
			
		}
		else if(ms.equals("72"))
		{
            Font ft=new Font("SansSerif",Font.PLAIN,72);	
			ta.setFont(ft);
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
	SwingUtilities.invokeLater(
			new Runnable()
			{
		public void run() {
			new tpadd();
		};
			});		
	}

	
	
}
