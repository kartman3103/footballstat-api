package model.football

data class League(
        var id : String,
        var matchDay : Int,
        var name : String,
        var year : Int,
        var toursPlayed : Int,
        var shortName : String,
        var teams : List<Team>)