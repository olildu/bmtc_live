package app.chalo.premiumbus.domain;

import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError;", "", "Local", "ResponseParsing", "Unknown", "API", "BookingWindowOverlapping", "GenderMismatchError", "FareMappingError", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$API;", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$BookingWindowOverlapping;", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$FareMappingError;", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$GenderMismatchError;", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$Local;", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$ResponseParsing;", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$Unknown;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusOrderCreationError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7220a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$API;", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class API extends PremiumBusOrderCreationError {
        public final String c;
        public final Integer d;

        public API(String str, Integer num) {
            super(num != null ? num.intValue() : 103, str);
            this.c = str;
            this.d = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof API)) {
                return false;
            }
            API api = (API) obj;
            return Intrinsics.d(this.c, api.c) && Intrinsics.d(this.d, api.d);
        }

        public final int hashCode() {
            String str = this.c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.d;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "API(message=" + this.c + ", errorCode=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$BookingWindowOverlapping;", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BookingWindowOverlapping extends PremiumBusOrderCreationError {
        public final String c;
        public final int d;

        public BookingWindowOverlapping(String str, int i) {
            super(i, str);
            this.c = str;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookingWindowOverlapping)) {
                return false;
            }
            BookingWindowOverlapping bookingWindowOverlapping = (BookingWindowOverlapping) obj;
            return Intrinsics.d(this.c, bookingWindowOverlapping.c) && this.d == bookingWindowOverlapping.d;
        }

        public final int hashCode() {
            return (this.c.hashCode() * 31) + this.d;
        }

        public final String toString() {
            return xs.i(this.d, "BookingWindowOverlapping(message=", this.c, ", errorCode=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$FareMappingError;", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareMappingError extends PremiumBusOrderCreationError {
        public final String c;
        public final Long d;
        public final int e;
        public final String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FareMappingError(int i, Long l, String str, String message) {
            super(i, message);
            Intrinsics.i(message, "message");
            this.c = str;
            this.d = l;
            this.e = i;
            this.f = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FareMappingError)) {
                return false;
            }
            FareMappingError fareMappingError = (FareMappingError) obj;
            return Intrinsics.d(this.c, fareMappingError.c) && Intrinsics.d(this.d, fareMappingError.d) && this.e == fareMappingError.e && Intrinsics.d(this.f, fareMappingError.f);
        }

        public final int hashCode() {
            String str = this.c;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.d;
            return this.f.hashCode() + ((((iHashCode + (l != null ? l.hashCode() : 0)) * 31) + this.e) * 31);
        }

        public final String toString() {
            return "FareMappingError(errorTitle=" + this.c + ", effectiveFare=" + this.d + ", errorCode=" + this.e + ", message=" + this.f + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$GenderMismatchError;", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderMismatchError extends PremiumBusOrderCreationError {
        public final String c;
        public final int d;

        public GenderMismatchError(String str, int i) {
            super(i, str);
            this.c = str;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenderMismatchError)) {
                return false;
            }
            GenderMismatchError genderMismatchError = (GenderMismatchError) obj;
            return Intrinsics.d(this.c, genderMismatchError.c) && this.d == genderMismatchError.d;
        }

        public final int hashCode() {
            return (this.c.hashCode() * 31) + this.d;
        }

        public final String toString() {
            return xs.i(this.d, "GenderMismatchError(message=", this.c, ", errorCode=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$Local;", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Local extends PremiumBusOrderCreationError {
        public final String c;

        public Local(String str) {
            super(102, str);
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Local) && Intrinsics.d(this.c, ((Local) obj).c);
        }

        public final int hashCode() {
            String str = this.c;
            return ((str == null ? 0 : str.hashCode()) * 31) + 102;
        }

        public final String toString() {
            return vo1.B("Local(message=", this.c, ", errorCode=102)");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$ResponseParsing;", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseParsing extends PremiumBusOrderCreationError {
        public static final ResponseParsing c = new ResponseParsing(100, "");
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError$Unknown;", "Lapp/chalo/premiumbus/domain/PremiumBusOrderCreationError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends PremiumBusOrderCreationError {
        public final String c;

        public Unknown(String str) {
            super(105, str);
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.d(this.c, ((Unknown) obj).c);
        }

        public final int hashCode() {
            String str = this.c;
            return ((str == null ? 0 : str.hashCode()) * 31) + 105;
        }

        public final String toString() {
            return vo1.B("Unknown(message=", this.c, ", errorCode=105)");
        }
    }

    public PremiumBusOrderCreationError(int i, String str) {
        this.f7220a = i;
        this.b = str;
    }
}
