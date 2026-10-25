package app.chalo.premiumbus;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import defpackage.vo1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusAnalyticsHelperImpl;", "Lapp/chalo/premiumbus/PremiumBusAnalyticsHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusAnalyticsHelperImpl implements PremiumBusAnalyticsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f6850a;

    public PremiumBusAnalyticsHelperImpl(AnalyticsContract analyticsContract) {
        this.f6850a = analyticsContract;
    }

    @Override // app.chalo.premiumbus.PremiumBusAnalyticsHelper
    public final void a(Map map) {
        AnalyticsContract.DefaultImpls.a(this.f6850a, "pb active booking option item clicked", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), map, null, false, 24);
    }

    @Override // app.chalo.premiumbus.PremiumBusAnalyticsHelper
    public final void b(String str, PremiumReserveTicketStatus ticketStatus, boolean z) {
        Intrinsics.i(ticketStatus, "ticketStatus");
        AnalyticsContract.DefaultImpls.a(this.f6850a, "premium reserve ticket ack cta clicked", Source.HOME_SCREEN_MAIN_FRAGMENT.getSourceName(), MapsKt.i(new Pair("bookingId", str), new Pair("ticketStatus", ticketStatus.name()), new Pair("pbAckCtaType", z ? CLConstants.DROP_LIST_DETAILS_LABEL : "Okay")), null, false, 24);
    }

    @Override // app.chalo.premiumbus.PremiumBusAnalyticsHelper
    public final void c(String str, String str2) {
        AnalyticsContract.DefaultImpls.a(this.f6850a, "pb trip tracking ended for user", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), MapsKt.i(new Pair("bookingId", str), new Pair("tripId", str2)), null, false, 24);
    }

    @Override // app.chalo.premiumbus.PremiumBusAnalyticsHelper
    public final void d(String str, String str2, String str3) {
        AnalyticsContract.DefaultImpls.a(this.f6850a, "pb verify ticket clicked", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), MapsKt.i(new Pair("bookingId", str2), new Pair("tripId", str3), new Pair("status", str)), null, true, 8);
    }

    @Override // app.chalo.premiumbus.PremiumBusAnalyticsHelper
    public final void e(Map map) {
        AnalyticsContract.DefaultImpls.a(this.f6850a, "pb trip cancel conf bottom sheet opened", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), map, null, false, 24);
    }

    @Override // app.chalo.premiumbus.PremiumBusAnalyticsHelper
    public final void f(String str) {
        AnalyticsContract.DefaultImpls.a(this.f6850a, "pb value pass booking cancellation refund blocked", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), vo1.s("passId", str), null, false, 24);
    }

    @Override // app.chalo.premiumbus.PremiumBusAnalyticsHelper
    public final void g(String str, String str2, boolean z) {
        AnalyticsContract.DefaultImpls.a(this.f6850a, "pb trip tracking started for user", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), MapsKt.i(new Pair("bookingId", str), new Pair("tripId", str2), new Pair("isPostBoardingFlow", Boolean.valueOf(z))), null, false, 24);
    }

    @Override // app.chalo.premiumbus.PremiumBusAnalyticsHelper
    public final void h(String str, PremiumReserveTicketStatus premiumReserveTicketStatus) {
        AnalyticsContract.DefaultImpls.a(this.f6850a, "premium reserve ticket ack shown", Source.HOME_SCREEN_MAIN_FRAGMENT.getSourceName(), MapsKt.i(new Pair("bookingId", str), new Pair("ticketStatus", premiumReserveTicketStatus.name())), null, false, 24);
    }

    @Override // app.chalo.premiumbus.PremiumBusAnalyticsHelper
    public final void i(String str) {
        AnalyticsContract.DefaultImpls.a(this.f6850a, "pb active booking options clicked", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), vo1.s("bookingId", String.valueOf(str)), null, false, 24);
    }

    @Override // app.chalo.premiumbus.PremiumBusAnalyticsHelper
    public final void j(String str, String str2, long j, boolean z, long j2, long j3) {
        AnalyticsContract.DefaultImpls.a(this.f6850a, "pb poor network or dead zone detected", Source.PREMIUM_RESERVE_TICKET_ACTIVATION_FRAGMENT.getSourceName(), MapsKt.i(new Pair("bookingId", str), new Pair("tripId", str2), new Pair("isFirstTimeEtaCame", Boolean.valueOf(z)), new Pair("lastPacketReceivedTimeInMillis", Long.valueOf(j)), new Pair("currentPacketReceivedTimeInMillis", Long.valueOf(j2)), new Pair("timeDifferenceBetweenPacketsInMillis", Long.valueOf(j3))), null, false, 24);
    }
}
