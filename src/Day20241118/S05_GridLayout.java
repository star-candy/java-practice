package Day20241118;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyGridLayout extends JFrame {
    //객체 내에 있는 변수(인스턴트 변수) -> 객체 입장 : 지역변수
    // -> 객체 내 메서드 입장 : 전역변수



    public MyGridLayout() {
        this.setTitle("grid layout 사용");
        this.setSize(300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4, 3, 1, 1)); //4행 3열 grid 구성, 1,1,은 간격, 버튼 12개 가능
        //add 순서대로 좌상단부터 배치됨 따라서 789 순 add

        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        add(btn7); add(btn8); add(btn9);

        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        add(btn4); add(btn5); add(btn6);

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        add(btn1); add(btn2); add(btn3);

        JButton btnPm = new JButton("+/-");
        JButton btn0 = new JButton("0");
        JButton btn00 = new JButton("00");

        add(btnPm); add(btn0); add(btn00);

        
        
        
        this.setVisible(true);
    }
}

public class S05_GridLayout {
    public static void main(String[] args) {
        new MyGridLayout();

    }
}
