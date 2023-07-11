//Calculadora
//Integrantes: Jimenez Martin, Novillo Ismael, Paredes Cristian
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    public JPanel calculadora;
    private JTextField txtDisplay;
    private JButton botonresta;
    private JButton botonreset;
    private JButton botonigual;
    private JButton botonmulti;
    private JButton botondiv;
    private JButton button6;
    private JButton num7;
    private JButton num4;
    private JButton num1;
    private JButton num0;
    private JButton botonsuma;
    private JButton num8;
    private JButton num5;
    private JButton num2;
    private JButton num00;
    private JButton button16;
    private JButton num9;
    private JButton num6;
    private JButton num3;
    private JButton botonPunto;
    private JButton botonSeno;
    private JButton botoncoseno;
    private JButton botonTangente;
    private JButton botonPotencia;
    private JLabel numerosLabel;
    private JButton botonraiz;

    double a,b,resultado;
    String op;
    private String numerosIngresados = "";
    private String operacionActual = "";
    private String operacionCompleta = "";
    public calculadora() {
        JButton[] numeros = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = new JButton(String.valueOf(i));
        }

// ActionListener para el botón num1
        numeros[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroIngresado = "1";
                txtDisplay.setText(txtDisplay.getText() + numeroIngresado);
            }
        });

        botonSeno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroIngresado = txtDisplay.getText();
                double numero = Double.parseDouble(numeroIngresado);
                double resultado = Math.sin(Math.toRadians(numero));
                txtDisplay.setText(String.valueOf(resultado));

                operacionActual = "sin(" + numeroIngresado + ")";
                operacionCompleta = operacionActual;
                numerosLabel.setText(operacionCompleta);
                String valueStr = txtDisplay.getText();
                if (!valueStr.isEmpty()) {
                    try {
                        double value = Double.parseDouble(valueStr);
                        double radian = Math.toRadians(value);
                        double result = Math.sin(radian);
                        txtDisplay.setText(String.valueOf(result));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor antes de calcular el seno", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }


        });
        botonraiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroIngresado = txtDisplay.getText();
                if (numeroIngresado.isEmpty()) {
                    JOptionPane.showMessageDialog(calculadora.this.calculadora, "Ingrese un valor válido para calcular la raíz cuadrada", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double numero = Double.parseDouble(numeroIngresado);
                if (numero < 0) {
                    JOptionPane.showMessageDialog(calculadora.this.calculadora, "Operación no permitida: Raíz cuadrada de un número negativo", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double resultado = Math.sqrt(numero);
                txtDisplay.setText(String.valueOf(resultado));

                operacionActual = "sqrt(" + numero + ")";
                operacionCompleta = operacionActual;
                numerosLabel.setText(operacionCompleta);
            }



        });


        botoncoseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroIngresado = txtDisplay.getText();
                double numero = Double.parseDouble(numeroIngresado);
                double resultado = Math.cos(Math.toRadians(numero));
                txtDisplay.setText(String.valueOf(resultado));
                operacionActual = "cos(" + numeroIngresado + ")";
                operacionCompleta = operacionActual;
                numerosLabel.setText(operacionCompleta);
                String valueStr = txtDisplay.getText();
                if (!valueStr.isEmpty()) {
                    try {
                        double value = Double.parseDouble(valueStr);
                        double radian = Math.toRadians(value);
                        double result = Math.cos(radian);
                        txtDisplay.setText(String.valueOf(result));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor antes de calcular el coseno", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        botonTangente.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                    String numeroIngresado = txtDisplay.getText();
                    double numero = Double.parseDouble(numeroIngresado);
                    double resultado = Math.tan(Math.toRadians(numero));
                    txtDisplay.setText(String.valueOf(resultado));

                    operacionActual = "tan(" + numeroIngresado + ")";
                    operacionCompleta = operacionActual;
                    numerosLabel.setText(operacionCompleta);

                String valueStr = txtDisplay.getText();
                if (!valueStr.isEmpty()) {
                    try {
                        double value = Double.parseDouble(valueStr);
                        double radian = Math.toRadians(value);
                        double result = Math.tan(radian);
                        txtDisplay.setText(String.valueOf(result));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor antes de calcular la tangente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        botonPotencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroIngresado = txtDisplay.getText();
                double numero = Double.parseDouble(numeroIngresado);
                double resultado = Math.pow(numero, 2);
                txtDisplay.setText(String.valueOf(resultado));

                operacionActual = "(" + numeroIngresado + ")^2";
                operacionCompleta = operacionActual;
                numerosLabel.setText(operacionCompleta);
                String valueStr = txtDisplay.getText();
                if (!valueStr.isEmpty()) {
                    try {
                        a = Double.parseDouble(valueStr);
                        op = "^";
                        txtDisplay.setText("");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor antes de calcular la potencia", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        botonreset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
                operacionActual = "";
                operacionCompleta = "";
                numerosLabel.setText("");
            }

        });

        num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String numerosIngresados = num7.getText();
            if (!calculadora.this.numerosIngresados.contains(numerosIngresados)) {
                txtDisplay.setText(txtDisplay.getText() + numerosIngresados);
                calculadora.this.numerosIngresados += numerosIngresados;
                operacionActual += numerosIngresados;
                operacionCompleta += numerosIngresados;
                actualizarNumerosIngresados();
            }
        }

        });
        num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String numeroIngresado = num8.getText();
            if (!numerosIngresados.contains(numeroIngresado)) {
                txtDisplay.setText(txtDisplay.getText() + numeroIngresado);
                numerosIngresados += numeroIngresado;
                operacionActual += numeroIngresado;
                operacionCompleta += numeroIngresado;
                actualizarNumerosIngresados();
            }
        }

        });
        num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String numeroIngresado = num9.getText();
            if (!numerosIngresados.contains(numeroIngresado)) {
                txtDisplay.setText(txtDisplay.getText() + numeroIngresado);
                numerosIngresados += numeroIngresado;
                operacionActual += numeroIngresado;
                operacionCompleta += numeroIngresado;
                actualizarNumerosIngresados();
            }
        }
        });
        num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String numeroIngresado = num4.getText();
            if (!numerosIngresados.contains(numeroIngresado)) {
                txtDisplay.setText(txtDisplay.getText() + numeroIngresado);
                numerosIngresados += numeroIngresado;
                operacionActual += numeroIngresado;
                operacionCompleta += numeroIngresado;
                actualizarNumerosIngresados();
            }
        }

        });
        num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String numeroIngresado = num5.getText();
            if (!numerosIngresados.contains(numeroIngresado)) {
                txtDisplay.setText(txtDisplay.getText() + numeroIngresado);
                numerosIngresados += numeroIngresado;
                operacionActual += numeroIngresado;
                operacionCompleta += numeroIngresado;
                actualizarNumerosIngresados();
            }
            }
        });
        num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroIngresado = num6.getText();
                txtDisplay.setText(txtDisplay.getText() + numeroIngresado);
                numerosIngresados += numeroIngresado;
                operacionActual += numeroIngresado;
                actualizarNumerosIngresados();;
            }
        });
        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String numeroIngresado = num1.getText();
            if (!numerosIngresados.contains(numeroIngresado)) {
                txtDisplay.setText(txtDisplay.getText() + numeroIngresado);
                numerosIngresados += numeroIngresado;
                operacionActual += numeroIngresado;
                operacionCompleta += numeroIngresado;
                actualizarNumerosIngresados();
            }
        }

        });
        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroIngresado = num2.getText();
                if (!numerosIngresados.contains(numeroIngresado)) {
                    txtDisplay.setText(txtDisplay.getText() + numeroIngresado);
                    numerosIngresados += numeroIngresado;
                    operacionActual += numeroIngresado;
                    operacionCompleta += numeroIngresado;
                    actualizarNumerosIngresados();
                }

            }
        });
        num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroIngresado = num3.getText();
                txtDisplay.setText(txtDisplay.getText() + numeroIngresado);
                numerosIngresados += numeroIngresado;
                operacionActual += numeroIngresado;
                actualizarNumerosIngresados();
            }
        });
        num00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroIngresado = num00.getText();
                txtDisplay.setText(txtDisplay.getText() + numeroIngresado);
                numerosIngresados += numeroIngresado;
                operacionActual += numeroIngresado;
                actualizarNumerosIngresados();
            }
        });
        num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText()+ num0.getText());

            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplay.getText().contains("."))
                {
                    double pm= Double.parseDouble(txtDisplay.getText());
                    pm=pm*-1;
                    txtDisplay.setText(String.valueOf(pm));
                }else {
                    long PM=Long.parseLong(txtDisplay.getText());
                    PM=PM*-1;
                    txtDisplay.setText(String.valueOf(PM));
                }
            }
        });
        botonPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtDisplay.getText().contains("."))
                {
                    txtDisplay.setText(txtDisplay.getText()+ botonPunto.getText());
                }
            }
        });
        botonsuma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroIngresado = txtDisplay.getText();
                txtDisplay.setText("");
                numerosIngresados = "";
                operacionActual = "";
                operacionCompleta = "";
                operacionActual += numeroIngresado + " + ";
                operacionCompleta += numeroIngresado + " + ";
                actualizarNumerosIngresados();
                a = Double.parseDouble(numeroIngresado);
                op = "+";
                if (!numeroIngresado.isEmpty()) {
                    a = Double.parseDouble(numeroIngresado);
                    operacionActual += numeroIngresado + " + ";
                    operacionCompleta = operacionActual;
                    numerosLabel.setText(operacionCompleta);
                    txtDisplay.setText("");
                    op = "+";
                }
                }
        });
        botonresta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroIngresado = txtDisplay.getText();
                txtDisplay.setText("");
                numerosIngresados = "";
                operacionActual = "";
                operacionCompleta = "";
                operacionActual += numeroIngresado + " - ";
                operacionCompleta += numeroIngresado + " - ";
                actualizarNumerosIngresados();
                a = Double.parseDouble(numeroIngresado);
                op = "-";
                if (!numeroIngresado.isEmpty()) {
                    a = Double.parseDouble(numeroIngresado);
                    operacionActual += numeroIngresado + " - ";
                    operacionCompleta = operacionActual;
                    numerosLabel.setText(operacionCompleta);
                    txtDisplay.setText("");
                    op = "-";
                }

            }
        });
        botonmulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroIngresado = txtDisplay.getText();
                txtDisplay.setText("");
                numerosIngresados = "";
                operacionActual = "";
                operacionCompleta = "";
                operacionActual += numeroIngresado + " * ";
                operacionCompleta += numeroIngresado + " * ";
                actualizarNumerosIngresados();
                a = Double.parseDouble(numeroIngresado);
                op = "*";

                if (!numeroIngresado.isEmpty()) {
                a = Double.parseDouble(numeroIngresado);
                operacionActual += numeroIngresado + " * ";
                operacionCompleta = operacionActual;
                numerosLabel.setText(operacionCompleta);
                txtDisplay.setText("");
                op = "*";
            }
            }

        });
        botondiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String numeroIngresado = txtDisplay.getText();
                txtDisplay.setText("");
                numerosIngresados = "";
                operacionActual = "";
                operacionCompleta = "";
                operacionActual += numeroIngresado + " / ";
                operacionCompleta += numeroIngresado + " / ";
                actualizarNumerosIngresados();
                a = Double.parseDouble(numeroIngresado);
                op = "/";
                if (!numeroIngresado.isEmpty()) {
                    a = Double.parseDouble(numeroIngresado);
                    operacionActual += numeroIngresado + " / ";
                    operacionCompleta = operacionActual;
                    numerosLabel.setText(operacionCompleta);
                    txtDisplay.setText("");
                    op = "/";
                }

            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace=null;
                if (txtDisplay.getText().length()>0);
                {
                    StringBuilder stringBuilder=new StringBuilder(txtDisplay.getText());
                    stringBuilder.deleteCharAt(txtDisplay.getText().length()-1);
                    backspace=String.valueOf(stringBuilder);
                    txtDisplay.setText(backspace);
                }

            }
        });
        botonigual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroIngresado = txtDisplay.getText();
                if (numeroIngresado.isEmpty()) {
                    JOptionPane.showMessageDialog(calculadora.this.calculadora, "Ingrese un valor válido para el segundo operando", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                b = Double.parseDouble(numeroIngresado);

                if (op.equals("+")) {
                    resultado = a + b;
                } else if (op.equals("-")) {
                    resultado = a - b;
                } else if (op.equals("*")) {
                    resultado = a * b;
                } else if (op.equals("/")) {
                    if (b == 0) {
                        JOptionPane.showMessageDialog(calculadora.this.calculadora, "Operación no permitida: División entre cero", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    resultado = a / b;
                } else if (op.equals("^")) {
                    resultado = Math.pow(a, b);
                }

                txtDisplay.setText(String.valueOf(resultado));
                operacionActual = "";
                operacionCompleta = "";
                numerosLabel.setText("");
            }

    });

}

    private void actualizarNumerosIngresados() {
        operacionCompleta+=numerosIngresados;
        operacionActual+=numerosIngresados;
        numerosLabel.setText(operacionCompleta+numerosIngresados);

    }

}



