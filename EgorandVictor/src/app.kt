fun main() {
    /**
     * ввод переменых для отправки в базовый класс и класс наследник
     *@property name  название
     * @property number   вес (в каратах);
     * @property   valaverage_distance_between_stations качество огранки в баллах (число).
     * @property P  цвет
     * @property obj  обьект базавого класса
     * @property obj_child  обьект  класса с наследника
     */
    println("название организации")
    val name: String = readLine().toString()
    println("число рабочих станций")
    val number: Int = readLine()!!.toInt()
    println("среднее расстояние между станциями")
   val valaverage_distance_between_stations: Int =  readLine()!!.toInt()
    val obj: BasDiamond = BasDiamond(name,number ,valaverage_distance_between_stations)
    println("средняя скорость передачи данных в сети")
    val P: String = readLine().toString()
    val obj_child: childDiamond = childDiamond(P,name , number ,valaverage_distance_between_stations)
    println("название организации "+obj.name)
    println("число рабочих станций "+obj.number)
    println(" среднее расстояние между станциями "+obj.valaverage_distance_between_stations)
    println("Q "+obj.Q())
    println("QP "+obj_child.Q())
}
