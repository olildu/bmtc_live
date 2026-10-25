package defpackage;

import app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent;
import app.chalo.routeselection.ui.StopBasedRouteSearchIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cb1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11270a;
    public final /* synthetic */ StopBasedRouteSearchForProductPurchaseComponent b;

    public /* synthetic */ cb1(StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent, int i) {
        this.f11270a = i;
        this.b = stopBasedRouteSearchForProductPurchaseComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11270a) {
            case 0:
                String it = (String) obj;
                Intrinsics.i(it, "it");
                this.b.Q0(new StopBasedRouteSearchIntent.RouteSearchQueryChangeIntent(it));
                break;
            default:
                StopBasedRouteSearchIntent it2 = (StopBasedRouteSearchIntent) obj;
                Intrinsics.i(it2, "it");
                this.b.Q0(it2);
                break;
        }
        return Unit.f17538a;
    }
}
