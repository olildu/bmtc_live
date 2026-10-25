package app.chalo.checkout.ui.screen.checkout.inai;

import com.inmobi.unification.sdk.InitializationStatus;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent;", "", "InitialiseInaiIntent", "PaymentCompletedIntent", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent$InitialiseInaiIntent;", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent$PaymentCompletedIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InaiCheckoutViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent$InitialiseInaiIntent;", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InitialiseInaiIntent extends InaiCheckoutViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitialiseInaiIntent f1474a = new InitialiseInaiIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent$PaymentCompletedIntent;", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent;", InitializationStatus.SUCCESS, "Failed", "Cancelled", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent$PaymentCompletedIntent$Cancelled;", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent$PaymentCompletedIntent$Failed;", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent$PaymentCompletedIntent$Success;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PaymentCompletedIntent extends InaiCheckoutViewIntent {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent$PaymentCompletedIntent$Cancelled;", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent$PaymentCompletedIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Cancelled extends PaymentCompletedIntent {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LinkedHashMap f1475a;

            public Cancelled(LinkedHashMap linkedHashMap) {
                this.f1475a = linkedHashMap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Cancelled) && this.f1475a.equals(((Cancelled) obj).f1475a);
            }

            public final int hashCode() {
                return this.f1475a.hashCode();
            }

            public final String toString() {
                return "Cancelled(result=" + this.f1475a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent$PaymentCompletedIntent$Failed;", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent$PaymentCompletedIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Failed extends PaymentCompletedIntent {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LinkedHashMap f1476a;

            public Failed(LinkedHashMap linkedHashMap) {
                this.f1476a = linkedHashMap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && this.f1476a.equals(((Failed) obj).f1476a);
            }

            public final int hashCode() {
                return this.f1476a.hashCode();
            }

            public final String toString() {
                return "Failed(result=" + this.f1476a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent$PaymentCompletedIntent$Success;", "Lapp/chalo/checkout/ui/screen/checkout/inai/InaiCheckoutViewIntent$PaymentCompletedIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends PaymentCompletedIntent {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LinkedHashMap f1477a;

            public Success(LinkedHashMap linkedHashMap) {
                this.f1477a = linkedHashMap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && this.f1477a.equals(((Success) obj).f1477a);
            }

            public final int hashCode() {
                return this.f1477a.hashCode();
            }

            public final String toString() {
                return "Success(result=" + this.f1477a + ")";
            }
        }
    }
}
