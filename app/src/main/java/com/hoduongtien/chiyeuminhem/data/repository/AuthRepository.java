package com.hoduongtien.chiyeuminhem.data.repository;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.hoduongtien.chiyeuminhem.data.model.User;

public class AuthRepository {

    private final FirebaseAuth firebaseAuth;
    private final FirebaseFirestore firestore;

    public AuthRepository() {
        firebaseAuth = FirebaseAuth.getInstance();
        firestore = FirebaseFirestore.getInstance();
    }

    // Đăng ký tài khoản
    public void register(String name,
                         String email,
                         String password,
                         AuthCallback callback) {

        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnSuccessListener(authResult -> {

                    if (authResult.getUser() == null) {
                        callback.onError("Không thể tạo tài khoản.");
                        return;
                    }

                    String uid = authResult.getUser().getUid();

                    User user = new User(
                            uid,
                            name,
                            email,
                            "",
                            System.currentTimeMillis()
                    );

                    firestore.collection("users")
                            .document(uid)
                            .set(user)
                            .addOnSuccessListener(unused ->
                                    callback.onSuccess()
                            )
                            .addOnFailureListener(e ->
                                    callback.onError(e.getMessage())
                            );

                })
                .addOnFailureListener(e ->
                        callback.onError(e.getMessage())
                );
    }

    // Đăng nhập
    public void login(String email,
                      String password,
                      AuthCallback callback) {

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnSuccessListener(authResult ->
                        callback.onSuccess()
                )
                .addOnFailureListener(e ->
                        callback.onError(e.getMessage())
                );
    }

    // Đăng xuất
    public void logout() {
        firebaseAuth.signOut();
    }

    // Kiểm tra đã đăng nhập chưa
    public boolean isLoggedIn() {
        return firebaseAuth.getCurrentUser() != null;
    }

    public interface AuthCallback {

        void onSuccess();

        void onError(String message);
    }
}