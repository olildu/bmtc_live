package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class mw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18433a;
    public final /* synthetic */ View b;

    public /* synthetic */ mw(View view, int i) {
        this.f18433a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18433a) {
            case 0:
                View view = this.b;
                view.requestFocus();
                view.post(new mw(view, 1));
                break;
            default:
                View view2 = this.b;
                ((InputMethodManager) ContextCompat.getSystemService(view2.getContext(), InputMethodManager.class)).showSoftInput(view2, 1);
                break;
        }
    }
}
