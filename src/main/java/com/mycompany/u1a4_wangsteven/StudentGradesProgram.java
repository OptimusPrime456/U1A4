/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u1a4_wangsteven;

/**
 *
 * @author 342480696
 */
public class StudentGradesProgram extends javax.swing.JFrame {
    // This is a comment.
    /**
     * Creates new form StudentGradesProgram
     */
    
    String[][] studentInfo = new String[30][6];
    int numberOfStudents = 0;
    
    public StudentGradesProgram() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        studentAverageButton = new javax.swing.JButton();
        courseAverageButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputField1 = new javax.swing.JTextArea();
        testOne = new javax.swing.JTextField();
        testTwo = new javax.swing.JTextField();
        testThree = new javax.swing.JTextField();
        testFour = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        outputField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Grades");

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabel1.setText("Student Grades");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Test 1:");

        jLabel5.setText("Test 2:");

        jLabel6.setText("Test 3:");

        jLabel7.setText("Test 4:");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        studentAverageButton.setText("Student Average");
        studentAverageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAverageButtonActionPerformed(evt);
            }
        });

        courseAverageButton.setText("Course Average");
        courseAverageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseAverageButtonActionPerformed(evt);
            }
        });

        outputField1.setEditable(false);
        outputField1.setColumns(20);
        outputField1.setRows(5);
        jScrollPane1.setViewportView(outputField1);

        testThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testThreeActionPerformed(evt);
            }
        });

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        outputField2.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(studentAverageButton)
                                .addComponent(addButton)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(testFour))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(testOne, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(testTwo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(testThree)))
                            .addComponent(courseAverageButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(outputField2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(testOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(testThree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(testFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentAverageButton))
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(courseAverageButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(outputField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        
        outputField2.setText("");
        
        String firstName, lastName, testOneAsString,testTwoAsString, testThreeAsString, testFourAsString;
        boolean error = false, error2 = false, error3 = false;

        firstName = firstNameField.getText();
        lastName = lastNameField.getText();
        testOneAsString = testOne.getText();
        testTwoAsString = testTwo.getText();
        testThreeAsString = testThree.getText();
        testFourAsString = testFour.getText();
        
        try {
        if (firstName.equals("") || lastName.equals("") || testOneAsString.equals("") || testTwoAsString.equals("") || testThreeAsString.equals("") || testFourAsString.equals("")) {
            outputField2.setText("You left a required piece of information empty.");
        } 
        else {
        try {
        studentInfo[numberOfStudents][0] = firstName;
        studentInfo[numberOfStudents][1] = lastName;
        studentInfo[numberOfStudents][2] = testOneAsString;
        studentInfo[numberOfStudents][3] = testTwoAsString;
        studentInfo[numberOfStudents][4] = testThreeAsString;
        studentInfo[numberOfStudents][5] = testFourAsString;
        
        double testOneAsDouble = Double.parseDouble(testOneAsString);
        double testTwoAsDouble = Double.parseDouble(testTwoAsString);
        double testThreeAsDouble = Double.parseDouble(testThreeAsString);
        double testFourAsDouble = Double.parseDouble(testFourAsString);
        
        } 
        catch (NumberFormatException e) {
            error = true;
        }
        if (error == true) {
            outputField2.setText("You must enter a number for the grades.");
        } 
        for (int i = 0; i < numberOfStudents; i++) {
            if (studentInfo[numberOfStudents][0].equals(studentInfo[i][0]) && studentInfo[numberOfStudents][1].equals(studentInfo[i][1])){
                error2 = true;
                if (error2 == true) {
                    break;
                }
            }
        }
        if (error2 == true) {
            outputField2.setText("Student already exists.");
        } 
        else {
          error2 = false;
        }
        if (error == false && error2 == false && error3 == false) {
            numberOfStudents++;
            outputField1.append("Student " + numberOfStudents + ": " + firstName + " " + lastName + "   Grade 1: " + testOneAsString + "% Grade 2: " + testTwoAsString + "% Grade 3: " + testThreeAsString + "% Grade 4: " + testFourAsString + "%\n");       
                    }
                }
            }
        catch (Exception e) {
            error3 = true;
        }
        if (error3 == true) {
            outputField2.setText("The class is at capacity.");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void studentAverageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAverageButtonActionPerformed
        // TODO add your handling code here:
        
        int rightStudent = 0;
        double average;
        
        for (int i = 0; i < numberOfStudents; i++) {
            if (firstNameField.getText().equals(studentInfo[i][0]) && lastNameField.getText().equals(studentInfo[i][1])) {
                rightStudent = i;
                break;
            }
        }
        
        String test1 = studentInfo[rightStudent][2];
        String test2 = studentInfo[rightStudent][3];
        String test3 = studentInfo[rightStudent][4];
        String test4 = studentInfo[rightStudent][5];
        
        double test1AsDouble = Double.parseDouble(test1);
        double test2AsDouble = Double.parseDouble(test2);
        double test3AsDouble = Double.parseDouble(test3);
        double test4AsDouble = Double.parseDouble(test4);
        
        average = (test1AsDouble + test2AsDouble + test3AsDouble + test4AsDouble)/4;
        average = Math.round(average*100);
        average = average/100;
        
        outputField2.setText(studentInfo[rightStudent][0] + " " + studentInfo[rightStudent][1] + "'s average is: " + average + "%");
    }//GEN-LAST:event_studentAverageButtonActionPerformed

    private void courseAverageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseAverageButtonActionPerformed
        // TODO add your handling code here:
        
        double average, classAverage = 0;
        String test1, test2, test3, test4;
        double test1AsDouble, test2AsDouble, test3AsDouble, test4AsDouble;
        
        for (int i = 0; i < numberOfStudents; i++) {
        test1 = studentInfo[i][2];
        test2 = studentInfo[i][3];
        test3 = studentInfo[i][4];
        test4 = studentInfo[i][5];
        test1AsDouble = Double.parseDouble(test1);
        test2AsDouble = Double.parseDouble(test2);
        test3AsDouble = Double.parseDouble(test3);
        test4AsDouble = Double.parseDouble(test4);
        
        average = test1AsDouble + test2AsDouble + test3AsDouble + test4AsDouble;
        classAverage += average;
        }
        
        classAverage = classAverage / (4 * numberOfStudents);
        classAverage = Math.round(classAverage*100);
        classAverage = classAverage/100;
        
        outputField2.setText("Course average is: " + classAverage  + "%");
    }//GEN-LAST:event_courseAverageButtonActionPerformed

    private void testThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testThreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testThreeActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(StudentGradesProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGradesProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGradesProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGradesProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGradesProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JToggleButton courseAverageButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextArea outputField1;
    private javax.swing.JTextField outputField2;
    private javax.swing.JButton studentAverageButton;
    private javax.swing.JTextField testFour;
    private javax.swing.JTextField testOne;
    private javax.swing.JTextField testThree;
    private javax.swing.JTextField testTwo;
    // End of variables declaration//GEN-END:variables
}
