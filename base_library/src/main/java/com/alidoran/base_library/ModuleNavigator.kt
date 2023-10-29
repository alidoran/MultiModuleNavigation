package com.alidoran.base_library

import android.content.Context
import android.content.Intent
import javax.inject.Inject

class ModuleNavigator @Inject constructor(
    private val classAddresses: List<ActivityAddress>
) {
    fun startActivity(context: Context, classNameEnum: ActivitiesNameEnum) {
        val address = classAddresses.first { it.requestedActivity == classNameEnum }.activityAddress
        try {
            val intent = Intent(
                context,
                Class.forName(address)
            )
            context.startActivity(intent)
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }
    }

    data class ActivityAddress(
        val requestedActivity: ActivitiesNameEnum,
        val activityAddress: String
    )
}

enum class ActivitiesNameEnum {
    FirstActivityEnum,
    SecondActivityEnum,
    ThirdActivityEnum
}