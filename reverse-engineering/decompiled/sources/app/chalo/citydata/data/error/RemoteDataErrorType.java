package app.chalo.citydata.data.error;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/citydata/data/error/RemoteDataErrorType;", "", "Unknown", "ResponseParsing", "API", "Local", "NoInternet", "InvalidResponse", "Lapp/chalo/citydata/data/error/RemoteDataErrorType$API;", "Lapp/chalo/citydata/data/error/RemoteDataErrorType$InvalidResponse;", "Lapp/chalo/citydata/data/error/RemoteDataErrorType$Local;", "Lapp/chalo/citydata/data/error/RemoteDataErrorType$NoInternet;", "Lapp/chalo/citydata/data/error/RemoteDataErrorType$ResponseParsing;", "Lapp/chalo/citydata/data/error/RemoteDataErrorType$Unknown;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RemoteDataErrorType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1633a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/error/RemoteDataErrorType$API;", "Lapp/chalo/citydata/data/error/RemoteDataErrorType;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class API extends RemoteDataErrorType {
        public final String b;
        public final Integer c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public API(String msg, Integer num) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.b = msg;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof API)) {
                return false;
            }
            API api = (API) obj;
            return Intrinsics.d(this.b, api.b) && Intrinsics.d(this.c, api.c);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            Integer num = this.c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "API(msg=" + this.b + ", errorCode=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/error/RemoteDataErrorType$InvalidResponse;", "Lapp/chalo/citydata/data/error/RemoteDataErrorType;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidResponse extends RemoteDataErrorType {
        public final String b;

        public InvalidResponse(String str) {
            super(str);
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidResponse) && Intrinsics.d(this.b, ((InvalidResponse) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("InvalidResponse(msg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/error/RemoteDataErrorType$Local;", "Lapp/chalo/citydata/data/error/RemoteDataErrorType;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Local extends RemoteDataErrorType {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Local(String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.b = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Local) && Intrinsics.d(this.b, ((Local) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("Local(msg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/error/RemoteDataErrorType$NoInternet;", "Lapp/chalo/citydata/data/error/RemoteDataErrorType;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoInternet extends RemoteDataErrorType {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoInternet(String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.b = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoInternet) && Intrinsics.d(this.b, ((NoInternet) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("NoInternet(msg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/error/RemoteDataErrorType$ResponseParsing;", "Lapp/chalo/citydata/data/error/RemoteDataErrorType;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResponseParsing extends RemoteDataErrorType {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseParsing(String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.b = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResponseParsing) && Intrinsics.d(this.b, ((ResponseParsing) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("ResponseParsing(msg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/error/RemoteDataErrorType$Unknown;", "Lapp/chalo/citydata/data/error/RemoteDataErrorType;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends RemoteDataErrorType {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.b = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown) && Intrinsics.d(this.b, ((Unknown) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("Unknown(msg=", this.b, ")");
        }
    }

    public RemoteDataErrorType(String str) {
        this.f1633a = str;
    }
}
