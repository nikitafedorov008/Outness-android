package ir.technopedia.wordpressjsonclient.util;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

public class Font {

    public void setFont(Context _context, TextView textView) {
        Typeface googleSans = Typeface.createFromAsset(_context.getAssets(), "font/GoogleSans-Regular.ttf");
        textView.setTypeface(googleSans);
    }

    public void setFontLogo(Context _context, TextView textView) {
        Typeface lobsterTwo = Typeface.createFromAsset(_context.getAssets(), "font/LobsterTwo-BoldItalic.ttf");
        textView.setTypeface(lobsterTwo);
    }
}
