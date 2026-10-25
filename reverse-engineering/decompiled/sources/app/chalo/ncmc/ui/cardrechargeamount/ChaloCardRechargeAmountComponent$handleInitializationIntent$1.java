package app.chalo.ncmc.ui.cardrechargeamount;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.ncmc.data.LinkCardConfig;
import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import app.chalo.ncmc.domain.GetLinkCardConfigUseCase;
import app.chalo.ncmc.utils.ChaloCardAnalyticsExtentionsKt;
import defpackage.aj;
import defpackage.ch;
import defpackage.f;
import java.util.LinkedHashMap;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.math.Primes;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent$handleInitializationIntent$1", f = "ChaloCardRechargeAmountComponent.kt", l = {190}, m = "invokeSuspend", v = 1)
final class ChaloCardRechargeAmountComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChaloCardRechargeAmountFlowType $flowType;
    final /* synthetic */ Source $source;
    int label;
    final /* synthetic */ ChaloCardRechargeAmountComponent this$0;

    /* JADX INFO: renamed from: app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent$handleInitializationIntent$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent$handleInitializationIntent$1$3", f = "ChaloCardRechargeAmountComponent.kt", l = {Primes.SMALL_FACTOR_LIMIT}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChaloCardDetails $cardDetails;
        int label;
        final /* synthetic */ ChaloCardRechargeAmountComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent, ChaloCardDetails chaloCardDetails, Continuation continuation) {
            super(2, continuation);
            this.this$0 = chaloCardRechargeAmountComponent;
            this.$cardDetails = chaloCardDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$cardDetails, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloCardRechargeAmountComponent$handleInitializationIntent$1(ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent, ChaloCardRechargeAmountFlowType chaloCardRechargeAmountFlowType, Source source, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloCardRechargeAmountComponent;
        this.$flowType = chaloCardRechargeAmountFlowType;
        this.$source = source;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloCardRechargeAmountComponent$handleInitializationIntent$1(this.this$0, this.$flowType, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloCardRechargeAmountComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            GetLinkCardConfigUseCase getLinkCardConfigUseCase = this.this$0.r;
            this.label = 1;
            obj = getLinkCardConfigUseCase.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.this$0.E0(new f(26, (LinkCardConfig) obj, this.$flowType));
        ChaloCardRechargeAmountFlowType chaloCardRechargeAmountFlowType = this.$flowType;
        String strA = null;
        if (chaloCardRechargeAmountFlowType instanceof ChaloCardRechargeAmountFlowType.WithChaloCardDetails) {
            ChaloCardDetails chaloCardDetails = ((ChaloCardRechargeAmountFlowType.WithChaloCardDetails) chaloCardRechargeAmountFlowType).b;
            ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent = this.this$0;
            Source source = this.$source;
            chaloCardRechargeAmountComponent.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (chaloCardDetails != null) {
                ChaloCardAnalyticsExtentionsKt.b(chaloCardDetails, linkedHashMap);
            }
            AnalyticsContractImplKt.b(chaloCardRechargeAmountComponent.p, "chalo card enter recharge amount screen opened", source, linkedHashMap, false, 24);
            this.this$0.E0(new ch(chaloCardDetails, 10));
            ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent2 = this.this$0;
            BuildersKt.d(chaloCardRechargeAmountComponent2.j, null, null, new AnonymousClass3(chaloCardRechargeAmountComponent2, chaloCardDetails, null), 3);
        } else if (chaloCardRechargeAmountFlowType instanceof ChaloCardRechargeAmountFlowType.WithoutChaloCardDetails) {
            ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent3 = this.this$0;
            Source source2 = this.$source;
            chaloCardRechargeAmountComponent3.getClass();
            AnalyticsContractImplKt.b(chaloCardRechargeAmountComponent3.p, "chalo card enter recharge amount screen opened", source2, new LinkedHashMap(), false, 24);
            ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent4 = this.this$0;
            ChaloCardRechargeAmountFlowType.WithoutChaloCardDetails withoutChaloCardDetails = (ChaloCardRechargeAmountFlowType.WithoutChaloCardDetails) this.$flowType;
            ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = withoutChaloCardDetails.c;
            String str = withoutChaloCardDetails.b;
            chaloCardRechargeAmountComponent4.getClass();
            Long l = chaloCardRechargeConfigAppModel.b.f6132a;
            if (l != null) {
                strA = chaloCardRechargeAmountComponent4.l.a(l.longValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            }
            chaloCardRechargeAmountComponent4.E0(new aj(chaloCardRechargeAmountComponent4, str, chaloCardRechargeConfigAppModel, (ChaloCardDetails) null, CardRechargeAmountLayoutType.EnterAmountLayout.f6285a, strA));
        } else if (!Intrinsics.d(chaloCardRechargeAmountFlowType, ChaloCardRechargeAmountFlowType.Unknown.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f17538a;
    }
}
