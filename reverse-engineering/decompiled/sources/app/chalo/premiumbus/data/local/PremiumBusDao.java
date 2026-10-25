package app.chalo.premiumbus.data.local;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketAckType;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketReceiptEntity;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/local/PremiumBusDao;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PremiumBusDao {
    FlowQuery$mapToList$$inlined$map$1 a(long j, String str, String str2);

    Object b(String str, List list, boolean z, Continuation continuation);

    FlowQuery$mapToOneOrNull$$inlined$map$1 c(String str);

    Object d(String str, ArrayList arrayList, Continuation continuation);

    Object e(Continuation continuation);

    Object f(String str, String str2, PremiumReserveTicketAckType premiumReserveTicketAckType, Continuation continuation);

    Object g(String str, PremiumReserveTicketStatus premiumReserveTicketStatus, ContinuationImpl continuationImpl);

    FlowQuery$mapToOneOrNull$$inlined$map$1 i(String str);

    Object j(String str, Continuation continuation);

    FlowQuery$mapToList$$inlined$map$1 k(String str, String str2, String str3);

    Object l(List list, Continuation continuation);

    Object m(PremiumReserveTicketEntity premiumReserveTicketEntity, Continuation continuation);

    Object n(String str, Continuation continuation);

    FlowQuery$mapToOneOrNull$$inlined$map$1 o(String str, String str2);

    Object p(Continuation continuation);

    Object r(String str, String str2, long j, long j2, Continuation continuation);

    Object t(PremiumReserveTicketReceiptEntity premiumReserveTicketReceiptEntity, Continuation continuation);

    FlowQuery$mapToList$$inlined$map$1 u(long j, long j2, String str, String str2);

    FlowQuery$mapToList$$inlined$map$1 v(String str);
}
