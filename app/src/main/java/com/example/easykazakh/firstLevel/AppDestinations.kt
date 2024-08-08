package com.example.easykazakh.firstLevel


class AppDestinations {

    interface ScreenDestination {
        val route: String
    }
    object Menu : ScreenDestination {
        override val route = "Menu"
    }

    //Level 1
    object FirstLevel : ScreenDestination {
        override val route = "FirstLevel"
    }

    object FirstLevelScreenFirst : ScreenDestination {
        override val route = "FirstLevelScreenFirst"
    }
    object FirstLevelScreenSecond : ScreenDestination {
        override val route = "FirstLevelScreenSecond"
    }
    object FirstLevelScreenThird : ScreenDestination {
        override val route = "FirstLevelScreenThird"
    }
    object FirstLevelScreenUFourth : ScreenDestination {
        override val route = "FirstLevelScreenUFourth"
    }
    object FirstLevelScreenUFourthSecond : ScreenDestination {
        override val route = "FirstLevelScreenUFourthSecond"
    }
}