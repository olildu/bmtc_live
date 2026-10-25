package app.chalo.onboarding.splash.ui;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntSize;
import app.chalo.compose.components.ChaloCircularProgressIndicatorKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.onboarding.splash.SplashScreenComponent;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.a31;
import defpackage.cb;
import defpackage.g41;
import defpackage.pk0;
import defpackage.rw0;
import defpackage.sa1;
import defpackage.v21;
import defpackage.wa1;
import defpackage.wl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005¨\u0006\r²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/onboarding/splash/ui/SplashScreenViewState;", "viewState", "Landroidx/compose/ui/geometry/Offset;", "arrowCenter", "Landroidx/compose/ui/unit/IntSize;", "arrowSize", "logoWithoutArrowPosition", "logoWithoutArrowSize", "", "readyToAnimate", "arrowPosition", "boxPosition", "boxSize", "onboarding_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SplashScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6695a;

        static {
            int[] iArr = new int[IconType.values().length];
            try {
                iArr[IconType.KSRTC_LOGO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6695a = iArr;
        }
    }

    public static final void a(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1527273630);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1527273630, i, -1, "app.chalo.onboarding.splash.ui.FullScreenBlank (SplashScreen.kt:82)");
            }
            BoxKt.Box(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 18));
        }
    }

    public static final void b(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1507849615);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1507849615, i, -1, "app.chalo.onboarding.splash.ui.FullScreenLoader (SplashScreen.kt:75)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ChaloCircularProgressIndicatorKt.b(null, 0.0f, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 17));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(Function1 onAnimationComplete, Composer composer, int i) {
        int i2;
        Composer composer2;
        Animatable animatable;
        Object splashScreenKt$GenericSplashAnimation$1$1;
        Intrinsics.i(onAnimationComplete, "onAnimationComplete");
        Composer composerStartRestartGroup = composer.startRestartGroup(1761685035);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onAnimationComplete) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1761685035, i2, -1, "app.chalo.onboarding.splash.ui.GenericSplashAnimation (SplashScreen.kt:104)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Animatable animatable2 = (Animatable) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = AnimatableKt.Animatable$default(300.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Animatable animatable3 = (Animatable) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Animatable animatable4 = (Animatable) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Animatable animatable5 = (Animatable) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4354boximpl(Offset.INSTANCE.m4381getZeroF1C5BW0()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState = (MutableState) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m7437boximpl(IntSize.INSTANCE.m7450getZeroYbymL2g()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4354boximpl(Offset.INSTANCE.m4381getZeroF1C5BW0()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m7437boximpl(IntSize.INSTANCE.m7450getZeroYbymL2g()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue9;
            boolean zChanged = composerStartRestartGroup.changed(((Boolean) mutableState5.getValue()).booleanValue());
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue10 == companion.getEmpty()) {
                if (((Boolean) mutableState5.getValue()).booleanValue()) {
                    float fM7449unboximpl = (((int) (((IntSize) mutableState4.getValue()).m7449unboximpl() & BodyPartID.bodyIdMax)) / 1.2f) / ((int) (((IntSize) mutableState2.getValue()).m7449unboximpl() & BodyPartID.bodyIdMax));
                    objRememberedValue10 = new SplashScreenKt$GenericSplashAnimation$targetValues$1$1(fM7449unboximpl, ((Float.intBitsToFloat((int) (((Offset) mutableState3.getValue()).m4375unboximpl() >> 32)) + ((int) (((IntSize) mutableState4.getValue()).m7449unboximpl() >> 32))) - ((((int) (((IntSize) mutableState2.getValue()).m7449unboximpl() >> 32)) / 5.0f) * fM7449unboximpl)) - Float.intBitsToFloat((int) (((Offset) mutableState.getValue()).m4375unboximpl() >> 32)), (((((int) (((IntSize) mutableState2.getValue()).m7449unboximpl() & BodyPartID.bodyIdMax)) / 5.5f) * fM7449unboximpl) + (Float.intBitsToFloat((int) (((Offset) mutableState3.getValue()).m4375unboximpl() & BodyPartID.bodyIdMax)) - 300.0f)) - Float.intBitsToFloat((int) (((Offset) mutableState.getValue()).m4375unboximpl() & BodyPartID.bodyIdMax)));
                } else {
                    objRememberedValue10 = null;
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            SplashScreenKt$GenericSplashAnimation$targetValues$1$1 splashScreenKt$GenericSplashAnimation$targetValues$1$1 = (SplashScreenKt$GenericSplashAnimation$targetValues$1$1) objRememberedValue10;
            Boolean bool = (Boolean) mutableState5.getValue();
            bool.getClass();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable4) | composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changedInstance(animatable3) | composerStartRestartGroup.changedInstance(animatable5) | composerStartRestartGroup.changedInstance(onAnimationComplete);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue11 == companion.getEmpty()) {
                animatable = animatable3;
                splashScreenKt$GenericSplashAnimation$1$1 = new SplashScreenKt$GenericSplashAnimation$1$1(animatable4, onAnimationComplete, mutableState5, animatable2, animatable, animatable5, null);
                composerStartRestartGroup.updateRememberedValue(splashScreenKt$GenericSplashAnimation$1$1);
            } else {
                animatable = animatable3;
                splashScreenKt$GenericSplashAnimation$1$1 = objRememberedValue11;
            }
            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) splashScreenKt$GenericSplashAnimation$1$1, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Painter painterA = PainterResourceHelperKt.a(IconType.CHALO_LOGO_WITHOUT_ARROW, composerStartRestartGroup, 6);
            Modifier modifierM830sizeVpY3zN4 = SizeKt.m830sizeVpY3zN4(companion2, ChaloTheme.b(composerStartRestartGroup, 0).i0, ChaloTheme.b(composerStartRestartGroup, 0).q);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changedInstance(animatable);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = new g41(12, animatable2, animatable);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM830sizeVpY3zN4, (Function1) objRememberedValue12);
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == companion.getEmpty()) {
                wa1 wa1Var = new wa1(mutableState3, mutableState4, mutableState, mutableState5, 1);
                mutableState3 = mutableState3;
                mutableState = mutableState;
                objRememberedValue13 = wa1Var;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierGraphicsLayer, (Function1) objRememberedValue13);
            int i4 = Painter.$stable | 48;
            ImageKt.Image(painterA, "Chalo Logo", modifierOnGloballyPositioned, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i4, 120);
            Painter painterA2 = PainterResourceHelperKt.a(IconType.IC_SPLASH_ARROW, composerStartRestartGroup, 6);
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h0), 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).W, 7, null);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(animatable5) | composerStartRestartGroup.changedInstance(animatable4) | composerStartRestartGroup.changed(splashScreenKt$GenericSplashAnimation$targetValues$1$1);
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = new rw0(12, animatable5, animatable4, splashScreenKt$GenericSplashAnimation$targetValues$1$1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifierM788paddingqDBjuR0$default, (Function1) objRememberedValue14);
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue15 == companion.getEmpty()) {
                objRememberedValue15 = new wa1(mutableState, mutableState2, mutableState3, mutableState5, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
            }
            composer2 = composerStartRestartGroup;
            ImageKt.Image(painterA2, "Splash Arrow", OnGloballyPositionedModifierKt.onGloballyPositioned(modifierGraphicsLayer2, (Function1) objRememberedValue15), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, i4, 120);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cb(i, 8, onAnimationComplete));
        }
    }

    public static final void d(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(178512634);
        if (composerStartRestartGroup.shouldExecute(i != 0, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(178512634, i, -1, "app.chalo.onboarding.splash.ui.InitialSplashAnimation (SplashScreen.kt:91)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_SPLASH_ARROW, composerStartRestartGroup, 6), "Splash Arrow", PaddingKt.m788paddingqDBjuR0$default(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h0), 0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).W, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wl(i, 19));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    public static final void e(IconType iconType, Function1 onAnimationComplete, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifierM830sizeVpY3zN4;
        Animatable animatable;
        Object splashScreenKt$KSRTCSplashAnimation$1$1;
        Animatable animatable2;
        MutableState mutableState;
        ?? r0;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        Intrinsics.i(onAnimationComplete, "onAnimationComplete");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1756034500);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(iconType.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onAnimationComplete) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1756034500, i2, -1, "app.chalo.onboarding.splash.ui.KSRTCSplashAnimation (SplashScreen.kt:216)");
            }
            if (WhenMappings.f6695a[iconType.ordinal()] == 1) {
                composerStartRestartGroup.startReplaceGroup(372998783);
                modifierM830sizeVpY3zN4 = SizeKt.m830sizeVpY3zN4(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).f0, ChaloTheme.b(composerStartRestartGroup, 0).g0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(373003396);
                composerStartRestartGroup.endReplaceGroup();
                modifierM830sizeVpY3zN4 = Modifier.INSTANCE;
            }
            Modifier modifier = modifierM830sizeVpY3zN4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Animatable animatable3 = (Animatable) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Animatable animatable4 = (Animatable) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Animatable animatable5 = (Animatable) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Animatable animatable6 = (Animatable) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Animatable animatable7 = (Animatable) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4354boximpl(Offset.INSTANCE.m4381getZeroF1C5BW0()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m7437boximpl(IntSize.INSTANCE.m7450getZeroYbymL2g()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4354boximpl(Offset.INSTANCE.m4381getZeroF1C5BW0()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState7 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m7437boximpl(IntSize.INSTANCE.m7450getZeroYbymL2g()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            MutableState mutableState8 = (MutableState) objRememberedValue9;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            MutableState mutableState9 = (MutableState) objRememberedValue10;
            Boolean bool = (Boolean) mutableState9.getValue();
            bool.booleanValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable5) | composerStartRestartGroup.changedInstance(animatable6) | composerStartRestartGroup.changedInstance(animatable3) | composerStartRestartGroup.changedInstance(animatable4) | composerStartRestartGroup.changedInstance(animatable7) | composerStartRestartGroup.changedInstance(onAnimationComplete);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue11 == companion.getEmpty()) {
                animatable = animatable5;
                animatable2 = animatable6;
                mutableState = mutableState7;
                r0 = 0;
                splashScreenKt$KSRTCSplashAnimation$1$1 = new SplashScreenKt$KSRTCSplashAnimation$1$1(onAnimationComplete, mutableState9, mutableState, mutableState8, mutableState6, mutableState5, animatable, animatable2, animatable3, animatable4, animatable7, null);
                mutableState2 = mutableState8;
                mutableState3 = mutableState6;
                composerStartRestartGroup.updateRememberedValue(splashScreenKt$KSRTCSplashAnimation$1$1);
            } else {
                animatable2 = animatable6;
                mutableState = mutableState7;
                r0 = 0;
                mutableState3 = mutableState6;
                mutableState2 = mutableState8;
                animatable = animatable5;
                splashScreenKt$KSRTCSplashAnimation$1$1 = objRememberedValue11;
            }
            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) splashScreenKt$KSRTCSplashAnimation$1$1, composerStartRestartGroup, (int) r0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = new wa1(mutableState, mutableState2, mutableState5, mutableState9, 3);
                mutableState4 = mutableState5;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            } else {
                mutableState4 = mutableState5;
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxSize$default, (Function1) objRememberedValue12);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), r0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierAlpha = AlphaKt.alpha(companion2, ((Number) animatable7.getValue()).floatValue());
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Painter painterA = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, i2 & 14);
            int i5 = Painter.$stable | 48;
            Animatable animatable8 = animatable;
            Animatable animatable9 = animatable2;
            MutableState mutableState10 = mutableState4;
            ImageKt.Image(painterA, "Partner Logo", modifier, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i5, 120);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i6), composerM3915constructorimpl3));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.FADED_DIVIDER_WITH_DIAMOND_RIGHT, composerStartRestartGroup, 6), (String) null, SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).z), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i5, 120);
            ChaloSpacersKt.w(composerStartRestartGroup, 0);
            ImageKt.Image(PainterResourceHelperKt.a(IconType.FADED_DIVIDER_WITH_DIAMOND_LEFT, composerStartRestartGroup, 6), (String) null, SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).z), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i5, 120);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.f(composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.COLLABORATION_WITH, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResourceHelperKt.a(IconType.CHALO_LOGO_HOME, composerStartRestartGroup, 6), "Chalo Logo", SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, i5, 120);
            composer2.endNode();
            Painter painterA2 = PainterResourceHelperKt.a(IconType.IC_SPLASH_ARROW, composer2, 6);
            Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m788paddingqDBjuR0$default(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composer2, 0).h0), 0.0f, 0.0f, 0.0f, ChaloTheme.b(composer2, 0).h, 7, null), companion3.getCenter());
            boolean zChangedInstance2 = composer2.changedInstance(animatable8) | composer2.changedInstance(animatable9) | composer2.changedInstance(animatable3) | composer2.changedInstance(animatable4);
            Object objRememberedValue13 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue13 == companion.getEmpty()) {
                objRememberedValue13 = new v21(animatable8, animatable9, animatable3, animatable4, 2);
                composer2.updateRememberedValue(objRememberedValue13);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierAlign, (Function1) objRememberedValue13);
            Object objRememberedValue14 = composer2.rememberedValue();
            if (objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = new wa1(mutableState10, mutableState3, mutableState2, mutableState9, 0);
                composer2.updateRememberedValue(objRememberedValue14);
            }
            ImageKt.Image(painterA2, "Splash Arrow", OnGloballyPositionedModifierKt.onGloballyPositioned(modifierGraphicsLayer, (Function1) objRememberedValue14), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, i5, 120);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new sa1(iconType, onAnimationComplete, i, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(SplashScreenComponent splashScreenComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1499578424);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(splashScreenComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1499578424, i2, -1, "app.chalo.onboarding.splash.ui.SplashScreen (SplashScreen.kt:47)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(splashScreenComponent.t0(), composerStartRestartGroup);
            Boolean bool = ((SplashScreenViewState) mutableStateA.getValue()).c;
            if (bool == null) {
                composerStartRestartGroup.startReplaceGroup(1986166807);
                a(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (bool.equals(Boolean.TRUE)) {
                composerStartRestartGroup.startReplaceGroup(1986356992);
                b(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!bool.equals(Boolean.FALSE)) {
                    throw pk0.p(composerStartRestartGroup, -2014141123);
                }
                composerStartRestartGroup.startReplaceGroup(1986433314);
                IconType iconType = ((SplashScreenViewState) mutableStateA.getValue()).b;
                boolean zChanged = composerStartRestartGroup.changed(iconType != null ? iconType.ordinal() : -1);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = ((SplashScreenViewState) mutableStateA.getValue()).b;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                IconType iconType2 = (IconType) objRememberedValue;
                if (!((SplashScreenViewState) mutableStateA.getValue()).f6696a) {
                    composerStartRestartGroup.startReplaceGroup(-2014125648);
                    d(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (iconType2 == null) {
                    composerStartRestartGroup.startReplaceGroup(-2014123605);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(splashScreenComponent);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new SplashScreenKt$SplashScreen$1$1(splashScreenComponent, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    c((Function1) objRememberedValue2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1986788140);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(splashScreenComponent);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new SplashScreenKt$SplashScreen$2$1(splashScreenComponent, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    e(iconType2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a31(splashScreenComponent, i, 26));
        }
    }
}
