package com.example.kotlinapp

import android.os.AsyncTask
import android.util.Log
import java.io.IOException
import java.lang.Exception
import java.net.MalformedURLException
import java.net.URL

enum class DownLoadStatus {
    OK, IDLE, NOT_INITIALISED, FAILED_OR_EMPTY, PERMISSIONS_ERROR, ERROR
}
class GetRawData : AsyncTask<String, Void, String>(){

    private val TAG = "GetRawData"
    private var downLoadStatus = DownLoadStatus.IDLE

    override fun onPostExecute(result: String?) {
        Log.d(TAG, "onPostExecute called, parameter is $result")
    }

    override fun doInBackground(vararg params: String?): String {
        if (params[0] == null){
            downLoadStatus = DownLoadStatus.NOT_INITIALISED
            return "No URL specified"
        }

        try{
            downLoadStatus = DownLoadStatus.OK
            return URL(params[0]).readText()
        }catch (e : Exception){
            val errorMessage = when (e) {
                is MalformedURLException -> {
                    val downLoadStatus = DownLoadStatus.NOT_INITIALISED
                    "doInBackground: Invalid URL ${e.message}"
                }
                is IOException -> {
                    val downLoadStatus = DownLoadStatus.FAILED_OR_EMPTY
                    "doInBackground: IO Exception reading data: ${e.message}"
                }
                is SecurityException -> {
                    val downLoadStatus = DownLoadStatus.PERMISSIONS_ERROR
                    "doInBackground: Security exception: Needs permission? ${e.message}"
                } else->{
                    val downLoadStatus = DownLoadStatus.ERROR
                    "Unknown error: ${e.message}"
                }
            }
            Log.e(TAG, errorMessage)
            return errorMessage
        }
    }
}












