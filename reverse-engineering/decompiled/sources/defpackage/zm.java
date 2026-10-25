package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.ChaloLocationHeaderItemKt;
import app.chalo.compose.LocalBackHandlerKt;
import app.chalo.compose.components.ChaloGradientBackgroundKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.homescreen.data.model.app.BgHighlightType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIStateKt;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20211a = 1;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zm(Modifier modifier, String str, boolean z, Function0 function0, Function0 function1) {
        this.e = modifier;
        this.b = str;
        this.c = z;
        this.d = function0;
        this.f = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier modifierB;
        int i = this.f20211a;
        Unit unit = Unit.f17538a;
        boolean z = this.c;
        Serializable serializable = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj5;
                ImageUISize imageUISize = (ImageUISize) obj4;
                IconType iconType = (IconType) obj3;
                String str = (String) serializable;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1682214575, iIntValue, -1, "app.chalo.compose.ChaloToolBar.<anonymous>.<anonymous>.<anonymous> (ChaloToolBar.kt:183)");
                    }
                    Function0 function1 = (Function0) composer.consume(LocalBackHandlerKt.f1812a);
                    if (z) {
                        composer.startReplaceGroup(1176132173);
                        boolean zChanged = composer.changed(function0) | composer.changed(function1);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new tm(function0, function1, 0);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(2130795478, true, new h3(10, iconType, str), composer, 54), composer, 1572864, 62);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1176887426);
                        if (imageUISize == null || (modifierB = ImageUIStateKt.b(Modifier.INSTANCE, imageUISize)) == null) {
                            modifierB = Modifier.INSTANCE;
                        }
                        Modifier modifier = modifierB;
                        MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer);
                        boolean zChanged2 = composer.changed(function0) | composer.changed(function1);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new tm(function0, function1, 1);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifier, mutableInteractionSourceB, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                        int i2 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM295clickableO2vRcR0$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(iconType, composer, 0), str, PaddingKt.m784padding3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composer, 6).d), Color.INSTANCE.m4641getUnspecified0d7_KjU(), composer, Painter.$stable, 0);
                        composer.endNode();
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 1:
                Modifier modifier2 = (Modifier) obj4;
                String str2 = (String) serializable;
                Function0 function2 = (Function0) obj5;
                Function0 function3 = (Function0) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1017994011, iIntValue2, -1, "app.chalo.compose.CityLocationConfigFetchErrorScreen.<anonymous> (CityLocationConfigFetchErrorScreen.kt:42)");
                    }
                    Object objRememberedValue3 = composer2.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion2.getEmpty()) {
                        objRememberedValue3 = gf.b(0, null, 2, null, composer2);
                    }
                    MutableState mutableState = (MutableState) objRememberedValue3;
                    Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion4, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
                    boolean zChanged3 = composer2.changed(density);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue4 == companion2.getEmpty()) {
                        objRememberedValue4 = new f0(density, mutableState, 9);
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxSize$default2, (Function1) objRememberedValue4);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierOnGloballyPositioned);
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion4, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i4), composerM3915constructorimpl3));
                    ChaloGradientBackgroundKt.a(boxScopeInstance2, BgHighlightType.QUADRANT, ((Dp) mutableState.getValue()).m7292unboximpl(), null, composer2, 54, 4);
                    if (str2 == null || z) {
                        composer2.startReplaceGroup(-90310871);
                    } else {
                        composer2.startReplaceGroup(-87937387);
                        Modifier modifierAlign = boxScopeInstance2.align(PaddingKt.m784padding3ABfNKs(companion5, ChaloTheme.b(composer2, 6).h), companion3.getTopEnd());
                        boolean zChanged4 = composer2.changed(function2);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChanged4 || objRememberedValue5 == companion2.getEmpty()) {
                            objRememberedValue5 = new fk(function2, 12);
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        ChaloLocationHeaderItemKt.a(0, 0, composer2, modifierAlign, str2, (Function0) objRememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, r15);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion3.getCenterHorizontally(), composer2, 54);
                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i5 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default3);
                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion4, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i5), composerM3915constructorimpl4));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_DAILY_LIMIT, composer2, 6), "", SizeKt.m828size3ABfNKs(companion5, ChaloTheme.b(composer2, 6).v), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, Painter.$stable | 48, 120);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.SOMETHING_WENT_WRONG_PLEASE_TRY_AGAIN_IN_SOME_TIME, new Object[0], composer2, 6), SizeKt.fillMaxWidth(PaddingKt.m784padding3ABfNKs(companion5, ChaloTheme.b(composer2, 6).h), 0.7f), 0L, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 6).getBodySmall(), composer2, 0, 0, 130044);
                    String strC = StringResourcesHelperKt.c(StringEnum.TRY_AGAIN, new Object[0], composer2, 6);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m784padding3ABfNKs(companion5, ChaloTheme.b(composer2, 6).h), 0.0f, 1, 0);
                    boolean zChanged5 = composer2.changed(function3);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChanged5 || objRememberedValue6 == companion2.getEmpty()) {
                        objRememberedValue6 = new fk(function3, 13);
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue6, composer2, 0, TypedValues.PositionType.TYPE_CURVE_FIT);
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            default:
                return TextFieldSelectionState.detectSelectionHandleDragGestures$lambda$3((Ref.LongRef) obj5, (TextFieldSelectionState) obj4, (Handle) obj3, (Ref.LongRef) serializable, this.c, (PointerInputChange) obj, (Offset) obj2);
        }
    }

    public /* synthetic */ zm(Ref.LongRef longRef, TextFieldSelectionState textFieldSelectionState, Handle handle, Ref.LongRef longRef2, boolean z) {
        this.d = longRef;
        this.e = textFieldSelectionState;
        this.f = handle;
        this.b = longRef2;
        this.c = z;
    }

    public /* synthetic */ zm(boolean z, Function0 function0, ImageUISize imageUISize, IconType iconType, String str) {
        this.c = z;
        this.d = function0;
        this.e = imageUISize;
        this.f = iconType;
        this.b = str;
    }
}
