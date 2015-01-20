/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FileUpload.java
 *
 * Created on Feb 1, 2010, 11:52:43 AM
 */

/**
 *
 * @author gbenga
 */
public class FileUpload extends javax.swing.JApplet {

    /** Initializes the applet FileUpload */
    public void init() {
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /** This method is called from within the init() method to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        deselect_all_button = new javax.swing.JButton();
        select_all_button = new javax.swing.JButton();
        upload_button = new javax.swing.JButton();
        content_area = new javax.swing.JScrollPane();
        album_selection = new javax.swing.JComboBox();
        directory_pane = new javax.swing.JScrollPane();
        directory_tree = new javax.swing.JTree();

        setStub(null);

        deselect_all_button.setText("Deselect All");

        select_all_button.setText("Select All");

        upload_button.setText("Upload");
        upload_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upload_buttonMouseClicked(evt);
            }
        });

        content_area.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        content_area.setHorizontalScrollBar(null);

        album_selection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deselect_all_button)
                        .addGap(18, 18, 18)
                        .addComponent(select_all_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(upload_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(album_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(content_area, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deselect_all_button)
                    .addComponent(album_selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_all_button)
                    .addComponent(upload_button))
                .addGap(50, 50, 50)
                .addComponent(content_area, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addGap(65, 65, 65))
        );

        jSplitPane1.setRightComponent(jPanel1);

        directory_pane.setViewportView(directory_tree);

        jSplitPane1.setLeftComponent(directory_pane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void upload_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upload_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_upload_buttonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox album_selection;
    private javax.swing.JScrollPane content_area;
    private javax.swing.JButton deselect_all_button;
    private javax.swing.JScrollPane directory_pane;
    private javax.swing.JTree directory_tree;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton select_all_button;
    private javax.swing.JButton upload_button;
    // End of variables declaration//GEN-END:variables

}
