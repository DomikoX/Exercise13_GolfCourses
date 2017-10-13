package sk.hyll.dominik.exercise13_golfcourses

import java.util.*

/**
 * Created by DomikoX on 13-Oct-17.
 */
class Places {
    var placeNameArray = arrayOf("Black Mountain", "Chambers Bay", "Clear Water", "Harbour Town", "Muirfield", "Old Course", "Pebble Beach", "Spy Class", "Turtle Bay")

    fun placeList(): ArrayList<Place> {

        val list = ArrayList<Place>()
        for (i in placeNameArray) {
            val place = Place()
            place.name = i
            place.imageName = i.replace("\\s+".toRegex(), "").toLowerCase()
            list.add(place)
        }
        return list
    }
}