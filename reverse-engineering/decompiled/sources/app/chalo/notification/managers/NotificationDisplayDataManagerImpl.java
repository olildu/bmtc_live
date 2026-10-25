package app.chalo.notification.managers;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.HomeDestinationTabType.DestinationTabType;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.NavigationContract;
import app.chalo.contract.ProductTypeForReceipt;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.BookingsRequestType;
import app.chalo.extensions.AnyExtsKt;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.extensions.JsonException;
import app.chalo.features.foreground.ActiveSceneInStackResolver;
import app.chalo.models.mticketing.MTicketTripReceipt;
import app.chalo.ncmc.ui.CardTransactionHistoryArgsModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.notification.models.AppNotification;
import app.chalo.notification.models.InstantTicketReceiptNotificationEvent;
import app.chalo.notification.models.NotificationDisplayData;
import app.chalo.notification.models.NotificationNavigationData;
import app.chalo.notification.models.SuperPassPunchEvent;
import app.chalo.notification.models.TITOTapInNotificationEvent;
import app.chalo.notification.models.TITOTapOutNotificationEvent;
import app.chalo.productpurchase.passpurchase.domain.PassPurchaseSceneResolverUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.quickpay.validation.QuickPayPunchDetails;
import app.chalo.quickpay.validation.QuickPayReceiptInfo;
import app.chalo.quickpay.validation.QuickPayTicketProductValidationConfigKt;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.args.CardTransactionHistoryArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.utils.MobileTicketingConverters;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/managers/NotificationDisplayDataManagerImpl;", "Lapp/chalo/notification/managers/NotificationDisplayDataManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationDisplayDataManagerImpl implements NotificationDisplayDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f6530a;
    public final ActiveSceneInStackResolver b;
    public final PassPurchaseSceneResolverUseCase c;
    public final AnalyticsContract d;
    public final BasicInfoContract e;
    public final NavigationContract f;
    public final CrashlyticsLogger g;

    public NotificationDisplayDataManagerImpl(UserProfileDetailsProvider userProfileDetailsProvider, ActiveSceneInStackResolver activeSceneInStackResolver, PassPurchaseSceneResolverUseCase passPurchaseSceneResolverUseCase, MobileTicketingConverters mobileTicketingConverters, AnalyticsContract analyticsContract, BasicInfoContract basicInfoContract, NavigationContract navigationContract, CrashlyticsLogger crashlyticsLogger) {
        this.f6530a = userProfileDetailsProvider;
        this.b = activeSceneInStackResolver;
        this.c = passPurchaseSceneResolverUseCase;
        this.d = analyticsContract;
        this.e = basicInfoContract;
        this.f = navigationContract;
        this.g = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.notification.managers.NotificationDisplayDataManager
    public final Object a(AppNotification appNotification, ContinuationImpl continuationImpl) throws JsonException {
        NotificationDisplayDataManagerImpl$notificationDisplayData$1 notificationDisplayDataManagerImpl$notificationDisplayData$1;
        BookingsRequestType premiumBusTicketType;
        AppNotification appNotification2;
        SceneArgs sceneArgsA;
        Object objB;
        QuickPayReceiptInfo quickPayReceiptInfo;
        SceneArgs sceneArgsA2;
        String str;
        AppNotification.OndcMetroTicketCancellationEvent ondcMetroTicketCancellationEvent;
        String str2;
        String str3;
        String str4;
        String str5;
        if (continuationImpl instanceof NotificationDisplayDataManagerImpl$notificationDisplayData$1) {
            notificationDisplayDataManagerImpl$notificationDisplayData$1 = (NotificationDisplayDataManagerImpl$notificationDisplayData$1) continuationImpl;
            int i = notificationDisplayDataManagerImpl$notificationDisplayData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationDisplayDataManagerImpl$notificationDisplayData$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationDisplayDataManagerImpl$notificationDisplayData$1 = new NotificationDisplayDataManagerImpl$notificationDisplayData$1(this, continuationImpl);
            }
        } else {
            notificationDisplayDataManagerImpl$notificationDisplayData$1 = new NotificationDisplayDataManagerImpl$notificationDisplayData$1(this, continuationImpl);
        }
        Object objC = notificationDisplayDataManagerImpl$notificationDisplayData$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (notificationDisplayDataManagerImpl$notificationDisplayData$1.label) {
            case 0:
                ResultKt.b(objC);
                if (appNotification instanceof AppNotification.PassApplicationUpdate) {
                    notificationDisplayDataManagerImpl$notificationDisplayData$1.label = 1;
                    Object objD = d((AppNotification.PassApplicationUpdate) appNotification, notificationDisplayDataManagerImpl$notificationDisplayData$1);
                    if (objD != obj) {
                        return objD;
                    }
                } else if (appNotification instanceof SuperPassPunchEvent) {
                    SuperPassPunchEvent superPassPunchEvent = (SuperPassPunchEvent) appNotification;
                    notificationDisplayDataManagerImpl$notificationDisplayData$1.label = 2;
                    Object objB2 = f() ? null : this.c.b(superPassPunchEvent, notificationDisplayDataManagerImpl$notificationDisplayData$1);
                    if (objB2 != obj) {
                        return objB2;
                    }
                } else {
                    if (appNotification instanceof AppNotification.PassUpdate) {
                        AppNotification.PassUpdate passUpdate = (AppNotification.PassUpdate) appNotification;
                        return new NotificationDisplayData(0, appNotification, new NotificationNavigationData.Deeplink(), passUpdate.f6535a, passUpdate.b);
                    }
                    if (!(appNotification instanceof AppNotification.PaymentDone)) {
                        boolean z = appNotification instanceof AppNotification.PunchNotification.QuickPayNotificationEvent;
                        NavigationContract navigationContract = this.f;
                        if (z) {
                            if (!f()) {
                                AppNotification.PunchNotification.QuickPayNotificationEvent quickPayNotificationEvent = (AppNotification.PunchNotification.QuickPayNotificationEvent) appNotification;
                                String str6 = quickPayNotificationEvent.g;
                                if (str6 != null) {
                                    try {
                                        Json json = ChaloJson.b;
                                        json.getClass();
                                        objB = json.b(str6, QuickPayReceiptInfo.INSTANCE.serializer());
                                    } catch (Exception unused) {
                                        objB = null;
                                    }
                                    QuickPayReceiptInfo quickPayReceiptInfo2 = (QuickPayReceiptInfo) objB;
                                    if (quickPayReceiptInfo2 != null && QuickPayTicketProductValidationConfigKt.a(new QuickPayPunchDetails(quickPayNotificationEvent.e, quickPayNotificationEvent.f, quickPayNotificationEvent.c, quickPayReceiptInfo2, quickPayNotificationEvent.d))) {
                                        quickPayReceiptInfo = quickPayReceiptInfo2;
                                    } else {
                                        quickPayReceiptInfo = null;
                                    }
                                    break;
                                } else {
                                    quickPayReceiptInfo = null;
                                }
                                String str7 = quickPayReceiptInfo != null ? quickPayReceiptInfo.b : null;
                                Long l = quickPayReceiptInfo != null ? quickPayReceiptInfo.f8906a : null;
                                Long l2 = quickPayReceiptInfo != null ? quickPayReceiptInfo.c : null;
                                if (quickPayReceiptInfo == null || str7 == null || l == null || l2 == null || (sceneArgsA2 = NavigationContract.DefaultImpls.a(navigationContract, Source.SOURCE_PUNCH_NOTIFICATION.getSourceName(), str7, str7, ProductTypeForReceipt.QUICK_PAY, 48)) == null) {
                                    return null;
                                }
                                return new NotificationDisplayData(5, quickPayNotificationEvent, CollectionsKt.S(new HomeArgs((String) null, (String) null, 7), sceneArgsA2));
                            }
                        } else if (appNotification instanceof AppNotification.PunchNotification.PremiumReserveTicketPunchEvent) {
                            AppNotification.PunchNotification.PremiumReserveTicketPunchEvent premiumReserveTicketPunchEvent = (AppNotification.PunchNotification.PremiumReserveTicketPunchEvent) appNotification;
                            if (!f() && (sceneArgsA = NavigationContract.DefaultImpls.a(navigationContract, Source.SOURCE_PUNCH_NOTIFICATION.getSourceName(), premiumReserveTicketPunchEvent.c, null, ProductTypeForReceipt.PREMIUM_RESERVE_TICKET, 52)) != null) {
                                return new NotificationDisplayData(8, premiumReserveTicketPunchEvent, CollectionsKt.S(new HomeArgs((String) null, (String) null, 7), sceneArgsA));
                            }
                        } else {
                            if (appNotification instanceof AppNotification.PremiumBusTripStartedEvent) {
                                AppNotification.PremiumBusTripStartedEvent premiumBusTripStartedEvent = (AppNotification.PremiumBusTripStartedEvent) appNotification;
                                return new NotificationDisplayData(9, appNotification, CollectionsKt.S(new HomeArgs((String) null, (String) null, 7), new PremiumBusActivationArgs(Source.NOTIFICATION, premiumBusTripStartedEvent.c, premiumBusTripStartedEvent.d, premiumBusTripStartedEvent.e, false)));
                            }
                            if (appNotification instanceof AppNotification.PremiumBusTripCancelledOrRescheduledEvent) {
                                AppNotification.PremiumBusTripCancelledOrRescheduledEvent premiumBusTripCancelledOrRescheduledEvent = (AppNotification.PremiumBusTripCancelledOrRescheduledEvent) appNotification;
                                if (premiumBusTripCancelledOrRescheduledEvent.c.length() != 0) {
                                    return new NotificationDisplayData(10, premiumBusTripCancelledOrRescheduledEvent, new HomeArgs((String) null, (String) null, 7));
                                }
                            } else if (appNotification instanceof AppNotification.BookingSuccessfulEvent) {
                                AppNotification.BookingSuccessfulEvent bookingSuccessfulEvent = (AppNotification.BookingSuccessfulEvent) appNotification;
                                String str8 = bookingSuccessfulEvent.e;
                                String str9 = bookingSuccessfulEvent.c;
                                if (str9.length() != 0 && str8.equals("premiumReserveTicket")) {
                                    return new NotificationDisplayData(11, bookingSuccessfulEvent, CollectionsKt.S(new HomeArgs((String) null, (String) null, 7), new PremiumBusActivationArgs(Source.NOTIFICATION, str9, bookingSuccessfulEvent.d, str8, false)));
                                }
                            } else if (appNotification instanceof AppNotification.PremiumBusTripStartDelayedEvent) {
                                AppNotification.PremiumBusTripStartDelayedEvent premiumBusTripStartDelayedEvent = (AppNotification.PremiumBusTripStartDelayedEvent) appNotification;
                                String str10 = premiumBusTripStartDelayedEvent.c;
                                if (str10.length() != 0) {
                                    return new NotificationDisplayData(12, premiumBusTripStartDelayedEvent, CollectionsKt.S(new HomeArgs((String) null, (String) null, 7), new PremiumBusActivationArgs(Source.NOTIFICATION, str10, premiumBusTripStartDelayedEvent.d, premiumBusTripStartDelayedEvent.e, false)));
                                }
                            } else if (appNotification instanceof AppNotification.PremiumBusTripVehicleChangedEvent) {
                                AppNotification.PremiumBusTripVehicleChangedEvent premiumBusTripVehicleChangedEvent = (AppNotification.PremiumBusTripVehicleChangedEvent) appNotification;
                                String str11 = premiumBusTripVehicleChangedEvent.c;
                                if (str11.length() != 0) {
                                    return new NotificationDisplayData(13, premiumBusTripVehicleChangedEvent, CollectionsKt.S(new HomeArgs((String) null, (String) null, 7), new PremiumBusActivationArgs(Source.NOTIFICATION, str11, premiumBusTripVehicleChangedEvent.d, premiumBusTripVehicleChangedEvent.e, false)));
                                }
                            } else if (appNotification instanceof AppNotification.OndcMetroTicketCancellationEvent) {
                                notificationDisplayDataManagerImpl$notificationDisplayData$1.L$0 = appNotification;
                                notificationDisplayDataManagerImpl$notificationDisplayData$1.label = 4;
                                objC = c(notificationDisplayDataManagerImpl$notificationDisplayData$1);
                                if (objC != obj) {
                                    appNotification2 = appNotification;
                                    str = (String) objC;
                                    if (str != null && str.length() != 0 && ((str2 = (ondcMetroTicketCancellationEvent = (AppNotification.OndcMetroTicketCancellationEvent) appNotification2).c) == null || str2.equals(str))) {
                                        str3 = ondcMetroTicketCancellationEvent.d;
                                        if (str3 != null || StringsKt.F(str3)) {
                                            str3 = null;
                                        }
                                        str4 = ondcMetroTicketCancellationEvent.f6533a;
                                        if (str4 != null && !StringsKt.F(str4) && (str5 = ondcMetroTicketCancellationEvent.b) != null && !StringsKt.F(str5) && str3 != null && Intrinsics.d(ondcMetroTicketCancellationEvent.f, "ondcMetroTicket")) {
                                            return new NotificationDisplayData(15, appNotification2, CollectionsKt.S(new HomeArgs((String) null, (String) null, 7), new TripSummaryArgs.TicketSummaryScreen(Source.NOTIFICATION, new BookingsRequestType.OndcMetroTicketType(str3))));
                                        }
                                    }
                                }
                            } else if (appNotification instanceof AppNotification.ChaloCardTransactionNotificationEvent) {
                                notificationDisplayDataManagerImpl$notificationDisplayData$1.label = 5;
                                Object objB3 = b((AppNotification.ChaloCardTransactionNotificationEvent) appNotification, notificationDisplayDataManagerImpl$notificationDisplayData$1);
                                if (objB3 != obj) {
                                    return objB3;
                                }
                            } else {
                                if ((appNotification instanceof InstantTicketReceiptNotificationEvent) || (appNotification instanceof TITOTapOutNotificationEvent) || (appNotification instanceof AppNotification.PunchNotification.OndcTicketPunchEvent) || (appNotification instanceof AppNotification.PunchNotification.OndcMetroPunchEvent) || (appNotification instanceof TITOTapInNotificationEvent)) {
                                    return null;
                                }
                                if (!(appNotification instanceof AppNotification.PunchNotification.MTicketPunchedEvent)) {
                                    if (!(appNotification instanceof AppNotification.PremiumBusRefundProcessedEvent)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    AppNotification.PremiumBusRefundProcessedEvent premiumBusRefundProcessedEvent = (AppNotification.PremiumBusRefundProcessedEvent) appNotification;
                                    String str12 = premiumBusRefundProcessedEvent.c;
                                    if (str12.length() != 0) {
                                        switch (premiumBusRefundProcessedEvent.e) {
                                            case "premiumReserveTicket":
                                                premiumBusTicketType = new BookingsRequestType.PremiumBusTicketType(str12);
                                                break;
                                            case "quickpay":
                                                premiumBusTicketType = new BookingsRequestType.QuickPayType(str12, "");
                                                break;
                                            case "instantTicket":
                                                premiumBusTicketType = new BookingsRequestType.InstantTicketType(str12);
                                                break;
                                            case "ondcTicket":
                                                premiumBusTicketType = new BookingsRequestType.OndcTicketType(str12);
                                                break;
                                            case "ondcMetroTicket":
                                                premiumBusTicketType = new BookingsRequestType.OndcMetroTicketType(str12);
                                                break;
                                            default:
                                                premiumBusTicketType = null;
                                                break;
                                        }
                                        if (premiumBusTicketType != null) {
                                            return new NotificationDisplayData(14, premiumBusRefundProcessedEvent, CollectionsKt.S(new HomeArgs((String) null, (String) null, 7), new TripSummaryArgs.TicketSummaryScreen(Source.NOTIFICATION, premiumBusTicketType)));
                                        }
                                    }
                                } else if (!f()) {
                                    notificationDisplayDataManagerImpl$notificationDisplayData$1.label = 6;
                                    Object objH = h((AppNotification.PunchNotification.MTicketPunchedEvent) appNotification, notificationDisplayDataManagerImpl$notificationDisplayData$1);
                                    if (objH != obj) {
                                        return objH;
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    notificationDisplayDataManagerImpl$notificationDisplayData$1.label = 3;
                    Object objE = e((AppNotification.PaymentDone) appNotification, notificationDisplayDataManagerImpl$notificationDisplayData$1);
                    if (objE != obj) {
                        return objE;
                    }
                }
                return obj;
            case 1:
                ResultKt.b(objC);
                return objC;
            case 2:
                ResultKt.b(objC);
                return objC;
            case 3:
                ResultKt.b(objC);
                return objC;
            case 4:
                appNotification2 = (AppNotification) notificationDisplayDataManagerImpl$notificationDisplayData$1.L$0;
                ResultKt.b(objC);
                str = (String) objC;
                if (str != null) {
                    str3 = ondcMetroTicketCancellationEvent.d;
                    if (str3 != null) {
                        str3 = null;
                    } else {
                        str3 = null;
                    }
                    str4 = ondcMetroTicketCancellationEvent.f6533a;
                    if (str4 != null) {
                        return new NotificationDisplayData(15, appNotification2, CollectionsKt.S(new HomeArgs((String) null, (String) null, 7), new TripSummaryArgs.TicketSummaryScreen(Source.NOTIFICATION, new BookingsRequestType.OndcMetroTicketType(str3))));
                    }
                }
                return null;
            case 5:
                ResultKt.b(objC);
                return objC;
            case 6:
                ResultKt.b(objC);
                return objC;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(AppNotification.ChaloCardTransactionNotificationEvent chaloCardTransactionNotificationEvent, ContinuationImpl continuationImpl) {
        NotificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1 notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1;
        AppNotification.ChaloCardTransactionNotificationEvent chaloCardTransactionNotificationEvent2;
        String str;
        String str2;
        List listR;
        if (continuationImpl instanceof NotificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1) {
            notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1 = (NotificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1) continuationImpl;
            int i = notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1 = new NotificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1(this, continuationImpl);
            }
        } else {
            notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1 = new NotificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1(this, continuationImpl);
        }
        Object obj = notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                String str3 = chaloCardTransactionNotificationEvent.c;
                if (str3 != null) {
                    JsonObject jsonObjectG = JsonElementKt.g(ChaloJson.b.f(str3));
                    String strS = JsonElementExtensionsKt.s(jsonObjectG, "cardNumber", "");
                    String strS2 = JsonElementExtensionsKt.s(jsonObjectG, "cardType", "");
                    notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1.L$0 = chaloCardTransactionNotificationEvent;
                    notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1.L$1 = strS;
                    notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1.L$2 = strS2;
                    notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1.label = 1;
                    Object objG = g(notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1);
                    if (objG == obj2) {
                        return obj2;
                    }
                    chaloCardTransactionNotificationEvent2 = chaloCardTransactionNotificationEvent;
                    str = strS2;
                    obj = objG;
                    str2 = strS;
                }
                return null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1.L$2;
            str2 = (String) notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1.L$1;
            chaloCardTransactionNotificationEvent2 = (AppNotification.ChaloCardTransactionNotificationEvent) notificationDisplayDataManagerImpl$chaloCardTransactionDisplayData$1.L$0;
            ResultKt.b(obj);
            if (((Boolean) obj).booleanValue()) {
                HomeArgs homeArgs = new HomeArgs((String) null, (String) null, 7);
                Json json = ChaloJson.b;
                CardTransactionHistoryArgsModel cardTransactionHistoryArgsModel = new CardTransactionHistoryArgsModel(Source.NOTIFICATION, str2, null, str);
                json.getClass();
                listR = CollectionsKt.S(homeArgs, new CardTransactionHistoryArgs(json.a(CardTransactionHistoryArgsModel.INSTANCE.serializer(), cardTransactionHistoryArgsModel)));
            } else {
                listR = CollectionsKt.R(new HomeArgs((String) null, (String) null, 7));
            }
            if (str2.length() == 0) {
                return null;
            }
            return new NotificationDisplayData(7, chaloCardTransactionNotificationEvent2, listR);
        } catch (Exception e) {
            this.g.i(e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ContinuationImpl continuationImpl) {
        NotificationDisplayDataManagerImpl$currentUserId$1 notificationDisplayDataManagerImpl$currentUserId$1;
        if (continuationImpl instanceof NotificationDisplayDataManagerImpl$currentUserId$1) {
            notificationDisplayDataManagerImpl$currentUserId$1 = (NotificationDisplayDataManagerImpl$currentUserId$1) continuationImpl;
            int i = notificationDisplayDataManagerImpl$currentUserId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationDisplayDataManagerImpl$currentUserId$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationDisplayDataManagerImpl$currentUserId$1 = new NotificationDisplayDataManagerImpl$currentUserId$1(this, continuationImpl);
            }
        } else {
            notificationDisplayDataManagerImpl$currentUserId$1 = new NotificationDisplayDataManagerImpl$currentUserId$1(this, continuationImpl);
        }
        Object objC = notificationDisplayDataManagerImpl$currentUserId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationDisplayDataManagerImpl$currentUserId$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                NotificationDisplayDataManagerImpl$currentUserId$2 notificationDisplayDataManagerImpl$currentUserId$2 = new NotificationDisplayDataManagerImpl$currentUserId$2(this, null);
                notificationDisplayDataManagerImpl$currentUserId$1.label = 1;
                objC = TimeoutKt.c(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, notificationDisplayDataManagerImpl$currentUserId$2, notificationDisplayDataManagerImpl$currentUserId$1);
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
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r7 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(app.chalo.notification.models.AppNotification.PassApplicationUpdate r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws app.chalo.extensions.JsonException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof app.chalo.notification.managers.NotificationDisplayDataManagerImpl$handlePassApplicationUpdate$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.notification.managers.NotificationDisplayDataManagerImpl$handlePassApplicationUpdate$1 r0 = (app.chalo.notification.managers.NotificationDisplayDataManagerImpl$handlePassApplicationUpdate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.notification.managers.NotificationDisplayDataManagerImpl$handlePassApplicationUpdate$1 r0 = new app.chalo.notification.managers.NotificationDisplayDataManagerImpl$handlePassApplicationUpdate$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$0
            app.chalo.notification.models.AppNotification$PassApplicationUpdate r6 = (app.chalo.notification.models.AppNotification.PassApplicationUpdate) r6
            kotlin.ResultKt.b(r7)
            goto L48
        L3a:
            kotlin.ResultKt.b(r7)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r5.g(r0)
            if (r7 != r1) goto L48
            goto L5d
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r2 = 0
            if (r7 == 0) goto L61
            r0.L$0 = r2
            r0.label = r3
            app.chalo.productpurchase.passpurchase.domain.PassPurchaseSceneResolverUseCase r7 = r5.c
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            app.chalo.notification.models.NotificationDisplayData r7 = (app.chalo.notification.models.NotificationDisplayData) r7
            return r7
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.notification.managers.NotificationDisplayDataManagerImpl.d(app.chalo.notification.models.AppNotification$PassApplicationUpdate, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(AppNotification.PaymentDone paymentDone, ContinuationImpl continuationImpl) {
        NotificationDisplayDataManagerImpl$handlePaymentDone$1 notificationDisplayDataManagerImpl$handlePaymentDone$1;
        if (continuationImpl instanceof NotificationDisplayDataManagerImpl$handlePaymentDone$1) {
            notificationDisplayDataManagerImpl$handlePaymentDone$1 = (NotificationDisplayDataManagerImpl$handlePaymentDone$1) continuationImpl;
            int i = notificationDisplayDataManagerImpl$handlePaymentDone$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationDisplayDataManagerImpl$handlePaymentDone$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationDisplayDataManagerImpl$handlePaymentDone$1 = new NotificationDisplayDataManagerImpl$handlePaymentDone$1(this, continuationImpl);
            }
        } else {
            notificationDisplayDataManagerImpl$handlePaymentDone$1 = new NotificationDisplayDataManagerImpl$handlePaymentDone$1(this, continuationImpl);
        }
        Object objG = notificationDisplayDataManagerImpl$handlePaymentDone$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationDisplayDataManagerImpl$handlePaymentDone$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            notificationDisplayDataManagerImpl$handlePaymentDone$1.L$0 = paymentDone;
            notificationDisplayDataManagerImpl$handlePaymentDone$1.label = 1;
            objG = g(notificationDisplayDataManagerImpl$handlePaymentDone$1);
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentDone = (AppNotification.PaymentDone) notificationDisplayDataManagerImpl$handlePaymentDone$1.L$0;
            ResultKt.b(objG);
        }
        if (((Boolean) objG).booleanValue()) {
            return new NotificationDisplayData(3, paymentDone, new HomeArgs(DestinationTabType.MY_TICKETS.getDestinationTabType(), (String) null, 6));
        }
        return null;
    }

    public final boolean f() {
        ChaloScenes chaloScenesB = this.b.b();
        return chaloScenesB == ChaloScenes.QrValidation || chaloScenesB == ChaloScenes.BleValidation;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ContinuationImpl continuationImpl) {
        NotificationDisplayDataManagerImpl$isLoggedIn$1 notificationDisplayDataManagerImpl$isLoggedIn$1;
        if (continuationImpl instanceof NotificationDisplayDataManagerImpl$isLoggedIn$1) {
            notificationDisplayDataManagerImpl$isLoggedIn$1 = (NotificationDisplayDataManagerImpl$isLoggedIn$1) continuationImpl;
            int i = notificationDisplayDataManagerImpl$isLoggedIn$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationDisplayDataManagerImpl$isLoggedIn$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationDisplayDataManagerImpl$isLoggedIn$1 = new NotificationDisplayDataManagerImpl$isLoggedIn$1(this, continuationImpl);
            }
        } else {
            notificationDisplayDataManagerImpl$isLoggedIn$1 = new NotificationDisplayDataManagerImpl$isLoggedIn$1(this, continuationImpl);
        }
        Object objC = notificationDisplayDataManagerImpl$isLoggedIn$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationDisplayDataManagerImpl$isLoggedIn$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            notificationDisplayDataManagerImpl$isLoggedIn$1.label = 1;
            objC = c(notificationDisplayDataManagerImpl$isLoggedIn$1);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        return Boolean.valueOf(AnyExtsKt.a((String) objC));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(AppNotification.PunchNotification.MTicketPunchedEvent mTicketPunchedEvent, ContinuationImpl continuationImpl) {
        NotificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1 notificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1;
        if (continuationImpl instanceof NotificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1) {
            notificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1 = (NotificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1) continuationImpl;
            int i = notificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1 = new NotificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1(this, continuationImpl);
            }
        } else {
            notificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1 = new NotificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1(this, continuationImpl);
        }
        Object obj = notificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                MTicketTripReceipt mTicketTripReceiptI = MobileTicketingConverters.i(JsonElementKt.g(ChaloJson.b.f(mTicketPunchedEvent.c)));
                if (mTicketTripReceiptI != null) {
                    notificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1.L$0 = mTicketPunchedEvent;
                    notificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1.label = 1;
                    if (i(mTicketTripReceiptI, notificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1) == obj2) {
                        return obj2;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mTicketPunchedEvent = (AppNotification.PunchNotification.MTicketPunchedEvent) notificationDisplayDataManagerImpl$mTicketNotificationDisplayData$1.L$0;
                ResultKt.b(obj);
            }
            AppNotification.PunchNotification.MTicketPunchedEvent mTicketPunchedEvent2 = mTicketPunchedEvent;
            return new NotificationDisplayData(5, mTicketPunchedEvent2, new HomeArgs((String) null, (String) null, 7), mTicketPunchedEvent2.f6542a, mTicketPunchedEvent2.b);
        } catch (Exception e) {
            this.g.i(e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(MTicketTripReceipt mTicketTripReceipt, ContinuationImpl continuationImpl) {
        NotificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1 notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1;
        AnalyticsContract analyticsContract;
        Object objC;
        Map map;
        Map map2;
        if (continuationImpl instanceof NotificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1) {
            notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1 = (NotificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1) continuationImpl;
            int i = notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1 = new NotificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1(this, continuationImpl);
            }
        } else {
            notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1 = new NotificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1(this, continuationImpl);
        }
        Object obj = notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
            MixpanelUtil.b(linkedHashMap, mTicketTripReceipt);
            notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1.L$0 = mTicketTripReceipt;
            analyticsContract = this.d;
            notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1.L$1 = analyticsContract;
            notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1.L$2 = linkedHashMap;
            notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1.L$3 = linkedHashMap;
            notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1.label = 1;
            objC = this.e.c(notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            map = linkedHashMap;
            map2 = linkedHashMap;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map3 = (Map) notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1.L$3;
            Map map4 = (Map) notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1.L$2;
            analyticsContract = (AnalyticsContract) notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1.L$1;
            MTicketTripReceipt mTicketTripReceipt2 = (MTicketTripReceipt) notificationDisplayDataManagerImpl$raiseMTicketPunchNotificationReceivedPosted$1.L$0;
            ResultKt.b(obj);
            map2 = map3;
            mTicketTripReceipt = mTicketTripReceipt2;
            objC = obj;
            map = map4;
        }
        AnalyticsContract analyticsContract2 = analyticsContract;
        map2.put("punch notification delay", new Long(((Number) objC).longValue() - mTicketTripReceipt.c));
        AnalyticsContractImplKt.b(analyticsContract2, "mTicket punch notification posted", Source.NOTIFICATION, map, false, 24);
        return Unit.f17538a;
    }
}
