package com.example.thriftfashion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    EditText userEmailLogin;
    EditText userPasswordLogin;
    Button buttonLogin;

    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userEmailLogin = findViewById(R.id.etGroupTen1);
        userPasswordLogin = findViewById(R.id.etGroupTen);
        buttonLogin= findViewById(R.id.btnCreateAccount);

        mAuth = FirebaseAuth.getInstance();

        buttonLogin.setOnClickListener(view -> {
            loginUser();
        });

        buttonLogin.setOnClickListener(view ->{
            startActivity(new Intent(Login.this,HomePage.class));
        });
    }

    public void loginUser(){
        String emailLogin = userEmailLogin.getText().toString();
        String password = userPasswordLogin.getText().toString();

        if(TextUtils.isEmpty(emailLogin)){
            userEmailLogin.setError("UserName should not be empty");
            userEmailLogin.requestFocus();
        }
        else if(TextUtils.isEmpty(password)){
            userPasswordLogin.setError("Password should not be empty");
            userPasswordLogin.requestFocus();
        }else{
            mAuth.signInWithEmailAndPassword(emailLogin, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(Login.this, "User Login Successful", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Login.this, HomePage.class));
                    }else{
                        Toast.makeText(Login.this, "LogIn error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}