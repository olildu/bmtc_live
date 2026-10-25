package app.chalo.deeplink;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\b\u0082\u0081\u0002\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001$B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006%"}, d2 = {"Lapp/chalo/deeplink/DeepLinkLastSegment;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "HomeScreen", "Availability", "Support", "BookPass", "BookTicket", "BookProduct", "OpenChaloPay", "OpenWalletRecharge", "OpenPayForTicket", "OpenWalletBalance", "OpenWalletAllTransactions", "OpenRouteSearchPremium", "OpenRouteSearch", "OpenChaloBusPass", "OpenCardExperience", "StopTripDetails", "RouteDetails", "HomeTab", "RegularBusTab", "ChaloBusTab", "MyTicketsTab", "ShowPass", "PbPassPurchaseLandingScreen", "PremiumPlotlineNotification", "Unknown", "TicketSummaryScreen", "PassSummaryScreen", "MetroBooking", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
enum DeepLinkLastSegment {
    HomeScreen("homescreen"),
    Availability("availability"),
    Support("support"),
    BookPass("bookPass"),
    BookTicket("bookTicket"),
    BookProduct("bookProduct"),
    OpenChaloPay("openChaloPay"),
    OpenWalletRecharge("openWalletRecharge"),
    OpenPayForTicket("payForTicket"),
    OpenWalletBalance("walletBalance"),
    OpenWalletAllTransactions("walletAllTransactions"),
    OpenRouteSearchPremium("openRouteSearchPremium"),
    OpenRouteSearch("openRouteSearch"),
    OpenChaloBusPass("openChaloBusPass"),
    OpenCardExperience("openCardExperience"),
    StopTripDetails("stop"),
    RouteDetails("route"),
    HomeTab("home"),
    RegularBusTab("regularBus"),
    ChaloBusTab("chaloBus"),
    MyTicketsTab("tickets"),
    ShowPass("showPass"),
    PbPassPurchaseLandingScreen("pbPassPurchaseLandingScreen"),
    PremiumPlotlineNotification("premiumPlotlineNotification"),
    Unknown("unknown"),
    TicketSummaryScreen("ticketSummaryScreen"),
    PassSummaryScreen("passSummaryScreen"),
    MetroBooking("metro");

    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkLastSegment$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    DeepLinkLastSegment(String str) {
        this.value = str;
    }

    public static EnumEntries<DeepLinkLastSegment> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
