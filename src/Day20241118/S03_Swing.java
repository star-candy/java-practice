package Day20241118;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyBoarder extends JFrame {
    public MyBoarder() {
        this.setTitle("보더 레이아웃");
        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout()); //보더 레이아웃 설정 (동서남북 중앙 설정)

        JButton btn1 = new JButton("버튼1");
        JButton btn2 = new JButton("버튼2");
        JButton btn3 = new JButton("버튼3");
        JButton btn4 = new JButton("버튼4");
        JButton btn5 = new JButton("버튼5");

        //동서남북 설정은 add시에 진행
        this.add(btn1, BorderLayout.PAGE_START); //북쪽에 버튼 위치
        this.add(btn2, BorderLayout.PAGE_END); //남쪽에 버튼 위치
        this.add(btn3, BorderLayout.LINE_START); //서쪽에 버튼 위치
        this.add(btn4, BorderLayout.LINE_END); //동쪽에 버튼 위치
        this.add(btn5, BorderLayout.CENTER); //중앙에 버튼 위치


        this.setVisible(true);
    }
}
public class S03_Swing {
    public static void main(String[] args) {
        new MyBoarder();
    }
}
