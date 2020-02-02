package com.example.demo.view

import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import tornadofx.*

class MyView2 : View("My View2") {
    override val root = VBox()
    init {
        root += Button("Press Me")
        root += Label("")
    }
//    override val root = borderpane {
//    }
}
