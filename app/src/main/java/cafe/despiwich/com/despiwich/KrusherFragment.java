package cafe.despiwich.com.despiwich;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class KrusherFragment extends Fragment {


    public KrusherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_krusher, container, false);

        ArrayList<Dish> dishes = new ArrayList<Dish>();

        //tang
        dishes.add(new Dish("Orange Tang","Sample text here","₹40"));
        dishes.add(new Dish("Grape Tang","","₹40"));
        dishes.add(new Dish("Lemon Tang","","₹40"));

        //krushers
        dishes.add(new Dish("Orange Krushers","","₹50"));
        dishes.add(new Dish("Blue Lady Krushers","","₹50"));
        dishes.add(new Dish("Litchi Krushers","","₹50"));
        dishes.add(new Dish("Green Apple Krushers","","₹50"));
        dishes.add(new Dish("Strawberry Krushers","","₹50"));
        dishes.add(new Dish("Kiwi Krushers","","₹50"));
        dishes.add(new Dish("Lime Krushers","","₹50"));
        dishes.add(new Dish("Ice Tea","","₹60"));

        WordAdapter wordAdapter = new WordAdapter(getActivity(), dishes,R.color.category_krushers);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
        // Inflate the layout for this fragment
        return rootView;
    }

}
