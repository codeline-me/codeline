package me.codeline

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import me.codeline.core.di.ExampleDependency

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var exampleDependency: ExampleDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = exampleDependency.getMessage()
        setContentView(textView)
    }
}