package com.example.toastgenerator

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_pager.*
import kotlinx.android.synthetic.main.fragment_pager_second.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PagerSecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PagerSecondFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var text: String? = null
    private var param2: String? = null
    lateinit var photo: Bitmap


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            text = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_pager_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvTextSecond.text = text
        ivSherlockSecond.setImageBitmap(photo)
        btBegin.setOnClickListener { if (PagerSecondFragment != null) {
            val intent = Intent(context, SecondActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)

        } }

    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param inputText Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PagerSecondFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(inputText: String, inputPhoto:Bitmap) =
            PagerSecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, inputText)
                    putString(ARG_PARAM2, param2)
                }
                photo = inputPhoto
            }
    }
}