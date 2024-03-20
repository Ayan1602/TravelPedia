package travel.management.system;
import javax.swing.*;
import java.awt.*;


public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    public void run(){
        try{
            for(int i=1;i<=101;i++){
                int max= bar.getMaximum();
                int value= bar.getValue();
                if(value<max){
                    bar.setValue(bar.getValue()+1);
                }else{
                    setVisible(false);
                }
                Thread.sleep(50);
            }
        } catch(Exception e){
            e.printStackTrace();            
        }
    }
    Loading() {
        t=new Thread(this);
        
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel text= new JLabel("TRAVELPEDIA");
        text.setBounds(50,20,600,40);
        text.setForeground(Color.DARK_GRAY);
        text.setFont(new Font("Tahoma",Font.BOLD,30));
        add(text);
        
        JProgressBar bar= new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel loading= new JLabel("LOADING...");
        loading.setBounds(260,140,150,30);
        loading.setForeground(Color.red);
        loading.setFont(new Font("Tahoma",Font.BOLD,16));
        add(loading);
        
        JLabel username= new JLabel(" WELCOME!");
        username.setBounds(20,310,400,40);
        username.setForeground(Color.red);
        username.setFont(new Font("Tahoma",Font.BOLD,20));
        add(username);
        
        t.start();
        
        setVisible(true);
    }
    public static void main(String[]args){
        new Loading();
    }
    
}
