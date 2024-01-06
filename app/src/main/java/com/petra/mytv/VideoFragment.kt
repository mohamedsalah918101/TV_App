package com.petra.mytv

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.MediaController
import android.widget.VideoView

class VideoFragment : Fragment() {

    private lateinit var videoView: VideoView
    private var currentVideoUri: Uri? = null
    private var stopPosition:Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_video, container, false)

        val button1 = requireActivity().findViewById(R.id.button1) as Button
        val button2 = requireActivity().findViewById(R.id.button2) as Button
        val button3 = requireActivity().findViewById(R.id.button3) as Button
        videoView = view.findViewById(R.id.videoView)

        // Button listeners to switch videos
        button1.setOnClickListener {
            playVideo1()
        }
        button2.setOnClickListener {
            playVideo2()
        }
        button3.setOnClickListener {
            playVideo3()
        }

        return view
    }

    private fun playVideo1() {
        val mediaController = MediaController(requireActivity())
        mediaController.setAnchorView(videoView)
        val uri = Uri.parse("android.resource://${requireActivity().packageName}/${R.raw.video1}")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
    private fun playVideo2() {
        val mediaController = MediaController(requireActivity())
        mediaController.setAnchorView(videoView)
        val uri = Uri.parse("android.resource://${requireActivity().packageName}/${R.raw.video2}")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
    private fun playVideo3() {
        val mediaController = MediaController(requireActivity())
        mediaController.setAnchorView(videoView)
        val uri = Uri.parse("android.resource://${requireActivity().packageName}/${R.raw.video3}")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
    override fun onPause() {
        super.onPause()
        stopPosition = videoView.currentPosition
        videoView.pause()
    }
    override fun onResume() {
        super.onResume()
        videoView.seekTo(stopPosition)
        videoView.start()
    }
}