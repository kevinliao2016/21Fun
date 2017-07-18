package com.ninjamonster.a24fun.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.ninjamonster.a24fun.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 */
public class GameFragment extends Fragment {
    private static final String LOG_TAG = GameFragment.class.getSimpleName();

    @BindView(R.id.numeric_one)  public Button mNumericOneButton;
    @BindView(R.id.numeric_two)  public Button mNumericTwoButton;
    @BindView(R.id.numeric_three)  public Button mNumericThreeButton;
    @BindView(R.id.numeric_four)  public Button mNumericFourButton;

    @BindView(R.id.plus_button)  public Button mPlusButton;
    @BindView(R.id.minus_button) public Button mMinusButton;
    @BindView(R.id.multiply_button)  public Button mMultiplyButton;
    @BindView(R.id.divide_button)  public Button mDivideButton;

    @BindView(R.id.timer_text_view) public TextView mTimerTextView;



    Button start, pause, reset, lap ;

    long MillisecondTime, StartTime, TimeBuff, UpdateTime = 0L ;

    Handler handler;

    int Seconds, Minutes, MilliSeconds ;


    String[] ListElements = new String[] {  };
    int counter = 0;


    public Runnable runnable = new Runnable() {

        public void run() {

            MillisecondTime = SystemClock.uptimeMillis() - StartTime;

            UpdateTime = TimeBuff + MillisecondTime;

            Seconds = (int) (UpdateTime / 1000);

            Minutes = Seconds / 60;

            Seconds = Seconds % 60;

            MilliSeconds = (int) (UpdateTime % 1000);
            Log.i(LOG_TAG, "Counter: " +  counter++);

            mTimerTextView.setText("" + Minutes + ":"
                    + String.format("%02d", Seconds) + ":"
                    + String.format("%03d", MilliSeconds));

            try{
                Thread.sleep(20000);
            } catch (InterruptedException e ) {
                e.getMessage();
            }

            handler.postDelayed(runnable, 0);
        }

    };

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
        HandlerThread ht = new HandlerThread("Timer Thread");
        ht.start();
        handler = new Handler(ht.getLooper());

        StartTime = SystemClock.uptimeMillis();
        handler.postDelayed(runnable, 0);


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
