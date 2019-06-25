package io.scal.bazel

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv_label).text = "Hello Bazel, from Kotlin!"

        `kotlin_13_test`("test")
    }

    private fun kotlin_13_test(x: String?) {
        if (!x.isNullOrEmpty()) {
            println("length of '$x' is ${x.length}") // Yay, smartcasted to not-null!
        }
    }
}
