package defpackage;

import androidx.compose.foundation.layout.ContextualFlowLayoutKt;
import androidx.compose.foundation.layout.FlowLineInfo;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lt implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18345a;
    public final /* synthetic */ Function4 b;

    public /* synthetic */ lt(Function4 function4, int i) {
        this.f18345a = i;
        this.b = function4;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f18345a;
        int iIntValue = ((Integer) obj).intValue();
        FlowLineInfo flowLineInfo = (FlowLineInfo) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Integer) obj4).intValue();
        switch (i) {
            case 0:
                return ContextualFlowLayoutKt.ContextualFlowRow$lambda$2(this.b, iIntValue, flowLineInfo, composer, iIntValue2);
            default:
                return ContextualFlowLayoutKt.ContextualFlowColumn$lambda$2(this.b, iIntValue, flowLineInfo, composer, iIntValue2);
        }
    }
}
