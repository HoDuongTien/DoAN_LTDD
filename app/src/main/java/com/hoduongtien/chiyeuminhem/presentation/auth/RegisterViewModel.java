package com.hoduongtien.chiyeuminhem.presentation.auth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.hoduongtien.chiyeuminhem.data.repository.AuthRepository;

public class RegisterViewModel extends ViewModel {

    private final AuthRepository authRepository;

    private final MutableLiveData<Boolean> registerSuccess =
            new MutableLiveData<>();

    private final MutableLiveData<String> errorMessage =
            new MutableLiveData<>();

    public RegisterViewModel() {
        authRepository = new AuthRepository();
    }

    public void register(String name, String email, String password) {

        if (name == null || name.trim().isEmpty()) {
            errorMessage.setValue("Vui lòng nhập họ tên");
            return;
        }

        if (email == null || email.trim().isEmpty()) {
            errorMessage.setValue("Vui lòng nhập email");
            return;
        }

        if (password == null || password.length() < 6) {
            errorMessage.setValue("Mật khẩu phải có ít nhất 6 ký tự");
            return;
        }

        authRepository.register(
                name.trim(),
                email.trim(),
                password,
                new AuthRepository.AuthCallback() {

                    @Override
                    public void onSuccess() {
                        registerSuccess.setValue(true);
                    }

                    @Override
                    public void onError(String message) {
                        errorMessage.setValue(message);
                    }
                }
        );
    }

    public LiveData<Boolean> getRegisterSuccess() {
        return registerSuccess;
    }

    public LiveData<String> getErrorMessage() {
        return errorMessage;
    }
}