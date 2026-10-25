package app.chalo.wallet.ui.loadbalance;

import androidx.compose.runtime.ComposerKt;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.usecase.LoadMoneyAmountValidationUseCase;
import app.chalo.usecase.LoadMoneyFailureReason;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.zw0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.io.FilenameUtils;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent$handleAmountEntered$1", f = "WalletLoadBalanceEnterAmountComponent.kt", l = {ComposerKt.providerKey}, m = "invokeSuspend", v = 1)
final class WalletLoadBalanceEnterAmountComponent$handleAmountEntered$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletLoadBalanceEnterAmountIntent.AmountEnteredIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ WalletLoadBalanceEnterAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoadBalanceEnterAmountComponent$handleAmountEntered$1(WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent, WalletLoadBalanceEnterAmountIntent.AmountEnteredIntent amountEnteredIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletLoadBalanceEnterAmountComponent;
        this.$intent = amountEnteredIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletLoadBalanceEnterAmountComponent$handleAmountEntered$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletLoadBalanceEnterAmountComponent$handleAmountEntered$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strD;
        WalletLoadBalanceEnterAmountComponent$handleAmountEntered$1 walletLoadBalanceEnterAmountComponent$handleAmountEntered$1;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent = this.this$0;
            String str2 = this.$intent.f10831a;
            CurrencyFeature currencyFeature = walletLoadBalanceEnterAmountComponent.B;
            if (str2 == null || str2.length() == 0) {
                strD = currencyFeature.d();
            } else {
                String strR = StringsKt.R(StringsKt.R(str2, currencyFeature.d(), ""), ",", "");
                if (strR.length() > 9) {
                    strR = strR.substring(0, 9);
                    Intrinsics.h(strR, "substring(...)");
                }
                String strD2 = currencyFeature.d();
                if (StringsKt.a0(strR, CLConstants.DOT_SALT_DELIMETER, false)) {
                    strR = "0".concat(strR);
                }
                int i2 = 0;
                for (int i3 = 0; i3 < strR.length(); i3++) {
                    if (strR.charAt(i3) == '.') {
                        i2++;
                    }
                }
                if (i2 > 1) {
                    int iC = StringsKt.C(strR, FilenameUtils.EXTENSION_SEPARATOR, 0, 6) + 1;
                    String strSubstring = strR.substring(0, iC);
                    Intrinsics.h(strSubstring, "substring(...)");
                    String strSubstring2 = strR.substring(iC);
                    Intrinsics.h(strSubstring2, "substring(...)");
                    strR = strSubstring.concat(StringsKt.R(strSubstring2, CLConstants.DOT_SALT_DELIMETER, ""));
                }
                MatchResult matchResultC = new Regex("^\\d*\\.?\\d{0,2}").c(strR, 0);
                strD = strD2.concat(matchResultC != null ? matchResultC.getValue() : "");
            }
            String str3 = strD;
            LoadMoneyAmountValidationUseCase loadMoneyAmountValidationUseCase = this.this$0.r;
            this.L$0 = str3;
            this.label = 1;
            walletLoadBalanceEnterAmountComponent$handleAmountEntered$1 = this;
            obj = loadMoneyAmountValidationUseCase.a(str3, 1000L, 1700000L, walletLoadBalanceEnterAmountComponent$handleAmountEntered$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.b(obj);
            walletLoadBalanceEnterAmountComponent$handleAmountEntered$1 = this;
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        walletLoadBalanceEnterAmountComponent$handleAmountEntered$1.this$0.E0(new zw0(chaloUseCaseResult instanceof ChaloUseCaseResult.Success, str, chaloUseCaseResult instanceof ChaloUseCaseResult.Failure ? ((LoadMoneyFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).b : null, 3));
        return Unit.f17538a;
    }
}
