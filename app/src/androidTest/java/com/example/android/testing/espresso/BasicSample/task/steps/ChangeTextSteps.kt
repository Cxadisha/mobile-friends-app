package com.example.android.testing.espresso.BasicSample.task.steps

import com.example.android.testing.espresso.BasicSample.getText
import com.example.android.testing.espresso.BasicSample.tap
import com.example.android.testing.espresso.BasicSample.task.pageMatchers.ChangeTextMatchers
import com.example.android.testing.espresso.BasicSample.typeText
import org.junit.Assert


object ChangeTextSteps {

    fun typeText(text: String) {
        ChangeTextMatchers.textInputField.typeText(text)
    }

    fun clickOnChange() {
        ChangeTextMatchers.changeTextBtn.tap(3)
    }

    fun validateLabel(expected: String) {
        val actual = ChangeTextMatchers.changedTextField.getText(3)
        Assert.assertEquals(actual, expected)
    }
}