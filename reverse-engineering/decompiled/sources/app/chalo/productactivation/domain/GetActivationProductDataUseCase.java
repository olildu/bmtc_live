package app.chalo.productactivation.domain;

import app.chalo.home.data.repository.TicketRepository;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.domains.CheckIfContinueWithBulkBookingFlowUseCase;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/domain/GetActivationProductDataUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetActivationProductDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassRepository f8002a;
    public final QuickPayRepository b;
    public final InstantTicketRepository c;
    public final TicketRepository d;
    public final OndcRepository e;
    public final MetroRepository f;
    public final PremiumBusRepository g;
    public final MultiModalGroupTicketRepository h;
    public final CheckIfContinueWithBulkBookingFlowUseCase i;

    public GetActivationProductDataUseCase(SuperPassRepository superPassRepository, QuickPayRepository quickPayRepository, InstantTicketRepository instantTicketRepository, TicketRepository ticketRepository, OndcRepository ondcRepository, MetroRepository metroRepository, PremiumBusRepository premiumBusRepository, MultiModalGroupTicketRepository multiModalGroupTicketRepository, CheckIfContinueWithBulkBookingFlowUseCase checkIfContinueWithBulkBookingFlowUseCase) {
        this.f8002a = superPassRepository;
        this.b = quickPayRepository;
        this.c = instantTicketRepository;
        this.d = ticketRepository;
        this.e = ondcRepository;
        this.f = metroRepository;
        this.g = premiumBusRepository;
        this.h = multiModalGroupTicketRepository;
        this.i = checkIfContinueWithBulkBookingFlowUseCase;
    }
}
