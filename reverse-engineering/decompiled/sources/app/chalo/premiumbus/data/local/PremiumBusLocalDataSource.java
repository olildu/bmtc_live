package app.chalo.premiumbus.data.local;

import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketReceiptEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/local/PremiumBusLocalDataSource;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PremiumBusLocalDataSource {
    Flow a(long j, String str, String str2);

    Object b(String str, List list, boolean z, Continuation continuation);

    Flow c(String str);

    Object d(String str, ArrayList arrayList, Continuation continuation);

    Object e(Continuation continuation);

    Object f(String str, String str2, PremiumReserveTicketAckType premiumReserveTicketAckType, Continuation continuation);

    Object g(String str, PremiumReserveTicketStatus premiumReserveTicketStatus, ContinuationImpl continuationImpl);

    Object h(String str, PremiumBusTripStatus premiumBusTripStatus, Continuation continuation);

    Flow i(String str);

    Object j(String str, Continuation continuation);

    Flow k(String str, String str2, String str3);

    Object l(List list, Continuation continuation);

    Object m(PremiumReserveTicketEntity premiumReserveTicketEntity, Continuation continuation);

    Object n(String str, Continuation continuation);

    Flow o(String str, String str2);

    Object p(Continuation continuation);

    Object q(String str, Continuation continuation);

    Object r(String str, String str2, long j, long j2, Continuation continuation);

    Flow s(long j, long j2, String str, String str2);

    Object t(PremiumReserveTicketReceiptEntity premiumReserveTicketReceiptEntity, Continuation continuation);

    Flow u(String str);

    Object v(ArrayList arrayList, Continuation continuation);

    Object w(Continuation continuation);

    Flow x(String str);

    Flow y(String str, ArrayList arrayList);
}
