package ua.com.getmysite.booksearch.features.gui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;

import ua.com.getmysite.booksearch.R;

/**
 * Created by anymol on 23.03.2017.
 */

public class RecyclerViewHolder
        extends RecyclerView.ViewHolder
        implements View.OnClickListener {

    public TextView tvNameBook;
    public SimpleDraweeView sdvImage;
    private IOnItemClickListener mItemClickListener;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        tvNameBook = (TextView)itemView.findViewById(R.id.tvNameBook);
        sdvImage = (SimpleDraweeView)itemView.findViewById(R.id.sdvImage);
    }

    public void setOnItemClickListener(final IOnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(view.getContext(), "Clicked Position = " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
        if (mItemClickListener != null) {
            mItemClickListener.onItemClick(view, getAdapterPosition());
        }
    }
}
