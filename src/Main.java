import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OnlineTest extends JFrame implements ActionListener
{
    JLabel l;
    JRadioButton jb[]=new JRadioButton[5];
    JButton b1,b2;
    ButtonGroup bg;
    int count=0,current=0,x=1,y=1,now=0;
    int m[]=new int[10];
    OnlineTest(String s)
    {
        super(s);
        l=new JLabel();
        add(l);
        bg=new ButtonGroup();
        for(int i=0;i<5;i++)
        {
            jb[i]=new JRadioButton();
            add(jb[i]);
            bg.add(jb[i]);
        }
        b1=new JButton("Next");
        b2=new JButton("Bookmark");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);add(b2);
        set();
        l.setBounds(30,40,450,20);
        jb[0].setBounds(50,80,100,20);
        jb[1].setBounds(50,110,100,20);
        jb[2].setBounds(50,140,100,20);
        jb[3].setBounds(50,170,100,20);
        b1.setBounds(100,240,100,30);
        b2.setBounds(270,240,100,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,350);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            if(check())
                count=count+1;
            current++;
            set();
            if(current==8) // lägg till sista frågans nummer
            {
                b1.setEnabled(false);
                b2.setText("Result");
            }
        }
        if(e.getActionCommand().equals("Bookmark"))
        {
            JButton bk=new JButton("Bookmark"+x);
            bk.setBounds(480,20+30*x,100,30);
            add(bk);
            bk.addActionListener(this);
            m[x]=current;
            x++;
            current++;
            set();
            if(current==8) // lägg till sista frågans nummer
                b2.setText("Result");
            setVisible(false);
            setVisible(true);
        }
        for(int i=0,y=1;i<x;i++,y++)
        {
            if(e.getActionCommand().equals("Bookmark"+y))
            {
                if(check())
                    count=count+1;
                now=current;
                current=m[y];
                set();
                ((JButton)e.getSource()).setEnabled(false);
                current=now;
            }
        }

        if(e.getActionCommand().equals("Result"))
        {
            if(check())
                count=count+1;
            current++;
            //System.out.println("correct ans="+count);
            JOptionPane.showMessageDialog(this,"correct ans="+count);
            System.exit(0);
        }
    }

    //Läser upp frågorna från GUI där question ID är frågan
    void set()
    {
        Questions questions = new Questions();
        jb[4].setSelected(true);
        if(current==0)
        {
            l.setText(questions.returnQuestion(0)[0]);
            jb[0].setText(questions.returnQuestion(0)[1]);
            jb[1].setText(questions.returnQuestion(0)[2]);
            jb[2].setText(questions.returnQuestion(0)[3]);
            jb[3].setText(questions.returnQuestion(0)[4]);
        }
        if(current==1)
        {   l.setText(questions.returnQuestion(1)[0]);
            jb[0].setText(questions.returnQuestion(1)[1]);
            jb[1].setText(questions.returnQuestion(1)[2]);
            jb[2].setText(questions.returnQuestion(1)[3]);
            jb[3].setText(questions.returnQuestion(1)[4]);
        }
        if(current==2)
        {
            l.setText(questions.returnQuestion(2)[0]);
            jb[0].setText(questions.returnQuestion(2)[1]);
            jb[1].setText(questions.returnQuestion(2)[2]);
            jb[2].setText(questions.returnQuestion(2)[3]);
            jb[3].setText(questions.returnQuestion(2)[4]);
        }
        if(current==3)
        {
            l.setText(questions.returnQuestion(3)[0]);
            jb[0].setText(questions.returnQuestion(3)[1]);
            jb[1].setText(questions.returnQuestion(3)[2]);
            jb[2].setText(questions.returnQuestion(3)[3]);
            jb[3].setText(questions.returnQuestion(3)[4]);
        }
        if(current==4)
        {
            l.setText(questions.returnQuestion(4)[0]);
            jb[0].setText(questions.returnQuestion(4)[1]);
            jb[1].setText(questions.returnQuestion(4)[2]);
            jb[2].setText(questions.returnQuestion(4)[3]);
            jb[3].setText(questions.returnQuestion(4)[4]);
        }
        if(current==5)
        {
            l.setText(questions.returnQuestion(5)[0]);
            jb[0].setText(questions.returnQuestion(5)[1]);
            jb[1].setText(questions.returnQuestion(5)[2]);
            jb[2].setText(questions.returnQuestion(5)[3]);
            jb[3].setText(questions.returnQuestion(5)[4]);
        }
        if(current==6)
        {
            l.setText(questions.returnQuestion(6)[0]);
            jb[0].setText(questions.returnQuestion(6)[1]);
            jb[1].setText(questions.returnQuestion(6)[2]);
            jb[2].setText(questions.returnQuestion(6)[3]);
            jb[3].setText(questions.returnQuestion(6)[4]);
        }
        if(current==7)
        {
            l.setText(questions.returnQuestion(7)[0]);
            jb[0].setText(questions.returnQuestion(7)[1]);
            jb[1].setText(questions.returnQuestion(7)[2]);
            jb[2].setText(questions.returnQuestion(7)[3]);
            jb[3].setText(questions.returnQuestion(7)[4]);
        }
        if(current==8)
        {
            l.setText(questions.returnQuestion(8)[0]);
            jb[0].setText(questions.returnQuestion(8)[1]);
            jb[1].setText(questions.returnQuestion(8)[2]);
            jb[2].setText(questions.returnQuestion(8)[3]);
            jb[3].setText(questions.returnQuestion(8)[4]);
        }
        l.setBounds(30,40,450,20);
        for(int i=0,j=0;i<=90;i+=30,j++)
            jb[j].setBounds(50,80+i,200,20);
    }

    //Kollar om svars alternativen är rätt
    boolean check()
    {
        if(current==0)
            return(jb[1].isSelected());
        if(current==1)
            return(jb[2].isSelected());
        if(current==2)
            return(jb[3].isSelected());
        if(current==3)
            return(jb[0].isSelected());
        if(current==4)
            return(jb[2].isSelected());
        if(current==5)
            return(jb[2].isSelected());
        if(current==6)
            return(jb[0].isSelected());
        if(current==7)
            return(jb[2].isSelected());
        if(current==8)
            return(jb[3].isSelected());
        return false;
    }
    public static void main(String s[])
    {
        new OnlineTest("Online Test Of Java");
    }
}
