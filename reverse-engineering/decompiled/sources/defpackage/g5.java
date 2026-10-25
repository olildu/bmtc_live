package defpackage;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.material3.DateInputKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetScaffoldKt;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.DrawerKt;
import coil3.compose.AsyncImagePainter;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15701a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ g5(MutableState mutableState, int i) {
        this.f15701a = i;
        this.b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15701a;
        Unit unit = Unit.f17538a;
        final MutableState mutableState = this.b;
        switch (i) {
            case 0:
                return AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$5$0$0(mutableState, (LayoutCoordinates) obj);
            case 1:
                TextFieldValue it = (TextFieldValue) obj;
                Intrinsics.i(it, "it");
                mutableState.setValue(it);
                return unit;
            case 2:
                return BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$4$0$0(mutableState, (LayoutCoordinates) obj);
            case 3:
                return BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$4$0(mutableState, (List) obj);
            case 4:
                return BasicTextKt.BasicText_CL7eQgs$lambda$5$0(mutableState, (TextAnnotatedStringNode.TextSubstitutionValue) obj);
            case 5:
                LayoutCoordinates it2 = (LayoutCoordinates) obj;
                float f = BottomSheetScaffoldKt.f4445a;
                Intrinsics.i(it2, "it");
                float fMo5941getSizeYbymL2g = (int) (BodyPartID.bodyIdMax & it2.mo5941getSizeYbymL2g());
                if (fMo5941getSizeYbymL2g > 0.0f) {
                    mutableState.setValue(Float.valueOf(fMo5941getSizeYbymL2g));
                }
                return unit;
            case 6:
                mutableState.setValue(Dp.m7276boximpl(((Dp) obj).m7292unboximpl()));
                return unit;
            case 7:
                LayoutCoordinates coordinates = (LayoutCoordinates) obj;
                PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
                Intrinsics.i(coordinates, "coordinates");
                mutableState.setValue(IntSize.m7437boximpl(coordinates.mo5941getSizeYbymL2g()));
                return unit;
            case 8:
                LayoutCoordinates coordinates2 = (LayoutCoordinates) obj;
                PaddingValues paddingValues2 = ChaloDatePickerKt.f1888a;
                Intrinsics.i(coordinates2, "coordinates");
                mutableState.setValue(IntSize.m7437boximpl(coordinates2.mo5941getSizeYbymL2g()));
                return unit;
            case 9:
                TextLayoutResult it3 = (TextLayoutResult) obj;
                Intrinsics.i(it3, "it");
                mutableState.setValue(it3);
                return unit;
            case 10:
                TextLayoutResult it4 = (TextLayoutResult) obj;
                Intrinsics.i(it4, "it");
                mutableState.setValue(it4);
                return unit;
            case 11:
                String it5 = (String) obj;
                Intrinsics.i(it5, "it");
                mutableState.setValue(it5);
                return unit;
            case 12:
                Intrinsics.i((AsyncImagePainter.State.Success) obj, "it");
                mutableState.setValue(Boolean.TRUE);
                return unit;
            case 13:
                Intrinsics.i((AsyncImagePainter.State.Success) obj, "it");
                mutableState.setValue(Boolean.TRUE);
                return unit;
            case 14:
                mutableState.setValue(Dp.m7276boximpl(((Dp) obj).m7292unboximpl()));
                return unit;
            case 15:
                mutableState.setValue(Float.valueOf(((Number) ((Animatable) obj).getValue()).floatValue()));
                return unit;
            case 16:
                return DateInputKt.DateInputTextField_xJ3Ic0Y$lambda$14$lambda$13(mutableState, (SemanticsPropertyReceiver) obj);
            case 17:
                LayoutCoordinates position = (LayoutCoordinates) obj;
                TweenSpec tweenSpec = DrawerKt.f4449a;
                Intrinsics.i(position, "position");
                mutableState.setValue(Float.valueOf((int) (BodyPartID.bodyIdMax & position.mo5941getSizeYbymL2g())));
                return unit;
            case 18:
                TextLayoutResult it6 = (TextLayoutResult) obj;
                Intrinsics.i(it6, "it");
                mutableState.setValue(it6);
                return unit;
            case 19:
                Intrinsics.i((AsyncImagePainter.State.Success) obj, "it");
                mutableState.setValue(Boolean.TRUE);
                return unit;
            case 20:
                Intrinsics.i((AsyncImagePainter.State.Error) obj, "it");
                mutableState.setValue(Boolean.TRUE);
                return unit;
            case 21:
                NativeAdView it7 = (NativeAdView) obj;
                Intrinsics.i(it7, "it");
                mutableState.setValue(it7);
                return unit;
            case 22:
                MediaView it8 = (MediaView) obj;
                Intrinsics.i(it8, "it");
                mutableState.setValue(it8);
                return unit;
            case 23:
                NativeAdView it9 = (NativeAdView) obj;
                Intrinsics.i(it9, "it");
                mutableState.setValue(it9);
                return unit;
            case 24:
                MediaView it10 = (MediaView) obj;
                Intrinsics.i(it10, "it");
                mutableState.setValue(it10);
                return unit;
            case 25:
                DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                return new DisposableEffectResult() { // from class: app.chalo.ads.NativeInlineAdKt$NativeInlineAd$lambda$26$0$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public final void dispose() {
                        mutableState.setValue(null);
                    }
                };
            case 26:
                LayoutCoordinates coordinates3 = (LayoutCoordinates) obj;
                Intrinsics.i(coordinates3, "coordinates");
                mutableState.setValue(IntSize.m7437boximpl(coordinates3.mo5941getSizeYbymL2g()));
                return unit;
            case 27:
                LayoutCoordinates coordinates4 = (LayoutCoordinates) obj;
                Intrinsics.i(coordinates4, "coordinates");
                mutableState.setValue(IntSize.m7437boximpl(coordinates4.mo5941getSizeYbymL2g()));
                return unit;
            case 28:
                FocusState focusState = (FocusState) obj;
                Intrinsics.i(focusState, "focusState");
                mutableState.setValue(Boolean.valueOf(focusState.isFocused()));
                return unit;
            default:
                FocusState focusState2 = (FocusState) obj;
                Intrinsics.i(focusState2, "focusState");
                mutableState.setValue(Boolean.valueOf(focusState2.isFocused()));
                return unit;
        }
    }
}
