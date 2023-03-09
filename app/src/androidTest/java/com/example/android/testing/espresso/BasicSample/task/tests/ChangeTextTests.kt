package com.example.android.testing.espresso.BasicSample.task.tests

import androidx.test.espresso.action.ViewActions.*
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.task.steps.ActivitySteps
import com.example.android.testing.espresso.BasicSample.task.steps.ChangeTextSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextTests {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    private val fullName = "Giorgi Tskhadiashvili"

    @Test
    fun changeTextAndValidate() {

        with(ChangeTextSteps) {
            typeText(fullName)
            clickOnChange()
            validateLabel(fullName)
        }

    }

    @Test
    fun activityTest() {

        with(ChangeTextSteps) {
            typeText(fullName)
        }

        with(ActivitySteps) {
            clickOnActivityBtn()
            validateActivityLabel(fullName)
        }

    }
}