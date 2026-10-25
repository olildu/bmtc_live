package app.chalo.checkout.ui.screen.checkout.phonepe;

import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
import app.chalo.checkout.data.resolver.PaymentInfoState;
import app.chalo.checkout.domain.phonepe.CreatePhonePeTransactionRequestUseCase;
import app.chalo.checkout.paymentprovider.phonepe.PhonePeAppTransactionRequestModel;
import app.chalo.checkout.paymentprovider.phonepe.PhonePeStartTransactionResult;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import defpackage.ir0;
import defpackage.tr0;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.checkout.phonepe.PhonePeCheckoutComponent$handleInitiateCheckoutIntent$1", f = "PhonePeCheckoutComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class PhonePeCheckoutComponent$handleInitiateCheckoutIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PhonePeCheckoutComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonePeCheckoutComponent$handleInitiateCheckoutIntent$1(PhonePeCheckoutComponent phonePeCheckoutComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = phonePeCheckoutComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhonePeCheckoutComponent$handleInitiateCheckoutIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PhonePeCheckoutComponent$handleInitiateCheckoutIntent$1 phonePeCheckoutComponent$handleInitiateCheckoutIntent$1 = (PhonePeCheckoutComponent$handleInitiateCheckoutIntent$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        phonePeCheckoutComponent$handleInitiateCheckoutIntent$1.invokeSuspend(unit);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0041  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PhonePeAppTransactionRequestModel phonePeAppTransactionRequestModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.E0(new ir0(12));
        this.this$0.k.z();
        SelectedPaymentInstrumentData selectedPaymentInstrumentData = ((PaymentInfoState) this.this$0.k.getF().getValue()).d;
        PhonePeCheckoutComponent phonePeCheckoutComponent = this.this$0;
        CreatePhonePeTransactionRequestUseCase createPhonePeTransactionRequestUseCase = phonePeCheckoutComponent.l;
        CheckoutPaymentData checkoutPaymentData = phonePeCheckoutComponent.k.getC();
        createPhonePeTransactionRequestUseCase.getClass();
        Intrinsics.i(checkoutPaymentData, "checkoutPaymentData");
        if (selectedPaymentInstrumentData == null) {
            phonePeAppTransactionRequestModel = null;
        } else {
            OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel = checkoutPaymentData.d;
            OrderPaymentProviderInfoAppModel.ProviderConfigAppModel providerConfigAppModel = orderPaymentProviderInfoAppModel instanceof OrderPaymentProviderInfoAppModel.ProviderConfigAppModel ? (OrderPaymentProviderInfoAppModel.ProviderConfigAppModel) orderPaymentProviderInfoAppModel : null;
            if (providerConfigAppModel == null) {
                phonePeAppTransactionRequestModel = null;
            } else {
                String str = providerConfigAppModel.g;
                String str2 = checkoutPaymentData.f2691a.f2689a;
                String str3 = providerConfigAppModel.i;
                if (StringsKt.F(str) || StringsKt.F(str2) || str3 == null || str3.length() == 0) {
                    phonePeAppTransactionRequestModel = null;
                } else {
                    phonePeAppTransactionRequestModel = new PhonePeAppTransactionRequestModel(str, str2, str3, selectedPaymentInstrumentData);
                }
            }
        }
        Unit unit = Unit.f17538a;
        if (phonePeAppTransactionRequestModel == null) {
            PhonePeCheckoutComponent phonePeCheckoutComponent2 = this.this$0;
            BuildersKt.d(phonePeCheckoutComponent2.j, null, null, new PhonePeCheckoutComponent$exitWithGenericError$1(phonePeCheckoutComponent2, null), 3);
            return unit;
        }
        this.this$0.k.Z(true);
        PhonePeCheckoutComponent phonePeCheckoutComponent3 = this.this$0;
        PhonePeStartTransactionResult phonePeStartTransactionResultA = phonePeCheckoutComponent3.m.a(phonePeAppTransactionRequestModel, new tr0(phonePeCheckoutComponent3, 3));
        PhonePeCheckoutComponent phonePeCheckoutComponent4 = this.this$0;
        phonePeCheckoutComponent4.getClass();
        switch (PhonePeCheckoutComponent.WhenMappings.f1479a[phonePeStartTransactionResultA.ordinal()]) {
            case 1:
                phonePeCheckoutComponent4.E0(new ir0(10));
                return unit;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                phonePeCheckoutComponent4.k.Z(false);
                BuildersKt.d(phonePeCheckoutComponent4.j, null, null, new PhonePeCheckoutComponent$exitWithGenericError$1(phonePeCheckoutComponent4, null), 3);
                return unit;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
