package com.onlycats.onlycats.front;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class LoginView extends Div {

    private H1 welcome = new H1("Welcome to Only Cats");
    private Button buttonNewAccount = new Button("Create new account", event -> UI.getCurrent().navigate(CreateAccountView.class));
    private Button buttonForgotPassword = new Button("Forgot Password");
    private Button buttonLogIn = new Button("LogIn");
    private TextField textFieldUsername = new TextField();
    private TextField textFieldPassword = new TextField();
    private Notification notification = new Notification();

public LoginView(){

    setId("login-view");
    add(welcome, textFieldUsername, textFieldPassword);
    textFieldUsername.setLabel("Username");
    textFieldPassword.setLabel("Password");
    add(buttonNewAccount);

}

}
