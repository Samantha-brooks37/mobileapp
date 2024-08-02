import kotlinx.android.synthetic.main.item_course.view.*
class CoursesOffered : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses_offered)

        val coursesTextView = findViewById<TextView>(R.id.courses_text_view)
        coursesTextView.text = """
            Courses Offered by IT Department:

            1. Programming Techniques 
               - Code: ITT103
               - Credits: 3
               -Pre-requisite : Computer Information Systems 

            2. Object Oriented Programming Design using C++
               - Code: ITT200
               - Credits: 3
               -Pre-requisite : Programming Techniques 

            3. Computer Essentials & Troubleshooting -
               - Code: ITT106
               - Credits: 3
               -Pre-requisite : Computer Information Systems

            4. Internet Authoring I
               - Code: ITT208
               - Credits: 3
               -Pre-requisite : Programming Techniques

            5. Building Applications Using C#
               - Code: ITT209
               - Credits: 3
               -Pre-requisite : Object Oriented Programming using C++

            6. System Analysis & Design I
               - Code: ITT205
               - Credits: 3
               -Pre-requisite : Database Management Systems I 

            7. Database Management Systems II
               - Code: ITT304
               - Credits: 3
               -Pre-requisite : Database Management Systems I 

            8. Operating Systems
               - Code: ITT02
               - Credits: 3
               -Pre-requisite : 0 Object Oriented Programming using C++
               
            9. Human Computer Interaction & Interface Design
               - Code: ITT405
               - Credits: 3
               -Pre-requisite : ITT205 System Analysis and Design I 

            10. Introduction to Robotics
               - Code: ITT312
               - Credits: 3
               -Pre-requisite : 2 Discrete Mathematics I 
        """.trimIndent()
    }
}