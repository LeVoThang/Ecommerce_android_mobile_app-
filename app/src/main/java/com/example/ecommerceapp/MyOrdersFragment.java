package com.example.ecommerceapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MyOrdersFragment extends Fragment {


    private RecyclerView myOrdersRecyclerView;

    public MyOrdersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_orders, container, false);

        myOrdersRecyclerView = view.findViewById(R.id.my_orders_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        myOrdersRecyclerView.setLayoutManager(layoutManager);

        List<MyOrderItemModel> myOrderItemModelList = new ArrayList<>();
        myOrderItemModelList.add(new MyOrderItemModel(R.drawable.product_image,2,"Pixel 2XL (BLACK)","Delivered on Mon,1st Feb 2021 "));
        myOrderItemModelList.add(new MyOrderItemModel(R.drawable.image2,1,"Pixel 2XL (BLACK)","Delivered on Mon,1st Feb 2021 "));
        myOrderItemModelList.add(new MyOrderItemModel(R.drawable.product_image,0,"Pixel 2XL (BLACK)","Cancelled"));
        myOrderItemModelList.add(new MyOrderItemModel(R.drawable.image2,4,"Pixel 2XL (BLACK)","Delivered on Mon,1st Feb 2021 "));

        MyOrderAdapter myOrderAdapter = new MyOrderAdapter(myOrderItemModelList);
        myOrdersRecyclerView.setAdapter(myOrderAdapter);
        myOrderAdapter.notifyDataSetChanged();
        return view;
    }
}