package com.example.thriftfashion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

   EditText userName;
   EditText userEmail;
   EditText userPassword;
   EditText userConfirmPassword;
   Button buttonRegister;

   FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        userName = findViewById(R.id.etGroupTen1);
        userEmail = findViewById(R.id.etGroupTen3);
        userPassword = findViewById(R.id.etGroupTen);
        userConfirmPassword = findViewById(R.id.etGroupEight);
        buttonRegister = findViewById(R.id.btnCreateAccount);

        mAuth = FirebaseAuth.getInstance();
        buttonRegister.setOnClickListener(view ->{
              createUser();
        });

        buttonRegister.setOnClickListener(view ->{
            startActivity(new Intent(Register.this, Login.class));
        });
    }
    private void createUser(){
         String email = userEmail.getText().toString();
         String password = userPassword.getText().toString();

         if(TextUtils.isEmpty(email)){
             userEmail.setError("Email should not be empty");
             userEmail.requestFocus();
         }
         else if(TextUtils.isEmpty(password)){
             userPassword.setError("Password should not be empty");
             userPassword.requestFocus();
         }
         else{
             mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                 @Override
                 public void onComplete(@NonNull Task<AuthResult> task) {
                     if (task.isSuccessful()){
                         Toast.makeText(Register.this, "User Register Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Register.this, Login.class));
                     }
                     else{
                         Toast.makeText(Register.this, "Registration Failed: " + task.getException().getMessage(),
                                 Toast.LENGTH_SHORT).show();
                     }
                 }
             });
         }
    }
}