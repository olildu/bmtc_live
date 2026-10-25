package defpackage;

import androidx.compose.foundation.gestures.TransformScope;
import androidx.compose.ui.geometry.Offset;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class tk1 {
    public static /* synthetic */ void a(TransformScope transformScope, float f, long j, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            j = Offset.INSTANCE.m4381getZeroF1C5BW0();
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        transformScope.mo444transformByd4ec7I(f, j, f2);
    }
}
