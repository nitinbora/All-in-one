package com.example.shopping

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.fragment.app.Fragment


class games:Fragment() {

    var site=""
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.activity_games, container, false)
        val bitmap=BitmapFactory.decodeResource(resources,R.drawable.snake)
        val rounded=RoundedBitmapDrawableFactory.create(resources,bitmap)
        rounded.isCircular=true
        val image = root.findViewById<View>(R.id.imageButton12) as ImageButton
        image.setImageDrawable(rounded)


        val bitmap1=BitmapFactory.decodeResource(resources,R.drawable.mine)
        val rounded1=RoundedBitmapDrawableFactory.create(resources,bitmap1)
        rounded1.isCircular=true
        val image1 = root.findViewById<View>(R.id.imageButton13) as ImageButton
        image1.setImageDrawable(rounded1)

        val bitmap2=BitmapFactory.decodeResource(resources,R.drawable.tower)
        val rounded2=RoundedBitmapDrawableFactory.create(resources,bitmap2)
        rounded2.isCircular=true
        val image2 = root.findViewById<View>(R.id.imageButton20) as ImageButton
        image2.setImageDrawable(rounded2)

        val bitmap3=BitmapFactory.decodeResource(resources,R.drawable.cricket)
        val rounded3=RoundedBitmapDrawableFactory.create(resources,bitmap3)
        rounded3.isCircular=true
        val image3 = root.findViewById<View>(R.id.imageButton21) as ImageButton
        image3.setImageDrawable(rounded3)

        val bitmap4=BitmapFactory.decodeResource(resources,R.drawable.pony)
        val rounded4=RoundedBitmapDrawableFactory.create(resources,bitmap4)
        rounded4.isCircular=true
        val image4 = root.findViewById<View>(R.id.imageButton22) as ImageButton
        image4.setImageDrawable(rounded4)

        val bitmap5=BitmapFactory.decodeResource(resources,R.drawable.tictactoe)
        val rounded5=RoundedBitmapDrawableFactory.create(resources,bitmap5)
        rounded5.isCircular=true
        val image5 = root.findViewById<View>(R.id.imageButton23) as ImageButton
        image5.setImageDrawable(rounded5)

        val bitmap6=BitmapFactory.decodeResource(resources,R.drawable.pac)
        val rounded6=RoundedBitmapDrawableFactory.create(resources,bitmap6)
        rounded6.isCircular=true
        val image6 = root.findViewById<View>(R.id.imageButton25) as ImageButton
        image6.setImageDrawable(rounded6)

        val bitmap7=BitmapFactory.decodeResource(resources,R.drawable.car)
        val rounded7=RoundedBitmapDrawableFactory.create(resources,bitmap7)
        rounded7.isCircular=true
        val image7 = root.findViewById<View>(R.id.imageButton26) as ImageButton
        image7.setImageDrawable(rounded7)

        val bitmap8=BitmapFactory.decodeResource(resources,R.drawable.star)
        val rounded8=RoundedBitmapDrawableFactory.create(resources,bitmap8)
        rounded8.isCircular=true
        val image8 = root.findViewById<View>(R.id.imageButton27) as ImageButton
        image8.setImageDrawable(rounded8)

        val bitmap9=BitmapFactory.decodeResource(resources,R.drawable.callme)
        val rounded9=RoundedBitmapDrawableFactory.create(resources,bitmap9)
        rounded9.isCircular=true
        val image9 = root.findViewById<View>(R.id.imageButton28) as ImageButton
        image9.setImageDrawable(rounded9)

        val bitmap10=BitmapFactory.decodeResource(resources,R.drawable.creare)
        val rounded10=RoundedBitmapDrawableFactory.create(resources,bitmap10)
        rounded10.isCircular=true
        val image10 = root.findViewById<View>(R.id.imageButton24) as ImageButton
        image10.setImageDrawable(rounded10)

        val bitmap11=BitmapFactory.decodeResource(resources,R.drawable.tiki)
        val rounded11=RoundedBitmapDrawableFactory.create(resources,bitmap11)
        rounded11.isCircular=true
        val image11 = root.findViewById<View>(R.id.imageButton29) as ImageButton
        image11.setImageDrawable(rounded11)

        val bitmap12=BitmapFactory.decodeResource(resources,R.drawable.dark)
        val rounded12=RoundedBitmapDrawableFactory.create(resources,bitmap12)
        rounded12.isCircular=true
        val image12 = root.findViewById<View>(R.id.imageButton30) as ImageButton
        image12.setImageDrawable(rounded12)

        val bitmap13=BitmapFactory.decodeResource(resources,R.drawable.moto)
        val rounded13=RoundedBitmapDrawableFactory.create(resources,bitmap13)
        rounded13.isCircular=true
        val image13 = root.findViewById<View>(R.id.imageButton31) as ImageButton
        image13.setImageDrawable(rounded13)

        val bitmap14=BitmapFactory.decodeResource(resources,R.drawable.end)
        val rounded14=RoundedBitmapDrawableFactory.create(resources,bitmap14)
        rounded14.isCircular=true
        val image14 = root.findViewById<View>(R.id.imageButton32) as ImageButton
        image14.setImageDrawable(rounded14)

        val bitmap15=BitmapFactory.decodeResource(resources,R.drawable.fruit)
        val rounded15=RoundedBitmapDrawableFactory.create(resources,bitmap15)
        rounded15.isCircular=true
        val image15 = root.findViewById<View>(R.id.imageButton33) as ImageButton
        image15.setImageDrawable(rounded15)

        val bitmap16=BitmapFactory.decodeResource(resources,R.drawable.lego)
        val rounded16=RoundedBitmapDrawableFactory.create(resources,bitmap16)
        rounded16.isCircular=true
        val image16 = root.findViewById<View>(R.id.imageButton34) as ImageButton
        image16.setImageDrawable(rounded16)

        val bitmap17=BitmapFactory.decodeResource(resources,R.drawable.gap)
        val rounded17=RoundedBitmapDrawableFactory.create(resources,bitmap17)
        rounded17.isCircular=true
        val image17 = root.findViewById<View>(R.id.imageButton35) as ImageButton
        image17.setImageDrawable(rounded17)

        val bitmap18=BitmapFactory.decodeResource(resources,R.drawable.la)
        val rounded18=RoundedBitmapDrawableFactory.create(resources,bitmap18)
        rounded18.isCircular=true
        val image18 = root.findViewById<View>(R.id.imageButton36) as ImageButton
        image18.setImageDrawable(rounded18)

        val bitmap19=BitmapFactory.decodeResource(resources,R.drawable.space)
        val rounded19=RoundedBitmapDrawableFactory.create(resources,bitmap19)
        rounded19.isCircular=true
        val image19 = root.findViewById<View>(R.id.imageButton37) as ImageButton
        image19.setImageDrawable(rounded19)

        val bitmap20=BitmapFactory.decodeResource(resources,R.drawable.little)
        val rounded20=RoundedBitmapDrawableFactory.create(resources,bitmap20)
        rounded20.isCircular=true
        val image20 = root.findViewById<View>(R.id.imageButton38) as ImageButton
        image20.setImageDrawable(rounded20)

        val bitmap21=BitmapFactory.decodeResource(resources,R.drawable.mario)
        val rounded21=RoundedBitmapDrawableFactory.create(resources,bitmap21)
        rounded21.isCircular=true
        val image21 = root.findViewById<View>(R.id.imageButton39) as ImageButton
        image21.setImageDrawable(rounded21)

        val bitmap22=BitmapFactory.decodeResource(resources,R.drawable.split)
        val rounded22=RoundedBitmapDrawableFactory.create(resources,bitmap22)
        rounded22.isCircular=true
        val image22 = root.findViewById<View>(R.id.imageButton40) as ImageButton
        image22.setImageDrawable(rounded22)













        val c1 = root.findViewById<View>(R.id.imageButton11) as ImageButton
        c1.setOnClickListener{
            site="https://www.google.co.in/logos/fnbx/solitaire/standalone.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c2 = root.findViewById<View>(R.id.imageButton12) as ImageButton
        c2.setOnClickListener{
            site="https://www.google.com/fbx?fbx=snake_arcade"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c3 = root.findViewById<View>(R.id.imageButton13) as ImageButton
        c3.setOnClickListener{
            site="https:https://www.google.com/fbx?fbx=minesweeper"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c4 = root.findViewById<View>(R.id.imageButton20) as ImageButton
        c4.setOnClickListener{
            site="https://livegame.show/games/tower/"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c5 = root.findViewById<View>(R.id.imageButton21) as ImageButton
        c5.setOnClickListener{
            site="https://www.google.com/logos/2017/cricket17/cricket17.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c6 = root.findViewById<View>(R.id.imageButton22) as ImageButton
        c6.setOnClickListener{
            site="https://www.google.com/logos/2015/ponyexpress/ponyexpress15.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c7 = root.findViewById<View>(R.id.imageButton23) as ImageButton
        c7.setOnClickListener{
            site="https://www.google.com/fbx?fbx=tic_tac_toe"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c8 = root.findViewById<View>(R.id.imageButton24) as ImageButton
        c8.setOnClickListener{
            site="https://quickdraw.withgoogle.com/"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c9 = root.findViewById<View>(R.id.imageButton25) as ImageButton
        c9.setOnClickListener{
            site="https://www.google.com/logos/2010/pacman10-i.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }

        val c10 = root.findViewById<View>(R.id.imageButton26) as ImageButton
        c10.setOnClickListener{
            site="file:///android_asset/1727race.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c11 = root.findViewById<View>(R.id.imageButton27) as ImageButton
        c11.setOnClickListener{
            site="file:///android_asset/index.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c12 = root.findViewById<View>(R.id.imageButton28) as ImageButton
        c12.setOnClickListener{
            site="file:///android_asset/callme.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c13 = root.findViewById<View>(R.id.imageButton24) as ImageButton
        c13.setOnClickListener{
            site="file:///android_asset/crere.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c14 = root.findViewById<View>(R.id.imageButton29) as ImageButton
        c14.setOnClickListener{
            site="file:///android_asset/tikitaka.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c15 = root.findViewById<View>(R.id.imageButton30) as ImageButton
        c15.setOnClickListener{
            site="file:///android_asset/dark.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c16 = root.findViewById<View>(R.id.imageButton31) as ImageButton
        c16.setOnClickListener{
            site="file:///android_asset/moto.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c17 = root.findViewById<View>(R.id.imageButton32) as ImageButton
        c17.setOnClickListener{
            site="file:///android_asset/endle.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c18 = root.findViewById<View>(R.id.imageButton33) as ImageButton
        c18.setOnClickListener{
            site="file:///android_asset/fruitcrush.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c19 = root.findViewById<View>(R.id.imageButton34) as ImageButton
        c19.setOnClickListener{
            site="file:///android_asset/gameslego.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c20 = root.findViewById<View>(R.id.imageButton35) as ImageButton
        c20.setOnClickListener{
            site="file:///android_asset/gap.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c21 = root.findViewById<View>(R.id.imageButton36) as ImageButton
        c21.setOnClickListener{
            site="file:///android_asset/latrramanel.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }

        val c22 = root.findViewById<View>(R.id.imageButton37) as ImageButton
        c22.setOnClickListener{
            site="file:///android_asset/launchpace.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c23 = root.findViewById<View>(R.id.imageButton38) as ImageButton
        c23.setOnClickListener{
            site="file:///android_asset/little.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c24 = root.findViewById<View>(R.id.imageButton39) as ImageButton
        c24.setOnClickListener{
            site="file:///android_asset/mario.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c25 = root.findViewById<View>(R.id.imageButton40) as ImageButton
        c25.setOnClickListener{
            site="file:///android_asset/split.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
        val c26 = root.findViewById<View>(R.id.button2) as Button
        c26.setOnClickListener{
            site="file:///android_asset/game.html"
            val intent= Intent( getActivity(),webgame::class.java)
            intent.putExtra(key,site)
            startActivity(intent)

        }
//
//        val c27 = root.findViewById<View>(R.id.imageButton42) as ImageButton
//        c27.setOnClickListener{
//            site="file:///android_asset/latrramanel.html"
//            val intent= Intent( getActivity(),webgame::class.java)
//            intent.putExtra(key,site)
//            startActivity(intent)
//
//        }
//        val c28 = root.findViewById<View>(R.id.imageButton43) as ImageButton
//        c28.setOnClickListener{
//            site="file:///android_asset/latrramanel.html"
//            val intent= Intent( getActivity(),webgame::class.java)
//            intent.putExtra(key,site)
//            startActivity(intent)
//
//        }
//        val c29 = root.findViewById<View>(R.id.imageButton44) as ImageButton
//        c29.setOnClickListener{
//            site="file:///android_asset/latrramanel.html"
//            val intent= Intent( getActivity(),webgame::class.java)
//            intent.putExtra(key,site)
//            startActivity(intent)
//
//        }
//        val c30 = root.findViewById<View>(R.id.imageButton45) as ImageButton
//        c30.setOnClickListener{
//            site="file:///android_asset/latrramanel.html"
//            val intent= Intent( getActivity(),webgame::class.java)
//            intent.putExtra(key,site)
//            startActivity(intent)
//
//        }
//        val c31 = root.findViewById<View>(R.id.imageButton46) as ImageButton
//        c31.setOnClickListener{
//            site="file:///android_asset/latrramanel.html"
//            val intent= Intent( getActivity(),webgame::class.java)
//            intent.putExtra(key,site)
//            startActivity(intent)
//
//        }



















        return root
    }


}




