package bakeapp.rako.layoutteste

import android.app.Activity
import android.opengl.Visibility
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import android.widget.LinearLayout
import android.widget.Toast
import bakeapp.rako.layoutteste.R.id.linear1
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :  Activity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtRegistro.keyListener = null

    }

}
