package app.chalo.checkout.domain.phonepe;

import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdk;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdkProvider;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/phonepe/GetPhonePeUpiAppsUseCase;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPhonePeUpiAppsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PhonepeSdkProvider f1394a;
    public final CheckoutPaymentDataResolver b;

    public GetPhonePeUpiAppsUseCase(PhonepeSdkProvider phonepeSdkProvider, CheckoutPaymentDataResolver checkoutPaymentDataResolver) {
        this.f1394a = phonepeSdkProvider;
        this.b = checkoutPaymentDataResolver;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetPhonePeUpiAppsUseCase$invoke$1 getPhonePeUpiAppsUseCase$invoke$1;
        String str;
        if (continuationImpl instanceof GetPhonePeUpiAppsUseCase$invoke$1) {
            getPhonePeUpiAppsUseCase$invoke$1 = (GetPhonePeUpiAppsUseCase$invoke$1) continuationImpl;
            int i = getPhonePeUpiAppsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPhonePeUpiAppsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getPhonePeUpiAppsUseCase$invoke$1 = new GetPhonePeUpiAppsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getPhonePeUpiAppsUseCase$invoke$1 = new GetPhonePeUpiAppsUseCase$invoke$1(this, continuationImpl);
        }
        Object objD = getPhonePeUpiAppsUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getPhonePeUpiAppsUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel = this.b.u().d;
            OrderPaymentProviderInfoAppModel.ProviderConfigAppModel providerConfigAppModel = orderPaymentProviderInfoAppModel instanceof OrderPaymentProviderInfoAppModel.ProviderConfigAppModel ? (OrderPaymentProviderInfoAppModel.ProviderConfigAppModel) orderPaymentProviderInfoAppModel : null;
            if (providerConfigAppModel != null && (str = providerConfigAppModel.g) != null) {
                String str2 = StringsKt.F(str) ? null : str;
                if (str2 != null) {
                    PhonepeSdk phonepeSdkC = this.f1394a.c();
                    if (phonepeSdkC != null) {
                        getPhonePeUpiAppsUseCase$invoke$1.label = 1;
                        objD = phonepeSdkC.d(str2, getPhonePeUpiAppsUseCase$invoke$1);
                        if (objD == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return EmptyList.f17557a;
                }
            }
            return EmptyList.f17557a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objD);
        List list = (List) objD;
        if (list != null) {
            return list;
        }
        return EmptyList.f17557a;
    }
}
