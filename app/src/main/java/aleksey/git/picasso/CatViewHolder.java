package aleksey.git.picasso;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class CatViewHolder extends RecyclerView.ViewHolder {

    private TextView txtCatName;
    private TextView txtCatBreed;
    private ImageView imgCat;

    public CatViewHolder(@NonNull View itemView) {
        super(itemView);
        txtCatName = itemView.findViewById(R.id.name);
        txtCatBreed = itemView.findViewById(R.id.breed);
        imgCat = itemView.findViewById(R.id.imageView);
    }

    public void bind(Cat cat){
        txtCatName.setText(cat.getName());
        txtCatBreed.setText(cat.getBreed());

        Picasso.get().load(cat.getImgUrl()).into(imgCat);
    }
}
