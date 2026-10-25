package app.chalo.metro.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/metro/domain/UpdateMetroBookingFailureReason;", "", "Local", "API", "ResponseParsing", "Unknown", "Lapp/chalo/metro/domain/UpdateMetroBookingFailureReason$API;", "Lapp/chalo/metro/domain/UpdateMetroBookingFailureReason$Local;", "Lapp/chalo/metro/domain/UpdateMetroBookingFailureReason$ResponseParsing;", "Lapp/chalo/metro/domain/UpdateMetroBookingFailureReason$Unknown;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UpdateMetroBookingFailureReason {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/domain/UpdateMetroBookingFailureReason$API;", "Lapp/chalo/metro/domain/UpdateMetroBookingFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class API extends UpdateMetroBookingFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5446a;
        public final Integer b;

        public API(String str, Integer num) {
            this.f5446a = str;
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
            return Intrinsics.d(this.f5446a, api.f5446a) && Intrinsics.d(this.b, api.b);
        }

        public final int hashCode() {
            String str = this.f5446a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "API(message=" + this.f5446a + ", errorCode=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/domain/UpdateMetroBookingFailureReason$Local;", "Lapp/chalo/metro/domain/UpdateMetroBookingFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Local extends UpdateMetroBookingFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5447a;

        public Local(String str) {
            this.f5447a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Local) && Intrinsics.d(this.f5447a, ((Local) obj).f5447a);
        }

        public final int hashCode() {
            String str = this.f5447a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Local(message=", this.f5447a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/domain/UpdateMetroBookingFailureReason$ResponseParsing;", "Lapp/chalo/metro/domain/UpdateMetroBookingFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseParsing extends UpdateMetroBookingFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResponseParsing f5448a = new ResponseParsing();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/domain/UpdateMetroBookingFailureReason$Unknown;", "Lapp/chalo/metro/domain/UpdateMetroBookingFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends UpdateMetroBookingFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5449a;

        public Unknown(String str) {
            this.f5449a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.d(this.f5449a, ((Unknown) obj).f5449a);
        }

        public final int hashCode() {
            String str = this.f5449a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Unknown(message=", this.f5449a, ")");
        }
    }
}
