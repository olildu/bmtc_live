package app.chalo.resultstatemanager.checkout;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.dd;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/resultstatemanager/checkout/CheckoutResultState;", "", InitializationStatus.SUCCESS, "Failed", "Lapp/chalo/resultstatemanager/checkout/CheckoutResultState$Failed;", "Lapp/chalo/resultstatemanager/checkout/CheckoutResultState$Success;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CheckoutResultState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/resultstatemanager/checkout/CheckoutResultState$Failed;", "Lapp/chalo/resultstatemanager/checkout/CheckoutResultState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failed extends CheckoutResultState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Failed f9054a = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return 1722140236;
        }

        public final String toString() {
            return "Failed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/resultstatemanager/checkout/CheckoutResultState$Success;", "Lapp/chalo/resultstatemanager/checkout/CheckoutResultState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends CheckoutResultState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9055a;
        public final String b;
        public final String c;
        public final String d;

        public Success(String str, String str2, String str3, String str4) {
            this.f9055a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.d(this.f9055a, success.f9055a) && Intrinsics.d(this.b, success.b) && Intrinsics.d(this.c, success.c) && Intrinsics.d(this.d, success.d);
        }

        public final int hashCode() {
            int iHashCode = this.f9055a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return r30.i(dd.e("Success(paymentMode=", this.f9055a, ", qrCode=", this.b, ", tone="), this.c, ", bookingId=", this.d, ")");
        }
    }
}
