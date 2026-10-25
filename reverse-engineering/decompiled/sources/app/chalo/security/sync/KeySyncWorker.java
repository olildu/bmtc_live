package app.chalo.security.sync;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
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
import app.chalo.features.ChaloCoroutineWorker;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.worker.BackgroundWorkerResultMapperKt;
import app.chalo.worker.BackgroundWorkerTaskDelegate;
import app.chalo.worker.BackgroundWorkerTaskResult;
import app.chalo.worker.IWorkerDataStore;
import app.chalo.worker.WorkConfiguration;
import app.chalo.workers.WorkerDataStoreWrapper$getCurrentPeriodicSyncIntervalForWorker$$inlined$map$1;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lapp/chalo/security/sync/KeySyncWorker;", "Lapp/chalo/features/ChaloCoroutineWorker;", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeySyncWorker extends ChaloCoroutineWorker {
    public static final Companion d = new Companion();
    public final Object b;
    public final Object c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u000f"}, d2 = {"Lapp/chalo/security/sync/KeySyncWorker$Companion;", "Lapp/chalo/worker/WorkConfiguration;", "", "PERIODIC_KEY_SYNC_WORK_ID", "Ljava/lang/String;", "PERIODIC_KEY_SYNC_WORK_TAG", "ONE_TIME_KEY_SYNC_WORK_ID", "ONE_TIME_KEY_SYNC_WORK_TAG", "EXP_ONE_TIME_KEY_SYNC_WORK_ID", "EXP_ONE_TIME_KEY_SYNC_WORK_TAG", "", "NOTIFICATION_ID_KEY_SYNC", "I", "CHANNEL_ID_ENCR_CHANNEL", "CHANNEL_NAME_ENCR_GROUP", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements WorkConfiguration {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(Context context, IWorkerDataStore iWorkerDataStore, long j, ContinuationImpl continuationImpl) {
            KeySyncWorker$Companion$schedulePeriodicWork$1 keySyncWorker$Companion$schedulePeriodicWork$1;
            PeriodicWorkRequest periodicWorkRequestBuild;
            Object objT;
            Context context2;
            PeriodicWorkRequest periodicWorkRequest;
            if (continuationImpl instanceof KeySyncWorker$Companion$schedulePeriodicWork$1) {
                keySyncWorker$Companion$schedulePeriodicWork$1 = (KeySyncWorker$Companion$schedulePeriodicWork$1) continuationImpl;
                int i = keySyncWorker$Companion$schedulePeriodicWork$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    keySyncWorker$Companion$schedulePeriodicWork$1.label = i - Integer.MIN_VALUE;
                } else {
                    keySyncWorker$Companion$schedulePeriodicWork$1 = new KeySyncWorker$Companion$schedulePeriodicWork$1(this, continuationImpl);
                }
            } else {
                keySyncWorker$Companion$schedulePeriodicWork$1 = new KeySyncWorker$Companion$schedulePeriodicWork$1(this, continuationImpl);
            }
            Object obj = keySyncWorker$Companion$schedulePeriodicWork$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = keySyncWorker$Companion$schedulePeriodicWork$1.label;
            if (i2 == 0) {
                ResultKt.b(obj);
                periodicWorkRequestBuild = new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) KeySyncWorker.class, j, TimeUnit.MINUTES).addTag("EncrkeySyncWorkTag").setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build();
                WorkerDataStoreWrapper$getCurrentPeriodicSyncIntervalForWorker$$inlined$map$1 workerDataStoreWrapper$getCurrentPeriodicSyncIntervalForWorker$$inlined$map$1A = iWorkerDataStore.a();
                keySyncWorker$Companion$schedulePeriodicWork$1.L$0 = context;
                keySyncWorker$Companion$schedulePeriodicWork$1.L$1 = iWorkerDataStore;
                keySyncWorker$Companion$schedulePeriodicWork$1.L$2 = periodicWorkRequestBuild;
                keySyncWorker$Companion$schedulePeriodicWork$1.J$0 = j;
                keySyncWorker$Companion$schedulePeriodicWork$1.label = 1;
                objT = FlowKt.t(workerDataStoreWrapper$getCurrentPeriodicSyncIntervalForWorker$$inlined$map$1A, keySyncWorker$Companion$schedulePeriodicWork$1);
                if (objT != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                j = keySyncWorker$Companion$schedulePeriodicWork$1.J$0;
                PeriodicWorkRequest periodicWorkRequest2 = (PeriodicWorkRequest) keySyncWorker$Companion$schedulePeriodicWork$1.L$2;
                iWorkerDataStore = (IWorkerDataStore) keySyncWorker$Companion$schedulePeriodicWork$1.L$1;
                Context context3 = (Context) keySyncWorker$Companion$schedulePeriodicWork$1.L$0;
                ResultKt.b(obj);
                periodicWorkRequestBuild = periodicWorkRequest2;
                context = context3;
                objT = obj;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                periodicWorkRequest = (PeriodicWorkRequest) keySyncWorker$Companion$schedulePeriodicWork$1.L$1;
                context2 = (Context) keySyncWorker$Companion$schedulePeriodicWork$1.L$0;
                ResultKt.b(obj);
            }
            WorkManager.getInstance(context2).enqueueUniquePeriodicWork("EncrkeySyncWork", ExistingPeriodicWorkPolicy.REPLACE, periodicWorkRequest);
            return Unit.f17538a;
            if (((Number) objT).longValue() != j) {
                keySyncWorker$Companion$schedulePeriodicWork$1.L$0 = context;
                keySyncWorker$Companion$schedulePeriodicWork$1.L$1 = periodicWorkRequestBuild;
                keySyncWorker$Companion$schedulePeriodicWork$1.L$2 = null;
                keySyncWorker$Companion$schedulePeriodicWork$1.label = 2;
                if (iWorkerDataStore.b(j, keySyncWorker$Companion$schedulePeriodicWork$1) != coroutineSingletons) {
                    context2 = context;
                    periodicWorkRequest = periodicWorkRequestBuild;
                    WorkManager.getInstance(context2).enqueueUniquePeriodicWork("EncrkeySyncWork", ExistingPeriodicWorkPolicy.REPLACE, periodicWorkRequest);
                }
                return coroutineSingletons;
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.security.sync.KeySyncWorker$getForegroundInfo$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.security.sync.KeySyncWorker", f = "KeySyncWorker.kt", l = {64, 61}, m = "getForegroundInfo", v = 1)
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
            return KeySyncWorker.this.getForegroundInfo(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeySyncWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.i(context, "context");
        Intrinsics.i(params, "params");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.b = LazyKt.a(lazyThreadSafetyMode, new Function0<StringProvider>() { // from class: app.chalo.security.sync.KeySyncWorker$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9378a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(StringProvider.class), null, null);
            }
        });
        final StringQualifier stringQualifier = new StringQualifier("key_sync_worker_task");
        this.c = LazyKt.a(lazyThreadSafetyMode, new Function0<BackgroundWorkerTaskDelegate>() { // from class: app.chalo.security.sync.KeySyncWorker$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f9379a;
                boolean z = obj instanceof KoinScopeComponent;
                return (z ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(BackgroundWorkerTaskDelegate.class), null, stringQualifier);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // app.chalo.features.ChaloCoroutineWorker
    public final Object c(ContinuationImpl continuationImpl) {
        KeySyncWorker$performWork$1 keySyncWorker$performWork$1;
        if (continuationImpl instanceof KeySyncWorker$performWork$1) {
            keySyncWorker$performWork$1 = (KeySyncWorker$performWork$1) continuationImpl;
            int i = keySyncWorker$performWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                keySyncWorker$performWork$1.label = i - Integer.MIN_VALUE;
            } else {
                keySyncWorker$performWork$1 = new KeySyncWorker$performWork$1(this, continuationImpl);
            }
        } else {
            keySyncWorker$performWork$1 = new KeySyncWorker$performWork$1(this, continuationImpl);
        }
        Object objA = keySyncWorker$performWork$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = keySyncWorker$performWork$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            BackgroundWorkerTaskDelegate backgroundWorkerTaskDelegate = (BackgroundWorkerTaskDelegate) this.c.getValue();
            keySyncWorker$performWork$1.label = 1;
            objA = backgroundWorkerTaskDelegate.a(keySyncWorker$performWork$1);
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
        KeySyncWorker$createNotification$1 keySyncWorker$createNotification$1;
        String channelId;
        String name;
        if (continuationImpl instanceof KeySyncWorker$createNotification$1) {
            keySyncWorker$createNotification$1 = (KeySyncWorker$createNotification$1) continuationImpl;
            int i = keySyncWorker$createNotification$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                keySyncWorker$createNotification$1.label = i - Integer.MIN_VALUE;
            } else {
                keySyncWorker$createNotification$1 = new KeySyncWorker$createNotification$1(this, continuationImpl);
            }
        } else {
            keySyncWorker$createNotification$1 = new KeySyncWorker$createNotification$1(this, continuationImpl);
        }
        Object objB = keySyncWorker$createNotification$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = keySyncWorker$createNotification$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            keySyncWorker$createNotification$1.L$0 = context;
            keySyncWorker$createNotification$1.L$1 = uuid;
            keySyncWorker$createNotification$1.L$2 = str;
            channelId = "encrChannel";
            keySyncWorker$createNotification$1.L$3 = "encrChannel";
            name = "ENCRGroup";
            keySyncWorker$createNotification$1.L$4 = "ENCRGroup";
            keySyncWorker$createNotification$1.label = 1;
            objB = ((StringProvider) this.b.getValue()).b(StringEnum.CANCEL, new Object[0], keySyncWorker$createNotification$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) keySyncWorker$createNotification$1.L$4;
            String str3 = (String) keySyncWorker$createNotification$1.L$3;
            str = (String) keySyncWorker$createNotification$1.L$2;
            UUID uuid2 = (UUID) keySyncWorker$createNotification$1.L$1;
            Context context2 = (Context) keySyncWorker$createNotification$1.L$0;
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
        KeySyncWorker keySyncWorker;
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
                keySyncWorker = (KeySyncWorker) anonymousClass1.L$0;
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
        anonymousClass1.I$0 = 15;
        anonymousClass1.label = 1;
        Object objB = ((StringProvider) this.b.getValue()).b(StringEnum.NOTIFICATION_WALLET_SYNC_MESSAGE, new Object[0], anonymousClass1);
        if (objB != coroutineSingletons) {
            keySyncWorker = this;
            uuid = id;
            objD = objB;
            i = 15;
        }
        return coroutineSingletons;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.I$0 = i;
        anonymousClass1.label = 2;
        objD = keySyncWorker.d(applicationContext, uuid, (String) objD, anonymousClass1);
        if (objD != coroutineSingletons) {
            i2 = i;
            return new ForegroundInfo(i2, (Notification) objD);
        }
        return coroutineSingletons;
    }
}
