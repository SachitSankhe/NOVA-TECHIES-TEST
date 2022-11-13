fun main() {

    var obj = car1()
    obj.giveEngine()
    obj.givecapacity()
    obj.givemodel()

}

interface car{

   fun giveEngine()
   fun givemodel()
   fun givecapacity()
}

class car1 : car {
    override fun giveEngine() {
        println("This is the giveEngine fun")
    }

    override fun givecapacity() {
        println("This is the givecapacity fun")
    }

    override fun givemodel() {
        println("this is the givemodel fun")
    }
}