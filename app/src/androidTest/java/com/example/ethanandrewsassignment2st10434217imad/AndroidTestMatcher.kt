package com.example.ethanandrewsassignment2st10434217imad

import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

//class for the DrawableMatcher test

class DrawableMatcher(private val expectedId: Int) :
    BoundedMatcher<View, ImageView>(ImageView::class.java) {

    override fun describeTo(description: Description?) {
        description?.appendText("with drawable from resource id: $expectedId")
    }

    override fun matchesSafely(target: ImageView?): Boolean {
        if (target == null) return false
        val context = target.context
        val expectedDrawable: Drawable? = ContextCompat.getDrawable(context, expectedId)
        val actualDrawable: Drawable? = target.drawable
        if (expectedDrawable == null || actualDrawable == null) return false
        val expectedBitmap = (expectedDrawable as BitmapDrawable).bitmap
        val actualBitmap = (actualDrawable as BitmapDrawable).bitmap
        return expectedBitmap.sameAs(actualBitmap)
    }
}
