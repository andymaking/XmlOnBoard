package io.king.xmlonboard.ui.front

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import io.king.xmlonboard.R
import io.king.xmlonboard.databinding.ActivityMainBinding
import io.king.xmlonboard.databinding.FragmentFrontBinding

class FrontFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding : FragmentFrontBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_front, container, false)

        binding.started.setOnClickListener { view ->
            view.findNavController().navigate(FrontFragmentDirections.actionFrontFragmentToOnboardingFragment())
        }

        return binding.root
    }
}

