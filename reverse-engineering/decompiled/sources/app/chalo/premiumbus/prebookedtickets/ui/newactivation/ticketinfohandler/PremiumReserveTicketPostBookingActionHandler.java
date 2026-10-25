package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.constants.Source;
import app.chalo.data.PremiumBusProductOptionsAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumReserveTicketPostBookingActionHandler;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PremiumReserveTicketPostBookingActionHandler {
    void a();

    Flow b();

    void c(PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModel, int i);

    void d(PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModel, int i);

    void e();

    void f(String str, PostBookingHandlerConfig postBookingHandlerConfig, Source source);

    Object g(String str, ContinuationImpl continuationImpl);

    StateFlow getState();

    void h(MapCameraUpdate mapCameraUpdate);

    void i(boolean z);

    void j();

    void k();

    Object l(ContinuationImpl continuationImpl);

    void m();

    void n();

    void o(Source source);

    Object p(ContinuationImpl continuationImpl);

    Object q(PremiumBusProductOptionsAppModel premiumBusProductOptionsAppModel, boolean z, List list, ContinuationImpl continuationImpl);

    void r();

    PremiumBusProductOptionsAppModel s();

    void t(List list);

    void u();

    void v();

    void w(String str, boolean z);
}
