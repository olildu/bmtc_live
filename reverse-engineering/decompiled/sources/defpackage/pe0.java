package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContentKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pe0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19028a;
    public final /* synthetic */ Function4 b;

    public /* synthetic */ pe0(Function4 function4, int i) {
        this.f19028a = i;
        this.b = function4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f19028a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return LazyListScope.CC.u(this.b, (LazyItemScope) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return MovableContentKt.movableContentOf$lambda$2(this.b, (Pair) obj, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return MovableContentKt.movableContentWithReceiverOf$lambda$2(this.b, (Pair) obj, (Composer) obj2, iIntValue3);
        }
    }
}
