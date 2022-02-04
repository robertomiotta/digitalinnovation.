// Generated by view binder compiler. Do not edit!
package br.com.brunoti.kotlintodolist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import br.com.brunoti.kotlintodolist.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySaveTaskBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnCancel;

  @NonNull
  public final MaterialButton btnSaveTask;

  @NonNull
  public final Guideline guideEnd;

  @NonNull
  public final Guideline guideStart;

  @NonNull
  public final MaterialTextView mtvMessage;

  @NonNull
  public final TextInputLayout tilDate;

  @NonNull
  public final TextInputLayout tilHour;

  @NonNull
  public final TextInputLayout tilTitle;

  @NonNull
  public final MaterialToolbar toolbar;

  private ActivitySaveTaskBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnCancel, @NonNull MaterialButton btnSaveTask,
      @NonNull Guideline guideEnd, @NonNull Guideline guideStart,
      @NonNull MaterialTextView mtvMessage, @NonNull TextInputLayout tilDate,
      @NonNull TextInputLayout tilHour, @NonNull TextInputLayout tilTitle,
      @NonNull MaterialToolbar toolbar) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.btnSaveTask = btnSaveTask;
    this.guideEnd = guideEnd;
    this.guideStart = guideStart;
    this.mtvMessage = mtvMessage;
    this.tilDate = tilDate;
    this.tilHour = tilHour;
    this.tilTitle = tilTitle;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySaveTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySaveTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_save_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySaveTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_cancel;
      MaterialButton btnCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btn_save_task;
      MaterialButton btnSaveTask = ViewBindings.findChildViewById(rootView, id);
      if (btnSaveTask == null) {
        break missingId;
      }

      id = R.id.guide_end;
      Guideline guideEnd = ViewBindings.findChildViewById(rootView, id);
      if (guideEnd == null) {
        break missingId;
      }

      id = R.id.guide_start;
      Guideline guideStart = ViewBindings.findChildViewById(rootView, id);
      if (guideStart == null) {
        break missingId;
      }

      id = R.id.mtv_message;
      MaterialTextView mtvMessage = ViewBindings.findChildViewById(rootView, id);
      if (mtvMessage == null) {
        break missingId;
      }

      id = R.id.til_date;
      TextInputLayout tilDate = ViewBindings.findChildViewById(rootView, id);
      if (tilDate == null) {
        break missingId;
      }

      id = R.id.til_hour;
      TextInputLayout tilHour = ViewBindings.findChildViewById(rootView, id);
      if (tilHour == null) {
        break missingId;
      }

      id = R.id.til_title;
      TextInputLayout tilTitle = ViewBindings.findChildViewById(rootView, id);
      if (tilTitle == null) {
        break missingId;
      }

      id = R.id.toolbar;
      MaterialToolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivitySaveTaskBinding((ConstraintLayout) rootView, btnCancel, btnSaveTask,
          guideEnd, guideStart, mtvMessage, tilDate, tilHour, tilTitle, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
