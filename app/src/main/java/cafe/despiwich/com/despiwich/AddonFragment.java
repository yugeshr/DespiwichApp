package cafe.despiwich.com.despiwich;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class AddonFragment extends Fragment {


    public AddonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_addon, container, false);

        ArrayList<Dish> dishes = new ArrayList<Dish>();

        //tang
        dishes.add(new Dish("Extra Kevin","Sample text here","₹10"));
        dishes.add(new Dish("Extra Bob","","₹10"));
        dishes.add(new Dish("Extra Stuart","","₹10"));
        dishes.add(new Dish("Extra Mayo","","₹10"));
        dishes.add(new Dish("Double Cheese","","₹20"));
        dishes.add(new Dish("Triple Cheese","","₹30"));

        WordAdapter wordAdapter = new WordAdapter(getActivity(), dishes,R.color.category_addon);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
        // Inflate the layout for this fragment
        return rootView;
    }

}
