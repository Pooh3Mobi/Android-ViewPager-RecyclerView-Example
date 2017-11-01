package mobi.pooh3.viewpagerlistexample;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mobi.pooh3.viewpagerlistexample.dummy.DummyContent;


public class ItemFragment extends Fragment {


  public ItemFragment() {
  }

  public static ItemFragment newInstance() {
    return new ItemFragment();
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_item_list, container, false);

    // Set the adapter
    if (view instanceof RecyclerView) {
      Context context = view.getContext();
      RecyclerView recyclerView = (RecyclerView) view;
      recyclerView.setLayoutManager(new LinearLayoutManager(context));
      recyclerView.setAdapter(new MyItemRecyclerViewAdapter(DummyContent.ITEMS));
    }
    return view;
  }

  @Override
  public void onDetach() {
    super.onDetach();
  }
}
