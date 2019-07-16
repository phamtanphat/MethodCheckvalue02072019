package khoapham.ptp.phamtanphat.methodcheckvalue02072019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int number1 = 10;
//        Log.b => truy cập vao gia trị b của đối tượng Log
//        Log.d() => truy cập vào chức năng của đối tượng Log
        //ctrl + P : Phím gợi ý tham số truyền vào
        //alt + enter : phim gợi ý sửa lỗi

        //Phương thức chuyển đổi kiểu dữ liệu
        //int -> String : String.valueof()
        //String -> int : Integer.parseint()

        //wrap_boxing , auto_boxing
        String output = String.valueOf(number1);
        int valueconvert = Integer.parseInt(output);
        Log.d("AAA",output);
    }

}
