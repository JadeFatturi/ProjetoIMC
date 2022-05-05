package View;


import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Dimension;


/*public class SimpleTabbedPane extends JPanel {
    public SimpleTabbedPane() {
        initializeUI();
    }*\
   
 /*
    public static void showFrame() {
        JPanel panel = new SimpleTabbedPane();
        panel.setOpaque(true);
       

        JFrame frame = new JFrame("Saude em dia");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleTabbedPane::showFrame);
    }

    private void initializeUI() {
        JTabbedPane tabbedPane = new JTabbedPane();


        JPanel dashboardPanel1 = new JPanel();
        
        JLabel aguaLabel = new JLabel("C\u00E1lculo de consumo de \u00E1gua di\u00E1rio");
        aguaLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
        aguaLabel.setVerticalAlignment(SwingConstants.BOTTOM);
        dashboardPanel1.add(aguaLabel);
 
      
    
        // Add Dashboard Tab
        tabbedPane.addTab("Consumo de água", dashboardPanel1);
        
                JPanel dashboardPanel = new JPanel();
                
                JLabel imcLabel = new JLabel("C\u00E1lculo de IMC");
                imcLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
                dashboardPanel.add(imcLabel);
         
                
                        // Add Dashboard Tab
                        tabbedPane.addTab("IMC", dashboardPanel);
        
        JPanel transactionPanel = new JPanel();
        
        JLabel tmblabel = new JLabel("C\u00E1lculo de taxa metab\u00F3lica basal");
        tmblabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
        transactionPanel.add(tmblabel);
       

        // Add Transactions Tab
        tabbedPane.addTab("TMB", transactionPanel);

        JPanel accountPanel = new JPanel();
        
        JLabel rcqLabel = new JLabel("C\u00E1lculo rela\u00E7\u00E3o cintura-quadril ");
        rcqLabel.setFont(new Font("Arial Black", Font.PLAIN, 22));
        accountPanel.add(rcqLabel);
             
        

        
        // Add Account Tab
        tabbedPane.addTab("RCQ", accountPanel);
        
        

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(500, 500));
        this.add(tabbedPane, BorderLayout.CENTER);
        
    
    }
}*/

