package com.montassarbellahabdallah.affirmationsapp.model

//montassar bellah Abdallah Affirmation class kotlin
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)