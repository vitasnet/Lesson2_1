package calculator.calulation.lesson2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import calculator.calulation.lesson2.R
import calculator.calulation.lesson2.databinding.ActivityMainBinding
import calculator.calulation.lesson2.databinding.MainFragmentBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "присваиваем обработчик кнопкам $binding");

        if (savedInstanceState == null) {
            binding.name.setText(viewModel.getName())
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container , MainFragment.newInstance()).commit()
        }
    }
}