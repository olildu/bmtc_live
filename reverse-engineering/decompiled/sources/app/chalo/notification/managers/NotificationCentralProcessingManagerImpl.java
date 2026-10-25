package app.chalo.notification.managers;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.extensions.AnyExtsKt;
import app.chalo.features.wallet.WalletSyncHelper;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.ondc.domain.FetchAndStoreOndcMetroTicketUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.superpass.data.models.entities.SuperPassTripReceipt;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.utils.MobileTicketingConverters;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/managers/NotificationCentralProcessingManagerImpl;", "Lapp/chalo/notification/managers/NotificationCentralProcessingManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationCentralProcessingManagerImpl implements NotificationCentralProcessingManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductsSyncContract f6529a;
    public final WalletSyncHelper b;
    public final UserProfileDetailsProvider c;
    public final MTicketUtilsHelper d;
    public final FetchAndStoreOndcMetroTicketUseCase e;
    public final AnalyticsContract f;
    public final BasicInfoContract g;
    public final TimeUtilsContract h;
    public final CrashlyticsLogger i;

    public NotificationCentralProcessingManagerImpl(ProductsSyncContract productsSyncContract, WalletSyncHelper walletSyncHelper, UserProfileDetailsProvider userProfileDetailsProvider, MTicketUtilsHelper mTicketUtilsHelper, MobileTicketingConverters mobileTicketingConverters, FetchAndStoreOndcMetroTicketUseCase fetchAndStoreOndcMetroTicketUseCase, AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract, CrashlyticsLogger crashlyticsLogger) {
        this.f6529a = productsSyncContract;
        this.b = walletSyncHelper;
        this.c = userProfileDetailsProvider;
        this.d = mTicketUtilsHelper;
        this.e = fetchAndStoreOndcMetroTicketUseCase;
        this.f = analyticsContract;
        this.g = basicInfoContract;
        this.h = timeUtilsContract;
        this.i = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a6 A[Catch: Exception -> 0x005d, CancellationException -> 0x0061, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0061, Exception -> 0x005d, blocks: (B:24:0x0058, B:117:0x01b6, B:114:0x01a6), top: B:172:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b6 A[Catch: Exception -> 0x005d, CancellationException -> 0x0061, PHI: r13
      0x01b6: PHI (r13v50 java.lang.Object) = (r13v47 java.lang.Object), (r13v1 java.lang.Object) binds: [B:115:0x01b2, B:24:0x0058] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0061, Exception -> 0x005d, blocks: (B:24:0x0058, B:117:0x01b6, B:114:0x01a6), top: B:172:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:159:0x0240  */
    /* JADX WARN: Code duplicated, block: B:160:0x0241 A[DONT_INVERT, PHI: r12
      0x0241: PHI (r12v48 app.chalo.models.mticketing.MTicketTripReceipt) = (r12v45 app.chalo.models.mticketing.MTicketTripReceipt), (r12v51 app.chalo.models.mticketing.MTicketTripReceipt) binds: [B:158:0x023e, B:17:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:161:0x0243 A[Catch: SerializationException -> 0x003a, TRY_LEAVE, TryCatch #3 {SerializationException -> 0x003a, blocks: (B:12:0x0036, B:17:0x0042, B:161:0x0243, B:20:0x004f, B:157:0x0232, B:154:0x020a), top: B:172:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:163:0x024f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x0121  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d0, code lost:
    
        if (r11.b.b(r1) == r2) goto L163;
     */
    @Override // app.chalo.notification.managers.NotificationCentralProcessingManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.notification.models.AppNotification r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.notification.managers.NotificationCentralProcessingManagerImpl.a(app.chalo.notification.models.AppNotification, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        NotificationCentralProcessingManagerImpl$currentUserId$1 notificationCentralProcessingManagerImpl$currentUserId$1;
        if (continuationImpl instanceof NotificationCentralProcessingManagerImpl$currentUserId$1) {
            notificationCentralProcessingManagerImpl$currentUserId$1 = (NotificationCentralProcessingManagerImpl$currentUserId$1) continuationImpl;
            int i = notificationCentralProcessingManagerImpl$currentUserId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationCentralProcessingManagerImpl$currentUserId$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationCentralProcessingManagerImpl$currentUserId$1 = new NotificationCentralProcessingManagerImpl$currentUserId$1(this, continuationImpl);
            }
        } else {
            notificationCentralProcessingManagerImpl$currentUserId$1 = new NotificationCentralProcessingManagerImpl$currentUserId$1(this, continuationImpl);
        }
        Object objC = notificationCentralProcessingManagerImpl$currentUserId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationCentralProcessingManagerImpl$currentUserId$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                NotificationCentralProcessingManagerImpl$currentUserId$2 notificationCentralProcessingManagerImpl$currentUserId$2 = new NotificationCentralProcessingManagerImpl$currentUserId$2(this, null);
                notificationCentralProcessingManagerImpl$currentUserId$1.label = 1;
                objC = TimeoutKt.c(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, notificationCentralProcessingManagerImpl$currentUserId$2, notificationCentralProcessingManagerImpl$currentUserId$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
            }
            return (String) objC;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ContinuationImpl continuationImpl) {
        NotificationCentralProcessingManagerImpl$isLoggedIn$1 notificationCentralProcessingManagerImpl$isLoggedIn$1;
        if (continuationImpl instanceof NotificationCentralProcessingManagerImpl$isLoggedIn$1) {
            notificationCentralProcessingManagerImpl$isLoggedIn$1 = (NotificationCentralProcessingManagerImpl$isLoggedIn$1) continuationImpl;
            int i = notificationCentralProcessingManagerImpl$isLoggedIn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationCentralProcessingManagerImpl$isLoggedIn$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationCentralProcessingManagerImpl$isLoggedIn$1 = new NotificationCentralProcessingManagerImpl$isLoggedIn$1(this, continuationImpl);
            }
        } else {
            notificationCentralProcessingManagerImpl$isLoggedIn$1 = new NotificationCentralProcessingManagerImpl$isLoggedIn$1(this, continuationImpl);
        }
        Object objB = notificationCentralProcessingManagerImpl$isLoggedIn$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationCentralProcessingManagerImpl$isLoggedIn$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            notificationCentralProcessingManagerImpl$isLoggedIn$1.label = 1;
            objB = b(notificationCentralProcessingManagerImpl$isLoggedIn$1);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return Boolean.valueOf(AnyExtsKt.a((String) objB));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(MTicketTripReceipt mTicketTripReceipt, ContinuationImpl continuationImpl) {
        NotificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1 notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1;
        AnalyticsContract analyticsContract;
        Object objC;
        Map map;
        Map map2;
        if (continuationImpl instanceof NotificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1) {
            notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1 = (NotificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1) continuationImpl;
            int i = notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1 = new NotificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1(this, continuationImpl);
            }
        } else {
            notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1 = new NotificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1(this, continuationImpl);
        }
        Object obj = notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
            MixpanelUtil.b(linkedHashMap, mTicketTripReceipt);
            notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1.L$0 = mTicketTripReceipt;
            analyticsContract = this.f;
            notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1.L$1 = analyticsContract;
            notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1.L$2 = linkedHashMap;
            notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1.L$3 = linkedHashMap;
            notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1.label = 1;
            objC = this.g.c(notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            map = linkedHashMap;
            map2 = linkedHashMap;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map3 = (Map) notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1.L$3;
            Map map4 = (Map) notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1.L$2;
            analyticsContract = (AnalyticsContract) notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1.L$1;
            MTicketTripReceipt mTicketTripReceipt2 = (MTicketTripReceipt) notificationCentralProcessingManagerImpl$raiseMTicketPunchNotificationReceivedEvent$1.L$0;
            ResultKt.b(obj);
            map2 = map3;
            mTicketTripReceipt = mTicketTripReceipt2;
            objC = obj;
            map = map4;
        }
        AnalyticsContract analyticsContract2 = analyticsContract;
        map2.put("punch notification delay", new Long(((Number) objC).longValue() - mTicketTripReceipt.c));
        AnalyticsContractImplKt.b(analyticsContract2, "mTicket punch notification received", Source.NOTIFICATION, map, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(SuperPassTripReceipt superPassTripReceipt, ContinuationImpl continuationImpl) {
        NotificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1 notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1;
        Map mapO;
        Object objC;
        if (continuationImpl instanceof NotificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1) {
            notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1 = (NotificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1) continuationImpl;
            int i = notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1 = new NotificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1(this, continuationImpl);
            }
        } else {
            notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1 = new NotificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1(this, continuationImpl);
        }
        Object obj = notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1.label;
        if (i2 == 0) {
            mapO = d.o(obj);
            if (superPassTripReceipt == null || superPassTripReceipt.e == -1) {
                mapO.put("isTripReceiptAvailable", Boolean.FALSE);
            } else {
                mapO.put("isTripReceiptAvailable", Boolean.TRUE);
            }
            if (superPassTripReceipt != null) {
                mapO.put("passId", superPassTripReceipt.f9577a);
                mapO.put("productSubType", superPassTripReceipt.c);
                mapO.put("productType", superPassTripReceipt.b);
                mapO.put("route name", superPassTripReceipt.j);
                mapO.put("startStop", superPassTripReceipt.h);
                mapO.put("endStop", superPassTripReceipt.i);
                mapO.put("conductorId", superPassTripReceipt.g);
                long j = superPassTripReceipt.d;
                TimeUtilsContract timeUtilsContract = this.h;
                mapO.put("activationTime", timeUtilsContract.x(j));
                mapO.put("punchTime", timeUtilsContract.x(superPassTripReceipt.e));
                mapO.put("vehicleNo", superPassTripReceipt.f);
            }
            if (superPassTripReceipt != null && superPassTripReceipt.e != -1) {
                notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1.L$0 = superPassTripReceipt;
                notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1.L$1 = mapO;
                notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1.label = 1;
                objC = this.g.c(notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Source source = Source.NOTIFICATION;
            AnalyticsContractImplKt.b(this.f, "superPass punch notification received", source, mapO, false, 24);
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Map map = (Map) notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1.L$1;
        SuperPassTripReceipt superPassTripReceipt2 = (SuperPassTripReceipt) notificationCentralProcessingManagerImpl$raiseSuperPassPunchNotificationReceivedEvent$1.L$0;
        ResultKt.b(obj);
        mapO = map;
        superPassTripReceipt = superPassTripReceipt2;
        objC = obj;
        mapO.put("punch notification delay", new Long(((Number) objC).longValue() - superPassTripReceipt.e));
        Source source2 = Source.NOTIFICATION;
        AnalyticsContractImplKt.b(this.f, "superPass punch notification received", source2, mapO, false, 24);
        return Unit.f17538a;
    }
}
