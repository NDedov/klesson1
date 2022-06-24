package com.example.klesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val persik = Cat("Персик", 3)
        findViewById<TextView>(R.id.textView).text = String.format("%s - %s", persik.name, persik.age);

        val barsik = persik.copy(name = "Барсик")

        findViewById<AppCompatButton>(R.id.buttonTest).setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                Toast.makeText(baseContext,"Нажали кнопку",Toast.LENGTH_SHORT).show()
                findViewById<TextView>(R.id.textView).text = String.format("%s - %s", barsik.name, barsik.age);

            }
        })

        Days.values().forEach {
            Log.d("@@@", "$it")
        }

        repeat(Days.values().size){
            Log.d("@@@", "${Days.values()[it]}")
        }
        
    }

}
    enum class Days{
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday

}

data class Cat(val name:String, val age:Int){
}


