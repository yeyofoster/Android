package eddercid.com.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar.title = resources.getString(R.string.Grid_Layout)
        setSupportActionBar(toolbar)

        cardRelative.setOnClickListener {
            Toast.makeText(this,"Relative Layout" ,Toast.LENGTH_SHORT).show()
        }
        cardConstraint.setOnClickListener{
            Toast.makeText(this,"Constraint Layout" ,Toast.LENGTH_SHORT).show()
        }
    }
}