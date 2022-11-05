package com.onlycats.onlycats.front;

import com.onlycats.onlycats.back.domain.UserDto;
import com.onlycats.onlycats.back.domain.Users;
import com.onlycats.onlycats.back.service.NewAccountService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PreserveOnRefresh;
import com.vaadin.flow.router.Route;
import org.springframework.http.server.DelegatingServerHttpResponse;

import java.util.Optional;

@Route("newAccount")
@PreserveOnRefresh
public class CreateAccountView extends Div {

    private NewAccountService newAccountService = new NewAccountService();

    private TextField nameTextField = new TextField("Name");
    private TextField surnameTextField = new TextField("Surname");
    private TextField emailTextField = new TextField("email");
    private TextField usernameTextField = new TextField("Username");
    private TextField passwordTextField = new TextField("Password");
    private TextField repeatPasswordTextField = new TextField("Repeat password");
    private Button buttonSubmit = new Button("Submit");

    private Button test = new Button("test");
    public CreateAccountView() {

        add(nameTextField, surnameTextField, emailTextField, usernameTextField, passwordTextField, repeatPasswordTextField, buttonSubmit, test);


    buttonSubmit.addClickListener(event ->
            newAccountService.createNewUser(
                    new UserDto(nameTextField.getValue(), surnameTextField.getValue(), emailTextField.getValue(), usernameTextField.getValue(), passwordTextField.getValue(), repeatPasswordTextField.getValue())));

    test.addClickListener(event -> newAccountService.createNewUser(new UserDto("a", "a", "a", "a", "a", "a")));
    }

}


