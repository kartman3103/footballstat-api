package model.football

data class TournamentStatistic(
        var position : Int,
        var playedGames : Int,
        var points : Int,
        var goalsScored : Int,
        var goalsAgainst : Int,
        var goalsDifference : Int,
        var wins : Int,
        var draws : Int,
        var losses : Int)