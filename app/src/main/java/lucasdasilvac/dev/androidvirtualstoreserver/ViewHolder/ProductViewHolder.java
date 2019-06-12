package lucasdasilvac.dev.androidvirtualstoreserver.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import lucasdasilvac.dev.androidvirtualstoreserver.Common.Common;
import lucasdasilvac.dev.androidvirtualstoreserver.Interface.ItemClickListener;
import lucasdasilvac.dev.androidvirtualstoreserver.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements
        View.OnClickListener,
        View.OnCreateContextMenuListener

{


    public TextView product_name;
    public ImageView product_image;

    private ItemClickListener itemClickListener;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        product_name = (TextView) itemView.findViewById(R.id.product_name);
        product_image = (ImageView) itemView.findViewById(R.id.product_image);

        itemView.setOnCreateContextMenuListener(this);
        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition(), false);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("selecione a ação");

        menu.add(0, 0, getAdapterPosition(), Common.UPDATE);
        menu.add(0, 1, getAdapterPosition(), Common.DELETE);
    }
}
