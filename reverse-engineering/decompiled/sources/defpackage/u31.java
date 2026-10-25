package defpackage;

import androidx.compose.runtime.MutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u31 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19713a;
    public final /* synthetic */ MutableIntState b;

    public /* synthetic */ u31(MutableIntState mutableIntState, int i) {
        this.f19713a = i;
        this.b = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19713a;
        ((Integer) obj).intValue();
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                this.b.setIntValue(iIntValue);
                break;
            default:
                if (iIntValue < 0) {
                    iIntValue = 0;
                }
                this.b.setIntValue(iIntValue);
                break;
        }
        return Unit.f17538a;
    }
}
