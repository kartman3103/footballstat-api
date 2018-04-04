package model.football

import model.Country

class Team
{
    var id : String? = null
        set
        get

    var Name : String? = null
        get
        set

    val Country : Country? = null
        get

    var AllStatistic : TournamentStatistic = TournamentStatistic()
        get
        set

    var HomeStatistic : TournamentStatistic = TournamentStatistic()
        get
        set

    var AwayStatistic : TournamentStatistic = TournamentStatistic()
        get
        set
}