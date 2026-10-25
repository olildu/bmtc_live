package app.chalo.security.sync;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.security.FetchEncryptionKeysUseCase;
import app.chalo.worker.BackgroundWorkerTaskDelegate;
import app.chalo.worker.BackgroundWorkerTaskResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/security/sync/KeySyncBackgroundWorkerTaskDelegate;", "Lapp/chalo/worker/BackgroundWorkerTaskDelegate;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeySyncBackgroundWorkerTaskDelegate implements BackgroundWorkerTaskDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f9376a;
    public final UserProfileDetailsProvider b;
    public final FetchEncryptionKeysUseCase c;

    public KeySyncBackgroundWorkerTaskDelegate(AnalyticsContract analyticsContract, UserProfileDetailsProvider userProfileDetailsProvider, FetchEncryptionKeysUseCase fetchEncryptionKeysUseCase) {
        this.f9376a = analyticsContract;
        this.b = userProfileDetailsProvider;
        this.c = fetchEncryptionKeysUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.worker.BackgroundWorkerTaskDelegate
    public final Object a(ContinuationImpl continuationImpl) {
        KeySyncBackgroundWorkerTaskDelegate$performWork$1 keySyncBackgroundWorkerTaskDelegate$performWork$1;
        if (continuationImpl instanceof KeySyncBackgroundWorkerTaskDelegate$performWork$1) {
            keySyncBackgroundWorkerTaskDelegate$performWork$1 = (KeySyncBackgroundWorkerTaskDelegate$performWork$1) continuationImpl;
            int i = keySyncBackgroundWorkerTaskDelegate$performWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                keySyncBackgroundWorkerTaskDelegate$performWork$1.label = i - Integer.MIN_VALUE;
            } else {
                keySyncBackgroundWorkerTaskDelegate$performWork$1 = new KeySyncBackgroundWorkerTaskDelegate$performWork$1(this, continuationImpl);
            }
        } else {
            keySyncBackgroundWorkerTaskDelegate$performWork$1 = new KeySyncBackgroundWorkerTaskDelegate$performWork$1(this, continuationImpl);
        }
        Object obj = keySyncBackgroundWorkerTaskDelegate$performWork$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = keySyncBackgroundWorkerTaskDelegate$performWork$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strF = Reflection.a(KeySyncBackgroundWorkerTaskDelegate.class).f();
            AnalyticsContract.DefaultImpls.a(this.f9376a, "key sync worker started", strF == null ? "KeySyncWorker" : strF, null, null, false, 28);
            if (((Boolean) this.b.g().getValue()).booleanValue()) {
                keySyncBackgroundWorkerTaskDelegate$performWork$1.label = 1;
                if (this.c.d("KeySyncWorker", keySyncBackgroundWorkerTaskDelegate$performWork$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return BackgroundWorkerTaskResult.Success.f11117a;
    }
}
