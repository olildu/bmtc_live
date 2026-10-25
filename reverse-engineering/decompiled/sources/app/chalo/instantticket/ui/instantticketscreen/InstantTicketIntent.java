package app.chalo.instantticket.ui.instantticketscreen;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent;", "", "InitialIntent", "AmountEnteredIntent", "OnlinePaymentOptionClicked", "FindTicketFareClicked", "NavigateToWalletBalanceIntent", "NavigateToHistoryScreenIntent", "OnStoppedIntent", "CancelOrderApiIntent", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$AmountEnteredIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$CancelOrderApiIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$FindTicketFareClicked;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$InitialIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$NavigateToHistoryScreenIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$NavigateToWalletBalanceIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$OnStoppedIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$OnlinePaymentOptionClicked;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InstantTicketIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$AmountEnteredIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AmountEnteredIntent extends InstantTicketIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AmountEnteredIntent);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "AmountEnteredIntent(amountInCurrency=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$CancelOrderApiIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CancelOrderApiIntent extends InstantTicketIntent {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$FindTicketFareClicked;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FindTicketFareClicked extends InstantTicketIntent {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$InitialIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InitialIntent extends InstantTicketIntent {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$NavigateToHistoryScreenIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToHistoryScreenIntent extends InstantTicketIntent {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$NavigateToWalletBalanceIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToWalletBalanceIntent extends InstantTicketIntent {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$OnStoppedIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnStoppedIntent extends InstantTicketIntent {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent$OnlinePaymentOptionClicked;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnlinePaymentOptionClicked extends InstantTicketIntent {
    }
}
