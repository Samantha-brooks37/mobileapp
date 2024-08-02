import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ITAdmissionsRequirements : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_it_admissions_requirements)

        val requirementsTextView = findViewById<TextView>(R.id.requirements_text_view)
        requirementsTextView.text = """
            Admission Requirements for IT Department:

        """.trimIndent()

        val ussApplicationPageLink = findViewById<TextView>(R.id.uss_application_page_link)
        ussApplicationPageLink.text = " Application Page"
        ussApplicationPageLink.setOnClickListener {
            val url = "https://ucc.edu.jm/prospective-students"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }
}
