package code.com.firstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    /**
     * OnCreate function is where the initialization takes place
     * in the android app.
     * Here you can set the view, attach listeners etc...
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
         * This gives the activity a view
         */
        setContentView(R.layout.activity_main);
        /**
         * findViewById
         * Binds The TextView To An Object
         */
        final TextView textView = (TextView) findViewById(R.id.textview);
        final TextView titleView = (TextView) findViewById(R.id.titleView);
        /**
         * Changes the text of the binded textview
         */
        textView.setText("First Application");

        /**
         * setOnClickListener allows you to attach a click listener to the button
         * @see android.view.View.OnClickListener
         * View.OnClickListener is a interface
         */
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("We Have A Nice Campus");
                titleView.setText("Welcome to BCC");
            }
        });
        /**
         * setOnLongClickListener allows you to attach a long click listenr to the button
         * It will launch awhen the action has been held
         * @see android.view.View.OnLongClickListener
         * View.OnLongClickListener is a interface
         */
        findViewById(R.id.button).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textView.setText("What Event Do You Want To Take Place");
                titleView.setText("Club Hours 12 - 2");
                return true;
            }
        });
    }
}
