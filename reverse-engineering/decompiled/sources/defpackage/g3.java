package defpackage;

import androidx.compose.foundation.gestures.AnchoredDragScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class g3 {
    public static /* synthetic */ void a(AnchoredDragScope anchoredDragScope, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        anchoredDragScope.dragTo(f, f2);
    }
}
