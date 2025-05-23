package com.example.kotlin_bootcamp_odevler.kotlin_bootcamp_odevler.odev4.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kotlin_bootcamp_odevler.R
import com.example.kotlin_bootcamp_odevler.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {

    private var _binding: FragmentSayfaXBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSayfaXBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToY.setOnClickListener {
            findNavController().navigate(R.id.action_sayfaXFragment_to_sayfaYFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
} 