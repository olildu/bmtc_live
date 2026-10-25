package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MovableContentKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uj0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19752a;
    public final /* synthetic */ Function6 b;

    public /* synthetic */ uj0(Function6 function6, int i) {
        this.f19752a = i;
        this.b = function6;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19752a;
        Object[] objArr = (Object[]) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return MovableContentKt.movableContentWithReceiverOf$lambda$6(this.b, objArr, composer, iIntValue);
            default:
                return MovableContentKt.movableContentOf$lambda$6(this.b, objArr, composer, iIntValue);
        }
    }
}
