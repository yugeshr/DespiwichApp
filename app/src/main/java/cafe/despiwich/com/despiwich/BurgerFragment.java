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
public class BurgerFragment extends Fragment {


    public BurgerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_burger, container, false);

        ArrayList<Dish> dishes = new ArrayList<Dish>();

        //veg special
        dishes.add(new Dish("Veg Delight Burger","Sample text here","₹100"));
        dishes.add(new Dish("Masala Veg Burger","","₹100"));
        dishes.add(new Dish("Devil Veg Burger","","₹100"));
        dishes.add(new Dish("Crackling Veg Burger","","₹110"));
        dishes.add(new Dish("Twin Tower Veg Burger","","₹150"));

        //gru special
        dishes.add(new Dish("Gru Delight Burger","","₹120"));
        dishes.add(new Dish("Masala Gru Burger","","₹120"));
        dishes.add(new Dish("Devil Gru Burger","","₹120"));
        dishes.add(new Dish("Crackling Gru Burger","","₹130"));
        dishes.add(new Dish("Twin Tower Gru Burger","","₹180"));


        WordAdapter wordAdapter = new WordAdapter(getActivity(), dishes,R.color.category_burgers);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
        // Inflate the layout for this fragment
        return rootView;
    }

}
