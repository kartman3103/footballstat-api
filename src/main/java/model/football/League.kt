package model.football

data class League(
        val id : String,
        val matchDay : Int,
        val name : String,
        val year : Int,
        val toursPlayed : Int,
        val shortName : String,
        val teams : List<Team>)