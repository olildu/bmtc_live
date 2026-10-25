package defpackage;

import androidx.compose.foundation.draganddrop.DragAndDropStartDetectorScope;
import androidx.compose.ui.geometry.Offset;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class yy {
    public static /* synthetic */ void a(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestDragAndDropTransfer-k-4lQ0M");
        }
        if ((i & 1) != 0) {
            j = Offset.INSTANCE.m4380getUnspecifiedF1C5BW0();
        }
        dragAndDropStartDetectorScope.mo396requestDragAndDropTransferk4lQ0M(j);
    }
}
