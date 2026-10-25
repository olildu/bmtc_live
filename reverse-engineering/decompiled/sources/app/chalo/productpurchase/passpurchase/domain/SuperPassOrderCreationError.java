package app.chalo.productpurchase.passpurchase.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/SuperPassOrderCreationError;", "", "LocalError", "OrderCreationFailed", "GenericError", "Companion", "Lapp/chalo/productpurchase/passpurchase/domain/SuperPassOrderCreationError$GenericError;", "Lapp/chalo/productpurchase/passpurchase/domain/SuperPassOrderCreationError$LocalError;", "Lapp/chalo/productpurchase/passpurchase/domain/SuperPassOrderCreationError$OrderCreationFailed;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SuperPassOrderCreationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8341a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/SuperPassOrderCreationError$Companion;", "", "", "ERROR_TYPE_OFFER_ALREADY_AVAILED", "I", "ERROR_TYPE_PASS_DYNAMIC_FARE_UPDATED", "ERROR_TYPE_PASS_FARE_MAPPING_FAILED", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/SuperPassOrderCreationError$GenericError;", "Lapp/chalo/productpurchase/passpurchase/domain/SuperPassOrderCreationError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenericError extends SuperPassOrderCreationError {
        public final String b;

        public GenericError(String str) {
            super(str);
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenericError) && Intrinsics.d(this.b, ((GenericError) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("GenericError(errorMsg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/SuperPassOrderCreationError$LocalError;", "Lapp/chalo/productpurchase/passpurchase/domain/SuperPassOrderCreationError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocalError extends SuperPassOrderCreationError {
        public final String b;

        public LocalError(String str) {
            super(str);
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalError) && Intrinsics.d(this.b, ((LocalError) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("LocalError(errorMsg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/SuperPassOrderCreationError$OrderCreationFailed;", "Lapp/chalo/productpurchase/passpurchase/domain/SuperPassOrderCreationError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderCreationFailed extends SuperPassOrderCreationError {
        public final String b;
        public final Integer c;
        public final String d;
        public final Long e;

        public OrderCreationFailed(String str, Integer num, String str2, Long l) {
            super(str);
            this.b = str;
            this.c = num;
            this.d = str2;
            this.e = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderCreationFailed)) {
                return false;
            }
            OrderCreationFailed orderCreationFailed = (OrderCreationFailed) obj;
            return Intrinsics.d(this.b, orderCreationFailed.b) && Intrinsics.d(this.c, orderCreationFailed.c) && Intrinsics.d(this.d, orderCreationFailed.d) && Intrinsics.d(this.e, orderCreationFailed.e);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            Integer num = this.c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.d;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.e;
            return iHashCode3 + (l != null ? l.hashCode() : 0);
        }

        public final String toString() {
            return "OrderCreationFailed(errorMsg=" + this.b + ", errorCode=" + this.c + ", errorTitle=" + this.d + ", effectiveFare=" + this.e + ")";
        }
    }

    public SuperPassOrderCreationError(String str) {
        this.f8341a = str;
    }
}
