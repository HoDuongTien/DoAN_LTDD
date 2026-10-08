package com.hoduongtien.chiyeuminhem.presentation.auth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.hoduongtien.chiyeuminhem.data.repository.AuthRepository;

public class LoginViewModel extends ViewModel {

    private final AuthRepository authRepository;

    private final MutableLiveData<Boolean> loginSuccess =
            new MutableLiveData<>();

    private final MutableLiveData<String> errorMessage =
            new MutableLiveData<>();

    public LoginViewModel() {
        authRepository = new AuthRepository();
    }

    public void login(String email, String password) {

        if (email == null || email.trim().isEmpty()) {
            errorMessage.setValue("Vui lòng nhập email");
            return;
        }

        if (password == null || password.isEmpty()) {
            errorMessage.setValue("Vui lòng nhập mật khẩu");
            return;
        }

        authRepository.login(
                email.trim(),
                password,
                new AuthRepository.AuthCallback() {

                    @Override
                    public void onSuccess() {
                        loginSuccess.setValue(true);
                    }

                    @Override
                    public void onError(String message) {
                        errorMessage.setValue(message);
                    }
                }
        );
    }

    public LiveData<Boolean> getLoginSuccess() {
        return loginSuccess;
    }

    public LiveData<String> getErrorMessage() {
        return errorMessage;
    }
}