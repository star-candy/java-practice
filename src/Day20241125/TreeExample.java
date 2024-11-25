package Day20241125;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode; 
class TreeEx extends JFrame {
    public TreeEx() {
        this.setTitle("Tree Example");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("학과");

        DefaultMutableTreeNode ai = new DefaultMutableTreeNode("인공지능");

        DefaultMutableTreeNode deep = new DefaultMutableTreeNode("딥러닝");
        DefaultMutableTreeNode big = new DefaultMutableTreeNode("빅데이터");
        DefaultMutableTreeNode py = new DefaultMutableTreeNode("파이썬");
        ai.add(deep);
        ai.add(big); //부모 노드에 자식 노드 추가
        ai.add(py);

        DefaultMutableTreeNode sec = new DefaultMutableTreeNode("정보보호");

        DefaultMutableTreeNode sys = new DefaultMutableTreeNode("시스템보안");
        DefaultMutableTreeNode intro = new DefaultMutableTreeNode("정보보호개론");
        DefaultMutableTreeNode hack = new DefaultMutableTreeNode("인터넷해킹");
        sec.add(sys);
        sec.add(intro);
        sec.add(hack);

        DefaultMutableTreeNode com = new DefaultMutableTreeNode("컴퓨터공학");

        DefaultMutableTreeNode mo = new DefaultMutableTreeNode("모바일개발");
        DefaultMutableTreeNode csys = new DefaultMutableTreeNode("컴퓨터시스템");
        DefaultMutableTreeNode clang = new DefaultMutableTreeNode("C언어");
        com.add(mo);
        com.add(csys);
        com.add(clang);

        root.add(ai);
        root.add(sec); //root에 자식 노드 추가
        root.add(com);

        JTree tree = new JTree(root); //tree 구성하는 컨테이너
        JLabel label = new JLabel("Selected: None");

        tree.addTreeSelectionListener(e -> { //tree 선택에 대한 이벤트 처리
            label.setText("Selected: " + e.getPath().getLastPathComponent());
        });

        this.add(new JScrollPane(tree), "Center");
        this.add(label, "South");
        this.setVisible(true);
    }
}
public class TreeExample {
    public static void main(String[] args) {
        new TreeEx();
    }
}
