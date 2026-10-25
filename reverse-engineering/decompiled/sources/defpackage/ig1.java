package defpackage;

import app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent;
import com.arkivanov.essenty.lifecycle.Lifecycle;
import com.arkivanov.essenty.lifecycle.coroutines.FlowWithLifecycleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ig1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15911a;
    public final /* synthetic */ SuperPassScreenBaseComponent b;

    public /* synthetic */ ig1(SuperPassScreenBaseComponent superPassScreenBaseComponent, int i) {
        this.f15911a = i;
        this.b = superPassScreenBaseComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15911a) {
            case 0:
                SuperPassScreenBaseComponent superPassScreenBaseComponent = this.b;
                return FlowWithLifecycleKt.a(superPassScreenBaseComponent.h, superPassScreenBaseComponent.f8402a.getF12286a(), Lifecycle.State.STARTED);
            case 1:
                this.b.getClass();
                return Unit.f17538a;
            case 2:
                this.b.getClass();
                return Unit.f17538a;
            default:
                this.b.getClass();
                return Unit.f17538a;
        }
    }
}
