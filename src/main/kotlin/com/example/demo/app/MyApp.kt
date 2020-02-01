package com.example.demo.app

import com.example.demo.view.LoginScreen
import com.example.demo.view.MainView
import tornadofx.*
import kotlin.reflect.KClass

//class MyApp: App(MainView::class, Styles::class)
//class MyApp: App(LoginScreen::class, Styles::class)
class MyApp: App(){
    override val primaryView= LoginScreen::class

    init{
        importStylesheet(Styles::class)
        reloadStylesheetsOnFocus()
    }
}
