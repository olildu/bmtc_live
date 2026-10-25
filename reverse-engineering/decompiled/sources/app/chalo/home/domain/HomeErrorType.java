package app.chalo.home.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/domain/HomeErrorType;", "", "Unknown", "API", "Lapp/chalo/home/domain/HomeErrorType$API;", "Lapp/chalo/home/domain/HomeErrorType$Unknown;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class HomeErrorType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/HomeErrorType$API;", "Lapp/chalo/home/domain/HomeErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class API extends HomeErrorType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof API);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "API(msg=null, errorCode=null, shouldShowServerErrorMsg=false)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/HomeErrorType$Unknown;", "Lapp/chalo/home/domain/HomeErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends HomeErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3052a;

        public Unknown(String msg) {
            Intrinsics.i(msg, "msg");
            this.f3052a = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.d(this.f3052a, ((Unknown) obj).f3052a);
        }

        public final int hashCode() {
            return this.f3052a.hashCode();
        }

        public final String toString() {
            return vo1.B("Unknown(msg=", this.f3052a, ")");
        }
    }
}
