import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class okno extends JFrame {
    private int count = 0;
    private JTextField fio = new JTextField(20);
    private JLabel metka = new JLabel("Ваше имя?");
    private JLabel metkaDva = new JLabel("");
    private JLabel metkaTri = new JLabel("");


    class PushingListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Object button = e.getSource();
            if(button instanceof JButton){
                count++;
                metkaTri.setText("Нажато " + count + " раз");
                metkaDva.setText("Спасибо, "+fio.getText()+"!");
                setTitle("Работа №4. "+fio.getText());
                final Random  random = new Random();
                int r = random.nextInt(255);
                int g = random.nextInt(255);
                int b = random.nextInt(255);


               // ((JButton)button).setBackground(Color.decode(Integer.toHexString(new Color(r, g, b).getRGB())));
                ((JButton)button).setBackground(new Color(r, g, b));
                
            }
        }
    }
    class resizeAction implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Object resize = e.getSource();
            if(resize instanceof JButton){
                setSize(500,500); //Новые размеры окна
                ((JButton)resize).setText("Resize");
            }
        }
    }

    public okno(String title)
    {
        super(title);
        SozdatxOkno();
    }

    private void SozdatxOkno(){
        JButton button = new JButton(" Нажми меня! ");
        button.setBounds(20,60,160,40);
        button.addActionListener(new PushingListener());
        JButton resize = new JButton(" Resize! ");
        resize.setBounds(220,60,160,40);
        resize.addActionListener(new resizeAction());

        metka.setBounds(20,15,95,30);
        metkaDva.setBounds(20,115,200,30);
        metkaTri.setBounds(220,115,200,30);
        fio.setBounds(120, 15, 100, 30);
        getContentPane().setLayout(null);
        getContentPane().add(button);
        getContentPane().add(resize);
        getContentPane().add(metka);
        getContentPane().add(metkaDva);
        getContentPane().add(metkaTri);
        getContentPane().add(fio);
        setLocationRelativeTo(null);



    }
}