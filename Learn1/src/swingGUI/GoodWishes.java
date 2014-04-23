package swingGUI;

/**
 * Created with IntelliJ IDEA.
 * User: asp
 * Date: 23/04/2014
 * Time: 00:54
 * To change this template use File | Settings | File Templates.
 */

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GoodWishes extends JFrame {
    public GoodWishes() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        if (rb_Female.isSelected() && tf_FirstName != null)
            JOptionPane.showMessageDialog(null, "You are very beautiful " + tf_FirstName.getText() + " " + tf_LastName.getText());
        else if (rb_Male.isSelected() && tf_FirstName != null)
            JOptionPane.showMessageDialog(null, "You are handsome " + tf_FirstName.getText() + " " + tf_LastName.getText());
        else
            JOptionPane.showMessageDialog(null, "fill form properly");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        Spacer hSpacer1 = new Spacer();
        tf_FirstName = new JTextField();
        label2 = new JLabel();
        Spacer hSpacer2 = new Spacer();
        tf_LastName = new JTextField();
        label3 = new JLabel();
        Spacer hSpacer3 = new Spacer();
        rb_Male = new JRadioButton();
        rb_Female = new JRadioButton();
        b_GoodLuck = new JButton();
        bg = new ButtonGroup();


        bg.add(rb_Female);
        bg.add(rb_Male);

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(9, 9, new Insets(0, 0, 0, 0), 0, 0));


        //---- label1 ----
        label1.setText("First Name");
        contentPane.add(label1, new GridConstraints(1, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        contentPane.add(hSpacer1, new GridConstraints(1, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK,
                null, null, null));
        contentPane.add(tf_FirstName, new GridConstraints(1, 3, 1, 3,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

        //---- label2 ----
        label2.setText("Last Name");
        contentPane.add(label2, new GridConstraints(2, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        contentPane.add(hSpacer2, new GridConstraints(2, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK,
                null, null, null));
        contentPane.add(tf_LastName, new GridConstraints(2, 3, 1, 3,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

        //---- label3 ----
        label3.setText("Sex");
        contentPane.add(label3, new GridConstraints(3, 1, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        contentPane.add(hSpacer3, new GridConstraints(3, 2, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH,
                GridConstraints.SIZEPOLICY_CAN_GROW | GridConstraints.SIZEPOLICY_WANT_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK,
                null, null, null));

        //---- rb_Male ----
        rb_Male.setText("Male");
        contentPane.add(rb_Male, new GridConstraints(3, 3, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

        //---- rb_Female ----
        rb_Female.setText("Female");
        contentPane.add(rb_Female, new GridConstraints(3, 5, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));

        //---- b_GoodLuck ----
        b_GoodLuck.setText("Good Luck");
        b_GoodLuck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });
        contentPane.add(b_GoodLuck, new GridConstraints(5, 3, 1, 1,
                GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                null, null, null));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables

    private JLabel label1;
    private JTextField tf_FirstName;
    private JLabel label2;
    private JTextField tf_LastName;
    private JLabel label3;
    private JRadioButton rb_Male;
    private JRadioButton rb_Female;
    private JButton b_GoodLuck;
    public ButtonGroup bg;


    // JFormDesigner - End of variables declaration  //GEN-END:variables
}