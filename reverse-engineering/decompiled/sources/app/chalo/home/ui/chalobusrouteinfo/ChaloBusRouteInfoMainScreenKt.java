package app.chalo.home.ui.chalobusrouteinfo;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.image.GifUIKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.components.text.TitleSubtitleViewKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.b0;
import defpackage.b3;
import defpackage.c6;
import defpackage.dh;
import defpackage.dq;
import defpackage.e0;
import defpackage.eh;
import defpackage.f;
import defpackage.i4;
import defpackage.i41;
import defpackage.j5;
import defpackage.n4;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r1;
import defpackage.s4;
import defpackage.u1;
import defpackage.u6;
import defpackage.ud;
import defpackage.ya;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0007²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewState;", "viewState", "", "selectedHour", "selectedMinute", "", "selectedAmOrPm", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusRouteInfoMainScreenKt {
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x0133  */
    /* JADX WARN: Code duplicated, block: B:75:0x013f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0143  */
    /* JADX WARN: Code duplicated, block: B:79:0x019e  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void a(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ButtonUIState buttonUIState, ClickableTextUiState clickableTextUiState, Composer composer, int i, int i2) {
        ImageUIState imageUIState2;
        int i3;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        ButtonUIState buttonUIState2;
        int i4;
        ClickableTextUiState clickableTextUiState2;
        int i5;
        boolean z;
        ButtonUIState buttonUIState3;
        ClickableTextUiState clickableTextUiState3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier.Companion companion;
        ButtonUIState buttonUIState4;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> constructor2;
        ClickableTextUiState clickableTextUiState4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2060742940);
        if ((i & 6) == 0) {
            imageUIState2 = imageUIState;
            i3 = (composerStartRestartGroup.changed(imageUIState2) ? 4 : 2) | i;
        } else {
            imageUIState2 = imageUIState;
            i3 = i;
        }
        if ((i & 48) == 0) {
            chaloTextUIState3 = chaloTextUIState;
            i3 |= composerStartRestartGroup.changed(chaloTextUIState3) ? 32 : 16;
        } else {
            chaloTextUIState3 = chaloTextUIState;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(chaloTextUIState2) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                buttonUIState2 = buttonUIState;
                i3 |= composerStartRestartGroup.changed(buttonUIState2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    clickableTextUiState2 = clickableTextUiState;
                    if (composerStartRestartGroup.changed(clickableTextUiState2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    if (i6 != 0) {
                        buttonUIState2 = null;
                    }
                    if (i4 != 0) {
                        clickableTextUiState2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2060742940, i3, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoCenteredState (ChaloBusRouteInfoMainScreen.kt:282)");
                    }
                    companion = Modifier.INSTANCE;
                    Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).i, 0.0f, 2, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    buttonUIState4 = buttonUIState2;
                    int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
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
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                    constructor2 = companion3.getConstructor();
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
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    clickableTextUiState4 = clickableTextUiState2;
                    CommonImageKt.a(imageUIState2, null, false, composerStartRestartGroup, i3 & 14, 6);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).k), composerStartRestartGroup, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    TextKt.c(chaloTextUIState3, null, null, null, composerStartRestartGroup, (i3 >> 3) & 14, 14);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
                    TextKt.c(chaloTextUIState2, null, null, null, composerStartRestartGroup, (i3 >> 6) & 14, 14);
                    if (buttonUIState4 == null) {
                        composerStartRestartGroup.startReplaceGroup(-834786126);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-834786125);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
                        ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), buttonUIState4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (clickableTextUiState4 == null) {
                        composerStartRestartGroup.startReplaceGroup(-834522967);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-834522966);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
                        ChaloFilledButtonKt.d(null, clickableTextUiState4, composerStartRestartGroup, 0, 1);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (r1.k(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    buttonUIState3 = buttonUIState4;
                    clickableTextUiState3 = clickableTextUiState4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    buttonUIState3 = buttonUIState2;
                    clickableTextUiState3 = clickableTextUiState2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new j5(imageUIState, chaloTextUIState, chaloTextUIState2, buttonUIState3, clickableTextUiState3, i, i2, 2));
                }
            }
            i3 |= 24576;
            clickableTextUiState2 = clickableTextUiState;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i6 != 0) {
                    buttonUIState2 = null;
                }
                if (i4 != 0) {
                    clickableTextUiState2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2060742940, i3, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoCenteredState (ChaloBusRouteInfoMainScreen.kt:282)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM786paddingVpY3zN4$default2 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).i, 0.0f, 2, null);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                buttonUIState4 = buttonUIState2;
                int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default2);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                constructor = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion5, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i9), composerM3915constructorimpl3));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion4.getCenterHorizontally(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                constructor2 = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion5, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i10), composerM3915constructorimpl4));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                clickableTextUiState4 = clickableTextUiState2;
                CommonImageKt.a(imageUIState2, null, false, composerStartRestartGroup, i3 & 14, 6);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).k), composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                TextKt.c(chaloTextUIState3, null, null, null, composerStartRestartGroup, (i3 >> 3) & 14, 14);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
                TextKt.c(chaloTextUIState2, null, null, null, composerStartRestartGroup, (i3 >> 6) & 14, 14);
                if (buttonUIState4 == null) {
                    composerStartRestartGroup.startReplaceGroup(-834786126);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-834786125);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
                    ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), buttonUIState4);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (clickableTextUiState4 == null) {
                    composerStartRestartGroup.startReplaceGroup(-834522967);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-834522966);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
                    ChaloFilledButtonKt.d(null, clickableTextUiState4, composerStartRestartGroup, 0, 1);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (r1.k(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                buttonUIState3 = buttonUIState4;
                clickableTextUiState3 = clickableTextUiState4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                buttonUIState3 = buttonUIState2;
                clickableTextUiState3 = clickableTextUiState2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new j5(imageUIState, chaloTextUIState, chaloTextUIState2, buttonUIState3, clickableTextUiState3, i, i2, 2));
            }
        }
        i3 |= 3072;
        buttonUIState2 = buttonUIState;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                clickableTextUiState2 = clickableTextUiState;
                if (composerStartRestartGroup.changed(clickableTextUiState2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i6 != 0) {
                    buttonUIState2 = null;
                }
                if (i4 != 0) {
                    clickableTextUiState2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2060742940, i3, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoCenteredState (ChaloBusRouteInfoMainScreen.kt:282)");
                }
                companion = Modifier.INSTANCE;
                Modifier modifierM786paddingVpY3zN4$default3 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).i, 0.0f, 2, null);
                Alignment.Companion companion6 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getCenter(), false);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                buttonUIState4 = buttonUIState2;
                int i11 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default3);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                constructor = companion7.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion7, composerM3915constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
                Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl5, Integer.valueOf(i11), composerM3915constructorimpl5));
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion6.getCenterHorizontally(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i12 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                constructor2 = companion7.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion7, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl6, currentCompositionLocalMap6);
                Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl6, Integer.valueOf(i12), composerM3915constructorimpl6));
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                clickableTextUiState4 = clickableTextUiState2;
                CommonImageKt.a(imageUIState2, null, false, composerStartRestartGroup, i3 & 14, 6);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).k), composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                TextKt.c(chaloTextUIState3, null, null, null, composerStartRestartGroup, (i3 >> 3) & 14, 14);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
                TextKt.c(chaloTextUIState2, null, null, null, composerStartRestartGroup, (i3 >> 6) & 14, 14);
                if (buttonUIState4 == null) {
                    composerStartRestartGroup.startReplaceGroup(-834786126);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-834786125);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
                    ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), buttonUIState4);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (clickableTextUiState4 == null) {
                    composerStartRestartGroup.startReplaceGroup(-834522967);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-834522966);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
                    ChaloFilledButtonKt.d(null, clickableTextUiState4, composerStartRestartGroup, 0, 1);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (r1.k(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                buttonUIState3 = buttonUIState4;
                clickableTextUiState3 = clickableTextUiState4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                buttonUIState3 = buttonUIState2;
                clickableTextUiState3 = clickableTextUiState2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new j5(imageUIState, chaloTextUIState, chaloTextUIState2, buttonUIState3, clickableTextUiState3, i, i2, 2));
            }
        }
        i3 |= 24576;
        clickableTextUiState2 = clickableTextUiState;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i6 != 0) {
                buttonUIState2 = null;
            }
            if (i4 != 0) {
                clickableTextUiState2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2060742940, i3, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoCenteredState (ChaloBusRouteInfoMainScreen.kt:282)");
            }
            companion = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default4 = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).i, 0.0f, 2, null);
            Alignment.Companion companion8 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion8.getCenter(), false);
            long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            buttonUIState4 = buttonUIState2;
            int i13 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default4);
            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
            constructor = companion9.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion9, composerM3915constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3915constructorimpl7, currentCompositionLocalMap7);
            Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl7, Integer.valueOf(i13), composerM3915constructorimpl7));
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion8.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i14 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            constructor2 = companion9.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion9, composerM3915constructorimpl8, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl8, currentCompositionLocalMap8);
            Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl8, Integer.valueOf(i14), composerM3915constructorimpl8));
            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
            clickableTextUiState4 = clickableTextUiState2;
            CommonImageKt.a(imageUIState2, null, false, composerStartRestartGroup, i3 & 14, 6);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).k), composerStartRestartGroup, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            TextKt.c(chaloTextUIState3, null, null, null, composerStartRestartGroup, (i3 >> 3) & 14, 14);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            TextKt.c(chaloTextUIState2, null, null, null, composerStartRestartGroup, (i3 >> 6) & 14, 14);
            if (buttonUIState4 == null) {
                composerStartRestartGroup.startReplaceGroup(-834786126);
            } else {
                composerStartRestartGroup.startReplaceGroup(-834786125);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
                ChaloFilledButtonKt.a(6, 0, composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), buttonUIState4);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (clickableTextUiState4 == null) {
                composerStartRestartGroup.startReplaceGroup(-834522967);
            } else {
                composerStartRestartGroup.startReplaceGroup(-834522966);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
                ChaloFilledButtonKt.d(null, clickableTextUiState4, composerStartRestartGroup, 0, 1);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            buttonUIState3 = buttonUIState4;
            clickableTextUiState3 = clickableTextUiState4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            buttonUIState3 = buttonUIState2;
            clickableTextUiState3 = clickableTextUiState2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new j5(imageUIState, chaloTextUIState, chaloTextUIState2, buttonUIState3, clickableTextUiState3, i, i2, 2));
        }
    }

    public static final void b(List list, List list2, List list3, ChaloBusRouteSuggestionCardUiState chaloBusRouteSuggestionCardUiState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2052321550);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(chaloBusRouteSuggestionCardUiState) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2052321550, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoContent (ChaloBusRouteInfoMainScreen.kt:209)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            f(list, list2, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            Modifier modifierA = dq.a(columnScopeInstance, companion, 1.0f, false, 2, null);
            PaddingValues paddingValuesM781PaddingValuesa9UjIt4$default = PaddingKt.m781PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).h, 7, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list3) | composerStartRestartGroup.changedInstance(chaloBusRouteSuggestionCardUiState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new f(23, list3, chaloBusRouteSuggestionCardUiState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierA, null, paddingValuesM781PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, TypedValues.PositionType.TYPE_PERCENT_X);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new u6(i, 5, list, list2, list3, chaloBusRouteSuggestionCardUiState));
        }
    }

    /* JADX WARN: Type inference failed for: r14v10, types: [app.chalo.uistate.base.ChaloColorToken, app.chalo.uistate.text.UITextAlign, app.chalo.uistate.text.UITextStyle, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v9 */
    public static final void c(ChaloBusRouteCorridorUIState chaloBusRouteCorridorUIState, Composer composer, int i) {
        ChaloBusRouteCorridorUISpec chaloBusRouteCorridorUISpec;
        ?? r14;
        Composer composerStartRestartGroup = composer.startRestartGroup(338136540);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(chaloBusRouteCorridorUIState) ? 4 : 2) | i : i;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(338136540, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoCorridorItem (ChaloBusRouteInfoMainScreen.kt:383)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, 3, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(chaloBusRouteCorridorUIState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new i4(chaloBusRouteCorridorUIState, 22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null);
            ChaloBusRouteCorridorUISpec chaloBusRouteCorridorUISpec2 = chaloBusRouteCorridorUIState.f3308a;
            List<ChaloBusRouteInfoRouteUIState> list = chaloBusRouteCorridorUIState.g;
            Modifier modifierC = ChaloThemeKt.c(modifierM299clickableoSLSa3U$default, chaloBusRouteCorridorUISpec2.f3307a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierA = i41.a(rowScopeInstance, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
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
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            TextUIState.ChaloTextUIState chaloTextUIState = chaloBusRouteCorridorUIState.b;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(-501203098);
                composerStartRestartGroup.endReplaceGroup();
                chaloBusRouteCorridorUISpec = chaloBusRouteCorridorUISpec2;
                r14 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-501203097);
                chaloBusRouteCorridorUISpec = chaloBusRouteCorridorUISpec2;
                r14 = 0;
                TextKt.c(TextUIState.ChaloTextUIState.a(chaloTextUIState, null, null, null, 8183), null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup.endReplaceGroup();
            }
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r14);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl4, Integer.valueOf(i6), composerM3915constructorimpl4));
            TextKt.c(TextUIState.ChaloTextUIState.a(chaloBusRouteCorridorUIState.c, r14, r14, r14, 8183), rowScopeInstance.weight(companion, 1.0f, false), null, null, composerStartRestartGroup, 0, 12);
            ChaloBusRouteCorridorUISpec chaloBusRouteCorridorUISpec3 = chaloBusRouteCorridorUISpec;
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, chaloBusRouteCorridorUISpec3.b), composerStartRestartGroup, 0);
            CommonImageKt.a(chaloBusRouteCorridorUIState.d, null, false, composerStartRestartGroup, 0, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, chaloBusRouteCorridorUISpec3.b), composerStartRestartGroup, 0);
            TextKt.c(TextUIState.ChaloTextUIState.a(chaloBusRouteCorridorUIState.e, r14, r14, r14, 8183), rowScopeInstance.weight(companion, 1.0f, false), null, null, composerStartRestartGroup, 0, 12);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            CommonImageKt.a(chaloBusRouteCorridorUIState.f, null, false, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(511472560);
            } else {
                composerStartRestartGroup.startReplaceGroup(526822768);
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, r14);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default3);
                Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion3, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
                Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl5, Integer.valueOf(i7), composerM3915constructorimpl5));
                composerStartRestartGroup.startReplaceGroup(-530722235);
                for (ChaloBusRouteInfoRouteUIState chaloBusRouteInfoRouteUIState : list) {
                    UIShape.Rectangle rectangle = UIShape.f1926a;
                    j(chaloBusRouteInfoRouteUIState, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloBusRouteSuggestionCardUiState chaloBusRouteSuggestionCardUiState = chaloBusRouteCorridorUIState.h;
            if (chaloBusRouteSuggestionCardUiState == null) {
                composerStartRestartGroup.startReplaceGroup(527110509);
            } else {
                composerStartRestartGroup.startReplaceGroup(527110510);
                n(chaloBusRouteSuggestionCardUiState, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(chaloBusRouteCorridorUIState, i, 16));
        }
    }

    public static final void d(ChaloBusRouteInfoContentState.Empty empty, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1435886991);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(empty) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1435886991, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoEmptyContent (ChaloBusRouteInfoMainScreen.kt:259)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            f(empty.f3313a, empty.b, composerStartRestartGroup, 0);
            a(empty.c, empty.d, empty.e, null, empty.f, composerStartRestartGroup, 0, 8);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(empty, i, 15));
        }
    }

    public static final void e(List list, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1765278377);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1765278377, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoFilters (ChaloBusRouteInfoMainScreen.kt:357)");
            }
            ChaloBusRouteInfoFilterUIState chaloBusRouteInfoFilterUIState = (ChaloBusRouteInfoFilterUIState) CollectionsKt.H(list);
            ChaloBusRouteInfoFilterUISpec chaloBusRouteInfoFilterUISpec = chaloBusRouteInfoFilterUIState != null ? chaloBusRouteInfoFilterUIState.c : new ChaloBusRouteInfoFilterUISpec(31, null, null);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues paddingValuesE = ChaloThemeKt.e(chaloBusRouteInfoFilterUISpec.b);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM672spacedBy0680j_4 = Arrangement.INSTANCE.m672spacedBy0680j_4(chaloBusRouteInfoFilterUISpec.f3320a);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ud(list, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyRow(modifierFillMaxWidth$default, null, paddingValuesE, false, horizontalOrVerticalM672spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 6, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh(list, i, 1));
        }
    }

    public static final void f(List list, List list2, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1852351650);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1852351650, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoHeaderContent (ChaloBusRouteInfoMainScreen.kt:246)");
            }
            if (list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(1658932768);
            } else {
                composerStartRestartGroup.startReplaceGroup(1668374593);
                l(list, composerStartRestartGroup, i2 & 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (list2.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(1658932768);
            } else {
                composerStartRestartGroup.startReplaceGroup(1668468709);
                e(list2, composerStartRestartGroup, (i2 >> 3) & 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b0(list, list2, i, 16));
        }
    }

    public static final void g(ChaloBusRouteInfoContentState.Loading loading, Composer composer, int i) {
        int i2;
        float f;
        Object obj;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1704306513);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(loading) : composerStartRestartGroup.changedInstance(loading) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 1;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1704306513, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoLoadingContent (ChaloBusRouteInfoMainScreen.kt:512)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f2 = 0.0f;
            Object obj2 = null;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ChaloBusRouteInfoLoadingUISpec chaloBusRouteInfoLoadingUISpec = loading.b;
            ChaloBusRouteInfoShimmerUIState chaloBusRouteInfoShimmerUIState = loading.f3315a;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxSize$default, ChaloColorTokenKt.c(chaloBusRouteInfoLoadingUISpec.b), null, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).n);
            ChaloColorToken chaloColorToken = chaloBusRouteInfoShimmerUIState.b;
            ChaloColorToken chaloColorToken2 = chaloBusRouteInfoShimmerUIState.f3332a;
            ChaloColorToken chaloColorToken3 = chaloBusRouteInfoShimmerUIState.b;
            BoxKt.Box(ShimmerEffectKt.b(BackgroundKt.m264backgroundbw27NRU$default(modifierM814height3ABfNKs, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken3)), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken2)), 4), composerStartRestartGroup, 0);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            BoxKt.Box(ShimmerEffectKt.b(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).k), ChaloColorTokenKt.c(chaloColorToken3), null, 2, null), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken3)), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken2)), 4), composerStartRestartGroup, 0);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-505288830);
            int i6 = 0;
            while (i6 < 4) {
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, f2, i4, obj2), ChaloThemeHelper.a().o0), ChaloThemeHelper.a().h, f2, 2, obj2);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (!(composerStartRestartGroup.getApplier() != null)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                BoxKt.Box(ShimmerEffectKt.b(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).s), ChaloTheme.b(composerStartRestartGroup, 0).j), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).f)), ChaloColorTokenKt.c(chaloColorToken3), null, 2, null), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken3)), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken2)), 4), composerStartRestartGroup, 0);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                ChaloBusRouteInfoShimmerUIState chaloBusRouteInfoShimmerUIState2 = chaloBusRouteInfoShimmerUIState;
                CommonImageKt.a(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, ChaloColorToken.Black.f9759a, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 180.0f, (UiEventHandler) null, 178), null, false, composerStartRestartGroup, 0, 6);
                ChaloSpacersKt.m(composerStartRestartGroup, 0);
                BoxKt.Box(ShimmerEffectKt.b(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).s), ChaloTheme.b(composerStartRestartGroup, 0).j), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).f)), ChaloColorTokenKt.c(chaloColorToken3), null, 2, null), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken3)), Color.m4595boximpl(ChaloColorTokenKt.c(chaloColorToken2)), 4), composerStartRestartGroup, 0);
                SpacerKt.Spacer(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                CommonImageKt.a(chaloBusRouteInfoShimmerUIState2.d, null, false, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup.endNode();
                if (i6 < 4) {
                    composerStartRestartGroup.startReplaceGroup(-176679052);
                    f = 0.0f;
                    obj = null;
                    i3 = 1;
                    DividerUIStateKt.a(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), loading.c, composerStartRestartGroup, 6, 0);
                } else {
                    f = 0.0f;
                    obj = null;
                    i3 = 1;
                    composerStartRestartGroup.startReplaceGroup(-198093449);
                }
                composerStartRestartGroup.endReplaceGroup();
                i6++;
                f2 = f;
                obj2 = obj;
                chaloBusRouteInfoShimmerUIState = chaloBusRouteInfoShimmerUIState2;
                i4 = i3;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(loading, i, 14));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(ChaloBusRouteInfoComponent chaloBusRouteInfoComponent, Composer composer, int i) {
        int i2;
        ChaloBusRouteInfoComponent chaloBusRouteInfoComponent2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-363500216);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chaloBusRouteInfoComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-363500216, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoMainScreen (ChaloBusRouteInfoMainScreen.kt:79)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(chaloBusRouteInfoComponent.t0(), composerStartRestartGroup);
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            k((ChaloBusRouteInfoViewState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            ChaloBusRouteInfoViewState chaloBusRouteInfoViewState = (ChaloBusRouteInfoViewState) mutableStateA.getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(chaloBusRouteInfoComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                chaloBusRouteInfoComponent2 = chaloBusRouteInfoComponent;
                ChaloBusRouteInfoMainScreenKt$ChaloBusRouteInfoMainScreen$1$1 chaloBusRouteInfoMainScreenKt$ChaloBusRouteInfoMainScreen$1$1 = new ChaloBusRouteInfoMainScreenKt$ChaloBusRouteInfoMainScreen$1$1(1, chaloBusRouteInfoComponent2, ChaloBusRouteInfoComponent.class, "processIntent", "processIntent(Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteInfoViewIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(chaloBusRouteInfoMainScreenKt$ChaloBusRouteInfoMainScreen$1$1);
                objRememberedValue = chaloBusRouteInfoMainScreenKt$ChaloBusRouteInfoMainScreen$1$1;
            } else {
                chaloBusRouteInfoComponent2 = chaloBusRouteInfoComponent;
            }
            q(chaloBusRouteInfoViewState, sheetStateRememberModalBottomSheetState, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
            s((ChaloBusRouteInfoViewState) mutableStateA.getValue(), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            chaloBusRouteInfoComponent2 = chaloBusRouteInfoComponent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(chaloBusRouteInfoComponent2, i, 22));
        }
    }

    public static final void i(RouteNameAndIconUIState routeNameAndIconUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1272200305);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(routeNameAndIconUIState) : composerStartRestartGroup.changedInstance(routeNameAndIconUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1272200305, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoRouteBadge (ChaloBusRouteInfoMainScreen.kt:495)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(companion, ChaloThemeKt.d(routeNameAndIconUIState.d)), ChaloColorTokenKt.c(routeNameAndIconUIState.c), null, 2, null), routeNameAndIconUIState.e);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(routeNameAndIconUIState.f3368a, null, false, composerStartRestartGroup, 0, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, routeNameAndIconUIState.f), composerStartRestartGroup, 0);
            TextKt.c(routeNameAndIconUIState.b, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(routeNameAndIconUIState, i, 21));
        }
    }

    public static final void j(ChaloBusRouteInfoRouteUIState chaloBusRouteInfoRouteUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(937959479);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(chaloBusRouteInfoRouteUIState) : composerStartRestartGroup.changedInstance(chaloBusRouteInfoRouteUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(937959479, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoRouteCard (ChaloBusRouteInfoMainScreen.kt:441)");
            }
            boolean zChanged = composerStartRestartGroup.changed(chaloBusRouteInfoRouteUIState.h);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = chaloBusRouteInfoRouteUIState.h;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloBusRouteInfoRouteUISpec chaloBusRouteInfoRouteUISpec = (ChaloBusRouteInfoRouteUISpec) objRememberedValue;
            RoundedCornerShape roundedCornerShapeD = ChaloThemeKt.d(chaloBusRouteInfoRouteUISpec.i);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(ShadowKt.m4219shadows4CzXII$default(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), chaloBusRouteInfoRouteUISpec.f3329a), ChaloTheme.c(composerStartRestartGroup, 0).c, roundedCornerShapeD, false, 0L, 0L, 24, null), roundedCornerShapeD), ChaloColorTokenKt.c(chaloBusRouteInfoRouteUISpec.h), null, 2, null), chaloBusRouteInfoRouteUISpec.b);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            RouteNameAndIconUIState routeNameAndIconUIState = chaloBusRouteInfoRouteUIState.f3330a;
            UIShape.Rectangle rectangle = UIShape.f1926a;
            i(routeNameAndIconUIState, composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            TextKt.c(chaloBusRouteInfoRouteUIState.b, null, null, null, composerStartRestartGroup, 0, 14);
            TextUIState.ChaloTextUIState chaloTextUIState = chaloBusRouteInfoRouteUIState.c;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(1100394943);
            } else {
                composerStartRestartGroup.startReplaceGroup(1100394944);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, chaloBusRouteInfoRouteUISpec.d), composerStartRestartGroup, 0);
                TextKt.c(chaloTextUIState, null, null, null, composerStartRestartGroup, 0, 14);
            }
            composerStartRestartGroup.endReplaceGroup();
            DividerUIStateKt.a(ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), chaloBusRouteInfoRouteUISpec.e), chaloBusRouteInfoRouteUIState.g, composerStartRestartGroup, 0, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            Modifier modifierA = i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i5), composerM3915constructorimpl3));
            CommonImageKt.a(chaloBusRouteInfoRouteUIState.d, null, false, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, chaloBusRouteInfoRouteUISpec.f), composerStartRestartGroup, 0);
            TextKt.c(chaloBusRouteInfoRouteUIState.e, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            ChaloFilledButtonKt.d(null, chaloBusRouteInfoRouteUIState.f, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(chaloBusRouteInfoRouteUIState, i, 20));
        }
    }

    public static final void k(ChaloBusRouteInfoViewState chaloBusRouteInfoViewState, Composer composer, int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1721729120);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(chaloBusRouteInfoViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1721729120, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoScreen (ChaloBusRouteInfoMainScreen.kt:95)");
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloColorTokenKt.c(chaloBusRouteInfoViewState.b.f3331a), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            i3 = 0;
            ChaloToolBarKt.a(null, ComposableLambdaKt.rememberComposableLambda(-200056288, true, new n4(chaloBusRouteInfoViewState, 4), composerStartRestartGroup, 54), null, null, ChaloTheme.b(composerStartRestartGroup, 0).f1916a, 0L, null, null, false, null, composerStartRestartGroup, 48, 0, 2029);
            ChaloBusRouteInfoContentState chaloBusRouteInfoContentState = chaloBusRouteInfoViewState.c;
            if (chaloBusRouteInfoContentState instanceof ChaloBusRouteInfoContentState.Loading) {
                composerStartRestartGroup.startReplaceGroup(393545463);
                g((ChaloBusRouteInfoContentState.Loading) chaloBusRouteInfoContentState, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (chaloBusRouteInfoContentState instanceof ChaloBusRouteInfoContentState.Content) {
                composerStartRestartGroup.startReplaceGroup(393695131);
                ChaloBusRouteInfoContentState.Content content = (ChaloBusRouteInfoContentState.Content) chaloBusRouteInfoContentState;
                b(content.f3312a, content.b, content.c, content.d, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (chaloBusRouteInfoContentState instanceof ChaloBusRouteInfoContentState.FullScreenError) {
                composerStartRestartGroup.startReplaceGroup(394093295);
                ChaloBusRouteInfoContentState.FullScreenError fullScreenError = (ChaloBusRouteInfoContentState.FullScreenError) chaloBusRouteInfoContentState;
                a(fullScreenError.f3314a, fullScreenError.b, fullScreenError.c, fullScreenError.d, null, composerStartRestartGroup, 0, 16);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(chaloBusRouteInfoContentState instanceof ChaloBusRouteInfoContentState.Empty)) {
                    throw pk0.p(composerStartRestartGroup, 151239963);
                }
                composerStartRestartGroup.startReplaceGroup(394426483);
                d((ChaloBusRouteInfoContentState.Empty) chaloBusRouteInfoContentState, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new dh(chaloBusRouteInfoViewState, i, i3));
        }
    }

    public static final void l(List list, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Composer composerStartRestartGroup = composer.startRestartGroup(65965418);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        int i4 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(65965418, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoTabs (ChaloBusRouteInfoMainScreen.kt:317)");
            }
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(IntrinsicKt.height(Modifier.INSTANCE, IntrinsicSize.Max), 0.0f, 1, null), ChaloColorTokenKt.c(ChaloColorToken.White.f9870a), null, 2, null);
            int i5 = 48;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            char c = ' ';
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(2032205111);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ChaloBusRouteInfoTabUIState chaloBusRouteInfoTabUIState = (ChaloBusRouteInfoTabUIState) it.next();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), 0.0f, i3, null);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(chaloBusRouteInfoTabUIState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new i4(chaloBusRouteInfoTabUIState, 24);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxHeight$default, false, null, null, null, (Function0) objRememberedValue, 15, null);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                char c2 = c;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, i5);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i4);
                int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c2));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
                pk0.v(companion5, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(ChaloThemeKt.c(companion3, chaloBusRouteInfoTabUIState.e.f3333a), 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion4.getCenterVertically(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) ((currentCompositeKeyHashCode3 >>> c2) ^ currentCompositeKeyHashCode3);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default2);
                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                pk0.v(companion5, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                ImageUIState imageUIState = chaloBusRouteInfoTabUIState.f3334a;
                if (imageUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(1857197003);
                    composerStartRestartGroup.endReplaceGroup();
                    companion = companion3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1857197004);
                    companion = companion3;
                    CommonImageKt.a(imageUIState, null, false, composerStartRestartGroup, 0, 6);
                    nf1.t(companion, chaloBusRouteInfoTabUIState.e.b, composerStartRestartGroup, 0);
                }
                Composer composer2 = composerStartRestartGroup;
                TextKt.c(chaloBusRouteInfoTabUIState.b, null, null, null, composer2, 0, 14);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
                Modifier.Companion companion6 = companion;
                SpacerKt.Spacer(dq.a(columnScopeInstance, companion6, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                DividerUIStateKt.a(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), chaloBusRouteInfoTabUIState.d, composerStartRestartGroup, 6, 0);
                composerStartRestartGroup.endNode();
                c = c2;
                i3 = 1;
                i4 = 0;
                i5 = 48;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh(list, i, 0));
        }
    }

    public static final void m(ChaloBusRouteSuggestionBottomSheetUiState.Form form, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1436966655);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(form) : composerStartRestartGroup.changedInstance(form) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436966655, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteSuggestionBottomSheetContent (ChaloBusRouteInfoMainScreen.kt:630)");
            }
            boolean zChanged = composerStartRestartGroup.changed(form.i);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = form.i;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloBusRouteSuggestionBottomSheetUiSpec chaloBusRouteSuggestionBottomSheetUiSpec = (ChaloBusRouteSuggestionBottomSheetUiSpec) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            ChaloPadding chaloPadding = chaloBusRouteSuggestionBottomSheetUiSpec.f3357a;
            float f = chaloBusRouteSuggestionBottomSheetUiSpec.c;
            Modifier modifierC = ChaloThemeKt.c(modifierFillMaxWidth$default, chaloPadding);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            TextKt.c(form.f3358a, i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), null, null, composerStartRestartGroup, 0, 12);
            CommonImageKt.a(form.b, null, false, composerStartRestartGroup, 0, 6);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, chaloBusRouteSuggestionBottomSheetUiSpec.b), composer2, 0);
            o(form.c, composer2, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, f), composer2, 0);
            o(form.d, composer2, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, f), composer2, 0);
            o(form.e, composer2, 0);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, chaloBusRouteSuggestionBottomSheetUiSpec.d), composer2, 0);
            ChaloFilledButtonKt.a(6, 0, composer2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), form.f);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, chaloBusRouteSuggestionBottomSheetUiSpec.e), composer2, 0);
            if (b3.s(6, 0, composer2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), form.g)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(form, i, 13));
        }
    }

    public static final void n(ChaloBusRouteSuggestionCardUiState chaloBusRouteSuggestionCardUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1053306673);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(chaloBusRouteSuggestionCardUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1053306673, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteSuggestionCard (ChaloBusRouteInfoMainScreen.kt:608)");
            }
            boolean zChanged = composerStartRestartGroup.changed(chaloBusRouteSuggestionCardUiState.d);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = chaloBusRouteSuggestionCardUiState.d;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloBusRouteSuggestionCardUiSpec chaloBusRouteSuggestionCardUiSpec = (ChaloBusRouteSuggestionCardUiSpec) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m263backgroundbw27NRU(SizeKt.fillMaxWidth$default(ChaloThemeKt.c(companion, chaloBusRouteSuggestionCardUiSpec.f3360a), 0.0f, 1, null), ChaloColorTokenKt.c(chaloBusRouteSuggestionCardUiSpec.d), ChaloThemeKt.d(chaloBusRouteSuggestionCardUiSpec.e)), chaloBusRouteSuggestionCardUiSpec.b);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(chaloBusRouteSuggestionCardUiState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new i4(chaloBusRouteSuggestionCardUiState, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierC, false, null, null, null, (Function0) objRememberedValue2, 15, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.c(chaloBusRouteSuggestionCardUiState.f3361a, null, null, null, composerStartRestartGroup, 0, 14);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, chaloBusRouteSuggestionCardUiSpec.c), composerStartRestartGroup, 0);
            ChaloFilledButtonKt.d(null, chaloBusRouteSuggestionCardUiState.b, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(chaloBusRouteSuggestionCardUiState, i, 19));
        }
    }

    public static final void o(ChaloBusRouteSuggestionFieldUiState chaloBusRouteSuggestionFieldUiState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(32376871);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(chaloBusRouteSuggestionFieldUiState) : composerStartRestartGroup.changedInstance(chaloBusRouteSuggestionFieldUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(32376871, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteSuggestionField (ChaloBusRouteInfoMainScreen.kt:671)");
            }
            boolean zChanged = composerStartRestartGroup.changed(chaloBusRouteSuggestionFieldUiState.c);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = chaloBusRouteSuggestionFieldUiState.c;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloBusRouteSuggestionFieldUiSpec chaloBusRouteSuggestionFieldUiSpec = (ChaloBusRouteSuggestionFieldUiSpec) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierA = BorderUISpecKt.a(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(SizeKt.m816heightInVpY3zN4$default(companion, ChaloThemeHelper.a().p, 0.0f, 2, null), 0.0f, 1, null), ChaloThemeKt.d(chaloBusRouteSuggestionFieldUiSpec.d.c)), ChaloColorTokenKt.c(chaloBusRouteSuggestionFieldUiSpec.c), null, 2, null), chaloBusRouteSuggestionFieldUiSpec.d);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(chaloBusRouteSuggestionFieldUiState));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new i4(chaloBusRouteSuggestionFieldUiState, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierC = ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(modifierA, false, null, null, null, (Function0) objRememberedValue2, 15, null), chaloBusRouteSuggestionFieldUiSpec.f3362a);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CommonImageKt.a(chaloBusRouteSuggestionFieldUiState.f3363a, null, false, composerStartRestartGroup, 0, 6);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, chaloBusRouteSuggestionFieldUiSpec.b), composerStartRestartGroup, 0);
            TitleSubtitleViewKt.a(i41.a(rowScopeInstance, companion, 1.0f, false, 2, null), chaloBusRouteSuggestionFieldUiState.b, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(chaloBusRouteSuggestionFieldUiState, i, 18));
        }
    }

    public static final void p(ChaloBusRouteSuggestionBottomSheetUiState.Success success, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(572654405);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(success) : composerStartRestartGroup.changedInstance(success) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(572654405, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteSuggestionSuccessBottomSheetContent (ChaloBusRouteInfoMainScreen.kt:697)");
            }
            boolean zChanged = composerStartRestartGroup.changed(success.f);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = success.f;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloBusRouteSuggestionSuccessUiSpec chaloBusRouteSuggestionSuccessUiSpec = (ChaloBusRouteSuggestionSuccessUiSpec) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), chaloBusRouteSuggestionSuccessUiSpec.f3364a);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
            SpacerKt.Spacer(i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            CommonImageKt.a(success.f3359a, null, false, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup.endNode();
            GifUIKt.a(null, success.b, composerStartRestartGroup, 0, 1);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, chaloBusRouteSuggestionSuccessUiSpec.b), composerStartRestartGroup, 0);
            TextKt.c(success.c, null, null, null, composerStartRestartGroup, 0, 14);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, chaloBusRouteSuggestionSuccessUiSpec.c), composerStartRestartGroup, 0);
            TextKt.c(success.d, null, null, null, composerStartRestartGroup, 0, 14);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, chaloBusRouteSuggestionSuccessUiSpec.d), composer2, 0);
            if (b3.s(6, 0, composer2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), success.e)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(success, i, 12));
        }
    }

    public static final void q(ChaloBusRouteInfoViewState chaloBusRouteInfoViewState, SheetState sheetState, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1112454312);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(chaloBusRouteInfoViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(sheetState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2;
        if (composerStartRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1112454312, i5, -1, "app.chalo.home.ui.chalobusrouteinfo.RouteSuggestionBottomSheetHandler (ChaloBusRouteInfoMainScreen.kt:162)");
            }
            if (chaloBusRouteInfoViewState.d != null) {
                composerStartRestartGroup.startReplaceGroup(1159016606);
                boolean z = (i5 & 896) == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new ya(function1, 25);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                i3 = 0;
                i4 = 1;
                ChaloRoundedBottomSheetKt.a(sheetState, (Function0) objRememberedValue, false, false, false, ComposableLambdaKt.rememberComposableLambda(485683847, true, new c6(chaloBusRouteInfoViewState, 5), composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
            } else {
                i3 = 0;
                i4 = 1;
                composerStartRestartGroup.startReplaceGroup(1152345530);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloBusRouteSuggestionBottomSheetUiState chaloBusRouteSuggestionBottomSheetUiState = chaloBusRouteInfoViewState.d;
            int i6 = (i5 & 14) == 4 ? i4 : i3;
            if ((i5 & 112) != 32) {
                i4 = i3;
            }
            int i7 = i6 | i4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i7 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ChaloBusRouteInfoMainScreenKt$RouteSuggestionBottomSheetHandler$3$1(chaloBusRouteInfoViewState, sheetState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(chaloBusRouteSuggestionBottomSheetUiState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 8, chaloBusRouteInfoViewState, sheetState, function1));
        }
    }

    public static final void r(RouteSuggestionTimePickerUIState routeSuggestionTimePickerUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-992186705);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(routeSuggestionTimePickerUIState) : composerStartRestartGroup.changedInstance(routeSuggestionTimePickerUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-992186705, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.RouteSuggestionTimePickerDialog (ChaloBusRouteInfoMainScreen.kt:727)");
            }
            RouteSuggestionTimePickerUISpec routeSuggestionTimePickerUISpec = routeSuggestionTimePickerUIState.f3373a;
            String str = routeSuggestionTimePickerUIState.d;
            int i3 = routeSuggestionTimePickerUIState.b;
            boolean zChanged = composerStartRestartGroup.changed(routeSuggestionTimePickerUISpec);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = routeSuggestionTimePickerUIState.f3373a;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            RouteSuggestionTimePickerUISpec routeSuggestionTimePickerUISpec2 = (RouteSuggestionTimePickerUISpec) objRememberedValue;
            boolean zChanged2 = composerStartRestartGroup.changed(i3);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableIntState mutableIntState = (MutableIntState) objRememberedValue2;
            int iC = TimeUtilsContract.f10451a.a().C(routeSuggestionTimePickerUIState.c);
            boolean zChanged3 = composerStartRestartGroup.changed(iC);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(iC);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue3;
            boolean zChanged4 = composerStartRestartGroup.changed(str);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState = (MutableState) objRememberedValue4;
            UiEventHandler uiEventHandler = routeSuggestionTimePickerUIState.h.f;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(uiEventHandler);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                ChaloBusRouteInfoMainScreenKt$RouteSuggestionTimePickerDialog$1$1 chaloBusRouteInfoMainScreenKt$RouteSuggestionTimePickerDialog$1$1 = new ChaloBusRouteInfoMainScreenKt$RouteSuggestionTimePickerDialog$1$1(0, uiEventHandler, UiEventHandler.class, "onClick", "onClick()V", 0);
                composerStartRestartGroup.updateRememberedValue(chaloBusRouteInfoMainScreenKt$RouteSuggestionTimePickerDialog$1$1);
                objRememberedValue5 = chaloBusRouteInfoMainScreenKt$RouteSuggestionTimePickerDialog$1$1;
            }
            AndroidDialog_androidKt.Dialog((Function0) ((KFunction) objRememberedValue5), null, ComposableLambdaKt.rememberComposableLambda(-1293193146, true, new u1(routeSuggestionTimePickerUISpec2, routeSuggestionTimePickerUIState, mutableIntState, mutableIntState2, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(routeSuggestionTimePickerUIState, i, 17));
        }
    }

    public static final void s(ChaloBusRouteInfoViewState chaloBusRouteInfoViewState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-514469260);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(chaloBusRouteInfoViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-514469260, i2, -1, "app.chalo.home.ui.chalobusrouteinfo.RouteSuggestionTimePickerDialogHandler (ChaloBusRouteInfoMainScreen.kt:143)");
            }
            ChaloBusRouteSuggestionBottomSheetUiState chaloBusRouteSuggestionBottomSheetUiState = chaloBusRouteInfoViewState.d;
            if (chaloBusRouteSuggestionBottomSheetUiState instanceof ChaloBusRouteSuggestionBottomSheetUiState.Form) {
                composerStartRestartGroup.startReplaceGroup(-2110107397);
                RouteSuggestionTimePickerUIState routeSuggestionTimePickerUIState = ((ChaloBusRouteSuggestionBottomSheetUiState.Form) chaloBusRouteSuggestionBottomSheetUiState).h;
                if (routeSuggestionTimePickerUIState == null) {
                    composerStartRestartGroup.startReplaceGroup(-2110107398);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-2110107397);
                    UIShape.Rectangle rectangle = UIShape.f1926a;
                    r(routeSuggestionTimePickerUIState, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(chaloBusRouteSuggestionBottomSheetUiState instanceof ChaloBusRouteSuggestionBottomSheetUiState.Success) && chaloBusRouteSuggestionBottomSheetUiState != null) {
                    throw pk0.p(composerStartRestartGroup, -483716387);
                }
                composerStartRestartGroup.startReplaceGroup(-2109907479);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new dh(chaloBusRouteInfoViewState, i, 1));
        }
    }
}
