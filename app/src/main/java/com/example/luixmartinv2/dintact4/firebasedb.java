package com.example.luixmartinv2.dintact4;

import android.util.Log;

import static android.content.ContentValues.TAG;

/**
 * Created by luixmartinv2 on 22/2/18.
 */

public class firebasedb {



   // private DatabaseReference mDatabase;

    // conexion



    //conexion


/**    public void DownloadImg (){


        mDatabase = FirebaseDatabase.getInstance().getReference();

        ValueEventListener postListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get Post object and use the values to update the UI
                img img1 = dataSnapshot.getValue(img.class);
                // ...
                pintarimg; //metodo de pintar
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w(TAG, "loadPost:onCancelled", databaseError.toException());
                // ...
            }
        };
        mPostReference.addValueEventListener(postListener);

 } */
}
