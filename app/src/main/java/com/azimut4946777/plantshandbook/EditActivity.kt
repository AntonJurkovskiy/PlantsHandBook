package com.azimut4946777.plantshandbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.azimut4946777.plantshandbook.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {
    lateinit var binding: ActivityEditBinding
    private var indexImages = 0
    private var imageId = R.drawable.plant1
    private val imagesIdList = listOf(
        R.drawable.plant1,
        R.drawable.plant2,
        R.drawable.plant3,
        R.drawable.plant4,
        R.drawable.plant5)
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityEditBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initButtons()
    }
    private fun initButtons()  = with(binding) {
        bNextImage.setOnClickListener {
            indexImages++
            if(indexImages>imagesIdList.size-1) indexImages = 0
            //Log.d("MyLog","index = $indexImages")
            imageId = imagesIdList[indexImages]
            imageView2.setImageResource(imageId)
        }
        bDone.setOnClickListener {
            val plant = Plant(imageId,edTitle.text.toString(),edDesctiption.text.toString())
            val editIntent = Intent().apply {
                putExtra("plant",plant)
            }
            setResult(RESULT_OK,editIntent)
            finish()
        }


    }



}