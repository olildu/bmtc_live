package app.chalo.kyc.min.ui;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/kyc/min/ui/RegisterUserError;", "", "RegisterUserUiError", "GenericError", "Lapp/chalo/kyc/min/ui/RegisterUserError$GenericError;", "Lapp/chalo/kyc/min/ui/RegisterUserError$RegisterUserUiError;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RegisterUserError {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/RegisterUserError$GenericError;", "Lapp/chalo/kyc/min/ui/RegisterUserError;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenericError extends RegisterUserError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4113a;

        public GenericError(String msg) {
            Intrinsics.i(msg, "msg");
            this.f4113a = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenericError) && Intrinsics.d(this.f4113a, ((GenericError) obj).f4113a);
        }

        public final int hashCode() {
            return this.f4113a.hashCode();
        }

        public final String toString() {
            return vo1.B("GenericError(msg=", this.f4113a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/RegisterUserError$RegisterUserUiError;", "Lapp/chalo/kyc/min/ui/RegisterUserError;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RegisterUserUiError extends RegisterUserError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4114a;

        public RegisterUserUiError(String msg) {
            Intrinsics.i(msg, "msg");
            this.f4114a = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RegisterUserUiError) && Intrinsics.d(this.f4114a, ((RegisterUserUiError) obj).f4114a);
        }

        public final int hashCode() {
            return this.f4114a.hashCode();
        }

        public final String toString() {
            return vo1.B("RegisterUserUiError(msg=", this.f4114a, ")");
        }
    }
}
