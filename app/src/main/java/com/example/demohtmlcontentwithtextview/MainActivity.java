package com.example.demohtmlcontentwithtextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    String myText = "<h1> This is heading 1 </h1>\n" +
            "<h2> This is heading 2 </h2>\n" +
            "<p> This is an paragraph </p>\n" +
            "<p><u> This is a underline text </u></p>\n" +
            "<p><b> This is a bold text </b></p>\n" +
            "<p><i> This is a italic text </i></p>\n" +
            "Programming language order list\n" +
            "<ol>\n" +
            "<li> C </li>\n" +
            "<li> C++ </li>\n" +
            "<li> JAVA </li>\n" +
            "</ol>\n\n" +
            "(a+b)<sup>2</sup> = a<sup>2</sup>+2ab+b<sup>2</sup>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tvId);
        textView.setText(Html.fromHtml(myText));
    }
}
