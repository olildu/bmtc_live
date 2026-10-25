package defpackage;

import androidx.compose.foundation.AbstractClickableNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15503a;
    public final /* synthetic */ AbstractClickableNode b;

    public /* synthetic */ e(AbstractClickableNode abstractClickableNode, int i) {
        this.f15503a = i;
        this.b = abstractClickableNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15503a) {
            case 0:
                return AbstractClickableNode.onObservedReadsChanged$lambda$0(this.b);
            default:
                return Boolean.valueOf(AbstractClickableNode.applySemantics$lambda$0(this.b));
        }
    }
}
