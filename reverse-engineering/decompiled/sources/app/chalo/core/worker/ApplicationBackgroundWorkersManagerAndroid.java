package app.chalo.core.worker;

import android.content.Context;
import android.os.Build;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkManager;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.security.sync.KeySyncWorker;
import app.chalo.walletframework.helper.WalletSyncWorker;
import app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore;
import app.chalo.worker.ApplicationBackgroundWorkersManager;
import app.chalo.worker.IWorkerDataStore;
import app.chalo.workers.ChaloTimeSyncWorker;
import app.chalo.workers.TITONotificationWorker;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/worker/ApplicationBackgroundWorkersManagerAndroid;", "Lapp/chalo/worker/ApplicationBackgroundWorkersManager;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApplicationBackgroundWorkersManagerAndroid implements ApplicationBackgroundWorkersManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2306a;
    public final IWorkerDataStore b;
    public final WalletDataStore c;
    public final GetWalletSetupConfigurationUseCase d;
    public final CityProvider e;

    public ApplicationBackgroundWorkersManagerAndroid(Context context, IWorkerDataStore iWorkerDataStore, WalletDataStore walletDataStore, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, CityProvider cityProvider) {
        this.f2306a = context;
        this.b = iWorkerDataStore;
        this.c = walletDataStore;
        this.d = getWalletSetupConfigurationUseCase;
        this.e = cityProvider;
    }

    @Override // app.chalo.worker.ApplicationBackgroundWorkersManager
    public final Object a(Continuation continuation) {
        Object objA;
        return (CityProviderKt.c(this.e) && (objA = ChaloTimeSyncWorker.b.a(this.f2306a, continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objA : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r5.a(r4, r2, (app.chalo.data.WalletSetupConfiguration) r9, r0) == r1) goto L22;
     */
    @Override // app.chalo.worker.ApplicationBackgroundWorkersManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof app.chalo.core.worker.ApplicationBackgroundWorkersManagerAndroid$setupPeriodicWalletSyncWorker$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.core.worker.ApplicationBackgroundWorkersManagerAndroid$setupPeriodicWalletSyncWorker$1 r0 = (app.chalo.core.worker.ApplicationBackgroundWorkersManagerAndroid$setupPeriodicWalletSyncWorker$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.core.worker.ApplicationBackgroundWorkersManagerAndroid$setupPeriodicWalletSyncWorker$1 r0 = new app.chalo.core.worker.ApplicationBackgroundWorkersManagerAndroid$setupPeriodicWalletSyncWorker$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r9)
            goto L71
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            java.lang.Object r2 = r0.L$2
            app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore r2 = (app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore) r2
            java.lang.Object r4 = r0.L$1
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r5 = r0.L$0
            app.chalo.walletframework.helper.WalletSyncWorker$Companion r5 = (app.chalo.walletframework.helper.WalletSyncWorker.Companion) r5
            kotlin.ResultKt.b(r9)
            goto L5f
        L42:
            kotlin.ResultKt.b(r9)
            app.chalo.walletframework.helper.WalletSyncWorker$Companion r5 = app.chalo.walletframework.helper.WalletSyncWorker.d
            r0.L$0 = r5
            android.content.Context r9 = r8.f2306a
            r0.L$1 = r9
            app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore r2 = r8.c
            r0.L$2 = r2
            r0.label = r4
            app.chalo.domain.GetWalletSetupConfigurationUseCase r4 = r8.d
            java.lang.Object r4 = r4.b(r0)
            if (r4 != r1) goto L5c
            goto L70
        L5c:
            r7 = r4
            r4 = r9
            r9 = r7
        L5f:
            app.chalo.data.WalletSetupConfiguration r9 = (app.chalo.data.WalletSetupConfiguration) r9
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r9 = r5.a(r4, r2, r9, r0)
            if (r9 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.core.worker.ApplicationBackgroundWorkersManagerAndroid.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.worker.ApplicationBackgroundWorkersManager
    public final void c() {
        Context context = this.f2306a;
        Intrinsics.i(context, "context");
        WorkManager.getInstance(context).enqueueUniqueWork("wallet_sync_worker_tag", ExistingWorkPolicy.REPLACE, new OneTimeWorkRequest.Builder(WalletSyncWorker.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
    }

    @Override // app.chalo.worker.ApplicationBackgroundWorkersManager
    public final void d(String source, boolean z) {
        Intrinsics.i(source, "source");
        WorkManager.getInstance(this.f2306a).enqueueUniqueWork("EncrkeySyncWorkOneTime", z ? ExistingWorkPolicy.REPLACE : ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(KeySyncWorker.class).addTag("EncrkeySyncWorkTagOneTime").setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
    }

    @Override // app.chalo.worker.ApplicationBackgroundWorkersManager
    public final Object e(long j, String str, Continuation continuation) {
        Object objA = KeySyncWorker.d.a(this.f2306a, this.b, j, (ContinuationImpl) continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.worker.ApplicationBackgroundWorkersManager
    public final void f(boolean z, String routeId, String vehicleNumber, String str, String tapId, String str2, String str3, String bookingId) throws Throwable {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(tapId, "tapId");
        Intrinsics.i(bookingId, "bookingId");
        if (Build.VERSION.SDK_INT >= 34 || Intrinsics.d(TITONotificationWorker.m, tapId)) {
            return;
        }
        TITONotificationWorker.m = tapId;
        OneTimeWorkRequest.Builder backoffCriteria = new OneTimeWorkRequest.Builder(TITONotificationWorker.class).addTag("LiveEtaNotificationWorkTag").setExpedited(OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 10000L, TimeUnit.MILLISECONDS);
        Pair[] pairArr = {new Pair("routeId", routeId), new Pair("vehicleNumber", vehicleNumber), new Pair("initialStopId", str), new Pair("isDropOffNotif", Boolean.valueOf(z)), new Pair("tapId", tapId), new Pair("productType", str2), new Pair("productSubType", str3), new Pair("bookingId", bookingId)};
        Data.Builder builder = new Data.Builder();
        for (int i = 0; i < 8; i++) {
            Pair pair = pairArr[i];
            builder.put((String) pair.d(), pair.e());
        }
        Data dataBuild = builder.build();
        Intrinsics.h(dataBuild, "dataBuilder.build()");
        WorkManager.getInstance(this.f2306a).enqueueUniqueWork("LiveEtaNotificationWorkTag", ExistingWorkPolicy.REPLACE, backoffCriteria.setInputData(dataBuild).build());
    }
}
