fun main(){
    val user1 =User("User1",2003,"male")
    user1.myinfo()
    val user2 = User("user2",2004,"female")
    user2.myinfo()
    val user3 = User("user3",2005,"female")
    user3.myinfo()

}
class User(val name:String,val id:Int,val gender:String){
    fun myinfo(){
        println("$name, $ id , $gender")
    }
}