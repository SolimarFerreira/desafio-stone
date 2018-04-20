package br.com.solimar.desafiostone.presenter;

public interface SignUpPresenter {

    void validateFields(String name, String password, String confirmPassword, String email);

    void saveUser(String name, String password, String email);
}
