package com.example.easykazakh.thirdLevel

import com.example.easykazakh.firstLevel.AppDestinations


class AppDestinations {

    //Level 3
    object ThirdLevel : AppDestinations.ScreenDestination {
        override val route = "ThirdLevel"
    }
    object ThirdLevelScreenFirst : AppDestinations.ScreenDestination {
        override val route = "ThirdLevelScreenFirst"
    }
    object ThirdLevelScreenSecond : AppDestinations.ScreenDestination {
        override val route = "ThirdLevelScreenSecond"
    }
    object ThirdLevelScreenThird : AppDestinations.ScreenDestination {
        override val route = "ThirdLevelScreenThird"
    }
    object ThirdLevelScreenUFourth : AppDestinations.ScreenDestination {
        override val route = "ThirdLevelScreenUFourth"
    }

}



