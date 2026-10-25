package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.result.IntentSenderRequest;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarScrollBehavior;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import app.cash.sqldelight.Transacter;
import app.chalo.analytics.AnalyticsContractImpl;
import app.chalo.appsupport.BookingHelpBottomSheetType;
import app.chalo.appsupport.BookingHelpScreenDataState;
import app.chalo.appsupport.data.models.app.CancelBookingAppModel;
import app.chalo.busesaroundyou.BusesAroundYouDataState;
import app.chalo.busesaroundyou.BusesAroundYouIntent;
import app.chalo.compose.components.chalomap.ChaloMapCameraPositionStateData;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.compose.utils.ContentAnimationTransitionSpecKt;
import app.chalo.features.network.NetworkConnectionType;
import app.chalo.geoquery.data.models.app.GeoQueryCityConfigModel;
import app.chalo.home.domain.PremiumBusUserMetadata;
import app.chalo.home.ui.chalobus.ChaloBusViewState;
import app.chalo.home.ui.regularbus.NearbyBusesMapData;
import app.chalo.login.phonenumberhint.AndroidPhoneNumberHintHandler;
import app.chalo.login.phonenumberhint.PhoneNumberHintResult;
import app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationBottomsheetType;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationState;
import app.chalo.validationsdk.blevalidation.ui.QRScreenLayoutInfo;
import app.chalo.validationsdk.blevalidation.ui.SwitchToQrValidationLayoutInfo;
import com.arkivanov.decompose.extensions.compose.stack.animation.predictiveback.AndroidPredictiveBackAnimatableV2;
import io.github.alexzhirkevich.compottie.internal.AnimationState;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannelOperationsKt$NO_CALLBACK$1;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.AbstractCollection;
import kotlin.collections.AbstractMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15687a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i) {
        this.f15687a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15687a;
        int i2 = 0;
        Unit unit = Unit.f17538a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return obj == ((AbstractCollection) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                AbstractMap abstractMap = (AbstractMap) obj2;
                Map.Entry it = (Map.Entry) obj;
                Intrinsics.i(it, "it");
                StringBuilder sb = new StringBuilder();
                Object key = it.getKey();
                sb.append(key == abstractMap ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = it.getValue();
                sb.append(value != abstractMap ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                FrameLayout frameLayout = (FrameLayout) obj2;
                Intrinsics.i((Context) obj, "it");
                return frameLayout;
            case 3:
                ImageView iconView = (ImageView) obj;
                Intrinsics.i(iconView, "iconView");
                iconView.setImageDrawable((Drawable) obj2);
                return unit;
            case 4:
                ((AnalyticsContractImpl) obj2).j.close(null);
                return unit;
            case 5:
                return AndroidCursorHandle_androidKt.CursorHandle_USBMPiE$lambda$0$0((OffsetProvider) obj2, (SemanticsPropertyReceiver) obj);
            case 6:
                AndroidPhoneNumberHintHandler androidPhoneNumberHintHandler = (AndroidPhoneNumberHintHandler) obj2;
                PendingIntent result = (PendingIntent) obj;
                Intrinsics.i(result, "result");
                try {
                    androidPhoneNumberHintHandler.b.invoke(new IntentSenderRequest.Builder(result).build());
                    break;
                } catch (Exception e) {
                    androidPhoneNumberHintHandler.d.f(new PhoneNumberHintResult.UnknownException(e));
                }
                return unit;
            case 7:
                ContentDrawScope drawWithContent = (ContentDrawScope) obj;
                Intrinsics.i(drawWithContent, "$this$drawWithContent");
                drawWithContent.drawContent();
                Color.INSTANCE.m4631getBlack0d7_KjU();
                ((AndroidPredictiveBackAnimatableV2) obj2).getClass();
                throw null;
            case 8:
                return AndroidViewBindingKt.AndroidViewBinding$lambda$7$0$0$0((FragmentManager) obj2, (FragmentContainerView) obj);
            case 9:
                return AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$19$lambda$18((BottomAppBarScrollBehavior) obj2, ((Float) obj).floatValue());
            case 10:
                return AppBarKt.settleAppBarBottom$lambda$30((BottomAppBarState) obj2, (AnimationScope) obj);
            case 11:
                AnimationState animationState = (AnimationState) obj2;
                ClosedFloatingPointRange it2 = (ClosedFloatingPointRange) obj;
                Intrinsics.i(it2, "it");
                if (animationState.d < ((Number) it2.getStart()).floatValue()) {
                    i2 = 1;
                } else if (animationState.d > ((Number) it2.getEndInclusive()).floatValue()) {
                    i2 = -1;
                }
                return Integer.valueOf(i2);
            case 12:
                String it3 = (String) obj;
                Intrinsics.i(it3, "it");
                ((Transacter.Transaction) obj2).e.add(it3);
                return unit;
            case 13:
                String it4 = (String) obj;
                Intrinsics.i(it4, "it");
                ((LinkedHashSet) obj2).add(it4);
                return unit;
            case 14:
                return BasicTextContextMenuProviderKt.basicTextContextMenuProvider$lambda$1$0((BasicTextContextMenuProvider) obj2, (DisposableEffectScope) obj);
            case 15:
                return BasicTextFieldKt.BasicTextField$lambda$12$0((TextFieldSelectionState) obj2, (DisposableEffectScope) obj);
            case 16:
                return BasicTooltipKt.BasicTooltipBox$lambda$4$lambda$3((TooltipState) obj2, (DisposableEffectScope) obj);
            case 17:
                return androidx.compose.foundation.BasicTooltipKt.BasicTooltipBox$lambda$1$0((BasicTooltipState) obj2, (DisposableEffectScope) obj);
            case 18:
                BleValidationDynamicInfo bleValidationDynamicInfo = (BleValidationDynamicInfo) obj2;
                BleValidationState currentState = (BleValidationState) obj;
                Intrinsics.i(currentState, "currentState");
                BleValidationLayoutInfo bleValidationLayoutInfo = currentState.b;
                if (bleValidationLayoutInfo == null) {
                    return currentState;
                }
                QRScreenLayoutInfo qRScreenLayoutInfoA = QRScreenLayoutInfo.a(bleValidationLayoutInfo.c, false, bleValidationDynamicInfo.f10534a, false, 5);
                SwitchToQrValidationLayoutInfo switchToQrValidationLayoutInfo = bleValidationLayoutInfo.b;
                long j = bleValidationDynamicInfo.b;
                boolean z = j <= 0;
                String bleValidationTutorialGifUrl = switchToQrValidationLayoutInfo.f10622a;
                boolean z2 = switchToQrValidationLayoutInfo.c;
                Intrinsics.i(bleValidationTutorialGifUrl, "bleValidationTutorialGifUrl");
                return BleValidationState.a(currentState, null, BleValidationLayoutInfo.a(bleValidationLayoutInfo, new SwitchToQrValidationLayoutInfo(bleValidationTutorialGifUrl, z2, z, j), qRScreenLayoutInfoA, 1), null, null, null, bleValidationDynamicInfo.c, null, false, null, null, 4061);
            case 19:
                BleValidationState currentState2 = (BleValidationState) obj;
                Intrinsics.i(currentState2, "currentState");
                return BleValidationState.a(currentState2, null, null, null, (BleValidationBottomsheetType) obj2, null, false, null, false, null, null, 4087);
            case 20:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.i(AnimatedContent, "$this$AnimatedContent");
                int i3 = BleValidationScreen_androidKt.WhenMappings.b[((BleValidationState) obj2).f10610a.ordinal()];
                if (i3 == 1) {
                    AnimatedContentTransitionScope.SlideDirection.Companion companion = AnimatedContentTransitionScope.SlideDirection.INSTANCE;
                    return AnimatedContentKt.togetherWith(AnimatedContentTransitionScope.CC.c(AnimatedContent, companion.m56getRightDKzdypw(), AnimationSpecKt.tween$default(250, 0, null, 6, null), null, 4, null), AnimatedContentTransitionScope.CC.d(AnimatedContent, companion.m56getRightDKzdypw(), AnimationSpecKt.tween$default(250, 0, null, 6, null), null, 4, null));
                }
                if (i3 == 2) {
                    return ContentAnimationTransitionSpecKt.c(AnimatedContent);
                }
                if (i3 == 3) {
                    return ContentAnimationTransitionSpecKt.c(AnimatedContent);
                }
                if (i3 == 4) {
                    return ContentAnimationTransitionSpecKt.c(AnimatedContent);
                }
                if (i3 == 5) {
                    return ContentAnimationTransitionSpecKt.c(AnimatedContent);
                }
                throw new NoWhenBranchMatchedException();
            case 21:
                BookingHelpScreenDataState it5 = (BookingHelpScreenDataState) obj;
                Intrinsics.i(it5, "it");
                return BookingHelpScreenDataState.a(it5, null, null, false, new BookingHelpBottomSheetType.CancellationFailed(((CancelBookingAppModel) obj2).b), 23);
            case 22:
                return BorderModifierNode.drawWithCacheModifierNode$lambda$0((BorderModifierNode) obj2, (CacheDrawScope) obj);
            case 23:
                BusesAroundYouDataState it6 = (BusesAroundYouDataState) obj;
                Intrinsics.i(it6, "it");
                return BusesAroundYouDataState.a(it6, false, ((BusesAroundYouIntent.InternetConnectionIntent) obj2).f1181a != NetworkConnectionType.CONNECTED, null, null, null, null, 0L, 0L, false, 2045);
            case 24:
                BusesAroundYouDataState it7 = (BusesAroundYouDataState) obj;
                Intrinsics.i(it7, "it");
                return BusesAroundYouDataState.a(it7, false, false, NearbyBusesMapData.a(it7.c, null, new MapCameraViewState.UpdatedState.CameraPosition(((ChaloMapCameraPositionStateData) obj2).d), null, 11), null, null, null, 0L, 0L, false, 2043);
            case 25:
                BusesAroundYouDataState busesAroundYouDataState = (BusesAroundYouDataState) obj;
                return BusesAroundYouDataState.a(busesAroundYouDataState, false, false, NearbyBusesMapData.a(busesAroundYouDataState.c, null, null, ((BusesAroundYouIntent.MapCameraPositionStateChangedIntent) obj2).f1182a, 7), null, null, null, 0L, 0L, false, 2043);
            case 26:
                return BusesAroundYouDataState.a((BusesAroundYouDataState) obj, false, false, null, null, null, (GeoQueryCityConfigModel) obj2, 0L, 0L, false, 1983);
            case 27:
                ByteChannel byteChannel = (ByteChannel) obj2;
                Throwable th = (Throwable) obj;
                ByteWriteChannelOperationsKt$NO_CALLBACK$1 byteWriteChannelOperationsKt$NO_CALLBACK$1 = ByteWriteChannelOperationsKt.f16932a;
                if (th != null && !byteChannel.f()) {
                    byteChannel.a(th);
                }
                return unit;
            case 28:
                return CacheDrawScopeDragShadowCallback.cachePicture$lambda$0$1((CacheDrawScopeDragShadowCallback) obj2, (ContentDrawScope) obj);
            default:
                ChaloBusViewState it8 = (ChaloBusViewState) obj;
                Intrinsics.i(it8, "it");
                return ChaloBusViewState.a(it8, null, false, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, ((PremiumBusUserMetadata) obj2).b, null, null, null, null, 260046847);
        }
    }
}
