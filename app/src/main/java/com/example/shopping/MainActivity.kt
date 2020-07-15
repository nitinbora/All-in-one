package com.example.shopping
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity



class fragment2 : Fragment() {

    var site = ""
    private var ll: LinearLayout? = null
    private var fa: FragmentActivity? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.activity_main, container, false)

        val a2 = root.findViewById<View>(R.id.imageButton110) as ImageButton
        a2.setOnClickListener {
            site = "https://www.instagram.com"
            val intent = Intent(getActivity(), web::class.java)
            intent.putExtra(key, site)
            startActivity(intent)

        }
        val a3 = root.findViewById<View>(R.id.imageButton) as ImageButton
        a3.setOnClickListener {
            site = "https://www.facebook.com"
            val intent = Intent(getActivity(), web::class.java)
            intent.putExtra(key, site)
            startActivity(intent)

        }
        val a4 = root.findViewById<View>(R.id.imageButton2) as ImageButton
        a4.setOnClickListener {
            site = "https://www.youtube.com"
            val intent = Intent(getActivity(), web::class.java)
            intent.putExtra(key, site)
            startActivity(intent)

        }
        val a5 = root.findViewById<View>(R.id.imageButton3) as ImageButton
        a5.setOnClickListener {
            site = "https://www.twitter.com"
            val intent = Intent(getActivity(), web::class.java)
            intent.putExtra(key, site)
            startActivity(intent)

        }
        val a6 = root.findViewById<View>(R.id.imageButton5) as ImageButton
        a6.setOnClickListener {
            site = "https://www.linkedin.com"
            val intent = Intent(getActivity(), web::class.java)
            intent.putExtra(key, site)
            startActivity(intent)

        }
        val a7 = root.findViewById<View>(R.id.imageButton4) as ImageButton
        a7.setOnClickListener {
            site = "https://www.gmail.com"
            val intent = Intent(getActivity(), web::class.java)
            intent.putExtra(key, site)
            startActivity(intent)

        }
        val a8 = root.findViewById<View>(R.id.imageButton41) as ImageButton
        a8.setOnClickListener {
            site = "https://www.ghuguti.com"
            val intent = Intent(getActivity(), web::class.java)
            intent.putExtra(key, site)
            startActivity(intent)

        }
        val a9 = root.findViewById<View>(R.id.imageButton42) as ImageButton
        a9.setOnClickListener {
            site = "https://www.pinterest.com"
            val intent = Intent(getActivity(), web::class.java)
            intent.putExtra(key, site)
            startActivity(intent)

        }
        return root
    }
}

//    fun instagram(view: View)
//    {
//        site="https://www.instagram.com"
//        val intent=Intent(getActivity(),web::class.java)
//        intent.putExtra(key,site)
//        startActivity(intent)
//
//    }
//    fun facebook(view: View)
//    {
//        site="https://www.facebook.com"
//        val intent=Intent(getActivity(),web::class.java)
//        intent.putExtra(key,site)
//        startActivity(intent)
//
//    }
//    fun youtube(view: View)
//    {
//        site="https://www.youtube.com"
//        val intent=Intent(getActivity(),web::class.java)
//        intent.putExtra(key,site)
//        startActivity(intent)
//
//    }
//    fun twitter(view: View)
//    {
//        site="https://www.twitter.com"
//        val intent=Intent(getActivity(),web::class.java)
//        intent.putExtra(key,site)
//        startActivity(intent)
//
//    }
//    fun linkedin(view: View)
//    {
//        site="https://www.linkedin.com"
//        val intent=Intent(getActivity(),web::class.java)
//        intent.putExtra(key,site)
//        startActivity(intent)
//
//    }
//    fun gmail(view: View)
//    {
//        site="https://www.gmail.com"
//        val intent=Intent(getActivity(),web::class.java)
//        intent.putExtra(key,site)
//        startActivity(intent)
//
//    }

