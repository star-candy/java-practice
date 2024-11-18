package Day20241118;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyWindow2 extends JFrame {
    public MyWindow2() {
        this.setTitle("버튼 3개"); //없어도 ㄱㅊ
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout()); //위치 관리자 설정, flow시 최상단에 중앙정렬
        //this.setLayout(new FlowLayout(FlowLayout.LEFT)); //내부에 상수 정의 가능 (특정 위치 정렬 가능)
        //this.setLayout(new FlowLayout(FlowLayout.TRALING, 30, 40); //버튼간 간격 설정 가능
        JButton btn1 = new JButton("OK");
        JButton btn2 = new JButton("Cancel");
        JButton btn3 = new JButton("Ignore"); //해당 버튼을 컨테이너에 넣어야 보임

        this.add(btn1);
        this.add(btn2);
        this.add(btn3);

        this.setVisible(true);
    }
}

public class S02_Swing {
    public static void main(String[] args) {
        new MyWindow2();
    }
}
