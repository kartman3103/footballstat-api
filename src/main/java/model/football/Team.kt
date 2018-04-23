package model.football

import model.Country

data class Team(
        var id : String,
        var name : String,
        var country : Country,
        var allStatistic: TournamentStatistic,
        var homeStatistic: TournamentStatistic,
        var awayStatistic: TournamentStatistic)