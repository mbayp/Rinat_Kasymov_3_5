package com.example.rinat_kasymov_3_5;
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rinat_kasymov_3_5.databinding.FragmentSecondBinding



class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    var result=arguments?.getString("text")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSecondBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.text.text=result.toString()
    }
}