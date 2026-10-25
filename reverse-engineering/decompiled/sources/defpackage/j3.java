package defpackage;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17367a;
    public final /* synthetic */ AnchoredDraggableState b;

    public /* synthetic */ j3(AnchoredDraggableState anchoredDraggableState, int i) {
        this.f17367a = i;
        this.b = anchoredDraggableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17367a) {
            case 0:
                return AnchoredDraggableState.targetValue_delegate$lambda$0(this.b);
            case 1:
                return Float.valueOf(AnchoredDraggableState.progress_delegate$lambda$0(this.b));
            default:
                return Float.valueOf(this.b.getOffset());
        }
    }
}
