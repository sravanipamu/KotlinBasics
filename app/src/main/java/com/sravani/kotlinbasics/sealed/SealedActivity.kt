package com.sravani.kotlinbasics.sealed

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SealedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigateToScreen(ScreenEnum.HOME_SCREEN)
        navigateToScreen(NormalClass.HOME_SCREEN)
        navigateToScreen(ScreenSealed.HOME_SCREEN)
        navigateToScreen(ScreenSealedData.SETTINGS_SCREEN(false))
        navigateToScreen(ScreenSealedInterface.HOME_SCREEN)
    }

    // normal  execution
    private fun navigateToScreen(screen : String){
        when(screen) {
            NormalClass.HOME_SCREEN -> println("navigating to home screen")
            NormalClass.LIVE_SCREEN -> println("navigating to live screen")
            NormalClass.PLAYER_SCREEN -> println("navigating to player screen")
            NormalClass.SETTINGS_SCREEN -> println("navigating to settings screen")
        }
    }


    // enum execution
    private fun navigateToScreen(screen : ScreenEnum){
      when(screen) {
          ScreenEnum.HOME_SCREEN -> println("navigating to home screen")
          ScreenEnum.LIVE_SCREEN -> println("navigating to live screen")
          ScreenEnum.PLAYER_SCREEN -> println("navigating to player screen")
          ScreenEnum.SETTINGS_SCREEN -> println("navigating to settings screen")
      }
    }

    // sealed execution
    private fun navigateToScreen(screen : ScreenSealed){
        when(screen) {
            ScreenSealed.HOME_SCREEN -> println("navigating to home screen")
            ScreenSealed.LIVE_SCREEN -> println("navigating to live screen")
            ScreenSealed.PLAYER_SCREEN -> println("navigating to player screen")
            ScreenSealed.SETTINGS_SCREEN -> println("navigating to settings screen")
        }
    }

    // sealedwithdata excution
    private fun navigateToScreen(screen : ScreenSealedData){
        when(screen) {
            ScreenSealedData.HOME_SCREEN -> println("navigating to home screen")
            ScreenSealedData.LIVE_SCREEN -> println("navigating to live screen")
            ScreenSealedData.PLAYER_SCREEN -> println("navigating to player screen ")
            is ScreenSealedData.SETTINGS_SCREEN -> println("navigating to settings screen ${screen.darkModeEnable}")
        }
    }

    // ScreenSealedInterface excution
    private fun navigateToScreen(screen : ScreenSealedInterface){
        when(screen) {
            ScreenSealedInterface.HOME_SCREEN -> println("navigating to home screen")
            ScreenSealedInterface.LIVE_SCREEN -> println("navigating to live screen")
            ScreenSealedInterface.PLAYER_SCREEN -> println("navigating to player screen ")
            is ScreenSealedInterface.SETTINGS_SCREEN -> println("navigating to settings screen ${screen.darkModeEnable}")
        }
    }
}
