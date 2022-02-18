package io.king.xmlonboard.ui.onboarding

import android.icu.text.CaseMap
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

    private var titleList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var picsList = mutableListOf<Int>()

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

    private fun addToList(title: String, description: String, picture: Int){
        titleList.add(title)
        descList.add(description)
        picture.and(picture)
    }
}