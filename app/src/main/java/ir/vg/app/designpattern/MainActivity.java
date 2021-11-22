package ir.vg.app.designpattern;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.dialog.Dialog;
import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.dialog.DialogFactory;
import ir.vg.app.designpattern.creational.factory_pattern.dialog_sample.dialog.types.DialogType;
import ir.vg.app.designpattern.creational.factory_pattern.message_sample.Message;
import ir.vg.app.designpattern.creational.factory_pattern.message_sample.MessageFactory;
import ir.vg.app.designpattern.creational.factory_pattern.message_sample.MessageType;
import ir.vg.app.designpattern.creational.factory_pattern.reserve_sample.Reserve;
import ir.vg.app.designpattern.creational.factory_pattern.reserve_sample.ReserveFactory;
import ir.vg.app.designpattern.creational.factory_pattern.reserve_sample.types.ReserveType;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Reserve reserve = ReserveFactory.create(ReserveType.PLACE);
        Message message = MessageFactory.create(MessageType.TEXT);
        Dialog dialog = DialogFactory.create(DialogType.NORMAL);
    }
}