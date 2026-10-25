package app.chalo.deeplink;

import app.chalo.chalocard.ChaloCardEntryDestination;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.hq0;
import io.ktor.http.CodecsKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/deeplink/DeepLinkRuntime;", "", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeepLinkRuntime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedChannel f2469a;
    public final Flow b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/deeplink/DeepLinkRuntime$Companion;", "", "", "TAG", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public DeepLinkRuntime(DeepLinkCoordinator deepLinkCoordinator) {
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 6, null);
        this.f2469a = bufferedChannelA;
        this.b = FlowKt.D(bufferedChannelA);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:149:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:16:0x0022  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b1  */
    public final boolean a(DeepLinkResolutionRequest deepLinkResolutionRequest) {
        DeepLinkUri deepLinkUri;
        DeepLinkLastSegment next;
        DeepLinkParseResult deepLinkParseResult;
        ArrayList arrayList;
        String str;
        Object objA;
        String str2 = deepLinkResolutionRequest.f2460a;
        if (str2 == null || StringsKt.F(str2)) {
            deepLinkUri = null;
        } else {
            try {
                objA = URLUtilsKt.a(str2);
            } catch (Throwable th) {
                objA = ResultKt.a(th);
            }
            if (objA instanceof Result.Failure) {
                objA = null;
            }
            Url url = (Url) objA;
            if (url == null) {
                deepLinkUri = null;
            } else {
                List listR = url.r();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listR) {
                    if (!StringsKt.F((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    arrayList3.add(CodecsKt.c((String) obj2));
                }
                MapBuilder mapBuilder = new MapBuilder();
                for (String str3 : url.getParameters().names()) {
                    mapBuilder.put(str3, url.getParameters().get(str3));
                }
                deepLinkUri = new DeepLinkUri(str2, url.getProtocol().getName(), url.getHost(), arrayList3, mapBuilder.h());
            }
        }
        if (deepLinkUri == null) {
            deepLinkParseResult = null;
        } else {
            MapBuilder mapBuilder2 = deepLinkUri.e;
            String str4 = deepLinkUri.c;
            DeepLinkLastSegment.INSTANCE.getClass();
            String str5 = (String) CollectionsKt.Q(deepLinkUri.d);
            if (str5 == null || StringsKt.F(str5)) {
                str5 = null;
            }
            if (str5 == null) {
                str5 = StringsKt.F(str4) ? null : str4;
            }
            Iterator<DeepLinkLastSegment> it = DeepLinkLastSegment.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(next.getValue(), str5));
            DeepLinkLastSegment deepLinkLastSegment = next;
            if (deepLinkLastSegment == null) {
                deepLinkLastSegment = DeepLinkLastSegment.Unknown;
            }
            String str6 = (String) mapBuilder2.get("attribution");
            if (str6 == null || StringsKt.F(str6)) {
                str6 = null;
            }
            int i2 = DeepLinkActionResolverKt.WhenMappings.f2443a[deepLinkLastSegment.ordinal()];
            DeepLinkAction startPassBooking = DeepLinkAction.StartSplashScreen.f2441a;
            DeepLinkAction.None none = DeepLinkAction.None.f2434a;
            switch (i2) {
                case 1:
                    if (startPassBooking.equals(none) && StringsKt.u(str4, "chalo.com", true)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 2:
                    startPassBooking = DeepLinkAction.FinishActivity.f2425a;
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 3:
                    startPassBooking = DeepLinkAction.SendFeedback.f2435a;
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 4:
                case 5:
                case 6:
                    startPassBooking = new DeepLinkAction.StartPassBooking(mapBuilder2.containsKey("configId") ? (String) mapBuilder2.get("configId") : null, str6);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 7:
                    startPassBooking = new DeepLinkAction.StartInstantTicketOrWallet(DeepLinkWalletDestination.QUICK_PAY);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 8:
                    startPassBooking = new DeepLinkAction.StartWallet(DeepLinkWalletDestination.WALLET_LOAD_MONEY);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 9:
                    startPassBooking = new DeepLinkAction.StartWallet(DeepLinkWalletDestination.WALLET_BALANCE);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 10:
                    startPassBooking = new DeepLinkAction.StartWallet(DeepLinkWalletDestination.ALL_TRANSACTIONS);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 11:
                    startPassBooking = new DeepLinkAction.StartInstantTicketOrWallet(DeepLinkWalletDestination.PAY_FOR_TICKET);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 12:
                case 13:
                    startPassBooking = new DeepLinkAction.StartPremiumBusFlow(DeepLinkPremiumBusDestination.BOOKING, str6);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 14:
                    startPassBooking = new DeepLinkAction.StartPremiumBusFlow(DeepLinkPremiumBusDestination.PASS, str6);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 15:
                    startPassBooking = new DeepLinkAction.StartCardRechargeActivity(ChaloCardEntryDestination.CARD_RECHARGE_BY_ENTERING_CARD_NUMBER_SCREEN);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 16:
                    String str7 = (String) mapBuilder2.get("stop_id");
                    String str8 = str7 == null ? "" : str7;
                    String str9 = (String) mapBuilder2.get("stop_name");
                    String str10 = str9 == null ? "" : str9;
                    ChaloTransitMode.Companion companion = ChaloTransitMode.INSTANCE;
                    String str11 = (String) mapBuilder2.get("mode");
                    if (str11 == null) {
                        str11 = "";
                    }
                    ChaloTransitMode chaloTransitModeB = ChaloTransitMode.Companion.b(companion, str11);
                    String str12 = (String) mapBuilder2.get("source");
                    String str13 = str12 == null ? "" : str12;
                    String str14 = (String) mapBuilder2.get("city");
                    startPassBooking = new DeepLinkAction.LaunchStopTripDetails(new StopTripDetailsDeepLinkData(str8, str10, chaloTransitModeB, str14 == null ? "" : str14, str13, (String) mapBuilder2.get("tag")));
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 17:
                    String str15 = (String) mapBuilder2.get("routeId");
                    if (str15 == null) {
                        str15 = "";
                    }
                    if (!StringsKt.F(str15)) {
                        String str16 = (String) mapBuilder2.get("vehicleNumbers");
                        if (str16 == null) {
                            str16 = "";
                        }
                        if (StringsKt.F(str16)) {
                            arrayList = null;
                        } else {
                            List listV = StringsKt.V(str16, new char[]{','});
                            arrayList = new ArrayList();
                            Iterator it2 = listV.iterator();
                            while (it2.hasNext()) {
                                String string = StringsKt.u0((String) it2.next()).toString();
                                if (string.length() == 0) {
                                    string = null;
                                }
                                if (string != null) {
                                    arrayList.add(string);
                                }
                            }
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                        }
                        String str17 = (String) mapBuilder2.get("stopId");
                        str = str17 != null ? str17 : "";
                        if (StringsKt.F(str)) {
                            str = null;
                        }
                        startPassBooking = new DeepLinkAction.LaunchRouteDetails(new RouteDetailsDeepLinkData(str15, str, arrayList));
                    }
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 18:
                    startPassBooking = new DeepLinkAction.LaunchHomeActivity(DeepLinkHomeTab.HOME, str6);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 19:
                    startPassBooking = new DeepLinkAction.LaunchHomeActivity(DeepLinkHomeTab.REGULAR_BUS, str6);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 20:
                    startPassBooking = new DeepLinkAction.LaunchHomeActivity(DeepLinkHomeTab.CHALO_BUS, str6);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 21:
                case 22:
                    startPassBooking = new DeepLinkAction.LaunchHomeActivity(DeepLinkHomeTab.MY_TICKETS, str6);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 23:
                    String str18 = (String) mapBuilder2.get("configId");
                    str = str18 != null ? str18 : "";
                    String str19 = (String) mapBuilder2.get("isRouteBasedPass");
                    startPassBooking = new DeepLinkAction.LaunchPbPassPurchaseLanding(new PbPassPurchaseLandingDeepLinkData(str, str19 != null ? Boolean.parseBoolean(str19) : false), str6);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 24:
                    startPassBooking = DeepLinkAction.LaunchPremiumPlotlineNotificationScreen.f2429a;
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 25:
                    startPassBooking = none;
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 26:
                    startPassBooking = DeepLinkActionResolverKt.a(deepLinkUri);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 27:
                    startPassBooking = DeepLinkActionResolverKt.a(deepLinkUri);
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                case 28:
                    startPassBooking = DeepLinkAction.LaunchMetroBooking.f2427a;
                    if (startPassBooking.equals(none)) {
                        startPassBooking = DeepLinkAction.LaunchWebActivity.f2433a;
                    }
                    deepLinkParseResult = new DeepLinkParseResult(deepLinkUri, startPassBooking);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        DeepLinkResolutionResult deepLinkResolutionResult = deepLinkParseResult != null ? new DeepLinkResolutionResult(deepLinkResolutionRequest, deepLinkParseResult.f2459a, deepLinkParseResult.b) : null;
        if (deepLinkResolutionResult == null) {
            return false;
        }
        boolean z = true ^ (this.f2469a.mo7576trySendJP2dKIU(deepLinkResolutionResult) instanceof ChannelResult.Failed);
        DeepLinkAction deepLinkAction = deepLinkResolutionResult.c;
        StringBuilder sbM = hq0.m("handle request=", str2, " sent=", " action=", z);
        sbM.append(deepLinkAction);
        String message = sbM.toString();
        Intrinsics.i(message, "message");
        return z;
    }
}
