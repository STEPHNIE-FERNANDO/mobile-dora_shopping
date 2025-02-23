package com.example.doraonlineshopping.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.example.doraonlineshopping.Adapter.CartAdapter;
import com.example.doraonlineshopping.Helper.ChangeNumberItemsListener;
import com.example.doraonlineshopping.Helper.ManagmentCart;
import com.example.doraonlineshopping.R;
import com.example.doraonlineshopping.databinding.ActivityCartBinding;

public class CartActivity extends AppCompatActivity {
private ManagmentCart managmentCart;
ActivityCartBinding binding;
double tax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        managmentCart=new ManagmentCart(this);
        setVariable();
        initlist();
        calculatorCart();
        statusBarColor();

        
    }
    private void statusBarColor() {
        Window window=CartActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(CartActivity.this,R.color.white));
    }
    private void initlist() {
        if(managmentCart.getListCart().isEmpty()){
            binding.emptyTxt.setVisibility(View.VISIBLE);
            binding.scroll.setVisibility(View.GONE);
        }else{
            binding.emptyTxt.setVisibility(View.GONE);
            binding.scroll.setVisibility(View.VISIBLE);
        }
        binding.cartView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        binding.cartView.setAdapter(new CartAdapter(managmentCart.getListCart(), () -> calculatorCart()));
    }

    private void calculatorCart(){
        double percentTax=0.02;
        double delivery=10;
        tax=Math.round(managmentCart.getTotalFee()*percentTax*100)/100;
        double total = Math.round((managmentCart.getTotalFee() + tax + delivery) * 100) / 100;
        double itemTotal = Math.round(managmentCart.getTotalFee()*100)/100;

        binding.totalFeeTxt.setText("Rs."+itemTotal);
        binding.taxTxt.setText("Rs."+tax);
        binding.deliveryTxt.setText("Rs."+delivery);
        binding.totalTxt.setText("Rs."+total);



    }

    private void setVariable() {
        binding.backBtn.setOnClickListener(view -> finish());
    }
}