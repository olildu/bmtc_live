package app.chalo.workers;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.work.ForegroundInfo;
import androidx.work.ListenableWorker;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import app.chalo.R;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.ChaloCoroutineWorker;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.TitoRideDetailsArgs;
import app.chalo.tito.data.model.TITONotificationJobConfig;
import app.chalo.tito.domain.FetchTitoValidationConfigUseCase;
import app.chalo.tito.domain.GetCachedRouteInfoRouteIdUseCase;
import app.chalo.tito.domain.GetCachedStopFromStopIdUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import in.juspay.hyper.constants.LogCategory;
import j$.util.Objects;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.bouncycastle.asn1.eac.EACTags;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lapp/chalo/workers/TITONotificationWorker;", "Lapp/chalo/features/ChaloCoroutineWorker;", "Landroid/content/Context;", LogCategory.CONTEXT, "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TITONotificationWorker extends ChaloCoroutineWorker {
    public static String m;
    public final NotificationManager b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final RemoteViews l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004¨\u0006\u0019"}, d2 = {"Lapp/chalo/workers/TITONotificationWorker$Companion;", "", "", "LIVE_ETA_NOTIFICATION_WORK_TAG", "Ljava/lang/String;", "NOTIFICATION_CHANNEL_ID", "NOTIFICATION_CHANNEL_NAME", "ROUTE_ID", "VEHICLE_NUMBER", "INITIAL_STOP_ID", "IS_DROP_OFF_NOTIF", "DISMISS_CTA", "VIEW_DETAILS_CTA", "DROP_OFF_NOTIFICATION", "LIVE_ETA_NOTIFICATION", "", "NOTIFICATION_ID", "I", "NOTIFICATION_TYPE", "TAP_ID", "PRODUCT_TYPE", "PRODUCT_SUB_TYPE", "BOOKING_ID", "TITO_REQUEST_CODE", "currentlyRunningTITOJobTapId", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: app.chalo.workers.TITONotificationWorker$getForegroundInfo$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.workers.TITONotificationWorker", f = "TITONotificationWorker.kt", l = {EACTags.HISTORICAL_BYTES}, m = "getForegroundInfo", v = 1)
    final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TITONotificationWorker.this.getForegroundInfo(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TITONotificationWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.i(context, "context");
        Intrinsics.i(parameters, "parameters");
        Object systemService = context.getSystemService("notification");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.b = (NotificationManager) systemService;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.c = LazyKt.a(lazyThreadSafetyMode, new Function0<LiveTrackingDataManager>() { // from class: app.chalo.workers.TITONotificationWorker$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f11121a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(LiveTrackingDataManager.class), null, null);
            }
        });
        this.d = LazyKt.a(lazyThreadSafetyMode, new Function0<CoroutineContextProvider>() { // from class: app.chalo.workers.TITONotificationWorker$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f11122a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CoroutineContextProvider.class), null, null);
            }
        });
        this.e = LazyKt.a(lazyThreadSafetyMode, new Function0<CrashlyticsLogger>() { // from class: app.chalo.workers.TITONotificationWorker$special$$inlined$inject$default$3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f11123a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CrashlyticsLogger.class), null, null);
            }
        });
        this.f = LazyKt.a(lazyThreadSafetyMode, new Function0<GetCachedStopFromStopIdUseCase>() { // from class: app.chalo.workers.TITONotificationWorker$special$$inlined$inject$default$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f11124a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(GetCachedStopFromStopIdUseCase.class), null, null);
            }
        });
        this.g = LazyKt.a(lazyThreadSafetyMode, new Function0<GetCachedRouteInfoRouteIdUseCase>() { // from class: app.chalo.workers.TITONotificationWorker$special$$inlined$inject$default$5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f11125a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(GetCachedRouteInfoRouteIdUseCase.class), null, null);
            }
        });
        this.h = LazyKt.a(lazyThreadSafetyMode, new Function0<NetworkStateManager>() { // from class: app.chalo.workers.TITONotificationWorker$special$$inlined$inject$default$6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f11126a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(NetworkStateManager.class), null, null);
            }
        });
        this.i = LazyKt.a(lazyThreadSafetyMode, new Function0<StringProvider>() { // from class: app.chalo.workers.TITONotificationWorker$special$$inlined$inject$default$7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f11127a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(StringProvider.class), null, null);
            }
        });
        this.j = LazyKt.a(lazyThreadSafetyMode, new Function0<FetchTitoValidationConfigUseCase>() { // from class: app.chalo.workers.TITONotificationWorker$special$$inlined$inject$default$8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f11128a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(FetchTitoValidationConfigUseCase.class), null, null);
            }
        });
        this.k = LazyKt.a(lazyThreadSafetyMode, new Function0<TimeUtilsContract>() { // from class: app.chalo.workers.TITONotificationWorker$special$$inlined$inject$default$9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj = this.f11129a;
                return (obj instanceof KoinScopeComponent ? ((KoinScopeComponent) obj).i0() : GlobalContext.f18817a.a().c.d).d(Reflection.a(TimeUtilsContract.class), null, null);
            }
        });
        this.l = new RemoteViews(context.getPackageName(), R.layout.live_eta_notification);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object d(TITONotificationWorker tITONotificationWorker, String str, long j, String str2, boolean z, ContinuationImpl continuationImpl) {
        TITONotificationWorker$createForegroundInfo$1 tITONotificationWorker$createForegroundInfo$1;
        tITONotificationWorker.getClass();
        if (continuationImpl instanceof TITONotificationWorker$createForegroundInfo$1) {
            tITONotificationWorker$createForegroundInfo$1 = (TITONotificationWorker$createForegroundInfo$1) continuationImpl;
            int i = tITONotificationWorker$createForegroundInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tITONotificationWorker$createForegroundInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                tITONotificationWorker$createForegroundInfo$1 = new TITONotificationWorker$createForegroundInfo$1(tITONotificationWorker, continuationImpl);
            }
        } else {
            tITONotificationWorker$createForegroundInfo$1 = new TITONotificationWorker$createForegroundInfo$1(tITONotificationWorker, continuationImpl);
        }
        TITONotificationWorker$createForegroundInfo$1 tITONotificationWorker$createForegroundInfo$2 = tITONotificationWorker$createForegroundInfo$1;
        Object objF = tITONotificationWorker$createForegroundInfo$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tITONotificationWorker$createForegroundInfo$2.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("LiveEta", "LiveEta", 3);
                notificationChannel.enableVibration(true);
                notificationChannel.enableLights(true);
                tITONotificationWorker.b.createNotificationChannel(notificationChannel);
            }
            tITONotificationWorker$createForegroundInfo$2.label = 1;
            objF = tITONotificationWorker.f(z, str, j, str2, tITONotificationWorker$createForegroundInfo$2);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        NotificationCompat.Builder builder = (NotificationCompat.Builder) objF;
        return Build.VERSION.SDK_INT >= 34 ? new ForegroundInfo(1111, builder.build(), 1) : new ForegroundInfo(1111, builder.build());
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0145 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final Object e(TITONotificationWorker tITONotificationWorker, boolean z, String str, String str2, String str3, long j, String str4, TITONotificationJobConfig tITONotificationJobConfig, ContinuationImpl continuationImpl) {
        TITONotificationWorker$updateEtaOnNotification$1 tITONotificationWorker$updateEtaOnNotification$1;
        boolean z2;
        String str5;
        TITONotificationJobConfig tITONotificationJobConfig2;
        Object obj;
        String str6;
        String str7;
        long j2;
        StatusBarNotification statusBarNotification;
        Notification notification;
        Bundle bundle;
        String str8 = str;
        tITONotificationWorker.getClass();
        if (continuationImpl instanceof TITONotificationWorker$updateEtaOnNotification$1) {
            tITONotificationWorker$updateEtaOnNotification$1 = (TITONotificationWorker$updateEtaOnNotification$1) continuationImpl;
            int i = tITONotificationWorker$updateEtaOnNotification$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tITONotificationWorker$updateEtaOnNotification$1.label = i - Integer.MIN_VALUE;
            } else {
                tITONotificationWorker$updateEtaOnNotification$1 = new TITONotificationWorker$updateEtaOnNotification$1(tITONotificationWorker, continuationImpl);
            }
        } else {
            tITONotificationWorker$updateEtaOnNotification$1 = new TITONotificationWorker$updateEtaOnNotification$1(tITONotificationWorker, continuationImpl);
        }
        TITONotificationWorker$updateEtaOnNotification$1 tITONotificationWorker$updateEtaOnNotification$2 = tITONotificationWorker$updateEtaOnNotification$1;
        Object obj2 = tITONotificationWorker$updateEtaOnNotification$2.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tITONotificationWorker$updateEtaOnNotification$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj2);
            GetCachedStopFromStopIdUseCase getCachedStopFromStopIdUseCase = (GetCachedStopFromStopIdUseCase) tITONotificationWorker.f.getValue();
            tITONotificationWorker$updateEtaOnNotification$2.L$0 = str8;
            tITONotificationWorker$updateEtaOnNotification$2.L$1 = str2;
            tITONotificationWorker$updateEtaOnNotification$2.L$2 = str3;
            tITONotificationWorker$updateEtaOnNotification$2.L$3 = str4;
            tITONotificationWorker$updateEtaOnNotification$2.L$4 = tITONotificationJobConfig;
            z2 = z;
            tITONotificationWorker$updateEtaOnNotification$2.Z$0 = z2;
            tITONotificationWorker$updateEtaOnNotification$2.J$0 = j;
            tITONotificationWorker$updateEtaOnNotification$2.label = 1;
            ChaloTransitMode.Companion companion = ChaloTransitMode.INSTANCE;
            Object objA = getCachedStopFromStopIdUseCase.a(str8, str3, tITONotificationWorker$updateEtaOnNotification$2);
            if (objA != obj3) {
                str5 = str4;
                tITONotificationJobConfig2 = tITONotificationJobConfig;
                obj = objA;
                str6 = str3;
                str7 = str2;
                j2 = j;
            }
            return obj3;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(obj2);
                return unit;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            return unit;
        }
        long j3 = tITONotificationWorker$updateEtaOnNotification$2.J$0;
        boolean z3 = tITONotificationWorker$updateEtaOnNotification$2.Z$0;
        TITONotificationJobConfig tITONotificationJobConfig3 = (TITONotificationJobConfig) tITONotificationWorker$updateEtaOnNotification$2.L$4;
        String str9 = (String) tITONotificationWorker$updateEtaOnNotification$2.L$3;
        String str10 = (String) tITONotificationWorker$updateEtaOnNotification$2.L$2;
        String str11 = (String) tITONotificationWorker$updateEtaOnNotification$2.L$1;
        String str12 = (String) tITONotificationWorker$updateEtaOnNotification$2.L$0;
        ResultKt.b(obj2);
        obj = obj2;
        str6 = str10;
        tITONotificationJobConfig2 = tITONotificationJobConfig3;
        str5 = str9;
        z2 = z3;
        j2 = j3;
        str7 = str11;
        str8 = str12;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z2) {
                String str13 = ((StopAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).b;
                tITONotificationWorker$updateEtaOnNotification$2.L$0 = null;
                tITONotificationWorker$updateEtaOnNotification$2.L$1 = null;
                tITONotificationWorker$updateEtaOnNotification$2.L$2 = null;
                tITONotificationWorker$updateEtaOnNotification$2.L$3 = null;
                tITONotificationWorker$updateEtaOnNotification$2.L$4 = null;
                tITONotificationWorker$updateEtaOnNotification$2.label = 2;
                if (tITONotificationWorker.h(str8, str7, str6, j2, str13, str5, tITONotificationJobConfig2, tITONotificationWorker$updateEtaOnNotification$2) == obj3) {
                    return obj3;
                }
            } else {
                StatusBarNotification[] activeNotifications = tITONotificationWorker.b.getActiveNotifications();
                Intrinsics.h(activeNotifications, "getActiveNotifications(...)");
                int length = activeNotifications.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        statusBarNotification = null;
                        break;
                    }
                    statusBarNotification = activeNotifications[i3];
                    if (statusBarNotification.getId() == 1111) {
                        break;
                    }
                    i3++;
                }
                if (statusBarNotification == null || (notification = statusBarNotification.getNotification()) == null || (bundle = notification.extras) == null || (!Intrinsics.d(bundle.getString("notifType"), "LiveEtaNotif") && !Intrinsics.d(bundle.getString("notifType"), "DropOffNotif"))) {
                    String str14 = ((StopAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).b;
                    tITONotificationWorker$updateEtaOnNotification$2.L$0 = null;
                    tITONotificationWorker$updateEtaOnNotification$2.L$1 = null;
                    tITONotificationWorker$updateEtaOnNotification$2.L$2 = null;
                    tITONotificationWorker$updateEtaOnNotification$2.L$3 = null;
                    tITONotificationWorker$updateEtaOnNotification$2.L$4 = null;
                    tITONotificationWorker$updateEtaOnNotification$2.label = 3;
                    if (tITONotificationWorker.i(str8, str7, str6, j2, str14, str5, tITONotificationJobConfig2, tITONotificationWorker$updateEtaOnNotification$2) == obj3) {
                        return obj3;
                    }
                }
            }
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // app.chalo.features.ChaloCoroutineWorker
    public final Object c(ContinuationImpl continuationImpl) throws Throwable {
        TITONotificationWorker$performWork$1 tITONotificationWorker$performWork$1;
        if (continuationImpl instanceof TITONotificationWorker$performWork$1) {
            tITONotificationWorker$performWork$1 = (TITONotificationWorker$performWork$1) continuationImpl;
            int i = tITONotificationWorker$performWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tITONotificationWorker$performWork$1.label = i - Integer.MIN_VALUE;
            } else {
                tITONotificationWorker$performWork$1 = new TITONotificationWorker$performWork$1(this, continuationImpl);
            }
        } else {
            tITONotificationWorker$performWork$1 = new TITONotificationWorker$performWork$1(this, continuationImpl);
        }
        Object objG = tITONotificationWorker$performWork$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tITONotificationWorker$performWork$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            if (Build.VERSION.SDK_INT >= 34) {
                m = null;
                ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
                Intrinsics.h(resultSuccess, "success(...)");
                return resultSuccess;
            }
            DefaultIoScheduler defaultIoSchedulerB = ((CoroutineContextProvider) this.d.getValue()).b();
            TITONotificationWorker$performWork$2 tITONotificationWorker$performWork$2 = new TITONotificationWorker$performWork$2(this, null);
            tITONotificationWorker$performWork$1.label = 1;
            objG = BuildersKt.g(defaultIoSchedulerB, tITONotificationWorker$performWork$2, tITONotificationWorker$performWork$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        Intrinsics.h(objG, "withContext(...)");
        return objG;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x0217  */
    /* JADX WARN: Code duplicated, block: B:46:0x023e  */
    /* JADX WARN: Code duplicated, block: B:49:0x024a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    public final Object f(boolean z, String str, long j, String str2, ContinuationImpl continuationImpl) {
        TITONotificationWorker$getNotificationBuilder$1 tITONotificationWorker$getNotificationBuilder$1;
        long j2;
        String strO;
        int color;
        PendingIntent pendingIntent;
        long j3;
        int i;
        PendingIntent pendingIntent2;
        RemoteViews remoteViews;
        PendingIntent pendingIntent3;
        String str3;
        int i2;
        int i3;
        int i4;
        Object objB;
        String str4;
        PendingIntent pendingIntent4;
        RemoteViews remoteViews2;
        String str5;
        Object objB2;
        String str6;
        RemoteViews remoteViews3;
        int i5;
        PendingIntent pendingIntent5;
        int i6;
        Object obj;
        String str7;
        Object objB3;
        Object obj2;
        String str8;
        String str9 = str;
        long j4 = j;
        if (continuationImpl instanceof TITONotificationWorker$getNotificationBuilder$1) {
            tITONotificationWorker$getNotificationBuilder$1 = (TITONotificationWorker$getNotificationBuilder$1) continuationImpl;
            int i7 = tITONotificationWorker$getNotificationBuilder$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                tITONotificationWorker$getNotificationBuilder$1.label = i7 - Integer.MIN_VALUE;
            } else {
                tITONotificationWorker$getNotificationBuilder$1 = new TITONotificationWorker$getNotificationBuilder$1(this, continuationImpl);
            }
        } else {
            tITONotificationWorker$getNotificationBuilder$1 = new TITONotificationWorker$getNotificationBuilder$1(this, continuationImpl);
        }
        Object obj3 = tITONotificationWorker$getNotificationBuilder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = tITONotificationWorker$getNotificationBuilder$1.label;
        RemoteViews remoteViews4 = this.l;
        if (i8 == 0) {
            j2 = 0;
            ResultKt.b(obj3);
            PendingIntent pendingIntentCreateCancelPendingIntent = WorkManager.getInstance(getApplicationContext()).createCancelPendingIntent(getId());
            Intrinsics.h(pendingIntentCreateCancelPendingIntent, "createCancelPendingIntent(...)");
            strO = ((TimeUtilsContract) this.k.getValue()).O(j4);
            color = ContextCompat.getColor(getApplicationContext(), R.color.orange_primary);
            Context applicationContext = getApplicationContext();
            Intrinsics.h(applicationContext, "getApplicationContext(...)");
            Source source = Source.NOTIFICATION;
            Intent launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
                launchIntentForPackage.setClassName(applicationContext.getPackageName(), "app.chalo.android.MainActivity");
            }
            launchIntentForPackage.addFlags(335544320);
            List listS = CollectionsKt.S(new HomeArgs((String) null, (String) null, 7), new TitoRideDetailsArgs(source, str2));
            Json json = ChaloJson.b;
            json.getClass();
            launchIntentForPackage.putExtra("notification_payload_meta_data", json.a(new ArrayListSerializer(SceneArgs.INSTANCE.serializer()), listS));
            TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(getApplicationContext());
            taskStackBuilderCreate.addNextIntent(launchIntentForPackage);
            pendingIntent = taskStackBuilderCreate.getPendingIntent(9999, 201326592);
            if (z) {
                i3 = R.id.notif_title;
                tITONotificationWorker$getNotificationBuilder$1.L$0 = str9;
                tITONotificationWorker$getNotificationBuilder$1.L$1 = pendingIntentCreateCancelPendingIntent;
                tITONotificationWorker$getNotificationBuilder$1.L$2 = strO;
                tITONotificationWorker$getNotificationBuilder$1.L$3 = pendingIntent;
                tITONotificationWorker$getNotificationBuilder$1.L$4 = remoteViews4;
                tITONotificationWorker$getNotificationBuilder$1.J$0 = j4;
                tITONotificationWorker$getNotificationBuilder$1.I$0 = color;
                tITONotificationWorker$getNotificationBuilder$1.I$1 = i3;
                i4 = 1;
                tITONotificationWorker$getNotificationBuilder$1.label = 1;
                objB = g().b(StringEnum.DROP_OFF_NOTIF_TITLE, new Object[0], tITONotificationWorker$getNotificationBuilder$1);
                if (objB != coroutineSingletons) {
                    str4 = strO;
                    pendingIntent4 = pendingIntentCreateCancelPendingIntent;
                    remoteViews2 = remoteViews4;
                    str5 = (String) objB;
                    if (j4 > j2) {
                        StringProvider stringProviderG = g();
                        StringEnum stringEnum = StringEnum.TITO_NOTIF_ETA;
                        Object[] objArr = new Object[i4];
                        objArr[0] = str4;
                        tITONotificationWorker$getNotificationBuilder$1.L$0 = str9;
                        tITONotificationWorker$getNotificationBuilder$1.L$1 = pendingIntent4;
                        tITONotificationWorker$getNotificationBuilder$1.L$2 = pendingIntent;
                        tITONotificationWorker$getNotificationBuilder$1.L$3 = objB;
                        tITONotificationWorker$getNotificationBuilder$1.L$4 = str5;
                        tITONotificationWorker$getNotificationBuilder$1.L$5 = remoteViews2;
                        tITONotificationWorker$getNotificationBuilder$1.I$0 = color;
                        tITONotificationWorker$getNotificationBuilder$1.I$1 = i3;
                        tITONotificationWorker$getNotificationBuilder$1.label = 2;
                        objB2 = stringProviderG.b(stringEnum, objArr, tITONotificationWorker$getNotificationBuilder$1);
                        if (objB2 != coroutineSingletons) {
                            str6 = str9;
                            remoteViews3 = remoteViews2;
                            i5 = color;
                            pendingIntent5 = pendingIntent;
                            i6 = i3;
                            obj = objB;
                            obj3 = objB2;
                            Objects.toString(obj3);
                            i3 = i6;
                            remoteViews2 = remoteViews3;
                            str9 = str6;
                            objB = obj;
                            pendingIntent = pendingIntent5;
                            color = i5;
                        }
                    }
                    remoteViews2.setTextViewText(i3, (CharSequence) objB);
                }
            } else {
                int i9 = R.id.notif_title;
                tITONotificationWorker$getNotificationBuilder$1.L$0 = str9;
                tITONotificationWorker$getNotificationBuilder$1.L$1 = pendingIntentCreateCancelPendingIntent;
                tITONotificationWorker$getNotificationBuilder$1.L$2 = strO;
                tITONotificationWorker$getNotificationBuilder$1.L$3 = pendingIntent;
                tITONotificationWorker$getNotificationBuilder$1.L$4 = remoteViews4;
                tITONotificationWorker$getNotificationBuilder$1.J$0 = j4;
                tITONotificationWorker$getNotificationBuilder$1.I$0 = color;
                tITONotificationWorker$getNotificationBuilder$1.I$1 = i9;
                tITONotificationWorker$getNotificationBuilder$1.label = 3;
                Object objB4 = g().b(StringEnum.LIVE_ETA_NOTIF_TITLE, new Object[0], tITONotificationWorker$getNotificationBuilder$1);
                if (objB4 != coroutineSingletons) {
                    j3 = j4;
                    i = color;
                    pendingIntent2 = pendingIntent;
                    remoteViews = remoteViews4;
                    pendingIntent3 = pendingIntentCreateCancelPendingIntent;
                    obj3 = objB4;
                    str3 = str9;
                    i2 = i9;
                    str7 = (String) obj3;
                    if (j3 > j2) {
                        tITONotificationWorker$getNotificationBuilder$1.L$0 = str3;
                        tITONotificationWorker$getNotificationBuilder$1.L$1 = pendingIntent3;
                        tITONotificationWorker$getNotificationBuilder$1.L$2 = pendingIntent2;
                        tITONotificationWorker$getNotificationBuilder$1.L$3 = obj3;
                        tITONotificationWorker$getNotificationBuilder$1.L$4 = str7;
                        tITONotificationWorker$getNotificationBuilder$1.L$5 = remoteViews;
                        tITONotificationWorker$getNotificationBuilder$1.I$0 = i;
                        tITONotificationWorker$getNotificationBuilder$1.I$1 = i2;
                        tITONotificationWorker$getNotificationBuilder$1.label = 4;
                        objB3 = g().b(StringEnum.TITO_NOTIF_ETA, new Object[]{strO}, tITONotificationWorker$getNotificationBuilder$1);
                        if (objB3 != coroutineSingletons) {
                            obj2 = obj3;
                            pendingIntent4 = pendingIntent3;
                            str8 = str3;
                            obj3 = objB3;
                            Objects.toString(obj3);
                            str3 = str8;
                            obj3 = obj2;
                        }
                    } else {
                        pendingIntent4 = pendingIntent3;
                    }
                    pendingIntent = pendingIntent2;
                    color = i;
                    remoteViews.setTextViewText(i2, (CharSequence) obj3);
                    str9 = str3;
                }
            }
            return coroutineSingletons;
        }
        if (i8 == 1) {
            j2 = 0;
            int i10 = tITONotificationWorker$getNotificationBuilder$1.I$1;
            int i11 = tITONotificationWorker$getNotificationBuilder$1.I$0;
            long j5 = tITONotificationWorker$getNotificationBuilder$1.J$0;
            RemoteViews remoteViews5 = (RemoteViews) tITONotificationWorker$getNotificationBuilder$1.L$4;
            pendingIntent = (PendingIntent) tITONotificationWorker$getNotificationBuilder$1.L$3;
            String str10 = (String) tITONotificationWorker$getNotificationBuilder$1.L$2;
            PendingIntent pendingIntent6 = (PendingIntent) tITONotificationWorker$getNotificationBuilder$1.L$1;
            String str11 = (String) tITONotificationWorker$getNotificationBuilder$1.L$0;
            ResultKt.b(obj3);
            str4 = str10;
            i3 = i10;
            str9 = str11;
            i4 = 1;
            color = i11;
            pendingIntent4 = pendingIntent6;
            objB = obj3;
            remoteViews2 = remoteViews5;
            j4 = j5;
            str5 = (String) objB;
            if (j4 > j2) {
                StringProvider stringProviderG2 = g();
                StringEnum stringEnum2 = StringEnum.TITO_NOTIF_ETA;
                Object[] objArr2 = new Object[i4];
                objArr2[0] = str4;
                tITONotificationWorker$getNotificationBuilder$1.L$0 = str9;
                tITONotificationWorker$getNotificationBuilder$1.L$1 = pendingIntent4;
                tITONotificationWorker$getNotificationBuilder$1.L$2 = pendingIntent;
                tITONotificationWorker$getNotificationBuilder$1.L$3 = objB;
                tITONotificationWorker$getNotificationBuilder$1.L$4 = str5;
                tITONotificationWorker$getNotificationBuilder$1.L$5 = remoteViews2;
                tITONotificationWorker$getNotificationBuilder$1.I$0 = color;
                tITONotificationWorker$getNotificationBuilder$1.I$1 = i3;
                tITONotificationWorker$getNotificationBuilder$1.label = 2;
                objB2 = stringProviderG2.b(stringEnum2, objArr2, tITONotificationWorker$getNotificationBuilder$1);
                if (objB2 != coroutineSingletons) {
                    str6 = str9;
                    remoteViews3 = remoteViews2;
                    i5 = color;
                    pendingIntent5 = pendingIntent;
                    i6 = i3;
                    obj = objB;
                    obj3 = objB2;
                }
                return coroutineSingletons;
            }
            remoteViews2.setTextViewText(i3, (CharSequence) objB);
        } else if (i8 != 2) {
            if (i8 == 3) {
                i2 = tITONotificationWorker$getNotificationBuilder$1.I$1;
                i = tITONotificationWorker$getNotificationBuilder$1.I$0;
                j3 = tITONotificationWorker$getNotificationBuilder$1.J$0;
                remoteViews = (RemoteViews) tITONotificationWorker$getNotificationBuilder$1.L$4;
                pendingIntent2 = (PendingIntent) tITONotificationWorker$getNotificationBuilder$1.L$3;
                j2 = 0;
                strO = (String) tITONotificationWorker$getNotificationBuilder$1.L$2;
                pendingIntent3 = (PendingIntent) tITONotificationWorker$getNotificationBuilder$1.L$1;
                str3 = (String) tITONotificationWorker$getNotificationBuilder$1.L$0;
                ResultKt.b(obj3);
                str7 = (String) obj3;
                if (j3 > j2) {
                    tITONotificationWorker$getNotificationBuilder$1.L$0 = str3;
                    tITONotificationWorker$getNotificationBuilder$1.L$1 = pendingIntent3;
                    tITONotificationWorker$getNotificationBuilder$1.L$2 = pendingIntent2;
                    tITONotificationWorker$getNotificationBuilder$1.L$3 = obj3;
                    tITONotificationWorker$getNotificationBuilder$1.L$4 = str7;
                    tITONotificationWorker$getNotificationBuilder$1.L$5 = remoteViews;
                    tITONotificationWorker$getNotificationBuilder$1.I$0 = i;
                    tITONotificationWorker$getNotificationBuilder$1.I$1 = i2;
                    tITONotificationWorker$getNotificationBuilder$1.label = 4;
                    objB3 = g().b(StringEnum.TITO_NOTIF_ETA, new Object[]{strO}, tITONotificationWorker$getNotificationBuilder$1);
                    if (objB3 != coroutineSingletons) {
                        obj2 = obj3;
                        pendingIntent4 = pendingIntent3;
                        str8 = str3;
                        obj3 = objB3;
                    }
                    return coroutineSingletons;
                }
                pendingIntent4 = pendingIntent3;
                pendingIntent = pendingIntent2;
                color = i;
                remoteViews.setTextViewText(i2, (CharSequence) obj3);
                str9 = str3;
            } else {
                if (i8 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = tITONotificationWorker$getNotificationBuilder$1.I$1;
                i = tITONotificationWorker$getNotificationBuilder$1.I$0;
                remoteViews = (RemoteViews) tITONotificationWorker$getNotificationBuilder$1.L$5;
                obj2 = tITONotificationWorker$getNotificationBuilder$1.L$3;
                pendingIntent2 = (PendingIntent) tITONotificationWorker$getNotificationBuilder$1.L$2;
                pendingIntent4 = (PendingIntent) tITONotificationWorker$getNotificationBuilder$1.L$1;
                str8 = (String) tITONotificationWorker$getNotificationBuilder$1.L$0;
                ResultKt.b(obj3);
            }
            Objects.toString(obj3);
            str3 = str8;
            obj3 = obj2;
            pendingIntent = pendingIntent2;
            color = i;
            remoteViews.setTextViewText(i2, (CharSequence) obj3);
            str9 = str3;
        } else {
            i6 = tITONotificationWorker$getNotificationBuilder$1.I$1;
            i5 = tITONotificationWorker$getNotificationBuilder$1.I$0;
            remoteViews3 = (RemoteViews) tITONotificationWorker$getNotificationBuilder$1.L$5;
            obj = tITONotificationWorker$getNotificationBuilder$1.L$3;
            pendingIntent5 = (PendingIntent) tITONotificationWorker$getNotificationBuilder$1.L$2;
            pendingIntent4 = (PendingIntent) tITONotificationWorker$getNotificationBuilder$1.L$1;
            str6 = (String) tITONotificationWorker$getNotificationBuilder$1.L$0;
            ResultKt.b(obj3);
        }
        Objects.toString(obj3);
        i3 = i6;
        remoteViews2 = remoteViews3;
        str9 = str6;
        objB = obj;
        pendingIntent = pendingIntent5;
        color = i5;
        remoteViews2.setTextViewText(i3, (CharSequence) objB);
        k();
        remoteViews4.setTextViewText(R.id.notif_desc, str9);
        NotificationCompat.Builder builderAddAction = new NotificationCompat.Builder(getApplicationContext(), "LiveEta").setSmallIcon(R.drawable.logo_notification).setColor(color).setOngoing(true).setOnlyAlertOnce(true).setAutoCancel(false).setStyle(new NotificationCompat.DecoratedCustomViewStyle()).setContentIntent(pendingIntent).setCustomContentView(remoteViews4).setCustomBigContentView(remoteViews4).addAction(R.drawable.close_icon, "View Details", pendingIntent).addAction(R.drawable.close_icon, "Dismiss", pendingIntent4);
        Intrinsics.h(builderAddAction, "addAction(...)");
        return builderAddAction;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final StringProvider g() {
        return (StringProvider) this.i.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // androidx.work.CoroutineWorker
    public final Object getForegroundInfo(Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objF = anonymousClass2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            anonymousClass2.label = 1;
            objF = f(false, "", 0L, "", anonymousClass2);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        return new ForegroundInfo(1111, ((NotificationCompat.Builder) objF).build());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x018c  */
    /* JADX WARN: Code duplicated, block: B:47:0x020d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0211  */
    /* JADX WARN: Code duplicated, block: B:51:0x021c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0237  */
    /* JADX WARN: Code duplicated, block: B:61:0x023f  */
    /* JADX WARN: Code duplicated, block: B:64:0x024a  */
    /* JADX WARN: Code duplicated, block: B:67:0x027c  */
    /* JADX WARN: Code duplicated, block: B:71:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:75:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x02ea -> B:76:0x02f0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(java.lang.String r21, java.lang.String r22, java.lang.String r23, long r24, java.lang.String r26, java.lang.String r27, app.chalo.tito.data.model.TITONotificationJobConfig r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.workers.TITONotificationWorker.h(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, app.chalo.tito.data.model.TITONotificationJobConfig, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:116:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x025e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0293  */
    /* JADX WARN: Code duplicated, block: B:53:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0492 -> B:14:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x025e -> B:47:0x026b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(java.lang.String r22, java.lang.String r23, java.lang.String r24, long r25, java.lang.String r27, java.lang.String r28, app.chalo.tito.data.model.TITONotificationJobConfig r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instruction units count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.workers.TITONotificationWorker.i(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, app.chalo.tito.data.model.TITONotificationJobConfig, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void j(String str, String str2, String str3, NotificationCompat.Builder builder) {
        int i = R.id.notif_title;
        RemoteViews remoteViews = this.l;
        remoteViews.setTextViewText(i, str);
        k();
        remoteViews.setTextViewText(R.id.notif_desc, str3);
        Bundle bundle = new Bundle();
        bundle.putString("notifType", str2);
        builder.setExtras(bundle);
        this.b.notify(1111, builder.build());
    }

    public final void k() {
        Object systemService = getApplicationContext().getSystemService("uimode");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        int nightMode = ((UiModeManager) systemService).getNightMode();
        RemoteViews remoteViews = this.l;
        if (nightMode == 2) {
            remoteViews.setTextColor(R.id.notif_title, ContextCompat.getColor(getApplicationContext(), R.color.home_screen_bg));
            remoteViews.setTextColor(R.id.notif_desc, ContextCompat.getColor(getApplicationContext(), R.color.trip_detail_top_note_divider));
        } else {
            remoteViews.setTextColor(R.id.notif_title, ContextCompat.getColor(getApplicationContext(), R.color.black));
            remoteViews.setTextColor(R.id.notif_desc, ContextCompat.getColor(getApplicationContext(), R.color.strikethrough_font_color));
        }
    }
}
