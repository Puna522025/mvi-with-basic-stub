package com.androidmvi.spacex.utils

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

class Utilities {

    companion object {
        fun loadImage(
            context: Context,
            imageView: ImageView,
            url: String?
        ) {

            val colorDrawable = ColorDrawable(Color.DKGRAY)
            val requestOptions = RequestOptions
                .placeholderOf(colorDrawable)
                .fitCenter()
                .optionalCenterCrop()
            Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(imageView)
        }

        /**
         * Reads input file and returns string content
         *
         * @param filename file path in assets directory
         * @return contents of file
         */
        @Throws(IOException::class)
        fun readAssetAsString(filename: String, context: Context): String? {
            var reader: BufferedReader? = null
            val returnString = StringBuilder()
            return try {
                reader = BufferedReader(
                    InputStreamReader(context.getAssets().open(filename))
                )
                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    returnString.append(line)
                }
                returnString.toString()
            } finally {
                try {
                    reader?.close()
                } catch (e: IOException) {
                    // Don't throw in finally block
                }
            }
        }

        @Throws(IOException::class)
        fun listFilesInDir(path: String, context: Context): MutableList<Array<String>> {
            return Arrays.asList(context.getAssets().list(path))
        }
    }
}