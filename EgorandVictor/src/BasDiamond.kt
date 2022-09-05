 open class   BasDiamond  constructor(name: String, number: Int, valaverage_distance_between_stations:Int) {
     /**
      * базоывый класс
          *@property name  название
      * @property number   вес (в каратах);
      * @property valaverage_distance_between_stations число рабочих станций.
      * @property Q return = число станций · среднее
     расстояние
      *
      */
    var name: String
    var number: Int
    var valaverage_distance_between_stations:Int

    init {
        this.name = name
        this.number = number
        this.valaverage_distance_between_stations = valaverage_distance_between_stations
    }

    open fun Q(): Double{

       return (number+cut_quality_in_points)
    }
}