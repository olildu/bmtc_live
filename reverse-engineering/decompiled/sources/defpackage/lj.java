package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.theme.ChaloTheme;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.maps.android.compose.streetview.StreetViewCameraPositionState;
import com.google.maps.android.compose.streetview.StreetViewPanoramaApplier;
import com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners;
import com.google.maps.android.compose.streetview.StreetViewPanoramaPropertiesNode;
import com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18318a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lj(State state, State state2, State state3, State state4, State state5, State state6) {
        this.b = state;
        this.c = state2;
        this.d = state3;
        this.e = state4;
        this.f = state5;
        this.g = state6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ComposeUiNode.Companion companion;
        int i2;
        int i3 = this.f18318a;
        Unit unit = Unit.f17538a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (i3) {
            case 0:
                String str = (String) obj8;
                String str2 = (String) obj7;
                String str3 = (String) obj6;
                Function0 function0 = (Function0) obj4;
                Function0 function1 = (Function0) obj3;
                String str4 = (String) obj5;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-799593739, iIntValue, -1, "app.chalo.compose.components.dialogs.ChaloConfirmationDialog.<anonymous> (ChaloConfirmationDialog.kt:123)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Color.INSTANCE.m4642getWhite0d7_KjU(), null, 2, null), ChaloTheme.b(composer, 6).i, ChaloTheme.b(composer, 6).i, ChaloTheme.b(composer, 6).h, ChaloTheme.b(composer, 6).h);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM787paddingqDBjuR0);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                    pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (str == null) {
                        composer.startReplaceGroup(-1462949561);
                        composer.endReplaceGroup();
                        i = 6;
                        companion = companion4;
                    } else {
                        composer.startReplaceGroup(-1462949560);
                        i = 6;
                        companion = companion4;
                        TextKt.m2623TextNvy7gAk(str, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composer, 6).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer, 6).getHeadlineMedium(), composer, 48, 0, 131064);
                        gf.r(companion2, ChaloTheme.b(composer, 6).h, composer, 0);
                    }
                    if (str2 == null) {
                        composer = composer;
                        composer.startReplaceGroup(-1462583575);
                        composer.endReplaceGroup();
                        i2 = 0;
                    } else {
                        composer = composer;
                        composer.startReplaceGroup(-1462583574);
                        TextKt.m2623TextNvy7gAk(str2, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composer, i).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer, i).getBodyMedium(), composer, 48, 0, 131064);
                        i2 = 0;
                        gf.r(companion2, ChaloTheme.b(composer, i).h, composer, 0);
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion3.getTop(), composer, i);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, i2);
                    int i5 = (int) ((currentCompositeKeyHashCode2 >>> 32) ^ currentCompositeKeyHashCode2);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
                    pk0.v(companion, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (str3 == null || function0 == null) {
                        composer.startReplaceGroup(-1944220825);
                    } else {
                        composer.startReplaceGroup(-1938273568);
                        TextKt.m2623TextNvy7gAk(str3, PaddingKt.m785paddingVpY3zN4(ClickableKt.m295clickableO2vRcR0$default(companion2, RippleEffectKt.b(composer), RippleEffectKt.a(composer), false, null, null, function0, 28, null), ChaloTheme.b(composer, i).f, ChaloTheme.b(composer, i).e), ChaloTheme.a(composer, i).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer, i).getHeadlineMedium(), composer, 0, 0, 131064);
                    }
                    composer.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composer, i).i), composer, 0);
                    Composer composer2 = composer;
                    TextKt.m2623TextNvy7gAk(str4, PaddingKt.m785paddingVpY3zN4(ClickableKt.m295clickableO2vRcR0$default(companion2, RippleEffectKt.b(composer), RippleEffectKt.a(composer), false, null, null, function1, 28, null), ChaloTheme.b(composer, i).f, ChaloTheme.b(composer, i).e), ChaloTheme.a(composer, i).f1915a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer, i).getHeadlineMedium(), composer2, 0, 0, 131064);
                    if (r1.k(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                State state = (State) obj8;
                State state2 = (State) obj7;
                State state3 = (State) obj6;
                State state4 = (State) obj5;
                State state5 = (State) obj4;
                State state6 = (State) obj3;
                Composer composer3 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!composer3.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1039809540, iIntValue2, -1, "com.google.maps.android.compose.streetview.StreetView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (StreetView.kt:101)");
                    }
                    final StreetViewCameraPositionState streetViewCameraPositionState = (StreetViewCameraPositionState) state.getValue();
                    Boolean bool = (Boolean) state2.getValue();
                    final boolean zBooleanValue = bool.booleanValue();
                    Boolean bool2 = (Boolean) state3.getValue();
                    final boolean zBooleanValue2 = bool2.booleanValue();
                    Boolean bool3 = (Boolean) state4.getValue();
                    final boolean zBooleanValue3 = bool3.booleanValue();
                    Boolean bool4 = (Boolean) state5.getValue();
                    final boolean zBooleanValue4 = bool4.booleanValue();
                    final StreetViewPanoramaEventListeners streetViewPanoramaEventListeners = (StreetViewPanoramaEventListeners) state6.getValue();
                    Applier<?> applier = composer3.getApplier();
                    Intrinsics.g(applier, "null cannot be cast to non-null type com.google.maps.android.compose.streetview.StreetViewPanoramaApplier");
                    final StreetViewPanorama streetViewPanorama = ((StreetViewPanoramaApplier) applier).f14663a;
                    boolean zChangedInstance = composer3.changedInstance(streetViewCameraPositionState) | composer3.changedInstance(streetViewPanorama) | composer3.changed(streetViewPanoramaEventListeners);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0<StreetViewPanoramaPropertiesNode>() { // from class: com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return new StreetViewPanoramaPropertiesNode(streetViewCameraPositionState, streetViewPanorama, streetViewPanoramaEventListeners);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function2 = (Function0) objRememberedValue;
                    if (!(composer3.getApplier() instanceof StreetViewPanoramaApplier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(function2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, bool, new Function2<StreetViewPanoramaPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            StreetViewPanoramaPropertiesNode set = (StreetViewPanoramaPropertiesNode) obj9;
                            ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            set.b.setPanningGesturesEnabled(zBooleanValue);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl3, bool2, new Function2<StreetViewPanoramaPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            StreetViewPanoramaPropertiesNode set = (StreetViewPanoramaPropertiesNode) obj9;
                            ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            set.b.setStreetNamesEnabled(zBooleanValue2);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl3, bool3, new Function2<StreetViewPanoramaPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            StreetViewPanoramaPropertiesNode set = (StreetViewPanoramaPropertiesNode) obj9;
                            ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            set.b.setUserNavigationEnabled(zBooleanValue3);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl3, bool4, new Function2<StreetViewPanoramaPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.streetview.StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            StreetViewPanoramaPropertiesNode set = (StreetViewPanoramaPropertiesNode) obj9;
                            ((Boolean) obj10).booleanValue();
                            Intrinsics.i(set, "$this$set");
                            set.b.setZoomGesturesEnabled(zBooleanValue4);
                            return Unit.f17538a;
                        }
                    });
                    Updater.m3923setimpl(composerM3915constructorimpl3, streetViewPanoramaEventListeners, StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5.f14671a);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ lj(String str, String str2, String str3, String str4, Function0 function0, Function0 function1) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = function0;
        this.g = function1;
        this.e = str4;
    }
}
