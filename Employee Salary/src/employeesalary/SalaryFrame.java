package employeesalary;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

import javax.swing.*;
public class SalaryFrame extends JFrame {




	JFrame frame = new JFrame();
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();


	//PANEL 1 
	
	JLabel title1 = new JLabel();
	
	
	JLabel txt1 = new JLabel();
	JLabel txt2 = new JLabel();
	JLabel txt3 = new JLabel();
	JLabel txt4 = new JLabel();
	JLabel txt5 = new JLabel();
	JLabel txt6 = new JLabel();
	JLabel txt7 = new JLabel();
	JLabel txt8 = new JLabel();


	JTextField txtb1 = new JTextField();
	JTextField txtb2 = new JTextField();
	JTextField txtb3 = new JTextField();
	JTextField txtb4 = new JTextField();
	JTextField txtb5 = new JTextField();
	JTextField txtb6 = new JTextField();
	JTextField txtb7 = new JTextField();
	JTextField txtb8 = new JTextField();
	
	JButton btn = new JButton();

	//PANEL 2
	
	JLabel title = new JLabel();
	
	JLabel ei1 = new JLabel();
	JLabel ei2 = new JLabel();
	JLabel ei3 = new JLabel();
	JLabel ei4 = new JLabel();
	JLabel ei5 = new JLabel();
	JLabel ei6 = new JLabel();
	JLabel ei7 = new JLabel();
	JLabel ei8 = new JLabel();

	
	JLabel en = new JLabel();
	JLabel eid = new JLabel();
	JLabel ej = new JLabel();
	JLabel ep = new JLabel();
	JLabel eh = new JLabel();
	JLabel erp = new JLabel();
	JLabel eoh = new JLabel();
	JLabel eor = new JLabel();




	//PANEL 3

	
	
	JLabel grossal = new JLabel();
	JLabel sss = new JLabel();
	JLabel pi = new JLabel();
	JLabel ph = new JLabel();
	JLabel it = new JLabel();
	JLabel np = new JLabel();
	
	JLabel line = new JLabel();
	
	JLabel grossal2 = new JLabel();
	JLabel sss2 = new JLabel();
	JLabel pi2 = new JLabel();
	JLabel ph2 = new JLabel();
	JLabel it2 = new JLabel();
	JLabel np2 = new JLabel();
	
	

	

	
	SalaryFrame(){
		
		
		
		Image Iconimage = new ImageIcon("calculate-salary.png").getImage();		
		this.setIconImage(Iconimage);
		//Panel 1
		
		panel1.setBounds(10,15,500,735);
		panel1.setBackground(Color.decode("#709775"));
		panel1.setLayout(null);
		
		
		panel1.add(title1);

		
		panel1.add(txt1);
		panel1.add(txt2);
		panel1.add(txt3);
		panel1.add(txt4);
		panel1.add(txt5);
		panel1.add(txt6);
		panel1.add(txt7);
		panel1.add(txt8);
		
		panel1.add(txtb1);
		panel1.add(txtb2);
		panel1.add(txtb3);
		panel1.add(txtb4);
		panel1.add(txtb5);
		panel1.add(txtb6);
		panel1.add(txtb7);
		panel1.add(txtb8);

		panel1.add(btn);

		//Panel 2

		panel2.setBounds(520,15,455,500);
		panel2.setBackground(Color.decode("#f9f9f9"));
		panel2.setLayout(null);
		
		
		panel2.add(title);
		
		
		
		panel2.add(ei1);
		panel2.add(ei2);
		panel2.add(ei3);
		panel2.add(ei4);
		panel2.add(ei5);
		panel2.add(ei6);
		panel2.add(ei7);
		panel2.add(ei8);
		
		panel2.add(en);
		panel2.add(eid);
		panel2.add(ej);
		panel2.add(ep);
		panel2.add(eh);
		panel2.add(erp);
		panel2.add(eoh);
		panel2.add(eor);


		//Panel 3
		
		panel3.setBounds(520,520,455,230);
		panel3.setBackground(Color.decode("#fefae0"));
		panel3.setLayout(null);

		panel3.add(grossal);
		panel3.add(sss);
		panel3.add(pi);
		panel3.add(ph);
		panel3.add(it);
		panel3.add(np);
		
		panel3.add(line);

		panel3.add(grossal2);
		panel3.add(sss2);
		panel3.add(pi2);
		panel3.add(ph2);
		panel3.add(it2);
		panel3.add(np2);

		
/////////////////////-----> Labels In Panel 1 <----/////////////////////////////////////////////
		
		
//////---> Salary Payroll
		
		title1.setText("Salary Payroll");
		title1.setFont(new Font("Times New Roman" , Font.BOLD, 50));
		title1.setBounds(1,0,500,100);
		title1.setForeground(Color.decode("#415d43"));
		title1.setOpaque(true);
		title1.setHorizontalAlignment(JLabel.CENTER);
		title1.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));

		
		
		
		
