package com.portfolio.adminfriesandthighs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import com.portfolio.adminfriesandthighs.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private val binding:ActivitySignUpBinding by lazy{
        ActivitySignUpBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val locationList = arrayOf("Kolkata","Jaipur","Delhi","Mumbai")
        val adapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,locationList)
        val autoCompleteTextView = binding.ListOfLocation
        autoCompleteTextView.setAdapter(adapter)

        binding.createAccBtn.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.alreadyHaveAccTxt.setOnClickListener{
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}