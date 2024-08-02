import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab = findViewById<FloatingActionButton>(R.id.fab)

        fab.setOnClickListener {
            sendEmail()
        }
    }

    private fun sendEmail() {
        val hodEmail = "ithod@ucc.edu.jm "
        val subject = "Subject of the email"
        val body = "Body of the email"

        val intent = Intent(Intent.ACTION_SENDTO)
        intent.data = Uri.parse("mailto:$hodEmail")
        intent.putExtra(Intent.EXTRA_SUBJECT, subject)
        intent.putExtra(Intent.EXTRA_TEXT, body)

        try {
            startActivity(Intent.createChooser(intent, "Choose an email client"))
        } catch (e: Exception) {
            Toast.makeText(this, "No email client found", Toast.LENGTH_SHORT).show()
        }
    }
}

