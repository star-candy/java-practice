package Day20241118;

import java.util.Scanner;
import javax.swing.JFrame;

public class S01_Swing extends JFrame {
    //크기, 제목, x버튼, 시각화 활성화 까지 기본 필요
    public S01_Swing() { //생성자 내에서 코딩 진행함
        this.setTitle("윈도우 창"); //제목
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼 누르면 jframe을 실제로 종료



        this.setVisible(true); //시각화
    }

    public static void main(String[] args) {
        new S01_Swing();
    }

}
