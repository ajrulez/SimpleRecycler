package com.e16din.simplerecycler.adapter;

import android.content.Context;
import android.support.annotation.NonNull;

import com.e16din.handyholder.holder.HandyHolder;
import com.e16din.handyholder.listeners.click.OnClickListener;
import com.e16din.handyholder.listeners.click.OnViewsClickListener;

import java.util.List;

@SuppressWarnings("unused")//remove it to see unused warnings
public abstract class SimpleClickAdapter<HOLDER extends HandyHolder, MODEL> extends SimpleAsyncAdapter<HOLDER, MODEL> {

    protected OnClickListener<MODEL> mOnItemClickListener;
    protected OnViewsClickListener<MODEL> mOnItemViewsClickListener;

    protected List<Integer> mClickableViewsList;
    protected int[] mClickableViewsArray;


    public SimpleClickAdapter(@NonNull Context context, @NonNull List<MODEL> items) {
        super(context, items);
    }

    public SimpleClickAdapter(@NonNull Context context) {
        super(context);
    }

    public void setOnItemClickListener(OnClickListener<MODEL> listener) {
        mOnItemClickListener = listener;
    }


    public void setOnItemViewsClickListener(List<Integer> clickableViews, OnViewsClickListener<MODEL> listener) {
        mClickableViewsList = clickableViews;
        mOnItemViewsClickListener = listener;
    }

    public void setOnItemViewsClickListener(int[] clickableViews, OnViewsClickListener<MODEL> listener) {
        mClickableViewsArray = clickableViews;
        mOnItemViewsClickListener = listener;
    }


    public OnClickListener<MODEL> getOnItemClickListener() {
        return mOnItemClickListener;
    }


    public OnViewsClickListener<MODEL> getOnViewsClickListener() {
        return mOnItemViewsClickListener;
    }


    public List<Integer> getClickableViewsList() {
        return mClickableViewsList;
    }
}
