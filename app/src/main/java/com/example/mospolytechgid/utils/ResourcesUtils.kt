package com.example.mospolytechgid.utils

import android.content.Context
import android.graphics.drawable.Drawable

public class ResourcesUtils {
    fun getMap(name: String, context: Context): Drawable {
        val resources = context.resources
        val id = resources.getIdentifier(name, "drawable", context.packageName)
        return resources.getDrawable(id, context.theme)
    }
}