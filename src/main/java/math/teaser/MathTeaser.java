package math.teaser;

import java.awt.*;
import javax.swing.*;

import math.teaser.gui.presenter.SMPresenter;
import math.teaser.gui.view.MainFrame;
import math.teaser.gui.view.SMPanelView;

public class MathTeaser {

    public static void main(String... args) {
        new MathTeaser().initialize();
    }

    public void initialize() {
        EventQueue.invokeLater(() -> {
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        MainFrame mainFrame = new MainFrame("math-teaser");
        SMPanelView centralPanelView = mainFrame.getCentralPanelView();
        new SMPresenter(centralPanelView);
    }
}
