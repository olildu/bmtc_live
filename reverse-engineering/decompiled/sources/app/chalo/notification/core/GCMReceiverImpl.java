package app.chalo.notification.core;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.features.freshchat.FreshChatInitManager;
import app.chalo.notification.models.AppNotification;
import app.chalo.notification.models.InstantTicketReceiptNotificationEvent;
import app.chalo.notification.models.OndcCancellationState;
import app.chalo.notification.models.SuperPassPunchEvent;
import app.chalo.notification.models.TITOTapInNotificationEvent;
import app.chalo.notification.models.TITOTapOutNotificationEvent;
import app.chalo.plotline.PlotlineNotificationManager;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.thoughtnudge.ThoughtNudgeNotificationManager;
import com.mmk.kmpnotifier.di.LibDependencyInitializer;
import com.mmk.kmpnotifier.notification.NotifierManager;
import com.mmk.kmpnotifier.notification.NotifierManagerImpl;
import com.mmk.kmpnotifier.notification.PushNotifier;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/notification/core/GCMReceiverImpl;", "Lapp/chalo/notification/core/GCMReceiver;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GCMReceiverImpl implements GCMReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GCMReceiverDelegate f6525a;
    public final AnalyticsContract b;
    public final FreshChatInitManager c;
    public final PlotlineNotificationManager d;
    public final ThoughtNudgeNotificationManager e;
    public final Lazy f;
    public final Lazy g;
    public final ContextScope h;
    public final SharedFlowImpl i = SharedFlowKt.b(0, 0, null, 7);
    public final MutableStateFlow j;
    public final StateFlow k;
    public PushNotifier l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/notification/core/GCMReceiverImpl$Companion;", "", "", "NOTIFICATION_TYPE", "Ljava/lang/String;", "NOTIFICATION_PAYLOAD_META_DATA", "", "FCM_TOKEN_TIMEOUT", "J", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public GCMReceiverImpl(GCMReceiverDelegate gCMReceiverDelegate, AnalyticsContract analyticsContract, AppNotificationResolverUseCase appNotificationResolverUseCase, Lazy lazy, Lazy lazy2, CoroutineContextProvider coroutineContextProvider, FreshChatInitManager freshChatInitManager, PlotlineNotificationManager plotlineNotificationManager, ThoughtNudgeNotificationManager thoughtNudgeNotificationManager) {
        this.f6525a = gCMReceiverDelegate;
        this.b = analyticsContract;
        this.c = freshChatInitManager;
        this.d = plotlineNotificationManager;
        this.e = thoughtNudgeNotificationManager;
        this.f = lazy;
        this.g = lazy2;
        this.h = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.d((JobSupport) SupervisorKt.b(), coroutineContextProvider.b()));
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.j = mutableStateFlowA;
        this.k = FlowKt.c(mutableStateFlowA);
        NotifierManager.Listener listener = new NotifierManager.Listener() { // from class: app.chalo.notification.core.GCMReceiverImpl.1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:298:0x060f  */
            /* JADX WARN: Code duplicated, block: B:309:0x064a A[Catch: Exception -> 0x065d, TRY_LEAVE, TryCatch #0 {Exception -> 0x065d, blocks: (B:307:0x0640, B:309:0x064a), top: B:327:0x0640 }] */
            /* JADX WARN: Code duplicated, block: B:322:0x0691 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:327:0x0640 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:335:0x0601 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:343:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            @Override // com.mmk.kmpnotifier.notification.NotifierManager.Listener
            public final void b(String str, String str2, Map map) {
                String string;
                String string2;
                String string3;
                String string4;
                NotificationType next;
                String str3;
                String str4;
                Map map2;
                GCMReceiverImpl gCMReceiverImpl;
                char c;
                AppNotification bookingSuccessfulEvent;
                String strA;
                String strA2;
                AppNotification chaloCardTransactionNotificationEvent;
                String str5;
                String str6;
                GCMReceiverImpl gCMReceiverImpl2;
                OndcCancellationState ondcCancellationState;
                String string5;
                OndcCancellationState next2;
                AppNotification ondcMetroPunchEvent;
                String strA3;
                String strA4;
                String strA5;
                String string6;
                Long lT0;
                String strA6;
                String strA7;
                String string7;
                Long lT1;
                String str7;
                String strA8;
                String strA9;
                String strA10;
                String strA11;
                String strA12;
                String strA13;
                String strA14;
                String strA15;
                String str8;
                Long lValueOf;
                String strA16;
                String strA17;
                String strA18;
                String strA19;
                String strA20;
                String strA21;
                String strA22;
                String strA23;
                String strA24;
                String strA25;
                String strA26;
                String strA27;
                boolean zC;
                PlotlineNotificationManager plotlineNotificationManager2;
                AnalyticsContract analyticsContract2;
                AnalyticsContract analyticsContract3;
                LinkedHashMap linkedHashMapD;
                boolean zB;
                Map mapA;
                ThoughtNudgeNotificationManager thoughtNudgeNotificationManager2;
                AnalyticsContract analyticsContract4;
                AnalyticsContract analyticsContract5;
                boolean zC2;
                Map mapA2;
                GCMReceiverImpl gCMReceiverImpl3 = GCMReceiverImpl.this;
                AnalyticsContract analyticsContract6 = gCMReceiverImpl3.b;
                Object obj = map.get("gcm.notification.title");
                if (obj == null || (string = obj.toString()) == null) {
                    string = str == null ? "" : str;
                }
                Pair pair = new Pair("notificationTitle", string);
                Object obj2 = map.get("gcm.notification.message");
                if (obj2 == null || (string2 = obj2.toString()) == null) {
                    string2 = "";
                }
                Pair pair2 = new Pair("notificationMessage", string2);
                Object obj3 = map.get("gcm.notification.body");
                if (obj3 == null || (string3 = obj3.toString()) == null) {
                    string3 = str2 == null ? "" : str2;
                }
                Pair pair3 = new Pair("notificationBody", string3);
                Object obj4 = map.get("notification_type");
                if (obj4 == null || (string4 = obj4.toString()) == null) {
                    string4 = "";
                }
                AnalyticsContract.DefaultImpls.a(analyticsContract6, "FCM Notification Received", "", MapsKt.i(pair, pair2, pair3, new Pair("notificationType", string4), new Pair("notificationData", map.toString())), null, false, 8);
                Object obj5 = map.get("notification_type");
                String str9 = obj5 instanceof String ? (String) obj5 : null;
                if (str9 == null) {
                    str3 = str;
                    map2 = map;
                    gCMReceiverImpl = gCMReceiverImpl3;
                    c = 1;
                    str4 = str2;
                } else {
                    AnalyticsContractImplKt.b(analyticsContract6, "custom notification", Source.NONE, vo1.s("notification type", str9), false, 24);
                    NotificationType.INSTANCE.getClass();
                    Iterator<NotificationType> it = NotificationType.getEntries().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!StringsKt.x(next.name(), str9, true));
                    NotificationType notificationType = next;
                    if (notificationType == null) {
                        str3 = str;
                        str4 = str2;
                        map2 = map;
                        gCMReceiverImpl = gCMReceiverImpl3;
                        c = 1;
                    } else {
                        long jLongValue = -1;
                        long j = 0;
                        switch (AppNotificationResolverUseCase.WhenMappings.f6523a[notificationType.ordinal()]) {
                            case 1:
                            case 2:
                            case 5:
                            case 6:
                            case 20:
                            case 21:
                            case 24:
                            case 25:
                            case 26:
                            case 29:
                            case 32:
                                str3 = str;
                                str4 = str2;
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                c = 1;
                                break;
                            case 3:
                                str3 = str;
                                str4 = str2;
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                c = 1;
                                String strA28 = AppNotificationResolverUseCase.a("bookingId", map2);
                                if (strA28 != null && (strA = AppNotificationResolverUseCase.a("productType", map2)) != null && (strA2 = AppNotificationResolverUseCase.a("productSubType", map2)) != null) {
                                    bookingSuccessfulEvent = new AppNotification.BookingSuccessfulEvent(str3, str4, strA28, strA, strA2);
                                    chaloCardTransactionNotificationEvent = bookingSuccessfulEvent;
                                    gCMReceiverImpl2 = gCMReceiverImpl;
                                }
                                zC = gCMReceiverImpl2.c.c(map2);
                                plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                analyticsContract2 = plotlineNotificationManager2.f6841a;
                                if (plotlineNotificationManager2.b.f1078a.b) {
                                    try {
                                        linkedHashMapD = PlotlineNotificationManager.d(map2);
                                        zB = plotlineNotificationManager2.b(map2);
                                        mapA = PlotlineNotificationManager.a(str3, map2);
                                        if (zB) {
                                            analyticsContract3 = analyticsContract2;
                                            try {
                                                AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                                plotlineNotificationManager2.f(linkedHashMapD);
                                            } catch (Exception unused) {
                                                AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Exception", "", null, null, false, 12);
                                            }
                                        }
                                    } catch (Exception unused2) {
                                        analyticsContract3 = analyticsContract2;
                                    }
                                    break;
                                }
                                thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                    try {
                                        zC2 = thoughtNudgeNotificationManager2.c(map2);
                                        mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                        if (zC2) {
                                            analyticsContract5 = analyticsContract4;
                                            try {
                                                AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                                thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                            } catch (Exception e) {
                                                e = e;
                                                Source source = Source.SOURCE_NOTIFICATION;
                                                String message = e.getMessage();
                                                if (message == null) {
                                                    message = "No exception message";
                                                }
                                                Pair pair4 = new Pair("attribute error reason", message);
                                                Pair pair5 = new Pair("flowType", "ThoughtNudgeNotificationManager");
                                                Pair[] pairArr = new Pair[2];
                                                pairArr[0] = pair4;
                                                pairArr[c] = pair5;
                                                AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Exception", source, MapsKt.i(pairArr), false, 8);
                                            }
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        analyticsContract5 = analyticsContract4;
                                    }
                                    break;
                                }
                                if (!zC || chaloCardTransactionNotificationEvent == null) {
                                }
                                BuildersKt.d(gCMReceiverImpl2.h, null, null, new GCMReceiverImpl$1$onPushNotificationWithPayloadData$1(gCMReceiverImpl2, chaloCardTransactionNotificationEvent, null), 3);
                                return;
                            case 4:
                                str3 = str;
                                str4 = str2;
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                c = 1;
                                chaloCardTransactionNotificationEvent = new AppNotification.ChaloCardTransactionNotificationEvent(str3, str4, AppNotificationResolverUseCase.a("cardInfo", map2));
                                gCMReceiverImpl2 = gCMReceiverImpl;
                                zC = gCMReceiverImpl2.c.c(map2);
                                plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                analyticsContract2 = plotlineNotificationManager2.f6841a;
                                if (plotlineNotificationManager2.b.f1078a.b) {
                                    linkedHashMapD = PlotlineNotificationManager.d(map2);
                                    zB = plotlineNotificationManager2.b(map2);
                                    mapA = PlotlineNotificationManager.a(str3, map2);
                                    if (zB) {
                                        analyticsContract3 = analyticsContract2;
                                        AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                        plotlineNotificationManager2.f(linkedHashMapD);
                                    }
                                }
                                thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                    zC2 = thoughtNudgeNotificationManager2.c(map2);
                                    mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                    if (zC2) {
                                        analyticsContract5 = analyticsContract4;
                                        AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                        thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                    }
                                }
                                if (zC) {
                                }
                                break;
                            case 7:
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                c = 1;
                                str3 = str;
                                str4 = str2;
                                bookingSuccessfulEvent = new InstantTicketReceiptNotificationEvent(str3, str4, AppNotificationResolverUseCase.a("productType", map2), AppNotificationResolverUseCase.a("productSubType", map2), AppNotificationResolverUseCase.a("bookingId", map2), AppNotificationResolverUseCase.a("receiptInfo", map2));
                                chaloCardTransactionNotificationEvent = bookingSuccessfulEvent;
                                gCMReceiverImpl2 = gCMReceiverImpl;
                                zC = gCMReceiverImpl2.c.c(map2);
                                plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                analyticsContract2 = plotlineNotificationManager2.f6841a;
                                if (plotlineNotificationManager2.b.f1078a.b) {
                                    linkedHashMapD = PlotlineNotificationManager.d(map2);
                                    zB = plotlineNotificationManager2.b(map2);
                                    mapA = PlotlineNotificationManager.a(str3, map2);
                                    if (zB) {
                                        analyticsContract3 = analyticsContract2;
                                        AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                        plotlineNotificationManager2.f(linkedHashMapD);
                                    }
                                }
                                thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                    zC2 = thoughtNudgeNotificationManager2.c(map2);
                                    mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                    if (zC2) {
                                        analyticsContract5 = analyticsContract4;
                                        AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                        thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                    }
                                }
                                if (zC) {
                                }
                                break;
                            case 8:
                                str5 = str;
                                str6 = str2;
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                c = 1;
                                String strA29 = AppNotificationResolverUseCase.a("lastRideInfo", map2);
                                if (strA29 != null) {
                                    chaloCardTransactionNotificationEvent = new AppNotification.PunchNotification.MTicketPunchedEvent(str5, str6, strA29);
                                    str3 = str5;
                                    str4 = str6;
                                    gCMReceiverImpl2 = gCMReceiverImpl;
                                    zC = gCMReceiverImpl2.c.c(map2);
                                    plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                    analyticsContract2 = plotlineNotificationManager2.f6841a;
                                    if (plotlineNotificationManager2.b.f1078a.b) {
                                        linkedHashMapD = PlotlineNotificationManager.d(map2);
                                        zB = plotlineNotificationManager2.b(map2);
                                        mapA = PlotlineNotificationManager.a(str3, map2);
                                        if (zB) {
                                            analyticsContract3 = analyticsContract2;
                                            AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                            plotlineNotificationManager2.f(linkedHashMapD);
                                        }
                                    }
                                    thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                    analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                    if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                        zC2 = thoughtNudgeNotificationManager2.c(map2);
                                        mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                        if (zC2) {
                                            analyticsContract5 = analyticsContract4;
                                            AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                            thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                        }
                                    }
                                    if (zC) {
                                    }
                                }
                                str3 = str5;
                                str4 = str6;
                                break;
                            case 9:
                                str5 = str;
                                str6 = str2;
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                c = 1;
                                String strA30 = AppNotificationResolverUseCase.a("lastRideInfo", map2);
                                if (strA30 != null) {
                                    chaloCardTransactionNotificationEvent = new AppNotification.PunchNotification.MTicketPunchedEvent(str5, str6, strA30);
                                    str3 = str5;
                                    str4 = str6;
                                    gCMReceiverImpl2 = gCMReceiverImpl;
                                    zC = gCMReceiverImpl2.c.c(map2);
                                    plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                    analyticsContract2 = plotlineNotificationManager2.f6841a;
                                    if (plotlineNotificationManager2.b.f1078a.b) {
                                        linkedHashMapD = PlotlineNotificationManager.d(map2);
                                        zB = plotlineNotificationManager2.b(map2);
                                        mapA = PlotlineNotificationManager.a(str3, map2);
                                        if (zB) {
                                            analyticsContract3 = analyticsContract2;
                                            AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                            plotlineNotificationManager2.f(linkedHashMapD);
                                        }
                                    }
                                    thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                    analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                    if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                        zC2 = thoughtNudgeNotificationManager2.c(map2);
                                        mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                        if (zC2) {
                                            analyticsContract5 = analyticsContract4;
                                            AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                            thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                        }
                                    }
                                    if (zC) {
                                    }
                                }
                                str3 = str5;
                                str4 = str6;
                                break;
                            case 10:
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                String strA31 = AppNotificationResolverUseCase.a("userId", map2);
                                String str10 = (strA31 == null || StringsKt.F(strA31)) ? null : strA31;
                                String strA32 = AppNotificationResolverUseCase.a("bookingId", map2);
                                String strA33 = AppNotificationResolverUseCase.a("productType", map2);
                                String strA34 = AppNotificationResolverUseCase.a("productSubType", map2);
                                OndcCancellationState.Companion companion = OndcCancellationState.INSTANCE;
                                String strA35 = AppNotificationResolverUseCase.a("status", map2);
                                companion.getClass();
                                if (strA35 == null || (string5 = StringsKt.u0(strA35).toString()) == null) {
                                    c = 1;
                                    ondcCancellationState = null;
                                } else {
                                    Iterator<OndcCancellationState> it2 = OndcCancellationState.getEntries().iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next2 = it2.next();
                                            c = 1;
                                        } else {
                                            c = 1;
                                            next2 = null;
                                        }
                                        ondcCancellationState = next2;
                                    } while (!StringsKt.x(next2.name(), string5, true));
                                    ondcCancellationState = next2;
                                }
                                str3 = str;
                                str4 = str2;
                                bookingSuccessfulEvent = new AppNotification.OndcMetroTicketCancellationEvent(str3, str4, str10, strA32, strA33, strA34, ondcCancellationState);
                                chaloCardTransactionNotificationEvent = bookingSuccessfulEvent;
                                gCMReceiverImpl2 = gCMReceiverImpl;
                                zC = gCMReceiverImpl2.c.c(map2);
                                plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                analyticsContract2 = plotlineNotificationManager2.f6841a;
                                if (plotlineNotificationManager2.b.f1078a.b) {
                                    linkedHashMapD = PlotlineNotificationManager.d(map2);
                                    zB = plotlineNotificationManager2.b(map2);
                                    mapA = PlotlineNotificationManager.a(str3, map2);
                                    if (zB) {
                                        analyticsContract3 = analyticsContract2;
                                        AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                        plotlineNotificationManager2.f(linkedHashMapD);
                                    }
                                }
                                thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                    zC2 = thoughtNudgeNotificationManager2.c(map2);
                                    mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                    if (zC2) {
                                        analyticsContract5 = analyticsContract4;
                                        AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                        thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                    }
                                }
                                if (zC) {
                                }
                                break;
                            case 11:
                                str3 = str;
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                String strA36 = AppNotificationResolverUseCase.a("productSubType", map2);
                                if (!Intrinsics.d(strA36, "ondcTicket")) {
                                    if (Intrinsics.d(strA36, "ondcMetroTicket") && (strA3 = AppNotificationResolverUseCase.a("bookingId", map2)) != null && (strA4 = AppNotificationResolverUseCase.a("productType", map2)) != null && (strA5 = AppNotificationResolverUseCase.a("productSubType", map2)) != null) {
                                        Object obj6 = map2.get("punchTime");
                                        if (obj6 != null && (string6 = obj6.toString()) != null && (lT0 = StringsKt.t0(string6)) != null) {
                                            jLongValue = lT0.longValue();
                                        }
                                        ondcMetroPunchEvent = new AppNotification.PunchNotification.OndcMetroPunchEvent(jLongValue, str, str2, strA3, strA4, strA5, AppNotificationResolverUseCase.a("receiptInfo", map2));
                                    }
                                    str3 = str;
                                    str4 = str2;
                                    c = 1;
                                } else {
                                    String strA37 = AppNotificationResolverUseCase.a("bookingId", map2);
                                    if (strA37 == null || (strA6 = AppNotificationResolverUseCase.a("productType", map2)) == null || (strA7 = AppNotificationResolverUseCase.a("productSubType", map2)) == null) {
                                        str4 = str2;
                                        c = 1;
                                    } else {
                                        Object obj7 = map2.get("punchTime");
                                        if (obj7 != null && (string7 = obj7.toString()) != null && (lT1 = StringsKt.t0(string7)) != null) {
                                            jLongValue = lT1.longValue();
                                        }
                                        ondcMetroPunchEvent = new AppNotification.PunchNotification.OndcTicketPunchEvent(jLongValue, str3, str2, strA37, strA6, strA7, AppNotificationResolverUseCase.a("receiptInfo", map2));
                                    }
                                }
                                str3 = str;
                                str4 = str2;
                                chaloCardTransactionNotificationEvent = ondcMetroPunchEvent;
                                gCMReceiverImpl2 = gCMReceiverImpl;
                                c = 1;
                                zC = gCMReceiverImpl2.c.c(map2);
                                plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                analyticsContract2 = plotlineNotificationManager2.f6841a;
                                if (plotlineNotificationManager2.b.f1078a.b) {
                                    linkedHashMapD = PlotlineNotificationManager.d(map2);
                                    zB = plotlineNotificationManager2.b(map2);
                                    mapA = PlotlineNotificationManager.a(str3, map2);
                                    if (zB) {
                                        analyticsContract3 = analyticsContract2;
                                        AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                        plotlineNotificationManager2.f(linkedHashMapD);
                                    }
                                }
                                thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                    zC2 = thoughtNudgeNotificationManager2.c(map2);
                                    mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                    if (zC2) {
                                        analyticsContract5 = analyticsContract4;
                                        AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                        thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                    }
                                }
                                if (zC) {
                                }
                                break;
                            case 12:
                                str3 = str;
                                str7 = str2;
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                chaloCardTransactionNotificationEvent = new AppNotification.PassUpdate(str3, str7);
                                str4 = str7;
                                gCMReceiverImpl2 = gCMReceiverImpl;
                                c = 1;
                                zC = gCMReceiverImpl2.c.c(map2);
                                plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                analyticsContract2 = plotlineNotificationManager2.f6841a;
                                if (plotlineNotificationManager2.b.f1078a.b) {
                                    linkedHashMapD = PlotlineNotificationManager.d(map2);
                                    zB = plotlineNotificationManager2.b(map2);
                                    mapA = PlotlineNotificationManager.a(str3, map2);
                                    if (zB) {
                                        analyticsContract3 = analyticsContract2;
                                        AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                        plotlineNotificationManager2.f(linkedHashMapD);
                                    }
                                }
                                thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                    zC2 = thoughtNudgeNotificationManager2.c(map2);
                                    mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                    if (zC2) {
                                        analyticsContract5 = analyticsContract4;
                                        AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                        thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                    }
                                }
                                if (zC) {
                                }
                                break;
                            case 13:
                                str3 = str;
                                str7 = str2;
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                chaloCardTransactionNotificationEvent = new AppNotification.PaymentDone(str3, str7, AppNotificationResolverUseCase.a("userProfile", map2), AppNotificationResolverUseCase.a("passInfo", map2));
                                str4 = str7;
                                gCMReceiverImpl2 = gCMReceiverImpl;
                                c = 1;
                                zC = gCMReceiverImpl2.c.c(map2);
                                plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                analyticsContract2 = plotlineNotificationManager2.f6841a;
                                if (plotlineNotificationManager2.b.f1078a.b) {
                                    linkedHashMapD = PlotlineNotificationManager.d(map2);
                                    zB = plotlineNotificationManager2.b(map2);
                                    mapA = PlotlineNotificationManager.a(str3, map2);
                                    if (zB) {
                                        analyticsContract3 = analyticsContract2;
                                        AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                        plotlineNotificationManager2.f(linkedHashMapD);
                                    }
                                }
                                thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                    zC2 = thoughtNudgeNotificationManager2.c(map2);
                                    mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                    if (zC2) {
                                        analyticsContract5 = analyticsContract4;
                                        AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                        thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                    }
                                }
                                if (zC) {
                                }
                                break;
                            case 14:
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                String strA38 = AppNotificationResolverUseCase.a("bookingId", map2);
                                String strA39 = AppNotificationResolverUseCase.a("productType", map2);
                                String strA40 = AppNotificationResolverUseCase.a("productSubType", map2);
                                if (map2.containsKey("punchTime")) {
                                    try {
                                        String strA41 = AppNotificationResolverUseCase.a("punchTime", map2);
                                        if (strA41 != null) {
                                            jLongValue = Long.parseLong(strA41);
                                        }
                                        break;
                                    } catch (Exception unused3) {
                                    }
                                }
                                if (strA38 == null || strA39 == null || strA40 == null) {
                                    str3 = str;
                                    str7 = str2;
                                    chaloCardTransactionNotificationEvent = null;
                                } else {
                                    str7 = str2;
                                    str3 = str;
                                    chaloCardTransactionNotificationEvent = new AppNotification.PunchNotification.PremiumReserveTicketPunchEvent(jLongValue, str, str7, strA38, strA39, strA40, AppNotificationResolverUseCase.a("receiptInfo", map2));
                                }
                                str4 = str7;
                                gCMReceiverImpl2 = gCMReceiverImpl;
                                c = 1;
                                zC = gCMReceiverImpl2.c.c(map2);
                                plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                analyticsContract2 = plotlineNotificationManager2.f6841a;
                                if (plotlineNotificationManager2.b.f1078a.b) {
                                    linkedHashMapD = PlotlineNotificationManager.d(map2);
                                    zB = plotlineNotificationManager2.b(map2);
                                    mapA = PlotlineNotificationManager.a(str3, map2);
                                    if (zB) {
                                        analyticsContract3 = analyticsContract2;
                                        AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                        plotlineNotificationManager2.f(linkedHashMapD);
                                    }
                                }
                                thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                    zC2 = thoughtNudgeNotificationManager2.c(map2);
                                    mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                    if (zC2) {
                                        analyticsContract5 = analyticsContract4;
                                        AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                        thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                    }
                                }
                                if (zC) {
                                }
                                break;
                            case 15:
                            case 16:
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                String strA42 = AppNotificationResolverUseCase.a("bookingId", map2);
                                if (strA42 != null && (strA8 = AppNotificationResolverUseCase.a("productType", map2)) != null && (strA9 = AppNotificationResolverUseCase.a("productSubType", map2)) != null) {
                                    str3 = str;
                                    str4 = str2;
                                    ondcMetroPunchEvent = new AppNotification.PremiumBusTripCancelledOrRescheduledEvent(str3, str4, strA42, strA8, strA9);
                                    chaloCardTransactionNotificationEvent = ondcMetroPunchEvent;
                                    gCMReceiverImpl2 = gCMReceiverImpl;
                                    c = 1;
                                    zC = gCMReceiverImpl2.c.c(map2);
                                    plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                    analyticsContract2 = plotlineNotificationManager2.f6841a;
                                    if (plotlineNotificationManager2.b.f1078a.b) {
                                        linkedHashMapD = PlotlineNotificationManager.d(map2);
                                        zB = plotlineNotificationManager2.b(map2);
                                        mapA = PlotlineNotificationManager.a(str3, map2);
                                        if (zB) {
                                            analyticsContract3 = analyticsContract2;
                                            AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                            plotlineNotificationManager2.f(linkedHashMapD);
                                        }
                                    }
                                    thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                    analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                    if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                        zC2 = thoughtNudgeNotificationManager2.c(map2);
                                        mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                        if (zC2) {
                                            analyticsContract5 = analyticsContract4;
                                            AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                            thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                        }
                                    }
                                    if (zC) {
                                    }
                                }
                                str3 = str;
                                str4 = str2;
                                c = 1;
                                break;
                            case 17:
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                String strA43 = AppNotificationResolverUseCase.a("bookingId", map2);
                                if (strA43 != null && (strA10 = AppNotificationResolverUseCase.a("productType", map2)) != null && (strA11 = AppNotificationResolverUseCase.a("productSubType", map2)) != null) {
                                    str3 = str;
                                    str4 = str2;
                                    ondcMetroPunchEvent = new AppNotification.PremiumBusTripStartDelayedEvent(str3, str4, strA43, strA10, strA11);
                                    chaloCardTransactionNotificationEvent = ondcMetroPunchEvent;
                                    gCMReceiverImpl2 = gCMReceiverImpl;
                                    c = 1;
                                    zC = gCMReceiverImpl2.c.c(map2);
                                    plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                    analyticsContract2 = plotlineNotificationManager2.f6841a;
                                    if (plotlineNotificationManager2.b.f1078a.b) {
                                        linkedHashMapD = PlotlineNotificationManager.d(map2);
                                        zB = plotlineNotificationManager2.b(map2);
                                        mapA = PlotlineNotificationManager.a(str3, map2);
                                        if (zB) {
                                            analyticsContract3 = analyticsContract2;
                                            AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                            plotlineNotificationManager2.f(linkedHashMapD);
                                        }
                                    }
                                    thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                    analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                    if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                        zC2 = thoughtNudgeNotificationManager2.c(map2);
                                        mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                        if (zC2) {
                                            analyticsContract5 = analyticsContract4;
                                            AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                            thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                        }
                                    }
                                    if (zC) {
                                    }
                                }
                                str3 = str;
                                str4 = str2;
                                c = 1;
                                break;
                            case 18:
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                String strA44 = AppNotificationResolverUseCase.a("bookingId", map2);
                                if (strA44 != null && (strA12 = AppNotificationResolverUseCase.a("productType", map2)) != null && (strA13 = AppNotificationResolverUseCase.a("productSubType", map2)) != null) {
                                    str3 = str;
                                    str4 = str2;
                                    ondcMetroPunchEvent = new AppNotification.PremiumBusTripStartedEvent(str3, str4, strA44, strA12, strA13);
                                    chaloCardTransactionNotificationEvent = ondcMetroPunchEvent;
                                    gCMReceiverImpl2 = gCMReceiverImpl;
                                    c = 1;
                                    zC = gCMReceiverImpl2.c.c(map2);
                                    plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                    analyticsContract2 = plotlineNotificationManager2.f6841a;
                                    if (plotlineNotificationManager2.b.f1078a.b) {
                                        linkedHashMapD = PlotlineNotificationManager.d(map2);
                                        zB = plotlineNotificationManager2.b(map2);
                                        mapA = PlotlineNotificationManager.a(str3, map2);
                                        if (zB) {
                                            analyticsContract3 = analyticsContract2;
                                            AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                            plotlineNotificationManager2.f(linkedHashMapD);
                                        }
                                    }
                                    thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                    analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                    if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                        zC2 = thoughtNudgeNotificationManager2.c(map2);
                                        mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                        if (zC2) {
                                            analyticsContract5 = analyticsContract4;
                                            AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                            thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                        }
                                    }
                                    if (zC) {
                                    }
                                }
                                str3 = str;
                                str4 = str2;
                                c = 1;
                                break;
                            case 19:
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                String strA45 = AppNotificationResolverUseCase.a("bookingId", map2);
                                if (strA45 != null && (strA14 = AppNotificationResolverUseCase.a("productType", map2)) != null && (strA15 = AppNotificationResolverUseCase.a("productSubType", map2)) != null) {
                                    str3 = str;
                                    str4 = str2;
                                    ondcMetroPunchEvent = new AppNotification.PremiumBusTripVehicleChangedEvent(str3, str4, strA45, strA14, strA15);
                                    chaloCardTransactionNotificationEvent = ondcMetroPunchEvent;
                                    gCMReceiverImpl2 = gCMReceiverImpl;
                                    c = 1;
                                    zC = gCMReceiverImpl2.c.c(map2);
                                    plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                    analyticsContract2 = plotlineNotificationManager2.f6841a;
                                    if (plotlineNotificationManager2.b.f1078a.b) {
                                        linkedHashMapD = PlotlineNotificationManager.d(map2);
                                        zB = plotlineNotificationManager2.b(map2);
                                        mapA = PlotlineNotificationManager.a(str3, map2);
                                        if (zB) {
                                            analyticsContract3 = analyticsContract2;
                                            AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                            plotlineNotificationManager2.f(linkedHashMapD);
                                        }
                                    }
                                    thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                    analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                    if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                        zC2 = thoughtNudgeNotificationManager2.c(map2);
                                        mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                        if (zC2) {
                                            analyticsContract5 = analyticsContract4;
                                            AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                            thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                        }
                                    }
                                    if (zC) {
                                    }
                                }
                                str3 = str;
                                str4 = str2;
                                c = 1;
                                break;
                            case 22:
                            case 23:
                                str4 = str2;
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                ondcMetroPunchEvent = new AppNotification.PunchNotification.QuickPayNotificationEvent(str, str4, AppNotificationResolverUseCase.a("walletId", map2), AppNotificationResolverUseCase.a("agency", map2), AppNotificationResolverUseCase.a("productType", map2), AppNotificationResolverUseCase.a("productSubType", map2), AppNotificationResolverUseCase.a("quickPayReceiptInfo", map2));
                                str3 = str;
                                chaloCardTransactionNotificationEvent = ondcMetroPunchEvent;
                                gCMReceiverImpl2 = gCMReceiverImpl;
                                c = 1;
                                zC = gCMReceiverImpl2.c.c(map2);
                                plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                analyticsContract2 = plotlineNotificationManager2.f6841a;
                                if (plotlineNotificationManager2.b.f1078a.b) {
                                    linkedHashMapD = PlotlineNotificationManager.d(map2);
                                    zB = plotlineNotificationManager2.b(map2);
                                    mapA = PlotlineNotificationManager.a(str3, map2);
                                    if (zB) {
                                        analyticsContract3 = analyticsContract2;
                                        AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                        plotlineNotificationManager2.f(linkedHashMapD);
                                    }
                                }
                                thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                    zC2 = thoughtNudgeNotificationManager2.c(map2);
                                    mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                    if (zC2) {
                                        analyticsContract5 = analyticsContract4;
                                        AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                        thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                    }
                                }
                                if (zC) {
                                }
                                break;
                            case 27:
                                str8 = str;
                                str4 = str2;
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                chaloCardTransactionNotificationEvent = new AppNotification.PassApplicationUpdate(str8, str4, AppNotificationResolverUseCase.a("info", map2));
                                str3 = str8;
                                gCMReceiverImpl2 = gCMReceiverImpl;
                                c = 1;
                                zC = gCMReceiverImpl2.c.c(map2);
                                plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                analyticsContract2 = plotlineNotificationManager2.f6841a;
                                if (plotlineNotificationManager2.b.f1078a.b) {
                                    linkedHashMapD = PlotlineNotificationManager.d(map2);
                                    zB = plotlineNotificationManager2.b(map2);
                                    mapA = PlotlineNotificationManager.a(str3, map2);
                                    if (zB) {
                                        analyticsContract3 = analyticsContract2;
                                        AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                        plotlineNotificationManager2.f(linkedHashMapD);
                                    }
                                }
                                thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                    zC2 = thoughtNudgeNotificationManager2.c(map2);
                                    mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                    if (zC2) {
                                        analyticsContract5 = analyticsContract4;
                                        AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                        thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                    }
                                }
                                if (zC) {
                                }
                                break;
                            case 28:
                                str8 = str;
                                str4 = str2;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                String str11 = str8 == null ? "" : str8;
                                String str12 = str4 == null ? "" : str4;
                                map2 = map;
                                String strA46 = AppNotificationResolverUseCase.a("lastRideInfo", map2);
                                if (strA46 != null) {
                                    chaloCardTransactionNotificationEvent = new SuperPassPunchEvent(str11, str12, strA46);
                                    str3 = str8;
                                    gCMReceiverImpl2 = gCMReceiverImpl;
                                    c = 1;
                                    zC = gCMReceiverImpl2.c.c(map2);
                                    plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                    analyticsContract2 = plotlineNotificationManager2.f6841a;
                                    if (plotlineNotificationManager2.b.f1078a.b) {
                                        linkedHashMapD = PlotlineNotificationManager.d(map2);
                                        zB = plotlineNotificationManager2.b(map2);
                                        mapA = PlotlineNotificationManager.a(str3, map2);
                                        if (zB) {
                                            analyticsContract3 = analyticsContract2;
                                            AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                            plotlineNotificationManager2.f(linkedHashMapD);
                                        }
                                    }
                                    thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                    analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                    if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                        zC2 = thoughtNudgeNotificationManager2.c(map2);
                                        mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                        if (zC2) {
                                            analyticsContract5 = analyticsContract4;
                                            AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                            thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                        }
                                    }
                                    if (zC) {
                                    }
                                }
                                str3 = str8;
                                c = 1;
                                break;
                                break;
                            case 30:
                                String strA47 = AppNotificationResolverUseCase.a("bookingId", map);
                                String strA48 = AppNotificationResolverUseCase.a("productType", map);
                                String strA49 = AppNotificationResolverUseCase.a("productSubType", map);
                                long j2 = (!map.containsKey("groupNo") || (strA20 = AppNotificationResolverUseCase.a("groupNo", map)) == null) ? 0L : Long.parseLong(strA20);
                                long j3 = (!map.containsKey("firstTimeValidScanTS") || (strA19 = AppNotificationResolverUseCase.a("firstTimeValidScanTS", map)) == null) ? 0L : Long.parseLong(strA19);
                                long j4 = (!map.containsKey("activationTsInSec") || (strA18 = AppNotificationResolverUseCase.a("activationTsInSec", map)) == null) ? 0L : Long.parseLong(strA18);
                                if (map.containsKey("tapinPunchTsInMillis") && (strA17 = AppNotificationResolverUseCase.a("tapinPunchTsInMillis", map)) != null) {
                                    j = Long.parseLong(strA17);
                                }
                                String strA50 = map.containsKey("walletId") ? AppNotificationResolverUseCase.a("walletId", map) : null;
                                if (map.containsKey("expiryTime")) {
                                    String strA51 = AppNotificationResolverUseCase.a("expiryTime", map);
                                    lValueOf = strA51 != null ? Long.valueOf(Long.parseLong(strA51)) : null;
                                } else {
                                    lValueOf = null;
                                }
                                String strA52 = AppNotificationResolverUseCase.a("routeId", map);
                                String strA53 = AppNotificationResolverUseCase.a("stopId", map);
                                String strA54 = AppNotificationResolverUseCase.a("tripNo", map);
                                if (map.containsKey("waybillNo") && (strA16 = AppNotificationResolverUseCase.a("waybillNo", map)) != null) {
                                    jLongValue = Long.parseLong(strA16);
                                }
                                String str13 = strA50;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                str4 = str2;
                                str3 = str;
                                ondcMetroPunchEvent = new TITOTapInNotificationEvent(str3, str4, strA47, strA48, strA49, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j), strA52, strA53, strA54, Long.valueOf(jLongValue), AppNotificationResolverUseCase.a("vehicleNumber", map), str13, lValueOf);
                                map2 = map;
                                chaloCardTransactionNotificationEvent = ondcMetroPunchEvent;
                                gCMReceiverImpl2 = gCMReceiverImpl;
                                c = 1;
                                zC = gCMReceiverImpl2.c.c(map2);
                                plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                analyticsContract2 = plotlineNotificationManager2.f6841a;
                                if (plotlineNotificationManager2.b.f1078a.b) {
                                    linkedHashMapD = PlotlineNotificationManager.d(map2);
                                    zB = plotlineNotificationManager2.b(map2);
                                    mapA = PlotlineNotificationManager.a(str3, map2);
                                    if (zB) {
                                        analyticsContract3 = analyticsContract2;
                                        AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                        plotlineNotificationManager2.f(linkedHashMapD);
                                    }
                                }
                                thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                    zC2 = thoughtNudgeNotificationManager2.c(map2);
                                    mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                    if (zC2) {
                                        analyticsContract5 = analyticsContract4;
                                        AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                        thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                    }
                                }
                                if (zC) {
                                }
                                break;
                            case 31:
                                String strA55 = AppNotificationResolverUseCase.a("bookingId", map);
                                String strA56 = AppNotificationResolverUseCase.a("productType", map);
                                String strA57 = AppNotificationResolverUseCase.a("productSubType", map);
                                long j5 = (!map.containsKey("activationTsInSec") || (strA25 = AppNotificationResolverUseCase.a("activationTsInSec", map)) == null) ? 0L : Long.parseLong(strA25);
                                long j6 = (!map.containsKey("tapOutGroupNo") || (strA24 = AppNotificationResolverUseCase.a("tapOutGroupNo", map)) == null) ? 0L : Long.parseLong(strA24);
                                long j7 = (!map.containsKey("tapOutWaybillNo") || (strA23 = AppNotificationResolverUseCase.a("tapOutWaybillNo", map)) == null) ? 0L : Long.parseLong(strA23);
                                if (map.containsKey("tapOutTsInMillis") && (strA22 = AppNotificationResolverUseCase.a("tapOutTsInMillis", map)) != null) {
                                    j = Long.parseLong(strA22);
                                }
                                long j8 = j;
                                String strA58 = AppNotificationResolverUseCase.a("tapOutTripNo", map);
                                String strA59 = AppNotificationResolverUseCase.a("tapOutRouteId", map);
                                String strA60 = AppNotificationResolverUseCase.a("tapOutStopId", map);
                                String strA61 = map.containsKey("walletId") ? AppNotificationResolverUseCase.a("walletId", map) : null;
                                if (map.containsKey("expiryTime") && (strA21 = AppNotificationResolverUseCase.a("expiryTime", map)) != null) {
                                    jLongValue = Long.parseLong(strA21);
                                }
                                TITOTapOutNotificationEvent tITOTapOutNotificationEvent = new TITOTapOutNotificationEvent(str == null ? "" : str, str2 == null ? "" : str2, strA55, strA56, strA57, Long.valueOf(j5), Long.valueOf(j6), strA58, Long.valueOf(j7), j8, strA59, strA60, strA61, Long.valueOf(jLongValue));
                                str3 = str;
                                str4 = str2;
                                map2 = map;
                                gCMReceiverImpl2 = gCMReceiverImpl3;
                                chaloCardTransactionNotificationEvent = tITOTapOutNotificationEvent;
                                c = 1;
                                zC = gCMReceiverImpl2.c.c(map2);
                                plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                analyticsContract2 = plotlineNotificationManager2.f6841a;
                                if (plotlineNotificationManager2.b.f1078a.b) {
                                    linkedHashMapD = PlotlineNotificationManager.d(map2);
                                    zB = plotlineNotificationManager2.b(map2);
                                    mapA = PlotlineNotificationManager.a(str3, map2);
                                    if (zB) {
                                        analyticsContract3 = analyticsContract2;
                                        AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                        plotlineNotificationManager2.f(linkedHashMapD);
                                    }
                                }
                                thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                    zC2 = thoughtNudgeNotificationManager2.c(map2);
                                    mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                    if (zC2) {
                                        analyticsContract5 = analyticsContract4;
                                        AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                        thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                    }
                                }
                                if (zC) {
                                }
                                break;
                            case 33:
                                String strA62 = AppNotificationResolverUseCase.a("bookingId", map);
                                if (strA62 != null && (strA26 = AppNotificationResolverUseCase.a("productType", map)) != null && (strA27 = AppNotificationResolverUseCase.a("productSubType", map)) != null) {
                                    str3 = str;
                                    str4 = str2;
                                    chaloCardTransactionNotificationEvent = new AppNotification.PremiumBusRefundProcessedEvent(str3, str4, strA62, strA26, strA27);
                                    map2 = map;
                                    gCMReceiverImpl2 = gCMReceiverImpl3;
                                    c = 1;
                                    zC = gCMReceiverImpl2.c.c(map2);
                                    plotlineNotificationManager2 = gCMReceiverImpl2.d;
                                    analyticsContract2 = plotlineNotificationManager2.f6841a;
                                    if (plotlineNotificationManager2.b.f1078a.b) {
                                        linkedHashMapD = PlotlineNotificationManager.d(map2);
                                        zB = plotlineNotificationManager2.b(map2);
                                        mapA = PlotlineNotificationManager.a(str3, map2);
                                        if (zB) {
                                            analyticsContract3 = analyticsContract2;
                                            AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                                            plotlineNotificationManager2.f(linkedHashMapD);
                                        }
                                    }
                                    thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                                    analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                                    if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                                        zC2 = thoughtNudgeNotificationManager2.c(map2);
                                        mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                                        if (zC2) {
                                            analyticsContract5 = analyticsContract4;
                                            AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                                            thoughtNudgeNotificationManager2.b(str3, str4, map2);
                                        }
                                    }
                                    if (zC) {
                                    }
                                }
                                str3 = str;
                                str4 = str2;
                                map2 = map;
                                gCMReceiverImpl = gCMReceiverImpl3;
                                c = 1;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                gCMReceiverImpl2 = gCMReceiverImpl;
                chaloCardTransactionNotificationEvent = null;
                zC = gCMReceiverImpl2.c.c(map2);
                plotlineNotificationManager2 = gCMReceiverImpl2.d;
                analyticsContract2 = plotlineNotificationManager2.f6841a;
                if (plotlineNotificationManager2.b.f1078a.b) {
                    linkedHashMapD = PlotlineNotificationManager.d(map2);
                    zB = plotlineNotificationManager2.b(map2);
                    mapA = PlotlineNotificationManager.a(str3, map2);
                    if (zB) {
                        analyticsContract3 = analyticsContract2;
                        AnalyticsContract.DefaultImpls.a(analyticsContract3, "Plotline Notification Received", "", mapA, null, false, 8);
                        plotlineNotificationManager2.f(linkedHashMapD);
                    }
                }
                thoughtNudgeNotificationManager2 = gCMReceiverImpl2.e;
                analyticsContract4 = thoughtNudgeNotificationManager2.f9623a;
                if (thoughtNudgeNotificationManager2.b.f1078a.c) {
                    zC2 = thoughtNudgeNotificationManager2.c(map2);
                    mapA2 = ThoughtNudgeNotificationManager.a(str, str2, map);
                    if (zC2) {
                        analyticsContract5 = analyticsContract4;
                        AnalyticsContractImplKt.b(analyticsContract5, "Thought Nudge Notification Received", Source.SOURCE_NOTIFICATION, mapA2, false, 8);
                        thoughtNudgeNotificationManager2.b(str3, str4, map2);
                    }
                }
                if (zC) {
                }
            }

            @Override // com.mmk.kmpnotifier.notification.NotifierManager.Listener
            public final void onNewToken(String str) {
                GCMReceiverImpl.this.j.setValue(str);
            }

            @Override // com.mmk.kmpnotifier.notification.NotifierManager.Listener
            public final void a(Map map) {
            }
        };
        ArrayList arrayList = NotifierManagerImpl.b;
        arrayList.clear();
        arrayList.add(listener);
    }

    @Override // app.chalo.notification.core.GCMReceiver
    public final void a() {
        this.f6525a.a();
        KoinComponent koinComponent = NotifierManagerImpl.f15315a;
        if (LibDependencyInitializer.f15302a == null) {
            throw new IllegalStateException("NotifierFactory is not initialized. Please, initialize NotifierFactory by calling #initialize method");
        }
        this.l = (PushNotifier) (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getF18836a() : koinComponent.L().c.d).d(Reflection.a(PushNotifier.class), null, null);
        BuildersKt.d(this.h, null, null, new GCMReceiverImpl$initialise$1(this, null), 3);
    }

    @Override // app.chalo.notification.core.GCMReceiver
    /* JADX INFO: renamed from: b, reason: from getter */
    public final StateFlow getK() {
        return this.k;
    }

    @Override // app.chalo.notification.core.GCMReceiver
    public final GCMReceiverImpl$receiveNotificationFor$$inlined$filter$1 c(ClassReference classReference) {
        return new GCMReceiverImpl$receiveNotificationFor$$inlined$filter$1(this.i, classReference);
    }
}
