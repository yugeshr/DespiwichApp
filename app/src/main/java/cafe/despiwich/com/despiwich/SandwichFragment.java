package cafe.despiwich.com.despiwich;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SandwichFragment extends Fragment {


    public SandwichFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_sandwich, container, false);

        ArrayList<Dish> dishes = new ArrayList<Dish>();

        //Bob specials
        dishes.add(new Dish("Mayo Bob","Mayonise coated sandwich","₹60"));
        dishes.add(new Dish("Beedo Mayo Bob","","₹70"));
        dishes.add(new Dish("Devil Bob","","₹70"));
        dishes.add(new Dish("Delight Bob","","₹70"));
        dishes.add(new Dish("Southwest Bob","","₹70"));
        dishes.add(new Dish("Bob Butter Masala","","₹70"));
        dishes.add(new Dish("Crackling Bob Special","","₹85"));
        dishes.add(new Dish("Despiwich Bob Special","","₹100"));
        dishes.add(new Dish("Masala Bob Special","","₹100"));
        dishes.add(new Dish("Bob Double Decker","","₹110"));

        //Kevin specials
        dishes.add(new Dish("Mayo Kevin","Mayonise coated sandwich","₹60"));
        dishes.add(new Dish("Beedo Mayo Kevin","","₹70"));
        dishes.add(new Dish("Devil Kevin","","₹70"));
        dishes.add(new Dish("Delight Kevin","","₹70"));
        dishes.add(new Dish("Southwest Kevin","","₹70"));
        dishes.add(new Dish("Kevin Butter Masala","","₹70"));
        dishes.add(new Dish("Peri Peri Kevin","","₹75"));
        dishes.add(new Dish("Crackling Kevin Special","","₹85"));
        dishes.add(new Dish("Despiwich Kevin Special","","₹100"));
        dishes.add(new Dish("Masala Kevin Special","","₹100"));
        dishes.add(new Dish("Kevin Double Decker","","₹110"));

        //Stuart special
        dishes.add(new Dish("Devil Stuart","","₹70"));
        dishes.add(new Dish("Stuart Butter Masala","","₹70"));
        dishes.add(new Dish("Crackling Stuart Special","","₹85"));
        dishes.add(new Dish("Despiwich Stuart Special","","₹100"));
        dishes.add(new Dish("Masala Stuart Special","","₹100"));
        dishes.add(new Dish("Stuart Double Decker","","₹110"));

        //Desserts
        dishes.add(new Dish("Dark Chocowich","","₹85"));
        dishes.add(new Dish("White Chocowich","","₹70"));
        dishes.add(new Dish("Berrywich","","₹70"));
        dishes.add(new Dish("Mixed Chocowich","","₹75"));
        dishes.add(new Dish("Dark Chocolate Bananawich","","₹80"));
        dishes.add(new Dish("Nutella Browniewich","","₹100"));
        dishes.add(new Dish("Strawberry Gelatowich","","₹100"));
        dishes.add(new Dish("Chocolate Gelatowich","","₹100"));
        dishes.add(new Dish("Vanilla Gelatowich","","₹100"));

        //Gru specials
        dishes.add(new Dish("Devil Gru","","₹110"));
        dishes.add(new Dish("Masala Gru","","₹110"));
        dishes.add(new Dish("Delight Gru","","₹110"));
        dishes.add(new Dish("Beedo Gru","","₹110"));
        dishes.add(new Dish("Southwest Gru","","₹110"));
        dishes.add(new Dish("Peri Peri Gru","","₹110"));
        dishes.add(new Dish("Barbeque Gru","","₹110"));
        dishes.add(new Dish("Crackling Gru","","₹120"));
        dishes.add(new Dish("Yummy Gru","","₹120"));
        dishes.add(new Dish("Despiwich Gru Special","","₹120"));
        dishes.add(new Dish("Gru Double Decker","","₹140"));
        dishes.add(new Dish("Yummy Poisson","","₹150"));
        dishes.add(new Dish("Despiwich Yummy Poisson","","₹170"));




        WordAdapter wordAdapter = new WordAdapter(getActivity(), dishes,R.color.category_sandwiches);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
        // Inflate the layout for this fragment
        return rootView;
    }

}
