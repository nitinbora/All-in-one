package com.example.shopping

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebResourceResponse
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.monstertechno.adblocker.AdBlockerWebView
import com.monstertechno.adblocker.util.AdBlocker
import kotlinx.android.synthetic.main.activity_webgame.*


private val swipeContainer: SwipeRefreshLayout? = null

class webgame : AppCompatActivity() {

    var site=""
    //AdBlockerWebView.init(this).initializeWebView(webView)

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webgame)

        val myWebView: WebView = findViewById(R.id.webView)
        myWebView.settings.javaScriptEnabled = true
        myWebView.getSettings().setSavePassword(true);
        myWebView.webViewClient = WebViewClient()
        val settings = myWebView.settings
        settings.setAppCacheEnabled(true)
        settings.cacheMode = WebSettings.LOAD_DEFAULT
        settings.setAppCachePath(cacheDir.path)

        // More optional settings, you can enable it by yourself
        settings.domStorageEnabled = true
        settings.setSupportMultipleWindows(true)
        settings.loadWithOverviewMode = true
        settings.allowContentAccess = true
        settings.setGeolocationEnabled(true)
        settings.allowUniversalAccessFromFileURLs = true
        settings.allowFileAccess = true

        myWebView.getSettings().setAppCachePath(getApplicationContext().getFilesDir().getAbsolutePath() + "/cache")
        myWebView.getSettings().setDatabasePath(getApplicationContext().getFilesDir().getAbsolutePath() + "/databases")

//        myWebView.webChromeClient = object: WebChromeClient(){
//            override fun onProgressChanged(view: WebView, newProgress: Int) {
//                progress_bar.progress = newProgress
//            }
//        }

        AdBlockerWebView.init(this).initializeWebView(myWebView)
        myWebView.webViewClient = web.Browser_home()
        site =intent.getStringExtra(key)
        //val url1="https://ghuguti.com"
        myWebView.loadUrl(site)





    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.action, menu)
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
    class Browser_home internal constructor():WebViewClient() {
        override fun shouldInterceptRequest(view:WebView, url:String): WebResourceResponse? {
            return if (AdBlockerWebView.blockAds(view, url))
                AdBlocker.createEmptyResource()
            else
                super.shouldInterceptRequest(view, url)
        }
    }
    override fun onBackPressed() {
        if (webView!!.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }

    companion object {
        const val MAX_PROGRESS = 100
    }



}

