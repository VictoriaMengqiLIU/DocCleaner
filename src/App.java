/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.SwingWorker;


/**
 *
 * @author Victoria
 */


public class App extends javax.swing.JFrame {

    
    public App() {
        initComponents();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        this.setSearchStatus(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        fieldPath = new javax.swing.JTextField();
        buttonFile = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaResult = new javax.swing.JTextArea();
        labelStatus = new javax.swing.JLabel();
        labelCurrent = new javax.swing.JLabel();
        labelOf = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        fieldCurrent = new javax.swing.JTextField();
        buttonAbort = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        fileChooser.setApproveButtonText("Select");
        fileChooser.setCurrentDirectory(new java.io.File("/C:"));
        fileChooser.setDialogTitle("Choose a directory...");
        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fieldPath.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        buttonFile.setText("...");
        buttonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFileActionPerformed(evt);
            }
        });

        buttonSearch.setFont(new java.awt.Font("Chalkboard SE", 1, 30)); // NOI18N
        buttonSearch.setText("Search");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        areaResult.setEditable(false);
        areaResult.setColumns(20);
        areaResult.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        areaResult.setRows(5);
        areaResult.setOpaque(false);
        jScrollPane1.setViewportView(areaResult);

        labelStatus.setFont(new java.awt.Font("Chalkboard SE", 1, 14)); // NOI18N
        labelStatus.setText("Ready");
        labelStatus.setOpaque(true);

        labelCurrent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCurrent.setOpaque(true);

        labelOf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelOf.setOpaque(true);

        labelTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTotal.setOpaque(true);

        fieldCurrent.setEditable(false);
        fieldCurrent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        buttonAbort.setFont(new java.awt.Font("Chalkboard SE", 2, 30)); // NOI18N
        buttonAbort.setForeground(new java.awt.Color(255, 0, 0));
        buttonAbort.setText("Abort");
        buttonAbort.setEnabled(false);
        buttonAbort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAbortActionPerformed(evt);
            }
        });

        menu.setText("Doc Cleaner");

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        menu.add(aboutMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.setToolTipText("Quit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        menu.add(exitMenuItem);

        menuBar.add(menu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldCurrent)
                            .addComponent(fieldPath, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelOf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 423, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonFile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAbort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldPath, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFile)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCurrent)
                            .addComponent(labelOf)
                            .addComponent(labelTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCurrent))
                    .addComponent(buttonAbort, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        new About(this).setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void buttonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFileActionPerformed
        this.fileChooser.showOpenDialog(this);
    }//GEN-LAST:event_buttonFileActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        String dir = fieldPath.getText();
        Engine engine = Engine.getMD5(new File(dir));
        this.areaResult.setText("");
        setSearchStatus(true);
        this.fieldCurrent.setText(0 + "");
        this.updater.reset();
        this.searchworker = new SearchWorker(this.updater, engine);
        searchworker.execute();
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonAbortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAbortActionPerformed
        this.searchworker.cancel(true);
        this.setSearchStatus(false);
        this.labelStatus.setText("Aborted!");
        this.areaResult.setText("Operation aborted!");
    }//GEN-LAST:event_buttonAbortActionPerformed

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        File file = this.fileChooser.getSelectedFile();
        if ( file != null ) {
            this.fieldPath.setText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_fileChooserActionPerformed
    
    
    class SearchWorker extends SwingWorker<String, Object> {
        private Updater informer;
        private Engine engine;
        private String text = "";
        
        public SearchWorker(Updater informer, Engine engine) {
            this.informer = informer;
            this.engine = engine;
        }
        
        public String doInBackground() {
            try
            {
                text = engine.findDuplicates(informer);
            }
            catch (Exception e)
            {
                text = "Invalid path!";
                labelStatus.setText("Error!");
            }
            return text;
        }
        
        @Override
        public void done() {
            if (text.equals("")) {
                text = "No duplicates found!";
            }
            areaResult.setText(text);
            setSearchStatus(false);
        }
    }
    
    
    public class Updater {
        private int current = 1;

        private void reset() {
            this.current = 1;
        }
        
        public void setCurrent(String dir) {
            fieldCurrent.setText(dir);
            labelCurrent.setText(this.current + "");
            ++this.current;
        }
        
        public void setFinished() {
            labelStatus.setText("Finished!");
        }
        
        public void setPreparing() {
            labelOf.setText("");
            labelCurrent.setText("");
            labelTotal.setText("");
            labelStatus.setText("Preparing...");
        }
        
        public void setScanning() {
            labelOf.setText("of");
            labelStatus.setText("Scanning...");
        }
        
        public void setTotal(int total) {
            labelTotal.setText(total + "");
        }
    }
    
    
    private void setSearchStatus(boolean bool) {
        this.buttonAbort.setEnabled(bool);
        this.labelCurrent.setEnabled(bool);
        this.labelOf.setEnabled(bool);
        this.labelTotal.setEnabled(bool);
        this.fieldCurrent.setEnabled(bool);
        
        this.fieldPath.setEnabled(!bool);
        this.buttonFile.setEnabled(!bool);
        this.fieldPath.setEditable(!bool);
        this.buttonSearch.setEnabled(!bool);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
	try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
		if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
	} 
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
	} 
        catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
	} 
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
	} 
        catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
	}

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }
    
    
    private SearchWorker searchworker;
    private Updater updater = new Updater();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JTextArea areaResult;
    private javax.swing.JButton buttonAbort;
    private javax.swing.JButton buttonFile;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JTextField fieldCurrent;
    private javax.swing.JTextField fieldPath;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCurrent;
    private javax.swing.JLabel labelOf;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