///////---> Employee Name		
		txt1.setText("Employee Name:");
		txt1.setBounds(15,110,280,100);
		txt1.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txt1.setForeground(Color.decode("#fbfbf2"));
		
///////---> Employee ID NO.
		txt2.setText("Employee ID No.:");
		txt2.setBounds(15,150,300,100);
		txt2.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txt2.setForeground(Color.decode("#fbfbf2"));

		
///////---> Employee Job		
		txt3.setText("Job:");
		txt3.setBounds(15,195,300,100);
		txt3.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txt3.setForeground(Color.decode("#fbfbf2"));

			
///////---> Employee Position
		txt4.setText("Postion:");
		txt4.setBounds(15,240,300,100);
		txt4.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txt4.setForeground(Color.decode("#fbfbf2"));

			
///////---> Employee Hour/s Accumulated		
		txt5.setText("Hour/s Accumulated:");
		txt5.setBounds(15,285,300,100);
		txt5.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txt5.setForeground(Color.decode("#fbfbf2"));

					
///////---> Employee Rate Per Hour
		txt6.setText("Rate Per Hour:");
		txt6.setBounds(15,330,300,100);
		txt6.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txt6.setForeground(Color.decode("#fbfbf2"));


///////---> Employee Overtime Hour/s		
		txt7.setText("Overtime Hour/s:");
		txt7.setBounds(15,375,300,100);
		txt7.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txt7.setForeground(Color.decode("#fbfbf2"));

					
///////---> Employee OT Rate
		txt8.setText("OT Rate:");
		txt8.setBounds(15,420,300,100);
		txt8.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txt8.setForeground(Color.decode("#fbfbf2"));

					
/////////////////////-----> TextField In Panel 1 <----/////////////////////////////////////////////
		
		
///////---> Employee Name TextField		
		txtb1.setBounds(205,130,285,40);
		txtb1.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txtb1.setForeground(Color.decode("#415d43"));
	    txtb1.setBorder(null);
	    
	    

///////---> Employee ID NO. TextField
	    
		txtb2.setBounds(205,175,285,40);
		txtb2.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txtb2.setForeground(Color.decode("#415d43"));
		txtb2.setBorder(null);



///////---> Employee Job TextField		
		txtb3.setBounds(80,220,410,40);
		txtb3.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txtb3.setForeground(Color.decode("#415d43"));
		txtb3.setBorder(null);



///////---> Employee Position TextField
		txtb4.setBounds(110,265,380,40);
		txtb4.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txtb4.setForeground(Color.decode("#415d43"));
		txtb4.setBorder(null);



///////---> Employee Hour/s Accumulated	TextField	 
		txtb5.setBounds(240,310,250,40);
		txtb5.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txtb5.setForeground(Color.decode("#415d43"));
		txtb5.setBorder(null);


		
///////---> Employee Rate Per Hour TextField
		txtb6.setBounds(180,355,310,40);
		txtb6.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txtb6.setForeground(Color.decode("#415d43"));
		txtb6.setBorder(null);



