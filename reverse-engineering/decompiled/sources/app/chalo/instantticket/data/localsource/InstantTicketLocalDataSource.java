package app.chalo.instantticket.data.localsource;

import app.chalo.instantticket.data.model.InstantTicketEntity;
import app.chalo.instantticket.data.model.InstantTicketReceipt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/localsource/InstantTicketLocalDataSource;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InstantTicketLocalDataSource {
    Flow a(String str);

    Object b(InstantTicketReceipt instantTicketReceipt, Continuation continuation);

    Object c(long j, String str, Continuation continuation);

    Object d(InstantTicketEntity instantTicketEntity, Continuation continuation);

    Object e(String str, List list, Continuation continuation);

    Object f(Continuation continuation);

    Flow g(String str, List list);

    Object h(ArrayList arrayList, Continuation continuation);

    Flow i(String str, String str2);

    Flow j(String str, List list);

    Object k(String str, String str2, ContinuationImpl continuationImpl);
}
