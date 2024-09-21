package com.example.quizapp
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build

object NetworkUtil {
    //This function checks whether the device is connected to the internet.
    fun isConnectedToInternet(context: Context): Boolean {
        //Retrieves the system service for managing network connections,
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        //This checks if the device is running on Android 6.0 (API level 23) or higher.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            //Gets the currently active network or returns false if there is none.
            val network = connectivityManager.activeNetwork ?: return false
            //Retrieves the capabilities of the active network.
            val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false
            //checks if the active network supports Wi-Fi or cellular transport
            return when {
                //Returns true if connected via Wi-Fi.
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                // Returns true if connected via a cellular network.
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                //If neither transport is available, returns false.
                else -> false
            }
        } else {
            // For devices below Android 6.0, this retrieves the active network info.
            val networkInfo = connectivityManager.activeNetworkInfo
            // Returns true if there is an active network and it is connected.
            return networkInfo != null && networkInfo.isConnected
        }
    }
}
