package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddIngredientDialog extends JDialog {
    private JTextField ingredientNameField;
    private JTextField categoryField;
    private JTextField remainingDaysField;
    private JButton addButton;
    private JButton cancelButton;

    public AddIngredientDialog(JFrame frame, String title) {
        super(frame, title, true);
        initComponents(frame);
    }

    private void initComponents(JFrame frame) {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("이름:"));
        ingredientNameField = new JTextField();
        inputPanel.add(ingredientNameField);

        inputPanel.add(new JLabel("분류:"));
        categoryField = new JTextField();
        inputPanel.add(categoryField);

        inputPanel.add(new JLabel("남은기간:"));
        remainingDaysField = new JTextField();
        inputPanel.add(remainingDaysField);

        add(inputPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        addButton = new JButton("추가");
        cancelButton = new JButton("취소");

        buttonPanel.add(addButton);
        buttonPanel.add(cancelButton);

        add(buttonPanel, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = ingredientNameField.getText();
                String category = categoryField.getText();
                String remainingDays = remainingDaysField.getText();

                if (name.isEmpty() || category.isEmpty() || remainingDays.isEmpty()) {
                    JOptionPane.showMessageDialog(AddIngredientDialog.this,
                            "모든 필드를 입력하세요.",
                            "입력 오류",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                DefaultTableModel tableModel = (DefaultTableModel) ((MainFrame) frame).getTable().getModel();
                tableModel.addRow(new Object[]{category, name, remainingDays});
                dispose();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        pack();
        setLocationRelativeTo(getOwner());
    }
}
