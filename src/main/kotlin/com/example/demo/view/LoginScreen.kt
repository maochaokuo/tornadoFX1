package com.example.demo.view


import com.example.demo.app.Styles
import com.example.demo.app.Styles.Companion.row
import javafx.scene.layout.VBox
import tornadofx.*

class LoginScreen : View() {
    override val root= VBox()

    init {
        title ="Login"

        with (root) {
            addClass(Styles.wrapper)
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
            children.addClass(row)
        }
    }
}