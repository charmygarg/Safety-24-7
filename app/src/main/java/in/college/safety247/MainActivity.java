package in.college.safety247;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LoginDataBaseAdapter loginDataBaseAdapter;
    EditText userEdit, passEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginDataBaseAdapter = new LoginDataBaseAdapter(this);
        loginDataBaseAdapter = loginDataBaseAdapter.open();

    }

    public void buttonClicked(View v)
    {
        if(v.getId() == R.id.loginButton)
        {

            userEdit = (EditText) findViewById(R.id.user_editText);
            String user = userEdit.getText().toString();
            passEdit = (EditText) findViewById(R.id.pass_editText);
            String pass = passEdit.getText().toString();

            String storedPassword=loginDataBaseAdapter.getSingleEntry(user);
            if(pass.equals(storedPassword))
            {
                Toast.makeText(MainActivity.this, "Successfully Login", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Showpager.class);
                startActivity(intent);

            }
            else
            {
                Toast.makeText(MainActivity.this, "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
            }

        }
        if(v.getId() == R.id.signupTextView)
        {
            Intent intent = new Intent(MainActivity.this,SignUp.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Close The Database
        loginDataBaseAdapter.close();
    }
}
