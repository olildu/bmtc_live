package app.chalo.checkout.domain.razorpay;

import app.chalo.checkout.utility.IRazorPayHelper;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/razorpay/GetRazorPaySupportedUpiAppsUseCase;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRazorPaySupportedUpiAppsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IRazorPayHelper f1397a;

    public GetRazorPaySupportedUpiAppsUseCase(IRazorPayHelper iRazorPayHelper) {
        this.f1397a = iRazorPayHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(ContinuationImpl continuationImpl) {
        GetRazorPaySupportedUpiAppsUseCase$invoke$1 getRazorPaySupportedUpiAppsUseCase$invoke$1;
        if (continuationImpl instanceof GetRazorPaySupportedUpiAppsUseCase$invoke$1) {
            getRazorPaySupportedUpiAppsUseCase$invoke$1 = (GetRazorPaySupportedUpiAppsUseCase$invoke$1) continuationImpl;
            int i = getRazorPaySupportedUpiAppsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRazorPaySupportedUpiAppsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getRazorPaySupportedUpiAppsUseCase$invoke$1 = new GetRazorPaySupportedUpiAppsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getRazorPaySupportedUpiAppsUseCase$invoke$1 = new GetRazorPaySupportedUpiAppsUseCase$invoke$1(this, continuationImpl);
        }
        Object objD = getRazorPaySupportedUpiAppsUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getRazorPaySupportedUpiAppsUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            getRazorPaySupportedUpiAppsUseCase$invoke$1.label = 1;
            objD = this.f1397a.d(getRazorPaySupportedUpiAppsUseCase$invoke$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        Iterable<app.chalo.checkout.paymentprovider.razorpay.RazorpayUpiAppDetails> iterable = (Iterable) objD;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(iterable, 10));
        for (app.chalo.checkout.paymentprovider.razorpay.RazorpayUpiAppDetails razorpayUpiAppDetails : iterable) {
            arrayList.add(new RazorpayUpiAppDetails(razorpayUpiAppDetails.c, razorpayUpiAppDetails.b, razorpayUpiAppDetails.f1431a));
        }
        return arrayList;
    }
}
