package com.bawp.babyneeds;


import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;




public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



       // databaseHandler = new DatabaseHandler(this);

       // byPassActivity();

        //check if item was saved
        //List<Item> items = databaseHandler.getAllItems();
      //  for (Item item : items) {
          //  Log.d("Main", "onCreate: " + item.getItemColor());
        //}





      //  FloatingActionButton fab = findViewById(R.id.fab);
      //  fab.setOnClickListener(new View.OnClickListener() {
          //  @Override
           // public void onClick(View view) {

                ///createPopupDialog();
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            //}
      //  });
   // }

   ///atabaseHandler.addItem(item);

      //  Snackbar.make(view, "Item Saved",Snackbar.LENGTH_SHORT)
         //       .show();


        //new Handler().postDelayed(new Runnable() {
        //    @Override
           // public void run() {
                //code to be run
            //    dialog.dismiss();
                //Todo: move to next screen - details screen
              //  startActivity(new Intent(MainActivity.this, ListActivity.class));

           // }
        //}, 1200);// 1sec
  //  }

    //private void createPopupDialog() {

     //   builder = new AlertDialog.Builder(this);
       // View view = getLayoutInflater().inflate(R.layout.popup, null);

      //  babyItem = view.findViewById(R.id.babyItem);
       // itemQuantity = view.findViewById(R.id.itemQuantity);
        //itemColor = view.findViewById(R.id.itemColor);
        //itemSize = view.findViewById(R.id.itemSize);
       // saveButton = view.findViewById(R.id.saveButton);
       // saveButton.setOnClickListener(new View.OnClickListener() {
          //  @Override
          //  public void onClick(View v) {

              //  if (!babyItem.getText().toString().isEmpty()
                     //   && !itemColor.getText().toString().isEmpty()
                      //  && !itemQuantity.getText().toString().isEmpty()
                     //   && !itemSize.getText().toString().isEmpty()) {
                   // saveItem(v);
                //}else {
                    //Snackbar.make(v, "Empty Fields not Allowed", Snackbar.LENGTH_SHORT)
                         //   .show();
              //  }

            //}
      //  });

       // builder.setView(view);
      //  dialog = builder.create();// creating our dialog object
      //  dialog.show();// important step!



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
