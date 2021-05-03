package com.pristyncare.chimeapp.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DebugSettingsViewModel : ViewModel() {
    val endpointUrl = MutableLiveData<String>("https://x6b28y77b9.execute-api.us-east-1.amazonaws.com/Prod")

    fun sendEndpointUrl(data: String) {
        endpointUrl.value = data
    }
}
