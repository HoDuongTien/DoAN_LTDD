
package com.hoduongtien.chiyeuminhem.presentation.auth;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.hoduongtien.chiyeuminhem.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText edtName;
    private EditText edtEmail;
    private EditText edtPassword;

    private Button btnRegister;
    private TextView txtLogin;

    private RegisterViewModel registerViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        // Ánh xạ giao diện
        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);

        btnRegister = findViewById(R.id.btnRegister);
        txtLogin = findViewById(R.id.txtLogin);

        // Khởi tạo ViewModel
        registerViewModel =
                new ViewModelProvider(this).get(RegisterViewModel.class);

        // Kiểm tra sự kiện nhập liệu
        edtName.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                Log.d("REGISTER_DEBUG", "Đã chọn ô Họ và tên");
            }
        });

        edtEmail.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                Log.d("REGISTER_DEBUG", "Đã chọn ô Email");
            }
        });

        edtPassword.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus) {
                Log.d("REGISTER_DEBUG", "Đã chọn ô Mật khẩu");
            }
        });

        // Xử lý đăng ký
        btnRegister.setOnClickListener(v -> {

            Log.d("REGISTER_DEBUG", "Đã bấm nút Tạo tài khoản");

            String name = edtName.getText().toString().trim();
            String email = edtEmail.getText().toString().trim();
            String password = edtPassword.getText().toString();

            registerViewModel.register(name, email, password);
        });

        // Kiểm tra nút Đăng nhập
        txtLogin.setOnClickListener(v -> {
            Toast.makeText(
                    RegisterActivity.this,
                    "Đã bấm Đăng nhập",
                    Toast.LENGTH_SHORT
            ).show();
        });

        // Đăng ký thành công
        registerViewModel.getRegisterSuccess().observe(this, success -> {
            if (Boolean.TRUE.equals(success)) {
                Toast.makeText(
                        RegisterActivity.this,
                        "Đăng ký thành công!",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        // Thông báo lỗi
        registerViewModel.getErrorMessage().observe(this, message -> {
            if (message != null && !message.isEmpty()) {
                Toast.makeText(
                        RegisterActivity.this,
                        message,
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }
}
