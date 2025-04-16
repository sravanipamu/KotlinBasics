package com.sravani.kotlinbasics.sealed

class NormalClass {
     companion object {
       val HOME_SCREEN = "Home_Screen"
       val LIVE_SCREEN = "Live_Screen"
       val PLAYER_SCREEN = "Player_Screen"
       val SETTINGS_SCREEN = "Settings_Screen"
       val VERSION = 1.0
    }
}





// restricted set of same constant data types we use enums
enum class ScreenEnum {
    HOME_SCREEN, LIVE_SCREEN, PLAYER_SCREEN, SETTINGS_SCREEN,
}

// sealed class
/*
dynamic data
restricted set of sub classes
 */
sealed class ScreenSealed {
    object HOME_SCREEN : ScreenSealed()
    object LIVE_SCREEN : ScreenSealed()
    object PLAYER_SCREEN : ScreenSealed()
    object SETTINGS_SCREEN : ScreenSealed()
}



// sealed class with data
sealed class ScreenSealedData(val title : String) {
    object HOME_SCREEN : ScreenSealedData(title = "Home Screen")
    object LIVE_SCREEN : ScreenSealedData(title = "Live Screen")
    object PLAYER_SCREEN : ScreenSealedData(title = "Player Screen")
    data class SETTINGS_SCREEN(val darkModeEnable : Boolean) : ScreenSealedData(title = "Setting Screen")
}



// sealed class with interface
sealed interface ScreenSealedInterface {
    object HOME_SCREEN : ScreenSealedInterface
    object LIVE_SCREEN : ScreenSealedInterface
    object PLAYER_SCREEN : ScreenSealedInterface
    data class SETTINGS_SCREEN(var darkModeEnable : Boolean) : ScreenSealedInterface
}

/*
abstract class ScreenSealed {
    public static final class HOME_SCREEN extends ScreenSealed {
        public static final HOME_SCREEN INSTANCE = new HOME_SCREEN();
    }
    public static final class LIVE_SCREEN extends ScreenSealed {
        public static final LIVE_SCREEN INSTANCE = new LIVE_SCREEN();
    }
    public static final class PLAYER_SCREEN extends ScreenSealed {
        public static final PLAYER_SCREEN INSTANCE = new PLAYER_SCREEN();
    }
    public static final class SETTINGS_SCREEN extends ScreenSealed {
        public static final SETTINGS_SCREEN INSTANCE = new SETTINGS_SCREEN();
    }
}*/


sealed class UIState {
    object Loading : UIState()
    data class success(val data : String)  : UIState()
    data class failure(val message : String) : UIState()
}

