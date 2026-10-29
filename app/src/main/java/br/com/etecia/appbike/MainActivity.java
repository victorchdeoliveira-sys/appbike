package br.com.etecia.appbike;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Toolbar menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //criar um método para acessar menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (R.id.Pesquisar == item.getItemId()){
            Toast.makeText(this, "Cliquei em pesquisar", Toast.LENGTH_SHORT).show();

        }

        if (R.id.Favoritar == item.getItemId()){
            Toast.makeText(this, "Cliquei em favoritar", Toast.LENGTH_SHORT).show();

        }

        if (R.id.Compartilhar == item.getItemId()){
            Toast.makeText(this, "Cliquei em compartilhar", Toast.LENGTH_SHORT).show();

        }

        if (R.id.Anexar == item.getItemId()){
            Toast.makeText(this, "Cliquei em anexar", Toast.LENGTH_SHORT).show();

        }

        return super.onOptionsItemSelected(item);
    }
}