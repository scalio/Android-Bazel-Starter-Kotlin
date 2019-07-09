package io.scal.bazel

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv_label).text = "Hello Bazel, from Kotlin!"

        `kotlin_13_test`("test")

        launchCoroutine()
    }

    private fun kotlin_13_test(x: String?) {
        if (!x.isNullOrEmpty()) {
            println("length of '$x' is ${x.length}") // Yay, smartcasted to not-null!
        }
    }

    private fun launchCoroutine() {
        GlobalScope.launch(context = Dispatchers.Default) {
            delay(1000)
            withContext(context = Dispatchers.Main) {
                findViewById<TextView>(R.id.tv_label).text = "Hello Bazel, from Kotlin And Coroutine!"
            }
        }
    }
}