///////---> Employee Overtime Hour/s TextField		
		txtb7.setBounds(200,400,290,40);
		txtb7.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txtb7.setForeground(Color.decode("#415d43"));
		txtb7.setBorder(null);


		
///////---> Employee OT Rate TextField
		txtb8.setBounds(150,445,340,40);
		txtb8.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		txtb8.setForeground(Color.decode("#415d43"));
		txtb8.setBorder(null);

		
/////////////////////-----> Button In Panel 1 <----/////////////////////////////////////////////
			
		btn.setBounds(280,535,200,100);
		btn.setText("CALCULATE");
		btn.setFocusable(false);;
		btn.setFont(new Font("Times New Roman", Font.BOLD ,25 ));
		btn.setForeground(Color.decode("#415d43"));
		btn.setBackground(Color.decode("#fbfbf2"));
		btn.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			String name = txtb1.getText();
			String id = txtb2.getText();
			String job = txtb3.getText();
			String pos = txtb4.getText();
			String acc = txtb5.getText();
			String rph = txtb6.getText();
			String oth = txtb7.getText();
			String otr = txtb8.getText();

			en.setText(name);
			eid.setText(id);
			ej.setText(job);
			ep.setText(pos);
			eh.setText(acc);
			erp.setText(  "₱ " + rph);
			eoh.setText(oth);
			eor.setText(  "₱ " + otr);

			
			DecimalFormat decimalFormat = new DecimalFormat("0.00");
			
			double hourp = Double.parseDouble(txtb5.getText());
			double rateph = Double.parseDouble(txtb6.getText());
			double othour = Double.parseDouble(txtb7.getText());
			double otrate = Double.parseDouble(txtb8.getText());
				
				
		/////-------> Computation for Gross Salary
				
			double perhour = hourp * rateph;
			double ratehour = othour * otrate;
			
			double grosspay = perhour + ratehour;
			
			

			String gross_salary = String.valueOf(grosspay);
			
			grossal2.setText("₱ " + decimalFormat.format(grosspay) );
			
			
		/////-------> Computation for SSS Contribution
			
			double gp2 = perhour + ratehour;
			
			double sssc = gp2 * 0.045;
			
			
			String SSScontribution = String.valueOf(sssc);
			
			sss2.setText("₱ " + decimalFormat.format(sssc));
			
			
		/////-------> Computation for Pag-ibig Contribution
			
			
			double gp3 = perhour + ratehour;
			
			double pic = gp3 * 0.02;
			
			
			String picontribution = String.valueOf(pic);
			
			pi2.setText("₱ " + decimalFormat.format(pic));
			
		/////-------> Computation for Phil-Health Contribution
			
			
			double gp4 = perhour + ratehour;
			
			double phc = gp4 * 0.05;
			
			
			String phccontribution = String.valueOf(phc);
			
			ph2.setText("₱ " + decimalFormat.format(phc));
			
		/////-------> Computation for Income Tax
			
			
			double intax = sssc + pic + phc ;
			
			String IncomeT = String.valueOf(intax);
			
			it2.setText( "₱ " + decimalFormat.format(intax));
			
		/////-------> Computation for Net Pay
			
			
			double npay = grosspay - intax;
			
			String netp = String.valueOf(npay);
			
			np2.setText( "₱ " + decimalFormat.format(npay));
			
			}
		});
		
		
		
	
