package sk.hyll.dominik.exercise13_golfcourses

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.Menu
import android.view.MenuItem




class MainActivity : AppCompatActivity() {

    private var mRecyclerView: RecyclerView? = null
    private var mStaggeredLayoutManager: StaggeredGridLayoutManager? = null
    private var mAdapter: GolfCourseWishListAdapter? = null
    private var isListView = true
    private var menu: Menu? = null

    companion object {
        var places = Places().placeList()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAdapter = GolfCourseWishListAdapter(this)

        mRecyclerView = findViewById(R.id.recyclerView) as RecyclerView
        mStaggeredLayoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        mRecyclerView!!.layoutManager = mStaggeredLayoutManager
        mRecyclerView!!.adapter = mAdapter

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        this.menu = menu
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_toggle) {
            if (isListView) {
                item.setIcon(R.drawable.ic_view_stream_black_24dp)
                item.title = "Show as list"
                isListView = false
                mStaggeredLayoutManager?.spanCount = 2
            } else {
                item.setIcon(R.drawable.ic_view_column_black_24dp)
                item.title = "Show as grid"
                isListView = true
                mStaggeredLayoutManager?.spanCount = 1
            }
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}
