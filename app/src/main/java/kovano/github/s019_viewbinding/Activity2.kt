package kovano.github.s019_viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kovano.github.s019_viewbinding.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {

    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tV2.text = "Activity2"
        binding.b2to1.text = "My Button to Activity1"
        binding.b2to3.text = "My Button to Activity3"
        binding.b2to1.setOnClickListener{
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.b2to3.setOnClickListener {
            val intent = Intent (this, Activity3::class.java)
            startActivity(intent)
        }

    }
}