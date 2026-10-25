package defpackage;

import app.chalo.home.ui.history.MyTicketsComponent;
import app.chalo.home.ui.history.MyTicketsDataState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19218a;
    public final /* synthetic */ MyTicketsComponent b;

    public /* synthetic */ rk0(MyTicketsComponent myTicketsComponent, int i) {
        this.f19218a = i;
        this.b = myTicketsComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19218a) {
            case 0:
                MyTicketsDataState it = (MyTicketsDataState) obj;
                Intrinsics.i(it, "it");
                Boolean bool = (Boolean) this.b.t.getG().getValue();
                bool.getClass();
                return MyTicketsDataState.a(it, null, null, null, false, false, null, null, null, null, true, null, false, null, false, false, bool, false, null, null, null, false, 33093631);
            case 1:
                this.b.b0 = null;
                return Unit.f17538a;
            case 2:
                this.b.c0 = null;
                return Unit.f17538a;
            default:
                MyTicketsDataState it2 = (MyTicketsDataState) obj;
                Intrinsics.i(it2, "it");
                return MyTicketsDataState.a(it2, null, null, null, false, false, null, null, null, null, false, null, false, null, false, true, (Boolean) this.b.t.getG().getValue(), false, null, null, null, false, 33357823);
        }
    }
}
