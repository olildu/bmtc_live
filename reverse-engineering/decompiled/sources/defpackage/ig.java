package defpackage;

import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import com.arkivanov.essenty.lifecycle.Lifecycle;
import com.arkivanov.essenty.lifecycle.coroutines.FlowWithLifecycleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ig implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15909a;
    public final /* synthetic */ ChaloBaseStateMviComponent b;

    public /* synthetic */ ig(ChaloBaseStateMviComponent chaloBaseStateMviComponent, int i) {
        this.f15909a = i;
        this.b = chaloBaseStateMviComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15909a) {
            case 0:
                ChaloBaseStateMviComponent chaloBaseStateMviComponent = this.b;
                return FlowWithLifecycleKt.a((FusibleFlow) FlowKt.D(chaloBaseStateMviComponent.h), chaloBaseStateMviComponent.f5983a.getF12286a(), Lifecycle.State.STARTED);
            case 1:
                this.b.y0();
                return Unit.f17538a;
            case 2:
                this.b.B0();
                return Unit.f17538a;
            case 3:
                this.b.A0();
                return Unit.f17538a;
            case 4:
                this.b.z0();
                return Unit.f17538a;
            default:
                this.b.x0();
                return Unit.f17538a;
        }
    }
}
