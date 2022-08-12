package nissan.rayappu.no1435235.nis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Nis3Activity extends AppCompatActivity {
    // Nissan Rayappu n01435235 CENG 258 RNB

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    public boolean onMenuItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.position:
                startActivity(new Intent(this, Position.class));
                return true;
            default:
                return super.onMenuItemSelected(item);
        }
    }
}