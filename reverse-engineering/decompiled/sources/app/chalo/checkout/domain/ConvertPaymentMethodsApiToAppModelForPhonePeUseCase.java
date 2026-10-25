package app.chalo.checkout.domain;

import app.chalo.checkout.analytics.CheckoutAnalyticsHelper;
import app.chalo.checkout.data.mapper.data.PaymentMethodsApiToAppModelHelperKt;
import app.chalo.checkout.data.model.api.response.PaymentInstrument;
import app.chalo.checkout.data.model.api.response.PaymentMethodsAPIModel;
import app.chalo.checkout.data.model.api.response.PreferredPaymentMethod;
import app.chalo.checkout.data.model.app.PaymentDisplayDetailsAppModel;
import app.chalo.checkout.data.model.app.PaymentInstrumentAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodsAppModel;
import app.chalo.checkout.data.model.app.PreferredPaymentMethodsAppModel;
import app.chalo.checkout.data.model.ui.PaymentLogo;
import app.chalo.checkout.domain.phonepe.GetPhonePeUpiAppsUseCase;
import app.chalo.checkout.paymentprovider.phonepe.PhonePeUpiApp;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/ConvertPaymentMethodsApiToAppModelForPhonePeUseCase;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConvertPaymentMethodsApiToAppModelForPhonePeUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetPhonePeUpiAppsUseCase f1366a;
    public final CheckoutAnalyticsHelper b;

    public ConvertPaymentMethodsApiToAppModelForPhonePeUseCase(GetPhonePeUpiAppsUseCase getPhonePeUpiAppsUseCase, CheckoutAnalyticsHelper checkoutAnalyticsHelper) {
        this.f1366a = getPhonePeUpiAppsUseCase;
        this.b = checkoutAnalyticsHelper;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable a(List list, ContinuationImpl continuationImpl, boolean z) {
        ConvertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1 convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1;
        List list2;
        Object objA;
        boolean z2;
        Object uPIPaymentInstrumentAppModel;
        Object next;
        boolean z3;
        if (continuationImpl instanceof ConvertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1) {
            convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1 = (ConvertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1) continuationImpl;
            int i = convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1.label = i - Integer.MIN_VALUE;
            } else {
                convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1 = new ConvertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1(this, continuationImpl);
            }
        } else {
            convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1 = new ConvertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1(this, continuationImpl);
        }
        Object obj = convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            list2 = list;
            convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1.L$0 = list2;
            convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1.Z$0 = z;
            convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1.label = 1;
            objA = this.f1366a.a(convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            z2 = z;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1.Z$0;
            List list3 = (List) convertPaymentMethodsApiToAppModelForPhonePeUseCase$getPaymentInstrumentForPhonePeUpi$1.L$0;
            ResultKt.b(obj);
            objA = obj;
            list2 = list3;
        }
        List<PhonePeUpiApp> list4 = (List) objA;
        this.b.b("phonepe upi supported apps", MapsKt.h(new Pair("apps", list4.toString())));
        ArrayList arrayList = new ArrayList();
        for (PhonePeUpiApp phonePeUpiApp : list4) {
            Iterator it = list2.iterator();
            do {
                uPIPaymentInstrumentAppModel = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((PaymentInstrument) next).b, phonePeUpiApp.b));
            PaymentInstrument paymentInstrument = (PaymentInstrument) next;
            if (paymentInstrument == null || paymentInstrument.d) {
                String str = phonePeUpiApp.b;
                PaymentLogo paymentLogo = phonePeUpiApp.c;
                if (!z2) {
                    z3 = false;
                } else if (paymentInstrument != null ? paymentInstrument.c : true) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String str2 = paymentInstrument != null ? paymentInstrument.g : null;
                PaymentLogo.Url url = paymentLogo instanceof PaymentLogo.Url ? (PaymentLogo.Url) paymentLogo : null;
                uPIPaymentInstrumentAppModel = new PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel(new PaymentDisplayDetailsAppModel(str, null, str2, null, url != null ? url.f1347a : null, z3), phonePeUpiApp.f1422a, paymentLogo instanceof PaymentLogo.PlatformDrawable);
            }
            if (uPIPaymentInstrumentAppModel != null) {
                arrayList.add(uPIPaymentInstrumentAppModel);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x013d  */
    /* JADX WARN: Code duplicated, block: B:53:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0158  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162  */
    /* JADX WARN: Code duplicated, block: B:58:0x0164  */
    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0170  */
    /* JADX WARN: Code duplicated, block: B:63:0x0174  */
    /* JADX WARN: Code duplicated, block: B:64:0x0178  */
    /* JADX WARN: Code duplicated, block: B:66:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x0184  */
    /* JADX WARN: Code duplicated, block: B:69:0x0188  */
    /* JADX WARN: Code duplicated, block: B:70:0x018c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0194  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$JuspayTurboUpi] */
    /* JADX WARN: Type inference failed for: r1v17, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ClosedLoopWallet] */
    /* JADX WARN: Type inference failed for: r1v18, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ChaloPay] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$NetBanking] */
    /* JADX WARN: Type inference failed for: r1v22, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$PhonePePaymentMethodOption$Card] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v28, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ChaloPay] */
    /* JADX WARN: Type inference failed for: r1v29, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ChaloPay] */
    /* JADX WARN: Type inference failed for: r1v30, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ClosedLoopWallet] */
    /* JADX WARN: Type inference failed for: r1v31, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$ClosedLoopWallet] */
    /* JADX WARN: Type inference failed for: r1v32, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$JuspayTurboUpi] */
    /* JADX WARN: Type inference failed for: r1v33, types: [app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel$JuspayTurboUpi] */
    /* JADX WARN: Type inference failed for: r24v0, types: [app.chalo.checkout.domain.ConvertPaymentMethodsApiToAppModelForPhonePeUseCase] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x009f -> B:76:0x019f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x012d -> B:76:0x019f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x014c -> B:54:0x014f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x00f6
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.domain.ConvertPaymentMethodsApiToAppModelForPhonePeUseCase.b(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [app.chalo.checkout.domain.ConvertPaymentMethodsApiToAppModelForPhonePeUseCase] */
    public final Object c(PaymentMethodsAPIModel paymentMethodsAPIModel, ContinuationImpl continuationImpl) {
        ConvertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1 convertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1;
        ?? arrayList;
        if (continuationImpl instanceof ConvertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1) {
            convertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1 = (ConvertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1) continuationImpl;
            int i = convertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                convertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                convertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1 = new ConvertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            convertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1 = new ConvertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1(this, continuationImpl);
        }
        Object objB = convertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = convertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            List list = paymentMethodsAPIModel.b;
            convertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1.L$0 = paymentMethodsAPIModel;
            convertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1.label = 1;
            objB = b(list, convertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentMethodsAPIModel = (PaymentMethodsAPIModel) convertPaymentMethodsApiToAppModelForPhonePeUseCase$invoke$1.L$0;
            ResultKt.b(objB);
        }
        List list2 = (List) objB;
        this.b.b("payment method app model created for phonepe", MapsKt.h(new Pair("appModel", list2.toString())));
        String str = paymentMethodsAPIModel.f1266a;
        List list3 = paymentMethodsAPIModel.c;
        if (list3 != null) {
            List<PreferredPaymentMethod> list4 = list3;
            arrayList = new ArrayList(CollectionsKt.v(list4, 10));
            for (PreferredPaymentMethod preferredPaymentMethod : list4) {
                Intrinsics.i(preferredPaymentMethod, "<this>");
                arrayList.add(new PreferredPaymentMethodsAppModel(preferredPaymentMethod.f1270a, preferredPaymentMethod.b, PaymentMethodsApiToAppModelHelperKt.b(preferredPaymentMethod.c)));
            }
        } else {
            arrayList = EmptyList.f17557a;
        }
        return new PaymentMethodsAppModel(str, list2, arrayList);
    }
}
