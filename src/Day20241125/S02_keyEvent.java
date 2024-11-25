package Day20241125;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class keyEventex extends JFrame {
    public keyEventex() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JLabel label = new JLabel("키보드를 눌러보세요");
        label.addMouseWheelListener(e -> { //추상 메서드 1개인 함수형 인터페이스는 람다식으로 사용 가능
            int rotate = e.getWheelRotation(); //0보다 작으면 휠 올라감. 크면 내려감
            if(rotate < 0) {
                label.setText("휠 올림" + rotate);
            } else {
                label.setText("휠 내림" + rotate);
            }
        });



        JTextArea textArea = new JTextArea(3, 3);
        textArea.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {
                label.setText("키 press: " + e.getKeyChar()); //입력된 키값을 알려줌
            }
            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("키 press: " + KeyEvent.getKeyText(e.getKeyCode())); //입력된 키값을 알려줌
            }
            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("키 released: " + KeyEvent.getKeyText(e.getKeyCode())); //입력된 키값을 알려줌
            }
        });



        this.add(textArea, "North");
        this.add(label, "Center");
        this.setVisible(true);
    }
}
public class S02_keyEvent {
    public static void main(String[] args) {
        new keyEventex();
    }
}
