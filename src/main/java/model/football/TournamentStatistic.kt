package model.football

data class TournamentStatistic(
        val position : Int,
        val playedGames : Int,
        val points : Int,
        val goalsScored : Int,
        val goalsAgainst : Int,
        val goalsDifference : Int,
        val wins : Int,
        val draws : Int,
        val losses : Int)