package cafe.despiwich.com.despiwich;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

public class CategoryAdapter extends FragmentStatePagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SandwichFragment();
        } else if (position == 1) {
            return new BurgerFragment();
        } else if (position == 2) {
            return new KrusherFragment();
        } else if (position == 3){
            return new SnacksFragment();
        } else{
            return new AddonFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public int getItemPosition(Object object) {

        return super.getItemPosition(object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_sandwiches);
        } else if (position == 1) {
            return mContext.getString(R.string.category_burgers);
        } else if (position == 2) {
            return mContext.getString(R.string.category_krushers);
        } else if (position == 3){
            return mContext.getString(R.string.category_snacks);
        } else {
            return mContext.getString(R.string.category_addon);
        }
    }
}