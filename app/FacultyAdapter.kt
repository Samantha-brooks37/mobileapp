import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_faculty.view.*

class FacultyAdapter(private val facultyList: ArrayList<Faculty>) :
    RecyclerView.Adapter<FacultyAdapter.FacultyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacultyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_faculty, parent, false)
        return FacultyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FacultyViewHolder, position: Int) {
        val currentItem = facultyList[position]
        holder.itemView.name_text.text = currentItem.name
        holder.itemView.phone_text.text = currentItem.phone
        holder.itemView.email_text.text = currentItem.email

        Glide.with(holder.itemView.context)
            .load(currentItem.photoUrl)
            .into(holder.itemView.photo_image)
    }

    override fun getItemCount() = facultyList.size

    class FacultyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
