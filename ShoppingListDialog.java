package frame;

import javax.swing.*;
import java.awt.*;

public class ShoppingListDialog extends JDialog {

    public ShoppingListDialog(JFrame owner) {
        super(owner, "Shopping List", true);
        init();
        setDisplay();
        addListeners();
        showFrame();
    }

    private void init() {
        // Dialog 초기화
        setLayout(new BorderLayout());
    }

    private void setDisplay() {
        // 필요한 컴포넌트 배치
        add(new JLabel("Shopping List 내용"), BorderLayout.CENTER);
    }

    private void addListeners() {
        // 필요한 리스너 추가
    }

    private void showFrame() {
        pack();
        setLocationRelativeTo(getOwner());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}

