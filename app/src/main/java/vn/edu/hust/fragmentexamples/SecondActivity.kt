package vn.edu.hust.fragmentexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity(), ItemClickListener {

    val redFragment = RedFragment()
    val blueFragment = BlueFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportFragmentManager.beginTransaction()
            .add(R.id.red_layout, redFragment)
            .add(R.id.blue_layout, blueFragment)
            .commit()
    }

    override fun ItemClicked(item: String) {
        blueFragment.UpdateContent(item)
    }
}