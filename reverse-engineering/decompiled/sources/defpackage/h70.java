package defpackage;

import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.ui.history.factory.CtaClickedType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h70 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15798a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ ChaloUserBookingType.TicketBooking.PremiumBusBooking c;

    public /* synthetic */ h70(Function2 function2, ChaloUserBookingType.TicketBooking.PremiumBusBooking premiumBusBooking, int i) {
        this.f15798a = i;
        this.b = function2;
        this.c = premiumBusBooking;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CtaClickedType it = (CtaClickedType) obj;
        switch (this.f15798a) {
            case 0:
                Intrinsics.i(it, "it");
                this.b.invoke(this.c, it);
                break;
            default:
                Intrinsics.i(it, "it");
                this.b.invoke(this.c, it);
                break;
        }
        return Unit.f17538a;
    }
}
