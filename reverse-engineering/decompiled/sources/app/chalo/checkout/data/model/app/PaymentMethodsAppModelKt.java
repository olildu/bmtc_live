package app.chalo.checkout.data.model.app;

import app.chalo.models.CheckoutPaymentProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"checkout_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PaymentMethodsAppModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1319a;

        static {
            int[] iArr = new int[CheckoutPaymentProvider.values().length];
            try {
                iArr[CheckoutPaymentProvider.RAZORPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckoutPaymentProvider.INAI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckoutPaymentProvider.PHONEPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckoutPaymentProvider.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckoutPaymentProvider.CHALOPAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckoutPaymentProvider.YES_BANK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckoutPaymentProvider.CUSTOM_URL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CheckoutPaymentProvider.NO_PAYMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CheckoutPaymentProvider.CLDW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f1319a = iArr;
        }
    }

    public static final PaymentMethodOptionsAppModel a(PaymentMethodsAppModel paymentMethodsAppModel) {
        Object next;
        Intrinsics.i(paymentMethodsAppModel, "<this>");
        Iterator it = paymentMethodsAppModel.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((PaymentMethodOptionsAppModel) next) instanceof PaymentMethodOptionsAppModel.ChaloPay) {
                return (PaymentMethodOptionsAppModel) next;
            }
        }
        next = null;
        return (PaymentMethodOptionsAppModel) next;
    }

    public static final PaymentMethodOptionsAppModel b(PaymentMethodsAppModel paymentMethodsAppModel) {
        Object next;
        Intrinsics.i(paymentMethodsAppModel, "<this>");
        Iterator it = paymentMethodsAppModel.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((PaymentMethodOptionsAppModel) next) instanceof PaymentMethodOptionsAppModel.ClosedLoopWallet) {
                return (PaymentMethodOptionsAppModel) next;
            }
        }
        next = null;
        return (PaymentMethodOptionsAppModel) next;
    }

    public static final List c(PaymentMethodsAppModel paymentMethodsAppModel, CheckoutPaymentProvider provider) {
        List list;
        Intrinsics.i(paymentMethodsAppModel, "<this>");
        List list2 = paymentMethodsAppModel.b;
        Intrinsics.i(provider, "provider");
        switch (WhenMappings.f1319a[provider.ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (obj instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.NetBanking) {
                        arrayList.add(obj);
                    }
                }
                PaymentMethodOptionsAppModel paymentMethodOptionsAppModel = (PaymentMethodOptionsAppModel) CollectionsKt.H(arrayList);
                list = paymentMethodOptionsAppModel != null ? ((PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.NetBanking) paymentMethodOptionsAppModel).d : null;
                return list == null ? EmptyList.f17557a : list;
            case 2:
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.NetBanking) {
                        arrayList2.add(obj2);
                    }
                }
                PaymentMethodOptionsAppModel paymentMethodOptionsAppModel2 = (PaymentMethodOptionsAppModel) CollectionsKt.H(arrayList2);
                list = paymentMethodOptionsAppModel2 != null ? ((PaymentMethodOptionsAppModel.InaiPaymentMethodOption.NetBanking) paymentMethodOptionsAppModel2).d : null;
                return list == null ? EmptyList.f17557a : list;
            case 3:
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.NetBanking) {
                        arrayList3.add(obj3);
                    }
                }
                PaymentMethodOptionsAppModel paymentMethodOptionsAppModel3 = (PaymentMethodOptionsAppModel) CollectionsKt.H(arrayList3);
                list = paymentMethodOptionsAppModel3 != null ? ((PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.NetBanking) paymentMethodOptionsAppModel3).d : null;
                return list == null ? EmptyList.f17557a : list;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return EmptyList.f17557a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final List d(PaymentMethodsAppModel paymentMethodsAppModel, CheckoutPaymentProvider provider) {
        List list;
        Intrinsics.i(paymentMethodsAppModel, "<this>");
        List list2 = paymentMethodsAppModel.b;
        Intrinsics.i(provider, "provider");
        switch (WhenMappings.f1319a[provider.ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (obj instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.UPI) {
                        arrayList.add(obj);
                    }
                }
                PaymentMethodOptionsAppModel paymentMethodOptionsAppModel = (PaymentMethodOptionsAppModel) CollectionsKt.H(arrayList);
                list = paymentMethodOptionsAppModel != null ? ((PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.UPI) paymentMethodOptionsAppModel).d : null;
                return list == null ? EmptyList.f17557a : list;
            case 2:
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.UPI) {
                        arrayList2.add(obj2);
                    }
                }
                PaymentMethodOptionsAppModel paymentMethodOptionsAppModel2 = (PaymentMethodOptionsAppModel) CollectionsKt.H(arrayList2);
                list = paymentMethodOptionsAppModel2 != null ? ((PaymentMethodOptionsAppModel.InaiPaymentMethodOption.UPI) paymentMethodOptionsAppModel2).d : null;
                return list == null ? EmptyList.f17557a : list;
            case 3:
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.UPI) {
                        arrayList3.add(obj3);
                    }
                }
                PaymentMethodOptionsAppModel paymentMethodOptionsAppModel3 = (PaymentMethodOptionsAppModel) CollectionsKt.H(arrayList3);
                list = paymentMethodOptionsAppModel3 != null ? ((PaymentMethodOptionsAppModel.PhonePePaymentMethodOption.UPI) paymentMethodOptionsAppModel3).d : null;
                return list == null ? EmptyList.f17557a : list;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return EmptyList.f17557a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final List e(PaymentMethodsAppModel paymentMethodsAppModel, CheckoutPaymentProvider provider) {
        List list;
        Intrinsics.i(paymentMethodsAppModel, "<this>");
        List list2 = paymentMethodsAppModel.b;
        Intrinsics.i(provider, "provider");
        switch (WhenMappings.f1319a[provider.ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (obj instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Wallet) {
                        arrayList.add(obj);
                    }
                }
                PaymentMethodOptionsAppModel paymentMethodOptionsAppModel = (PaymentMethodOptionsAppModel) CollectionsKt.H(arrayList);
                list = paymentMethodOptionsAppModel != null ? ((PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.Wallet) paymentMethodOptionsAppModel).d : null;
                return list == null ? EmptyList.f17557a : list;
            case 2:
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Wallet) {
                        arrayList2.add(obj2);
                    }
                }
                PaymentMethodOptionsAppModel paymentMethodOptionsAppModel2 = (PaymentMethodOptionsAppModel) CollectionsKt.H(arrayList2);
                list = paymentMethodOptionsAppModel2 != null ? ((PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Wallet) paymentMethodOptionsAppModel2).d : null;
                return list == null ? EmptyList.f17557a : list;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return EmptyList.f17557a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
