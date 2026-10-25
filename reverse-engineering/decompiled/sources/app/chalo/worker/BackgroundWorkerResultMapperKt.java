package app.chalo.worker;

import androidx.work.ListenableWorker;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BackgroundWorkerResultMapperKt {
    public static final ListenableWorker.Result a(BackgroundWorkerTaskResult backgroundWorkerTaskResult) {
        Intrinsics.i(backgroundWorkerTaskResult, "<this>");
        if (backgroundWorkerTaskResult.equals(BackgroundWorkerTaskResult.Failure.f11115a)) {
            ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
            Intrinsics.h(resultFailure, "failure(...)");
            return resultFailure;
        }
        if (backgroundWorkerTaskResult.equals(BackgroundWorkerTaskResult.Retry.f11116a)) {
            ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
            Intrinsics.h(resultRetry, "retry(...)");
            return resultRetry;
        }
        if (!backgroundWorkerTaskResult.equals(BackgroundWorkerTaskResult.Success.f11117a)) {
            throw new NoWhenBranchMatchedException();
        }
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.h(resultSuccess, "success(...)");
        return resultSuccess;
    }
}
