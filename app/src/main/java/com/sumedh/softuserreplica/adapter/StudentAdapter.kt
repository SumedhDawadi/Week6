package com.sumedh.softuserreplica.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sumedh.softuserreplica.R
import com.sumedh.softuserreplica.model.Student
import de.hdodenhof.circleimageview.CircleImageView

class StudentAdapter(
        val lstStudents: ArrayList<Student>,
        val context: Context
): RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    class StudentViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imgProfile: CircleImageView
        val tvName: TextView
        val tvAge: TextView
        val tvAddress: TextView
        val tvGender: TextView

        val btnDelete:ImageView

        init {
            imgProfile = view.findViewById(R.id.imgProfile)
            tvName = view.findViewById(R.id.tvName)
            tvAge = view.findViewById(R.id.tvAge)
            tvAddress = view.findViewById(R.id.tvAddress)
            tvGender = view.findViewById(R.id.tvGender)
            btnDelete=view.findViewById(R.id.btnDelete)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_layout, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = lstStudents[position]
        holder.tvName.text = student.studentName
        holder.tvAge.text = student.studentAge.toString()
        holder.tvAddress.text = student.studentAddress
        holder.tvGender.text = student.studentGender

        holder.btnDelete.setOnClickListener{
            lstStudents.removeAt(position)
            notifyItemRemoved(position)
            notifyDataSetChanged()
            notifyItemRangeChanged(position, lstStudents.size)
        }


    }

    override fun getItemCount(): Int {
        return lstStudents.size
    }

}