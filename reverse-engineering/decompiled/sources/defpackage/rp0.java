package defpackage;

import app.chalo.data.BookingsRequestType;
import app.chalo.productsummary.ui.pass.PassSummaryDataState;
import app.chalo.productsummary.ui.ticket.TicketSummaryDataState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rp0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19232a;
    public final /* synthetic */ BookingsRequestType b;

    public /* synthetic */ rp0(BookingsRequestType bookingsRequestType, int i) {
        this.f19232a = i;
        this.b = bookingsRequestType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19232a) {
            case 0:
                return PassSummaryDataState.a((PassSummaryDataState) obj, true, false, this.b, null, null, null, null, 246);
            default:
                return TicketSummaryDataState.a((TicketSummaryDataState) obj, null, true, false, false, this.b, null, null, null, null, null, null, false, null, null, null, 32741);
        }
    }
}
