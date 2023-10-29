package com.alidoran.first_library

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ActivityNavigator
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.alidoran.base_library.ActivitiesNameEnum
import com.alidoran.base_library.ActivitiesNameEnum.*
import com.alidoran.base_library.ModuleNavigator
import com.alidoran.first_library.databinding.ActivityFirstBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FirstActivity : AppCompatActivity() {

    @Inject
    lateinit var moduleNavigator: ModuleNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoToSecondActivity.setOnClickListener {
            moduleNavigator.startActivity(this, SecondActivityEnum)
        }

        binding.btnGoToThirdActivity.setOnClickListener {
            moduleNavigator.startActivity(this, ThirdActivityEnum)
        }
    }
}