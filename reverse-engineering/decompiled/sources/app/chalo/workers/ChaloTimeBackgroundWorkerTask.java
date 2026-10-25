package app.chalo.workers;

import app.chalo.constants.Source;
import app.chalo.features.chalotime.domain.ChaloTimeRefreshManagerUseCase;
import app.chalo.worker.BackgroundWorkerTaskDelegate;
import app.chalo.worker.BackgroundWorkerTaskResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/workers/ChaloTimeBackgroundWorkerTask;", "Lapp/chalo/worker/BackgroundWorkerTaskDelegate;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloTimeBackgroundWorkerTask implements BackgroundWorkerTaskDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTimeRefreshManagerUseCase f11118a;

    public ChaloTimeBackgroundWorkerTask(ChaloTimeRefreshManagerUseCase chaloTimeRefreshManagerUseCase) {
        this.f11118a = chaloTimeRefreshManagerUseCase;
    }

    @Override // app.chalo.worker.BackgroundWorkerTaskDelegate
    public final Object a(ContinuationImpl continuationImpl) {
        this.f11118a.e(Source.CHALO_TIME_BACKGROUND_SYNC_WORKER);
        return BackgroundWorkerTaskResult.Success.f11117a;
    }
}
