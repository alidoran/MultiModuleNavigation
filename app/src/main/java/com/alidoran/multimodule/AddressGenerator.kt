package com.alidoran.multimodule

import com.alidoran.base_library.ActivitiesNameEnum
import com.alidoran.base_library.ActivitiesNameEnum.*
import com.alidoran.base_library.ModuleNavigator.*
import com.alidoran.first_library.FirstActivity
import com.alidoran.second_library.SecondActivity
import com.alidoran.second_library.ThirdActivity

object AddressGenerator {
    fun generateAddressList(): List<ActivityAddress> {
        val list = ArrayList<ActivityAddress>()
        values().forEach {
            val classAddresses = ActivityAddress(it, getClassName(it))
            list.add(classAddresses)
        }
        return list
    }

    private fun getClassName(classNameEnum: ActivitiesNameEnum) = when (classNameEnum) {
        FirstActivityEnum -> FirstActivity::class.java.name
        SecondActivityEnum -> SecondActivity::class.java.name
        ThirdActivityEnum -> ThirdActivity::class.java.name
    }
}