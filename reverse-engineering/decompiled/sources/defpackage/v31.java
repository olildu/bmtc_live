package defpackage;

import androidx.compose.runtime.MutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v31 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19799a;
    public final /* synthetic */ MutableIntState b;

    public /* synthetic */ v31(MutableIntState mutableIntState, int i) {
        this.f19799a = i;
        this.b = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19799a) {
            case 0:
                MutableIntState mutableIntState = this.b;
                return Integer.valueOf(mutableIntState.getIntValue() > 0 ? mutableIntState.getIntValue() + 1 : mutableIntState.getIntValue());
            default:
                this.b.setIntValue(0);
                return Unit.f17538a;
        }
    }
}
