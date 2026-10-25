package app.chalo.ncmc.uvik;

import android.content.Intent;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import androidx.autofill.HintConstants;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.nfc.BasicNFCManager;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.usecase.DeviceNFCState;
import app.chalo.usecase.GetDeviceNFCStateUseCase;
import defpackage.eh0;
import defpackage.yh1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikSdkManagerAndroid;", "Lapp/chalo/ncmc/uvik/UvikSdkManager;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UvikSdkManagerAndroid implements UvikSdkManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatActivity f6447a;
    public final GetDeviceNFCStateUseCase b;
    public final BasicInfoContract c;
    public final eh0 d;
    public final Lazy e;
    public final SharedFlowImpl f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikSdkManagerAndroid$Companion;", "", "", "UVIK_ENTRY_ACTIVITY_CLASS_NAME", "Ljava/lang/String;", "ACTION_TRANSACTION", "IntentExtra", "IntentResultKey", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikSdkManagerAndroid$Companion$IntentExtra;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IntentExtra {
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikSdkManagerAndroid$Companion$IntentResultKey;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IntentResultKey {
        }
    }

    public UvikSdkManagerAndroid(AppCompatActivity appCompatActivity, GetDeviceNFCStateUseCase nfcStateUseCase, BasicInfoContract basicInfoContract, eh0 eh0Var) {
        Intrinsics.i(nfcStateUseCase, "nfcStateUseCase");
        Intrinsics.i(basicInfoContract, "basicInfoContract");
        this.f6447a = appCompatActivity;
        this.b = nfcStateUseCase;
        this.c = basicInfoContract;
        this.d = eh0Var;
        this.e = LazyKt.b(new yh1(this, 9));
        this.f = SharedFlowKt.b(0, 1, null, 5);
    }

    @Override // app.chalo.ncmc.uvik.UvikSdkManager
    public final Flow a(UvikIntentData uvikIntentData) {
        String strD = ChaloColorTokenKt.d(ChaloColorToken.OrangePrimary.f9835a);
        Intent intent = new Intent();
        Lazy lazy = this.e;
        Object value = lazy.getValue();
        Intrinsics.h(value, "getValue(...)");
        Intent className = intent.setClassName((String) value, "com.ccavenue.tappay.sdk.EntryActivity");
        Object value2 = lazy.getValue();
        Intrinsics.h(value2, "getValue(...)");
        className.putExtra("callingAppPackageName", (String) value2);
        className.putExtra("callingAppVersionCode", String.valueOf(this.c.h()));
        className.putExtra("action", "transaction");
        className.putExtra(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, uvikIntentData.f6443a);
        className.putExtra("subUserId", uvikIntentData.b);
        className.putExtra("txnType", uvikIntentData.c.name());
        className.putExtra("invoiceNumber", uvikIntentData.d);
        className.putExtra("intentHash", uvikIntentData.e);
        className.putExtra("hexColor", strD);
        String str = uvikIntentData.f;
        if (str != null) {
            className.putExtra("serviceId", str);
        }
        String str2 = uvikIntentData.g;
        if (str2 != null) {
            className.putExtra("serviceManagementInfo", str2);
        }
        this.d.invoke(className);
        return FlowKt.b(this.f);
    }

    @Override // app.chalo.ncmc.uvik.UvikSdkManager
    public final boolean b() {
        DeviceNFCState deviceNFCState;
        BasicNFCManager basicNFCManager = this.b.f10180a;
        if (basicNFCManager.a()) {
            deviceNFCState = basicNFCManager.isEnabled() ? DeviceNFCState.AvailableAndEnabled : DeviceNFCState.AvailableButDisabled;
        } else {
            deviceNFCState = DeviceNFCState.NotAvailable;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return deviceNFCState == DeviceNFCState.AvailableAndEnabled || deviceNFCState == DeviceNFCState.AvailableButDisabled;
    }
}
