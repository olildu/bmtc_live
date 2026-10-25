package app.chalo.security.encryption.exception;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.n21;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/security/encryption/exception/CryptoOperationResult;", "T", "", InitializationStatus.SUCCESS, "CryptoError", "IncompatibleDeviceError", "UnknownError", "Lapp/chalo/security/encryption/exception/CryptoOperationResult$CryptoError;", "Lapp/chalo/security/encryption/exception/CryptoOperationResult$IncompatibleDeviceError;", "Lapp/chalo/security/encryption/exception/CryptoOperationResult$Success;", "Lapp/chalo/security/encryption/exception/CryptoOperationResult$UnknownError;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CryptoOperationResult<T> {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/security/encryption/exception/CryptoOperationResult$CryptoError;", "Lapp/chalo/security/encryption/exception/CryptoOperationResult;", "", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CryptoError extends CryptoOperationResult<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9354a;

        public CryptoError(String str) {
            this.f9354a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CryptoError) && Intrinsics.d(this.f9354a, ((CryptoError) obj).f9354a);
        }

        public final int hashCode() {
            return this.f9354a.hashCode();
        }

        public final String toString() {
            return vo1.B("CryptoError(msg=", this.f9354a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/security/encryption/exception/CryptoOperationResult$IncompatibleDeviceError;", "Lapp/chalo/security/encryption/exception/CryptoOperationResult;", "", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IncompatibleDeviceError extends CryptoOperationResult<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9355a;

        public IncompatibleDeviceError(String str) {
            this.f9355a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IncompatibleDeviceError) && Intrinsics.d(this.f9355a, ((IncompatibleDeviceError) obj).f9355a);
        }

        public final int hashCode() {
            return this.f9355a.hashCode();
        }

        public final String toString() {
            return vo1.B("IncompatibleDeviceError(msg=", this.f9355a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/security/encryption/exception/CryptoOperationResult$Success;", "T", "Lapp/chalo/security/encryption/exception/CryptoOperationResult;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success<T> extends CryptoOperationResult<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f9356a;

        public Success(String str) {
            this.f9356a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f9356a, ((Success) obj).f9356a);
        }

        public final int hashCode() {
            Object obj = this.f9356a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return n21.f(this.f9356a, "Success(data=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/security/encryption/exception/CryptoOperationResult$UnknownError;", "Lapp/chalo/security/encryption/exception/CryptoOperationResult;", "", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnknownError extends CryptoOperationResult<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9357a;

        public UnknownError(String str) {
            this.f9357a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownError) && Intrinsics.d(this.f9357a, ((UnknownError) obj).f9357a);
        }

        public final int hashCode() {
            return this.f9357a.hashCode();
        }

        public final String toString() {
            return vo1.B("UnknownError(msg=", this.f9357a, ")");
        }
    }
}
