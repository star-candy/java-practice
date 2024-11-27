package Day20241120;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyEvent3 extends JFrame { //actionListenr 귀찮음 - 이벤트 직접 관리하자
    JButton button, btnM; //버튼 2개 구성


    public MyEvent3() {
        this.setSize(300, 400);//frame 크기지정
        this.setLocation(1200, 20);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout()); //상단 중앙정렬

        button = new JButton("첫번째 버튼");
        button.addActionListener(new ActionListener() { //익명 객체로서 사용 - 해당 버튼대한 이벤트 처리
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("첫번째 버튼 이벤트");
            }
        });

        btnM = new JButton("두번째 버튼"); //해당 버튼도 이벤트 받을것
        btnM.addActionListener(e -> { //람다로 사용 가능, e로 이벤트 받으면 동작하는 방식
            System.out.println("두번째 버튼 리스너");
        });


        this.add(button);
        this.add(btnM);
        this.setVisible(true);
    }


}

public class S03_SwingEvent {
    public static void main(String[] args) {
        new MyEvent3();
    }
}