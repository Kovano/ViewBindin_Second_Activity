package kovano.github.s019_viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kovano.github.s019_viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tV1.text = "Activity1"
        binding.b1to2.text = "My Button to Activity2"
        binding.b1to3.text = "My Button to Activity3"
        binding.b1to2.setOnClickListener{
            val intent = Intent (this, Activity2::class.java)
            startActivity(intent)
        }
        binding.b1to3.setOnClickListener {
            val intent = Intent (this, Activity3::class.java)
            startActivity(intent)
        }
    }
}