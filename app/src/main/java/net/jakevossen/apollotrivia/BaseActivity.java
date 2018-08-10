package net.jakevossen.apollotrivia;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class BaseActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.info:
                showInfo();
                return true;
            case R.id.version:
                showVersion();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showVersion() {
        String versionName = BuildConfig.VERSION_NAME;
        Context context = getApplicationContext();
        CharSequence text = "Version " + versionName;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    private void showInfo() {
        Intent intent = new Intent(this, Info.class);
        startActivity(intent);
    }

    // Old method when the website was in the bar
    private void openWebsite() {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://jakevossen.net/apollotrivia"));
        startActivity(browserIntent);
    }
}
