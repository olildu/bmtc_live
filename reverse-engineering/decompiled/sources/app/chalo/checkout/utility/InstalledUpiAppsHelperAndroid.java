package app.chalo.checkout.utility;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.SystemHelper;
import defpackage.eh0;
import defpackage.xm0;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/checkout/utility/InstalledUpiAppsHelperAndroid;", "Lapp/chalo/checkout/utility/InstalledUpiAppsHelper;", "Companion", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstalledUpiAppsHelperAndroid implements InstalledUpiAppsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentActivity f1616a;
    public final CrashlyticsLogger b;
    public final AnalyticsContract c;
    public final SystemHelper d;
    public final CoroutineContextProvider e;
    public final eh0 f;
    public final MutableStateFlow g = StateFlowKt.a(EmptyList.f17557a);

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/utility/InstalledUpiAppsHelperAndroid$Companion;", "", "", "UPI_INTENT_SCHEME", "Ljava/lang/String;", "UPI_INTENT_AUTHORITY", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public InstalledUpiAppsHelperAndroid(ComponentActivity componentActivity, CrashlyticsLogger crashlyticsLogger, AnalyticsContract analyticsContract, SystemHelper systemHelper, CoroutineContextProvider coroutineContextProvider, eh0 eh0Var) {
        this.f1616a = componentActivity;
        this.b = crashlyticsLogger;
        this.c = analyticsContract;
        this.d = systemHelper;
        this.e = coroutineContextProvider;
        this.f = eh0Var;
    }

    @Override // app.chalo.checkout.utility.InstalledUpiAppsHelper
    public final ChaloUseCaseResult.Success a(String packageName, UpiIntentData upiIntentData, xm0 xm0Var) {
        Intrinsics.i(packageName, "packageName");
        Intrinsics.i(upiIntentData, "upiIntentData");
        boolean zF = StringsKt.F(packageName);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        String str = upiIntentData.f1632a;
        String str2 = upiIntentData.b;
        String str3 = upiIntentData.d;
        String str4 = upiIntentData.c;
        String str5 = upiIntentData.e;
        String str6 = upiIntentData.f;
        String str7 = upiIntentData.g;
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(PaymentConstants.WIDGET_UPI).authority("pay").appendQueryParameter("pa", str3).appendQueryParameter("pn", str4).appendQueryParameter("am", str).appendQueryParameter("mc", str5).appendQueryParameter("cu", str2);
        if (str6 != null) {
            builderAppendQueryParameter.appendQueryParameter("tr", str6);
        }
        if (str7 != null) {
            builderAppendQueryParameter.appendQueryParameter("tn", str7);
        }
        Uri uriBuild = builderAppendQueryParameter.build();
        String message = "URI: " + uriBuild;
        Intrinsics.i(message, "message");
        Intrinsics.f(uriBuild);
        intent.setData(uriBuild);
        if (!zF) {
            intent.setPackage(packageName);
        }
        if (zF) {
            intent = Intent.createChooser(intent, "Pay with");
            Intrinsics.f(intent);
        }
        long j = this.d.j();
        xm0Var.invoke(packageName, String.valueOf(intent.getData()));
        this.f.invoke(intent);
        final InstalledUpiAppsHelperAndroid$launchNativeUpiAndAwaitResult$$inlined$mapNotNull$1 installedUpiAppsHelperAndroid$launchNativeUpiAndAwaitResult$$inlined$mapNotNull$1 = new InstalledUpiAppsHelperAndroid$launchNativeUpiAndAwaitResult$$inlined$mapNotNull$1(this.g, j);
        return new ChaloUseCaseResult.Success(new Flow<UpiAppResult>() { // from class: app.chalo.checkout.utility.InstalledUpiAppsHelperAndroid$launchNativeUpiAndAwaitResult$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.checkout.utility.InstalledUpiAppsHelperAndroid$launchNativeUpiAndAwaitResult$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f1618a;

                /* JADX INFO: renamed from: app.chalo.checkout.utility.InstalledUpiAppsHelperAndroid$launchNativeUpiAndAwaitResult$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.checkout.utility.InstalledUpiAppsHelperAndroid$launchNativeUpiAndAwaitResult$$inlined$map$1$2", f = "InstalledUpiAppsHelper.android.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f1618a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        UpiAppResult upiAppResult = ((UpiAppActivityResult) obj).f1630a;
                        anonymousClass1.label = 1;
                        if (this.f1618a.emit(upiAppResult, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = installedUpiAppsHelperAndroid$launchNativeUpiAndAwaitResult$$inlined$mapNotNull$1.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        });
    }

    @Override // app.chalo.checkout.utility.InstalledUpiAppsHelper
    public final Object b(String str, ContinuationImpl continuationImpl) {
        return BuildersKt.g(this.e.b(), new InstalledUpiAppsHelperAndroid$getInstalledUpiAppDetails$2(this, str, null), continuationImpl);
    }

    @Override // app.chalo.checkout.utility.InstalledUpiAppsHelper
    public final ChaloUseCaseResult.Success c(String intentUri) {
        Intrinsics.i(intentUri, "intentUri");
        Uri uri = Uri.parse(intentUri);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        long j = this.d.j();
        this.f.invoke(intent);
        final InstalledUpiAppsHelperAndroid$launchUpiIntentUri$$inlined$mapNotNull$1 installedUpiAppsHelperAndroid$launchUpiIntentUri$$inlined$mapNotNull$1 = new InstalledUpiAppsHelperAndroid$launchUpiIntentUri$$inlined$mapNotNull$1(this.g, j);
        return new ChaloUseCaseResult.Success(new Flow<UpiAppResult>() { // from class: app.chalo.checkout.utility.InstalledUpiAppsHelperAndroid$launchUpiIntentUri$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.checkout.utility.InstalledUpiAppsHelperAndroid$launchUpiIntentUri$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f1622a;

                /* JADX INFO: renamed from: app.chalo.checkout.utility.InstalledUpiAppsHelperAndroid$launchUpiIntentUri$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.checkout.utility.InstalledUpiAppsHelperAndroid$launchUpiIntentUri$$inlined$map$1$2", f = "InstalledUpiAppsHelper.android.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f1622a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        UpiAppResult upiAppResult = ((UpiAppActivityResult) obj).f1630a;
                        anonymousClass1.label = 1;
                        if (this.f1622a.emit(upiAppResult, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = installedUpiAppsHelperAndroid$launchUpiIntentUri$$inlined$mapNotNull$1.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        });
    }

    @Override // app.chalo.checkout.utility.InstalledUpiAppsHelper
    public final Object d(Continuation continuation) {
        return BuildersKt.g(this.e.a(), new InstalledUpiAppsHelperAndroid$getInstalledUpiApplications$2(this, null), continuation);
    }

    @Override // app.chalo.checkout.utility.InstalledUpiAppsHelper
    public final boolean e(String uriString) {
        Intrinsics.i(uriString, "uriString");
        try {
            Uri uri = Uri.parse(uriString);
            return Intrinsics.d(uri.getScheme(), PaymentConstants.WIDGET_UPI) && Intrinsics.d(uri.getAuthority(), "pay");
        } catch (Exception unused) {
        }
    }

    public final void f(ActivityResult result) {
        UpiAppResult upiAppResult;
        MutableStateFlow mutableStateFlow;
        Object value;
        ArrayList arrayListE0;
        Intrinsics.i(result, "result");
        Intent data = result.getData();
        boolean z = result.getResultCode() == 0;
        if (data != null) {
            String stringExtra = data.getStringExtra("response");
            String message = "upiResultFromIntent: response: " + stringExtra;
            Intrinsics.i(message, "message");
            upiAppResult = new UpiAppResult(data.getStringExtra("Status"), data.getStringExtra("responseCode"), data.getStringExtra(CLConstants.SALT_FIELD_TXN_ID), data.getStringExtra("txnRef"), stringExtra, Boolean.valueOf(z));
        } else {
            upiAppResult = null;
        }
        do {
            mutableStateFlow = this.g;
            value = mutableStateFlow.getValue();
            arrayListE0 = CollectionsKt.E0((List) value);
            arrayListE0.add(new UpiAppActivityResult(upiAppResult, this.d.j()));
        } while (!mutableStateFlow.c(value, arrayListE0));
    }
}
