package com.joaquin.toolkitapprubenruiz.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.joaquin.toolkitapprubenruiz.R
import com.joaquin.toolkitapprubenruiz.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        val btnCalcular: Button = view.findViewById(R.id.btnCalcular)
        val etCosto1: EditText = view.findViewById(R.id.etCosto1)
        val etCosto2: EditText = view.findViewById(R.id.etCosto2)
        val etCosto3: EditText = view.findViewById(R.id.etCosto3)
        val tvRespuesta: TextView = view.findViewById(R.id.textView8)

        btnCalcular.setOnClickListener {
            val Costo1Text = etCosto1.text.toString()
            val Costo2Text = etCosto2.text.toString()
            val Costo3Text = etCosto3.text.toString()

            val costoUno = Costo1Text.toDouble()
            val costoDos = Costo2Text.toDouble()
            val costoTres = Costo3Text.toDouble()

            val resultado = costoUno - (costoDos + costoTres)
            tvRespuesta.text = "El gasto es: $resultado"
        }

        return view

    }
}