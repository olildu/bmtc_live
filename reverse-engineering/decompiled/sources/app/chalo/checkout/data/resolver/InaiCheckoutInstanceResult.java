package app.chalo.checkout.data.resolver;

import app.chalo.checkout.paymentprovider.inai.InaiSdkCheckout;
import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/checkout/data/resolver/InaiCheckoutInstanceResult;", "", InitializationStatus.SUCCESS, "Failure", "NotInitialised", "Lapp/chalo/checkout/data/resolver/InaiCheckoutInstanceResult$Failure;", "Lapp/chalo/checkout/data/resolver/InaiCheckoutInstanceResult$NotInitialised;", "Lapp/chalo/checkout/data/resolver/InaiCheckoutInstanceResult$Success;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InaiCheckoutInstanceResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/resolver/InaiCheckoutInstanceResult$Failure;", "Lapp/chalo/checkout/data/resolver/InaiCheckoutInstanceResult;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure extends InaiCheckoutInstanceResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1354a;

        public Failure(String str) {
            this.f1354a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && Intrinsics.d(this.f1354a, ((Failure) obj).f1354a);
        }

        public final int hashCode() {
            return this.f1354a.hashCode();
        }

        public final String toString() {
            return vo1.B("Failure(errorMsg=", this.f1354a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/resolver/InaiCheckoutInstanceResult$NotInitialised;", "Lapp/chalo/checkout/data/resolver/InaiCheckoutInstanceResult;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotInitialised extends InaiCheckoutInstanceResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotInitialised f1355a = new NotInitialised();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/resolver/InaiCheckoutInstanceResult$Success;", "Lapp/chalo/checkout/data/resolver/InaiCheckoutInstanceResult;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends InaiCheckoutInstanceResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InaiSdkCheckout f1356a;

        public Success(InaiSdkCheckout inaiCheckout) {
            Intrinsics.i(inaiCheckout, "inaiCheckout");
            this.f1356a = inaiCheckout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f1356a, ((Success) obj).f1356a);
        }

        public final int hashCode() {
            return this.f1356a.hashCode();
        }

        public final String toString() {
            return "Success(inaiCheckout=" + this.f1356a + ")";
        }
    }
}
