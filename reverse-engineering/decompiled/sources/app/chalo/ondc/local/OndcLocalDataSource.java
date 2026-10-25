package app.chalo.ondc.local;

import app.chalo.metro.dao.ondc.OndcMetroTicketEntity;
import app.chalo.models.ondc.OndcTicketReceiptEntity;
import app.chalo.ondc.dao.OndcTicketEntity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/local/OndcLocalDataSource;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OndcLocalDataSource {
    Flow a(String str);

    Flow b(String str, String str2);

    Object c(OndcTicketReceiptEntity ondcTicketReceiptEntity, ContinuationImpl continuationImpl);

    Object d(String str, String str2, Continuation continuation);

    Flow e(String str, String str2);

    Object f(ArrayList arrayList, Continuation continuation);

    Object g(Continuation continuation);

    Object h(Continuation continuation);

    Object i(String str, String str2, Continuation continuation);

    Object j(OndcTicketEntity ondcTicketEntity, ContinuationImpl continuationImpl);

    Flow k(String str, String str2);

    Object l(OndcMetroTicketEntity ondcMetroTicketEntity, Continuation continuation);

    Object m(ArrayList arrayList, Continuation continuation);

    Object n(String str, String str2, Continuation continuation);

    Flow o(String str, String str2);
}
