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