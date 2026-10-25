package app.chalo.juspay;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/juspay/JusPaySdkResultAppModel;", "", "ShowLoader", "HideLoader", "SessionExpired", "ProcessResult", "ResultUnavailable", "Error", "Unknown", "Lapp/chalo/juspay/JusPaySdkResultAppModel$Error;", "Lapp/chalo/juspay/JusPaySdkResultAppModel$HideLoader;", "Lapp/chalo/juspay/JusPaySdkResultAppModel$ProcessResult;", "Lapp/chalo/juspay/JusPaySdkResultAppModel$ResultUnavailable;", "Lapp/chalo/juspay/JusPaySdkResultAppModel$SessionExpired;", "Lapp/chalo/juspay/JusPaySdkResultAppModel$ShowLoader;", "Lapp/chalo/juspay/JusPaySdkResultAppModel$Unknown;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class JusPaySdkResultAppModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySdkResultAppModel$Error;", "Lapp/chalo/juspay/JusPaySdkResultAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends JusPaySdkResultAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4010a;
        public final String b;

        public Error(String str, String str2) {
            this.f4010a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.d(this.f4010a, error.f4010a) && Intrinsics.d(this.b, error.b);
        }

        public final int hashCode() {
            String str = this.f4010a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return vo1.o("Error(msg=", this.f4010a, ", requestId=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySdkResultAppModel$HideLoader;", "Lapp/chalo/juspay/JusPaySdkResultAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HideLoader extends JusPaySdkResultAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4011a;

        public HideLoader(String str) {
            this.f4011a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HideLoader) && Intrinsics.d(this.f4011a, ((HideLoader) obj).f4011a);
        }

        public final int hashCode() {
            String str = this.f4011a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("HideLoader(requestId=", this.f4011a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySdkResultAppModel$ProcessResult;", "Lapp/chalo/juspay/JusPaySdkResultAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProcessResult extends JusPaySdkResultAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JusPayResultAppModel f4012a;

        public ProcessResult(JusPayResultAppModel jusPayResultAppModel) {
            this.f4012a = jusPayResultAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProcessResult) && Intrinsics.d(this.f4012a, ((ProcessResult) obj).f4012a);
        }

        public final int hashCode() {
            return this.f4012a.hashCode();
        }

        public final String toString() {
            return "ProcessResult(result=" + this.f4012a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySdkResultAppModel$ResultUnavailable;", "Lapp/chalo/juspay/JusPaySdkResultAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResultUnavailable extends JusPaySdkResultAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResultUnavailable f4013a = new ResultUnavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ResultUnavailable);
        }

        public final int hashCode() {
            return 1415110674;
        }

        public final String toString() {
            return "ResultUnavailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySdkResultAppModel$SessionExpired;", "Lapp/chalo/juspay/JusPaySdkResultAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SessionExpired extends JusPaySdkResultAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SessionExpired f4014a = new SessionExpired();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionExpired);
        }

        public final int hashCode() {
            return 594405360;
        }

        public final String toString() {
            return "SessionExpired";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySdkResultAppModel$ShowLoader;", "Lapp/chalo/juspay/JusPaySdkResultAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowLoader extends JusPaySdkResultAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4015a;

        public ShowLoader(String str) {
            this.f4015a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowLoader) && Intrinsics.d(this.f4015a, ((ShowLoader) obj).f4015a);
        }

        public final int hashCode() {
            String str = this.f4015a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ShowLoader(requestId=", this.f4015a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySdkResultAppModel$Unknown;", "Lapp/chalo/juspay/JusPaySdkResultAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends JusPaySdkResultAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f4016a = new Unknown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return -1832000727;
        }

        public final String toString() {
            return "Unknown";
        }
    }
}
