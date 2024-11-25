package Day20241125;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MouseEventEx extends JFrame {
    public MouseEventEx() {
        this.setSize(300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("마우스를 클릭하거나 움직여보세요");
        label.addMouseMotionListener(new MouseMotionAdapter() { //adapter를 이용하여 필요한 메소드만 구현(인페 대신 추상 클래스 사용), 마우스 이동 관련
            @Override
            public void mouseMoved(MouseEvent e) {
                label.setText("마우스 움직임: " + e.getX() + ", " + e.getY());
            }
        });

        label.addMouseListener(new MouseAdapter() { //adapter를 이용하여 필요한 메소드만 구현(인페 대신 추상 클래스 사용)
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("클릭: " + e.getX() + ", " + e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("마우스 들어옴");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("마우스 나감");
            }
        });




        add(label, "Center"); //frame은 boarderLayout이므로 center에 배치
        this.setVisible(true);
    }
}

public class S01_mouseEvent {
    public static void main(String[] args) {
        new MouseEventEx();
    }
}
