package app.chalo.kyc.min.ui;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/kyc/min/ui/SubmitKycError;", "", "SubmitKycUiError", "GenericError", "Lapp/chalo/kyc/min/ui/SubmitKycError$GenericError;", "Lapp/chalo/kyc/min/ui/SubmitKycError$SubmitKycUiError;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SubmitKycError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4115a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/SubmitKycError$GenericError;", "Lapp/chalo/kyc/min/ui/SubmitKycError;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenericError extends SubmitKycError {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenericError(String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.b = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenericError) && Intrinsics.d(this.b, ((GenericError) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("GenericError(msg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/SubmitKycError$SubmitKycUiError;", "Lapp/chalo/kyc/min/ui/SubmitKycError;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmitKycUiError extends SubmitKycError {
        public final boolean b;
        public final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubmitKycUiError(boolean z, String msg) {
            super(msg);
            Intrinsics.i(msg, "msg");
            this.b = z;
            this.c = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmitKycUiError)) {
                return false;
            }
            SubmitKycUiError submitKycUiError = (SubmitKycUiError) obj;
            return this.b == submitKycUiError.b && Intrinsics.d(this.c, submitKycUiError.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b ? 1231 : 1237) * 31);
        }

        public final String toString() {
            return "SubmitKycUiError(isInValidOtp=" + this.b + ", msg=" + this.c + ")";
        }
    }

    public SubmitKycError(String str) {
        this.f4115a = str;
    }
}
