package app.chalo.wallet.domain;

import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.quickpay.partialchangehandler.tripamount.TripAmountState;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/domain/ValidateQuickPayAmountUseCase;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidateQuickPayAmountUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetWalletSetupConfigurationUseCase f10784a;
    public final CurrencyFeature b;

    public ValidateQuickPayAmountUseCase(GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, CurrencyFeature currencyFeature) {
        this.f10784a = getWalletSetupConfigurationUseCase;
        this.b = currencyFeature;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ValidateQuickPayAmountUseCase$validateAmountString$1 validateQuickPayAmountUseCase$validateAmountString$1;
        CurrencyFeature currencyFeature = this.b;
        if (continuationImpl instanceof ValidateQuickPayAmountUseCase$validateAmountString$1) {
            validateQuickPayAmountUseCase$validateAmountString$1 = (ValidateQuickPayAmountUseCase$validateAmountString$1) continuationImpl;
            int i = validateQuickPayAmountUseCase$validateAmountString$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                validateQuickPayAmountUseCase$validateAmountString$1.label = i - Integer.MIN_VALUE;
            } else {
                validateQuickPayAmountUseCase$validateAmountString$1 = new ValidateQuickPayAmountUseCase$validateAmountString$1(this, continuationImpl);
            }
        } else {
            validateQuickPayAmountUseCase$validateAmountString$1 = new ValidateQuickPayAmountUseCase$validateAmountString$1(this, continuationImpl);
        }
        Object objB = validateQuickPayAmountUseCase$validateAmountString$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validateQuickPayAmountUseCase$validateAmountString$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objB);
                if (str == null || str.length() <= 1) {
                    return new ChaloUseCaseResult.Failure(TripAmountState.NO_AMOUNT_ENTERED);
                }
                GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase = this.f10784a;
                validateQuickPayAmountUseCase$validateAmountString$1.L$0 = str;
                validateQuickPayAmountUseCase$validateAmountString$1.label = 1;
                objB = getWalletSetupConfigurationUseCase.b(validateQuickPayAmountUseCase$validateAmountString$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) validateQuickPayAmountUseCase$validateAmountString$1.L$0;
                ResultKt.b(objB);
            }
            WalletSetupConfiguration walletSetupConfiguration = (WalletSetupConfiguration) objB;
            long jB = currencyFeature.b(str);
            if (jB > 0 && !currencyFeature.c(StringsKt.u0(str).toString())) {
                return jB > walletSetupConfiguration.e ? new ChaloUseCaseResult.Failure(TripAmountState.EXCEEDS_MAX_AMOUNT) : new ChaloUseCaseResult.Success(new Long(jB));
            }
            return new ChaloUseCaseResult.Failure(TripAmountState.INCORRECT_AMOUNT);
        } catch (Throwable unused) {
            return new ChaloUseCaseResult.Failure(TripAmountState.NO_AMOUNT_ENTERED);
        }
    }
}
