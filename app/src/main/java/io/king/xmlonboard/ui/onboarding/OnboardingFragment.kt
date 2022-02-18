package io.king.xmlonboard.ui.onboarding

import android.icu.text.CaseMap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import io.king.xmlonboard.R
import io.king.xmlonboard.ViewPagerAdapter
import io.king.xmlonboard.databinding.FragmentLoginBinding
import io.king.xmlonboard.databinding.FragmentOnboardingBinding
import me.relex.circleindicator.CircleIndicator3

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

        postToList()

        binding.viewPager2.adapter =ViewPagerAdapter(titleList,descList,picsList)

        val indicator: CircleIndicator3 = binding.indicator
        indicator.setViewPager(binding.viewPager2)

        return binding.root
    }

    private fun addToList(title: String, description: String, picture: Int){
        titleList.add(title)
        descList.add(description)
        picsList.add(picture)
    }

    private fun postToList(){
            addToList("We Build", "to construct good (especially something complex) by assembling and joining parts or materials to build a house, offices, parks and futures", R.drawable.build)
            addToList("Reach Skies", "the region of the clouds or the upper air; the upper atmosphere of the earth airplanes in the sky; cloudy skies.", R.drawable.sky)
            addToList("Home", "a house, apartment, or other shelter that is the usual residence of a person, family, or household the place in which one's domestic affections are centered.", R.drawable.home)
    }
}