/////////////////////-----> Label 1 In Panel 2 <----/////////////////////////////////////////////

		
	///////-----> EMPLOYEE INFO
		
		title.setText("Employee Info.");
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBounds(4,10,446,80);
		title.setFont(new Font("Times New Roman" , Font.BOLD , 50));
		title.setOpaque(true);
		title.setForeground(Color.decode("#fbfbf2"));
		title.setBackground(Color.decode("#709775"));
		
		
		
		
		
		

	///////---> Employee Info Name
		
		ei1.setText("Name: ");
		ei1.setBounds(20,80,200,100);
		ei1.setFont(new Font("Times New Roman", Font.BOLD,25));
		ei1.setForeground(Color.decode("#344e41"));
		
	///////---> Employee Info ID
		
		ei2.setText("ID No.: ");
		ei2.setBounds(20,120,200,100);
		ei2.setFont(new Font("Times New Roman", Font.BOLD,25));
		ei2.setForeground(Color.decode("#344e41"));
		
	///////---> Employee Info Job	
		
		ei3.setText("Job: ");
		ei3.setBounds(20,160,200,100);
		ei3.setFont(new Font("Times New Roman", Font.BOLD,25));
		ei3.setForeground(Color.decode("#344e41"));
		
	///////---> Employee Info Position	
		
		ei4.setText("Position: ");
		ei4.setBounds(20,200,200,100);
		ei4.setFont(new Font("Times New Roman", Font.BOLD,25));
		ei4.setForeground(Color.decode("#344e41"));
		
		
	///////---> Employee Info Hour's Accumulated	
		
		ei5.setText("Hour/s Accumulated: ");
		ei5.setBounds(20,240,250,100);
		ei5.setFont(new Font("Times New Roman", Font.BOLD,25));
		ei5.setForeground(Color.decode("#344e41"));
		
		
	///////---> Employee Info Rate per Hour
		
		ei6.setText("Rate per Hour: ");
		ei6.setBounds(20,280,200,100);
		ei6.setFont(new Font("Times New Roman", Font.BOLD,25));
		ei6.setForeground(Color.decode("#344e41"));
		
		
	///////---> Employee Info OT hour/s
		
		ei7.setText("OT Hour/s: ");
		ei7.setBounds(20,320,200,100);
		ei7.setFont(new Font("Times New Roman", Font.BOLD,25));
		ei7.setForeground(Color.decode("#344e41"));
		
		
	///////---> Employee Info OT Rate		
		
		ei8.setText("OT Rate: ");
		ei8.setBounds(20,360,200,100);
		ei8.setFont(new Font("Times New Roman", Font.BOLD,25));
		ei8.setForeground(Color.decode("#344e41"));

		
		
/////////////////////-----> Label 2 In Panel 2 <----/////////////////////////////////////////////

		
	///////---> Employee Info Name 2
		
		en.setBounds(100,80,450,100);
		en.setFont(new Font("Times New Roman", Font.BOLD,25));
		en.setForeground(Color.decode("#415d43"));
		
	///////---> Employee Info ID 2
		
		eid.setBounds(110,120,450,100);
		eid.setFont(new Font("Times New Roman", Font.BOLD,25));
		eid.setForeground(Color.decode("#415d43"));
		
	///////---> Employee Info Job	 2
		
		ej.setBounds(80,160,450,100);
		ej.setFont(new Font("Times New Roman", Font.BOLD,25));
		ej.setForeground(Color.decode("#415d43"));
		
	///////---> Employee Info Position	2
		
		ep.setBounds(130,200,450,100);
		ep.setFont(new Font("Times New Roman", Font.BOLD,25));
		ep.setForeground(Color.decode("#415d43"));
		
		
	///////---> Employee Info Hour's Accumulated	2
		
		eh.setBounds(250,240,450,100);
		eh.setFont(new Font("Times New Roman", Font.BOLD,25));
		eh.setForeground(Color.decode("#415d43"));
		
		
	///////---> Employee Info Rate per Hour 2
		
		erp.setBounds(190,280,450,100);
		erp.setFont(new Font("Times New Roman", Font.BOLD,25));
		erp.setForeground(Color.decode("#415d43"));
		
		
	///////---> Employee Info OT hour/s 2
		
		eoh.setBounds(150,320,450,100);
		eoh.setFont(new Font("Times New Roman", Font.BOLD,25));
		eoh.setForeground(Color.decode("#415d43"));
		
		
	///////---> Employee Info OT Rate	2	
		
		eor.setBounds(130,360,450,100);
		eor.setFont(new Font("Times New Roman", Font.BOLD,25));
		eor.setForeground(Color.decode("#415d43"));


