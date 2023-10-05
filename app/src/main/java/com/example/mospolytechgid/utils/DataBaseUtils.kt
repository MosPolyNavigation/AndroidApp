package com.example.mospolytechgid.utils

import com.example.mospolytechgid.model.CampusModel
import com.google.gson.Gson

class DataBaseUtils {
    data class DBUnit(
        val id: Int,
        val campus: String,
        val corpus: String,
        val floor: Int,
        val number: Int,
        val type: String,
        val desc: String
    )
// парсинг json бд (в разработке)
    fun getCampuses(json: String): List<CampusModel> {
        val data = Gson().fromJson(json, Array<DBUnit>::class.java)

        var campuses: Map<String, String> = emptyMap<String, String>()

        for (item in data){
            if (!campuses.containsKey(item.campus)){
                campuses.apply {  }
            }
        }

        return emptyList()
    }
}