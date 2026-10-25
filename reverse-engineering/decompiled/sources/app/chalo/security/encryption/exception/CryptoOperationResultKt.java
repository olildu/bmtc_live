package app.chalo.security.encryption.exception;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"security_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CryptoOperationResultKt {
    public static final Object a(CryptoOperationResult cryptoOperationResult) throws CryptoException, UnknownCryptoException, IncompatibleDeviceException {
        Intrinsics.i(cryptoOperationResult, "<this>");
        if (cryptoOperationResult instanceof CryptoOperationResult.Success) {
            return ((CryptoOperationResult.Success) cryptoOperationResult).f9356a;
        }
        if (cryptoOperationResult instanceof CryptoOperationResult.CryptoError) {
            String str = ((CryptoOperationResult.CryptoError) cryptoOperationResult).f9354a;
            throw new CryptoException(str, new Throwable(str));
        }
        if (cryptoOperationResult instanceof CryptoOperationResult.IncompatibleDeviceError) {
            throw new IncompatibleDeviceException("", new Throwable(((CryptoOperationResult.IncompatibleDeviceError) cryptoOperationResult).f9355a));
        }
        if (!(cryptoOperationResult instanceof CryptoOperationResult.UnknownError)) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable th = new Throwable(((CryptoOperationResult.UnknownError) cryptoOperationResult).f9357a);
        throw new UnknownCryptoException(th.getMessage(), th);
    }
}
