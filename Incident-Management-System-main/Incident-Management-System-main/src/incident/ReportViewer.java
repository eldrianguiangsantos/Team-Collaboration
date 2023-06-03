package incident;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ReportViewer extends JFrame {
    private JTextArea reportTextArea;

    public ReportViewer() {
        initComponents();
    }

    private void initComponents() {
        reportTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(reportTextArea);
        getContentPane().add(scrollPane);

        setTitle("Report Viewer");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
    }

    public void setReportText(String reportText) {
        reportTextArea.setText(reportText);
    }
}
