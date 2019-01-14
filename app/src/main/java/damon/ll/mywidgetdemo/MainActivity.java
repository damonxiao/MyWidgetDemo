package damon.ll.mywidgetdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;

import damon.ll.widgetlibs.progress.CircleProgressView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testCircleProgressView();
        CircleProgressView circleProgressView = findViewById(R.id.circle_progress_in_xml);
        circleProgressView.showProgress(null);
    }

    private void testCircleProgressView() {
        CircleProgressView circleProgressView = new CircleProgressView.Builder(this)
                .setProgress(10 * 1000, 10)
                .setProgressBackgroundResource(R.drawable.circle_progress_view_bg)
                .setProgressImageResource(R.drawable.circle_progress_view_progress)
                .create();
        ViewGroup viewGroup = findViewById(R.id.view_container);
        viewGroup.addView(circleProgressView);

        circleProgressView.showProgress(null);
    }
}
