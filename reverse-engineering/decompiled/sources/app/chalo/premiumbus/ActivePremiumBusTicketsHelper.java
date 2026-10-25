package app.chalo.premiumbus;

import app.chalo.constants.Source;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PostBookingHandlerConfig;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionHandler;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.StateFlow;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ActivePremiumBusTicketsHelper;", "Lorg/koin/core/component/KoinComponent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActivePremiumBusTicketsHelper implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6848a = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<PremiumReserveTicketPostBookingActionHandler>() { // from class: app.chalo.premiumbus.ActivePremiumBusTicketsHelper$special$$inlined$inject$default$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object obj = this.f6849a;
            return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(PremiumReserveTicketPostBookingActionHandler.class), null, null);
        }
    });

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final StateFlow a(String bookingId, boolean z, Source source) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(source, "source");
        ?? r0 = this.f6848a;
        ((PremiumReserveTicketPostBookingActionHandler) r0.getValue()).f(bookingId, new PostBookingHandlerConfig(false, false, false), source);
        if (z) {
            ((PremiumReserveTicketPostBookingActionHandler) r0.getValue()).o(source);
        }
        return ((PremiumReserveTicketPostBookingActionHandler) r0.getValue()).getState();
    }
}
