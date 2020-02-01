package com.example.demo.app

import javafx.scene.text.FontWeight
import tornadofx.Stylesheet
import tornadofx.box
import tornadofx.cssclass
import tornadofx.px

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
        s(wrapper){
            s(label){
                minWidth=100.px
            }
            padding = box(15.px)
            s(row){
                padding = box(10.px, 5.px)
            }
        }
    }
}