/////////////////////-----> Label 1 In Panel 3 <----/////////////////////////////////////////////

/////////////----> Gross Salary
		
		grossal.setText("Gross Salary:");
		grossal.setBounds(5,5,150,50);
		grossal.setFont(new Font("Times New Roman" , Font.BOLD,25));
		grossal.setForeground(Color.decode("#344e41"));


/////////////----> SSS Contribution
		
		sss.setText("SSS Contribution:");
		sss.setBounds(5,35,300,50);
		sss.setFont(new Font("Times New Roman" , Font.BOLD,25));
		sss.setForeground(Color.decode("#344e41"));
		
/////////////----> Pag-ibig Contribution
		
		ph.setText("Pag-Ibig Contribution:");
		ph.setBounds(5,65,300,50);
		ph.setFont(new Font("Times New Roman" , Font.BOLD,25));
		ph.setForeground(Color.decode("#344e41"));
		

/////////////----> Phil-Health Contribution
		
		pi.setText("Phil-Health Contribution:");
		pi.setBounds(5,95,300,50);
		pi.setFont(new Font("Times New Roman" , Font.BOLD,25));
		pi.setForeground(Color.decode("#344e41"));
		

		
/////////////----> Income Tax
		
		it.setText("Income Tax:");
		it.setBounds(5,125,300,50);
		it.setFont(new Font("Times New Roman" , Font.BOLD,25));
		it.setForeground(Color.decode("#344e41"));
		

		
/////////////----> Net Pay
		
		np.setText("Net Pay:");
		np.setBounds(5,180,300,50);
		np.setFont(new Font("Times New Roman" , Font.BOLD,25));
		np.setForeground(Color.decode("#344e41"));
		
		
//////////////------------------> LINE TOH PARR <-------------------/////////////////////////////////
		
		
		
		line.setText("--------------------------------------------------------");
		
		line.setBounds(5,150,500,50);
		line.setFont(new Font("Times New Roman" , Font.BOLD,25));
		line.setForeground(Color.decode("#344e41"));
		
		
		
/////////////////////-----> Label 1 In Panel 3 <----/////////////////////////////////////////////

		
		
		
		

/////////////----> Gross Salary 2
		
	grossal2.setBounds(150,5,150,50);
	grossal2.setFont(new Font("Times New Roman" , Font.BOLD,25));
	grossal2.setForeground(Color.decode("#344e41"));


/////////////----> SSS Contribution 2
	
	sss2.setBounds(200,35,300,50);
	sss2.setFont(new Font("Times New Roman" , Font.BOLD,25));
	sss2.setForeground(Color.decode("#344e41"));
	
/////////////----> Pag-ibig Contribution 2
	
	ph2.setBounds(250,65,300,50);
	ph2.setFont(new Font("Times New Roman" , Font.BOLD,25));
	ph2.setForeground(Color.decode("#344e41"));
	

/////////////----> Phil-Health Contribution 2
	
	pi2.setBounds(280,95,300,50);
	pi2.setFont(new Font("Times New Roman" , Font.BOLD,25));
	pi2.setForeground(Color.decode("#344e41"));
	

	
/////////////----> Income Tax 2
	
	it2.setBounds(150,125,300,50);
	it2.setFont(new Font("Times New Roman" , Font.BOLD,25));
	it2.setForeground(Color.decode("#344e41"));
	

	
/////////////----> Net Pay 2
	
	np2.setBounds(105,180,300,50);
	np2.setFont(new Font("Times New Roman" , Font.BOLD,25));
	np2.setForeground(Color.decode("#344e41"));
	
	
		
		
/////////////////////-----> FRAME  <----/////////////////////////////////////////////

		
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.setTitle("Salary Payroll Calculator");
		
		
		this.setSize(1000,800);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.decode("#415d43"));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
