package app.chalo.livetracking.universalsearch.data.exception;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType;", "", "ResponseParsing", "InvalidResponse", "Local", "Timeout", "API", "EmptyApiResponse", "UNKNOWN", "InvalidRequestData", "EmptyQuery", "CountryConfigNotAvailable", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$API;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$CountryConfigNotAvailable;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$EmptyApiResponse;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$EmptyQuery;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$InvalidRequestData;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$InvalidResponse;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$Local;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$ResponseParsing;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$Timeout;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$UNKNOWN;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RemoteSearchResultErrorType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4967a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$API;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class API extends RemoteSearchResultErrorType {
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$CountryConfigNotAvailable;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CountryConfigNotAvailable extends RemoteSearchResultErrorType {
        public static final CountryConfigNotAvailable b = new CountryConfigNotAvailable("Country config not available");
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$EmptyApiResponse;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyApiResponse extends RemoteSearchResultErrorType {
        public EmptyApiResponse() {
            super("Response is empty");
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EmptyApiResponse);
        }

        public final int hashCode() {
            return 605873078;
        }

        public final String toString() {
            return "EmptyApiResponse(msg=Response is empty)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$EmptyQuery;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EmptyQuery extends RemoteSearchResultErrorType {
        public static final EmptyQuery b = new EmptyQuery("");
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$InvalidRequestData;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidRequestData extends RemoteSearchResultErrorType {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidRequestData(String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.b = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidRequestData) && Intrinsics.d(this.b, ((InvalidRequestData) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("InvalidRequestData(msg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$InvalidResponse;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidResponse extends RemoteSearchResultErrorType {
        public static final InvalidResponse b = new InvalidResponse("Invalid response");
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$Local;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Local extends RemoteSearchResultErrorType {
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$ResponseParsing;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseParsing extends RemoteSearchResultErrorType {
        public static final ResponseParsing b = new ResponseParsing("Something went wrong while parsing response");
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$Timeout;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Timeout extends RemoteSearchResultErrorType {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timeout(String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.b = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Timeout) && Intrinsics.d(this.b, ((Timeout) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("Timeout(msg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType$UNKNOWN;", "Lapp/chalo/livetracking/universalsearch/data/exception/RemoteSearchResultErrorType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UNKNOWN extends RemoteSearchResultErrorType {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.b = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UNKNOWN) && Intrinsics.d(this.b, ((UNKNOWN) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("UNKNOWN(msg=", this.b, ")");
        }
    }

    public RemoteSearchResultErrorType(String str) {
        this.f4967a = str;
    }
}
