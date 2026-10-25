package app.chalo.checkout.ui.screen.netbanking;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.model.app.PaymentMethodsAppModelKt;
import app.chalo.checkout.data.resolver.PaymentInfoState;
import app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import defpackage.fo;
import java.util.List;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.netbanking.CheckoutNetBankingComponent$handleLoadNetBankingAppsListIntent$1", f = "CheckoutNetBankingComponent.kt", l = {104, 106}, m = "invokeSuspend", v = 1)
final class CheckoutNetBankingComponent$handleLoadNetBankingAppsListIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CheckoutNetBankingComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutNetBankingComponent$handleLoadNetBankingAppsListIntent$1(CheckoutNetBankingComponent checkoutNetBankingComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = checkoutNetBankingComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutNetBankingComponent$handleLoadNetBankingAppsListIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutNetBankingComponent$handleLoadNetBankingAppsListIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 0;
        if (i == 0) {
            ResultKt.b(obj);
            List listC = PaymentMethodsAppModelKt.c(((PaymentInfoState) this.this$0.k.getF().getValue()).f1361a, this.this$0.k.getC().d.f5657a);
            CommonCheckoutItemUseCase commonCheckoutItemUseCase = this.this$0.m;
            this.label = 1;
            obj = commonCheckoutItemUseCase.b(listC, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$0;
            ResultKt.b(obj);
        }
        this.this$0.E0(new fo(i2, (String) obj, list));
        ICheckoutAnalyticsHelper.DefaultImpls.a(this.this$0.l, "Banking Screen Opened", null, 14);
        return Unit.f17538a;
        List list2 = (List) obj;
        CheckoutNetBankingComponent checkoutNetBankingComponent = this.this$0;
        StringProvider stringProvider = checkoutNetBankingComponent.o;
        StringEnum stringEnum = StringEnum.PAY_PREFIX;
        Object[] objArr = {checkoutNetBankingComponent.p.a(Long.parseLong(checkoutNetBankingComponent.k.getC().f2691a.c), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
        this.L$0 = list2;
        this.label = 2;
        Object objB = stringProvider.b(stringEnum, objArr, this);
        if (objB != coroutineSingletons) {
            list = list2;
            obj = objB;
            this.this$0.E0(new fo(i2, (String) obj, list));
            ICheckoutAnalyticsHelper.DefaultImpls.a(this.this$0.l, "Banking Screen Opened", null, 14);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
