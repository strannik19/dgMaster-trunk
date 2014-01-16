/*
 * dgMaster: A versatile, open source data generator.
 *(c) 2007 M. Michalakopoulos, mmichalak@gmail.com
 */


package generator.panels;
import generator.extenders.RandomiserInstance;
import generator.extenders.RandomiserPanel;

import java.util.LinkedHashMap;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;


public class PanelReferencialPDFDiscreteRandomiser extends RandomiserPanel
{

	private static final long serialVersionUID = -619635112589155303L;
	/** Creates new form PanelSequencer */
    public PanelReferencialPDFDiscreteRandomiser()
    {
        initComponents();
    }
    
    
    public void initialise(RandomiserInstance ri)
    {
        txtName.setText( ri.getName() );
        txtDescription.setText( ri.getDescription() );
        
        String sRefPos;
        String sTargetPos ;
        String skeyPos ;
        String inputfile;
        String countPos;
        LinkedHashMap<String, String> hashMap;
        
        hashMap = ri.getProperties();
        sRefPos  = (String) hashMap.get("referentialPosition");
        sTargetPos  = (String) hashMap.get("targetPosition");
        skeyPos  = (String) hashMap.get("keyPosition");
        countPos = (String) hashMap.get("countPosition");
        inputfile  = (String) hashMap.get("inputFile");
        
        spinReferentialPosition.setValue(Integer.parseInt(sRefPos));
        spinTargetPosition.setValue(Integer.parseInt(sTargetPos));
        spinKeyPosition.setValue(Integer.parseInt(skeyPos));
        spinCountPosition.setValue(Integer.parseInt(countPos));
        textInputFilePath.setText(inputfile);
    }
     
    
    public RandomiserInstance getRandomiserInstance()
    {
        String name, description;
        Integer refPosition, targetPosition, keyPosition, countPosition; 
        String inputFile;       
        LinkedHashMap<String, String> hashMap = new LinkedHashMap<String, String>();
        RandomiserInstance ri = new RandomiserInstance();
        
        //get field values
        name = txtName.getText().trim();
        description  = txtDescription.getText().trim();
        refPosition = (Integer) spinReferentialPosition.getModel().getValue();
        targetPosition = (Integer) spinTargetPosition.getModel().getValue();
        keyPosition = (Integer) spinKeyPosition.getModel().getValue();
        countPosition = (Integer) spinCountPosition.getModel().getValue();
        inputFile = textInputFilePath.getText().trim();

        //create the hashmap
        hashMap.put("referentialPosition",refPosition.toString());
        hashMap.put("targetPosition",targetPosition.toString());
        hashMap.put("keyPosition",keyPosition.toString());
        hashMap.put("countPosition",countPosition.toString());
        hashMap.put("inputFile",inputFile);
        
        ri.setRandomiserType("ReferentialPDFDiscreteRandomiser");
        ri.setName(name);
        ri.setDescription(description);
        ri.setProperties(hashMap); 
                
        return ri;
    }
    
  
    public boolean isFormValid()
    {
        String name,inputFile;
        
        //get field values
        name = txtName.getText().trim();
        inputFile = textInputFilePath.getText().trim();
               
        //run checks
        if(name.length()==0)
        {
            JOptionPane.showMessageDialog(this,"Please provide a value for the name.","Required field",JOptionPane.ERROR_MESSAGE); 
            return false;
        }

        if(inputFile.length()==0)
        {
            JOptionPane.showMessageDialog(this,"Please provide a value for the input file.","Required field",JOptionPane.ERROR_MESSAGE); 
            return false;
        }
        return true;
    }

    
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spinReferentialPosition = new javax.swing.JSpinner();
        spinTargetPosition = new javax.swing.JSpinner();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Case description"));

        jLabel4.setText("Name:");

        jLabel5.setText("Description:");

        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        txtDescription.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDescription);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel4)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 207, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(txtName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel5)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBorder(new TitledBorder(null, "Parameters", TitledBorder.LEADING, TitledBorder.TOP, null, null));

        jLabel3.setText("Target Position");

        jLabel2.setText("Referential Position");
        
        JLabel lblKeyPosition = new JLabel();
        lblKeyPosition.setText("Key Position");
        
        spinKeyPosition = new JSpinner();
        
        lblInputFilePath = new JLabel();
        lblInputFilePath.setText("Input File Path");
        
        textInputFilePath = new JTextField();
        textInputFilePath.setColumns(1);
        
        lblCountPosition = new JLabel();
        lblCountPosition.setText("Count Position");
        
        spinCountPosition = new JSpinner();

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel2)
        								.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(spinReferentialPosition)
        								.addComponent(spinTargetPosition, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(lblKeyPosition, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(spinKeyPosition, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
        					.addGap(266))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(lblCountPosition, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(spinCountPosition, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap(266, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(lblInputFilePath, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(textInputFilePath, GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        					.addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(spinReferentialPosition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(spinTargetPosition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(spinKeyPosition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblKeyPosition))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblCountPosition)
        				.addComponent(spinCountPosition, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblInputFilePath)
        				.addComponent(textInputFilePath, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(53))
        );
        jPanel1.setLayout(jPanel1Layout);

        GroupLayout layout = new GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        				.addComponent(jPanel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(3)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(56, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinReferentialPosition;
    private javax.swing.JSpinner spinTargetPosition;
    private JSpinner spinKeyPosition;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtName;
    private JLabel lblInputFilePath;
    private JTextField textInputFilePath;
    private JLabel lblCountPosition;
    private JSpinner spinCountPosition;
}