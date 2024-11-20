package Day20241118;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class AbsLayout extends JFrame { //사용자 절대위치 사용 예제
    public AbsLayout() {
        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null); //container 내 기본 배치관리자 삭제

        JLabel lab = new JLabel("자바 절대 위치");
        lab.setLocation(130, 50);
        lab.setSize(200, 20);
        c.add(lab);

        JButton btn = new JButton("300, 70");
        btn.setLocation(300, 70);
        btn.setSize(50, 20);
        c.add(btn);


        this.setVisible(true);
    }
}



public class S06_Swing {
    public static void main(String[] args) {
        new AbsLayout();
    }
}
