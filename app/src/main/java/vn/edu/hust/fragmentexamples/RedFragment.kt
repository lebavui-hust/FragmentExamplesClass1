package vn.edu.hust.fragmentexamples

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.navigation.fragment.findNavController

class RedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_red, container, false)
        val listView = view.findViewById<ListView>(R.id.list_view)

        val items = arrayListOf<String>()
        repeat(50) {
            items.add("Item $it")
        }

        listView.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, items)

        listView.setOnItemClickListener { parent, view, position, id ->
            val item = items[position]
            //(activity as MainActivity).UpdateBlueContent(item)
//            if (activity is ItemClickListener)
//                (activity as ItemClickListener).ItemClicked(item)

            val bundle = Bundle()
            bundle.putString("SELECTED_ITEM", item)
            findNavController().navigate(R.id.action_redFragment_to_blueFragment, bundle)
        }

        return view
    }

}