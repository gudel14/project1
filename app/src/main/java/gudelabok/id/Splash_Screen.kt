package gudelabok.id

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
class Splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash__screen)
        Handler().postDelayed({
           val pindah = Intent (this, MainActivity::class.java)
            startActivity(pindah);
            finish()
        },4000)
    }
}