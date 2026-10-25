package app.chalo.productbooking.common.data.error;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError;", "", "Unknown", "ResponseParsing", "InvalidData", "API", "Local", "UnavailableCityDetails", "Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError$API;", "Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError$InvalidData;", "Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError$Local;", "Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError$ResponseParsing;", "Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError$UnavailableCityDetails;", "Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError$Unknown;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductBookingDataSourceError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8097a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError$API;", "Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class API extends ProductBookingDataSourceError {
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError$InvalidData;", "Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidData extends ProductBookingDataSourceError {
        public static final InvalidData b = new InvalidData(null);
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError$Local;", "Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Local extends ProductBookingDataSourceError {
        public final String b;

        public Local(String str) {
            super(str);
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Local) && Intrinsics.d(this.b, ((Local) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Local(msg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError$ResponseParsing;", "Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseParsing extends ProductBookingDataSourceError {
        public static final ResponseParsing b = new ResponseParsing(null);
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError$UnavailableCityDetails;", "Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnavailableCityDetails extends ProductBookingDataSourceError {
        public static final UnavailableCityDetails b = new UnavailableCityDetails(null);
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError$Unknown;", "Lapp/chalo/productbooking/common/data/error/ProductBookingDataSourceError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends ProductBookingDataSourceError {
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
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Unknown(msg=", this.b, ")");
        }
    }

    public ProductBookingDataSourceError(String str) {
        this.f8097a = str;
    }

    public final int a() {
        if (this instanceof API) {
            Integer num = ((API) this).c;
            if (num != null) {
                return num.intValue();
            }
            return 103;
        }
        if (equals(InvalidData.b)) {
            return 101;
        }
        if (this instanceof Local) {
            return 102;
        }
        if (equals(ResponseParsing.b)) {
            return 100;
        }
        if (equals(UnavailableCityDetails.b)) {
            return 104;
        }
        if (this instanceof Unknown) {
            return 105;
        }
        throw new NoWhenBranchMatchedException();
    }
}
