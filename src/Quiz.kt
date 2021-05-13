fun main(){
println(names("Achieng"))
    var accountHolder = CurrentAccount(778334533,"Erustus Mwaniki",2900000.50)
    accountHolder.deposit(30000.00)
    accountHolder.withdraw(50000.00)
    accountHolder.details()
    var accountHolder2 = SavingsAccount(458937594,"Mary Wamboi",100000.00,2)
     accountHolder2.withdraw(3000.50)
    accountHolder2.withdrawals
    var car = listOf(Car("Toyota","Corolla","red"),
       Car("Toyota","Corolla","green"),
       Car("Toyota","Corolla","blue"))


}
data class Car(var make:String, var model:String,var color:String)

fun carColors(color:String){
    var blue = mutableListOf<String>()
    var red = mutableListOf<String>()
    var other = mutableListOf<String>()
    when(color){
       "red" -> println( red.add(color))
        "blue" -> println(blue.add(color))
        "other" ->println(other.add(color))
    }
}
fun names (name:String):Int{
    return name.length
}
 open class CurrentAccount (var accountnumber:Int,var accountname:String,var balance:Double){
    fun deposit(amount:Double){
     println(amount)
        balance+=amount

    }
    open fun withdraw(amount:Double){
       println(amount)
        balance-=amount

    }
    fun details(){
        println("Account number ${accountnumber} with balance ${balance} is operated by ${accountname}")
    }
}
class SavingsAccount(accountnumber:Int,accountname:String,balance:Double, var withdrawals:Int):CurrentAccount(accountnumber,accountname,balance){
    override fun withdraw (amount: Double){
  while(withdrawals < 4){
      balance-=amount
      withdrawals++
      println(amount)
  }
}
}