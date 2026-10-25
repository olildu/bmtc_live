package app.chalo.home.ui.chalobusrouteinfo;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoErrorType;", "", "ApiError", "NoRoutesAvailable", "ResetFilter", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoErrorType$ApiError;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoErrorType$NoRoutesAvailable;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoErrorType$ResetFilter;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloBusRouteInfoErrorType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoErrorType$ApiError;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ApiError extends ChaloBusRouteInfoErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3317a;

        public ApiError(String errorMessage) {
            Intrinsics.i(errorMessage, "errorMessage");
            this.f3317a = errorMessage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiError) && Intrinsics.d(this.f3317a, ((ApiError) obj).f3317a);
        }

        public final int hashCode() {
            return this.f3317a.hashCode();
        }

        public final String toString() {
            return vo1.B("ApiError(errorMessage=", this.f3317a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoErrorType$NoRoutesAvailable;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoRoutesAvailable extends ChaloBusRouteInfoErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoRoutesAvailable f3318a = new NoRoutesAvailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoRoutesAvailable);
        }

        public final int hashCode() {
            return 1746399867;
        }

        public final String toString() {
            return "NoRoutesAvailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoErrorType$ResetFilter;", "Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResetFilter extends ChaloBusRouteInfoErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResetFilter f3319a = new ResetFilter();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ResetFilter);
        }

        public final int hashCode() {
            return -2089827516;
        }

        public final String toString() {
            return "ResetFilter";
        }
    }
}
