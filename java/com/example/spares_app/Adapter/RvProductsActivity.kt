package com.example.spares_app

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.spares_app.UI.Buyer.ActivityProducts
import com.example.spares_app.UI.Buyer.ActivityViewCart
import com.example.spares_app.Models.Orders
import com.squareup.picasso.Picasso

class RvProductsActivity(var productList: List<Orders>, var context: Context, var productClickListener: ActivityProducts.ProductClickListener): RecyclerView.Adapter<CartProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartProductViewHolder { var itemView= LayoutInflater.from(parent.context).inflate(R.layout.layout_product_item,parent,false)
        return CartProductViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CartProductViewHolder, position: Int) {
        val currentOrders = productList.get(position)
        holder.tvProductName.text= currentOrders.ProductName
        holder.tvDescription.text=currentOrders.Description
        holder.tvPrices.text=currentOrders.Prices

        Picasso.get()
            .load(currentOrders.ImageUrl)
            .resize(100, 100)
            .into(holder.imgProduct)
//
        holder.cvProduct.setOnClickListener {
            var intent= Intent(context, ActivityViewCart::class.java)
            intent.putExtra("ProductName",currentOrders.ProductName)
            intent.putExtra("Description",currentOrders.Description)
            intent.putExtra("Price",currentOrders.Prices)
            intent.putExtra("ImageUrl",currentOrders.ImageUrl)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent)
        }


        holder.btnAdd.setOnClickListener {
            productClickListener.onSelectedProduct(currentOrders)
        }

        holder.etNumber.setOnClickListener {
            productClickListener.onSelectedProduct(currentOrders)
        }

        holder.btnRemove.setOnClickListener {
            productClickListener.onDeleteProduct(currentOrders)
        }


    }
    override fun getItemCount(): Int {
        return productList.size
    }
}

class CartProductViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
    var imgProduct=itemView.findViewById<ImageView>(R.id.imgProduct)
    var tvProductName=itemView.findViewById<TextView>(R.id.tvProductName)
    var tvDescription=itemView.findViewById<TextView>(R.id.tvDescription)
    var tvPrices=itemView.findViewById<TextView>(R.id.tvPrices)
    var btnAdd= itemView.findViewById<Button>(R.id.btnAdd)
    var btnRemove= itemView.findViewById<Button>(R.id.btnRemove)
    var etNumber= itemView.findViewById<EditText>(R.id.etNumber)
    var cvProduct= itemView.findViewById<CardView>(R.id.cvProduct)

}
