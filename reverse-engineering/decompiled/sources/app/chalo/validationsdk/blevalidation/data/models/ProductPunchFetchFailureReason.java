package app.chalo.validationsdk.blevalidation.data.models;

import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason;", "", "PunchNotAvailable", "ProductPunchDataInvalidResponse", "InternalServerError", "ResponseParsingError", "InternetNotAvailable", "Unknown", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason$InternalServerError;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason$InternetNotAvailable;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason$ProductPunchDataInvalidResponse;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason$PunchNotAvailable;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason$ResponseParsingError;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason$Unknown;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductPunchFetchFailureReason {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason$InternalServerError;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InternalServerError extends ProductPunchFetchFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10474a;
        public final int b;

        public InternalServerError(String str, int i) {
            this.f10474a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InternalServerError)) {
                return false;
            }
            InternalServerError internalServerError = (InternalServerError) obj;
            return Intrinsics.d(this.f10474a, internalServerError.f10474a) && this.b == internalServerError.b;
        }

        public final int hashCode() {
            String str = this.f10474a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.b;
        }

        public final String toString() {
            return xs.i(this.b, "InternalServerError(errorMessage=", this.f10474a, ", errorCode=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason$InternetNotAvailable;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InternetNotAvailable extends ProductPunchFetchFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InternetNotAvailable f10475a = new InternetNotAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason$ProductPunchDataInvalidResponse;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductPunchDataInvalidResponse extends ProductPunchFetchFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductPunchDataInvalidResponse f10476a = new ProductPunchDataInvalidResponse();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason$PunchNotAvailable;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PunchNotAvailable extends ProductPunchFetchFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PunchNotAvailable f10477a = new PunchNotAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason$ResponseParsingError;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResponseParsingError extends ProductPunchFetchFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10478a;

        public ResponseParsingError(String str) {
            this.f10478a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResponseParsingError) && Intrinsics.d(this.f10478a, ((ResponseParsingError) obj).f10478a);
        }

        public final int hashCode() {
            String str = this.f10478a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ResponseParsingError(errorMessage=", this.f10478a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason$Unknown;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductPunchFetchFailureReason;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends ProductPunchFetchFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10479a;
        public final Integer b;

        public Unknown(String str, Integer num) {
            this.f10479a = str;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) obj;
            return Intrinsics.d(this.f10479a, unknown.f10479a) && Intrinsics.d(this.b, unknown.b);
        }

        public final int hashCode() {
            String str = this.f10479a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return "Unknown(errorMessage=" + this.f10479a + ", errorCode=" + this.b + ")";
        }
    }
}
