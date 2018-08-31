package javase.chap08.countTimer;

import javax.swing.*;

/**
 * Created by Kuexun on 2018/5/16.
 */
public class MyButton extends JButton implements Colleague {
    private Mediator mediator;

    public MyButton(String text) {
        super(text);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public Mediator getMediator() {
        return mediator;
    }


    @Override
    public void setColleagueEnabled(boolean isEnabled) {
        this.setEnabled(isEnabled);
    }
}
