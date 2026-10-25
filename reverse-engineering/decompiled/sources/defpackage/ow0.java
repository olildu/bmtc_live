package defpackage;

import app.chalo.home.ui.home.HomeScreenViewIntent;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ow0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18983a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ PremiumBusBookingCardData c;

    public /* synthetic */ ow0(Function1 function1, PremiumBusBookingCardData premiumBusBookingCardData, int i) {
        this.f18983a = i;
        this.b = function1;
        this.c = premiumBusBookingCardData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18983a) {
            case 0:
                this.b.invoke(new HomeScreenViewIntent.PremiumBusTripInfoClickedIntent(this.c));
                break;
            default:
                this.b.invoke(new HomeScreenViewIntent.PremiumBusTripInfoClickedIntent(this.c));
                break;
        }
        return Unit.f17538a;
    }
}
