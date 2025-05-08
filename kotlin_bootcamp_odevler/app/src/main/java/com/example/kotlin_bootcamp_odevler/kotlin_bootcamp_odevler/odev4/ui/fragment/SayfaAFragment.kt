package com.example.kotlin_bootcamp_odevler.kotlin_bootcamp_odevler.odev4.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kotlin_bootcamp_odevler.R
import com.example.kotlin_bootcamp_odevler.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {

    private var _binding: FragmentSayfaABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSayfaABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonToB.setOnClickListener {
            findNavController().navigate(R.id.action_sayfaAFragment_to_sayfaBFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
} 