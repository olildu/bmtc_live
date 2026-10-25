package app.chalo.checkout.paymentprovider.inai;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent$inaiSdkExecuteDelegate$1;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.xx;
import defpackage.z40;
import in.juspay.hyper.constants.LogSubCategory;
import io.inai.android_sdk.InaiCheckout;
import io.inai.android_sdk.InaiCheckoutDelegate;
import io.inai.android_sdk.InaiCheckoutDialog;
import io.inai.android_sdk.InaiCheckoutFragment;
import io.inai.android_sdk.InaiConfig;
import io.inai.android_sdk.InaiExecuteDelegate;
import io.inai.android_sdk.InaiExecuteResult;
import io.inai.android_sdk.InaiPaymentResult;
import io.inai.android_sdk.InaiViewMode;
import io.inai.android_sdk.helpers.InaiBaseUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/paymentprovider/inai/InaiSdkCheckoutAndroid;", "Lapp/chalo/checkout/paymentprovider/inai/InaiSdkCheckout;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InaiSdkCheckoutAndroid implements InaiSdkCheckout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InaiSdkConfig f1406a;
    public final Lazy b = LazyKt.b(new xx(this, 22));

    public InaiSdkCheckoutAndroid(InaiSdkConfig inaiSdkConfig) {
        this.f1406a = inaiSdkConfig;
    }

    public static void c(JSONObject jSONObject, String str, LinkedHashMap linkedHashMap) {
        if (jSONObject.has(str)) {
            linkedHashMap.put(str, jSONObject.get(str));
        }
    }

    @Override // app.chalo.checkout.paymentprovider.inai.InaiSdkCheckout
    public final void a(LinkedHashMap linkedHashMap, InaiPlatformContext platformContext, final PaymentMainComponent$inaiSdkExecuteDelegate$1 delegate) {
        Intrinsics.i(platformContext, "platformContext");
        Intrinsics.i(delegate, "delegate");
        InaiCheckout inaiCheckout = (InaiCheckout) this.b.getValue();
        JSONObject jSONObject = new JSONObject(linkedHashMap);
        Context context = platformContext.f1405a;
        InaiExecuteDelegate inaiExecuteDelegate = new InaiExecuteDelegate() { // from class: app.chalo.checkout.paymentprovider.inai.InaiSdkCheckoutAndroid$execute$1
            @Override // io.inai.android_sdk.InaiExecuteDelegate
            public final void a(InaiExecuteResult inaiExecuteResult) {
                InaiSdkExecuteStatus inaiSdkExecuteStatus;
                String string = inaiExecuteResult.b.toString();
                Intrinsics.h(string, "toString(...)");
                int i = InaiSdkConfig_androidKt.WhenMappings.f1410a[inaiExecuteResult.f16597a.ordinal()];
                if (i == 1) {
                    inaiSdkExecuteStatus = InaiSdkExecuteStatus.SUCCESS;
                } else if (i == 2) {
                    inaiSdkExecuteStatus = InaiSdkExecuteStatus.FAILED;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    inaiSdkExecuteStatus = InaiSdkExecuteStatus.CANCELLED;
                }
                delegate.a(new InaiSdkExecuteResult(string, inaiSdkExecuteStatus));
            }
        };
        inaiCheckout.getClass();
        Intrinsics.i(context, "context");
        InaiCheckout.a(context);
        Context context2 = InaiBaseUtils.f16605a;
        InaiBaseUtils.b.add(new InaiBaseUtils.BreadcrumbsValues("Execute", "Initiated", InaiBaseUtils.Companion.c(), LogSubCategory.Action.USER, null));
        String string = jSONObject.toString();
        Intrinsics.h(string, "payload.toString()");
        InaiConfig inaiConfig = inaiCheckout.f16572a;
        if (inaiConfig == null) {
            Intrinsics.q("_config");
            throw null;
        }
        InaiCheckoutFragment inaiCheckoutFragmentA = InaiCheckoutFragment.Companion.a(inaiConfig, inaiExecuteDelegate, InaiViewMode.Execute, string);
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        fragmentActivity.setRequestedOrientation(14);
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        Intrinsics.h(fragmentTransactionBeginTransaction, "fragmentActivity.support…anager.beginTransaction()");
        FragmentTransaction fragmentTransactionAdd = fragmentTransactionBeginTransaction.add(inaiCheckoutFragmentA, inaiCheckoutFragmentA.X);
        Intrinsics.h(fragmentTransactionAdd, "fragmentTransaction.add(…koutFragment.fragmentTag)");
        fragmentTransactionAdd.commit();
    }

    @Override // app.chalo.checkout.paymentprovider.inai.InaiSdkCheckout
    public final void b(String paymentMethodOption, Map paymentDetails, InaiPlatformContext platformContext, final InaiSdkCheckoutDelegate delegate) {
        Intrinsics.i(paymentMethodOption, "paymentMethodOption");
        Intrinsics.i(paymentDetails, "paymentDetails");
        Intrinsics.i(platformContext, "platformContext");
        Intrinsics.i(delegate, "delegate");
        InaiCheckout inaiCheckout = (InaiCheckout) this.b.getValue();
        JSONObject jSONObject = new JSONObject(paymentDetails);
        Context context = platformContext.f1405a;
        InaiCheckoutDelegate inaiCheckoutDelegate = new InaiCheckoutDelegate(this) { // from class: app.chalo.checkout.paymentprovider.inai.InaiSdkCheckoutAndroid$makePayment$1
            @Override // io.inai.android_sdk.InaiCheckoutDelegate
            public final void a(InaiPaymentResult inaiPaymentResult) throws JSONException {
                InaiSdkPaymentStatus inaiSdkPaymentStatus;
                JSONObject jSONObject2 = inaiPaymentResult.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                InaiSdkCheckoutAndroid.c(jSONObject2, FirebaseAnalytics.Param.TRANSACTION_ID, linkedHashMap);
                InaiSdkCheckoutAndroid.c(jSONObject2, CLConstants.FIELD_CODE, linkedHashMap);
                InaiSdkCheckoutAndroid.c(jSONObject2, "message", linkedHashMap);
                if (jSONObject2.has("vendor_response")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("vendor_response");
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    if (jSONObject3.has("response")) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("response");
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        if (jSONObject4.has("error")) {
                            JSONObject jSONObject5 = jSONObject4.getJSONObject("error");
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            Intrinsics.f(jSONObject5);
                            InaiSdkCheckoutAndroid.c(jSONObject5, "message", linkedHashMap4);
                            InaiSdkCheckoutAndroid.c(jSONObject5, "type", linkedHashMap4);
                            linkedHashMap3.put("error", linkedHashMap4);
                        }
                        linkedHashMap2.put("response", linkedHashMap3);
                    }
                    linkedHashMap.put("vendor_response", linkedHashMap2);
                }
                int i = InaiSdkConfig_androidKt.WhenMappings.b[inaiPaymentResult.f16598a.ordinal()];
                if (i == 1) {
                    inaiSdkPaymentStatus = InaiSdkPaymentStatus.SUCCESS;
                } else if (i == 2) {
                    inaiSdkPaymentStatus = InaiSdkPaymentStatus.FAILED;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    inaiSdkPaymentStatus = InaiSdkPaymentStatus.CANCELLED;
                }
                this.f1408a.a(new InaiSdkPaymentResult(linkedHashMap, inaiSdkPaymentStatus));
            }
        };
        inaiCheckout.getClass();
        Intrinsics.i(context, "context");
        InaiCheckout.a(context);
        Context context2 = InaiBaseUtils.f16605a;
        InaiBaseUtils.b.add(new InaiBaseUtils.BreadcrumbsValues("Headless payment", "Initiated", InaiBaseUtils.Companion.c(), LogSubCategory.Action.USER, null));
        String string = jSONObject.toString();
        Intrinsics.h(string, "paymentDetails.toString()");
        String strG = z40.g("'", paymentMethodOption, "',", string);
        InaiConfig inaiConfig = inaiCheckout.f16572a;
        if (inaiConfig == null) {
            Intrinsics.q("_config");
            throw null;
        }
        InaiCheckoutFragment inaiCheckoutFragmentA = InaiCheckoutFragment.Companion.a(inaiConfig, inaiCheckoutDelegate, InaiViewMode.MakePayment, strG);
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        fragmentActivity.setRequestedOrientation(14);
        InaiCheckoutDialog inaiCheckoutDialog = new InaiCheckoutDialog();
        inaiCheckoutDialog.N = inaiCheckoutFragmentA;
        inaiCheckoutDialog.show(fragmentActivity.getSupportFragmentManager(), inaiCheckoutFragmentA.X);
    }
}
