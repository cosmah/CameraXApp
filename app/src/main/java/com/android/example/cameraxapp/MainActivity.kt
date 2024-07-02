package com.android.example.cameraxapp

import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.ImageCapture
import androidx.camera.core.VideoCapture
import com.android.example.cameraxapp.databinding.ActivityMainBinding

typealias LumaListener = (luma: Double) -> Unit

class MainActivity : AppCompatActivity(){
    private lateinit var viewBinding: ActivityMainBinding
    private var imageCapture: ImageCapture? = null

    private var videoCapture: VideoCapture<Recorder>? = null
    private var recording: Recording? = null

}