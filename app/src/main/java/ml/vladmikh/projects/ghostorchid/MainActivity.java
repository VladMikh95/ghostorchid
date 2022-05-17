package ml.vladmikh.projects.ghostorchid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    private static final String SHARED_PREFERENCES_NAME = "sharedPreferences";
    private static final String SHARED_PREFERENCES_GAME_STARTED ="gameStarted";

    private Button buttonResume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE);

        buttonResume = findViewById(R.id.buttonMenuResume);


        //Проверяем стартовали ли ранее новую игру
        if (sharedPreferences.getBoolean(SHARED_PREFERENCES_GAME_STARTED, false)) {
            buttonResume.setVisibility(View.VISIBLE);
        } else {
            buttonResume.setVisibility(View.INVISIBLE);
        }
    }

    public void onClickStartNewGame(View view) {
    }

    public void onClickResumeGame(View view) {
        if (sharedPreferences.getBoolean(SHARED_PREFERENCES_GAME_STARTED, false)) {

        }
    }

    public void onClickAboutAuthors(View view) {
        Intent intent = new Intent(this, AuthorsActivity.class);
        startActivity(intent);
    }
}