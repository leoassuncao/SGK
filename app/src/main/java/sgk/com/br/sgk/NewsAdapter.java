package sgk.com.br.sgk;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Leonardo Assunção on 28/05/2016.
 */
public class NewsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<NewsList> mDataSet;
    private Activity mActivity;

    public NewsAdapter(List<NewsList> news, Activity act) {
        this.mDataSet = news;
        this.mActivity = act;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.news_card_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;

        viewHolder.news_date.setText(this.mDataSet.get(position).getNews_date());
        viewHolder.news_details.setText(this.mDataSet.get(position).getNews_details());
        viewHolder.news_photo.setImageResource(this.mDataSet.get(position).getNews_photo());
        viewHolder.news_title.setText(this.mDataSet.get(position).getNews_title());
        viewHolder.mCardView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView news_photo;
        private TextView news_date;
        private TextView news_title;
        private TextView news_details;
        public View mView;
        public CardView mCardView;


        public ViewHolder(View v) {
            super(v);
            this.news_photo = (ImageView) v.findViewById(R.id.news_photo);
            this.news_date = (TextView) v.findViewById(R.id.news_date);
            this.news_title = (TextView) v.findViewById(R.id.news_title);
            this.news_details = (TextView) v.findViewById(R.id.news_details);

            mView = v;
            mCardView = (CardView) v.findViewById(R.id.card_view);
        }
    }

}
