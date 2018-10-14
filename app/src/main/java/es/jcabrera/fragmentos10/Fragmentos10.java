package es.jcabrera.fragmentos10;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class Fragmentos10 extends FragmentActivity {

    Adaptador mPagerAdapter;
    ViewPager mviewPager;
    private List<Fragment> listaFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentos10);

        listaFragments = new ArrayList<Fragment>();
        listaFragments.add(new Fragmento1());
        listaFragments.add(new Fragmento2());
        listaFragments.add(new Fragmento1());
        listaFragments.add(new Fragmento2());
        listaFragments.add(new Fragmento1());

        mPagerAdapter = new Adaptador(getSupportFragmentManager(),
                listaFragments);

        mviewPager = (ViewPager) findViewById(R.id.viewPager);

        mviewPager.setAdapter(mPagerAdapter);
    }
}
