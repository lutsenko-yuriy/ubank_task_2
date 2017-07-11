package com.yurich.funwithtablelayout

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by yurich on 11.07.17.
 */
class TableAdapter(newList: () -> List<DisplayedItem>) : RecyclerView.Adapter<TableAdapter.TableRowViewHolder>() {

    val format = SimpleDateFormat("hh:mm", Locale.getDefault())
    val list: List<DisplayedItem> by lazy(newList)

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int)
            = TableRowViewHolder(parent)

    override fun onBindViewHolder(holder: TableRowViewHolder?, position: Int) {
        holder?.bind(list[position])
    }

    override fun getItemCount() = list.size

    inner class TableRowViewHolder(parent: ViewGroup?): RecyclerView.ViewHolder(parent?.inflate(R.layout.list_item)) {
        fun bind(displayedItem: DisplayedItem) = with(itemView) {
            text.text = displayedItem.text
            time.text = format.format(displayedItem.date)
        }
    }
}
