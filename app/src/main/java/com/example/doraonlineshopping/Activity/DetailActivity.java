package com.example.doraonlineshopping.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.bumptech.glide.Glide;
import com.example.doraonlineshopping.Helper.ManagmentCart;
import com.example.doraonlineshopping.R;
import com.example.doraonlineshopping.databinding.ActivityDetailBinding;
import com.example.doraonlineshopping.domain.PopularDomain;

public class DetailActivity extends AppCompatActivity {
    private ActivityDetailBinding binding;
private PopularDomain object;
private int numberOrder=1;
private ManagmentCart managmentCart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getBundles();
        managmentCart=new ManagmentCart(this);
        statusBarColor();
    }
    private void statusBarColor() {
        Window window=DetailActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(DetailActivity.this, R.color.white));
    }
    private void getBundles() {
        object= (PopularDomain) getIntent().getSerializableExtra("object");

        int drawableResourceID=this.getResources().getIdentifier(object.getPicUrl(),"drawable",this.getPackageName());
        Glide.with(this)
                .load(drawableResourceID)
                .into(binding.itemPic);

        binding.titleTxt.setText(object.getTitle());
        binding.priceTxt.setText("Rs."+object.getPrice());
        binding.descriptionTxt.setText(object.getDescription());

        binding.addToCardBtn.setOnClickListener(view -> {
            object.setNumInCart(numberOrder);
            managmentCart.insertFood(object);
        });



        binding.backBtn.setOnClickListener(view -> finish());
    }
}