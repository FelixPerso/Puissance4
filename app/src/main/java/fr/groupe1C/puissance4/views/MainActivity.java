package main.java.fr.groupe1C.puissance4;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import fr.groupe1C.puissance4.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.Queue;


public class MainActivity extends AppCompatActivity {

    private TextView mGreetingTextView;
    private EditText mNameEditText;
    // on recupere les colonnes avec l'id colonne 1,2,3,4,5,6,7 dans activity_game.xml
    private LinearLayout mColonne1;
    private LinearLayout mColonne2;
    private LinearLayout mColonne3;
    private LinearLayout mColonne4;
    private LinearLayout mColonne5;
    private LinearLayout mColonne6;
    private LinearLayout mColonne7;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // on récupere les colonnes dans une file LinkedList<Colonne>
        Queue<LinearLayout> colonnes = new LinkedList<>();
        mColonne1 = findViewById(R.id.colonne1);
        mColonne2 = findViewById(R.id.colonne2);
        mColonne3 = findViewById(R.id.colonne3);
        mColonne4 = findViewById(R.id.colonne4);
        mColonne5 = findViewById(R.id.colonne5);
        mColonne6 = findViewById(R.id.colonne6);
        mColonne7 = findViewById(R.id.colonne7);

        colonnes.add(mColonne1);
        colonnes.add(mColonne2);
        colonnes.add(mColonne3);
        colonnes.add(mColonne4);
        colonnes.add(mColonne5);
        colonnes.add(mColonne6);
        colonnes.add(mColonne7);
        /*for (int i = 1; i <= 7; i++) {
            int id = getResources().getIdentifier("colonne" + i, "id", getPackageName());
        }*/

        // on affiche les colonnes dans la console
        for (LinearLayout colonne : colonnes) {
            System.out.println(colonne);
        }
    }
}