package apps.cursos.com.integrandomapas;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    int idLugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Bundle parametros = getIntent().getExtras();
        idLugar = parametros.getInt(MainActivity.EXTRA_LUGAR);



    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Add a marker in Sydney and move the camera

        switch (idLugar){
            case 1:
                LatLng catedral = new LatLng(-16.3988084,-71.5369056);
                mMap.addMarker(new MarkerOptions().position(catedral).title(getString(R.string.str_catedral)).
                        icon(BitmapDescriptorFactory.fromResource(R.drawable.icon_marker)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(catedral,16));
                break;
            case 2:
                LatLng mirador = new LatLng(-16.3874803,-71.5417448);
                mMap.addMarker(new MarkerOptions().position(mirador).title(getString(R.string.str_mirador)).
                        icon(BitmapDescriptorFactory.fromResource(R.drawable.icon_marker)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mirador,16));
                break;
            case 3:
                LatLng monasterio = new LatLng(-16.3952829,-71.5367908);
                mMap.addMarker(new MarkerOptions().position(monasterio).title(getString(R.string.str_moasterio)).
                        icon(BitmapDescriptorFactory.fromResource(R.drawable.icon_marker)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(monasterio,16));
                break;
            case 4:
                LatLng colca = new LatLng(-15.6093293,-72.0896229);
                mMap.addMarker(new MarkerOptions().position(colca).title(getString(R.string.str_canoncolca)).
                        icon(BitmapDescriptorFactory.fromResource(R.drawable.icon_marker)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(colca,16));
                break;

            default:
                break;





        }


    }
}
