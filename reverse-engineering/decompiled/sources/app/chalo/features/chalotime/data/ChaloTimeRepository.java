package app.chalo.features.chalotime.data;

import app.chalo.features.chalotime.data.model.config.ChaloTimeRequestConfig;
import app.chalo.utils.ElapsedRealTimeClock;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chalotime/data/ChaloTimeRepository;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChaloTimeRepository {
    Object a(long j, long j2, long j3, ElapsedRealTimeClock elapsedRealTimeClock, Continuation continuation);

    Object b(Continuation continuation);

    Object c(String str, Continuation continuation);

    Object d(ChaloTimeRequestConfig chaloTimeRequestConfig, ContinuationImpl continuationImpl);

    Object e(ContinuationImpl continuationImpl);

    Object f(ContinuationImpl continuationImpl);

    Object g(ContinuationImpl continuationImpl);

    Object h(Continuation continuation);

    Object i(Continuation continuation);
}
