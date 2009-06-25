/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.afraid.poison.db2php;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import org.afraid.poison.db2php.generator.Table;
import org.netbeans.api.db.explorer.ConnectionManager;
import org.netbeans.api.db.explorer.DatabaseConnection;
import org.netbeans.api.db.explorer.support.DatabaseExplorerUIs;

public final class PhpClassVisualPanel1 extends JPanel {

	/** Creates new form PhpClassVisualPanel1 */
	public PhpClassVisualPanel1() {
		initComponents();
		DatabaseExplorerUIs.connect(connectionSelector, ConnectionManager.getDefault());
	}

	@Override
	public String getName() {
		return "Step #1";
	}

	public List<Table> getSelected() {
		List selectedObjects=getTablesSelection()!=null?Arrays.asList(getTablesSelection().getSelectedValues()):new ArrayList();
		return new ArrayList<Table>(selectedObjects);
	}

	@Override
	public boolean isValid() {
		System.err.println(getSelected().size());
		return getSelected().size()>0;
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        connectionSelector = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablesSelection = new javax.swing.JList();

        connectionSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectionSelectorActionPerformed(evt);
            }
        });
        connectionSelector.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                connectionSelectorPropertyChange(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(PhpClassVisualPanel1.class, "PhpClassVisualPanel1.jLabel1.text")); // NOI18N

        jScrollPane1.setViewportView(tablesSelection);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(connectionSelector, 0, 415, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connectionSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

	private void connectionSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectionSelectorActionPerformed
		// TODO add your handling code here:
		DefaultListModel tablesModel=new DefaultListModel();
		DatabaseConnection conn=(DatabaseConnection) getConnectionSelector().getSelectedItem();
		if (null!=conn) {
			//tablesModel.addElement(conn.getDisplayName());
			Set<Table> tables=Table.getTables(conn);
			for (Table t : tables) {
				tablesModel.addElement(t);
			}
			getTablesSelection().setModel(tablesModel);
		}
		getTablesSelection().setModel(tablesModel);
		firePropertyChange("test", new Object(), new Object());
	}//GEN-LAST:event_connectionSelectorActionPerformed

	private void connectionSelectorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_connectionSelectorPropertyChange
		// TODO add your handling code here:
	}//GEN-LAST:event_connectionSelectorPropertyChange
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox connectionSelector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList tablesSelection;
    // End of variables declaration//GEN-END:variables

	/**
	 * @return the connectionSelector
	 */
	public javax.swing.JComboBox getConnectionSelector() {
		return connectionSelector;
	}

	/**
	 * @param connectionSelector the connectionSelector to set
	 */
	public void setConnectionSelector(javax.swing.JComboBox connectionSelector) {
		this.connectionSelector=connectionSelector;
	}

	/**
	 * @return the tablesSelection
	 */
	public javax.swing.JList getTablesSelection() {
		return tablesSelection;
	}

	/**
	 * @param tablesSelection the tablesSelection to set
	 */
	public void setTablesSelection(javax.swing.JList tablesSelection) {
		this.tablesSelection=tablesSelection;
	}
}

