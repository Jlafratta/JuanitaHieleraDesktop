package utils;

import javafx.scene.control.TextField;

public class NumberField extends TextField {

    @Override
    public void replaceText(int i, int i1, String s) {
        if(s.matches("[0-9]") || s.trim().equals("")){
            super.replaceText(i, i1, s);
        }
    }

}
