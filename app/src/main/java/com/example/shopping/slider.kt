package com.example.shopping

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.tabbar.*

class slider : AppCompatActivity() {
    lateinit var x:TextView
    lateinit var y:TextView
    lateinit var q:TextView
    lateinit var z:ViewPager

    lateinit var pagerViewAdapter : adapter

    lateinit var mAdView : AdView
    private lateinit var mInterstitialAd: InterstitialAd



    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setRequestedOrientation (SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_slider)
        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-6691837928330663/7314317076"
        mInterstitialAd.loadAd(AdRequest.Builder().build())












//       getSupportActionBar()?.setDisplayShowHomeEnabled(true);
//        getSupportActionBar()?.setLogo(R.drawable.logo);
//       getSupportActionBar()?.setDisplayUseLogoEnabled(true);
//        getSupportActionBar()?.setDisplayShowTitleEnabled(true)

        x=findViewById(R.id.shop)
        y=findViewById(R.id.social)
        q=findViewById(R.id.games)
        z=findViewById(R.id.fragment)
        pagerViewAdapter= adapter(this, supportFragmentManager,2);
        z.setAdapter(pagerViewAdapter)
        z.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }
            override fun onPageSelected(position: Int) {
                onchangetab(position)

            }

        })
        x.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                z.setCurrentItem(0)
            }

        })
        y.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                z.setCurrentItem(1)
            }

        })
        q.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                z.setCurrentItem(2)
            }

        })

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.action, menu)
        var item = menu.findItem(R.id.action_favorite)

        item.setVisible(false);
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.exit -> {

            Toast.makeText(this,"Closing App", Toast.LENGTH_SHORT).show()
            finishAffinity()
            // User chose the "Settings" item, show the app settings UI...
            true
        }
        R.id.about-> {

            var intent= Intent(this,aboutus::class.java)
            startActivity(intent)
            // User chose the "Settings" item, show the app settings UI...
            true
        }
        R.id.win-> {


                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
            else
                {

            }
            // User chose the "Settings" item, show the app settings UI...
            true
        }

        R.id.action_favorite -> {
            // User chose the "Favorite" action, mark the current item
            // as a favorite...
            finish()

            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun onchangetab(position: Int) {
        if(position==0)
        {
            shop.setTextSize(21F);
            shop.setBackgroundResource(R.drawable.border)
            shop.setTextColor(Color.parseColor("#4a4848"))
            games.setTextSize(18F);
            games.setTextColor(Color.parseColor("#757373"))
            social.setTextSize(18F);
            social.setTextColor(Color.parseColor("#757373"))
        }
        if(position==1)
        {
            shop.setTextSize(18F);
            shop.setTextColor(Color.parseColor("#757373"))
            games.setTextSize(18F);
            games.setTextColor(Color.parseColor("#757373"))
            social.setTextSize(21F);
            social.setBackgroundResource(R.drawable.border)
            social.setTextColor(Color.parseColor("#4a4848"))
        }
        if(position==2)
        {
            shop.setTextSize(18F);
            shop.setTextColor(Color.parseColor("#757373"))
            games.setTextSize(21F);
            games.setBackgroundResource(R.drawable.border)
            games.setTextColor(Color.parseColor("#4a4848"))
            social.setTextSize(18F);
            social.setTextColor(Color.parseColor("#757373"))
        }

    }


}




