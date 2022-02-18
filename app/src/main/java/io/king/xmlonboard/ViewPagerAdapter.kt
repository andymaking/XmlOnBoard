package io.king.xmlonboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter (private var title: List<String>, private var descript : List<String>, private var image : List<Int>): RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>(){

    inner class Pager2ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val itemTitle: TextView = itemView.findViewById(R.id.textHead)
        val itemDetail: TextView = itemView.findViewById(R.id.textBody)
        val itemImage: ImageView = itemView.findViewById(R.id.circleImageView)

        init {
            itemImage.setOnClickListener{view ->
                val position : Int = adapterPosition
                Toast.makeText(itemView.context, "you just clicked on item ${position+1}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Pager2ViewHolder {
        return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_onboarding, parent, false))
    }

    override fun onBindViewHolder(holder: Pager2ViewHolder, position: Int) {
        holder.itemImage.setImageResource(image[position])
        holder.itemTitle.text = title[position]
        holder.itemDetail.text = descript[position]
    }

    override fun getItemCount(): Int {
        return title.size
    }
}