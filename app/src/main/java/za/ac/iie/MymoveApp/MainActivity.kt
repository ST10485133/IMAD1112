package za.ac.iie.MymovieApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import za.ac.iie.MymoveApp.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

/*
fun main(){
    val number1=50//interger datatype
    val number2=45//interger datatype
    val sum=number1+number2
    val product =95

    println ("calculate the sum +"+sum)
}





fun main(){

    var Name = "John"// declared string data type of identifier name
    val Surname = "Smith"// declared string data type of identifier name
    val age = 30 // age which is in year,integer dat type
    val height = 2.5 // height in meters ,double data type
    /*
    on this program introduces the use of variable
     */
    println(Name)// my method which show output is stored on name
    println(Surname)// method which shows output of what is stored on surname
    println (age) // method which shows what is stored on age
    /*
    my next method will show concantenation
    where we use string manipulation
     */
println("my name is:"+Name+"my surname is:"+Surname+
        "my height is"+height+"i am"+age+"years old")

}










}


*/

fun main(){
    var StudentName="luke"
    var StudentSurname="Smith"
    var StudentAge=20
    var StudentHeight= 3.5
    var a=1
    // using condition constructors to check if the student is allowed to drive
    if (StudentAge>18){
        println("The Student is eligible to drive")
    }else{
        println ("you are not eligible to drive")
    }
    // I am now using a while loop
    // for the value that is stored in a and
    // do an increment from that number until 5
    while(a<6){
        println("The value for a :${a}")
    }


    println ("My name is ${StudentName}"+"/nMy surname is ${StudentSurname}"+
    "n/n I am ${StudentAge} years old"+"/n and my height is ${StudentHeight}")

    println ("Enter the name of your favourite movie")
    var FavMovie=readLine()
println ("Enter your the name of your favourite Soccer Team:")
    var SoccerTeam=readLine()

    println("Your Favorite movie is:${FavMovie}")
    println("your favourite soccer team is :${SoccerTeam}")


}
















@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}