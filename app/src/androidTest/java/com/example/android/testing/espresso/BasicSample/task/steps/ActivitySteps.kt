package com.example.android.testing.espresso.BasicSample.task.steps

import com.example.android.testing.espresso.BasicSample.getText
import com.example.android.testing.espresso.BasicSample.tap
import com.example.android.testing.espresso.BasicSample.task.pageMatchers.ActivityShowMatcher
import com.example.android.testing.espresso.BasicSample.task.pageMatchers.ChangeTextMatchers
import com.example.android.testing.espresso.BasicSample.typeText
import org.junit.Assert

object ActivitySteps {

    fun clickOnActivityBtn() {
        ChangeTextMatchers.activityBtn.tap(3)
    }

    fun validateActivityLabel(expected: String) {
        val actual = ActivityShowMatcher.activityTextField.getText(3)
        Assert.assertEquals(actual, expected)
    }

}