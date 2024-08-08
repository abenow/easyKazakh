package com.example.easykazakh.secondLevel

import com.example.easykazakh.firstLevel.AppDestinations


class AppDestinations {

    //Level 2
    object SecondLevel : AppDestinations.ScreenDestination {
        override val route = "SecondLevel"
    }
    object ScreenFirst : AppDestinations.ScreenDestination {
        override val route = "ScreenFirst"
    }
    object ScreenSecond : AppDestinations.ScreenDestination {
        override val route = "ScreenSecond"
    }
    object SecondLevelScreenThird : AppDestinations.ScreenDestination {
        override val route = "SecondLevelScreenThird"
    }
    object SecondLevelScreenUFourth : AppDestinations.ScreenDestination {
        override val route = "SecondLevelScreenUFourth"
    }

}



