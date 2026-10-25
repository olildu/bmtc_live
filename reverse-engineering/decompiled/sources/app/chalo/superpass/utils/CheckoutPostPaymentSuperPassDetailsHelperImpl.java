package app.chalo.superpass.utils;

import app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType;
import app.chalo.checkout.utility.CheckoutPostPaymentSuperPassDetailsHelper;
import app.chalo.features.checkout.CheckoutProductType;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassProperties;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.superpass.domain.GetSuperPassDetailsUseCase;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/utils/CheckoutPostPaymentSuperPassDetailsHelperImpl;", "Lapp/chalo/checkout/utility/CheckoutPostPaymentSuperPassDetailsHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutPostPaymentSuperPassDetailsHelperImpl implements CheckoutPostPaymentSuperPassDetailsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetSuperPassDetailsUseCase f9616a;

    public CheckoutPostPaymentSuperPassDetailsHelperImpl(GetSuperPassDetailsUseCase getSuperPassDetailsUseCase) {
        this.f9616a = getSuperPassDetailsUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.checkout.utility.CheckoutPostPaymentSuperPassDetailsHelper
    public final Object a(CheckoutProductType checkoutProductType, String str, ContinuationImpl continuationImpl) {
        CheckoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1 checkoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1;
        Object objM;
        if (continuationImpl instanceof CheckoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1) {
            checkoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1 = (CheckoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1) continuationImpl;
            int i = checkoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1 = new CheckoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1(this, continuationImpl);
            }
        } else {
            checkoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1 = new CheckoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1(this, continuationImpl);
        }
        Object obj = checkoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            checkoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1.label = 1;
            SuperPassRepository superPassRepository = this.f9616a.f9608a;
            switch (GetSuperPassDetailsUseCase.WhenMappings.f9609a[checkoutProductType.ordinal()]) {
                case 1:
                    objM = superPassRepository.m(str, checkoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1);
                    if (objM != coroutineSingletons) {
                        objM = (SuperPass) objM;
                    }
                    obj = objM;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    break;
                case 2:
                    objM = superPassRepository.n(str, checkoutPostPaymentSuperPassDetailsHelperImpl$getSuperPassDetails$1);
                    if (objM != coroutineSingletons) {
                        objM = (SuperPass) objM;
                    }
                    obj = objM;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    obj = null;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        SuperPass superPass = (SuperPass) obj;
        Boolean boolValueOf = superPass != null ? Boolean.valueOf(superPass.l()) : null;
        if (superPass == null) {
            return null;
        }
        SuperPassProperties superPassProperties = superPass.f9560a;
        String str2 = superPassProperties.f;
        String str3 = superPassProperties.g;
        if (str3 == null) {
            str3 = "";
        }
        return new PostPaymentSuccessProductType.SuperPass(str2, str3, superPass.d.f9569a, superPass instanceof RideBasedSuperPass ? ((RideBasedSuperPass) superPass).g.m : -1, Intrinsics.d(boolValueOf, Boolean.TRUE));
    }
}
