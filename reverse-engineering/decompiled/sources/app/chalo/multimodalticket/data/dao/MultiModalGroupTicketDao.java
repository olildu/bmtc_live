package app.chalo.multimodalticket.data.dao;

import app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getAllChildTicketReferences$$inlined$map$1;
import app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getAllGroupTickets$$inlined$map$1;
import app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getChildTicketReference$$inlined$map$1;
import app.chalo.core.database.dao.MultiModalGroupTicketDaoImpl$getGroupInfo$$inlined$map$1;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/data/dao/MultiModalGroupTicketDao;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MultiModalGroupTicketDao {
    MultiModalGroupTicketDaoImpl$getChildTicketReference$$inlined$map$1 a(String str, String str2);

    MultiModalGroupTicketDaoImpl$getAllChildTicketReferences$$inlined$map$1 b();

    MultiModalGroupTicketDaoImpl$getGroupInfo$$inlined$map$1 c(String str);

    Object d(Continuation continuation);

    MultiModalGroupTicketDaoImpl$getAllGroupTickets$$inlined$map$1 e(String str, List list);

    Object f(String str, List list, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Continuation continuation);

    Object g(MultiModalGroupTicketEntity multiModalGroupTicketEntity, ArrayList arrayList, ArrayList arrayList2, Continuation continuation);
}
