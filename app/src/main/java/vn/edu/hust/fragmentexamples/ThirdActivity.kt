package vn.edu.hust.fragmentexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        findViewById<Button>(R.id.add_button).setOnClickListener {
            val blueFragment = BlueFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_layout, blueFragment, "BLUE_FRAGMENT")
                .addToBackStack("BLUE_FRAGMENT")
                .commit()
        }

        findViewById<Button>(R.id.replace_button).setOnClickListener {
            val blueFragment = BlueFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_layout, blueFragment, "BLUE_FRAGMENT")
                .addToBackStack("BLUE_FRAGMENT")
                .commit()
        }

        findViewById<Button>(R.id.remove_button).setOnClickListener {

            val fragment = supportFragmentManager.findFragmentByTag("BLUE_FRAGMENT")

            if (fragment != null)
                supportFragmentManager.beginTransaction()
                    .remove(fragment)
                    .commit()
        }
    }
}