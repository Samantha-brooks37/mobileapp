package com.example.itmobileapp
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var database: DatabaseReference
    private lateinit var facultyList: ArrayList<Faculty>
    private lateinit var adapter: FacultyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = FirebaseDatabase.getInstance().getReference("faculty")
        facultyList = arrayListOf()

        adapter = FacultyAdapter(facultyList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapter

        fetchFacultyData()
    }

    private fun fetchFacultyData() {
        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                facultyList.clear()
                for (facultySnapshot in snapshot.children) {
                    val faculty = facultySnapshot.getValue(Faculty::class.java)
                    if (faculty != null) {
                        facultyList.add(faculty)
                    }
                }
                adapter.notifyDataSetChanged()
            }

            override fun onCancelled(error: DatabaseError) {

            }
        })
    }
}
