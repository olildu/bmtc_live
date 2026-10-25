package app.chalo.features.checkout;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lapp/chalo/features/checkout/CheckoutProductType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "SUPER_PASS_RIDE_PASS", "SUPER_PASS_MAGIC_PASS", "ELECTRICITY_BILL", "CARD_RECHARGE", "WALLET", "NCMC", "INSTANT_TICKET", "PREMIUM_RESERVE_TICKET", "ONDC_TICKET", "ONDC_METRO_TICKET", "METRO_TICKET", "M_TICKET", "MULTI_MODAL_GROUP_TICKET", "UNKNOWN", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum CheckoutProductType {
    SUPER_PASS_RIDE_PASS("pass"),
    SUPER_PASS_MAGIC_PASS("pass"),
    ELECTRICITY_BILL("electricityBill"),
    CARD_RECHARGE("cardRecharge"),
    WALLET("mobileWallet"),
    NCMC("ncmcCardRecharge"),
    INSTANT_TICKET("instantTicket"),
    PREMIUM_RESERVE_TICKET("premiumReserveTicket"),
    ONDC_TICKET("ondcTicket"),
    ONDC_METRO_TICKET("ondcMetroTicket"),
    METRO_TICKET("metroTicket"),
    M_TICKET("ticket"),
    MULTI_MODAL_GROUP_TICKET("multiModalGroupTicket"),
    UNKNOWN("unknown");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final String type;

    CheckoutProductType(String str) {
        this.type = str;
    }

    public static EnumEntries<CheckoutProductType> getEntries() {
        return $ENTRIES;
    }

    public final String getType() {
        return this.type;
    }
}
