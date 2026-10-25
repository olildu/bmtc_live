package defpackage;

import app.chalo.premiumbus.data.models.app.EligibleStopAppModel;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rt0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19243a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ EligibleStopAppModel c;

    public /* synthetic */ rt0(Function1 function1, EligibleStopAppModel eligibleStopAppModel, int i) {
        this.f19243a = i;
        this.b = function1;
        this.c = eligibleStopAppModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19243a) {
            case 0:
                this.b.invoke(new PremiumBusChangeStopIntent.StopSelectedIntent(this.c.f7080a));
                return Unit.f17538a;
            case 1:
                this.b.invoke(new PremiumBusChangeStopIntent.StopSelectedIntent(this.c.f7080a));
                return Boolean.TRUE;
            default:
                this.b.invoke(new PremiumBusChangeStopIntent.DirectionsClickedIntent(this.c.f7080a));
                return Unit.f17538a;
        }
    }
}
