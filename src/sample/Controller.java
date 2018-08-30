package sample;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {
    TextField email, username, password;

    public void touchLogin(ActionEvent actionEvent) {

        Model model = new  Model();
        String hashPassword = model.generatePasswordHash(password.getText());
        System.out.print(hashPassword);

    }
}

