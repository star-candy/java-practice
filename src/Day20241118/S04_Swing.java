package Day20241118;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class MyBoarder1 extends JFrame {
    public MyBoarder1() {
        this.setTitle("보더 레이아웃");
        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout()); //보더 레이아웃 설정 (동서남북 중앙 설정)

        //JButton btn1 = new JButton("버튼1");
        JButton btn2 = new JButton("버튼2");
        JButton btn3 = new JButton("버튼3");
        JButton btn4 = new JButton("버튼4");
        JButton btn5 = new JButton("버튼5");


        JButton b1 = new JButton("메뉴 1"); //묶여질 버튼 3개
        JButton b2 = new JButton("메뉴 2");
        JButton b3 = new JButton("메뉴 3");

        JPanel jpn = new JPanel(); //패널 생성, 패널에 버튼 넣는다.
        jpn.setLayout(new FlowLayout()); //패널에 FlowLayout 설정 (최상단 중앙정렬)
        jpn.add(b1); //패널에 버튼 추가
        jpn.add(b2);
        jpn.add(b3);


        //동서남북 설정은 add시에 진행
        this.add(jpn, BorderLayout.PAGE_START); //버튼 3개를 한번에 북쪽에 구성하기
        this.add(btn2, BorderLayout.PAGE_END); //남쪽에 버튼 위치
        this.add(btn3, BorderLayout.LINE_START); //서쪽에 버튼 위치
        this.add(btn4, BorderLayout.LINE_END); //동쪽에 버튼 위치
        this.add(btn5, BorderLayout.CENTER); //중앙에 버튼 위치

        btn5.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "버튼5 클릭");
        });//버튼 클릭시 이벤트 처리 기능


        this.setVisible(true);
    }
}
public class S04_Swing {
    public static void main(String[] args) {
        new MyBoarder1();
    }
}