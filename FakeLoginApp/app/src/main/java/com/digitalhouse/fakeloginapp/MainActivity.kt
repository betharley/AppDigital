package com.digitalhouse.fakeloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.digitalhouse.fakeloginapp.users.UserService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val btnLogin by lazy { findViewById<Button>(R.id.login_btnLogin) }
    private val login_edtEmail by lazy { findViewById<EditText>(R.id.login_edtEmail) }
    private val login_edtPassword by lazy { findViewById<EditText>(R.id.login_edtPassword) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRegister.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity( intent )
        }

        btnLogin.setOnClickListener {
            val email = login_edtEmail.text.toString().trim()
            val senha = login_edtPassword.text.toString().trim()

            if ( email.isEmpty() )
                login_edtEmail.error = "Digite o seu email..."
            else if (senha.isEmpty() )
                login_edtPassword.error = "Digite a sua senha..."
            else{
                try {
                    UserService.logIn( email, senha)
                    Toast.makeText(this, "${email}  -  ${senha}", Toast.LENGTH_LONG).show()
                    val intentHome = Intent(this, HomeActivity::class.java)
                    intentHome.putExtra("nome", "")
                    startActivity( intentHome )

                }catch (erro: Exception){
                    Toast.makeText(this, "Erro ao fazer login. \n Verifique seu usuario e senha", Toast.LENGTH_LONG).show()
                }
            }
        }

    }
}