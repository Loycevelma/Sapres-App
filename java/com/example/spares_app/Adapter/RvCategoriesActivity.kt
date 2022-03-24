package com.example.spares_app

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.spares_app.UI.Buyer.ActivityProducts
import com.example.spares_app.Models.Products
import com.squareup.picasso.Picasso

class RvCategoriesActivity  (var categoriesList: List<Products>, var context: Context):
    RecyclerView.Adapter<CategoriesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder{
        var categoriesItem= LayoutInflater.from(parent.context).inflate(R.layout.categories_item_list,parent,false)
        return CategoriesViewHolder(categoriesItem)
    }
    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val currentCategory = categoriesList.get(position)
        holder.categoryTitle.text= currentCategory.name


        Picasso.get()
            .load(currentCategory.imgUrl)
            .into(holder.img)
        holder.card.setOnClickListener {
            val intent= Intent(context, ActivityProducts::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }
}

class CategoriesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var categoryTitle = itemView.findViewById<TextView>(R.id.productTitle)
    var img = itemView.findViewById<ImageView>(R.id.categoryimage)
    var card = itemView.findViewById<CardView>(R.id.cvCardProduct)
}
