//This is the basics of the Kotlin Language
//This is all about the datTypes and var and I/O statements

fun main() {
    //2 types of Statements println,print,
    println("Hello world")
    //Declaration of a variable done like this "var variableName : Datatype =Value or var variableName =value
    //There is another type is called val it is used when the variable is not going to be modified

    val  a =5 //"a=someOtherValue"it gives an error
    println("My variable value is $a")//enter the "$" sign to access the variable inside the print statement
    var b =0
    b=1//it is modified here
    print("value for the b variable is $b")
    println()
    println("The sum of these two numbers is $a,$b is "+ (a+b))//it's important to specify the expression inside the bracket
    println("The sub of $b,$a is : ${a-b}") //or else you can give it like this

    //all basic data types and arithmetic operation is are supported
    /*all dataTypes name start with Capital letter and for data types like Float ,if u gone specify then ADD "F" at the last of the value
    for double just remove the "F"at the float and just leave with the decimal points*/
    //all logic operations are supported just as java

    if(a<b){
        print("$a is greater than $b")
    }
    else{
        print("$b is greater than $b")
    }
    //user input || readLine()function is used and it returns string ,but it may also return null
    /*In kotlin if you have null objects for any variable you can't run the code because the Language doesn't support
      such type of execution if we want to access any function of string or any operation then you have explicitly check
       if the user input is null or not using if else condition or using ?*/
    var userinput= readLine()
    val userinput2= readln()//returns only the string

    //print(userinput.toInt())  this line shows error to execute this without error
    println(userinput?.toInt())//using ? before the pointer / connector
    if (userinput != null)
        println(userinput.toInt())//using if condition
    //,or you can do this while getting the input like readline()?.toInt and better use readln or convert this into
    //readlnOrNull fun for the latest version of Kotlin
    else
        println("The input is null")


    print(userinput2.toInt())//it doesn't require null check since it returns only the String

    //LOOPS
    //While
    var k=true
    while (k) {
        print("Loop is accessed ")
        k=false
        //this loop runs one time
    }
    //For
    //In Kotlin the for loop is difference like there is no classical for loop only the advanced for loop
    for(i in 1..10 step 2)//this means that "i" will iterate from the range 1 to 10 the step refers increment
        print(i)//prints i
    for(j in 10 downTo 1 step 2)//this loop print j from 10 to 1 with the step of 2
        print(j)
    //for (item in collection) used to iterate through any kind of collection framework
    for(item in 'a'..'z')//it will iterate from a to z
        print(item)




}



}