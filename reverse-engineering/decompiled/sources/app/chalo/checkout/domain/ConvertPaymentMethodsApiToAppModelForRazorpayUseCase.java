package app.chalo.checkout.domain;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.mapper.data.PaymentMethodsApiToAppModelHelperKt;
import app.chalo.checkout.data.model.api.response.PaymentInstrument;
import app.chalo.checkout.data.model.api.response.PaymentMethodsAPIModel;
import app.chalo.checkout.data.model.api.response.PreferredPaymentMethod;
import app.chalo.checkout.data.model.app.PaymentDisplayDetailsAppModel;
import app.chalo.checkout.data.model.app.PaymentInstrumentAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodsAppModel;
import app.chalo.checkout.data.model.app.PreferredPaymentMethodsAppModel;
import app.chalo.checkout.domain.razorpay.GetRazorPaySupportedUpiAppsUseCase;
import app.chalo.checkout.domain.razorpay.RazorpayUpiAppDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/ConvertPaymentMethodsApiToAppModelForRazorpayUseCase;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConvertPaymentMethodsApiToAppModelForRazorpayUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetRazorPaySupportedUpiAppsUseCase f1367a;
    public final ICheckoutAnalyticsHelper b;

    public ConvertPaymentMethodsApiToAppModelForRazorpayUseCase(GetRazorPaySupportedUpiAppsUseCase getRazorPaySupportedUpiAppsUseCase, ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper) {
        this.f1367a = getRazorPaySupportedUpiAppsUseCase;
        this.b = iCheckoutAnalyticsHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(List list, ContinuationImpl continuationImpl) {
        ConvertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1 convertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1;
        String str;
        Object next;
        if (continuationImpl instanceof ConvertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1) {
            convertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1 = (ConvertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1) continuationImpl;
            int i = convertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                convertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1.label = i - Integer.MIN_VALUE;
            } else {
                convertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1 = new ConvertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1(this, continuationImpl);
            }
        } else {
            convertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1 = new ConvertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1(this, continuationImpl);
        }
        Object objA = convertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = convertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            convertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1.L$0 = list;
            convertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1.label = 1;
            objA = this.f1367a.a(convertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) convertPaymentMethodsApiToAppModelForRazorpayUseCase$getPaymentInstrumentForRazorpayUpi$1.L$0;
            ResultKt.b(objA);
        }
        List list2 = (List) objA;
        this.b.b("razorpay upi supported apps", MapsKt.h(new Pair("apps", list2.toString())));
        List<RazorpayUpiAppDetails> list3 = list2;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
        for (RazorpayUpiAppDetails razorpayUpiAppDetails : list3) {
            Iterator it = list.iterator();
            do {
                str = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((PaymentInstrument) next).b, razorpayUpiAppDetails.c));
            PaymentInstrument paymentInstrument = (PaymentInstrument) next;
            String str2 = razorpayUpiAppDetails.c;
            boolean z = paymentInstrument != null ? paymentInstrument.c : true;
            if (paymentInstrument != null) {
                str = paymentInstrument.g;
            }
            arrayList.add(new PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel(new PaymentDisplayDetailsAppModel(str2, null, str, null, razorpayUpiAppDetails.b, z), razorpayUpiAppDetails.f1399a, false));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f3 A[LOOP:0: B:45:0x00ed->B:47:0x00f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0108  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:56:0x012f A[LOOP:1: B:54:0x0129->B:56:0x012f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0144  */
    /* JADX WARN: Code duplicated, block: B:59:0x014d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:64:0x0165 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:71:0x017a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0183  */
    /* JADX WARN: Code duplicated, block: B:74:0x0185  */
    /* JADX WARN: Code duplicated, block: B:76:0x018d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0191  */
    /* JADX WARN: Code duplicated, block: B:79:0x0195  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0199  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [app.chalo.checkout.domain.ConvertPaymentMethodsApiToAppModelForRazorpayUseCase] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ClosedLoopWallet] */
    /* JADX WARN: Type inference failed for: r11v28, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$JuspayTurboUpi] */
    /* JADX WARN: Type inference failed for: r11v29, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ChaloPay] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v37, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Cash] */
    /* JADX WARN: Type inference failed for: r11v41, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Card] */
    /* JADX WARN: Type inference failed for: r11v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v51, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ChaloPay] */
    /* JADX WARN: Type inference failed for: r11v52, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ChaloPay] */
    /* JADX WARN: Type inference failed for: r11v53, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$JuspayTurboUpi] */
    /* JADX WARN: Type inference failed for: r11v54, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$JuspayTurboUpi] */
    /* JADX WARN: Type inference failed for: r11v55, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ClosedLoopWallet] */
    /* JADX WARN: Type inference failed for: r11v56, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ClosedLoopWallet] */
    /* JADX WARN: Type inference failed for: r5v1, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$NetBanking] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$UPI] */
    /* JADX WARN: Type inference failed for: r5v12, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$LazyPay] */
    /* JADX WARN: Type inference failed for: r5v13, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$LazyPay] */
    /* JADX WARN: Type inference failed for: r5v4, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$NetBanking] */
    /* JADX WARN: Type inference failed for: r5v5, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Wallet] */
    /* JADX WARN: Type inference failed for: r5v8, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$Wallet] */
    /* JADX WARN: Type inference failed for: r5v9, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$RazorPayPaymentMethodOption$LazyPay] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0097 -> B:92:0x01c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00cb -> B:92:0x01c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0155 -> B:69:0x016e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0166 -> B:66:0x0169). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:44:0x00de
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.domain.ConvertPaymentMethodsApiToAppModelForRazorpayUseCase.b(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [app.chalo.checkout.domain.ConvertPaymentMethodsApiToAppModelForRazorpayUseCase] */
    public final Object c(PaymentMethodsAPIModel paymentMethodsAPIModel, ContinuationImpl continuationImpl) {
        ConvertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1 convertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1;
        ?? arrayList;
        if (continuationImpl instanceof ConvertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1) {
            convertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1 = (ConvertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1) continuationImpl;
            int i = convertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                convertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                convertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1 = new ConvertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            convertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1 = new ConvertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1(this, continuationImpl);
        }
        Object objB = convertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = convertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            List list = paymentMethodsAPIModel.b;
            convertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1.L$0 = paymentMethodsAPIModel;
            convertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1.label = 1;
            objB = b(list, convertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentMethodsAPIModel = (PaymentMethodsAPIModel) convertPaymentMethodsApiToAppModelForRazorpayUseCase$invoke$1.L$0;
            ResultKt.b(objB);
        }
        List list2 = (List) objB;
        this.b.b("payment method app model created for razorpay", MapsKt.h(new Pair("appModel", list2.toString())));
        String str = paymentMethodsAPIModel.f1266a;
        List list3 = paymentMethodsAPIModel.c;
        if (list3 != null) {
            List<PreferredPaymentMethod> list4 = list3;
            arrayList = new ArrayList(CollectionsKt.v(list4, 10));
            for (PreferredPaymentMethod preferredPaymentMethod : list4) {
                Intrinsics.i(preferredPaymentMethod, "<this>");
                arrayList.add(new PreferredPaymentMethodsAppModel(preferredPaymentMethod.f1270a, preferredPaymentMethod.b, PaymentMethodsApiToAppModelHelperKt.d(preferredPaymentMethod.c)));
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        return new PaymentMethodsAppModel(str, list2, arrayList);
    }
}
