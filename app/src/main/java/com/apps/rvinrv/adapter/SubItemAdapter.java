package com.apps.rvinrv.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.rvinrv.R;
import com.apps.rvinrv.model.SubModelItem;

import java.util.List;

public class SubItemAdapter extends RecyclerView.Adapter<SubItemAdapter.SubItemViewHolder> {

    private List<SubModelItem> subItemList;

    SubItemAdapter(List<SubModelItem> subItemList) {
        this.subItemList = subItemList;
    }

    @NonNull
    @Override
    public SubItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_sub_item, viewGroup, false);
        return new SubItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubItemViewHolder subItemViewHolder, int i) {
        SubModelItem subItem = subItemList.get(i);
        subItemViewHolder.tvSubItemTitle.setText(subItem.getSubItemTitle());
    }

    @Override
    public int getItemCount() {
        return subItemList.size();
    }

    class SubItemViewHolder extends RecyclerView.ViewHolder {
        TextView tvSubItemTitle;

        SubItemViewHolder(View itemView) {
            super(itemView);
            tvSubItemTitle = itemView.findViewById(R.id.tv_sub_item_title);
        }
    }
}