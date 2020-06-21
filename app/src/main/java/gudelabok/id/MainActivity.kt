package gudelabok.id

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var esnrp : EditText
    private lateinit var espas : EditText
    private lateinit var tetombol : Button
    private lateinit var eftombol : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        esnrp = findViewById(R.id.nrp)
        espas = findViewById(R.id.pass)
        tetombol = findViewById(R.id.b_masuk)

        tetombol.setOnClickListener(this)

    }
    //pindah halaman ke daftar----------------------------------------------
    fun ke_daftar(view: View) {
        var pindah = Intent (this, Daftar_Activity::class.java)
        startActivity(pindah)
    }

    fun menu(view: View) {
        var pindah = Intent(this, Menu_Activity::class.java)
        startActivity(pindah)
    }
    //--------------------------------------------------------------------

    override fun onClick(p0: View?) {
        dadieror ()
    }

    fun dadieror (){
        val nrp = esnrp.text.toString()
        val pass= espas.text.toString()
        if (nrp.isEmpty()){
            esnrp.error = "Masukkan NRP"
        } else if (pass.isEmpty()){
            Toast.makeText(this, "Masukkan Password", Toast.LENGTH_SHORT).show()
        }
        fun menu(view: View) {
            var pindah = Intent(this, Menu_Activity::class.java)
            startActivity(pindah)
        }
    }






}