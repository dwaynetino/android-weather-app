package com.teamtreehouse.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by kenalger on 2/14/18.
 */

public class AlertDialogFragment extends DialogFragment {
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState) {
    Context context = getActivity();
    AlertDialog.Builder builder = new AlertDialog.Builder(context);

    builder.setTitle(R.string.error_title)
        .setMessage(R.string.error_message)
        .setPositiveButton(R.string.error_button_ok, null);

    return builder.create();
  }
}
