package aleksey.git.picasso;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatViewHolder> {

    private List<Cat> cats;

    public void setCats(List<Cat> cats){
        this.cats = cats;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        Cat cat = cats.get(position);
        holder.bind(cat);
    }

    @Override
    public int getItemCount() {
        return cats.size();
    }
}
