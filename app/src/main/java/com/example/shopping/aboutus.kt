package com.example.shopping

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent
import kotlinx.android.synthetic.main.activity_aboutus.*

class aboutus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutus)
        but41.setOnClickListener{

            val url = "https://www.instagram.com/thenitinbora/"
            val builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()

            customTabsIntent.launchUrl(this, Uri.parse(url))
            // newweb.loadUrl("www.facebook.com/thenitinbora")
        }
        but44.setOnClickListener{

            val url = "https://www.youtube.com/c/Nitinbora"
            val builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()

            customTabsIntent.launchUrl(this, Uri.parse(url))
            // newweb.loadUrl("www.facebook.com/thenitinbora")
        }


        but42.setOnClickListener{

            val url = "https://www.facebook.com/thenitinbora/"
            val builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(this, Uri.parse(url))
        }
        but43.setOnClickListener{
            val url ="https://twitter.com/thenitinbora"

            val builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(this, Uri.parse(url))
        }

        but45.setOnClickListener{
            val url ="https://github.com/nitinbora"
            val builder = CustomTabsIntent.Builder()
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(this, Uri.parse(url))
        }

    }

}
