package co.edu.utp.isc.pro4.exammaker.view;

import co.edu.utp.isc.pro4.exammaker.controller.ExamController;
import co.edu.utp.isc.pro4.exammaker.model.QuestionType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Esteban
 */
public class AddQuestionPnl extends javax.swing.JPanel implements FrameControl {

    /**
     * Creates new form AddQuestionPnl
     */
    public AddQuestionPnl() {
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

        btnGroupUnique = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEnviar = new javax.swing.JButton();
        btnNuevaPregunta = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPnlEmpty2 = new javax.swing.JPanel();
        pnlNewQuestion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbQuestionType = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaStatement = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPnlOptions = new javax.swing.JPanel();
        jPnlEmpty3 = new javax.swing.JPanel();
        jPnlUniqueChoice = new javax.swing.JPanel();
        txtOptionA = new javax.swing.JTextField();
        txtOptionB = new javax.swing.JTextField();
        txtOptionC = new javax.swing.JTextField();
        txtOptionD = new javax.swing.JTextField();
        radOptionA = new javax.swing.JRadioButton();
        radOptionB = new javax.swing.JRadioButton();
        radOptionC = new javax.swing.JRadioButton();
        radOptionD = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jPnlMultipleChoice = new javax.swing.JPanel();
        txtOptionA1 = new javax.swing.JTextField();
        txtOptionB1 = new javax.swing.JTextField();
        txtOptionC1 = new javax.swing.JTextField();
        txtOptionD1 = new javax.swing.JTextField();
        chkOptionA = new javax.swing.JCheckBox();
        chkOptionB = new javax.swing.JCheckBox();
        chkOptionC = new javax.swing.JCheckBox();
        chkOptionD = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        btnGuardarPregunta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtValue = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar preguntas"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "N° pregunta", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnEnviar.setText("Enviar a Archivo");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnNuevaPregunta.setText("Nueva Pregunta");
        btnNuevaPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaPreguntaActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPnlEmpty2Layout = new javax.swing.GroupLayout(jPnlEmpty2);
        jPnlEmpty2.setLayout(jPnlEmpty2Layout);
        jPnlEmpty2Layout.setHorizontalGroup(
            jPnlEmpty2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        jPnlEmpty2Layout.setVerticalGroup(
            jPnlEmpty2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        jPanel2.add(jPnlEmpty2, "empty2");

        jLabel1.setText("Tipo de pregunta: ");

        cmbQuestionType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pregunta abierta", "Pregunta selección múltiple con única respuesta", "Pregunta selección múltiple con múltiple respuesta" }));
        cmbQuestionType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbQuestionTypeActionPerformed(evt);
            }
        });

