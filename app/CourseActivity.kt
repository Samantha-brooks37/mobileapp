import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_courses.*

class CoursesActivity : AppCompatActivity() {

    private lateinit var database: DatabaseReference
    private lateinit var courseList: ArrayList<Course>
    private lateinit var adapter: CourseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        database = FirebaseDatabase.getInstance().getReference("courses")
        courseList = arrayListOf()

        adapter = CourseAdapter(courseList)
        courses_recycler_view.layoutManager = LinearLayoutManager(this)
        courses_recycler_view.adapter = adapter

        fetchCourseData()
    }

    private fun fetchCourseData() {
        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                courseList.clear()
                for (courseSnapshot in snapshot.children) {
                    val course = courseSnapshot.getValue(Course::class.java)
                    if (course != null) {
                        courseList.add(course)
                    }
                }
                adapter.notifyDataSetChanged()
            }

            override fun onCancelled(error: DatabaseError) {
                // Handle database error
            }
        })
    }
}
