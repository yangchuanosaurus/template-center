package template.android.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import template.android.Hello;

public class MainActivity extends AppCompatActivity {

    /**
     * This is a simple template usage of using Hello of template.android.hello
     *
     * In current phase, please make sure
     *  - The whole project has clone-ed into the template-center
     *  - The template registered into template center
     *  */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String hello = Hello.getHello();
        TextView tvMessage = findViewById(R.id.tv_message);
        tvMessage.setText(hello);
    }
}
