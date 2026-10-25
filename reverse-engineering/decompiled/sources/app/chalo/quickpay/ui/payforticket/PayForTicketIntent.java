package app.chalo.quickpay.ui.payforticket;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent;", "", "InitialIntent", "NavigateToQuickPayIntent", "NavigateToTicketBookingIntent", "NavigateToWalletBalanceIntent", "Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent$InitialIntent;", "Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent$NavigateToQuickPayIntent;", "Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent$NavigateToTicketBookingIntent;", "Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent$NavigateToWalletBalanceIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PayForTicketIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent$InitialIntent;", "Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialIntent extends PayForTicketIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8886a;

        public InitialIntent(String str) {
            this.f8886a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialIntent) && Intrinsics.d(this.f8886a, ((InitialIntent) obj).f8886a);
        }

        public final int hashCode() {
            String str = this.f8886a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("InitialIntent(routeJsonString=", this.f8886a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent$NavigateToQuickPayIntent;", "Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToQuickPayIntent extends PayForTicketIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToQuickPayIntent f8887a = new NavigateToQuickPayIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent$NavigateToTicketBookingIntent;", "Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToTicketBookingIntent extends PayForTicketIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToTicketBookingIntent f8888a = new NavigateToTicketBookingIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent$NavigateToWalletBalanceIntent;", "Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToWalletBalanceIntent extends PayForTicketIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToWalletBalanceIntent f8889a = new NavigateToWalletBalanceIntent();
    }
}
