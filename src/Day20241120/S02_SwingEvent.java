package Day20241120;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyEvent2 extends JFrame implements ActionListener { //이벤트 관리 위한 actionListener 인페 추가 (추상 구현 필요)
    JButton button, btnM; //버튼 2개 구성


    public MyEvent2() {
        this.setSize(300, 400);//frame 크기지정
        this.setLocation(1200, 20);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout()); //상단 중앙정렬

        button = new JButton("이벤트 발생 버튼");
        //button 클릭시 이벤트 동작하도록 추가
        button.addActionListener(this); //myEvent 객체가 이벤트를 받을 것 명시 필요, 따라서 this로 현재 객체 명시

        btnM = new JButton("2번째 버튼"); //해당 버튼도 이벤트 받을것
        btnM.addActionListener(this);

        this.add(button);
        this.add(btnM);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) { //이벤트 발생시 동작 코드, 어떤 이벤트인지 판단 필요
        if(e.getActionCommand().equals("이벤트 발생 버튼")) { //어떤 버튼에서 이벤트 발생했는지 판단 가능 (버튼의 내용으로 파악)
            System.out.println("1번 버튼 동작");
        } else if(e.getActionCommand().equals("2번째 버튼")) { //2번 버튼에 이벤트 발생 확인 - 버튼 내용으로 파악
            System.out.println("2번 버튼 동작");
        }
    }
}

public class S02_SwingEvent {
    public static void main(String[] args) {
        new MyEvent2();
    }
}
