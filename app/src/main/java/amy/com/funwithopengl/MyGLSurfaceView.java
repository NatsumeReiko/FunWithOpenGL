package amy.com.funwithopengl;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyGLSurfaceView extends GLSurfaceView {
    private final MyGLRenderer myRenderer;

    public MyGLSurfaceView(Context context) {
        super(context);

        setEGLContextClientVersion(2);

        myRenderer = new MyGLRenderer();

        setRenderer(myRenderer);
    }
}
