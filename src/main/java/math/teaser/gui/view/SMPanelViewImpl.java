package math.teaser.gui.view;

import java.awt.*;
import javax.swing.*;

public class SMPanelViewImpl extends JPanel implements SMPanelView {

    private final Font font = new Font("Sans-serif", Font.PLAIN, 22);
    private final JLabel representation = new JLabel("Press space to start");

    private Presenter presenter;

    public SMPanelViewImpl() {
        initView();
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    private void initView() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(2, 2, 2, 2);

        setBackground(Color.DARK_GRAY);
        representation.setForeground(Color.LIGHT_GRAY);
        representation.setFont(font);
        add(representation);
    }

    public Presenter getSMPanelViewPresenter() {
        return presenter;
    }

    @Override
    public void setRepresentation(String representation) {
        this.representation.setText(representation);
    }
}
