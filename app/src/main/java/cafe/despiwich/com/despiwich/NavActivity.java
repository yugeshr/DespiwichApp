package cafe.despiwich.com.despiwich;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;
import org.pcc.webviewOverlay.WebViewOverlay;

public class NavActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView = null;
    Toolbar toolbar = null;
    WebViewOverlay webViewOverlay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        toolbar.setTitle("Menu");

        Fragment fragment = null;
        fragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content_nav, fragment).commit();
        webViewOverlay = new WebViewOverlay(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatemen

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        displaySelectedScreen(id);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void displaySelectedScreen(int id){
        Fragment fragment = null;
        String title = null;

        switch (id){
            case R.id.nav_gallery:
                fragment = new GalleryFragment();
                title = "Gallery";
                break;
            case R.id.nav_menucard:
                fragment = new MainFragment();
                title = "Menu";
                break;
            case R.id.nav_location:
                fragment = new MapsFragment();
                title = "Location";
                break;
            case R.id.nav_send:
                sendMail();
                break;
            case R.id.nav_logout:
                String email = FirebaseAuth.getInstance().getCurrentUser().getEmail();
                Toast.makeText(this,email+" logged out", Toast.LENGTH_SHORT).show();
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(this,LoginActivity.class));
                finish();
                break;
            case R.id.social_fb:
                webViewOverlay.loadWebViewOverlay("https://www.facebook.com/Despiwich/",null);
                break;
            case R.id.social_ig:
                webViewOverlay.loadWebViewOverlay("https://www.instagram.com/despiwich/",null);
                break;
            case R.id.social_zomato:
                webViewOverlay.loadWebViewOverlay("https://www.zomato.com/chennai/despiwich-t-nagar",null);
                break;

        }

        if(fragment != null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.content_nav, fragment).commit();
            toolbar.setTitle(title);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

    }

    private void sendMail() {
        String subject = "Feedbacks/Complaints";
        Uri uri = Uri.parse("mailto:" + "")
                .buildUpon()
                .appendQueryParameter("subject", subject)
                .build();

        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, uri);
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
    }

    private void goToUrl(String url){
        Uri uri = Uri.parse(url);
        Intent launchBrower = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(launchBrower);
    }

}
