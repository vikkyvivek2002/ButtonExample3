import java.awt.*;     import java.awt.event.*;
 public class ButtonExample3 extends Frame implements ActionListener
{    Button b;
    TextField tf;
public ButtonExample3()  {
b=new Button("clickhere");   tf=new TextField("HI");  
 setLayout(null);
tf.setBounds(50,50,150,20);  
  b.setBounds(100,150,60,30);  
    add(b);   add(tf);
    setSize(300, 350);  setVisible(true);
b.addActionListener(this); 
// window closing code
addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });
  }
public void actionPerformed(ActionEvent e)
  {     tf.setText("welcome to java");      }

  public static void main(String args[]) 
 {    new ButtonExample3();          }
          }
