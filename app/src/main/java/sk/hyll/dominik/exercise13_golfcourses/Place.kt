package sk.hyll.dominik.exercise13_golfcourses

import android.content.Context

/**
 * Created by DomikoX on 13-Oct-17.
 */
class Place {
    var name: String? = null
    var imageName: String? = null

    fun getImageResourceId(context: Context): Int {
        return context.resources.getIdentifier(this.imageName, "drawable", context.packageName)
    }
}