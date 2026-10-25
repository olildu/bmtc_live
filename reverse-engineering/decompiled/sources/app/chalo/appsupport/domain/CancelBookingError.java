package app.chalo.appsupport.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/appsupport/domain/CancelBookingError;", "", "Local", "API", "ResponseParsing", "Unknown", "Lapp/chalo/appsupport/domain/CancelBookingError$API;", "Lapp/chalo/appsupport/domain/CancelBookingError$Local;", "Lapp/chalo/appsupport/domain/CancelBookingError$ResponseParsing;", "Lapp/chalo/appsupport/domain/CancelBookingError$Unknown;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CancelBookingError {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/domain/CancelBookingError$API;", "Lapp/chalo/appsupport/domain/CancelBookingError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class API extends CancelBookingError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f983a;
        public final Integer b;

        public API(String message, Integer num) {
            Intrinsics.i(message, "message");
            this.f983a = message;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof API)) {
                return false;
            }
            API api = (API) obj;
            return Intrinsics.d(this.f983a, api.f983a) && Intrinsics.d(this.b, api.b);
        }

        public final int hashCode() {
            int iHashCode = this.f983a.hashCode() * 31;
            Integer num = this.b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "API(message=" + this.f983a + ", errorCode=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/domain/CancelBookingError$Local;", "Lapp/chalo/appsupport/domain/CancelBookingError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Local extends CancelBookingError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f984a;

        public Local(String str) {
            this.f984a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Local) && Intrinsics.d(this.f984a, ((Local) obj).f984a);
        }

        public final int hashCode() {
            String str = this.f984a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Local(message=", this.f984a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/domain/CancelBookingError$ResponseParsing;", "Lapp/chalo/appsupport/domain/CancelBookingError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseParsing extends CancelBookingError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResponseParsing f985a = new ResponseParsing();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/domain/CancelBookingError$Unknown;", "Lapp/chalo/appsupport/domain/CancelBookingError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends CancelBookingError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f986a;

        public Unknown(String str) {
            this.f986a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.d(this.f986a, ((Unknown) obj).f986a);
        }

        public final int hashCode() {
            String str = this.f986a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Unknown(message=", this.f986a, ")");
        }
    }
}
