package app.chalo.multimodalticket.data.local;

import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketPersistenceData;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/local/MultiModalGroupTicketLocalDataSource;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MultiModalGroupTicketLocalDataSource {
    Flow a(String str, String str2);

    Flow b();

    Flow c(String str);

    Object d(Continuation continuation);

    Flow e(String str, List list);

    Object f(MultiModalGroupTicketPersistenceData multiModalGroupTicketPersistenceData, Continuation continuation);

    Object g(String str, List list, List list2, Continuation continuation);
}
