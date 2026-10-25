package app.chalo.checkout.ui.screen.card;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import defpackage.k2;
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
@DebugMetadata(c = "app.chalo.checkout.ui.screen.card.CheckoutCardComponent$handleViewCreatedIntent$1", f = "CheckoutCardComponent.kt", l = {155}, m = "invokeSuspend", v = 1)
final class CheckoutCardComponent$handleViewCreatedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CheckoutCardComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutCardComponent$handleViewCreatedIntent$1(CheckoutCardComponent checkoutCardComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = checkoutCardComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutCardComponent$handleViewCreatedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutCardComponent$handleViewCreatedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CheckoutCardComponent checkoutCardComponent = this.this$0;
            StringProvider stringProvider = checkoutCardComponent.m;
            StringEnum stringEnum = StringEnum.PAY_PREFIX;
            Object[] objArr = {checkoutCardComponent.o.a(Long.parseLong(checkoutCardComponent.k.getC().f2691a.c), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
            this.label = 1;
            obj = stringProvider.b(stringEnum, objArr, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.this$0.E0(new k2((String) obj, 12));
        ICheckoutAnalyticsHelper.DefaultImpls.a(this.this$0.n, "card screen opened", null, 14);
        return Unit.f17538a;
    }
}
