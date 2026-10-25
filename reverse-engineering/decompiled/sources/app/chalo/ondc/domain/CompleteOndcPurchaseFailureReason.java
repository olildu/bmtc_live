package app.chalo.ondc.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason;", "", "InvalidTicket", "ResponseParsing", "LocalError", "ApiError", "UnknownError", "Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason$ApiError;", "Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason$InvalidTicket;", "Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason$LocalError;", "Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason$ResponseParsing;", "Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason$UnknownError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CompleteOndcPurchaseFailureReason {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason$ApiError;", "Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ApiError extends CompleteOndcPurchaseFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6700a;

        public ApiError(String str) {
            this.f6700a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiError) && Intrinsics.d(this.f6700a, ((ApiError) obj).f6700a);
        }

        public final int hashCode() {
            String str = this.f6700a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ApiError(msg=", this.f6700a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason$InvalidTicket;", "Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidTicket extends CompleteOndcPurchaseFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvalidTicket f6701a = new InvalidTicket();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason$LocalError;", "Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocalError extends CompleteOndcPurchaseFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6702a;

        public LocalError(String str) {
            this.f6702a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocalError) && Intrinsics.d(this.f6702a, ((LocalError) obj).f6702a);
        }

        public final int hashCode() {
            String str = this.f6702a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("LocalError(msg=", this.f6702a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason$ResponseParsing;", "Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseParsing extends CompleteOndcPurchaseFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResponseParsing f6703a = new ResponseParsing();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason$UnknownError;", "Lapp/chalo/ondc/domain/CompleteOndcPurchaseFailureReason;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnknownError extends CompleteOndcPurchaseFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnknownError f6704a = new UnknownError();
    }
}
