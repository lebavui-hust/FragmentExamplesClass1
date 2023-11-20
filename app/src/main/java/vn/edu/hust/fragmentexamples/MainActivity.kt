package vn.edu.hust.fragmentexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity(), ItemClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v("TAG", "onCreate")

        findViewById<Button>(R.id.button_test).setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()

        Log.v("TAG", "onStart")
    }

    override fun onRestart() {
        super.onRestart()

        Log.v("TAG", "onRestart")
    }

    override fun onResume() {
        super.onResume()

        Log.v("TAG", "onResume")
    }

    override fun onPause() {
        Log.v("TAG", "onPause")

        super.onPause()
    }

    override fun onStop() {
        Log.v("TAG", "onStop")

        super.onStop()
    }

    override fun onDestroy() {
        Log.v("TAG", "onDestroy")

        super.onDestroy()
    }

    fun UpdateBlueContent(item: String) {
        val blueFragment: BlueFragment = supportFragmentManager.findFragmentById(R.id.blue_fragment) as BlueFragment
        blueFragment.UpdateContent(item)
    }

    override fun ItemClicked(item: String) {
        val blueFragment: BlueFragment = supportFragmentManager.findFragmentById(R.id.blue_fragment) as BlueFragment
        blueFragment.UpdateContent(item)
    }
}