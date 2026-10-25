package defpackage;

import app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent;
import app.chalo.routeselection.ui.StopBasedRouteSearchIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class db1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15445a;
    public final /* synthetic */ StopBasedRouteSearchForProductPurchaseComponent b;

    public /* synthetic */ db1(StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent, int i) {
        this.f15445a = i;
        this.b = stopBasedRouteSearchForProductPurchaseComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15445a) {
            case 0:
                this.b.Q0(StopBasedRouteSearchIntent.ClearRouteSearchQueryIntent.f9193a);
                break;
            default:
                this.b.Q0(StopBasedRouteSearchIntent.BackPressedIntent.f9192a);
                break;
        }
        return Unit.f17538a;
    }
}
