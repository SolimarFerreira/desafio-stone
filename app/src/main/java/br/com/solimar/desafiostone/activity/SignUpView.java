package br.com.solimar.desafiostone.activity;

public interface SignUpView {

    void showHomePage();

    void emailValidateError(int message);

    void nameValidateError(int message);

    void passwordValidateError(int message);
}
