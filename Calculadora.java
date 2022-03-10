import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class Calculadora extends JFrame {
    
    private Object objTextField;
    public String[] datos = new String[2];
    public int contin = 0, conPto = 0, cont = 0, func = 0;
    JButton btnBorrador, btnDivi, btnMulti, btnResta, btnSuma, btnIgu, btnSalir, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPto;
    JTextField txtTotal;
    JLabel Cartel, lblTtl;
    JPanel panel;
    

    public Calculadora() {
        initComponents();
    }

    private void initComponents() {
        
        setSize(200, 220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtTotal = new JTextField(15);
        txtTotal.setEditable(false);
        
        panel = new JPanel();
        panel = new JPanel();
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setBounds(132, 28, 144, 20);
        txtTotal.setText("0");
        panel.add(txtTotal);
        
        //Ingreso de botones
        btnBorrador = new JButton("C");
        panel.add(btnBorrador);
        btnBorrador.setBackground(Color.green);
        btnDivi = new JButton("/");
        panel.add(btnDivi);
        btnDivi.setBackground(Color.green);
        btnMulti = new JButton("x");
        panel.add(btnMulti);
        btnMulti.setBackground(Color.green);
        btnResta = new JButton("-");
        panel.add(btnResta);
        btnResta.setBackground(Color.green);
        btnSuma = new JButton("+");
        panel.add(btnSuma);
        btnSuma.setBackground(Color.green);
        btnIgu = new JButton("=");
        panel.add(btnIgu);
        btnIgu.setBackground(Color.green);
        btn1 = new JButton("1");
        panel.add(btn1);
        btn1.setBackground(Color.yellow);
        btn2 = new JButton("2");
        btn2.setBackground(Color.yellow);
        panel.add(btn2);
        btn3 = new JButton("3");
        btn3.setBackground(Color.yellow);
        panel.add(btn3);
        btn4 = new JButton("4");
        btn4.setBackground(Color.yellow);
        panel.add(btn4);
        btn5 = new JButton("5");
        btn5.setBackground(Color.yellow);
        panel.add(btn5);
        btn6 = new JButton("6");
        btn6.setBackground(Color.yellow);
        panel.add(btn6);
        btn7 = new JButton("7");
        btn7.setBackground(Color.yellow);
        panel.add(btn7);
        btn8 = new JButton("8");
        btn8.setBackground(Color.yellow);
        panel.add(btn8);
        btn9 = new JButton("9");
        btn9.setBackground(Color.yellow);
        panel.add(btn9);
        btn0 = new JButton("0");
        btn0.setBackground(Color.yellow);
        panel.add(btn0);
        btnPto = new JButton(".");
        btnPto.setBackground(Color.yellow);
        panel.add(btnPto);
        btnSalir=new JButton("SALIR");
        btnSalir.setBackground(Color.red);
        panel.add(btnSalir);
        
        datos[0] = ""; datos[1] = "";
     
        //Listener
        btnIgu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        
        btnDivi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDiviActionPerformed(evt);
            }
        });
        
        btnMulti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        
        btnBorrador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBorradorActionPerformed(evt);
            }
        });
        
        btnResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        
        btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        btnPto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPtoActionPerformed(evt);
            }
        });
        
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        setTitle("Calculadora :D");

        setContentPane(panel);
        setVisible(true);
    }
    
    //Sumar
    private void btnSumaActionPerformed(ActionEvent evt) {
        txtTotal.setText("0");
        cont++;
        func = 5; contin = 0; conPto = 0;
    }
    
    //Restar
    private void btnRestaActionPerformed(ActionEvent evt) {
        cont++;
        txtTotal.setText("0");
        func = 4; contin = 0; conPto = 0;
    }
    
    //Multiplicar
    private void btnMultiActionPerformed(ActionEvent evt) {
        cont++;
        txtTotal.setText("0");
        func = 3; contin = 0; conPto = 0;
    }
    
    //Dividir
    private void btnDiviActionPerformed(ActionEvent evt) {
        cont++;
        txtTotal.setText("0");
        func = 1; contin = 1; conPto = 0;
    }

    //Borrar
    private void btnBorradorActionPerformed(ActionEvent evt) {
        String c = txtTotal.getText();
        float display = Float.parseFloat(c.trim());
        txtTotal.setText("0");
        datos[0] = ""; datos[1] = "";
        contin = 0; conPto = 0;
    }
    //Resultado
    private void btnIgualActionPerformed(ActionEvent evt) {
        float n1 = Float.parseFloat(datos[0].trim());
        float n2 = Float.parseFloat(datos[1].trim());
        if (func == 1) {
            txtTotal.setText(Division(n1, n2) + "");
        } else {
            if (func == 3) {
                txtTotal.setText(Multiplicacion(n1, n2) + "");
            } else {
                if (func == 4) {
                    txtTotal.setText(Resta(n1, n2) + "");
                } else {
                    if (func == 5) {
                        txtTotal.setText(Suma(n1, n2) + "");
                    }
                }

            }
        }
        cont--;
        datos[0] = ""; datos[1] = "";
        contin = 0; conPto = 0;
    }
    
    //Funcion de Botones
    private void btn1ActionPerformed(ActionEvent evt) {
        if (contin == 1) {
            datos[cont] = datos[cont] + "1";
            txtTotal.setText(txtTotal.getText() + "1");
        } else {
            datos[cont] = datos[cont] + "1";
            txtTotal.setText("1");
            contin = 1;
        }

    }

    private void btn2ActionPerformed(ActionEvent evt) {
        if (contin == 1) {
            datos[cont] = datos[cont] + "2";
            txtTotal.setText(txtTotal.getText() + "2");
        } else {
            datos[cont] = datos[cont] + "2";
            txtTotal.setText("2");
            contin = 1;
        }
    }

    private void btn3ActionPerformed(ActionEvent evt) {
        if (contin == 1) {
            datos[cont] = datos[cont] + "3";
            txtTotal.setText(txtTotal.getText() + "3");
        } else {
            datos[cont] = datos[cont] + "3";
            txtTotal.setText("3");
            contin = 1;
        }
    }

    private void btn4ActionPerformed(ActionEvent evt) {
        if (contin == 1) {
            datos[cont] = datos[cont] + "4";
            txtTotal.setText(txtTotal.getText() + "4");
        } else {
            datos[cont] = datos[cont] + "4";
            txtTotal.setText("4");
            contin = 1;
        }
    }

    private void btn5ActionPerformed(ActionEvent evt) {
        if (contin == 1) {
            datos[cont] = datos[cont] + "5";
            txtTotal.setText(txtTotal.getText() + "5");
        } else {
            datos[cont] = datos[cont] + "5";
            txtTotal.setText("5");
            contin = 1;
        }
    }

    private void btn6ActionPerformed(ActionEvent evt) {
        if (contin == 1) {
            datos[cont] = datos[cont] + "6";
            txtTotal.setText(txtTotal.getText() + "6");
        } else {
            datos[cont] = datos[cont] + "6";
            txtTotal.setText("6");
            contin = 1;
        }
    }

    private void btn7ActionPerformed(ActionEvent evt) {
        if (contin == 1) {
            datos[cont] = datos[cont] + "7";
            txtTotal.setText(txtTotal.getText() + "7");
        } else {
            datos[cont] = datos[cont] + "7";
            txtTotal.setText("7");
            contin = 1;
        }
    }

    private void btn8ActionPerformed(ActionEvent evt) {
        if (contin == 1) {
            datos[cont] = datos[cont] + "8";
            txtTotal.setText(txtTotal.getText() + "8");
        } else {
            datos[cont] = datos[cont] + "8";
            txtTotal.setText("8");
            contin = 1;
        }
    }

    private void btn9ActionPerformed(ActionEvent evt) {
        if (contin == 1) {
            datos[cont] = datos[cont] + "9";
            txtTotal.setText(txtTotal.getText() + "9");
        } else {
            datos[cont] = datos[cont] + "9";
            txtTotal.setText("9");
            contin = 1;
        }
    }

    private void btn0ActionPerformed(ActionEvent evt) {
        datos[cont] = datos[cont] + "0";
        txtTotal.setText(txtTotal.getText() + "0");
    }

    private void btnPtoActionPerformed(ActionEvent evt) {
        if (conPto == 0) {
            conPto = 1;
            if (contin == 1) {
                datos[cont] = datos[cont] + ".";
                txtTotal.setText(txtTotal.getText() + ".");
                
            } else {
                datos[cont] = datos[cont] + ".";
                txtTotal.setText("0.");
                contin = 1;
            }
        }
    }
    //Salir
    private void btnSalirActionPerformed(ActionEvent evt) {
        System.exit(0); 
    }
    
    //Operaciones
    public static float Suma(float n1, float n2) {
        float suma = n1 + n2;
        return suma;
    }

    public static float Resta(float n1, float n2) {
        float resta = n1 - n2;
        return resta;
    }

    public static float Multiplicacion(float n1, float n2) {
        float multiplicacion = n1 * n2;
        return multiplicacion;
    }

    public static float Division(float n1, float n2) {
        float division = n1 / n2;
        return division;
    }

    private class MyListener extends MouseAdapter {

        public void mouseClicked(MouseEvent event) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        
    }
}
