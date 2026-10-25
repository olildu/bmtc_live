package app.chalo.livetracking.frameworklivetracking.data.error;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType;", "", "Unknown", "ResponseParsing", "API", "Local", "Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType$API;", "Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType$Local;", "Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType$ResponseParsing;", "Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType$Unknown;", "Lapp/chalo/livetracking/frameworklivetracking/data/error/SeatOccupancyFetchError;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LiveTrackingRemoteErrorType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType$API;", "Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class API extends LiveTrackingRemoteErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4220a;
        public final Integer b;

        public API(String msg, Integer num) {
            Intrinsics.i(msg, "msg");
            this.f4220a = msg;
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
            return Intrinsics.d(this.f4220a, api.f4220a) && Intrinsics.d(this.b, api.b);
        }

        public final int hashCode() {
            int iHashCode = this.f4220a.hashCode() * 31;
            Integer num = this.b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "API(msg=" + this.f4220a + ", errorCode=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType$Local;", "Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Local extends LiveTrackingRemoteErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4221a;

        public Local(String str) {
            this.f4221a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Local) && Intrinsics.d(this.f4221a, ((Local) obj).f4221a);
        }

        public final int hashCode() {
            return this.f4221a.hashCode();
        }

        public final String toString() {
            return vo1.B("Local(msg=", this.f4221a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType$ResponseParsing;", "Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseParsing extends LiveTrackingRemoteErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResponseParsing f4222a = new ResponseParsing();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType$Unknown;", "Lapp/chalo/livetracking/frameworklivetracking/data/error/LiveTrackingRemoteErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends LiveTrackingRemoteErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4223a;

        public Unknown(String str) {
            this.f4223a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.d(this.f4223a, ((Unknown) obj).f4223a);
        }

        public final int hashCode() {
            return this.f4223a.hashCode();
        }

        public final String toString() {
            return vo1.B("Unknown(msg=", this.f4223a, ")");
        }
    }
}
