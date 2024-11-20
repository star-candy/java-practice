package Day20241120;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyEvent extends JFrame implements ActionListener { //이벤트 관리 위한 actionListener 인페 추가 (추상 구현 필요)
    JButton button;

    public MyEvent() {
        this.setSize(600, 500);//frame 크기지정
        this.setLocation(1200, 20);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("이벤트 발생 버튼");
        //button 클릭시 이벤트 동작하도록 추가
        button.addActionListener(this); //myEvent 객체가 이벤트를 받을 것 명시 필요, 따라서 this로 현재 객체 명시
        this.add(button);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //이벤트 발생시 동작 코드, 이벤트 코드는 e에 저장
        System.out.println("이벤트 발생 버튼");
    }
}

public class S01_SwingEvent {
    public static void main(String[] args) {
        new MyEvent();
    }
}
