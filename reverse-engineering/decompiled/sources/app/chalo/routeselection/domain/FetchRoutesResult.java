package app.chalo.routeselection.domain;

import app.chalo.ondc.model.app.OndcRouteSearchResultAppModel;
import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.r1;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/routeselection/domain/FetchRoutesResult;", "", InitializationStatus.SUCCESS, "NoRoutesAvailable", "ServerError", "ResponseParseException", "LocalException", "UnknownException", "CityNotAvailable", "Lapp/chalo/routeselection/domain/FetchRoutesResult$CityNotAvailable;", "Lapp/chalo/routeselection/domain/FetchRoutesResult$LocalException;", "Lapp/chalo/routeselection/domain/FetchRoutesResult$NoRoutesAvailable;", "Lapp/chalo/routeselection/domain/FetchRoutesResult$ResponseParseException;", "Lapp/chalo/routeselection/domain/FetchRoutesResult$ServerError;", "Lapp/chalo/routeselection/domain/FetchRoutesResult$Success;", "Lapp/chalo/routeselection/domain/FetchRoutesResult$UnknownException;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FetchRoutesResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/domain/FetchRoutesResult$CityNotAvailable;", "Lapp/chalo/routeselection/domain/FetchRoutesResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CityNotAvailable extends FetchRoutesResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CityNotAvailable f9180a = new CityNotAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/domain/FetchRoutesResult$LocalException;", "Lapp/chalo/routeselection/domain/FetchRoutesResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocalException extends FetchRoutesResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocalException f9181a = new LocalException();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/domain/FetchRoutesResult$NoRoutesAvailable;", "Lapp/chalo/routeselection/domain/FetchRoutesResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoRoutesAvailable extends FetchRoutesResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoRoutesAvailable f9182a = new NoRoutesAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/domain/FetchRoutesResult$ResponseParseException;", "Lapp/chalo/routeselection/domain/FetchRoutesResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseParseException extends FetchRoutesResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResponseParseException f9183a = new ResponseParseException();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/domain/FetchRoutesResult$ServerError;", "Lapp/chalo/routeselection/domain/FetchRoutesResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends FetchRoutesResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9184a;

        public ServerError(String str) {
            this.f9184a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && Intrinsics.d(this.f9184a, ((ServerError) obj).f9184a);
        }

        public final int hashCode() {
            String str = this.f9184a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ServerError(msg=", this.f9184a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/routeselection/domain/FetchRoutesResult$Success;", "Lapp/chalo/routeselection/domain/FetchRoutesResult;", "Regular", "Ondc", "Lapp/chalo/routeselection/domain/FetchRoutesResult$Success$Ondc;", "Lapp/chalo/routeselection/domain/FetchRoutesResult$Success$Regular;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Success extends FetchRoutesResult {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/domain/FetchRoutesResult$Success$Ondc;", "Lapp/chalo/routeselection/domain/FetchRoutesResult$Success;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Ondc extends Success {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OndcRouteSearchResultAppModel f9185a;

            public Ondc(OndcRouteSearchResultAppModel ondcRouteSearchResultAppModel) {
                this.f9185a = ondcRouteSearchResultAppModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Ondc) && Intrinsics.d(this.f9185a, ((Ondc) obj).f9185a);
            }

            public final int hashCode() {
                return this.f9185a.hashCode();
            }

            public final String toString() {
                return "Ondc(result=" + this.f9185a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/domain/FetchRoutesResult$Success$Regular;", "Lapp/chalo/routeselection/domain/FetchRoutesResult$Success;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Regular extends Success {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f9186a;

            public Regular(List list) {
                this.f9186a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Regular) && Intrinsics.d(this.f9186a, ((Regular) obj).f9186a);
            }

            public final int hashCode() {
                return this.f9186a.hashCode();
            }

            public final String toString() {
                return r1.d("Regular(result=", ")", this.f9186a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/routeselection/domain/FetchRoutesResult$UnknownException;", "Lapp/chalo/routeselection/domain/FetchRoutesResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnknownException extends FetchRoutesResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnknownException f9187a = new UnknownException();
    }
}
