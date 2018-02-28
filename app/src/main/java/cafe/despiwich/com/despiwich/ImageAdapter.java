package cafe.despiwich.com.despiwich;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import static android.R.attr.fragment;
import static android.R.attr.saveEnabled;
import static android.R.attr.switchMinWidth;

/**
 * Created by Yugesh on 9/24/2017.
 */

public class ImageAdapter extends BaseAdapter {

    private int images[];

    private LayoutInflater layoutInflater;
    private Context context;

    public ImageAdapter(Context context, int icons[]){

        this.context= context;
        this.images = icons;

    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridView = convertView;

        if(convertView == null){

            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            gridView = layoutInflater.inflate(R.layout.custom_layout,null);

        }

        ImageView image = (ImageView) gridView.findViewById(R.id.imageView);

        image.setImageResource(images[position]);

        return gridView;
    }
}
