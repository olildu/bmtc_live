package app.chalo.juspay;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/juspay/JuspayOperationFailure;", "", "SdkNotReady", "Error", "SessionExpired", "ResultUnavailable", "SdkUnavailable", "Lapp/chalo/juspay/JuspayOperationFailure$Error;", "Lapp/chalo/juspay/JuspayOperationFailure$ResultUnavailable;", "Lapp/chalo/juspay/JuspayOperationFailure$SdkNotReady;", "Lapp/chalo/juspay/JuspayOperationFailure$SdkUnavailable;", "Lapp/chalo/juspay/JuspayOperationFailure$SessionExpired;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface JuspayOperationFailure {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationFailure$Error;", "Lapp/chalo/juspay/JuspayOperationFailure;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error implements JuspayOperationFailure {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4051a;

        public Error(String str) {
            this.f4051a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.f4051a, ((Error) obj).f4051a);
        }

        public final int hashCode() {
            String str = this.f4051a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Error(message=", this.f4051a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationFailure$ResultUnavailable;", "Lapp/chalo/juspay/JuspayOperationFailure;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResultUnavailable implements JuspayOperationFailure {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResultUnavailable f4052a = new ResultUnavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ResultUnavailable);
        }

        public final int hashCode() {
            return -1640778150;
        }

        public final String toString() {
            return "ResultUnavailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationFailure$SdkNotReady;", "Lapp/chalo/juspay/JuspayOperationFailure;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SdkNotReady implements JuspayOperationFailure {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuspaySdkStatus f4053a;

        public SdkNotReady(JuspaySdkStatus sdkStatus) {
            Intrinsics.i(sdkStatus, "sdkStatus");
            this.f4053a = sdkStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SdkNotReady) && Intrinsics.d(this.f4053a, ((SdkNotReady) obj).f4053a);
        }

        public final int hashCode() {
            return this.f4053a.hashCode();
        }

        public final String toString() {
            return "SdkNotReady(sdkStatus=" + this.f4053a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationFailure$SdkUnavailable;", "Lapp/chalo/juspay/JuspayOperationFailure;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SdkUnavailable implements JuspayOperationFailure {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SdkUnavailable f4054a = new SdkUnavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SdkUnavailable);
        }

        public final int hashCode() {
            return -1178932561;
        }

        public final String toString() {
            return "SdkUnavailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspayOperationFailure$SessionExpired;", "Lapp/chalo/juspay/JuspayOperationFailure;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SessionExpired implements JuspayOperationFailure {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SessionExpired f4055a = new SessionExpired();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionExpired);
        }

        public final int hashCode() {
            return -1065093464;
        }

        public final String toString() {
            return "SessionExpired";
        }
    }
}
