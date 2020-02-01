package com.example.demo.app

import javafx.scene.text.FontWeight
import tornadofx.*
import java.awt.Color

class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()
        val wrapper by cssclass()
        val row by cssclass()
    }

    init {
        label and heading {
            padding = box(10.px)
            fontSize = 20.px
            fontWeight = FontWeight.BOLD
        }
        val flat = mixin {
            backgroundInsets = multi(box(0.px))
//            borderColor = box(Color.LIGHT_GRAY)
        }
        s(wrapper){
            s(label){
                minWidth=100.px
            }
            padding = box(15.px)
//            backgroundColor=Color.ORANGE
            s(row){
                padding = box(5.px)
            }
        }
        s(button, textInput){
            +flat
        }
    }
}