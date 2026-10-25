package app.chalo.checkout.utility;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import app.chalo.checkout.data.model.ui.PaymentLogo;
import app.chalo.checkout.data.model.ui.PlatformDrawableAsset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/checkout/utility/InstalledUpiApp;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.utility.InstalledUpiAppsHelperAndroid$getInstalledUpiAppDetails$2", f = "InstalledUpiAppsHelper.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class InstalledUpiAppsHelperAndroid$getInstalledUpiAppDetails$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InstalledUpiApp>, Object> {
    final /* synthetic */ String $packageName;
    int label;
    final /* synthetic */ InstalledUpiAppsHelperAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledUpiAppsHelperAndroid$getInstalledUpiAppDetails$2(InstalledUpiAppsHelperAndroid installedUpiAppsHelperAndroid, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = installedUpiAppsHelperAndroid;
        this.$packageName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstalledUpiAppsHelperAndroid$getInstalledUpiAppDetails$2(this.this$0, this.$packageName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstalledUpiAppsHelperAndroid$getInstalledUpiAppDetails$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        try {
            PackageManager packageManager = this.this$0.f1616a.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.$packageName, 0);
            Intrinsics.h(applicationInfo, "getApplicationInfo(...)");
            String str = this.$packageName;
            String string = packageManager.getApplicationLabel(applicationInfo).toString();
            Drawable applicationIcon = packageManager.getApplicationIcon(applicationInfo);
            Intrinsics.h(applicationIcon, "getApplicationIcon(...)");
            return new InstalledUpiApp(str, string, new PaymentLogo.PlatformDrawable(new PlatformDrawableAsset(applicationIcon)));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
