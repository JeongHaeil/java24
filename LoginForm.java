package frame;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LoginForm extends JFrame {
    private static final long serialVersionUID = 1L;

    private UserDataSet users;

    private JLabel lblId;
    private JLabel lblPw;
    private JTextField tfId;
    private JPasswordField tfPw;
    private JButton btnLogin;
    private JButton btnJoin;

    public LoginForm(UserDataSet users, Dimension windowSize) {
        this.users = users;

        init(windowSize);
        setDisplay();
        addListeners();
        showFrame();
    }

    public void init(Dimension windowSize) {
        // 사이즈 통합
        Dimension lblSize = new Dimension(80, 30);
        int tfSize = 10;
        Dimension btnSize = new Dimension(100, 25);

        lblId = new JLabel("ID");
        lblId.setPreferredSize(lblSize);
        lblPw = new JLabel("Password");
        lblPw.setPreferredSize(lblSize);

        tfId = new JTextField(tfSize);
        tfPw = new JPasswordField(tfSize);

        btnLogin = new JButton("로그인");
        btnLogin.setPreferredSize(btnSize);
        btnJoin = new JButton("회원가입");
        btnJoin.setPreferredSize(btnSize);

        // LoadingScreen 초기화
        LoadingScreen loadingScreen = new LoadingScreen(windowSize);
        loadingScreen.setLocationRelativeTo(null);
        loadingScreen.setVisible(true);

        // 1.5초 후에 LoadingScreen을 닫고 LoginForm을 여는 타이머 설정
        Timer timer = new Timer(1500, e -> {
            loadingScreen.dispose(); // LoadingScreen 닫기
            this.setVisible(true);
        });
        timer.setRepeats(false); // 타이머가 한 번만 실행되도록 설정
        timer.start();
    }

    public UserDataSet getUsers() {
        return users;
    }

    public String getTfId() {
        return tfId.getText();
    }

    public void setDisplay() {
        // FlowLayout 왼쪽 정렬
        FlowLayout flowLeft = new FlowLayout(FlowLayout.LEFT);

        // pnlNorth(pnlId, pnlPw)
        JPanel pnlNorth = new JPanel(new GridLayout(0, 1));

        JPanel pnlId = new JPanel(flowLeft);
        pnlId.add(lblId);
        pnlId.add(tfId);

        JPanel pnlPw = new JPanel(flowLeft);
        pnlPw.add(lblPw);
        pnlPw.add(tfPw);

        pnlNorth.add(pnlId);
        pnlNorth.add(pnlPw);

        JPanel pnlSouth = new JPanel();
        pnlSouth.add(btnLogin);
        pnlSouth.add(btnJoin);

        pnlNorth.setBorder(new EmptyBorder(0, 20, 0, 20));
        pnlSouth.setBorder(new EmptyBorder(0, 0, 10, 0));

        add(pnlNorth, BorderLayout.NORTH);
        add(pnlSouth, BorderLayout.SOUTH);
    }

    public void addListeners() {
        btnJoin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new JoinForm(LoginForm.this, users);
                tfId.setText("");
                tfPw.setText("");
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 아이디칸이 비었을 경우
                if (tfId.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(LoginForm.this,
                            "아이디를 입력하세요.",
                            "로그인폼",
                            JOptionPane.WARNING_MESSAGE);

                    // 존재하는 아이디일 경우
                } else if (users.contains(tfId.getText())) {
                    User user = users.getUser(tfId.getText());

                    // 비밀번호칸이 비었을 경우
                    if (String.valueOf(tfPw.getPassword()).isEmpty()) {
                        JOptionPane.showMessageDialog(
                                LoginForm.this,
                                "비밀번호를 입력하세요.",
                                "로그인폼",
                                JOptionPane.WARNING_MESSAGE);

                        // 비밀번호가 일치하지 않을 경우
                    } else if (!user.getPw().equals(String.valueOf(tfPw.getPassword()))) {
                        JOptionPane.showMessageDialog(
                                LoginForm.this,
                                "비밀번호가 일치하지 않습니다.");

                        // 다 완료될 경우
                    } else {
                        dispose(); // 현재 창 닫기
                        MainFrame mainFrame = new MainFrame(new Dimension(1000, 800), users);
                        mainFrame.setVisible(true); // MainFrame 실행
                    }
                    // 존재하지 않는 Id일 경우
                } else {
                    JOptionPane.showMessageDialog(
                            LoginForm.this,
                            "존재하지 않는 Id입니다."
                    );
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                int choice = JOptionPane.showConfirmDialog(
                        LoginForm.this,
                        "로그인 프로그램을 종료합니다.",
                        "종료",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.WARNING_MESSAGE
                );
                if (choice == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

    public void showFrame() {
        setTitle("Login");
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setVisible(false); // 초기에는 보이지 않도록 설정
    }

    public static void main(String[] args) {
        UserDataSet users = new UserDataSet();
        Dimension windowSize = new Dimension(1000, 800);
        new LoginForm(users, windowSize);
    }
}
