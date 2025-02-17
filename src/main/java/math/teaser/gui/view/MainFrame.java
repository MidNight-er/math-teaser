package math.teaser.gui.view;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class MainFrame extends JFrame {

    private final SMPanelViewImpl centralPanelView = new SMPanelViewImpl();

    public MainFrame(String title) throws HeadlessException {
        super(title);
        initFrame();
    }

    private void initFrame() {
        setLayout(new BorderLayout(10, 5));
        setSize(800, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(centralPanelView, BorderLayout.CENTER);
        initListener();
        setVisible(true);
    }

    public SMPanelView getCentralPanelView() {
        return centralPanelView;
    }

    private void initListener() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE){
                    SMPanelView.Presenter smPanelViewPresenter = centralPanelView.getSMPanelViewPresenter();
                    smPanelViewPresenter.onTease();
                }
            }
        });
    }
}
