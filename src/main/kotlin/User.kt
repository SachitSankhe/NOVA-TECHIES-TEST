fun main(){
    var user1 =User("User1",2003,"male")
    user1.myinfo()
    var user2 = User("user2",2004,"female")
    user2.myinfo()
    var user3 = User("user3",2005,"female")
    user3.myinfo()
    var current : Month
    println(Month.JANUARY)

}
class User(var name:String,var id:Int,var gender:String){
    fun myinfo(){
        println("$name, $id , $gender")
    }
}
enum class Month{
    JANUARY, FEBRUARY
}