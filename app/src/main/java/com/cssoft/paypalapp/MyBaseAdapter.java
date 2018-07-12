package com.cssoft.paypalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cssoft.paypalapp.model.Feed;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class MyBaseAdapter extends BaseAdapter {

    Context ctx;
    Feed data;

    public MyBaseAdapter(Context context, Feed feed)
    {
            ctx=context;
            data=feed;
    }


    @Override
    public int getCount() {
        return data.posts.data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        System.out.println(">>>>>>>>>>>>"+position+"<<<<<<<<<<<<<");


        LayoutInflater inflater=LayoutInflater.from(ctx);
        View view=inflater.inflate(R.layout.message_layout,null);
        ImageView imageView=view.findViewById(R.id.image1);
        ImageView imageView1=view.findViewById(R.id.imageView1);
        TextView textView=view.findViewById(R.id.text1);
        Picasso.get().load("http://graph.facebook.com/100000529291992/picture?type=square").into(imageView);
        if(data.posts.data.get(position).message!=null)
        {
            textView.setText(data.posts.data.get(position).message);
            textView.setVisibility(View.VISIBLE);
        }
        else
        {
            textView.setVisibility(View.GONE);
        }


        if(data.posts.data.get(position).fullPicture!=null)
        {
            Picasso.get().load(data.posts.data.get(position).fullPicture).into(imageView1);
            imageView1.setVisibility(View.VISIBLE);

        }
        else
        {
            imageView1.setVisibility(View.GONE);
        }

        return view;

    }
}
