package com.example.kotlin_bootcamp_odevler.kotlin_bootcamp_odevler.odev4.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kotlin_bootcamp_odevler.R
import com.example.kotlin_bootcamp_odevler.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {

    private var _binding: FragmentSayfaYBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSayfaYBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToHome.setOnClickListener {
            findNavController().navigate(R.id.action_sayfaYFragment_to_anaSayfaFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
} 