package com.example.android.testing.espresso.BasicSample.task.pageMatchers

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher

object ChangeTextMatchers {

    val textInputField: Matcher<View> by lazy { ViewMatchers.withId(R.id.editTextUserInput) }
    val changeTextBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.changeTextBt) }
    val changedTextField: Matcher<View> by lazy { ViewMatchers.withId(R.id.textToBeChanged) }
    val activityBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.activityChangeTextBtn) }

}