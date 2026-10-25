package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.camera.core.ImageProxy;
import androidx.compose.ui.platform.FocusFinderCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.FlacStreamMetadata;
import app.chalo.features.adjust.CommonAdjustAttribution;
import app.chalo.features.adjust.CommonAdjustConfig;
import app.chalo.login.phonenumberhint.AndroidPhoneNumberHintHandler;
import app.chalo.login.phonenumberhint.PhoneNumberHintResult;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.OnAttributionChangedListener;
import com.adster.sdk.mediation.InitializationCompleteCallback;
import com.adster.sdk.mediation.admob.AdMobAppOpenAd;
import com.adster.sdk.mediation.admob.AdMobBannerAd;
import com.adster.sdk.mediation.admob.AdMobInterstitialAd;
import com.adster.sdk.mediation.adster.AdFullScreenActivity;
import com.adster.sdk.mediation.gam.GAMBannerAd;
import com.adster.sdk.mediation.gam.GAMInterstitialAd;
import com.adster.sdk.mediation.gam.GAMUnifiedAoiAd;
import com.adster.sdk.mediation.gam.GamAppOpenAd;
import com.adster.sdk.mediation.meta.MetaAdapter;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.ads.listeners.ApsInitializationListener;
import com.amazon.aps.ads.util.ApsMraidHandler;
import com.amazon.aps.shared.util.ApsAsyncUtil;
import com.amazon.aps.shared.util.ApsResult;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBMRAIDCloseButtonListener;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageIntentChooser;
import com.canhub.cropper.CropImageView;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.SessionEvent;
import in.juspay.hyperqr.InputImageScanner;
import in.juspay.hyperqr.QRCodeAnalyzer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class iz0 implements OnCompleteListener, OnApplyWindowInsetsListener, OnPaidEventListener, OnAttributionChangedListener, OnSuccessListener, OnFailureListener, ApsAsyncUtil.ApsExecutionListener, DTBMRAIDCloseButtonListener, AccessibilityViewCommand, SuccessContinuation, Deferred.DeferredHandler, Continuation, ActivityResultCallback, DefaultTrackSelector.TrackInfo.Factory, RequirementsWatcher.Listener, Transformer, BinarySearchSeeker.SeekTimestampConverter, FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter, InputConnectionCompat.OnCommitContentListener, AudienceNetworkAds.InitListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17102a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iz0(Object obj, int i) {
        this.f17102a = i;
        this.b = obj;
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return ((EventGDTLogger) this.b).encode((SessionEvent) obj);
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return DefaultTrackSelector.lambda$selectImageTrack$4((DefaultTrackSelector.Parameters) this.b, i, trackGroup, iArr);
    }

    @Override // androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter
    public View get(View view, View view2) {
        return FocusFinderCompat.userSpecifiedFocusComparator$lambda$0((FocusFinderCompat) this.b, view, view2);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        ((CrashlyticsNativeComponentDeferredProxy) this.b).lambda$new$0(provider);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        Uri data;
        CropImageIntentChooser cropImageIntentChooser = (CropImageIntentChooser) this.b;
        ActivityResult activityResult = (ActivityResult) obj;
        CropImageActivity cropImageActivity = cropImageIntentChooser.b.f12737a;
        if (activityResult.getResultCode() != -1) {
            cropImageActivity.l0();
            return;
        }
        Intent data2 = activityResult.getData();
        if (data2 == null || (data = data2.getData()) == null) {
            data = cropImageIntentChooser.e;
        }
        if (data == null) {
            cropImageActivity.l0();
            return;
        }
        cropImageActivity.a0 = data;
        CropImageView cropImageView = cropImageActivity.c0;
        if (cropImageView != null) {
            cropImageView.setImageUriAsync(data);
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return AdFullScreenActivity.applyInsetsPadding$lambda$3((AdFullScreenActivity) this.b, view, windowInsetsCompat);
    }

    @Override // com.adjust.sdk.OnAttributionChangedListener
    public void onAttributionChanged(AdjustAttribution adjustAttribution) {
        ((CommonAdjustConfig) this.b).e.invoke(adjustAttribution != null ? new CommonAdjustAttribution(adjustAttribution.trackerToken, adjustAttribution.trackerName, adjustAttribution.network, adjustAttribution.campaign, adjustAttribution.adgroup, adjustAttribution.creative, adjustAttribution.clickLabel, adjustAttribution.costType, adjustAttribution.costAmount, adjustAttribution.costCurrency, adjustAttribution.fbInstallReferrer) : null);
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        return InputConnectionCompat.lambda$createOnCommitContentListenerUsingPerformReceiveContent$0((View) this.b, inputContentInfoCompat, i, bundle);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        QRCodeAnalyzer.analyze$lambda$2((ImageProxy) this.b, task);
    }

    @Override // com.amazon.aps.shared.util.ApsAsyncUtil.ApsExecutionListener
    public void onExecutionCompleted(ApsResult apsResult, Object obj) {
        Aps.lambda$initialize$1((ApsInitializationListener) this.b, apsResult, (AdRegistration) obj);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        switch (this.f17102a) {
            case 7:
                AndroidPhoneNumberHintHandler androidPhoneNumberHintHandler = (AndroidPhoneNumberHintHandler) this.b;
                Intrinsics.i(it, "it");
                androidPhoneNumberHintHandler.d.f(new PhoneNumberHintResult.UnknownException(it));
                break;
            default:
                InputImageScanner.scanImage$lambda$1((InputImageScanner) this.b, it);
                break;
        }
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        MetaAdapter.a((InitializationCompleteCallback) this.b, initResult);
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        switch (this.f17102a) {
            case 2:
                AdMobAppOpenAd.onAdLoaded$lambda$1((AdMobAppOpenAd) this.b, adValue);
                break;
            case 3:
                AdMobBannerAd.onAdLoaded$lambda$3((AdMobBannerAd) this.b, adValue);
                break;
            case 4:
                AdMobInterstitialAd.onAdLoaded$lambda$1((AdMobInterstitialAd) this.b, adValue);
                break;
            case 23:
                GAMBannerAd.onAdLoaded$lambda$3((GAMBannerAd) this.b, adValue);
                break;
            case 24:
                GAMInterstitialAd.onAdLoaded$lambda$2((GAMInterstitialAd) this.b, adValue);
                break;
            case 25:
                GAMUnifiedAoiAd.onAdLoaded$lambda$1((GAMUnifiedAoiAd) this.b, adValue);
                break;
            default:
                GamAppOpenAd.onAdLoaded$lambda$1((GamAppOpenAd) this.b, adValue);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
        ((DownloadManager) this.b).onRequirementsStateChanged(requirementsWatcher, i);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((g) this.b).invoke(obj);
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.b;
        int i = BottomSheetDragHandleView.e;
        if (!bottomSheetDragHandleView.c) {
            return false;
        }
        BottomSheetBehavior bottomSheetBehavior = bottomSheetDragHandleView.f13228a;
        boolean z = bottomSheetBehavior.b;
        int i2 = bottomSheetBehavior.L;
        int i3 = 6;
        int i4 = 3;
        if (i2 == 4) {
            if (z) {
                i3 = i4;
            }
        } else if (i2 != 3) {
            if (!bottomSheetDragHandleView.d) {
                i4 = 4;
            }
            i3 = i4;
        } else if (z) {
            i3 = 4;
        }
        bottomSheetBehavior.f(i3);
        return true;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return ConfigFetchHandler.lambda$fetchFromBackendAndCacheResponse$4((ConfigFetchHandler.FetchResponse) this.b, (ConfigContainer) obj);
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
    public long timeUsToTargetTime(long j) {
        return ((FlacStreamMetadata) this.b).getSampleNumber(j);
    }

    @Override // com.amazon.device.ads.DTBMRAIDCloseButtonListener
    public void useCustomButtonUpdated() {
        switch (this.f17102a) {
            case 9:
                ApsInterstitialActivity.m7712prepareCloseButtonRegion$lambda10$lambda8$lambda6((ApsInterstitialActivity) this.b);
                break;
            default:
                ApsMraidHandler.m7716_init_$lambda0((ApsMraidHandler) this.b);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f17102a) {
            case 14:
                return CrashlyticsWorker.lambda$submit$1((Runnable) this.b, task);
            case 15:
                return CrashlyticsWorker.lambda$submitTaskOnSuccess$5((SuccessContinuation) this.b, task);
            default:
                return FirebaseRemoteConfig.lambda$ensureInitialized$0((Task) this.b, task);
        }
    }
}
