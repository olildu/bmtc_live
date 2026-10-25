package app.chalo.citydata.domain;

import app.chalo.citydata.data.error.RemoteDataErrorType;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/citydata/domain/RoutesDataFetchErrorType;", "", "Remote", "CityUnavailable", "RouteNotAvailable", "Lapp/chalo/citydata/domain/RoutesDataFetchErrorType$CityUnavailable;", "Lapp/chalo/citydata/domain/RoutesDataFetchErrorType$Remote;", "Lapp/chalo/citydata/domain/RoutesDataFetchErrorType$RouteNotAvailable;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RoutesDataFetchErrorType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/RoutesDataFetchErrorType$CityUnavailable;", "Lapp/chalo/citydata/domain/RoutesDataFetchErrorType;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CityUnavailable extends RoutesDataFetchErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1765a;

        public CityUnavailable(String msg) {
            Intrinsics.i(msg, "msg");
            this.f1765a = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CityUnavailable) && Intrinsics.d(this.f1765a, ((CityUnavailable) obj).f1765a);
        }

        public final int hashCode() {
            return this.f1765a.hashCode();
        }

        public final String toString() {
            return vo1.B("CityUnavailable(msg=", this.f1765a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/RoutesDataFetchErrorType$Remote;", "Lapp/chalo/citydata/domain/RoutesDataFetchErrorType;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Remote extends RoutesDataFetchErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RemoteDataErrorType f1766a;

        public Remote(RemoteDataErrorType remoteDataErrorType) {
            this.f1766a = remoteDataErrorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Remote) && Intrinsics.d(this.f1766a, ((Remote) obj).f1766a);
        }

        public final int hashCode() {
            return this.f1766a.hashCode();
        }

        public final String toString() {
            return "Remote(type=" + this.f1766a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/RoutesDataFetchErrorType$RouteNotAvailable;", "Lapp/chalo/citydata/domain/RoutesDataFetchErrorType;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteNotAvailable extends RoutesDataFetchErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1767a;

        public RouteNotAvailable(String msg) {
            Intrinsics.i(msg, "msg");
            this.f1767a = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RouteNotAvailable) && Intrinsics.d(this.f1767a, ((RouteNotAvailable) obj).f1767a);
        }

        public final int hashCode() {
            return this.f1767a.hashCode();
        }

        public final String toString() {
            return vo1.B("RouteNotAvailable(msg=", this.f1767a, ")");
        }
    }
}
