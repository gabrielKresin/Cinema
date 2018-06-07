/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import controladores.Sala;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import PopUps.PopUps;
import controladores.Venda;
import controladores.Metodos;
import javax.swing.JComboBox;

/**
 *
 * @author 104869
 */
public class FormGerenteVendaIngresso extends javax.swing.JFrame {

    Metodos m = new Metodos();
    
    static void start(){
        java.awt.EventQueue.invokeLater(() ->{
            new FormGerenteVendaIngresso().setVisible(true);
        });
    }
    
    public FormGerenteVendaIngresso() {
        initComponents();
        adicionaLinhasTabela();
        
        Metodos metodo = new Metodos();
        comboSalas.setModel(metodo.listarSalas());
    }

    public void adicionaLinhasTabela(){
        Sala s = new Sala();
        DefaultTableModel modelo = (DefaultTableModel) tabelaSalas.getModel();
        ArrayList<Sala> salas = s.getSalas();
        Object rowData[] = new Object[6];
        for (int i = 0; i < salas.size(); i++) {
            rowData[0] = salas.get(i).getNome();
            rowData[1] = salas.get(i).getFilme();
            rowData[2] = salas.get(i).getData();
            rowData[3] = salas.get(i).getPreco();
            rowData[4] = salas.get(i).getEspaco();
            rowData[5] = salas.get(i).getEspacoDisponivel();
            modelo.addRow(rowData);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        labelSala = new javax.swing.JLabel();
        labelIngressos = new javax.swing.JLabel();
        comboSalas = new JComboBox();
        textIngressos = new javax.swing.JTextField();
        botaoComprar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        labelDesconto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSalas = new javax.swing.JTable();
        checkDesconto = new javax.swing.JCheckBox();
        labelTipoFilme = new javax.swing.JLabel();
        opcaoNormal = new javax.swing.JRadioButton();
        opcao3D = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelSala.setText("Selecione a sala:");

        labelIngressos.setText("Quantidade de ingressos:");

        comboSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSalasActionPerformed(evt);
            }
        });

        textIngressos.setNextFocusableComponent(botaoComprar);

        botaoComprar.setText("Comprar");
        botaoComprar.setNextFocusableComponent(botaoCancelar);
        botaoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprarActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.setNextFocusableComponent(comboSalas);
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        labelDesconto.setText("Desconto:");

        tabelaSalas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome da Sala", "Filme", "Horário", "Preço", "Assentos", "Assentos disponíveis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaSalas);

        checkDesconto.setToolTipText("Desconto de 50%.");

        labelTipoFilme.setText("Tipo de Filme:");

        buttonGroup1.add(opcaoNormal);
        opcaoNormal.setText("Normal");
        opcaoNormal.setToolTipText("Sem acréscimo de valor.");

        buttonGroup1.add(opcao3D);
        opcao3D.setText("3D");
        opcao3D.setToolTipText("Acréscimo de 12R$ ao valor total.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDesconto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelSala, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelIngressos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelTipoFilme, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textIngressos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkDesconto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(opcaoNormal)
                                .addGap(18, 18, 18)
                                .addComponent(opcao3D)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDesconto)
                            .addComponent(checkDesconto))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSala)
                            .addComponent(comboSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTipoFilme)
                            .addComponent(opcaoNormal)
                            .addComponent(opcao3D))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIngressos)
                            .addComponent(textIngressos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(205, 205, 205)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(222, 222, 222))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprarActionPerformed
        Sala s = new Sala();
        boolean invalido = false;
        Venda v = new Venda();
        double preco = 0;
        if((!opcaoNormal.isSelected()) && (!opcao3D.isSelected())){
            PopUps.displayErrorMessageJOP("Selecione uma opção!", this);
            invalido = true;
            return;
        }
        if(textIngressos.getText().isEmpty()){
            textIngressos.requestFocus();
            PopUps.displayErrorMessageJOP("Quantidade de ingressos inválida!", this);
            invalido = true;
            return;
        }
        try{
        if(Integer.parseInt(textIngressos.getText()) <= 0){
            textIngressos.requestFocus();
            PopUps.displayErrorMessageJOP("Quantidade de ingressos inválida!", this);
            invalido = true;
            return;
        }
        }catch(Exception ex){
           PopUps.displayErrorMessageJOP("Quantidade de ingressos inválida!", this);
            invalido = true; 
            return;
        }
        for (int i = 0; i < s.getSalas().size(); i++) {
            if(comboSalas.getSelectedItem().equals(s.getSalas().get(i))){
              if(Integer.parseInt(textIngressos.getText()) > s.getSalas().get(i).getEspacoDisponivel()){
                  PopUps.displayErrorMessageJOP("Ingressos indisponíveis!\nTente uma quantidade menor ou tente outra sala.", this);
                  textIngressos.requestFocus();
                  invalido = true;
                  break;
              }else{
                  s.getSalas().get(i).setEspacoDisponivel((s.getEspacoDisponivel()-Integer.parseInt(textIngressos.getText())));
              }  
            }
        }
        if(invalido == false){
        for (int i = 0; i < s.getSalas().size(); i++) {
            if(comboSalas.getSelectedItem().equals(s.getSalas().get(i))){
                preco = s.getSalas().get(i).getPreco();
            }
        }
        if(opcao3D.isSelected()){
            preco += 12;
        }
        
        if(checkDesconto.isSelected()){
            preco = preco*(Integer.parseInt(textIngressos.getText()));
            preco = preco/2;
            v.setPreco(preco);
            this.dispose();
            FormCaixaGerente.start();
        }else{
            preco = preco*(Integer.parseInt(textIngressos.getText()));
            v.setPreco(preco);
            this.dispose();
            FormCaixaGerente.start();
        }
        }
        
    }//GEN-LAST:event_botaoComprarActionPerformed

    private void comboSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSalasActionPerformed
        m.listarSalas();
    }//GEN-LAST:event_comboSalasActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
        FormOptionGerente.start();
    }//GEN-LAST:event_botaoCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FormGerenteVendaIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGerenteVendaIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGerenteVendaIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGerenteVendaIngresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGerenteVendaIngresso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoComprar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkDesconto;
    private javax.swing.JComboBox<Sala> comboSalas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDesconto;
    private javax.swing.JLabel labelIngressos;
    private javax.swing.JLabel labelSala;
    private javax.swing.JLabel labelTipoFilme;
    private javax.swing.JRadioButton opcao3D;
    private javax.swing.JRadioButton opcaoNormal;
    private javax.swing.JTable tabelaSalas;
    private javax.swing.JTextField textIngressos;
    // End of variables declaration//GEN-END:variables
}