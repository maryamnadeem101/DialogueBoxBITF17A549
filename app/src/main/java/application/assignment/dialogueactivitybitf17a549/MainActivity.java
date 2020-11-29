package application.assignment.dialogueactivitybitf17a549;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button showDialogButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showDialogButton= findViewById(R.id.buttonDialog);
    }

    public void showDialog(View view) {

        //create onj, set title then buttons
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        builder.setMessage("Would you like to exit?");

        builder.setTitle("Exit Alert");
        builder.setCancelable(false);
        builder.setPositiveButton(
                "Exit",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int hey)
                    {
                        // When the user click yes button then app will close
                        finish();
                    }
                });

        builder.setNegativeButton(
                //Yes
                "Don't Exit",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        //No
                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}