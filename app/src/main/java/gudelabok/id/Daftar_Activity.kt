package gudelabok.id

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class Daftar_Activity : AppCompatActivity() {

    private lateinit var gNama : EditText
    private lateinit var gNrp : EditText
    private lateinit var gPass : EditText
    private lateinit var gConPass : EditText
    private lateinit var tDaftar : Button
    private lateinit var mAuth: FirebaseAuth
    private lateinit var gDatabase : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.daftar_activity)

        mAuth = FirebaseAuth.getInstance()
        gDatabase = FirebaseDatabase.getInstance().getReference("User")

        gNama = findViewById(R.id.daf_nama)
        gNrp = findViewById(R.id.daf_nrp)
        gPass = findViewById(R.id.daf_pass)
        gConPass = findViewById(R.id.daf_pass2)
        tDaftar = findViewById(R.id.b_daftar)

        tDaftar.setOnClickListener {
//            var pindah = Intent(this, MainActivity::class.java)
//            startActivity(pindah)
//            finish()

            val nama = gNama.text.toString().trim()
            val nrp = gNrp.text.toString().trim()
            val pass = gPass.text.toString().trim()
            val conpass = gConPass.text.toString().trim()

            if (nama.isEmpty()){
                gNama.error = "masukkan nama"
            } else if (nrp.isEmpty()){
                gNrp.error = "masukkan nrp"
            } else if (pass.isEmpty()){
                gPass.error = "masukkan password"
            } else if (conpass.isEmpty()){
                gConPass.error = "pass gak sama"
            }

            crateUser (nama,nrp,pass,conpass)
        }
    }
    private fun crateUser(nama : String, nrp : String, pass : String, conpass:String) {

    }
}
