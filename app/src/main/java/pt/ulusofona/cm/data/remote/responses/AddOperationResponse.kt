package pt.ulusofona.cm.data.remote.responses

import com.google.gson.annotations.SerializedName

data class AddOperationResponse(@SerializedName("message") val message: String) {

    override fun toString(): String {
        return "$message"
    }
}