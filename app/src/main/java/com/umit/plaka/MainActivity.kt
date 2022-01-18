package com.umit.plaka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.umit.plaka.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.editTextNumber.text.isNotEmpty()){
                var plakaKodu = binding.editTextNumber.text.toString().toInt()
                when(plakaKodu){
                    35 ->binding.textView.text = "izmir"
                    else ->{
                        binding.textView.text = "Bulunamadı"
                    }
                }
                }
            else{
                    binding.textView.text = "Şehir Plaka Kodunu Giriniz."

            }
        binding.editTextNumber.text.clear()
        }



    }
}