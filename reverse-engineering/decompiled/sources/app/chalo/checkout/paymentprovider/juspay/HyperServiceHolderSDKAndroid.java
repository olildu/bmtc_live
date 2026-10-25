package app.chalo.checkout.paymentprovider.juspay;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import app.chalo.checkout.paymentprovider.juspay.HyperServiceHolderSDKAndroid;
import app.chalo.checkout.paymentprovider.juspay.HyperServiceHolderSDKAndroid$juspayResultHandler$2$1;
import app.chalo.juspay.HyperServiceHolderSDK;
import app.chalo.juspay.JuspayHyperPaymentsCallbackAdapter;
import app.chalo.juspay.JuspaySdkAdapterImpl$juspayResultHandler$2$1;
import app.chalo.network.config.ChaloJson;
import in.juspay.hyperinteg.HyperServiceHolder;
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/paymentprovider/juspay/HyperServiceHolderSDKAndroid;", "Lapp/chalo/juspay/HyperServiceHolderSDK;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HyperServiceHolderSDKAndroid implements HyperServiceHolderSDK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f1413a;
    public final Lazy b;
    public final Lazy c;
    public JuspayHyperPaymentsCallbackAdapter d;

    public HyperServiceHolderSDKAndroid(Activity activity) {
        this.f1413a = activity;
        final int i = 0;
        this.b = LazyKt.b(new Function0(this) { // from class: k90
            public final /* synthetic */ HyperServiceHolderSDKAndroid b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        final HyperServiceHolderSDKAndroid hyperServiceHolderSDKAndroid = this.b;
                        return new HyperPaymentsCallbackAdapter() { // from class: app.chalo.checkout.paymentprovider.juspay.HyperServiceHolderSDKAndroid$juspayResultHandler$2$1
                            @Override // in.juspay.hypersdk.ui.HyperPaymentsCallback
                            public final void onEvent(JSONObject jSONObject, JuspayResponseHandler juspayResponseHandler) {
                                JsonObject jsonObjectG;
                                if (jSONObject != null) {
                                    ChaloJson chaloJson = ChaloJson.f6455a;
                                    Json json = ChaloJson.b;
                                    String string = jSONObject.toString();
                                    Intrinsics.h(string, "toString(...)");
                                    jsonObjectG = JsonElementKt.g(json.f(string));
                                } else {
                                    jsonObjectG = null;
                                }
                                JuspayHyperPaymentsCallbackAdapter juspayHyperPaymentsCallbackAdapter = hyperServiceHolderSDKAndroid.d;
                                if (juspayHyperPaymentsCallbackAdapter != null) {
                                    juspayHyperPaymentsCallbackAdapter.onEvent(jsonObjectG);
                                }
                            }
                        };
                    default:
                        HyperServiceHolderSDKAndroid hyperServiceHolderSDKAndroid2 = this.b;
                        HyperServiceHolder hyperServiceHolder = new HyperServiceHolder((FragmentActivity) hyperServiceHolderSDKAndroid2.f1413a);
                        hyperServiceHolder.setCallback((HyperServiceHolderSDKAndroid$juspayResultHandler$2$1) hyperServiceHolderSDKAndroid2.b.getValue());
                        return hyperServiceHolder;
                }
            }
        });
        final int i2 = 1;
        this.c = LazyKt.b(new Function0(this) { // from class: k90
            public final /* synthetic */ HyperServiceHolderSDKAndroid b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        final HyperServiceHolderSDKAndroid hyperServiceHolderSDKAndroid = this.b;
                        return new HyperPaymentsCallbackAdapter() { // from class: app.chalo.checkout.paymentprovider.juspay.HyperServiceHolderSDKAndroid$juspayResultHandler$2$1
                            @Override // in.juspay.hypersdk.ui.HyperPaymentsCallback
                            public final void onEvent(JSONObject jSONObject, JuspayResponseHandler juspayResponseHandler) {
                                JsonObject jsonObjectG;
                                if (jSONObject != null) {
                                    ChaloJson chaloJson = ChaloJson.f6455a;
                                    Json json = ChaloJson.b;
                                    String string = jSONObject.toString();
                                    Intrinsics.h(string, "toString(...)");
                                    jsonObjectG = JsonElementKt.g(json.f(string));
                                } else {
                                    jsonObjectG = null;
                                }
                                JuspayHyperPaymentsCallbackAdapter juspayHyperPaymentsCallbackAdapter = hyperServiceHolderSDKAndroid.d;
                                if (juspayHyperPaymentsCallbackAdapter != null) {
                                    juspayHyperPaymentsCallbackAdapter.onEvent(jsonObjectG);
                                }
                            }
                        };
                    default:
                        HyperServiceHolderSDKAndroid hyperServiceHolderSDKAndroid2 = this.b;
                        HyperServiceHolder hyperServiceHolder = new HyperServiceHolder((FragmentActivity) hyperServiceHolderSDKAndroid2.f1413a);
                        hyperServiceHolder.setCallback((HyperServiceHolderSDKAndroid$juspayResultHandler$2$1) hyperServiceHolderSDKAndroid2.b.getValue());
                        return hyperServiceHolder;
                }
            }
        });
    }

    @Override // app.chalo.juspay.HyperServiceHolderSDK
    public final void a(int i, int i2, Object obj) {
        Intent intent = obj instanceof Intent ? (Intent) obj : null;
        if (intent == null) {
            return;
        }
        f().getHyperServices().onActivityResult(i, i2, intent);
    }

    @Override // app.chalo.juspay.HyperServiceHolderSDK
    public final boolean b() {
        return this.c.isInitialized() && f().isInitialised();
    }

    @Override // app.chalo.juspay.HyperServiceHolderSDK
    public final void c(JsonObject requestObject) {
        Intrinsics.i(requestObject, "requestObject");
        f().initiate(new JSONObject(requestObject.toString()));
    }

    @Override // app.chalo.juspay.HyperServiceHolderSDK
    public final void d(JsonObject requestObject) {
        Intrinsics.i(requestObject, "requestObject");
        f().process(new JSONObject(requestObject.toString()));
    }

    @Override // app.chalo.juspay.HyperServiceHolderSDK
    public final void e(JuspaySdkAdapterImpl$juspayResultHandler$2$1 juspayResultHandler) {
        Intrinsics.i(juspayResultHandler, "juspayResultHandler");
        this.d = juspayResultHandler;
    }

    public final HyperServiceHolder f() {
        return (HyperServiceHolder) this.c.getValue();
    }

    @Override // app.chalo.juspay.HyperServiceHolderSDK
    public final boolean onBackPressed() {
        return f().onBackPressed();
    }

    @Override // app.chalo.juspay.HyperServiceHolderSDK
    public final void terminate() {
        if (this.c.isInitialized()) {
            f().terminate();
        }
    }
}
