package app.chalo.security.sync.keystorage;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/security/sync/keystorage/KeyDao;", "", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface KeyDao {
    Object a(long j, String str, Continuation continuation);

    Object b(ArrayList arrayList, Continuation continuation);

    Object c(long j, Continuation continuation);
}
