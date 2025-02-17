package math.teaser.mvc.view;

public interface SMPanelView {

    interface Presenter {
        void onTease();
    }

    void setPresenter(Presenter presenter);

    void setRepresentation(String representation);
}
