package app.chalo.login.truecaller;

import android.content.Intent;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.utils.ChaloUseCaseResult;
import com.truecaller.android.sdk.ITrueCallback;
import com.truecaller.android.sdk.TrueError;
import com.truecaller.android.sdk.TrueProfile;
import com.truecaller.android.sdk.TruecallerSDK;
import com.truecaller.android.sdk.TruecallerSdkScope;
import defpackage.f1;
import defpackage.t;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/login/truecaller/AndroidTruecallerSetupHandlerImpl;", "Lapp/chalo/login/truecaller/TruecallerSetupHandler;", "Companion", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidTruecallerSetupHandlerImpl implements TruecallerSetupHandler {
    public static final Lazy d = LazyKt.b(new f1(18));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f5291a;
    public final CrashlyticsLogger b;
    public final MutableStateFlow c = StateFlowKt.a(Unit.f17538a);

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/truecaller/AndroidTruecallerSetupHandlerImpl$Companion;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public AndroidTruecallerSetupHandlerImpl(WeakReference weakReference, CrashlyticsLogger crashlyticsLogger) {
        this.f5291a = weakReference;
        this.b = crashlyticsLogger;
    }

    @Override // app.chalo.login.truecaller.TruecallerSetupHandler
    public final void S(TruecallerSetupConfig truecallerSetupConfig, final Function1 function1) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ITrueCallback iTrueCallback = new ITrueCallback() { // from class: app.chalo.login.truecaller.AndroidTruecallerSetupHandlerImpl$initTruecaller$callback$1
            @Override // com.truecaller.android.sdk.ITrueCallback
            public final void onFailureProfileShared(TrueError trueError) {
                Intrinsics.i(trueError, "trueError");
                function1.invoke(new ChaloUseCaseResult.Failure(TruecallerSetupHandler_androidKt.a(trueError)));
            }

            @Override // com.truecaller.android.sdk.ITrueCallback
            public final void onSuccessProfileShared(TrueProfile trueProfile) {
                Intrinsics.i(trueProfile, "trueProfile");
                function1.invoke(new ChaloUseCaseResult.Success(new TruecallerProfile(trueProfile.payload, trueProfile.signature, trueProfile.signatureAlgorithm, trueProfile.phoneNumber, trueProfile.firstName, trueProfile.lastName, trueProfile.email)));
            }

            @Override // com.truecaller.android.sdk.ITrueCallback
            public final void onVerificationRequired(TrueError trueError) {
                TruecallerError truecallerErrorA;
                if (trueError == null || (truecallerErrorA = TruecallerSetupHandler_androidKt.a(trueError)) == null) {
                    truecallerErrorA = TruecallerError.UNKNOWN;
                }
                function1.invoke(new ChaloUseCaseResult.Failure(truecallerErrorA));
            }
        };
        AppCompatActivity appCompatActivity = (AppCompatActivity) this.f5291a.get();
        if (appCompatActivity != null) {
            TruecallerSdkScope.Builder builder = new TruecallerSdkScope.Builder(appCompatActivity, iTrueCallback);
            TruecallerSetupConfig.TruecallerConsentMode truecallerConsentMode = truecallerSetupConfig.f5294a;
            Intrinsics.i(truecallerConsentMode, "<this>");
            int i6 = TruecallerSetupDataHelperKt.WhenMappings.f5295a[truecallerConsentMode.ordinal()];
            int i7 = 8;
            int i8 = 4;
            if (i6 == 1) {
                i = 128;
            } else if (i6 == 2) {
                i = 8;
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 4;
            }
            TruecallerSdkScope.Builder builderButtonColor = builder.consentMode(i).buttonColor(Color.parseColor(truecallerSetupConfig.b));
            TruecallerSetupConfig.TruecallerButtonShape truecallerButtonShape = truecallerSetupConfig.c;
            Intrinsics.i(truecallerButtonShape, "<this>");
            int i9 = TruecallerSetupDataHelperKt.WhenMappings.b[truecallerButtonShape.ordinal()];
            if (i9 == 1) {
                i2 = 2048;
            } else {
                if (i9 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 1024;
            }
            TruecallerSdkScope.Builder builderButtonShapeOptions = builderButtonColor.buttonShapeOptions(i2);
            TruecallerSetupConfig.TruecallerConsentTitleVerify truecallerConsentTitleVerify = truecallerSetupConfig.d;
            Intrinsics.i(truecallerConsentTitleVerify, "<this>");
            switch (TruecallerSetupDataHelperKt.WhenMappings.c[truecallerConsentTitleVerify.ordinal()]) {
                case 1:
                    i3 = 0;
                    break;
                case 2:
                    i3 = 1;
                    break;
                case 3:
                    i3 = 2;
                    break;
                case 4:
                    i3 = 3;
                    break;
                case 5:
                    i3 = 4;
                    break;
                case 6:
                    i3 = 5;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            TruecallerSdkScope.Builder builderConsentTitleOption = builderButtonShapeOptions.consentTitleOption(i3);
            TruecallerSetupConfig.TruecallerFooterType truecallerFooterType = truecallerSetupConfig.e;
            Intrinsics.i(truecallerFooterType, "<this>");
            switch (TruecallerSetupDataHelperKt.WhenMappings.d[truecallerFooterType.ordinal()]) {
                case 1:
                    i4 = 1;
                    break;
                case 2:
                    i4 = 2;
                    break;
                case 3:
                    i4 = 256;
                    break;
                case 4:
                    i4 = 512;
                    break;
                case 5:
                    i4 = 64;
                    break;
                case 6:
                    i4 = 4096;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            TruecallerSdkScope.Builder builderFooterType = builderConsentTitleOption.footerType(i4);
            TruecallerSetupConfig.TruecallerLoginTextPrefix truecallerLoginTextPrefix = truecallerSetupConfig.f;
            Intrinsics.i(truecallerLoginTextPrefix, "<this>");
            switch (TruecallerSetupDataHelperKt.WhenMappings.e[truecallerLoginTextPrefix.ordinal()]) {
                case 1:
                    i7 = 0;
                    break;
                case 2:
                    i7 = 1;
                    break;
                case 3:
                    i7 = 2;
                    break;
                case 4:
                    i7 = 3;
                    break;
                case 5:
                    i7 = 4;
                    break;
                case 6:
                    i7 = 5;
                    break;
                case 7:
                    i7 = 6;
                    break;
                case 8:
                    i7 = 7;
                    break;
                case 9:
                    break;
                case 10:
                    i7 = 9;
                    break;
                case 11:
                    i7 = 10;
                    break;
                case 12:
                    i7 = 11;
                    break;
                case 13:
                    i7 = 12;
                    break;
                case 14:
                    i7 = 13;
                    break;
                case 15:
                    i7 = 14;
                    break;
                case 16:
                    i7 = 15;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            TruecallerSdkScope.Builder builderLoginTextPrefix = builderFooterType.loginTextPrefix(i7);
            TruecallerSetupConfig.TruecallerLoginTextSuffix truecallerLoginTextSuffix = truecallerSetupConfig.g;
            Intrinsics.i(truecallerLoginTextSuffix, "<this>");
            switch (TruecallerSetupDataHelperKt.WhenMappings.f[truecallerLoginTextSuffix.ordinal()]) {
                case 1:
                    i8 = 0;
                    break;
                case 2:
                    i8 = 1;
                    break;
                case 3:
                    i8 = 2;
                    break;
                case 4:
                    i8 = 3;
                    break;
                case 5:
                    break;
                case 6:
                    i8 = 5;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            TruecallerSdkScope.Builder builderLoginTextSuffix = builderLoginTextPrefix.loginTextSuffix(i8);
            TruecallerSetupConfig.TruecallerSdkOption truecallerSdkOption = truecallerSetupConfig.h;
            Intrinsics.i(truecallerSdkOption, "<this>");
            int i10 = TruecallerSetupDataHelperKt.WhenMappings.g[truecallerSdkOption.ordinal()];
            if (i10 == 1) {
                i5 = 16;
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = 32;
            }
            TruecallerSDK.init(builderLoginTextSuffix.sdkOptions(i5).build());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        TruecallerSDK.clear();
    }

    @Override // app.chalo.login.truecaller.TruecallerSetupHandler
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final MutableStateFlow getC() {
        return this.c;
    }

    @Override // app.chalo.login.truecaller.TruecallerSetupHandler
    public final void h0(int i, int i2, Intent intent) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) this.f5291a.get();
        if (appCompatActivity != null) {
            try {
                TruecallerSDK truecallerSDK = TruecallerSDK.getInstance();
                Intrinsics.h(truecallerSDK, "getInstance(...)");
                truecallerSDK.onActivityResultObtained(appCompatActivity, i, i2, intent);
            } catch (Exception e) {
                this.b.i(e);
            }
        }
    }

    @Override // app.chalo.login.truecaller.TruecallerSetupHandler
    public final boolean m() {
        return ((Number) ((AbstractSharedFlow) this.c).g().getValue()).intValue() >= 1;
    }

    @Override // app.chalo.login.truecaller.TruecallerSetupHandler
    public final void y(String uid) {
        Intrinsics.i(uid, "uid");
        try {
            TruecallerSDK truecallerSDK = TruecallerSDK.getInstance();
            Intrinsics.h(truecallerSDK, "getInstance(...)");
            AppCompatActivity appCompatActivity = (AppCompatActivity) this.f5291a.get();
            if (appCompatActivity != null) {
                truecallerSDK.setRequestNonce(uid);
                truecallerSDK.getUserProfile(appCompatActivity);
            }
        } catch (Exception e) {
            this.b.i(e);
        }
    }

    @Override // app.chalo.login.truecaller.TruecallerSetupHandler
    public final boolean z() {
        Object objInvoke;
        t tVar = new t(24);
        try {
            TruecallerSDK truecallerSDK = TruecallerSDK.getInstance();
            Intrinsics.h(truecallerSDK, "getInstance(...)");
            objInvoke = tVar.invoke(truecallerSDK);
        } catch (Exception e) {
            this.b.i(e);
            objInvoke = null;
        }
        Boolean bool = (Boolean) objInvoke;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
