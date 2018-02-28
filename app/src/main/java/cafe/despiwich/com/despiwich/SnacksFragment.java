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
public class SnacksFragment extends Fragment {


    public SnacksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_snacks, container, false);

        ArrayList<Dish> dishes = new ArrayList<Dish>();

        dishes.add(new Dish("Nachos","Sample text here","₹100"));
        dishes.add(new Dish("French Fries","","₹100"));
        dishes.add(new Dish("Cheese Fries","","₹100"));
        dishes.add(new Dish("Gru Nuggets","","₹100"));
        dishes.add(new Dish("Gru Strips","","₹100"));
        dishes.add(new Dish("Kevin Nuggets","","₹100"));

        WordAdapter wordAdapter = new WordAdapter(getActivity(), dishes,R.color.category_snacks);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
        // Inflate the layout for this fragment
        return rootView;
    }

}
