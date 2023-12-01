/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author abypi
 */
public class calculator extends javax.swing.JFrame {

    private int value1;
    /**
     * Creates new form calculator
     */
    public calculator() {
        initComponents();
    }

    private void initComponents() {

        btn0 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtResult = new javax.swing.JTextField();
        btnDivision = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btnDivision1 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btnMinus1 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btnMultiplication1 = new javax.swing.JButton();
        btnPlus1 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btnEqual1 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtResult1 = new javax.swing.JTextField();

        btn0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClear.setText("CE");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        txtResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtResult)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDivision.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btnMultiplication.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMultiplication.setText("*");
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn12.setText("0");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btnDivision1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDivision1.setText("/");
        btnDivision1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivision1ActionPerformed(evt);
            }
        });

        btn13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn13.setText("6");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn16.setText("1");
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btnClear1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClear1.setText("CE");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        btn17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn17.setText("4");
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btnMinus1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMinus1.setText("-");
        btnMinus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinus1ActionPerformed(evt);
            }
        });

        btn18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn18.setText("2");
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn14.setText("9");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btnMultiplication1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnMultiplication1.setText("*");
        btnMultiplication1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplication1ActionPerformed(evt);
            }
        });

        btnPlus1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPlus1.setText("+");
        btnPlus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlus1ActionPerformed(evt);
            }
        });

        btn19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn19.setText("3");
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn15.setText("7");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btnEqual1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEqual1.setText("=");
        btnEqual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqual1ActionPerformed(evt);
            }
        });

        btn20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn20.setText("5");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn21.setText("8");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        txtResult1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtResult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResult1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtResult1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                            .addComponent(btn16, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn20, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(btn18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn14, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(btn19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMultiplication1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinus1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlus1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(btnDivision1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEqual1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnPlus1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinus1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMultiplication1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDivision1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEqual1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        int value2;
        String operator;
    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn0.getText());
            value1 = 0;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn0.getText());
            value2 = 0;
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn6.getText());
            value1 = 6;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn6.getText());
            value2 = 6;
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        txtResult.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed

        if(!(txtResult.getText().isEmpty())){
            operator = "minus";
            txtResult.setText(txtResult.getText()+ "-");
        }
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn9.getText());
            value1 = 9;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn9.getText());
            value2 = 9;
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed

        if(!(txtResult.getText().isEmpty())){
            operator = "plus";
            txtResult.setText(txtResult.getText()+ "+");
        }
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn7.getText());
            value1 = 7;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn7.getText());
            value2 = 7;
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn5.getText());
            value1 = 5;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn5.getText());
            value2 = 5;
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn8.getText());
            value1 = 8;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn8.getText());
            value2 = 8;
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
    }//GEN-LAST:event_txtResultActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed

        if(!(txtResult.getText().isEmpty())){
            operator = "division";
            txtResult.setText(txtResult.getText()+ "/");
        }
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn1.getText());
            value1 = 1;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn1.getText());
            value2 = 1;
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn4.getText());
            value1 = 4;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn4.getText());
            value2 = 4;
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn2.getText());
            value1 = 2;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn2.getText());
            value2 = 2;
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed

        if(!(txtResult.getText().isEmpty())){
            operator = "multiplication";
            txtResult.setText(txtResult.getText()+ "*");
        }
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn3.getText());
            value1 = 3;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn3.getText());
            value2 = 3;
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed

        double answer = 0;
        if("plus".equals(operator))
        answer = value1 + value2;
        else if("minus".equals(operator))
        answer = value1 - value2;
        else if ("multiplication".equals(operator))
        answer = value1 * value2;
        else if("division".equals(operator))
        answer = value1/value2;

        String Result = Double.toString(answer);
        txtResult.setText(Result);

    }//GEN-LAST:event_btnEqualActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn0.getText());
            value1 = 0;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn0.getText());
            value2 = 0;
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btnDivision1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivision1ActionPerformed

        if(!(txtResult.getText().isEmpty())){
            operator = "division";
            txtResult.setText(txtResult.getText()+ "/");
        }
    }//GEN-LAST:event_btnDivision1ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn6.getText());
            value1 = 6;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn6.getText());
            value2 = 6;
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn1.getText());
            value1 = 1;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn1.getText());
            value2 = 1;
        }
    }//GEN-LAST:event_btn16ActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed

        txtResult.setText("");
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn4.getText());
            value1 = 4;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn4.getText());
            value2 = 4;
        }
    }//GEN-LAST:event_btn17ActionPerformed

    private void btnMinus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinus1ActionPerformed

        if(!(txtResult.getText().isEmpty())){
            operator = "minus";
            txtResult.setText(txtResult.getText()+ "-");
        }
    }//GEN-LAST:event_btnMinus1ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn2.getText());
            value1 = 2;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn2.getText());
            value2 = 2;
        }
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn9.getText());
            value1 = 9;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn9.getText());
            value2 = 9;
        }
    }//GEN-LAST:event_btn14ActionPerformed

    private void btnMultiplication1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplication1ActionPerformed

        if(!(txtResult.getText().isEmpty())){
            operator = "multiplication";
            txtResult.setText(txtResult.getText()+ "*");
        }
    }//GEN-LAST:event_btnMultiplication1ActionPerformed

    private void btnPlus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlus1ActionPerformed

        if(!(txtResult.getText().isEmpty())){
            operator = "plus";
            txtResult.setText(txtResult.getText()+ "+");
        }
    }//GEN-LAST:event_btnPlus1ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn3.getText());
            value1 = 3;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn3.getText());
            value2 = 3;
        }
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn7.getText());
            value1 = 7;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn7.getText());
            value2 = 7;
        }
    }//GEN-LAST:event_btn15ActionPerformed

    private void btnEqual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqual1ActionPerformed

        double answer = 0;
        if("plus".equals(operator))
        answer = value1 + value2;
        else if("minus".equals(operator))
        answer = value1 - value2;
        else if ("multiplication".equals(operator))
        answer = value1 * value2;
        else if("division".equals(operator))
        answer = value1/value2;

        String Result = Double.toString(answer);
        txtResult.setText(Result);
    }//GEN-LAST:event_btnEqual1ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn5.getText());
            value1 = 5;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn5.getText());
            value2 = 5;
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed

        if(txtResult.getText().isEmpty())
        {
            txtResult.setText(btn8.getText());
            value1 = 8;
        } else {
            txtResult.setText(txtResult.getText()+ " " + btn8.getText());
            value2 = 8;
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void txtResult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResult1ActionPerformed
    }//GEN-LAST:event_txtResult1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDivision1;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnEqual1;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMinus1;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnMultiplication1;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlus1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtResult1;
    // End of variables declaration//GEN-END:variables
}
