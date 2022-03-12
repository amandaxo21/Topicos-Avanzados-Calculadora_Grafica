import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CalculadoraGraf extends JFrame {

    JLabel Letrero, lblTotal;//Reserva el espacio en memoria
    JButton btnBorrarTodo, btnDividir, btnMulti, btnRestar, btnSuma, btnIgual, num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, btnPunto;
    JTextField txtTotal;
    JPanel panel;
    
    private Object objTextField;
    public String guardados[] = new String[2];
    public int cont = 0, funcion = 0, continuidad = 0, hayPunto = 0;

    public CalculadoraGraf() {
        initComponents();
    }

    private void initComponents() {
         
        setLocationRelativeTo(null); 
        setSize(200, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtTotal = new JTextField(10);
        txtTotal.setEditable(false);
        Color colorBtn=new Color(231, 182, 233); //Color para Botones numeros
        Color colorBtnOp=new Color(159, 213, 238); //Color para Botones operadores

        btnBorrarTodo = new JButton("Eliminar");
        btnBorrarTodo.setBackground(colorBtnOp);
        btnDividir = new JButton("/"); 
        btnDividir.setBackground(colorBtnOp);
        btnMulti = new JButton("*");
        btnMulti.setBackground(colorBtnOp);
        btnRestar = new JButton("-");
        btnRestar.setBackground(colorBtnOp);
        btnSuma = new JButton("+");
        btnSuma.setBackground(colorBtnOp);
        btnIgual = new JButton("=");
        btnIgual.setBackground(colorBtnOp);
        num1 = new JButton("1");
        num1.setBackground(colorBtn);
        num2 = new JButton("2");
        num2.setBackground(colorBtn);
        num3 = new JButton("3");
        num3.setBackground(colorBtn);
        num4 = new JButton("4");
        num4.setBackground(colorBtn);
        num5 = new JButton("5");
        num5.setBackground(colorBtn);
        num6 = new JButton("6");
        num6.setBackground(colorBtn);
        num7 = new JButton("7");
        num7.setBackground(colorBtn);
        num8 = new JButton("8");
        num8.setBackground(colorBtn);
        num9 = new JButton("9");
        num9.setBackground(colorBtn);
        num0 = new JButton("0");
        num0.setBackground(colorBtn);
        btnPunto = new JButton(".");
        btnPunto.setBackground(colorBtnOp);

        panel = new JPanel();
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setBounds(100, 500, 50, 100);
        panel.setBackground(Color.PINK);
        txtTotal.setText("0");
        panel.add(txtTotal);
        panel.add(btnBorrarTodo);
        panel.add(btnDividir);
        panel.add(btnMulti);
        panel.add(btnRestar);
        panel.add(num7);
        panel.add(num8);
        panel.add(num9);
        panel.add(btnSuma);
        panel.add(num4);
        panel.add(num4);
        panel.add(num5);
        panel.add(num6);
        panel.add(btnPunto);
        panel.add(num1);
        panel.add(num2);
        panel.add(num3);
        panel.add(num0);
        panel.add(btnIgual);
        guardados[0] = "";
        guardados[1] = "";

        btnBorrarTodo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btnDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
       
        btnMulti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        btnIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        num1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });
        num2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });
        num3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });
        num4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });
        num5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });
        num6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });
        num7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });
        num8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });
        num9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });
        num0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });
        btnPunto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        setTitle("Calculadora");
        setContentPane(panel);
        setVisible(true);
    }

    private void btnBorrarTodoActionPerformed(ActionEvent evt) {
        String c = txtTotal.getText();
        float display = Float.parseFloat(c.trim());
        txtTotal.setText("0");
        guardados[0] = "";
        guardados[1] = "";
        continuidad = 0;
        hayPunto = 0;
    }

    private void btnDividirActionPerformed(ActionEvent evt) {
        txtTotal.setText("0");
        cont++;
        funcion = 1;
        continuidad = 1;
        hayPunto = 0;
    }

    private void btnPorcentajeActionPerformed(ActionEvent evt) {
        if (cont == 0) {
            if (guardados[0] != "") {
                float num1 = Float.parseFloat(guardados[0].trim());
                txtTotal.setText(Porcentaje(num1) + "");
                guardados[0] = Porcentaje(num1) + "";
            } else {
                txtTotal.setText("" + Porcentaje(Float.parseFloat(txtTotal.getText().trim())));
            }
        } else {
            if (cont == 1) {
                float num1 = Float.parseFloat(guardados[1].trim()); //tal vez me de error
                txtTotal.setText(Porcentaje(num1) + "");
                guardados[1] = Porcentaje(num1) + "";
            }
        }
        continuidad = 0;
        hayPunto = 0;
    }

    private void btnMultiActionPerformed(ActionEvent evt) {
        txtTotal.setText("0");
        cont++;
        funcion = 3;
        continuidad = 0;
        hayPunto = 0;
    }

    private void btnRestarActionPerformed(ActionEvent evt) {
        txtTotal.setText("0");
        cont++;
        funcion = 4;
        continuidad = 0;
        hayPunto = 0;
    }

    private void btnIgualActionPerformed(ActionEvent evt) {
        float num1 = Float.parseFloat(guardados[0].trim());
        float num2 = Float.parseFloat(guardados[1].trim());
        if (funcion == 1) {
            txtTotal.setText(Division(num1, num2) + "");
        } else {
            if (funcion == 3) {
                txtTotal.setText(Multiplicacion(num1, num2) + "");
            } else {
                if (funcion == 4) {
                    txtTotal.setText(Resta(num1, num2) + "");
                } else {
                    if (funcion == 5) {
                        txtTotal.setText(Suma(num1, num2) + "");
                    }
                }

            }
        }
        cont--;
        guardados[0] = "";
        guardados[1] = "";
        continuidad = 0;
        hayPunto = 0;
    }

    private void btnSumaActionPerformed(ActionEvent evt) {
        txtTotal.setText("0");
        cont++;
        funcion = 5;
        continuidad = 0;
        hayPunto = 0;
    }

    private void num1ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "1";
            txtTotal.setText(txtTotal.getText() + "1");
        } else {
            guardados[cont] = guardados[cont] + "1";
            txtTotal.setText("1");
            continuidad = 1;
        }

    }

    private void num2ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "2";
            txtTotal.setText(txtTotal.getText() + "2");
        } else {
            guardados[cont] = guardados[cont] + "2";
            txtTotal.setText("2");
            continuidad = 1;
        }
    }

    private void num3ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "3";
            txtTotal.setText(txtTotal.getText() + "3");
        } else {
            guardados[cont] = guardados[cont] + "3";
            txtTotal.setText("3");
            continuidad = 1;
        }
    }

    private void num4ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "4";
            txtTotal.setText(txtTotal.getText() + "4");
        } else {
            guardados[cont] = guardados[cont] + "4";
            txtTotal.setText("4");
            continuidad = 1;
        }
    }

    private void num5ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "5";
            txtTotal.setText(txtTotal.getText() + "5");
        } else {
            guardados[cont] = guardados[cont] + "5";
            txtTotal.setText("5");
            continuidad = 1;
        }
    }

    private void num6ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "6";
            txtTotal.setText(txtTotal.getText() + "6");
        } else {
            guardados[cont] = guardados[cont] + "6";
            txtTotal.setText("6");
            continuidad = 1;
        }
    }

    private void num7ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "7";
            txtTotal.setText(txtTotal.getText() + "7");
        } else {
            guardados[cont] = guardados[cont] + "7";
            txtTotal.setText("7");
            continuidad = 1;
        }
    }

    private void num8ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "8";
            txtTotal.setText(txtTotal.getText() + "8");
        } else {
            guardados[cont] = guardados[cont] + "8";
            txtTotal.setText("8");
            continuidad = 1;
        }
    }

    private void num9ActionPerformed(ActionEvent evt) {
        if (continuidad == 1) {
            guardados[cont] = guardados[cont] + "9";
            txtTotal.setText(txtTotal.getText() + "9");
        } else {
            guardados[cont] = guardados[cont] + "9";
            txtTotal.setText("9");
            continuidad = 1;
        }
    }

    private void num0ActionPerformed(ActionEvent evt) {
        guardados[cont] = guardados[cont] + "0";
        txtTotal.setText(txtTotal.getText() + "0");
    }

    private void btnPuntoActionPerformed(ActionEvent evt) {
        if (hayPunto == 0) {
            hayPunto = 1;
            if (continuidad == 1) {
                guardados[cont] = guardados[cont] + ".";
                txtTotal.setText(txtTotal.getText() + ".");
                
            } else {
                guardados[cont] = guardados[cont] + ".";
                txtTotal.setText("0.");
                continuidad = 1;
            }
        }
    }

    public static float Suma(float num1, float num2) {
        float suma = num1 + num2;
        return suma;
    }

    public static float Resta(float num1, float num2) {
        float resta = num1 - num2;
        return resta;
    }

    public static float Multiplicacion(float num1, float num2) {
        float multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public static float Division(float num1, float num2) {
        float division = num1 / num2;
        return division;
    }

    public static float Porcentaje(float num1) {
        float porcentaje = num1 / 100;
        return porcentaje;
    }

    private class MyListener extends MouseAdapter {

        public void mouseClicked(MouseEvent event) {
            System.exit(0);
        }
    }
}
