package eddercid.com.ejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnToast: Button = findViewById(R.id.btn_toast)
        var btnSnack: Button = findViewById(R.id.btn_snack)
        var btnLog: Button = findViewById(R.id.btn_log)

        var input: EditText = findViewById(R.id.txt_input)

        btnToast.setOnClickListener {
            showToast(input.text.toString())
        }

        btnSnack.setOnClickListener {
            val vista = findViewById<View>(R.id.scroll_view)
            showSnackBar(vista, input.text.toString())
        }

        btnLog.setOnClickListener {
            showLogWarning(input.text.toString())
        }


    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun showSnackBar(id: View, message: String) {
        Snackbar.make(id, message, Snackbar.LENGTH_INDEFINITE).setAction("Cerrar", {}).show()
    }

    private fun showLogWarning(message: String) {
        Log.w("Ejemplos", message)
    }

}