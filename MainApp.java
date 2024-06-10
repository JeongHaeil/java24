package frame;

import javax.swing.*;
import java.awt.*;

public class MainApp {
    public static void main(String[] args) {
        // 창 크기 정의
        Dimension windowSize = new Dimension(1000, 800);
        UserDataSet users = new UserDataSet(); // UserDataSet 객체 생성

        // EventQueue.invokeLater를 사용하여 스윙 코드를 이벤트 디스패치 스레드에서 실행
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LoginForm(users, windowSize);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

