package br.com.solimar.desafiostone.activity;

public interface LoginView {

    void showHomePage();

    void emailValidateError(int message);

    void passwordValidateError(int message);

    void invalidLogin(int message);
}
