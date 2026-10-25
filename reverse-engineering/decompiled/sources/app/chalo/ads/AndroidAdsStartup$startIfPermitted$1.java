package app.chalo.ads;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.utils.chalologger.ChaloLog;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.t;
import kotlin.Metadata;
import kotlin.Result;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.AndroidAdsStartup$startIfPermitted$1", f = "AndroidAdsStartup.kt", l = {}, m = "invokeSuspend", v = 1)
final class AndroidAdsStartup$startIfPermitted$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidAdsStartup this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAdsStartup$startIfPermitted$1(AndroidAdsStartup androidAdsStartup, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidAdsStartup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidAdsStartup$startIfPermitted$1 androidAdsStartup$startIfPermitted$1 = new AndroidAdsStartup$startIfPermitted$1(this.this$0, continuation);
        androidAdsStartup$startIfPermitted$1.L$0 = obj;
        return androidAdsStartup$startIfPermitted$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AndroidAdsStartup$startIfPermitted$1 androidAdsStartup$startIfPermitted$1 = (AndroidAdsStartup$startIfPermitted$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        androidAdsStartup$startIfPermitted$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Unit unit = Unit.f17538a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        AndroidAdsStartup androidAdsStartup = this.this$0;
        try {
            ChaloBuildConfig chaloBuildConfig = androidAdsStartup.c;
            MobileAdsStartupClient mobileAdsStartupClient = androidAdsStartup.e;
            if (chaloBuildConfig.getG()) {
                RequestConfiguration requestConfigurationBuild = new RequestConfiguration.Builder().setTestDeviceIds(AndroidAdsStartup.f).build();
                Intrinsics.h(requestConfigurationBuild, "build(...)");
                mobileAdsStartupClient.a(requestConfigurationBuild);
            }
            mobileAdsStartupClient.b(androidAdsStartup.b, new t(18));
            ((AdsterSdkInitializer) androidAdsStartup.d.getValue()).a();
            objA = unit;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            ChaloLog.c("MobileAdsInit", "failed to initialise MobileAds", thA);
        }
        return unit;
    }
}
