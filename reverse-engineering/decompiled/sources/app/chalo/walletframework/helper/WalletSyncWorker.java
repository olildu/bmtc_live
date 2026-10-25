package app.chalo.walletframework.helper;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ForegroundInfo;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import app.chalo.R;
import app.chalo.data.WalletSetupConfiguration;
import app.chalo.features.ChaloCoroutineWorker;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore;
import app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStoreImpl$special$$inlined$map$2;
import app.chalo.worker.BackgroundWorkerResultMapperKt;
import app.chalo.worker.BackgroundWorkerTaskDelegate;
import app.chalo.worker.BackgroundWorkerTaskResult;
import in.juspay.hyper.constants.LogCategory;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.FlowKt;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.StringQualifier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lapp/chalo/walletframework/helper/WalletSyncWorker;", "Lapp/chalo/features/ChaloCoroutineWorker;", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletSyncWorker extends ChaloCoroutineWorker {
    public static final Companion d = new Companion();
    public final Object b;
    public final Object c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lapp/chalo/walletframework/helper/WalletSyncWorker$Companion;", "", "", "WALLET_SYNC_WORKER_TAG", "Ljava/lang/String;", "WALLET_SYNC_WORKER_PERIODIC_TAG", "", "NOTIFICATION_ID_WALLET_SYNC", "I", "CHANNEL_ID_MY_CHANNEL", "CHANNEL_NAME_NEW_GROUP", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(Context context, WalletDataStore walletDataStore, WalletSetupConfiguration walletSetupConfiguration, ContinuationImpl continuationImpl) {
            WalletSyncWorker$Companion$setupPeriodicWork$1 walletSyncWorker$Companion$setupPeriodicWork$1;
            PeriodicWorkRequest periodicWorkRequestBuild;
            Context context2;
            WalletDataStore walletDataStore2;
            long j;
            PeriodicWorkRequest periodicWorkRequest;
            Context context3;
            if (continuationImpl instanceof WalletSyncWorker$Companion$setupPeriodicWork$1) {
                walletSyncWorker$Companion$setupPeriodicWork$1 = (WalletSyncWorker$Companion$setupPeriodicWork$1) continuationImpl;
                int i = walletSyncWorker$Companion$setupPeriodicWork$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    walletSyncWorker$Companion$setupPeriodicWork$1.label = i - Integer.MIN_VALUE;
                } else {
                    walletSyncWorker$Companion$setupPeriodicWork$1 = new WalletSyncWorker$Companion$setupPeriodicWork$1(this, continuationImpl);
                }
            } else {
                walletSyncWorker$Companion$setupPeriodicWork$1 = new WalletSyncWorker$Companion$setupPeriodicWork$1(this, continuationImpl);
            }
            Object objT = walletSyncWorker$Companion$setupPeriodicWork$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = walletSyncWorker$Companion$setupPeriodicWork$1.label;
            if (i2 != 0) {
                if (i2 == 1) {
                    j = walletSyncWorker$Companion$setupPeriodicWork$1.J$0;
                    periodicWorkRequestBuild = (PeriodicWorkRequest) walletSyncWorker$Companion$setupPeriodicWork$1.L$2;
                    walletDataStore2 = (WalletDataStore) walletSyncWorker$Companion$setupPeriodicWork$1.L$1;
                    context2 = (Context) walletSyncWorker$Companion$setupPeriodicWork$1.L$0;
                    ResultKt.b(objT);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    periodicWorkRequest = (PeriodicWorkRequest) walletSyncWorker$Companion$setupPeriodicWork$1.L$1;
                    context3 = (Context) walletSyncWorker$Companion$setupPeriodicWork$1.L$0;
                    ResultKt.b(objT);
                }
                WorkManager.getInstance(context3).enqueueUniquePeriodicWork("wallet_sync_worker_periodic_tag", ExistingPeriodicWorkPolicy.REPLACE, periodicWorkRequest);
                return Unit.f17538a;
            }
            ResultKt.b(objT);
            Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
            long j2 = walletSetupConfiguration.d;
            periodicWorkRequestBuild = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) WalletSyncWorker.class, j2, TimeUnit.MINUTES).addTag("wallet_sync_worker_periodic_tag").setConstraints(constraintsBuild).build();
            WalletDataStoreImpl$special$$inlined$map$2 walletDataStoreImpl$special$$inlined$map$2B = walletDataStore.b();
            walletSyncWorker$Companion$setupPeriodicWork$1.L$0 = context;
            walletSyncWorker$Companion$setupPeriodicWork$1.L$1 = walletDataStore;
            walletSyncWorker$Companion$setupPeriodicWork$1.L$2 = periodicWorkRequestBuild;
            walletSyncWorker$Companion$setupPeriodicWork$1.J$0 = j2;
            walletSyncWorker$Companion$setupPeriodicWork$1.label = 1;
            objT = FlowKt.t(walletDataStoreImpl$special$$inlined$map$2B, walletSyncWorker$Companion$setupPeriodicWork$1);
            if (objT != coroutineSingletons) {
                context2 = context;
                walletDataStore2 = walletDataStore;
                j = j2;
            }
            return coroutineSingletons;
            if (((Number) objT).longValue() != j) {
                walletSyncWorker$Companion$setupPeriodicWork$1.L$0 = context2;
                walletSyncWorker$Companion$setupPeriodicWork$1.L$1 = periodicWorkRequestBuild;
                walletSyncWorker$Companion$setupPeriodicWork$1.L$2 = null;
                walletSyncWorker$Companion$setupPeriodicWork$1.label = 2;
                if (walletDataStore2.a(j, walletSyncWorker$Companion$setupPeriodicWork$1) != coroutineSingletons) {
                    periodicWorkRequest = periodicWorkRequestBuild;
                    context3 = context2;
                    WorkManager.getInstance(context3).enqueueUniquePeriodicWork("wallet_sync_worker_periodic_tag", ExistingPeriodicWorkPolicy.REPLACE, periodicWorkRequest);
                }
                return coroutineSingletons;
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.walletframework.helper.WalletSyncWorker$getForegroundInfo$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.walletframework.helper.WalletSyncWorker", f = "WalletSyncWorker.kt", l = {52, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "getForegroundInfo", v = 1)
    final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WalletSyncWorker.this.getForegroundInfo(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSyncWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.i(context, "context");
        Intrinsics.i(params, "params");
        final StringQualifier stringQualifier = new StringQualifier("wallet_sync_worker_task");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.b = LazyKt.a(lazyThreadSafetyMode, new Function0<BackgroundWorkerTaskDelegate>() { // from class: app.chalo.walletframework.helper.WalletSyncWorker$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f10912a;
                boolean z = obj instanceof KoinScopeComponent;
                return (z ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(BackgroundWorkerTaskDelegate.class), null, stringQualifier);
            }
        });
        this.c = LazyKt.a(lazyThreadSafetyMode, new Function0<StringProvider>() { // from class: app.chalo.walletframework.helper.WalletSyncWorker$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f10913a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(StringProvider.class), null, null);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // app.chalo.features.ChaloCoroutineWorker
    public final Object c(ContinuationImpl continuationImpl) {
        WalletSyncWorker$performWork$1 walletSyncWorker$performWork$1;
        if (continuationImpl instanceof WalletSyncWorker$performWork$1) {
            walletSyncWorker$performWork$1 = (WalletSyncWorker$performWork$1) continuationImpl;
            int i = walletSyncWorker$performWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncWorker$performWork$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncWorker$performWork$1 = new WalletSyncWorker$performWork$1(this, continuationImpl);
            }
        } else {
            walletSyncWorker$performWork$1 = new WalletSyncWorker$performWork$1(this, continuationImpl);
        }
        Object objA = walletSyncWorker$performWork$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncWorker$performWork$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            BackgroundWorkerTaskDelegate backgroundWorkerTaskDelegate = (BackgroundWorkerTaskDelegate) this.b.getValue();
            walletSyncWorker$performWork$1.label = 1;
            objA = backgroundWorkerTaskDelegate.a(walletSyncWorker$performWork$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return BackgroundWorkerResultMapperKt.a((BackgroundWorkerTaskResult) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
    public final Object d(Context context, UUID uuid, String str, ContinuationImpl continuationImpl) {
        WalletSyncWorker$createNotification$1 walletSyncWorker$createNotification$1;
        String channelId;
        String name;
        if (continuationImpl instanceof WalletSyncWorker$createNotification$1) {
            walletSyncWorker$createNotification$1 = (WalletSyncWorker$createNotification$1) continuationImpl;
            int i = walletSyncWorker$createNotification$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncWorker$createNotification$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncWorker$createNotification$1 = new WalletSyncWorker$createNotification$1(this, continuationImpl);
            }
        } else {
            walletSyncWorker$createNotification$1 = new WalletSyncWorker$createNotification$1(this, continuationImpl);
        }
        Object objB = walletSyncWorker$createNotification$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncWorker$createNotification$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            walletSyncWorker$createNotification$1.L$0 = context;
            walletSyncWorker$createNotification$1.L$1 = uuid;
            walletSyncWorker$createNotification$1.L$2 = str;
            channelId = "myChannel";
            walletSyncWorker$createNotification$1.L$3 = "myChannel";
            name = "NewGroup";
            walletSyncWorker$createNotification$1.L$4 = "NewGroup";
            walletSyncWorker$createNotification$1.label = 1;
            objB = ((StringProvider) this.c.getValue()).b(StringEnum.CANCEL, new Object[0], walletSyncWorker$createNotification$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) walletSyncWorker$createNotification$1.L$4;
            String str3 = (String) walletSyncWorker$createNotification$1.L$3;
            str = (String) walletSyncWorker$createNotification$1.L$2;
            UUID uuid2 = (UUID) walletSyncWorker$createNotification$1.L$1;
            Context context2 = (Context) walletSyncWorker$createNotification$1.L$0;
            ResultKt.b(objB);
            name = str2;
            channelId = str3;
            context = context2;
            uuid = uuid2;
        }
        PendingIntent pendingIntentCreateCancelPendingIntent = WorkManager.getInstance(context).createCancelPendingIntent(uuid);
        Intrinsics.h(pendingIntentCreateCancelPendingIntent, "createCancelPendingIntent(...)");
        NotificationCompat.Builder builderAddAction = new NotificationCompat.Builder(context, channelId).setContentTitle(str).setTicker(str).setSmallIcon(R.drawable.logo_notification).setOngoing(true).addAction(android.R.drawable.ic_delete, (String) objB, pendingIntentCreateCancelPendingIntent);
        if (Build.VERSION.SDK_INT >= 26) {
            Intrinsics.i(context, "context");
            Intrinsics.i(channelId, "channelId");
            Intrinsics.i(name, "name");
            Object systemService = context.getSystemService("notification");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationChannel notificationChannel = new NotificationChannel(channelId, name, 2);
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
            builderAddAction.setChannelId(notificationChannel.getId());
        }
        Notification notificationBuild = builderAddAction.build();
        Intrinsics.h(notificationBuild, "build(...)");
        return notificationBuild;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.work.CoroutineWorker
    public final Object getForegroundInfo(Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        Context applicationContext;
        WalletSyncWorker walletSyncWorker;
        UUID uuid;
        int i;
        int i2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objD = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = anonymousClass1.label;
        if (i4 != 0) {
            if (i4 == 1) {
                i = anonymousClass1.I$0;
                uuid = (UUID) anonymousClass1.L$2;
                applicationContext = (Context) anonymousClass1.L$1;
                walletSyncWorker = (WalletSyncWorker) anonymousClass1.L$0;
                ResultKt.b(objD);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = anonymousClass1.I$0;
                ResultKt.b(objD);
            }
            return new ForegroundInfo(i2, (Notification) objD);
        }
        ResultKt.b(objD);
        applicationContext = getApplicationContext();
        Intrinsics.h(applicationContext, "getApplicationContext(...)");
        UUID id = getId();
        Intrinsics.h(id, "getId(...)");
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = applicationContext;
        anonymousClass1.L$2 = id;
        anonymousClass1.I$0 = 10;
        anonymousClass1.label = 1;
        Object objB = ((StringProvider) this.c.getValue()).b(StringEnum.NOTIFICATION_WALLET_SYNC_MESSAGE, new Object[0], anonymousClass1);
        if (objB != coroutineSingletons) {
            walletSyncWorker = this;
            uuid = id;
            objD = objB;
            i = 10;
        }
        return coroutineSingletons;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.I$0 = i;
        anonymousClass1.label = 2;
        objD = walletSyncWorker.d(applicationContext, uuid, (String) objD, anonymousClass1);
        if (objD != coroutineSingletons) {
            i2 = i;
            return new ForegroundInfo(i2, (Notification) objD);
        }
        return coroutineSingletons;
    }
}
