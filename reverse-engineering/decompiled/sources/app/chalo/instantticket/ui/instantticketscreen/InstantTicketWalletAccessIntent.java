package app.chalo.instantticket.ui.instantticketscreen;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessIntent;", "", "PayUsingWalletClicked", "ProceedBtnClicked", "ViewStartedIntent", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessIntent$PayUsingWalletClicked;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessIntent$ProceedBtnClicked;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessIntent$ViewStartedIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InstantTicketWalletAccessIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessIntent$PayUsingWalletClicked;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PayUsingWalletClicked extends InstantTicketWalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3955a;

        public PayUsingWalletClicked(String amountEnteredInRupee) {
            Intrinsics.i(amountEnteredInRupee, "amountEnteredInRupee");
            this.f3955a = amountEnteredInRupee;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PayUsingWalletClicked) && Intrinsics.d(this.f3955a, ((PayUsingWalletClicked) obj).f3955a);
        }

        public final int hashCode() {
            return this.f3955a.hashCode();
        }

        public final String toString() {
            return vo1.B("PayUsingWalletClicked(amountEnteredInRupee=", this.f3955a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessIntent$ProceedBtnClicked;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProceedBtnClicked extends InstantTicketWalletAccessIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProceedBtnClicked);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ProceedBtnClicked(amountEnteredInRupee=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessIntent$ViewStartedIntent;", "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewStartedIntent extends InstantTicketWalletAccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewStartedIntent f3956a = new ViewStartedIntent();
    }
}
