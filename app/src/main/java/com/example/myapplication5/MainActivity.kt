package com.example.myapplication5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnM = findViewById<Button>(R.id.button1)
        val txt1 = findViewById<TextView>(R.id.textView1)
        val txt2 = findViewById<TextView>(R.id.textView2)
        val spinValue = findViewById<Spinner>(R.id.spinner)
        btnM.setOnClickListener {


            var res: String = ""

            val listOfNumbers = mutableListOf<Int>()
            for (i in 0..99) listOfNumbers.add(i)

            res=listOfNumbers.toString().plus("\n")
            val listOfEvenNumbers = listOfNumbers.filter { it%2==0 }
            res = res.plus(listOfEvenNumbers.toString())
            txt1.text = res.toString()
        }

    }

    /* private fun sunString(a: String, b: String): Int {
          try {
           return a.toInt()+b.toInt()
         } catch (e: Exception) {
            return 0
         }
     }

     private fun getV(stor1: Int,stor2:Int = stor1,stor3: Int = stor1) = stor1*stor2*stor3
     private fun getV(stor1: Int,stor2:Int = stor1) = stor1.times(2)*stor2
     private fun getV(stor1: Int) = stor1.times(3)

     private fun sum(vararg numbers: Int): Int {
         var result = 0
         for (x in numbers) result+=x
         return result
     }
     private fun sortPuz(numbers: MutableList<Int>): List<Int> {
         var tmp1 = 0
         for (i in 1 .. numbers.size) {
             for (j in numbers.size-1 downTo i) {
                 if (numbers[j]<numbers[j-1]) {
                     tmp1 = numbers[j-1]
                     numbers[j-1] = numbers[j]
                     numbers[j] = tmp1
                 }
             }
         }
         return numbers
     }
     private fun sortPuz(vararg numbers: Int) = sortPuz(numbers.toMutableList())
     private fun sortPuz(numbers: Array<Int>) = sortPuz(numbers.toMutableList())
     private var nameRes1:String? = null
     private var nameRes2:Int? = 7
     private var nameRes3: String? = null*/


}