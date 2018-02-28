package cafe.despiwich.com.despiwich;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class WordAdapter extends ArrayAdapter<Dish> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Dish> dishes, int ColorResourceId) {
        super(context, 0, dishes);
        mColorResourceId = ColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Dish currentDish = getItem(position);

        TextView dishTextView = (TextView) listItemView.findViewById(R.id.dish_text);
        dishTextView.setText(currentDish.getDishName());

        TextView descTextView = (TextView) listItemView.findViewById(R.id.desc_text);
        descTextView.setText(currentDish.getDishDescription());

        TextView priceTextView =(TextView) listItemView.findViewById(R.id.dish_price);
        priceTextView.setText(currentDish.getDishPrice());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
