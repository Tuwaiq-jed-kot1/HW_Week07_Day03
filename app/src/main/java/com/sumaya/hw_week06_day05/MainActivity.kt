package com.sumaya.hw_week06_day05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
# Digital Signature Project
---
- Create a simple digital signature application that
allows users to
draw their own signatures on `CustomView`.

Also, the
application has a button where when the user clicks on it
the background of CustomView changes from white to black using `Animation`,

at the same time,
the paint color will change from black to white, vice versa.

- Use `Theme` to change the style of the application based on what you like.
*/



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}