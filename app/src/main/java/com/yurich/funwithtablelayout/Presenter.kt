package com.yurich.funwithtablelayout

import java.util.*

/**
 * Created by yurich on 11.07.17.
 */
object Presenter {
    val displayedItems = MutableList<DisplayedItem>(100) {
        DisplayedItem("$it" * it, Date())
    }
}
