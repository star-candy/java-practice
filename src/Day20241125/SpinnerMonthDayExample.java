package Day20241125;

import java.awt.*;
import javax.swing.*;
class SpinnerMD extends JFrame {
    public SpinnerMD() {
        this.setTitle("JSpinner Exam");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] months = {"1월","2월","3월","4월","5월","6월", //spinner에 들어갈 값 직접 조정
                "7월","8월","9월","10월","11월","12월"};
        String[] days = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};

        JSpinner monthSpinner = new JSpinner(new SpinnerListModel(months));
        JLabel monthLabel = new JLabel("Selected Month: 1월");

        monthSpinner.addChangeListener(e -> { //spinner 변경에 대한 이벤트 처리
            String selectedMonth = monthSpinner.getValue().toString(); //value를 문자열로 변환하여 label에 출력
            monthLabel.setText("Selected Month: " + selectedMonth);
        });

        JSpinner daySpinner = new JSpinner(new SpinnerListModel(days));
        JLabel dayLabel = new JLabel("Selected Day: 월요일");
        daySpinner.addChangeListener(e -> {
            String selectedDay = daySpinner.getValue().toString();
            dayLabel.setText("Selected Day: " + selectedDay);
        });

        JTabbedPane tabbedPane = new JTabbedPane(); //탭 패널에 spinner와 label을 추가

        JPanel monthPanel = new JPanel(new java.awt.FlowLayout());
        monthPanel.add(new JLabel("Selected Month: "));
        monthPanel.add(monthSpinner);
        monthPanel.add(monthLabel);
        tabbedPane.addTab("Month", monthPanel); //탭에 추가

        JPanel dayPanel = new JPanel(new java.awt.FlowLayout());
        dayPanel.add(new JLabel("Selected Day: "));
        dayPanel.add(daySpinner);
        dayPanel.add(dayLabel);
        tabbedPane.addTab("Day", dayPanel); //tap 패널에 추가

        this.add(tabbedPane);
        this.setVisible(true);
    }
}
public class SpinnerMonthDayExample {
    public static void main(String[] args) {
        new SpinnerMD();
    }
}
