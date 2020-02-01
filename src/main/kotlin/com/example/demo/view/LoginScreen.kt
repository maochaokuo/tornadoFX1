package com.example.demo.view

import javafx.scene.layout.VBox
import tornadofx.*

class LoginScreen : View() {
    override val root= VBox()

    init {
        with (root) {
            title ="Login"
            hbox {
                label("Username")
                textfield()
            }
            hbox {
                label("Password")
                passwordfield()
            }
            hbox {
                button("Login")
            }
        }
    }
}