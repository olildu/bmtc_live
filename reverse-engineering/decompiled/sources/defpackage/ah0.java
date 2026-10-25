package defpackage;

import androidx.compose.foundation.MagnifierNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ah0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288a;
    public final /* synthetic */ MagnifierNode b;

    public /* synthetic */ ah0(MagnifierNode magnifierNode, int i) {
        this.f288a = i;
        this.b = magnifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f288a) {
            case 0:
                return MagnifierNode.onObservedReadsChanged$lambda$0(this.b);
            case 1:
                return MagnifierNode.applySemantics$lambda$0(this.b);
            default:
                return MagnifierNode.getAnchorPositionInRoot_F1C5BW0$lambda$0(this.b);
        }
    }
}
