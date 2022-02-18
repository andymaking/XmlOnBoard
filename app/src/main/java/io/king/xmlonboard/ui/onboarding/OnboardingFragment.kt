package io.king.xmlonboard.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import io.king.xmlonboard.R
import io.king.xmlonboard.databinding.FragmentLoginBinding
import io.king.xmlonboard.databinding.FragmentOnboardingBinding

class OnboardingFragment : Fragment() {
    private var _binding: FragmentOnboardingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnboardingBinding.inflate(inflater, container, false)

        binding.signUp.setOnClickListener { view ->
            view.findNavController().navigate(OnboardingFragmentDirections.actionOnboardingFragmentToSignupFragment())
        }

        binding.logIn.setOnClickListener { view ->
            view.findNavController().navigate(OnboardingFragmentDirections.actionOnboardingFragmentToLoginFragment())
        }



        return binding.root
    }
}