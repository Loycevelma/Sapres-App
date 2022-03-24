package com.example.spares_app.UI.Buyer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isNotEmpty
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spares_app.Models.Orders
import com.example.spares_app.RvCategoriesActivity
import com.example.spares_app.RvProductsActivity
import com.example.spares_app.databinding.ActivityProductsBinding
import com.google.gson.Gson

class ActivityProducts : AppCompatActivity() {
    var selectedProducts = mutableListOf<Orders>()
    lateinit var binding: ActivityProductsBinding
    lateinit var recyclerCart: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityProductsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        selectProduct()
    }
    override fun onResume() {
        super.onResume()
        binding.btnCheckout.setOnClickListener{
            var intent = Intent(baseContext, ActivityViewCart::class.java)
            var gson = Gson()
            intent.putExtra("SELECTED_PRODUCTS", gson.toJson(selectedProducts))
            startActivity(intent)
        }
    }

    fun selectProduct(){
        binding.recyclerCart
       var  cart = binding.recyclerCart
        var productList= listOf(
            Orders("https://5.imimg.com/data5/IM/XR/GP/SELLER-42455800/car-wiper-blade-500x500-jpg-500x500.jpg","Wipper", "KES 3000","Pushes water, or snow,off the surface oF a screen."),
            Orders("https://media.istockphoto.com/photos/bearings-of-different-types-isolated-on-white-background-picture-id1211117498?k=20&m=1211117498&s=612x612&w=0&h=tr34Sq9Dxn5o1Jvh_v6gbgMCmpFtPdl3sOPQyclXI9E=","Bearings","KES 6000","It enables the \n" +
                    "wheel to rotate\n" +
                    " smoothly\n"),
            Orders("https://image.made-in-china.com/202f0j00TINYjBSdSOkP/PVC-Protector-Bumper-Car-Body-Chrome-Moulding-Trim-Strip.jpg","Body Trim","KES 3000","used to protect \n" +
                    "the car from  damage \n" +
                    "in parking lots."),
            Orders("https://m.media-amazon.com/images/I/51-xeCwpeCL._AC_SY355_.jpg","Bottle coolant","KES 5000","Used to help cool the air in a vehicle."),
            Orders("https://media.istockphoto.com/photos/for-cap-picture-id469322426?k=20&m=469322426&s=612x612&w=0&h=2F0AL8YRnyaJ-bLG2GXfBVYRE0LAVjJCjxe4t3tixEg=","Bonnet","KES 7000"," Is the metal cover over the engine at the front"),
            Orders("https://img2.exportersindia.com/product_images/bc-full/dir_154/4604834/car-bumper-1513063407-3514658.jpeg","Bumpers",  "KES 4000","Used to  absorb impact in a minor collision")
        )
//        recyclerCart=binding.recyclerCart
//        var ordersAdapter = RvCategoriesActivity(Orders, baseContext)
//        recyclerCart.adapter = ordersAdapter
//        recyclerCart.layoutManager = LinearLayoutManager(baseContext)
//        if ( recyclerCart.isNotEmpty()) {
//            recyclerCart  .layoutManager = LinearLayoutManager(baseContext)
//            recyclerCart.adapter = ordersAdapter
//        } else {
//            Toast.makeText(baseContext, "", Toast.LENGTH_LONG).show()
//        }

        val gridLayout = GridLayoutManager(this, 2)
        binding.recyclerCart.layoutManager = gridLayout
        var cartAdapter= RvProductsActivity(productList,baseContext,object :
            ProductClickListener {

            override fun onSelectedProduct(orders: Orders){
                selectedProducts.add(orders)

            }

            override fun onDeleteProduct(orders: Orders) {
                selectedProducts.remove(orders)
            }
        })
        binding.recyclerCart.adapter = cartAdapter

    }
    interface
    ProductClickListener{
        fun onSelectedProduct(orders: Orders)
        fun onDeleteProduct(orders: Orders)
    }
}