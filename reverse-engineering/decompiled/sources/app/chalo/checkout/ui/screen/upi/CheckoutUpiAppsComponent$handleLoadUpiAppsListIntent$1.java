package app.chalo.checkout.ui.screen.upi;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
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
@DebugMetadata(c = "app.chalo.checkout.ui.screen.upi.CheckoutUpiAppsComponent$handleLoadUpiAppsListIntent$1", f = "CheckoutUpiAppsViewModel.kt", l = {AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, 123}, m = "invokeSuspend", v = 1)
final class CheckoutUpiAppsComponent$handleLoadUpiAppsListIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CheckoutUpiAppsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutUpiAppsComponent$handleLoadUpiAppsListIntent$1(CheckoutUpiAppsComponent checkoutUpiAppsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = checkoutUpiAppsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutUpiAppsComponent$handleLoadUpiAppsListIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutUpiAppsComponent$handleLoadUpiAppsListIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listD;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                listD = (List) this.L$0;
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                ResultKt.b(obj);
            }
            this.this$0.E0(new fo(i2, str, (List) obj));
            ICheckoutAnalyticsHelper.DefaultImpls.a(this.this$0.m, "checkout upi list screen opened", null, 14);
            return unit;
        }
        ResultKt.b(obj);
        CheckoutUpiAppsComponent checkoutUpiAppsComponent = this.this$0;
        if (checkoutUpiAppsComponent.d) {
            return unit;
        }
        checkoutUpiAppsComponent.d = true;
        listD = PaymentMethodsAppModelKt.d(((PaymentInfoState) this.this$0.k.getF().getValue()).f1361a, checkoutUpiAppsComponent.k.getC().d.f5657a);
        long j = Long.parseLong(this.this$0.k.getC().f2691a.c);
        CheckoutUpiAppsComponent checkoutUpiAppsComponent2 = this.this$0;
        StringProvider stringProvider = checkoutUpiAppsComponent2.o;
        StringEnum stringEnum = StringEnum.PAY_PREFIX;
        Object[] objArr = {checkoutUpiAppsComponent2.n.a(j, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)};
        this.L$0 = listD;
        this.label = 1;
        obj = stringProvider.b(stringEnum, objArr, this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        String str2 = (String) obj;
        CommonCheckoutItemUseCase commonCheckoutItemUseCase = this.this$0.l;
        this.L$0 = str2;
        this.label = 2;
        Object objB = commonCheckoutItemUseCase.b(listD, this);
        if (objB != coroutineSingletons) {
            str = str2;
            obj = objB;
            this.this$0.E0(new fo(i2, str, (List) obj));
            ICheckoutAnalyticsHelper.DefaultImpls.a(this.this$0.m, "checkout upi list screen opened", null, 14);
            return unit;
        }
        return coroutineSingletons;
    }
}
