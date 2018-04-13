package evolvan.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var i=0
    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val strTxt=findViewById(R.id.txt)as TextView

        //set dynamic text
        //strTxt.setText("You set me.")

       //strTxt.setOnClickListener{
           //on click setText
           //strTxt.setText("You set me.")
           //on click show toast
          // val toast= Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT)
           //toast.show()

           //txt()
       // }

    }
    data class Person(val name: String, val age: Int)
    fun txtClickMe(txtClickMe:View){
        //val greeting = { Toast.makeText(this@MainActivity,"Hello ji",Toast.LENGTH_LONG).show() }
        // invoking function
       // greeting()
        //txt()
        /*val product = { a: Int, b: Int -> a * b }
        val result = product(9, 3)
        Toast.makeText(this@MainActivity,"Hello ji"+result,Toast.LENGTH_LONG).show()*/

        /*val people = listOf(
                Person("Jack", 34),
                Person("Shelly", 19),
                Person("Patrick", 13),
                Person("Jill", 12),
                Person("Shane", 22),
                Person("Joe", 18)
        )

        val selectedPerson = people.maxBy({ per ->  per.age })
        Toast.makeText(this@MainActivity,"Hello ji "+selectedPerson   ,Toast.LENGTH_LONG).show()*/
        /*val a = -12
        val b = 12

        // use of greater than operator
        val max = if (a > b) {
            println("a is larger than b.")
            a
        } else {
            println("b is larger than a.")
            b
        }
        Toast.makeText(this@MainActivity,"max = $max"   ,Toast.LENGTH_LONG).show()*/
        /*val numbers = intArrayOf(1, 4, 42, -3)

        if (4 in numbers) {
            Toast.makeText(this@MainActivity,"numbers array contains 4."   ,Toast.LENGTH_LONG).show()
        }*/
        /*val number1: Long = 123456
        val number2: Byte = number1.toByte()
        Toast.makeText(this@MainActivity,"number1 =$number1 number2 = $number2"   ,Toast.LENGTH_LONG).show()*/
        /*val a = 12
        val b = 13
        val max: Int

        max = if (a > b) a else b
        Toast.makeText(this@MainActivity,"$max"   ,Toast.LENGTH_LONG).show()*/
       /* val number = -10

        val result = if (number > 0) {
            "Positive number"
        } else {
            "Negative number"
        }

        Toast.makeText(this@MainActivity,result   ,Toast.LENGTH_LONG).show()*/
        val a = 12
        val b = 5

        println("Enter operator either +, -, * or /")
        val operator1 = findViewById(R.id.edit_query)as EditText
        val operator=operator1.text.toString()

        val result = when (operator) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b
            else -> "$operator operator is invalid operator."
        }

        Toast.makeText(this@MainActivity,"result  $result"   ,Toast.LENGTH_LONG).show()
    }
    fun txt(){
        // create inflay layout
        val ll_main = findViewById(R.id.ll_main_layout) as LinearLayout
        // creating TextView programmatically
        val tv_dynamic = TextView(this)
        tv_dynamic.textSize = 20f
        i++
        tv_dynamic.text = "This is a dynamic TextView generated programmatically in Kotlin"
        // add TextView to LinearLayout
        ll_main.addView(tv_dynamic)

        // your code to perform when the user clicks on the button
        //val toast= Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT)
        //toast.show()
    }

}
