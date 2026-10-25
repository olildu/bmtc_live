package app.chalo.checkout.utility;

import app.chalo.checkout.domain.error.RazorpayVPAValidation;
import app.chalo.checkout.domain.razorpay.RazorPayValidationModel;
import app.chalo.checkout.paymentprovider.razorpay.RazorpaySdk;
import app.chalo.checkout.paymentprovider.razorpay.RazorpayUpiAppDetails;
import app.chalo.providers.CoroutineContextProvider;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.razorpay.BaseRazorpay;
import com.razorpay.ValidateVpaCallback;
import com.razorpay.ValidationListener;
import defpackage.b1;
import defpackage.vo1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/checkout/utility/RazorPayHelper;", "Lapp/chalo/checkout/utility/IRazorPayHelper;", "Companion", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RazorPayHelper implements IRazorPayHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RazorpaySdk f1626a;
    public final CoroutineContextProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/checkout/utility/RazorPayHelper$Companion;", "", "", "VALIDATION_ERROR_KEY", "Ljava/lang/String;", "VALIDATION_ERROR_DESCRIPTION_KEY", "VPA_VALIDATION_SUCCESS_KEY", "VPA_VALIDATION_ERROR_KEY", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RazorPayHelper(RazorpaySdk razorpaySdk, CoroutineContextProvider coroutineContextProvider) {
        this.f1626a = razorpaySdk;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.checkout.utility.IRazorPayHelper
    public final Object a(String str, Continuation continuation) {
        return BuildersKt.g(this.b.a(), new RazorPayHelper$getBankingLogoUrl$2(this, str, null), continuation);
    }

    @Override // app.chalo.checkout.utility.IRazorPayHelper
    public final Object b(String str, Continuation continuation) {
        return BuildersKt.g(this.b.a(), new RazorPayHelper$getWalletSquareLogoUrl$2(this, str, null), continuation);
    }

    @Override // app.chalo.checkout.utility.IRazorPayHelper
    public final Object c(Map data, Continuation continuation) throws Throwable {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        final Function1<RazorPayValidationModel, Unit> function1 = new Function1<RazorPayValidationModel, Unit>() { // from class: app.chalo.checkout.utility.RazorPayHelper$validateRazorPayData$2$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                RazorPayValidationModel it = (RazorPayValidationModel) obj;
                Intrinsics.i(it, "it");
                safeContinuation.resumeWith(it);
                return Unit.f17538a;
            }
        };
        Intrinsics.i(data, "data");
        this.f1626a.a().validateFields(new JSONObject(data), new ValidationListener() { // from class: app.chalo.checkout.paymentprovider.razorpay.RazorpaySdk$validateFields$1
            @Override // com.razorpay.ValidationListener
            public final void onValidationError(Map map) {
                String str;
                String str2;
                String str3 = "";
                if (map == null || (str = (String) map.get("field")) == null) {
                    str = "";
                }
                if (map != null && (str2 = (String) map.get(InMobiNetworkValues.DESCRIPTION)) != null) {
                    str3 = str2;
                }
                function1.invoke(new RazorPayValidationModel(false, vo1.n(str, " ", str3)));
            }

            @Override // com.razorpay.ValidationListener
            public final void onValidationSuccess() {
                function1.invoke(new RazorPayValidationModel(true, null));
            }
        });
        Object objB = safeContinuation.b();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objB;
    }

    @Override // app.chalo.checkout.utility.IRazorPayHelper
    public final Object d(Continuation continuation) throws Throwable {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        BaseRazorpay.getAppsWhichSupportUpi(this.f1626a.f1427a, new b1(new Function1<List<? extends RazorpayUpiAppDetails>, Unit>() { // from class: app.chalo.checkout.utility.RazorPayHelper$getSupportedUpiApps$2$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List applicationDetails = (List) obj;
                Intrinsics.i(applicationDetails, "applicationDetails");
                safeContinuation.resumeWith(applicationDetails);
                return Unit.f17538a;
            }
        }, 14));
        Object objB = safeContinuation.b();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objB;
    }

    @Override // app.chalo.checkout.utility.IRazorPayHelper
    public final Object e(Continuation continuation) throws Throwable {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        final Function1<RazorpayVPAValidation, Unit> function1 = new Function1<RazorpayVPAValidation, Unit>() { // from class: app.chalo.checkout.utility.RazorPayHelper$validateVPA$2$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                RazorpayVPAValidation validationResult = (RazorpayVPAValidation) obj;
                Intrinsics.i(validationResult, "validationResult");
                safeContinuation.resumeWith(validationResult);
                return Unit.f17538a;
            }
        };
        Intrinsics.i(null, "vpa");
        this.f1626a.a().isValidVpa(null, new ValidateVpaCallback() { // from class: app.chalo.checkout.paymentprovider.razorpay.RazorpaySdk$isValidVpa$1
            @Override // com.razorpay.ValidateVpaCallback
            public final void onFailure() {
                function1.invoke(RazorpayVPAValidation.ERROR);
            }

            @Override // com.razorpay.ValidateVpaCallback
            public final void onResponse(JSONObject jSONObject) {
                Function1 function2 = function1;
                if (jSONObject != null && jSONObject.has(FirebaseAnalytics.Param.SUCCESS)) {
                    function2.invoke(RazorpayVPAValidation.SUCCESS);
                } else {
                    if (jSONObject == null || !jSONObject.has("error")) {
                        return;
                    }
                    function2.invoke(RazorpayVPAValidation.FAILED);
                }
            }
        });
        Object objB = safeContinuation.b();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objB;
    }
}
