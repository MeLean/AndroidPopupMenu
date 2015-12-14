package telerikandroid.milen.com.androidpopup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.View;

import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView iwBlue, iwStupid, iwSunset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iwBlue = (ImageView) findViewById(R.id.iwBlue);
        iwStupid = (ImageView) findViewById(R.id.iwStupid);
        iwSunset = (ImageView) findViewById(R.id.iwSunset);

        iwBlue.setOnClickListener(this);
        iwStupid.setOnClickListener(this);
        iwSunset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId){
            case R.id.iwBlue: showPopup(iwBlue, "Blue Image", "100x100" , "www.google.bg/blue.jpg"); break;
            case R.id.iwStupid: showPopup(iwStupid, "My stupid drawings", "100x100" , "www.google.bg/stupid.jpg"); break;
            case R.id.iwSunset: showPopup(iwSunset, "Sunset", "100x100" , "www.google.bg/sunset.jpg"); break;
        }
    }

    private void showPopup(View view, String imageName, String imageSize,String imageLink){
        PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);
        popupMenu.inflate(R.menu.menu_blue);
        popupMenu.getMenu().findItem(R.id.image_name).setTitle("Name: " + imageName);
        popupMenu.getMenu().findItem(R.id.image_size).setTitle("Size: " + imageSize);
        popupMenu.getMenu().findItem(R.id.image_link).setTitle("Link: " + imageLink);
        popupMenu.show();
    }
}
