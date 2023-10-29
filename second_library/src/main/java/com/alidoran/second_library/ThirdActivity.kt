package com.alidoran.second_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alidoran.base_library.ActivitiesNameEnum
import com.alidoran.base_library.ActivitiesNameEnum.FirstActivityEnum
import com.alidoran.base_library.ModuleNavigator
import com.alidoran.second_library.databinding.ActivityThirdBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ThirdActivity : AppCompatActivity() {

    @Inject
    lateinit var moduleNavigator: ModuleNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoFirstActivity.setOnClickListener {
            moduleNavigator.startActivity(this, FirstActivityEnum)
        }
    }
}