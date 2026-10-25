package app.chalo.premiumbus.ui.faredetails.contract;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchError;", "", "DelegateFailed", "TimedOut", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchError$DelegateFailed;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchError$TimedOut;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusFareDetailsSwitchError {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchError$DelegateFailed;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DelegateFailed extends PremiumBusFareDetailsSwitchError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7608a;

        public DelegateFailed(String message) {
            Intrinsics.i(message, "message");
            this.f7608a = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DelegateFailed) && Intrinsics.d(this.f7608a, ((DelegateFailed) obj).f7608a);
        }

        public final int hashCode() {
            return this.f7608a.hashCode();
        }

        public final String toString() {
            return vo1.B("DelegateFailed(message=", this.f7608a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchError$TimedOut;", "Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsSwitchError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimedOut extends PremiumBusFareDetailsSwitchError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimedOut f7609a = new TimedOut();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TimedOut);
        }

        public final int hashCode() {
            return 2134428299;
        }

        public final String toString() {
            return "TimedOut";
        }
    }
}
