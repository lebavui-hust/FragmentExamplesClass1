package vn.edu.hust.fragmentexamples

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class PageAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        if (position == 0)
            return RedFragment()
        else if (position == 1)
            return BlueFragment()
        else
            return BlankFragment()
    }
}