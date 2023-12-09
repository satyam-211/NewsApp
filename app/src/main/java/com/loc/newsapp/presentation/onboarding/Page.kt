package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf<Page>(
    Page(
        title = "dolor sit",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "ad minim",
        description = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "perspiciatis unde",
        description = "Sed ut perspiciatis unde omnis iste natus error sit",
        image = R.drawable.onboarding3
    ),
)