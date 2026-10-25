package app.chalo.features.chalotime.data.local;

import app.chalo.utils.ElapsedRealTimeClock;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chalotime/data/local/ChaloTimeLocalDataSource;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChaloTimeLocalDataSource {
    Object a(long j, long j2, long j3, ElapsedRealTimeClock elapsedRealTimeClock, Continuation continuation);

    Object b(Continuation continuation);

    Object c(String str, Continuation continuation);

    ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTime$$inlined$map$1 d();

    ChaloTimeLocalDataSourceImpl$getCachedSystemTime$$inlined$map$1 e();

    ChaloTimeLocalDataSourceImpl$getCachedChaloTime$$inlined$map$1 f();

    ChaloTimeLocalDataSourceImpl$getCachedElapsedRealTimeLogic$$inlined$map$1 g();

    ChaloTimeLocalDataSourceImpl$getCachedAppVersionCodeForChaloTime$$inlined$map$1 h();
}
