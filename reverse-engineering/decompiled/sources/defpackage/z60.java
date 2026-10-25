package defpackage;

import app.chalo.multimodalticket.data.model.app.GroupTicketLegFareDetailAppModel;
import app.chalo.multimodalticket.groupticketsummary.ui.GroupTicketSummaryViewIntent;
import app.chalo.productsummary.ui.ticket.TicketSummaryIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20169a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ GroupTicketLegFareDetailAppModel c;

    public /* synthetic */ z60(Function1 function1, GroupTicketLegFareDetailAppModel groupTicketLegFareDetailAppModel, int i) {
        this.f20169a = i;
        this.b = function1;
        this.c = groupTicketLegFareDetailAppModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20169a) {
            case 0:
                this.b.invoke(new GroupTicketSummaryViewIntent.OnLegFareRowClicked(this.c.f5860a));
                break;
            default:
                this.b.invoke(new TicketSummaryIntent.OnMultiModalFareLegClicked(this.c.f5860a));
                break;
        }
        return Unit.f17538a;
    }
}
