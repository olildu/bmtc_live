package app.chalo.deeplink;

import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DeepLinkActionResolverKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2443a;

        static {
            int[] iArr = new int[DeepLinkLastSegment.values().length];
            try {
                iArr[DeepLinkLastSegment.HomeScreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeepLinkLastSegment.Availability.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeepLinkLastSegment.Support.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeepLinkLastSegment.BookPass.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeepLinkLastSegment.BookProduct.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DeepLinkLastSegment.BookTicket.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DeepLinkLastSegment.OpenChaloPay.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DeepLinkLastSegment.OpenWalletRecharge.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DeepLinkLastSegment.OpenWalletBalance.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[DeepLinkLastSegment.OpenWalletAllTransactions.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[DeepLinkLastSegment.OpenPayForTicket.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[DeepLinkLastSegment.OpenRouteSearch.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[DeepLinkLastSegment.OpenRouteSearchPremium.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[DeepLinkLastSegment.OpenChaloBusPass.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[DeepLinkLastSegment.OpenCardExperience.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[DeepLinkLastSegment.StopTripDetails.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[DeepLinkLastSegment.RouteDetails.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[DeepLinkLastSegment.HomeTab.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[DeepLinkLastSegment.RegularBusTab.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[DeepLinkLastSegment.ChaloBusTab.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[DeepLinkLastSegment.MyTicketsTab.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[DeepLinkLastSegment.ShowPass.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[DeepLinkLastSegment.PbPassPurchaseLandingScreen.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[DeepLinkLastSegment.PremiumPlotlineNotification.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[DeepLinkLastSegment.Unknown.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[DeepLinkLastSegment.TicketSummaryScreen.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[DeepLinkLastSegment.PassSummaryScreen.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[DeepLinkLastSegment.MetroBooking.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            f2443a = iArr;
        }
    }

    public static final DeepLinkAction.LaunchSummaryScreen a(DeepLinkUri deepLinkUri) {
        MapBuilder mapBuilder = deepLinkUri.e;
        return new DeepLinkAction.LaunchSummaryScreen((String) mapBuilder.get("id"), (String) mapBuilder.get("productType"), (String) mapBuilder.get("productSubType"), (String) mapBuilder.get("transactionId"));
    }
}
