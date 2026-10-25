package defpackage;

import app.chalo.productbooking.pickroutelocation.PickRouteLocationComponent;
import app.chalo.productbooking.pickroutelocation.PickRouteLocationIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19955a;
    public final /* synthetic */ PickRouteLocationComponent b;

    public /* synthetic */ wr0(PickRouteLocationComponent pickRouteLocationComponent, int i) {
        this.f19955a = i;
        this.b = pickRouteLocationComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19955a) {
            case 0:
                this.b.E0(new ir0(17));
                break;
            case 1:
                this.b.P0(PickRouteLocationIntent.BackButtonPressIntent.f8280a);
                break;
            case 2:
                this.b.P0(PickRouteLocationIntent.ClearSearchTextFieldIntent.f8281a);
                break;
            default:
                this.b.E0(new ir0(15));
                break;
        }
        return Unit.f17538a;
    }
}
