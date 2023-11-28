package com.example.rinat_kasymov_3_5;


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rinat_kasymov_3_5.databinding.FragmentCounterBinding


class CounterFragment : Fragment() {
    private lateinit var binding: FragmentCounterBinding
    private var count = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCounterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNum.setOnClickListener { view ->
            if (count < 10 && binding.btnNum.text != "-1") {
                count++
                binding.tvNum.text = count.toString()
            } else if (count == 10 || count < 10 && count>0) {
                binding.btnNum.text="-1"
                count--
                binding.tvNum.text=count.toString()
            }else if (count==0){
                val textFragment = SecondFragment()
                var bundle=Bundle()
                parentFragmentManager.beginTransaction().replace(R.id.container,textFragment).commit()
                bundle.putString("text",count.toString())
                textFragment.arguments=bundle

            }
        }
    }
}