package com.gugun.kopiku.fregment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gugun.kopiku.R
/**
 * A simple [Fragment] subclass.
 * Use the [KeranjangFragment] factory method to
 * create an instance of this fragment.
 */
class KeranjangFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_keranjang, container, false)
    }
}