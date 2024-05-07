package com.example.ethanandrewsassignment2st10434217imad

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainScreenTest {

    @Before
    fun setUp() {
        // Initializing ActivityScenario for MainScreen
        ActivityScenario.launch(MainScreen::class.java)
    }

    @Test
    fun testFeedButton() {
        // Clicking on feed button
        onView(withId(R.id.btnFeed)).perform(click())

        // Checking if image view changes to image2
        onView(withId(R.id.imgMain)).check(matches(withDrawable(R.drawable.image2)))

        // Checking if hunger status text is updated
        onView(withId(R.id.edtHungerStatus)).check(matches(withText("I am Full!")))
    }

    @Test
    fun testCleanButton() {
        // Clicking on clean button
        onView(withId(R.id.btnClean)).perform(click())

        // Checking if image view changes to image3
        onView(withId(R.id.imgMain)).check(matches(withDrawable(R.drawable.image3)))

        // Checking if clean status text is updated
        onView(withId(R.id.edtCleanStatus)).check(matches(withText("I am Clean!")))
    }

    @Test
    fun testPlayButton() {
        // Clicking on play button
        onView(withId(R.id.btnPlay)).perform(click())

        // Checking if image view changes to image4
        onView(withId(R.id.imgMain)).check(matches(withDrawable(R.drawable.image4)))

        // Checking if play status text is updated
        onView(withId(R.id.edtPlayStatus)).check(matches(withText("I am Happy!")))
    }

    // Custom matcher to check that the ImageView has a specific drawable
    private fun withDrawable(resourceId: Int) = DrawableMatcher(resourceId)
}



}
