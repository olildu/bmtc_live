package app.chalo.checkout.utility;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.checkout.data.model.ui.PaymentLogo;
import app.chalo.checkout.data.model.ui.PlatformDrawableAsset;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/checkout/utility/InstalledUpiApp;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.utility.InstalledUpiAppsHelperAndroid$getInstalledUpiApplications$2", f = "InstalledUpiAppsHelper.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class InstalledUpiAppsHelperAndroid$getInstalledUpiApplications$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends InstalledUpiApp>>, Object> {
    int label;
    final /* synthetic */ InstalledUpiAppsHelperAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledUpiAppsHelperAndroid$getInstalledUpiApplications$2(InstalledUpiAppsHelperAndroid installedUpiAppsHelperAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = installedUpiAppsHelperAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstalledUpiAppsHelperAndroid$getInstalledUpiApplications$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstalledUpiAppsHelperAndroid$getInstalledUpiApplications$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<ResolveInfo> listQueryIntentActivities;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("upi://pay"));
            PackageManager packageManager = this.this$0.f1616a.getPackageManager();
            if (packageManager == null) {
                return EmptyList.f17557a;
            }
            InstalledUpiAppsHelperAndroid installedUpiAppsHelperAndroid = this.this$0;
            if (Build.VERSION.SDK_INT >= 33) {
                listQueryIntentActivities = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L));
                Intrinsics.f(listQueryIntentActivities);
            } else {
                listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                Intrinsics.f(listQueryIntentActivities);
            }
            List<ResolveInfo> list = listQueryIntentActivities;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            for (ResolveInfo resolveInfo : list) {
                Drawable drawableLoadIcon = resolveInfo.loadIcon(installedUpiAppsHelperAndroid.f1616a.getPackageManager());
                String packageName = resolveInfo.activityInfo.packageName;
                Intrinsics.h(packageName, "packageName");
                arrayList.add(new InstalledUpiApp(packageName, resolveInfo.loadLabel(installedUpiAppsHelperAndroid.f1616a.getPackageManager()).toString(), drawableLoadIcon != null ? new PaymentLogo.PlatformDrawable(new PlatformDrawableAsset(drawableLoadIcon)) : null));
            }
            return arrayList;
        } catch (Exception e) {
            this.this$0.b.i(e);
            AnalyticsContract.DefaultImpls.a(this.this$0.c, "installed upi app check failed", "", vo1.s("reason", String.valueOf(e.getMessage())), null, false, 24);
            return EmptyList.f17557a;
        }
    }
}
