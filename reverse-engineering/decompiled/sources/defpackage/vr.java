package defpackage;

import android.os.CancellationSignal;
import androidx.compose.foundation.text.input.internal.HandwritingGestureApi34;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vr implements CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19860a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vr(Object obj, int i) {
        this.f19860a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f19860a) {
            case 0:
                ((Job) this.b).cancel(null);
                break;
            case 1:
                HandwritingGestureApi34.previewHandwritingGesture$lambda$0((TransformedTextFieldState) this.b);
                break;
            default:
                HandwritingGestureApi34.previewHandwritingGesture$lambda$1((TextFieldSelectionManager) this.b);
                break;
        }
    }
}
