package app.chalo.usecase;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/usecase/ProductHistorySyncErrorType;", "", "ProductConfigNotAvailable", "MTicketDetailsNotAvailable", "ResponseParsing", "API", "Unknown", "UserNotLoggedIn", "Lapp/chalo/usecase/ProductHistorySyncErrorType$API;", "Lapp/chalo/usecase/ProductHistorySyncErrorType$MTicketDetailsNotAvailable;", "Lapp/chalo/usecase/ProductHistorySyncErrorType$ProductConfigNotAvailable;", "Lapp/chalo/usecase/ProductHistorySyncErrorType$ResponseParsing;", "Lapp/chalo/usecase/ProductHistorySyncErrorType$Unknown;", "Lapp/chalo/usecase/ProductHistorySyncErrorType$UserNotLoggedIn;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductHistorySyncErrorType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10215a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/ProductHistorySyncErrorType$API;", "Lapp/chalo/usecase/ProductHistorySyncErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class API extends ProductHistorySyncErrorType {
        public final String b;

        public API(String str) {
            super(str);
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof API) && Intrinsics.d(this.b, ((API) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("API(desc=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/ProductHistorySyncErrorType$MTicketDetailsNotAvailable;", "Lapp/chalo/usecase/ProductHistorySyncErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MTicketDetailsNotAvailable extends ProductHistorySyncErrorType {
        public static final MTicketDetailsNotAvailable b = new MTicketDetailsNotAvailable("m-ticket details not available");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MTicketDetailsNotAvailable);
        }

        public final int hashCode() {
            return 187619902;
        }

        public final String toString() {
            return "MTicketDetailsNotAvailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/ProductHistorySyncErrorType$ProductConfigNotAvailable;", "Lapp/chalo/usecase/ProductHistorySyncErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductConfigNotAvailable extends ProductHistorySyncErrorType {
        public static final ProductConfigNotAvailable b = new ProductConfigNotAvailable("product config not available");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductConfigNotAvailable);
        }

        public final int hashCode() {
            return -1732694840;
        }

        public final String toString() {
            return "ProductConfigNotAvailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/ProductHistorySyncErrorType$ResponseParsing;", "Lapp/chalo/usecase/ProductHistorySyncErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResponseParsing extends ProductHistorySyncErrorType {
        public final String b;

        public ResponseParsing(String str) {
            super(str);
            this.b = str;
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
            return vo1.B("ResponseParsing(desc=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/ProductHistorySyncErrorType$Unknown;", "Lapp/chalo/usecase/ProductHistorySyncErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends ProductHistorySyncErrorType {
        public final String b;

        public Unknown(String str) {
            super(str);
            this.b = str;
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
            return vo1.B("Unknown(desc=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/ProductHistorySyncErrorType$UserNotLoggedIn;", "Lapp/chalo/usecase/ProductHistorySyncErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserNotLoggedIn extends ProductHistorySyncErrorType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UserNotLoggedIn);
        }

        public final int hashCode() {
            return 861569591;
        }

        public final String toString() {
            return "UserNotLoggedIn(desc=User id null)";
        }
    }

    public ProductHistorySyncErrorType(String str) {
        this.f10215a = str;
    }
}
