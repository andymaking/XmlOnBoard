package io.king.xmlonboard.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import io.king.xmlonboard.R
import io.king.xmlonboard.databinding.FragmentFrontBinding
import io.king.xmlonboard.databinding.FragmentLoginBinding
import kotlin.random.Random

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)


        binding.clicks.setOnClickListener{view ->
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToSignupFragment())
        }


        return binding.root
        }
}