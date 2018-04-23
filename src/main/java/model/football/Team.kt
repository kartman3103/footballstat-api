package model.football

import model.Country

data class Team(
        val id : String,
        val name : String,
        val country : Country,
        val allStatistic: TournamentStatistic,
        val homeStatistic: TournamentStatistic,
        val awayStatistic: TournamentStatistic)