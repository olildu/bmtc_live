package app.chalo.quickpay.ui.tripamount;

import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountIntent;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.wallet.domain.ValidateQuickPayAmountUseCase;
import defpackage.eu0;
import defpackage.f01;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent$handleValidateIntent$1", f = "QuickpayTripAmountComponent.kt", l = {162}, m = "invokeSuspend", v = 1)
final class QuickpayTripAmountComponent$handleValidateIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ QuickpayTripAmountIntent.ValidateIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ QuickpayTripAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickpayTripAmountComponent$handleValidateIntent$1(QuickpayTripAmountComponent quickpayTripAmountComponent, QuickpayTripAmountIntent.ValidateIntent validateIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = quickpayTripAmountComponent;
        this.$intent = validateIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuickpayTripAmountComponent$handleValidateIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QuickpayTripAmountComponent$handleValidateIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strD;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            QuickpayTripAmountComponent quickpayTripAmountComponent = this.this$0;
            String strSubstring = this.$intent.f8881a;
            CurrencyFeature currencyFeature = quickpayTripAmountComponent.y;
            if (strSubstring == null || strSubstring.length() == 0) {
                strD = currencyFeature.d();
            } else {
                if (strSubstring.length() > 9) {
                    strSubstring = strSubstring.substring(0, 9);
                    Intrinsics.h(strSubstring, "substring(...)");
                }
                String strD2 = currencyFeature.d();
                String strR = StringsKt.R(strSubstring, strD2, "");
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
                    String strSubstring2 = strR.substring(0, iC);
                    Intrinsics.h(strSubstring2, "substring(...)");
                    String strSubstring3 = strR.substring(iC);
                    Intrinsics.h(strSubstring3, "substring(...)");
                    strR = strSubstring2.concat(StringsKt.R(strSubstring3, CLConstants.DOT_SALT_DELIMETER, ""));
                }
                MatchResult matchResultC = new Regex("^\\d*\\.?\\d{0,2}").c(strR, 0);
                strD = strD2.concat(matchResultC != null ? matchResultC.getValue() : "");
            }
            this.this$0.E0(new eu0(strD, 21));
            ValidateQuickPayAmountUseCase validateQuickPayAmountUseCase = this.this$0.r;
            this.L$0 = strD;
            this.label = 1;
            Object objA = validateQuickPayAmountUseCase.a(strD, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = strD;
            obj = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.b(obj);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            this.this$0.E0(new f01((ChaloUseCaseResult.Failure) chaloUseCaseResult, str, 1));
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.E0(new eu0(str, 22));
            QuickpayTripAmountComponent quickpayTripAmountComponent2 = this.this$0;
            quickpayTripAmountComponent2.I = false;
            if (this.$intent.b) {
                quickpayTripAmountComponent2.J0(QuickpayTripAmountIntent.NextIntent.f8874a);
            }
        }
        return Unit.f17538a;
    }
}
