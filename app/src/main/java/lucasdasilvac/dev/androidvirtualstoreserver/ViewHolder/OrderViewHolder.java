package lucasdasilvac.dev.androidvirtualstoreserver.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.TextView;

import lucasdasilvac.dev.androidvirtualstoreserver.Interface.ItemClickListener;
import lucasdasilvac.dev.androidvirtualstoreserver.R;

public class OrderViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnCreateContextMenuListener {
    public TextView txtOrderId, txtOrderStatus, txtOrderPhone, txtOrderAddress;

    private ItemClickListener itemClickListener;

    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);

        txtOrderAddress = (TextView) itemView.findViewById(R.id.order_address);
        txtOrderId = (TextView) itemView.findViewById(R.id.order_id);
        txtOrderStatus = (TextView) itemView.findViewById(R.id.order_status);
        txtOrderPhone = (TextView) itemView.findViewById(R.id.order_phone);

        itemView.setOnClickListener(this);
        itemView.setOnCreateContextMenuListener(this);

    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        //itemClickListener.onClick(v, getAdapterPosition(), false);
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle("selecione a ação");

        contextMenu.add(0, 0, getAdapterPosition(), "atualizar");
        contextMenu.add(0, 1, getAdapterPosition(), "deletar");
    }
}
