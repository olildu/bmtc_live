package defpackage;

import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dg0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15459a;
    public final /* synthetic */ TextDragObserver b;

    public /* synthetic */ dg0(TextDragObserver textDragObserver, int i) {
        this.f15459a = i;
        this.b = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15459a) {
            case 0:
                return LongPressTextDragObserverKt.detectDragGesturesWithObserver$lambda$0(this.b, (Offset) obj);
            case 1:
                return SelectionGesturesKt.touchSelectionFirstPress$lambda$0(this.b, (PointerInputChange) obj);
            default:
                return SelectionGesturesKt.touchSelectionSubsequentPress$lambda$0(this.b, (PointerInputChange) obj);
        }
    }
}
