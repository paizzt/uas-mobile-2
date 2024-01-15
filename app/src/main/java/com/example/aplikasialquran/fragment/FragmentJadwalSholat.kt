package com.example.aplikasialquran.fragment

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment


@Suppress("DEPRECATION")
class FragmentJadwalSholat : BottomSheetDialogFragment() {

    var mString: String? = null
    private var listDaftarKota: MutableList<DaftarKota>? = null
    private var mDaftarKotaAdapter: ArrayAdapter<DaftarKota>? = null
    var progressDialog: ProgressDialog? = null

    override fun onActivityCreated(@Nullable savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (view!!.parent as View).setBackgroundColor(Color.TRANSPARENT)
    }

     companion object {
        @JvmStatic
        fun newInstance(string: String?): FragmentJadwalSholat {
            val f = FragmentJadwalSholat()
            val args = Bundle()
            args.putString("detail", string)
            f.arguments = args
            return f
        }
    }

     override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mString = arguments!!.getString("detail")
    }