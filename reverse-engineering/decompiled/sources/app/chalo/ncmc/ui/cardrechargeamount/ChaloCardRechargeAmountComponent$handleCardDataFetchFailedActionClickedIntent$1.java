package app.chalo.ncmc.ui.cardrechargeamount;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.models.ChaloCardOptions;
import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.domain.GetAvailableChaloCardOptionsUseCase;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.WebViewArgs;
import defpackage.bj;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent$handleCardDataFetchFailedActionClickedIntent$1", f = "ChaloCardRechargeAmountComponent.kt", l = {251, 256}, m = "invokeSuspend", v = 1)
final class ChaloCardRechargeAmountComponent$handleCardDataFetchFailedActionClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CardRechargeDataFetchErrorReason $failureReason;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ChaloCardRechargeAmountComponent this$0;

    /* JADX INFO: renamed from: app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent$handleCardDataFetchFailedActionClickedIntent$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent$handleCardDataFetchFailedActionClickedIntent$1$2", f = "ChaloCardRechargeAmountComponent.kt", l = {241}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChaloCardDetails $cardDetails;
        int label;
        final /* synthetic */ ChaloCardRechargeAmountComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent, ChaloCardDetails chaloCardDetails, Continuation continuation) {
            super(2, continuation);
            this.this$0 = chaloCardRechargeAmountComponent;
            this.$cardDetails = chaloCardDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$cardDetails, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent = this.this$0;
                ChaloCardDetails chaloCardDetails = this.$cardDetails;
                this.label = 1;
                if (ChaloCardRechargeAmountComponent.G0(chaloCardRechargeAmountComponent, chaloCardDetails, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6290a;

        static {
            int[] iArr = new int[CardRechargeDataFetchErrorReason.values().length];
            try {
                iArr[CardRechargeDataFetchErrorReason.RECHARGE_CONFIG_FETCH_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardRechargeDataFetchErrorReason.CARD_DETAILS_FETCH_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardRechargeDataFetchErrorReason.NO_ACTIVE_RECHARGE_CONFIG_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardRechargeDataFetchErrorReason.NO_LINKED_CARD_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardRechargeDataFetchErrorReason.CARD_RECHARGE_DISABLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CardRechargeDataFetchErrorReason.CARD_BLOCKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f6290a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardRechargeAmountComponent$handleCardDataFetchFailedActionClickedIntent$1(ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent, CardRechargeDataFetchErrorReason cardRechargeDataFetchErrorReason, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloCardRechargeAmountComponent;
        this.$failureReason = cardRechargeDataFetchErrorReason;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloCardRechargeAmountComponent$handleCardDataFetchFailedActionClickedIntent$1(this.this$0, this.$failureReason, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloCardRechargeAmountComponent$handleCardDataFetchFailedActionClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        String str;
        Object objB;
        ChaloNavigationManager chaloNavigationManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
                objA = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloNavigationManager = (ChaloNavigationManager) this.L$1;
                str = (String) this.L$0;
                ResultKt.b(obj);
                objB = obj;
            }
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str, (String) objB, false, false), null, null, 6));
            return unit;
        }
        ResultKt.b(obj);
        ChaloCardDetails chaloCardDetails = ((ChaloCardRechargeAmountViewState) this.this$0.f.getValue()).c;
        if (chaloCardDetails != null) {
            ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent = this.this$0;
            AnalyticsContract.DefaultImpls.a(chaloCardRechargeAmountComponent.p, "chalo card recharge error action btn clicked", "CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN", ChaloCardRechargeAmountContractKt.a((ChaloCardRechargeAmountViewState) chaloCardRechargeAmountComponent.f.getValue(), MapsKt.h(new Pair("attribute error reason", this.$failureReason.name()))), null, false, 24);
            switch (WhenMappings.f6290a[this.$failureReason.ordinal()]) {
                case 1:
                case 2:
                    this.this$0.E0(new bj(5));
                    ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent2 = this.this$0;
                    BuildersKt.d(chaloCardRechargeAmountComponent2.j, null, null, new AnonymousClass2(chaloCardRechargeAmountComponent2, chaloCardDetails, null), 3);
                    return unit;
                case 3:
                case 4:
                case 5:
                    ChaloNavigationManagerKt.c(this.this$0.w);
                    return unit;
                case 6:
                    GetAvailableChaloCardOptionsUseCase getAvailableChaloCardOptionsUseCase = this.this$0.q;
                    this.label = 1;
                    objA = getAvailableChaloCardOptionsUseCase.a(this);
                    if (objA != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return unit;
        ChaloCardOptions chaloCardOptions = (ChaloCardOptions) objA;
        if (chaloCardOptions != null && (str = chaloCardOptions.b) != null) {
            ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent3 = this.this$0;
            ChaloNavigationManager chaloNavigationManager2 = chaloCardRechargeAmountComponent3.w;
            this.L$0 = str;
            this.L$1 = chaloNavigationManager2;
            this.label = 2;
            objB = chaloCardRechargeAmountComponent3.v.b(StringEnum.BUY_CARD, new Object[0], this);
            if (objB != coroutineSingletons) {
                chaloNavigationManager = chaloNavigationManager2;
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WebViewArgs(str, (String) objB, false, false), null, null, 6));
            }
            return coroutineSingletons;
        }
        return unit;
    }
}
