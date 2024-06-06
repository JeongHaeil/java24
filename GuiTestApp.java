package java_4;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.JComboBox;

public class GuiTestApp extends JFrame {

    private JTextField textField_1;
    private JComboBox<Integer> monthCombo;
    private JComboBox<Integer> yearCombo;
    private JTextArea day;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GuiTestApp window = new GuiTestApp();
                    window.setVisible(true);  // window.frame 대신 window를 사용
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public GuiTestApp() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        // this를 JFrame으로 초기화
        setBounds(100, 100, 1653, 907);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1639, 87);
        getContentPane().add(panel);
        panel.setLayout(null);

        textField_1 = new JTextField();
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setFont(new Font("굴림", Font.BOLD, 40));
        textField_1.setText("냉장고");
        textField_1.setBounds(0, 0, 1639, 87);
        panel.add(textField_1);
        textField_1.setColumns(10);

        JTree tree = new JTree();
        tree.setForeground(new Color(0, 0, 0));
        tree.setFont(new Font("굴림", Font.BOLD, 20));
        tree.setModel(new DefaultTreeModel(
                new DefaultMutableTreeNode("카테고리") {
                    {
                        add(new DefaultMutableTreeNode("육류"));
                        add(new DefaultMutableTreeNode("채소"));
                        add(new DefaultMutableTreeNode("가공식품"));
                    }
                }
        ));
        tree.setBackground(new Color(255, 250, 205));
        tree.setBounds(0, 89, 218, 781);
        getContentPane().add(tree);

        JTextPane textPane = new JTextPane();
        textPane.setBounds(1310, 89, 329, 428);
        getContentPane().add(textPane);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(219, 86, 1089, 731);
        getContentPane().add(scrollPane);

        JTextArea textArea = new JTextArea();
        scrollPane.setViewportView(textArea);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(932, 816, 376, 54);
        getContentPane().add(panel_1);
        panel_1.setLayout(new GridLayout(0, 2, 0, 0));

        JButton btnNewButton = new JButton("추가");
        panel_1.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(GuiTestApp.this, "추가되었습니다", "알림", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});

        JButton btnNewButton_1 = new JButton("삭제");
        panel_1.add(btnNewButton_1);
        btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(GuiTestApp.this,"삭제되었습니다","알림",JOptionPane.INFORMATION_MESSAGE);
				
			}
		} );

        // 월 선택 콤보박스
        monthCombo = new JComboBox<>();
        for (int i = 1; i <= 12; i++) {
            monthCombo.addItem(i);
        }
        monthCombo.setBounds(1310, 480, 160, 30);
        getContentPane().add(monthCombo);

        // 연도 선택 콤보박스
        yearCombo = new JComboBox<>();
        for (int i = 2020; i <= 2030; i++) {
            yearCombo.addItem(i);
        }
        yearCombo.setBounds(1480, 480, 160, 30);
        getContentPane().add(yearCombo);

        // JTextArea 추가
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(1310, 518, 329, 352);
        getContentPane().add(scrollPane_1);

        day = new JTextArea();
        day.setFont(new Font("Monospaced", Font.PLAIN, 14)); 
        scrollPane_1.setViewportView(day);

        // 현재 날짜로 초기화
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        int currentMonth = cal.get(Calendar.MONTH) + 1; // 월은 0부터 시작하므로 1 더함

        yearCombo.setSelectedItem(currentYear);
        monthCombo.setSelectedItem(currentMonth);

        // 초기 달력 표시
        showCalendar();

        // 콤보박스 변경 이벤트 리스너 추가
        ActionListener comboBoxListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showCalendar();
            }
        };
        monthCombo.addActionListener(comboBoxListener);
        yearCombo.addActionListener(comboBoxListener);
    }

    private void showCalendar() {
        int month = (int) monthCombo.getSelectedItem() - 1; // 월은 0부터 시작
        int year = (int) yearCombo.getSelectedItem();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);

        int startDay = calendar.get(Calendar.DAY_OF_WEEK);
        int numberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        String[] headers = {"일", "월", "화", "수", "목", "금", "토"};
        day.setText(""); // JTextArea 초기화

        // 헤더 추가
        for (String header : headers) {
            day.append(String.format("%-5s", header)); // 고정된 너비로 헤더 추가
        }
        day.append("\n");

        // 빈 공간 추가
        for (int i = 1; i < startDay; i++) {
            day.append(String.format("%-5s", "")); // 고정된 너비로 빈 공간 추가
        }

        // 날짜 추가
        for (int d = 1; d <= numberOfDays; d++) {
            day.append(String.format("%-5d", d)); // 고정된 너비로 날짜 추가
            if ((startDay + d - 1) % 7 == 0) {
                day.append("\n");
            }
        }

        day.append("\n");
    }
}


