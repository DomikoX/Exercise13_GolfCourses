package sk.hyll.dominik.exercise13_golfcourses

import com.bumptech.glide.Glide
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import android.content.Context
import android.view.View

/**
 * Created by DomikoX on 13-Oct-17.
 */
class GolfCourseWishListAdapter(private val mContext: Context) : RecyclerView.Adapter<GolfCourseWishListAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var placeNameHolder: LinearLayout = itemView.findViewById(R.id.placeNameHolder) as LinearLayout
        var placeName: TextView = itemView.findViewById(R.id.placeName) as TextView
        var placeImage: ImageView = itemView.findViewById(R.id.placeImage) as ImageView
    }

    override fun getItemCount(): Int {
        return MainActivity.places.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_places, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val place = MainActivity.places[position]
        holder.placeName.text = place.name
        Glide.with(mContext).load(place.getImageResourceId(mContext)).into(holder.placeImage)
    }

}