package com.example.shopping

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd


class fragment1 : Fragment(){
    private lateinit var mInterstitialAd: InterstitialAd


    private var ll: LinearLayout? = null
    private var fa: FragmentActivity? = null
    var site=""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.activity_shop, container, false)

        val b1 = root.findViewById<View>(R.id.imageButton19) as ImageButton
        b1.setOnClickListener{
            site="https://www.flipkart.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val b2 = root.findViewById<View>(R.id.imageButton10) as ImageButton
        b2.setOnClickListener{
            site="https://www.amazon.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }

        val b20 = root.findViewById<View>(R.id.imageButton9) as ImageButton
        b20.setOnClickListener{
            site="https://www.paytmmall.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val b4 = root.findViewById<View>(R.id.imageButton8) as ImageButton
        b4.setOnClickListener{
            site="https://www.snapdeal.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val b5 = root.findViewById<View>(R.id.imageButton5) as ImageButton
        b5.setOnClickListener{
            site="https://www.shopclues.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val b6 = root.findViewById<View>(R.id.imageButton4) as ImageButton
        b6.setOnClickListener{
            site="https://www.iclubfactory.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val b7 = root.findViewById<View>(R.id.imageButton7) as ImageButton
        b7.setOnClickListener{
            site="https://www.ajiocom"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val b8 = root.findViewById<View>(R.id.imageButton2) as ImageButton
        b8.setOnClickListener{
            site="https://www.myntra.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val b3 = root.findViewById<View>(R.id.imageButton3) as ImageButton
        b3.setOnClickListener{
            site="https://www.baromasa.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val b9 = root.findViewById<View>(R.id.imageButton18) as ImageButton
        b9.setOnClickListener{
            site="https://www.netmeds.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val b10 = root.findViewById<View>(R.id.imageButton16) as ImageButton
        b10.setOnClickListener{
            site="https://www.coolwinks.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val b11 = root.findViewById<View>(R.id.imageButton15) as ImageButton
        b11.setOnClickListener{
            site="https://www.lenskart.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val b12 = root.findViewById<View>(R.id.imageButton14) as ImageButton
        b12.setOnClickListener{
            site="https://www.tatacliq.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val b13 = root.findViewById<View>(R.id.imageButton6) as ImageButton
        b13.setOnClickListener{
            site="https://www.zomato.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val b14 = root.findViewById<View>(R.id.imageButton17) as ImageButton
        b14.setOnClickListener{
            site="https://www.swiggy.com"
            val intent= Intent( getActivity(),web::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }

        mInterstitialAd = InterstitialAd(getActivity())
        mInterstitialAd.adUnitId = "ca-app-pub-6691837928330663/7314317076"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        val b15 = root.findViewById<TextView>(R.id.textView7) as TextView
        b15.setOnClickListener {
            if (mInterstitialAd.isLoaded) {
                mInterstitialAd.show()
            }
        }




        return root
    }

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//
//        fa = super.getActivity()
//
//
//
//        fun flipkart(view: View)
//        {
//            site="https://www.flipkart.com"
//
//            val intent= Intent( getActivity(),web::class.java)
//            intent.putExtra(key,site)
//            startActivity(intent)
//
//        }
//        fun amazon(view: View)
//        {
//            site="https://www.amazon.com"
//            val intent= Intent( getActivity(),web::class.java)
//            intent.putExtra(key,site)
//            startActivity(intent)
//
//        }
//
//
//        return inflater!!.inflate(R.layout.activity_shop, container, false)
//
//
//
//    }
}






