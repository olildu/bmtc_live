package app.chalo.wallet.domain;

import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayBottomSheetError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ValidateQuickPayUseCaseKt {
    public static final QuickpayBottomSheetError a(QuickPayValidationResult quickPayValidationResult) {
        Intrinsics.i(quickPayValidationResult, "<this>");
        if (quickPayValidationResult instanceof QuickPayValidationResult.Success) {
            return null;
        }
        if (quickPayValidationResult instanceof QuickPayValidationResult.InsufficientBalance) {
            return QuickpayBottomSheetError.BALANCE_NOT_SUFFICIENT;
        }
        if (quickPayValidationResult.equals(QuickPayValidationResult.GeneralError.f10778a)) {
            return QuickpayBottomSheetError.SOMETHING_WENT_WRONG;
        }
        if (quickPayValidationResult.equals(QuickPayValidationResult.UserNotFound.f10781a)) {
            return QuickpayBottomSheetError.USER_NOT_FOUND;
        }
        if (quickPayValidationResult.equals(QuickPayValidationResult.WalletNotFound.f10782a)) {
            return QuickpayBottomSheetError.WALLET_NOT_FOUND;
        }
        throw new NoWhenBranchMatchedException();
    }
}
