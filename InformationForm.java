package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InformationForm extends JDialog {
    private LoginForm owner;
    private UserDataSet users;

    private JTextArea taCheck;
    private JButton btnWithdraw;

    public InformationForm(LoginForm owner) {
        super(owner, "Information", true);
        this.owner = owner;
        this.users = owner.getUsers();

        init();
        setDisplay();
        addListeners();
        showFrame();
    }

    private void init() {
        taCheck = new JTextArea(10, 30);
        taCheck.setEditable(false);

        btnWithdraw = new JButton("회원 탈퇴");
    }

    private void setDisplay() {
        JPanel pnlMain = new JPanel();
        pnlMain.setLayout(new BorderLayout());
        pnlMain.add(new JScrollPane(taCheck), BorderLayout.CENTER);

        JPanel pnlSouth = new JPanel();
        pnlSouth.add(btnWithdraw);

        add(pnlMain, BorderLayout.CENTER);
        add(pnlSouth, BorderLayout.SOUTH);
    }

    private void addListeners() {
        btnWithdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                users.withdraw(owner.getTfId());
                JOptionPane.showMessageDialog(
                        InformationForm.this,
                        "회원 정보가 삭제되었습니다. 안녕히가세요."
                );
                dispose();
                owner.setVisible(true); // 로그인 창 다시 보여주기
            }
        });
    }

    public void setTaCheck(String text) {
        taCheck.setText(text);
    }

    private void showFrame() {
        pack();
        setLocationRelativeTo(owner);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}
