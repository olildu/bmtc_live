package app.chalo.home.domain;

import app.chalo.home.data.repository.PremiumBusRemoteRepository;
import app.chalo.location.ChaloLocationManager;
import app.chalo.providers.cityprovider.CityProvider;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/domain/FetchRouteSchedulesUseCase;", "", "FetchRouteSchedulesErrorType", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchRouteSchedulesUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRemoteRepository f2997a;
    public final CityProvider b;
    public final ChaloLocationManager c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType;", "", "InvalidCity", "InvalidDataError", "ServerError", "LocalError", "ParseError", "UnknownError", "Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType$InvalidCity;", "Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType$InvalidDataError;", "Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType$LocalError;", "Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType$ParseError;", "Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType$ServerError;", "Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType$UnknownError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class FetchRouteSchedulesErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2998a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType$InvalidCity;", "Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidCity extends FetchRouteSchedulesErrorType {
            public static final InvalidCity b = new InvalidCity("Invalid city");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidCity);
            }

            public final int hashCode() {
                return 513692566;
            }

            public final String toString() {
                return "InvalidCity";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType$InvalidDataError;", "Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidDataError extends FetchRouteSchedulesErrorType {
            public static final InvalidDataError b = new InvalidDataError("Invalid data error");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidDataError);
            }

            public final int hashCode() {
                return 647828787;
            }

            public final String toString() {
                return "InvalidDataError";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType$LocalError;", "Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocalError extends FetchRouteSchedulesErrorType {
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
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("LocalError(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType$ParseError;", "Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ParseError extends FetchRouteSchedulesErrorType {
            public final String b;

            public ParseError(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ParseError) && Intrinsics.d(this.b, ((ParseError) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("ParseError(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType$ServerError;", "Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ServerError extends FetchRouteSchedulesErrorType {
            public final String b;

            public ServerError(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ServerError) && Intrinsics.d(this.b, ((ServerError) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("ServerError(message=", this.b, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType$UnknownError;", "Lapp/chalo/home/domain/FetchRouteSchedulesUseCase$FetchRouteSchedulesErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnknownError extends FetchRouteSchedulesErrorType {
            public final String b;

            public UnknownError(String str) {
                super(str);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UnknownError) && Intrinsics.d(this.b, ((UnknownError) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("UnknownError(message=", this.b, ")");
            }
        }

        public FetchRouteSchedulesErrorType(String str) {
            this.f2998a = str;
        }
    }

    public FetchRouteSchedulesUseCase(PremiumBusRemoteRepository premiumBusRemoteRepository, CityProvider cityProvider, ChaloLocationManager chaloLocationManager) {
        this.f2997a = premiumBusRemoteRepository;
        this.b = cityProvider;
        this.c = chaloLocationManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r9 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.citydata.data.model.app.RouteServiceType r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.FetchRouteSchedulesUseCase.a(app.chalo.citydata.data.model.app.RouteServiceType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
