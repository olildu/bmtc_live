package app.chalo.quickpay.ui.tripamount;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.behaviour.policy.ResolvedSupportPolicy;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountIntent;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.quickpay.domain.GetQuickPayDisclaimerTextUseCase;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import defpackage.lu0;
import defpackage.yb;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent$handleViewCreatedIntent$1", f = "QuickpayTripAmountComponent.kt", l = {115, 123, 124, 131}, m = "invokeSuspend", v = 1)
final class QuickpayTripAmountComponent$handleViewCreatedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ QuickpayTripAmountIntent.ViewCreatedIntent $intent;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ QuickpayTripAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickpayTripAmountComponent$handleViewCreatedIntent$1(QuickpayTripAmountComponent quickpayTripAmountComponent, QuickpayTripAmountIntent.ViewCreatedIntent viewCreatedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = quickpayTripAmountComponent;
        this.$intent = viewCreatedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuickpayTripAmountComponent$handleViewCreatedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QuickpayTripAmountComponent$handleViewCreatedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[PHI: r2 r4
      0x00a6: PHI (r2v12 java.lang.String) = (r2v11 java.lang.String), (r2v20 java.lang.String) binds: [B:28:0x00a3, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r4v2 java.lang.Object) = (r4v1 java.lang.Object), (r4v12 java.lang.Object) binds: [B:28:0x00a3, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        String str;
        Object objB;
        ChaloUseCaseResult chaloUseCaseResult;
        long jIntValue;
        Object objB2;
        String str2;
        long j;
        QuickpayTripAmountIntent.ViewCreatedIntent viewCreatedIntent;
        String str3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ResolveSupportPolicyUseCase resolveSupportPolicyUseCase = this.this$0.H;
            this.label = 1;
            objA = resolveSupportPolicyUseCase.a(this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
            objA = obj;
        } else {
            if (i == 2) {
                ResultKt.b(obj);
                objA2 = obj;
                str = (String) objA2;
                FetchWalletBalanceUseCase fetchWalletBalanceUseCase = this.this$0.x;
                WalletTypeIdentifier walletTypeIdentifier = this.$intent.d;
                this.L$0 = str;
                this.label = 3;
                objB = fetchWalletBalanceUseCase.b(walletTypeIdentifier, this);
                if (objB != coroutineSingletons) {
                    chaloUseCaseResult = (ChaloUseCaseResult) objB;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        jIntValue = ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).intValue();
                    } else {
                        jIntValue = -1;
                    }
                    GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase = this.this$0.C;
                    this.L$0 = str;
                    this.J$0 = jIntValue;
                    this.label = 4;
                    objB2 = getWalletSetupConfigurationUseCase.b(this);
                    if (objB2 != coroutineSingletons) {
                        str2 = str;
                        j = jIntValue;
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                str = (String) this.L$0;
                ResultKt.b(obj);
                objB = obj;
                chaloUseCaseResult = (ChaloUseCaseResult) objB;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    jIntValue = ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).intValue();
                } else {
                    jIntValue = -1;
                }
                GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase2 = this.this$0.C;
                this.L$0 = str;
                this.J$0 = jIntValue;
                this.label = 4;
                objB2 = getWalletSetupConfigurationUseCase2.b(this);
                if (objB2 != coroutineSingletons) {
                    str2 = str;
                    j = jIntValue;
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.J$0;
            String str4 = (String) this.L$0;
            ResultKt.b(obj);
            j = j2;
            str2 = str4;
            objB2 = obj;
        }
        this.this$0.E0(new yb(str2, j, this.$intent, ((WalletSetupConfiguration) objB2).e));
        viewCreatedIntent = this.$intent;
        if (viewCreatedIntent.b && (str3 = viewCreatedIntent.c) != null && str3.length() != 0) {
            this.this$0.J0(new QuickpayTripAmountIntent.ValidateIntent(this.this$0.y.a(this.this$0.y.b(this.$intent.c), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), true));
        }
        return Unit.f17538a;
        String str5 = ((ResolvedSupportPolicy) objA).c;
        QuickpayTripAmountComponent quickpayTripAmountComponent = this.this$0;
        Source source = this.$intent.f8882a;
        String sourceName = source != null ? source.getSourceName() : null;
        AnalyticsContract analyticsContract = quickpayTripAmountComponent.u;
        if (sourceName == null) {
            sourceName = "";
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, "chalo pay trip amount fragment opened", sourceName, null, null, false, 28);
        this.this$0.E0(new lu0(25, this.$intent, str5));
        GetQuickPayDisclaimerTextUseCase getQuickPayDisclaimerTextUseCase = this.this$0.w;
        this.label = 2;
        objA2 = getQuickPayDisclaimerTextUseCase.a(this);
        if (objA2 != coroutineSingletons) {
            str = (String) objA2;
            FetchWalletBalanceUseCase fetchWalletBalanceUseCase2 = this.this$0.x;
            WalletTypeIdentifier walletTypeIdentifier2 = this.$intent.d;
            this.L$0 = str;
            this.label = 3;
            objB = fetchWalletBalanceUseCase2.b(walletTypeIdentifier2, this);
            if (objB != coroutineSingletons) {
                chaloUseCaseResult = (ChaloUseCaseResult) objB;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    jIntValue = ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).intValue();
                } else {
                    jIntValue = -1;
                }
                GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase3 = this.this$0.C;
                this.L$0 = str;
                this.J$0 = jIntValue;
                this.label = 4;
                objB2 = getWalletSetupConfigurationUseCase3.b(this);
                if (objB2 != coroutineSingletons) {
                    str2 = str;
                    j = jIntValue;
                    this.this$0.E0(new yb(str2, j, this.$intent, ((WalletSetupConfiguration) objB2).e));
                    viewCreatedIntent = this.$intent;
                    if (viewCreatedIntent.b) {
                        this.this$0.J0(new QuickpayTripAmountIntent.ValidateIntent(this.this$0.y.a(this.this$0.y.b(this.$intent.c), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING), true));
                    }
                    return Unit.f17538a;
                }
            }
        }
        return coroutineSingletons;
    }
}
