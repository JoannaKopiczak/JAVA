import org.mariuszgromada.math.mxparser.Expression;

import javax.swing.*;
import java.awt.event.*;
import java.text.MessageFormat;
public class Form1 extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;
    private JTextField formulalnput;
    private JList functionsList;
    private JButton evalButton;
    private JTextArea textArea1;
    String mystring;
    double result=0.0;


double a;

    public Form1() {
        this.setTitle("SciCalcu");
        setContentPane(mainPanel);
        //pack();//dopasowuje rozmiar ramki tak, aby cała jej zawartość była równa lub większa niż ich preferowane rozmiary
        this.setBounds(400, 150, 900, 500);

        JMenuBar menubar = new JMenuBar();//pasek na przyciski
        JMenu fileMenu = new JMenu("Options");//przycisk który bedzie się rozwijać
        //fileMenu.setMnemonic(KeyEvent.VK_C);// alt+c=option
        JMenuItem reset = new JMenuItem("Reset");//przycisk do rozwijanegogo przycisku
        JMenuItem exit = new JMenuItem("Exit");//przycisk do rozwijanegogo przycisku
        textArea1.setEditable(false);

        //dodajemy przyciski najpierw do rozwijanego przycisku a nastepnie do paska
        fileMenu.add(reset);
        evt ev = new evt();//do czyszczenia
        reset.addActionListener(ev);

        fileMenu.add(exit);
        event e = new event();//do zamykania
        exit.addActionListener(e);

        menubar.add(fileMenu);//dodajemy do paska
        setJMenuBar(menubar);//ustwiamy pasek

        //tworzymy kolejno listy funkcji
        MyList sin = new MyList("sinus", "sin()");
        MyList cos = new MyList("cosinus", "cos()");
        MyList tn = new MyList("tanges", "tg()");
        MyList ctg = new MyList("cotanges", "ctg()");
        MyList actg=new MyList("arcustanges","arctan()");
        MyList phi=new MyList("[phi]",  "[phi]");
        MyList pi=new MyList("pi",  "pi");
        MyList ee=new MyList("e",  "e");
        MyList add=new MyList("+",  "+");
        MyList times=new MyList("*",  "*");
        MyList device=new MyList("/",  "/");
        MyList last = new MyList("Last result", "");

        //dodajemy listy do jednej dużej listy przy użyciu DefaultListModel
        DefaultListModel<MyList> listModel = new DefaultListModel();

        listModel.addElement(sin);
        listModel.addElement(cos);
        listModel.addElement(tn);
        listModel.addElement(ctg);
        listModel.addElement(actg);

        listModel.addElement(phi);
        listModel.addElement(pi);
        listModel.addElement(ee);

        listModel.addElement(add);
        listModel.addElement(times);
        listModel.addElement(device);

        listModel.addElement(last);

        functionsList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {//słuchamy gdzie myszka klika na functionList
                if (e.getClickCount() == 2) {//2 razy musi kliknąć
                    int listened = functionsList.getSelectedIndex();//przypisujemy wysłuchany indeks listy do zmiennej
                    switch (listened) {
                        case 0:
                            formulalnput.setText(formulalnput.getText() + "sin()");
                            formulalnput.requestFocus();//ustawia kursor
                            formulalnput.setCaretPosition(formulalnput.getCaretPosition()-1);//w odpowiednim miejscu
                            break;
                        case 1:
                            formulalnput.setText(formulalnput.getText() + "cos()");
                            formulalnput.requestFocus();
                            formulalnput.setCaretPosition(formulalnput.getCaretPosition()-1);
                            break;
                        case 2:
                            formulalnput.setText(formulalnput.getText() + "tg()");
                            formulalnput.requestFocus();
                            formulalnput.setCaretPosition(formulalnput.getCaretPosition()-1);
                            break;
                        case 3:
                            formulalnput.setText(formulalnput.getText() + "ctg()");
                            formulalnput.requestFocus();
                            formulalnput.setCaretPosition(formulalnput.getCaretPosition() - 1);
                            break;
                        case 4:
                            formulalnput.setText(formulalnput.getText() + "arctan()");
                            formulalnput.requestFocus();
                            formulalnput.setCaretPosition(formulalnput.getCaretPosition() - 1);
                            break;
                        case 5:
                            formulalnput.setText(formulalnput.getText() + "[phi]");
                            formulalnput.requestFocus();
                            formulalnput.setCaretPosition(formulalnput.getCaretPosition());
                            break;
                        case 6:
                            formulalnput.setText(formulalnput.getText() + "pi");
                            formulalnput.requestFocus();
                            formulalnput.setCaretPosition(formulalnput.getCaretPosition());
                            break;
                        case 7:
                            formulalnput.setText(formulalnput.getText() + "e");
                            formulalnput.requestFocus();
                            formulalnput.setCaretPosition(formulalnput.getCaretPosition());
                            break;
                        case 8:
                            formulalnput.setText(formulalnput.getText() + "+");
                            formulalnput.requestFocus();
                            formulalnput.setCaretPosition(formulalnput.getCaretPosition());
                            break;
                        case 9:
                            formulalnput.setText(formulalnput.getText() + "*");
                            formulalnput.requestFocus();
                            formulalnput.setCaretPosition(formulalnput.getCaretPosition());
                            break;
                        case 10:
                            formulalnput.setText(formulalnput.getText() + "/");
                            formulalnput.requestFocus();
                            formulalnput.setCaretPosition(formulalnput.getCaretPosition());
                            break;
                        case 11:
                            formulalnput.setText(formulalnput.getText());//nie dopisuje nic
                            formulalnput.setText(formulalnput.getText() + result);//zwraca ostatni rezultat
                            formulalnput.requestFocus();
                            break;
                        default:
                            break;
                    }
                }
            }
        });
       functionsList.setModel(listModel);//ustawiamy naszą liste funkcji

        //przycisk

        evalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mystring = formulalnput.getText();
                org.mariuszgromada.math.mxparser.Expression expression = new Expression(mystring);
                if (expression.checkSyntax()) {
                    result = expression.calculate();
                    String res = String.valueOf(result);
                    MessageFormat form = new MessageFormat(mystring + " = " + res + "\n");//wiadomość
                    textArea1.append(form.toPattern()); //dodanie wiadomości na ekran
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong formula", "Error", //BŁĄD!
                            JOptionPane.ERROR_MESSAGE);
                }
                formulalnput.setText(" ");
            }
        });

        formulalnput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {//enter
                    mystring = formulalnput.getText();
                    org.mariuszgromada.math.mxparser.Expression expression = new Expression(mystring);
                    if (expression.checkSyntax()) {
                        result = expression.calculate();
                        String res = String.valueOf(result);
                        MessageFormat form = new MessageFormat(mystring + " = " + res + "\n");
                        textArea1.append(form.toPattern());
                    } else {
                        JOptionPane.showMessageDialog(null, "Nieprawidłowe wyrażenie", "Błąd",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    formulalnput.setText(" ");
                } else if (e.getKeyCode() == KeyEvent.VK_UP) {//strzałka do góry
                    formulalnput.setText(mystring);
                }
            }
        });

        this.setVisible(true);//wyświetlanie
    }

    public void actionPerformed(ActionEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }//zamykanie
    }

    public class evt implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            textArea1.setText("");//czyszczenie JTextArea
            formulalnput.setText("");//czyszczenie JTextField
        }
    }
}