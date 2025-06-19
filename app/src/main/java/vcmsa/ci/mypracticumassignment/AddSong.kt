package vcmsa.ci.mypracticumassignment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddSong : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val submitButton = findViewById<Button>(R.id.button)
        val titleEdit = findViewById<TextView>(R.id.textView)
        val artistName = findViewById<EditText>(R.id.editTextText2)

        submitButton.setOnClickListener {
            val songTitle = titleEdit.toString()
            val artistName = artistName.text.toString

        }
        setContentView(R.layout.activity_add_song)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}