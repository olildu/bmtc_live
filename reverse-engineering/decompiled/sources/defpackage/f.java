package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.text.BasicSecureTextField_androidKt;
import androidx.compose.foundation.text.BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.ContentResolverForSecureTextField;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import app.chalo.ads.AdsterUnifiedAd_androidKt;
import app.chalo.appsupport.BookingHelpScreenDataState;
import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreferenceKt;
import app.chalo.chalobususerprofile.ui.compose.ChaloBusUserProfileSurveyDataState;
import app.chalo.chalobususerprofile.ui.compose.PBUserProfileSurveyStepNavigator;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.chalobus.RidePreferenceBannerState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoDataState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteSuggestionCardUiState;
import app.chalo.home.ui.chalobusrouteinfo.RouteSuggestionSheetState;
import app.chalo.livetracking.frameworklivetracking.ChaloSocketClient;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResponse;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketResult;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetValue;
import app.chalo.ncmc.data.LinkCardConfig;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkCardComponent;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkRestoredState;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkViewState;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountLayoutType;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeDataFetchErrorReason;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountFlowType;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountIntent;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryUiErrorWrapper;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryViewState;
import app.chalo.scenes.args.BookingCancellationTarget;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.usercommutepreference.data.models.app.CreateRideResponseAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData;
import app.chalo.validationsdk.blevalidation.ui.BleValidationMetaData;
import app.chalo.validationsdk.blevalidation.ui.BleValidationState;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.ImageViewTarget;
import com.adster.sdk.mediation.MediationBannerVideoAd;
import com.adster.sdk.mediation.MediationNativeAd;
import com.adster.sdk.mediation.adster.DSPBranding;
import defpackage.vo1;
import io.ktor.utils.io.ByteChannel;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15599a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.f15599a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objA;
        String str;
        String str2;
        String str3;
        switch (this.f15599a) {
            case 0:
                return AbstractClickableNode.handlePressInteractionCancel$lambda$0$0$0((MutableInteractionSource) this.b, (PressInteraction.Cancel) this.c, (Throwable) obj);
            case 1:
                MutableIntState mutableIntState = (MutableIntState) this.b;
                MutableState mutableState = (MutableState) this.c;
                FrameLayout view = (FrameLayout) obj;
                Intrinsics.i(view, "view");
                view.setVisibility((mutableIntState.getIntValue() <= 0 || AdsterUnifiedAd_androidKt.e(mutableState)) ? 4 : 0);
                return Unit.f17538a;
            case 2:
                final MutableState mutableState2 = (MutableState) this.b;
                final State state = (State) this.c;
                final LifecycleResumePauseEffectScope LifecycleResumeEffect = (LifecycleResumePauseEffectScope) obj;
                Intrinsics.i(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
                T value = mutableState2.getValue();
                Function1 onCrashLoggingRequired = (Function1) state.getValue();
                Intrinsics.i(onCrashLoggingRequired, "onCrashLoggingRequired");
                MediationBannerVideoAd mediationBannerVideoAd = value instanceof MediationBannerVideoAd ? (MediationBannerVideoAd) value : null;
                if (mediationBannerVideoAd != null) {
                    try {
                        mediationBannerVideoAd.resume();
                        objA = Unit.f17538a;
                    } catch (Throwable th) {
                        objA = ResultKt.a(th);
                    }
                    if (!(objA instanceof Result.Failure)) {
                    }
                    Throwable thA = Result.a(objA);
                    if (thA != null) {
                        String strF = Reflection.a(thA.getClass()).f();
                        String message = thA.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        onCrashLoggingRequired.invoke(new CrashlyticsLog("AdsterUnifiedAd resume banner video", vo1.n(strF, ":", message)));
                    }
                    break;
                }
                return new LifecyclePauseOrDisposeEffectResult(LifecycleResumeEffect, mutableState2, state) { // from class: app.chalo.ads.AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$lambda$48$0$$inlined$onPauseOrDispose$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ MutableState f735a;
                    public final /* synthetic */ State b;

                    {
                        this.f735a = mutableState2;
                        this.b = state;
                    }

                    @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
                    public final void runPauseOrOnDisposeEffect() {
                        Object objA2;
                        T value2 = this.f735a.getValue();
                        Function1 onCrashLoggingRequired2 = (Function1) this.b.getValue();
                        Intrinsics.i(onCrashLoggingRequired2, "onCrashLoggingRequired");
                        MediationBannerVideoAd mediationBannerVideoAd2 = value2 instanceof MediationBannerVideoAd ? (MediationBannerVideoAd) value2 : null;
                        if (mediationBannerVideoAd2 == null) {
                            return;
                        }
                        try {
                            mediationBannerVideoAd2.pause();
                            objA2 = Unit.f17538a;
                        } catch (Throwable th2) {
                            objA2 = ResultKt.a(th2);
                        }
                        if (!(objA2 instanceof Result.Failure)) {
                        }
                        Throwable thA2 = Result.a(objA2);
                        if (thA2 != null) {
                            String strF2 = Reflection.a(thA2.getClass()).f();
                            String message2 = thA2.getMessage();
                            if (message2 == null) {
                                message2 = "";
                            }
                            onCrashLoggingRequired2.invoke(new CrashlyticsLog("AdsterUnifiedAd pause banner video", vo1.n(strF2, ":", message2)));
                        }
                    }
                };
            case 3:
                MediationNativeAd mediationNativeAd = (MediationNativeAd) this.b;
                Context context = (Context) this.c;
                ImageView choiceView = (ImageView) obj;
                Intrinsics.i(choiceView, "choiceView");
                DSPBranding dspBranding = mediationNativeAd.getDspBranding();
                String imageUrl = dspBranding != null ? dspBranding.getImageUrl() : null;
                if (imageUrl == null) {
                    imageUrl = "";
                }
                String string = StringsKt.u0(imageUrl).toString();
                String landing = dspBranding != null ? dspBranding.getLanding() : null;
                String string2 = StringsKt.u0(landing != null ? landing : "").toString();
                if (StringsKt.F(string)) {
                    choiceView.setVisibility(8);
                    choiceView.setOnClickListener(null);
                } else {
                    choiceView.setVisibility(0);
                    ImageLoader imageLoaderA = Coil.a(choiceView.getContext());
                    ImageRequest.Builder builder = new ImageRequest.Builder(choiceView.getContext());
                    builder.c = string;
                    builder.d = new ImageViewTarget(choiceView);
                    builder.k = null;
                    builder.l = null;
                    builder.m = null;
                    imageLoaderA.a(builder.a());
                    if (StringsKt.F(string2)) {
                        choiceView.setOnClickListener(null);
                    } else {
                        choiceView.setOnClickListener(new b2(1, context, string2));
                    }
                }
                return Unit.f17538a;
            case 4:
                return AndroidViewBindingKt.AndroidViewBinding$lambda$5$0((Fragment) this.b, (Function3) this.c, (Context) obj);
            case 5:
                return AwaitFirstLayoutModifier.Node.requestOnAfterLayoutCallback$lambda$0((AwaitFirstLayoutModifier.Node) this.b, (AwaitFirstLayoutModifier) this.c, (RelativeLayoutBounds) obj);
            case 6:
                return BasicSecureTextField_androidKt.platformAllowsRevealLastTyped$lambda$5$0((ContentResolverForSecureTextField) this.b, (BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1) this.c, (DisposableEffectScope) obj);
            case 7:
                return BasicTextFieldKt.BasicTextField$lambda$27$0((TextFieldValue) this.b, (Function1) this.c, (TextFieldValue) obj);
            case 8:
                return BasicTooltipKt.keyboardBehavior$lambda$13((CoroutineScope) this.b, (TooltipState) this.c, (FocusState) obj);
            case 9:
                String str4 = (String) this.b;
                BleValidationAckData.TITOTapOutData tITOTapOutData = (BleValidationAckData.TITOTapOutData) this.c;
                BleValidationState it = (BleValidationState) obj;
                Intrinsics.i(it, "it");
                BleValidationMetaData bleValidationMetaData = it.j;
                return BleValidationState.a(it, null, null, null, null, null, false, null, false, null, bleValidationMetaData != null ? BleValidationMetaData.a(bleValidationMetaData, str4, Long.valueOf(tITOTapOutData.g)) : null, 3583);
            case 10:
                BookingCancellationTarget bookingCancellationTarget = (BookingCancellationTarget) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                BookingHelpScreenDataState it2 = (BookingHelpScreenDataState) obj;
                Intrinsics.i(it2, "it");
                return BookingHelpScreenDataState.a(it2, bookingCancellationTarget, arrayList, false, null, 57);
            case 11:
                return BorderModifierNode.drawRoundRectBorder_JqoCqck$lambda$1((Path) this.b, (Brush) this.c, (ContentDrawScope) obj);
            case 12:
                return BorderModifierNode.drawGenericBorder$lambda$0((Outline.Generic) this.b, (Brush) this.c, (ContentDrawScope) obj);
            case 13:
                return BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$10$lambda$9((CoroutineScope) this.b, (SheetState) this.c, ((Float) obj).floatValue());
            case 14:
                AnimationSpec animationSpec = (AnimationSpec) this.b;
                Function1 function1 = (Function1) this.c;
                BottomSheetValue it3 = (BottomSheetValue) obj;
                Intrinsics.i(it3, "it");
                return new BottomSheetState(it3, animationSpec, function1);
            case 15:
                return BringIntoViewRequestPriorityQueue.enqueue$lambda$1((BringIntoViewRequestPriorityQueue) this.b, (ContentInViewNode.Request) this.c, (Throwable) obj);
            case 16:
                ByteChannel byteChannel = (ByteChannel) this.b;
                ByteChannel byteChannel2 = (ByteChannel) this.c;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    byteChannel.a(th2);
                    byteChannel2.a(th2);
                }
                return Unit.f17538a;
            case 17:
                Ref.IntRef intRef = (Ref.IntRef) this.b;
                ReadableByteChannel readableByteChannel = (ReadableByteChannel) this.c;
                ByteBuffer buffer = (ByteBuffer) obj;
                Intrinsics.i(buffer, "buffer");
                intRef.element = readableByteChannel.read(buffer);
                return Unit.f17538a;
            case 18:
                String str5 = (String) this.b;
                CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper = (CardTransactionHistoryUiErrorWrapper) this.c;
                CardTransactionHistoryViewState oldState = (CardTransactionHistoryViewState) obj;
                Intrinsics.i(oldState, "oldState");
                return CardTransactionHistoryViewState.a(oldState, str5, cardTransactionHistoryUiErrorWrapper, null, false, null, 28);
            case 19:
                RidePreferenceBannerState.SaveRideEligible saveRideEligible = (RidePreferenceBannerState.SaveRideEligible) this.b;
                ChaloUseCaseResult.Success success = (ChaloUseCaseResult.Success) this.c;
                ChaloBusViewState it4 = (ChaloBusViewState) obj;
                Intrinsics.i(it4, "it");
                return ChaloBusViewState.a(it4, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, new RidePreferenceBannerState.SaveRideEligible(true, saveRideEligible.b, saveRideEligible.c, saveRideEligible.d, saveRideEligible.e), null, null, ((CreateRideResponseAppModel) success.f10419a).b, 117440509);
            case 20:
                List list = (List) this.b;
                List list2 = (List) this.c;
                ChaloBusViewState it5 = (ChaloBusViewState) obj;
                Intrinsics.i(it5, "it");
                return ChaloBusViewState.a(it5, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, list, null, null, false, list2, false, null, null, null, null, 263979007);
            case 21:
                Function1 function2 = (Function1) this.b;
                RouteSuggestionSheetState routeSuggestionSheetState = (RouteSuggestionSheetState) this.c;
                ChaloBusRouteInfoDataState state2 = (ChaloBusRouteInfoDataState) obj;
                Intrinsics.i(state2, "state");
                return ChaloBusRouteInfoDataState.a(state2, null, false, null, null, null, null, null, null, (RouteSuggestionSheetState) function2.invoke(routeSuggestionSheetState), 255);
            case 22:
                ChaloBusRouteInfoComponent chaloBusRouteInfoComponent = (ChaloBusRouteInfoComponent) this.b;
                if (chaloBusRouteInfoComponent.u == ((Job) this.c)) {
                    chaloBusRouteInfoComponent.u = null;
                }
                return Unit.f17538a;
            case 23:
                final List list3 = (List) this.b;
                ChaloBusRouteSuggestionCardUiState chaloBusRouteSuggestionCardUiState = (ChaloBusRouteSuggestionCardUiState) this.c;
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                LazyColumn.items(list3.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoMainScreenKt$ChaloBusRouteInfoContent$lambda$0$0$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list3.get(((Number) obj2).intValue());
                        return null;
                    }
                }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoMainScreenKt$ChaloBusRouteInfoContent$lambda$0$0$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i & 147) != 146, i & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            ChaloBusRouteCorridorUIState chaloBusRouteCorridorUIState = (ChaloBusRouteCorridorUIState) list3.get(iIntValue);
                            composer.startReplaceGroup(555931881);
                            ChaloBusRouteInfoMainScreenKt.c(chaloBusRouteCorridorUIState, composer, 0);
                            DividerUIStateKt.a(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), chaloBusRouteCorridorUIState.i, composer, 6, 0);
                            if (iIntValue == CollectionsKt.K(list3)) {
                                composer.startReplaceGroup(556181740);
                                ChaloSpacersKt.n(composer, 0);
                            } else {
                                composer.startReplaceGroup(547198126);
                            }
                            composer.endReplaceGroup();
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }));
                LazyListScope.CC.m(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-319227139, true, new c6(chaloBusRouteSuggestionCardUiState, 4)), 3, null);
                return Unit.f17538a;
            case 24:
                ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState = (ChaloBusUserProfileSurveyDataState) this.b;
                PBUserProfileSurveyStepNavigator.Result result = (PBUserProfileSurveyStepNavigator.Result) this.c;
                ChaloBusUserProfileSurveyDataState it6 = (ChaloBusUserProfileSurveyDataState) obj;
                Intrinsics.i(it6, "it");
                return ChaloBusUserProfileSurveyDataState.a(it6, PBUserProfileSurveyPreferenceKt.a(it6.f1206a, chaloBusUserProfileSurveyDataState.b), result.f1232a, result.b, false, null, null, false, 200);
            case 25:
                ChaloCardLinkCardComponent chaloCardLinkCardComponent = (ChaloCardLinkCardComponent) this.b;
                LinkCardConfig linkCardConfig = (LinkCardConfig) this.c;
                ChaloCardLinkViewState chaloCardLinkViewState = (ChaloCardLinkViewState) obj;
                ChaloCardLinkRestoredState chaloCardLinkRestoredState = chaloCardLinkCardComponent.q;
                String str6 = "";
                if (chaloCardLinkRestoredState == null || (str = chaloCardLinkRestoredState.f6277a) == null) {
                    str = "";
                }
                if (chaloCardLinkRestoredState != null && (str3 = chaloCardLinkRestoredState.b) != null) {
                    str6 = str3;
                }
                if (chaloCardLinkRestoredState == null || (str2 = chaloCardLinkRestoredState.g) == null) {
                    str2 = linkCardConfig.b;
                }
                return ChaloCardLinkViewState.a(chaloCardLinkViewState, str, str6, false, false, null, false, null, str2, chaloCardLinkRestoredState != null ? chaloCardLinkRestoredState.c : linkCardConfig.e, chaloCardLinkRestoredState != null ? chaloCardLinkRestoredState.d : linkCardConfig.f, chaloCardLinkRestoredState != null ? chaloCardLinkRestoredState.e : linkCardConfig.g, chaloCardLinkRestoredState != null ? chaloCardLinkRestoredState.f : linkCardConfig.h, false, 4220);
            case 26:
                LinkCardConfig linkCardConfig2 = (LinkCardConfig) this.b;
                return ChaloCardRechargeAmountViewState.a((ChaloCardRechargeAmountViewState) obj, (ChaloCardRechargeAmountFlowType) this.c, null, null, null, null, 0L, null, null, CardRechargeAmountLayoutType.FullScreenLoadingLayout.f6287a, null, false, false, null, linkCardConfig2.c, linkCardConfig2.d, linkCardConfig2.b, null, false, null, 1867262);
            case 27:
                Function1 function3 = (Function1) this.b;
                CardRechargeDataFetchErrorReason cardRechargeDataFetchErrorReason = (CardRechargeDataFetchErrorReason) this.c;
                Intrinsics.i((CardRechargeDataFetchErrorReason) obj, "it");
                function3.invoke(new ChaloCardRechargeAmountIntent.CardDataFetchErrorActionClickedIntent(cardRechargeDataFetchErrorReason));
                return Unit.f17538a;
            case 28:
                ProducerScope producerScope = (ProducerScope) this.b;
                ChaloSocketClient chaloSocketClient = (ChaloSocketClient) this.c;
                List list4 = (List) obj;
                try {
                    Json.Default r4 = Json.d;
                    Object obj2 = list4.get(0);
                    Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.String");
                    r4.getClass();
                    producerScope.mo7576trySendJP2dKIU(new ChaloSocketResult.Data.Success((ChaloSocketResponse.Success) r4.b((String) obj2, ChaloSocketResponse.Success.INSTANCE.serializer())));
                    break;
                } catch (Exception e) {
                    chaloSocketClient.b.i(e);
                    producerScope.mo7576trySendJP2dKIU(new ChaloSocketResult.Data.Failed(String.valueOf(e.getMessage())));
                }
                return Unit.f17538a;
            default:
                Function1 function4 = (Function1) this.b;
                BaseTextFieldUIState.TextFieldUIState textFieldUIState = (BaseTextFieldUIState.TextFieldUIState) this.c;
                TextFieldValue it7 = (TextFieldValue) obj;
                Intrinsics.i(it7, "it");
                if (function4 != null) {
                    function4.invoke(it7);
                }
                textFieldUIState.b.b(it7.getText());
                return Unit.f17538a;
        }
    }
}
