package khoapham.ptp.phamtanphat.methodcheckvalue02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Biến toàn cục;
    String b ="Hello";
    //Tạo biến ở đâu những thằng cùng cấp hoặc bé hơn
    // thì thấy được nhau ngược lại

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bien cục bộ
        String a = "Hello";

    }
    public void Show(){
       b =" 10";
    }
}
