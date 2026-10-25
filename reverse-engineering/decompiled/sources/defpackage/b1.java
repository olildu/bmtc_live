package defpackage;

import androidx.activity.result.ActivityResultCallback;
import androidx.arch.core.util.Function;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.paging.DataSource;
import androidx.paging.ItemKeyedDataSource;
import androidx.paging.PageKeyedDataSource;
import androidx.paging.PositionalDataSource;
import app.chalo.checkout.paymentprovider.razorpay.RazorpayUpiAppDetails;
import com.google.android.gms.tasks.OnSuccessListener;
import com.inmobi.media.S0;
import com.razorpay.ApplicationDetails;
import com.razorpay.RzpUpiSupportedAppsCallback;
import in.juspay.hyperqr.InputImageScanner;
import in.juspay.hyperqr.QRCodeAnalyzer;
import in.juspay.hypersmshandler.SmsConsentHandler;
import in.juspay.hypersmshandler.SmsRetriever;
import in.juspay.hyperupi.UPIBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b1 implements ActivityResultCallback, Function, OnSuccessListener, RzpUpiSupportedAppsCallback, DoubleFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11159a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ b1(Function1 function1, int i) {
        this.f11159a = i;
        this.b = function1;
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        switch (this.f11159a) {
            case 2:
                return DataSource.map$lambda$1(this.b, obj);
            case 3:
                return DataSource.mapByPage$lambda$0(this.b, (List) obj);
            case 4:
                return DataSource.Factory.map$lambda$2(this.b, (List) obj);
            case 5:
                return DataSource.Factory.mapByPage$lambda$3(this.b, (List) obj);
            case 6:
            default:
                return PositionalDataSource.map$lambda$5(this.b, (List) obj);
            case 7:
                return ItemKeyedDataSource.map$lambda$8(this.b, (List) obj);
            case 8:
                return ItemKeyedDataSource.mapByPage$lambda$5(this.b, (List) obj);
            case 9:
                return PageKeyedDataSource.mapByPage$lambda$3(this.b, (List) obj);
            case 10:
                return PageKeyedDataSource.map$lambda$6(this.b, (List) obj);
            case 11:
                return PositionalDataSource.mapByPage$lambda$2(this.b, (List) obj);
        }
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        switch (this.f11159a) {
            case 15:
                return Rgb._init_$lambda$0(this.b, d);
            case 16:
                return Rgb._init_$lambda$1(this.b, d);
            case 17:
                return Rgb._init_$lambda$2(this.b, d);
            default:
                return Rgb._init_$lambda$3(this.b, d);
        }
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        switch (this.f11159a) {
            case 0:
                this.b.invoke(obj);
                break;
            default:
                this.b.invoke(obj);
                break;
        }
    }

    @Override // com.razorpay.RzpUpiSupportedAppsCallback
    public void onReceiveUpiSupportedApps(List list) {
        String packageName;
        Intrinsics.f(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationDetails applicationDetails = (ApplicationDetails) it.next();
            String appName = applicationDetails.getAppName();
            RazorpayUpiAppDetails razorpayUpiAppDetails = null;
            str = null;
            String str = null;
            razorpayUpiAppDetails = null;
            razorpayUpiAppDetails = null;
            razorpayUpiAppDetails = null;
            if (appName != null) {
                if (StringsKt.F(appName)) {
                    appName = null;
                }
                if (appName != null && (packageName = applicationDetails.getPackageName()) != null) {
                    if (StringsKt.F(packageName)) {
                        packageName = null;
                    }
                    if (packageName != null) {
                        String iconBase64 = applicationDetails.getIconBase64();
                        if (iconBase64 != null && !StringsKt.F(iconBase64)) {
                            str = iconBase64;
                        }
                        razorpayUpiAppDetails = new RazorpayUpiAppDetails(appName, str, packageName);
                    }
                }
            }
            if (razorpayUpiAppDetails != null) {
                arrayList.add(razorpayUpiAppDetails);
            }
        }
        this.b.invoke(arrayList);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f11159a) {
            case 6:
                InputImageScanner.scanImage$lambda$0(this.b, obj);
                break;
            case 13:
                QRCodeAnalyzer.analyze$lambda$0(this.b, obj);
                break;
            case 19:
                S0.a(this.b, obj);
                break;
            case 20:
                SmsConsentHandler.a(this.b, obj);
                break;
            case 21:
                SmsRetriever.a(this.b, obj);
                break;
            case 22:
                UPIBridge.prepareIntegrityTokenProvider$lambda$2(this.b, obj);
                break;
            case 23:
                UPIBridge.getPhoneNumber$lambda$8(this.b, obj);
                break;
            default:
                UPIBridge.requestIntegrityToken$lambda$0(this.b, obj);
                break;
        }
    }
}