        txaStatement.setColumns(20);
        txaStatement.setLineWrap(true);
        txaStatement.setRows(5);
        txaStatement.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txaStatement);

        jLabel2.setText("Enunciado:");

        jPnlOptions.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPnlEmpty3Layout = new javax.swing.GroupLayout(jPnlEmpty3);
        jPnlEmpty3.setLayout(jPnlEmpty3Layout);
        jPnlEmpty3Layout.setHorizontalGroup(
            jPnlEmpty3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        jPnlEmpty3Layout.setVerticalGroup(
            jPnlEmpty3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPnlOptions.add(jPnlEmpty3, "empty3");

        txtOptionA.setMinimumSize(new java.awt.Dimension(14, 28));

        txtOptionB.setMinimumSize(new java.awt.Dimension(14, 28));

        txtOptionC.setMinimumSize(new java.awt.Dimension(14, 28));

        txtOptionD.setMinimumSize(new java.awt.Dimension(14, 28));

        btnGroupUnique.add(radOptionA);
        radOptionA.setText("a.");

        btnGroupUnique.add(radOptionB);
        radOptionB.setText("b.");

        btnGroupUnique.add(radOptionC);
        radOptionC.setText("c.");

        btnGroupUnique.add(radOptionD);
        radOptionD.setText("d.");

        jLabel6.setText("Llene los campos de las opciones y seleccione la única opción correcta");

        javax.swing.GroupLayout jPnlUniqueChoiceLayout = new javax.swing.GroupLayout(jPnlUniqueChoice);
        jPnlUniqueChoice.setLayout(jPnlUniqueChoiceLayout);
        jPnlUniqueChoiceLayout.setHorizontalGroup(
            jPnlUniqueChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlUniqueChoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlUniqueChoiceLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPnlUniqueChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(radOptionA)
                    .addComponent(radOptionC)
                    .addComponent(radOptionB)
                    .addComponent(radOptionD))
                .addGap(18, 18, 18)
                .addGroup(jPnlUniqueChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtOptionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOptionC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOptionD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOptionA, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPnlUniqueChoiceLayout.setVerticalGroup(
            jPnlUniqueChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlUniqueChoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(19, 19, 19)
                .addGroup(jPnlUniqueChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOptionA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radOptionA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlUniqueChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOptionB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radOptionB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlUniqueChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOptionC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radOptionC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlUniqueChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOptionD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radOptionD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnlOptions.add(jPnlUniqueChoice, "card3");

        txtOptionA1.setMinimumSize(new java.awt.Dimension(14, 28));

        txtOptionB1.setMinimumSize(new java.awt.Dimension(14, 28));

        txtOptionC1.setMinimumSize(new java.awt.Dimension(14, 28));

        txtOptionD1.setMinimumSize(new java.awt.Dimension(14, 28));

        chkOptionA.setText("a.");

        chkOptionB.setText("b.");

        chkOptionC.setText("c.");

        chkOptionD.setText("d.");

        jLabel4.setText("Llene los campos de las opciones y seleccione las múltiples opciones correctas");

        javax.swing.GroupLayout jPnlMultipleChoiceLayout = new javax.swing.GroupLayout(jPnlMultipleChoice);
        jPnlMultipleChoice.setLayout(jPnlMultipleChoiceLayout);
        jPnlMultipleChoiceLayout.setHorizontalGroup(
            jPnlMultipleChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlMultipleChoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnlMultipleChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPnlMultipleChoiceLayout.createSequentialGroup()
                        .addGroup(jPnlMultipleChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkOptionA)
                            .addComponent(chkOptionB)
                            .addComponent(chkOptionC)
                            .addComponent(chkOptionD))
                        .addGap(18, 18, 18)
                        .addGroup(jPnlMultipleChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOptionB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtOptionC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtOptionD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtOptionA1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPnlMultipleChoiceLayout.setVerticalGroup(
            jPnlMultipleChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlMultipleChoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPnlMultipleChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkOptionA)
                    .addComponent(txtOptionA1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlMultipleChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOptionB1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkOptionB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlMultipleChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOptionC1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkOptionC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnlMultipleChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOptionD1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkOptionD))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPnlOptions.add(jPnlMultipleChoice, "card4");

        btnGuardarPregunta.setText("Guardar Pregunta");
        btnGuardarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPreguntaActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor:");

        javax.swing.GroupLayout pnlNewQuestionLayout = new javax.swing.GroupLayout(pnlNewQuestion);
        pnlNewQuestion.setLayout(pnlNewQuestionLayout);
        pnlNewQuestionLayout.setHorizontalGroup(
            pnlNewQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewQuestionLayout.createSequentialGroup()
                .addGroup(pnlNewQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPnlOptions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlNewQuestionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlNewQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlNewQuestionLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(cmbQuestionType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewQuestionLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)
                                .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardarPregunta)))))
                .addContainerGap())
            .addGroup(pnlNewQuestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNewQuestionLayout.setVerticalGroup(
            pnlNewQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewQuestionLayout.createSequentialGroup()
                .addGroup(pnlNewQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbQuestionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPnlOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNewQuestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarPregunta)
                    .addComponent(jLabel3)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.add(pnlNewQuestion, "new_question");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEnviar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(btnNuevaPregunta)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevaPregunta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEnviar)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaPreguntaActionPerformed
        cmbQuestionType.setSelectedIndex(0);
        txaStatement.setText("");
        txtValue.setText("");
        txtOptionA.setText("");
        txtOptionB.setText("");
        txtOptionC.setText("");
        txtOptionD.setText("");
        txtOptionA1.setText("");
        txtOptionB1.setText("");
        txtOptionC1.setText("");
        txtOptionD1.setText("");
        btnGroupUnique.clearSelection();
        chkOptionA.setSelected(false);
        chkOptionB.setSelected(false);
        chkOptionC.setSelected(false);
        chkOptionD.setSelected(false);
        
        switchCard("new_question");
    }//GEN-LAST:event_btnNuevaPreguntaActionPerformed

    private void cmbQuestionTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbQuestionTypeActionPerformed
        switch(cmbQuestionType.getSelectedIndex()) {
            case 0:
                jPnlUniqueChoice.setVisible(false);
                jPnlEmpty3.setVisible(true);
                break;
            case 1:
                jPnlEmpty3.setVisible(false);
                jPnlMultipleChoice.setVisible(false);
                jPnlUniqueChoice.setVisible(true);
                break;
            case 2:
                jPnlEmpty3.setVisible(false);
                jPnlUniqueChoice.setVisible(false);
                jPnlMultipleChoice.setVisible(true);
                break;
        }
    }//GEN-LAST:event_cmbQuestionTypeActionPerformed

    private void btnGuardarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPreguntaActionPerformed
        String statement = txaStatement.getText().trim();
        double value = Double.parseDouble(txtValue.getText().trim());
        List<String> options = new ArrayList(); 
        
        switch(cmbQuestionType.getSelectedIndex()) {
            case 0:
                ExamController.getInstance()
                        .addQuestionOpenAnswer(QuestionType.OPEN, statement, value);
                break;
            case 1:
                int correctOption = -1;
                if (radOptionA.isSelected()) {
                    correctOption = 0;
                } else if (radOptionB.isSelected()) {
                    correctOption = 1;
                } else if (radOptionC.isSelected()) {
                    correctOption = 2;
                } else if (radOptionD.isSelected()) {
                    correctOption = 3;
                }
                options.add(txtOptionA.getText().trim());
                options.add(txtOptionB.getText().trim());
                options.add(txtOptionC.getText().trim());
                options.add(txtOptionD.getText().trim());
                ExamController.getInstance()
                        .addQuestionUniqueAnswer(QuestionType.UNIQUE, 
                                statement, value, options, correctOption);
                break;
            case 2:
                List<Integer> correctOptions = new ArrayList();
                if (chkOptionA.isSelected()) {
                    correctOptions.add(0);
                }
                if (chkOptionB.isSelected()) {
                    correctOptions.add(1);
                }
                if (chkOptionC.isSelected()) {
                    correctOptions.add(2);
                }
                if (chkOptionD.isSelected()) {
                    correctOptions.add(3);
                }
                options.add(txtOptionA1.getText().trim());
                options.add(txtOptionB1.getText().trim());
                options.add(txtOptionC1.getText().trim());
                options.add(txtOptionD1.getText().trim());
                ExamController.getInstance()
                        .addQuestionMultipleAnswer(QuestionType.MULTIPLE, 
                                statement, value, options, correctOptions);
                break;
        }    
    }//GEN-LAST:event_btnGuardarPreguntaActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        ExamController.getInstance().saveExam();
    }//GEN-LAST:event_btnEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.ButtonGroup btnGroupUnique;
    private javax.swing.JButton btnGuardarPregunta;
    private javax.swing.JButton btnNuevaPregunta;
    private javax.swing.JCheckBox chkOptionA;
    private javax.swing.JCheckBox chkOptionB;
    private javax.swing.JCheckBox chkOptionC;
    private javax.swing.JCheckBox chkOptionD;
    private javax.swing.JComboBox<String> cmbQuestionType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPnlEmpty2;
    private javax.swing.JPanel jPnlEmpty3;
    private javax.swing.JPanel jPnlMultipleChoice;
    private javax.swing.JPanel jPnlOptions;
    private javax.swing.JPanel jPnlUniqueChoice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlNewQuestion;
    private javax.swing.JRadioButton radOptionA;
    private javax.swing.JRadioButton radOptionB;
    private javax.swing.JRadioButton radOptionC;
    private javax.swing.JRadioButton radOptionD;
    private javax.swing.JTextArea txaStatement;
    private javax.swing.JTextField txtOptionA;
    private javax.swing.JTextField txtOptionA1;
    private javax.swing.JTextField txtOptionB;
    private javax.swing.JTextField txtOptionB1;
    private javax.swing.JTextField txtOptionC;
    private javax.swing.JTextField txtOptionC1;
    private javax.swing.JTextField txtOptionD;
    private javax.swing.JTextField txtOptionD1;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables

    @Override
    public void switchCard(String card) {
        if (card.equals("new_question")) {
            jPnlEmpty2.setVisible(false);
            jPnlUniqueChoice.setVisible(false);
            jPnlMultipleChoice.setVisible(false);
            pnlNewQuestion.setVisible(true);
        }
    }
}
