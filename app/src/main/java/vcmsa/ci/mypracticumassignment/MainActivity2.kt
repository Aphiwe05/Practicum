package vcmsa.ci.mypracticumassignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val addButton = findViewById<Button>(R.id.addBtn)
        val playlistButton = findViewById<Button>(R.id.button2)
        val exitButton = findViewById<Button>(R.id.extbtn)

        addButton.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }

        playlistButton.setOnClickListener{
            startActivity(Intent(this, MainActivity2::class.java))
        }

        exitButton.setOnClickListener{
            finishAffinity()
        }
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}