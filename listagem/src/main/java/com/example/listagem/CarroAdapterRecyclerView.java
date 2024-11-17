package com.example.listagem;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarroAdapterRecyclerView extends RecyclerView.Adapter<CarroAdapterRecyclerView.CarroVH> {
    Context mContext;
    int mResource;
    List<Carro> mListCarro;

    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(Carro carro);
    }
    public CarroAdapterRecyclerView(Context context, int resource, List<Carro> objs, OnItemClickListener listener){
        mContext=context;
        mResource=resource;
        mListCarro =objs;
        this.onItemClickListener = listener;
    }

    @Override
    public CarroVH onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v =View.inflate(mContext,mResource,null);
        return new CarroVH(v);
    }
    @Override
    public void onBindViewHolder(@NonNull CarroVH carroVH, int i) {
            Carro p= (Carro) mListCarro.get(i);
            carroVH.imageView.setImageResource(p.foto);
            carroVH.tvNome.setText(p.nome);

    }
    @Override
    public int getItemCount() {
        return mListCarro.size();
    }
    public class CarroVH extends RecyclerView.ViewHolder {
        TextView tvNome;
        ImageView imageView;
        public CarroVH(@NonNull View itemView) {
            super(itemView);
            tvNome=itemView.findViewById(R.id.textViewNome);
            imageView=itemView.findViewById(R.id.imageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION && onItemClickListener != null) {
                        Carro carro = mListCarro.get(position);
                        onItemClickListener.onItemClick(carro);
                    }
                }
            });
        }
    }
}
