package defpackage;

import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n61 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18457a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ n61(MutableState mutableState, int i) {
        this.f18457a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18457a) {
            case 0:
                MutableState mutableState = this.b;
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.f17538a;
            case 1:
                MutableState mutableState2 = this.b;
                mutableState2.setValue(Boolean.valueOf(!((Boolean) mutableState2.getValue()).booleanValue()));
                return Unit.f17538a;
            case 2:
                MutableState mutableState3 = this.b;
                mutableState3.setValue(Boolean.valueOf(!((Boolean) mutableState3.getValue()).booleanValue()));
                return Unit.f17538a;
            case 3:
                return TooltipKt.TooltipBox$lambda$4$lambda$3(this.b);
            default:
                return Boolean.valueOf(WideNavigationRailKt.Scrim_3J_VO9M$lambda$33$lambda$32$lambda$31(this.b));
        }
    }
}
