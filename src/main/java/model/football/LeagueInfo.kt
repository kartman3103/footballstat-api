package model.football

data class LeagueInfo(
        val id : String,
        val name : String,
        val toursPlayed : Int,
        var shortName : String,
        val year : Int)