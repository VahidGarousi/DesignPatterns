package ir.vg.app.designpattern;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ir.vg.app.designpattern.creational.factory.reserve_sample.Reserve;
import ir.vg.app.designpattern.creational.factory.reserve_sample.ReserveFactory;
import ir.vg.app.designpattern.creational.factory.reserve_sample.types.ReserveType;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Reserve reserve = ReserveFactory.create(ReserveType.PLACE);

    }
}