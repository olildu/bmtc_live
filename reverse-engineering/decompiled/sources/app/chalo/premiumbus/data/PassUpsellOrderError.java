package app.chalo.premiumbus.data;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/data/PassUpsellOrderError;", "", "OfferUnavailable", "OrderCreationFailed", "Local", "Lapp/chalo/premiumbus/data/PassUpsellOrderError$Local;", "Lapp/chalo/premiumbus/data/PassUpsellOrderError$OfferUnavailable;", "Lapp/chalo/premiumbus/data/PassUpsellOrderError$OrderCreationFailed;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PassUpsellOrderError {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/PassUpsellOrderError$Local;", "Lapp/chalo/premiumbus/data/PassUpsellOrderError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Local extends PassUpsellOrderError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6953a;

        public Local(String str) {
            this.f6953a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Local) && Intrinsics.d(this.f6953a, ((Local) obj).f6953a);
        }

        public final int hashCode() {
            String str = this.f6953a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Local(errorMessage=", this.f6953a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/PassUpsellOrderError$OfferUnavailable;", "Lapp/chalo/premiumbus/data/PassUpsellOrderError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OfferUnavailable extends PassUpsellOrderError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OfferUnavailable f6954a = new OfferUnavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OfferUnavailable);
        }

        public final int hashCode() {
            return 2066157775;
        }

        public final String toString() {
            return "OfferUnavailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/PassUpsellOrderError$OrderCreationFailed;", "Lapp/chalo/premiumbus/data/PassUpsellOrderError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderCreationFailed extends PassUpsellOrderError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6955a;
        public final Integer b;

        public OrderCreationFailed(String str, Integer num) {
            this.f6955a = str;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderCreationFailed)) {
                return false;
            }
            OrderCreationFailed orderCreationFailed = (OrderCreationFailed) obj;
            return Intrinsics.d(this.f6955a, orderCreationFailed.f6955a) && Intrinsics.d(this.b, orderCreationFailed.b);
        }

        public final int hashCode() {
            String str = this.f6955a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "OrderCreationFailed(errorMessage=" + this.f6955a + ", errorCode=" + this.b + ")";
        }
    }
}
