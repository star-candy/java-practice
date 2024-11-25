package Day20241125;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ImageKeyEvent extends JFrame {
    public ImageKeyEvent() {
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        ImageIcon icon = new ImageIcon("C:\\Users\\신희수\\Desktop\\output_image1.png");
        JLabel imgLabel = new JLabel(icon);

        int initialX = 250, initialY = 250;
        imgLabel.setBounds(initialX, initialY, icon.getIconWidth(), icon.getIconHeight());

        this.addKeyListener(new KeyAdapter() {
            int x = initialX; int y = initialY;

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP -> y -= 10;

                    case KeyEvent.VK_DOWN ->
                        y += 10;

                    case KeyEvent.VK_LEFT ->
                        x -= 10;

                    case KeyEvent.VK_RIGHT->
                        x += 10;
                }
                imgLabel.setBounds(x, y, icon.getIconWidth(), icon.getIconHeight()); //키보드 입력 따라 이미지 위치 수정 가능
            }
        });
        this.add(imgLabel);
        this.setVisible(true);
    }
}
public class S03_imageKeyboardMover {
    public static void main(String[] args) {
        new ImageKeyEvent();
    }
}
