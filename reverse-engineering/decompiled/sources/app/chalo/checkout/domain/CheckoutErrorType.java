package app.chalo.checkout.domain;

import defpackage.b3;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/checkout/domain/CheckoutErrorType;", "", "Unknown", "UnknownPaymentProvider", "ResponseParsing", "API", "Local", "InvalidData", "Lapp/chalo/checkout/domain/CheckoutErrorType$API;", "Lapp/chalo/checkout/domain/CheckoutErrorType$InvalidData;", "Lapp/chalo/checkout/domain/CheckoutErrorType$Local;", "Lapp/chalo/checkout/domain/CheckoutErrorType$ResponseParsing;", "Lapp/chalo/checkout/domain/CheckoutErrorType$Unknown;", "Lapp/chalo/checkout/domain/CheckoutErrorType$UnknownPaymentProvider;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CheckoutErrorType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1364a;
    public final Integer b;
    public final boolean c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/CheckoutErrorType$API;", "Lapp/chalo/checkout/domain/CheckoutErrorType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class API extends CheckoutErrorType {
        public final String d;
        public final Integer e;
        public final boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public API(String msg, Integer num, boolean z) {
            super(msg, num, z);
            Intrinsics.i(msg, "msg");
            this.d = msg;
            this.e = num;
            this.f = z;
        }

        @Override // app.chalo.checkout.domain.CheckoutErrorType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getB() {
            return this.e;
        }

        @Override // app.chalo.checkout.domain.CheckoutErrorType
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getC() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof API)) {
                return false;
            }
            API api = (API) obj;
            return Intrinsics.d(this.d, api.d) && Intrinsics.d(this.e, api.e) && this.f == api.f;
        }

        public final int hashCode() {
            int iHashCode = this.d.hashCode() * 31;
            Integer num = this.e;
            return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + (this.f ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("API(msg=");
            sb.append(this.d);
            sb.append(", errorCode=");
            sb.append(this.e);
            sb.append(", shouldShowServerErrorMsg=");
            return b3.g(")", sb, this.f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/CheckoutErrorType$InvalidData;", "Lapp/chalo/checkout/domain/CheckoutErrorType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidData extends CheckoutErrorType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidData);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "InvalidData(msg=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/CheckoutErrorType$Local;", "Lapp/chalo/checkout/domain/CheckoutErrorType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Local extends CheckoutErrorType {
        public final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Local(String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.d = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Local) && Intrinsics.d(this.d, ((Local) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return vo1.B("Local(msg=", this.d, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/CheckoutErrorType$ResponseParsing;", "Lapp/chalo/checkout/domain/CheckoutErrorType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseParsing extends CheckoutErrorType {
        public static final ResponseParsing d = new ResponseParsing("Something went wrong while parsing response");
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/CheckoutErrorType$Unknown;", "Lapp/chalo/checkout/domain/CheckoutErrorType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends CheckoutErrorType {
        public final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.d = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.d(this.d, ((Unknown) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return vo1.B("Unknown(msg=", this.d, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/CheckoutErrorType$UnknownPaymentProvider;", "Lapp/chalo/checkout/domain/CheckoutErrorType;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnknownPaymentProvider extends CheckoutErrorType {
        public static final UnknownPaymentProvider d = new UnknownPaymentProvider("Unknown payment provider");
    }

    public /* synthetic */ CheckoutErrorType(String str) {
        this(str, null, false);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public Integer getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getC() {
        return this.c;
    }

    public CheckoutErrorType(String str, Integer num, boolean z) {
        this.f1364a = str;
        this.b = num;
        this.c = z;
    }
}
