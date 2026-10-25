package defpackage;

import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsComponent;
import app.chalo.premiumbus.ui.stopdetails.PremiumBusStopDetailsIntent;
import app.chalo.scenes.ChaloNavigationManagerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uo0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19765a;
    public final /* synthetic */ PBStopDetailsComponent b;

    public /* synthetic */ uo0(PBStopDetailsComponent pBStopDetailsComponent, int i) {
        this.f19765a = i;
        this.b = pBStopDetailsComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19765a) {
            case 0:
                ChaloNavigationManagerKt.c(this.b.p);
                break;
            case 1:
                ChaloNavigationManagerKt.c(this.b.p);
                break;
            default:
                this.b.G0(PremiumBusStopDetailsIntent.OnBackPressed.f7944a);
                break;
        }
        return Unit.f17538a;
    }
}
