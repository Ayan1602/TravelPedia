package travel.management.system;

import javax.swing.*;
import java.awt.*;
public class Dashboard extends JFrame {
    
    Dashboard(){
       // setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.ORANGE);
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2= i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading= new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.orange);
        p2.setBounds(0,65,300,900);
        add(p2);
        
        JButton addpersonalDetails=new JButton("Add Personal Details");
        addpersonalDetails.setBackground(Color.ORANGE);
        addpersonalDetails.setForeground(Color.black);
        addpersonalDetails.setBounds(0,0,300,40);
        addpersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addpersonalDetails.setMargin(new Insets(0,0,0,60));
        p2.add(addpersonalDetails);
        
        JButton updatepersonalDetails=new JButton("Update Personal Details");
        updatepersonalDetails.setBackground(Color.ORANGE);
        updatepersonalDetails.setForeground(Color.black);
        updatepersonalDetails.setBounds(0,40,300,40);
        updatepersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatepersonalDetails.setMargin(new Insets(0,0,0,30));
        p2.add(updatepersonalDetails);
        
        JButton viewpersonalDetails=new JButton("View Details");
        viewpersonalDetails.setBounds(0,80,300,40);
        viewpersonalDetails.setBackground(Color.ORANGE);
        viewpersonalDetails.setForeground(Color.black);
        viewpersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpersonalDetails.setMargin(new Insets(0,0,0,130));
        p2.add(viewpersonalDetails);
        
        JButton deletepersonalDetails=new JButton("Delete Personal Details");
        deletepersonalDetails.setBounds(0,120,300,40);
        deletepersonalDetails.setBackground(Color.ORANGE);
        deletepersonalDetails.setForeground(Color.black);
        deletepersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletepersonalDetails.setMargin(new Insets(0,0,0,40));
        p2.add(deletepersonalDetails);
        
        JButton checkPackages=new JButton("Check Package");
        checkPackages.setBounds(0,160,300,40);
        checkPackages.setBackground(Color.ORANGE);
        checkPackages.setForeground(Color.black);
        checkPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkPackages.setMargin(new Insets(0,0,0,110));
        p2.add(checkPackages);
        
        JButton bookPackage=new JButton("Book Package");
        bookPackage.setBounds(0,200,300,40);
        bookPackage.setBackground(Color.ORANGE);
        bookPackage.setForeground(Color.black);
        bookPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookPackage.setMargin(new Insets(0,0,0,120));
        p2.add(bookPackage);
        
        JButton viewPackage=new JButton("View Package");
        viewPackage.setBounds(0,240,300,40);
        viewPackage.setBackground(Color.ORANGE);
        viewPackage.setForeground(Color.black);
        viewPackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPackage.setMargin(new Insets(0,0,0,120));
        p2.add(viewPackage);
        
        JButton viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0,280,300,40);
        viewhotels.setBackground(Color.ORANGE);
        viewhotels.setForeground(Color.black);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        p2.add(viewhotels);
        
        JButton bookhotel=new JButton("Book Hotel");
        bookhotel.setBounds(0,320,300,40);
        bookhotel.setBackground(Color.ORANGE);
        bookhotel.setForeground(Color.black);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        p2.add(bookhotel);
        
        JButton viewBookedHotel=new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0,360,300,40);
        viewBookedHotel.setBackground(Color.ORANGE);
        viewBookedHotel.setForeground(Color.black);
        viewBookedHotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewBookedHotel.setMargin(new Insets(0,0,0,70));
        p2.add(viewBookedHotel);
        
        JButton destinations=new JButton("Destinations");
        destinations.setBounds(0,400,300,40);
        destinations.setBackground(Color.ORANGE);
        destinations.setForeground(Color.black);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,125));
        p2.add(destinations);
        
        JButton payments=new JButton("Payments");
        payments.setBounds(0,440,300,40);
        payments.setBackground(Color.ORANGE);
        payments.setForeground(Color.black);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,155));
        p2.add(payments);
        
        JButton calculator=new JButton("Calculator");
        calculator.setBounds(0,480,300,40);
        calculator.setBackground(Color.ORANGE);
        calculator.setForeground(Color.black);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,145));
        p2.add(calculator);
        
        JButton notepad=new JButton("Notepad");
        notepad.setBounds(0,520,300,40);
        notepad.setBackground(Color.ORANGE);
        notepad.setForeground(Color.black);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        p2.add(viewBookedHotel);
        
        JButton about=new JButton("About");
        about.setBounds(0,520,300,40);
        about.setBackground(Color.ORANGE);
        about.setForeground(Color.black);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        p2.add(about);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/beachpic.jpg"));
        Image i5= i4.getImage().getScaledInstance(1200, 900, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image= new JLabel(i6);
        image.setBounds(0,0,1500,850);
        add(image);
        
        JLabel text = new JLabel("TravelPedia");
        text.setBounds(645, 70, 1200, 70);
        text.setForeground(Color.black);
        text.setFont(new Font("Tahoma",Font.PLAIN,40));
        image.add(text);
        
        setVisible(true);
    }
    public static void main(String[] agrs){
        new Dashboard();
    }
}

