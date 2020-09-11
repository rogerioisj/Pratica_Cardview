package br.com.rogerioisj.pratica_cardview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import br.com.rogerioisj.pratica_cardview.R;

public class CardviewAdapter extends RecyclerView.Adapter<CardviewAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View cardview = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);

        return new MyViewHolder(cardview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView nomeUsuario;
        private TextView dataPublicacao;
        private ImageView imagemPublicacao;
        private TextView comentarioPublicacao;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeUsuario = itemView.findViewById(R.id.card_texto_nome);
            dataPublicacao = itemView.findViewById(R.id.card_texto_momento);
            imagemPublicacao = itemView.findViewById(R.id.card_foto);
            comentarioPublicacao = itemView.findViewById(R.id.card_comentario);

        }
    }
}
