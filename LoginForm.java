package com.rachael.JavaUIExample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame
{
    private JPanel mainPanel;
    private JButton loginButton;
    private JTextField userNameTextField;
    private JTextField passwordTextField;
    private JCheckBox rememberOnThisComputerCheckBox;

    public LoginForm(){

        setLocation(500, 200);
        setSize(1000, 700);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userName = userNameTextField.getText();
                String password = passwordTextField.getText();
                if(userName != "" && password != ""){

                    new MainForm().setVisible(true);
                    dispose();
                }
            }
        });
    }

    public static void main (String[] args){
        LoginForm loginForm = new LoginForm();
        loginForm.setContentPane(new LoginForm().mainPanel);
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginForm.setVisible(true);

    }
}
