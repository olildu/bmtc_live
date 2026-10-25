package app.chalo.features.chaloconfig.data;

import app.chalo.features.chaloconfig.ChaloConfigCacheStatus;
import app.chalo.features.language.data.Language;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chaloconfig/data/ChaloConfigRepository;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChaloConfigRepository {
    Object a(Language language, Continuation continuation);

    Object b(long j, Continuation continuation);

    Object c(Language language, ContinuationImpl continuationImpl);

    Object d(ContinuationImpl continuationImpl);

    Object e(String str, String str2, Continuation continuation);

    Object f(Language language, String str, Continuation continuation);

    Object g(ChaloConfigCacheStatus chaloConfigCacheStatus, ContinuationImpl continuationImpl);

    Object h(Language language, String str, ContinuationImpl continuationImpl);

    Object i(ArrayList arrayList, Language language, Continuation continuation);

    Enum j(ContinuationImpl continuationImpl);

    Object k(Language language, Continuation continuation);

    Object l(Language language, String str, Continuation continuation);

    Object m(Language language, String str, ContinuationImpl continuationImpl);

    Object n(Continuation continuation);

    Object o(Language language, String str, Continuation continuation);

    Object p(Language language, String str, Continuation continuation);
}
