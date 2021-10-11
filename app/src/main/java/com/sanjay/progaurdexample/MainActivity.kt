package com.sanjay.progaurdexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.sanjay.progaurdexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding:ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.apply {
            setContentView(this.root)
        }

        callService(BuildConfig.BASE_URL)

        
    }

    fun callService(url:String){
        // calling code here

        if(url =="http://www.freeapp.com"){
            binding?.option1?.visibility = View.VISIBLE
            binding?.option2?.visibility = View.VISIBLE
            binding?.option3?.visibility = View.VISIBLE
            binding?.option4?.visibility = View.GONE
            binding?.option5?.visibility = View.GONE
        }else if(url =="http://www.paidapp.com"){

            binding?.option1?.isVisible = true
            binding?.option2?.isVisible = true
            binding?.option3?.isVisible = true
            binding?.option4?.isVisible = true
            binding?.option5?.isVisible = true
        }
    }
}