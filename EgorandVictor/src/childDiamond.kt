class childDiamond( P: String,name: String, number: Int, valaverage_distance_between_stations:Int): BasDiamond(name, number, valaverage_distance_between_stations){
    /**
     *  класс наследник
     *@property P средняя скорость передачи данных в сети
     * @property Q Qp = Q·Р
     */
    var P: String
    init {
        this.P = P

    }

    override fun Q(): Double{

        val Q: Double=number+cut_quality_in_points
        return (Q*P)
    }

}