package come.ninjamonster.a21fun.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import come.ninjamonster.a21fun.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 */
public class GameFragment extends Fragment {

    @BindView(R.id.numeric_one)  public Button mNumericOneButton;
    @BindView(R.id.numeric_two)  public Button mNumericTwoButton;
    @BindView(R.id.numeric_three)  public Button mNumericThreeButton;
    @BindView(R.id.numeric_four)  public Button mNumericFourButton;

    @BindView(R.id.plus_button)  public Button mPlusButton;
    @BindView(R.id.minus_button) public Button mMinusButton;
    @BindView(R.id.multiply_button)  public Button mMultiplyButton;
    @BindView(R.id.divide_button)  public Button mDivideButton;
    public GameFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_game, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }

    public void onButtonPressed(Uri uri) {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
