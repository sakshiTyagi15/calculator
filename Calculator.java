
package calculator;
import java.awt.*;
import java.awt.event.*;

public class Calculator  extends WindowAdapter implements ActionListener
{ 
      Frame f;
      Label l;
       Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b14,b15,b16,b17,b18,b19;
       Button bc,b11,b12,b13;
       double num1,num2,check,x;
    Calculator()
    {
        f=new Frame();
         f.setVisible(true);
        f.setLayout(null);
          f.addWindowListener(this);
          Font fo=new Font("arial",Font.BOLD,15);
                  f.setFont(fo);
       
        f.setSize(500,500);
        f.setTitle("CALCULATOR");
        f.setBackground(Color.black);
        l=new Label();
        l.setBounds(50,50,400,20);
         l.setForeground(Color.white);
        f.add(l);
        
        bc=new Button("C");
        bc.setBounds(50,100,50,30);

        bc.setForeground(Color.cyan);
        bc.setBackground(Color.black);
        bc.addActionListener(this);
        f.add(bc);
         
        b11=new Button("%");
        b11.setBounds(130,100,50,30);
            b11.setForeground(Color.cyan);
        b11.setBackground(Color.black);
        b11.addActionListener(this);
        f.add(b11);
        
        b12=new Button("back");
        b12.setBounds(200,100,50,30);
            b12.setForeground(Color.cyan);
        b12.setBackground(Color.black);
        b12.addActionListener(this);
        f.add(b12);
        
        
        b13=new Button("/");
        b13.setBounds(270,100,50,30);
            b13.setForeground(Color.cyan);
        b13.setBackground(Color.black);
        b13.addActionListener(this);
        f.add(b13);
        
        b7=new Button("7");
        b7.setBounds(50,150,50,30);
            b7.setForeground(Color.white);
        b7.setBackground(Color.black);
        b7.addActionListener(this);
        f.add(b7);
        
        b8=new Button("8");
        b8.setBounds(130,150,50,30);
            b8.setForeground(Color.white);
        b8.setBackground(Color.black);
        b8.addActionListener(this);
        f.add(b8);
        
        b9=new Button("9");
        b9.setBounds(200,150,50,30);
            b9.setForeground(Color.white);
        b9.setBackground(Color.black);
        b9.addActionListener(this);
        f.add(b9);
        
        b14=new Button("X");
        b14.setBounds(270,150,50,30);
            b14.setForeground(Color.cyan);
        b14.setBackground(Color.black);
        b14.addActionListener(this);
        f.add(b14);
        
        b4=new Button("4");
        b4.setBounds(50,200,50,30);
            b4.setForeground(Color.white);
        b4.setBackground(Color.black);
        b4.addActionListener(this);
        f.add(b4);
        
        b5=new Button("5");
        b5.setBounds(130,200,50,30);
            b5.setForeground(Color.white);
        b5.setBackground(Color.black);
        b5.addActionListener(this);
        f.add(b5);
        
        b6=new Button("6");
        b6.setBounds(200,200,50,30);
            b6.setForeground(Color.white);
        b6.setBackground(Color.black);
        b6.addActionListener(this);
        f.add(b6);
        
        b15=new Button("-");
        b15.setBounds(270,200,50,30);
            b15.setForeground(Color.cyan);
        b15.setBackground(Color.black);
        b15.addActionListener(this);
        f.add(b15);
                
         
        b1=new Button("1");
        b1.setBounds(50,250,50,30);
            b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.addActionListener(this);
        f.add(b1);
                
        b2=new Button("2");
        b2.setBounds(130,250,50,30);
            b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.addActionListener(this);
        f.add(b2);
                
        b3=new Button("3");
        b3.setBounds(200,250,50,30);
            b3.setForeground(Color.white);
        b3.setBackground(Color.black);
        b3.addActionListener(this);
        f.add(b3);
               
        b16=new Button("+");
        b16.setBounds(270,250,50,30);
            b16.setForeground(Color.cyan);
        b16.setBackground(Color.black);
        b16.addActionListener(this);
        f.add(b16);
         
        b0=new Button("0");
        b0.setBounds(130,300,50,30);
            b0.setForeground(Color.white);
        b0.setBackground(Color.black);
        b0.addActionListener(this);
        f.add(b0);
         
        b18=new Button(".");
        b18.setBounds(200,300,50,30);
            b18.setForeground(Color.white);
        b18.setBackground(Color.black);
        b18.addActionListener(this);
        f.add(b18);
                
        b17=new Button("=");
        b17.setBounds(270,300,50,30);
            b17.setForeground(Color.cyan);
        b17.setBackground(Color.black);
        b17.addActionListener(this);
        f.add(b17);
         
        b19=new Button("-/+");
        b19.setBounds(50,300,50,30);
            b19.setForeground(Color.white);
        b19.setBackground(Color.black);
        b19.addActionListener(this);
        f.add(b19);  
        
    }
    public void actionPerformed(ActionEvent e)
    {
        String s,st;
        if(e.getSource()==b1)
        {
            st=l.getText();
            s=st+"1";
            l.setText(s);
            
        }
         if(e.getSource()==b2)
        {
            st=l.getText();
            s=st+"2";
            l.setText(s);
            
        } if(e.getSource()==b3)
        {
            st=l.getText();
            s=st+"3";
            l.setText(s);
            
        } if(e.getSource()==b4)
        {
            st=l.getText();
            s=st+"4";
            l.setText(s);
            
        } if(e.getSource()==b5)
        {
            st=l.getText();
            s=st+"5";
            l.setText(s);
            
        } if(e.getSource()==b6)
        {
            st=l.getText();
            s=st+"6";
            l.setText(s);
            
        } if(e.getSource()==b7)
        {
            st=l.getText();
            s=st+"7";
            l.setText(s);
            
        } if(e.getSource()==b8)
        {
            st=l.getText();
            s=st+"8";
            l.setText(s);
            
        } if(e.getSource()==b9)
        {
            st=l.getText();
            s=st+"9";
            l.setText(s);
            
        } if(e.getSource()==b0)
        {
            st=l.getText();
            s=st+"0";
            l.setText(s);
            
        } if(e.getSource()==b19)//for negative
        {
            st=l.getText();
            s="-"+st;
            l.setText(s);
            
        } if(e.getSource()==b18)
        {
            st=l.getText();
            s=st+".";
            l.setText(s);
            
        }
        
        if(e.getSource()==b12)//for Backspace
        { 
            st=l.getText();
           try
             {
               s=st.substring(0, st.length()-1);
            
             }
             catch(StringIndexOutOfBoundsException f)
             {
                     return;
             }
        l.setText(s);
        
        }
        if(e.getSource()==b16)//Add
        {
            try
            {
                num1=Double.parseDouble(l.getText());
                
            }
            catch(NumberFormatException f)
            {
                l.setText("INVALID FORMAT");
                return;
            }
            s="";
            l.setText(s);
            check=1;
        }
         if(e.getSource()==b15)//substraction
        {
            try
            {
                num1=Double.parseDouble(l.getText());
                
            }
            catch(NumberFormatException f)
            {
                l.setText("INVALID FORMAT");
                return;
            }
            s="";
            l.setText(s);
            check=2;
        } if(e.getSource()==b14)//multiplication
        {
            try
            {
                num1=Double.parseDouble(l.getText());
                
            }
            catch(NumberFormatException f)
            {
                l.setText("INVALID FORMAT");
                return;
            }
            s="";
            l.setText(s);
            check=3;
        } if(e.getSource()==b13)//division
        {
            try
            {
                num1=Double.parseDouble(l.getText());
                
            }
            catch(NumberFormatException f)
            {
                l.setText("INVALID FORMAT");
                return;
            }
            s="";
            l.setText(s);
            check=4;
        } if(e.getSource()==b11)//modulus
        {
            try
            {
                num1=Double.parseDouble(l.getText());
                
            }
            catch(NumberFormatException f)
            {
                l.setText("INVALID FORMAT");
                return;
            }
            s="";
            l.setText(s);
            check=5;
        }
         if(e.getSource()==b17)//result
        {
            try
            {
                num2=Double.parseDouble(l.getText());
                
            }
            catch(NumberFormatException f)
            {
                l.setText("enter the number ");
                return;
            }
            
          
           
        
            if(check==1)
                {
                     x=num1+num2;
                }
                 if(check==2)
                    {
                     x=num1-num2;
             
                    }
             if(check==3)
             {
                  x=num1*num2;
            }
            if(check==4)
            {
                x=num1/num2;
            }
            if(check==5)
            {
                x=num1%num2;
            }
            l.setText(String.valueOf(x));
         }
            if(e.getSource()==bc)//clear
            {
                num1=0;
                num2=0;
                check=0;
                x=0;
                s="";
                l.setText(s);
            }

        }
    public void windowClosing(WindowEvent w)
    {
   f.dispose();
    }
    

    
    public static void main(String[] args)
    {
        Calculator c=new Calculator();
        
    }
    
}
