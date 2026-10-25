package app.chalo.home.ui.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.kq;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CommonTemplateBottomSheetKt {
    /* JADX WARN: Code duplicated, block: B:100:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:105:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:108:0x0301  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00df  */
    /* JADX WARN: Code duplicated, block: B:74:0x0139  */
    /* JADX WARN: Code duplicated, block: B:77:0x0145  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:81:0x0162  */
    /* JADX WARN: Code duplicated, block: B:82:0x0173  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:87:0x020e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0217  */
    /* JADX WARN: Code duplicated, block: B:91:0x0265  */
    /* JADX WARN: Code duplicated, block: B:94:0x026f  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:98:0x02af  */
    public static final void a(Modifier modifier, IconType iconType, String title, String str, String positiveButtonText, String str2, Function0 onPositiveClick, Function0 onNegativeClick, Composer composer, int i, int i2) {
        String str3;
        boolean z;
        Modifier modifier2;
        String str4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier.Companion companion;
        String str5;
        Function0<ComposeUiNode> constructor;
        Object obj;
        int i3;
        boolean z2;
        int i4;
        Modifier.Companion companion2;
        String str6;
        int i5;
        int i6;
        Intrinsics.i(title, "title");
        Intrinsics.i(positiveButtonText, "positiveButtonText");
        Intrinsics.i(onPositiveClick, "onPositiveClick");
        Intrinsics.i(onNegativeClick, "onNegativeClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(105732153);
        int i7 = i | 6;
        if ((i & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i7 |= composerStartRestartGroup.changed(title) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i7 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i7 |= composerStartRestartGroup.changed(positiveButtonText) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 == 0) {
            if ((196608 & i) == 0) {
                str3 = str2;
                i7 |= composerStartRestartGroup.changed(str3) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(onPositiveClick)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i7 |= i6;
            }
            if ((12582912 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(onNegativeClick)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i7 |= i5;
            }
            if ((4793491 & i7) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i7 & 1)) {
                companion = Modifier.INSTANCE;
                if (i8 != 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(105732153, i7, -1, "app.chalo.home.ui.compose.CommonTemplateBottomSheet (CommonTemplateBottomSheet.kt:31)");
                }
                Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR0);
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
                pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i9), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (iconType == null) {
                    composerStartRestartGroup.startReplaceGroup(-859307715);
                    composerStartRestartGroup.endReplaceGroup();
                    i3 = i7;
                    z2 = true;
                    obj = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(-859307714);
                    obj = null;
                    i3 = i7;
                    z2 = true;
                    ImageKt.Image(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
                    ChaloSpacersKt.p(composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (title.length() > 0) {
                    composerStartRestartGroup.startReplaceGroup(-859069572);
                    i4 = -860889985;
                    companion2 = companion;
                    TextKt.m2623TextNvy7gAk(title, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i3 >> 6) & 14, 0, 130042);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    i4 = -860889985;
                    companion2 = companion;
                    composerStartRestartGroup.startReplaceGroup(-860889985);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (str != null) {
                    composerStartRestartGroup.startReplaceGroup(-858839304);
                    ChaloSpacersKt.o(composerStartRestartGroup, 0);
                    Composer composer2 = composerStartRestartGroup;
                    TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.k(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, (i3 >> 9) & 14, 0, 130042);
                    composerStartRestartGroup = composer2;
                } else {
                    composerStartRestartGroup.startReplaceGroup(i4);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (positiveButtonText.length() > 0) {
                    composerStartRestartGroup.startReplaceGroup(-858534543);
                    ChaloSpacersKt.p(composerStartRestartGroup, 0);
                    ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), positiveButtonText, null, 0L, null, false, 0.0f, null, 0L, onPositiveClick, composerStartRestartGroup, ((i3 >> 9) & 112) | 6 | (1879048192 & (i3 << 9)), TypedValues.PositionType.TYPE_CURVE_FIT);
                } else {
                    composerStartRestartGroup.startReplaceGroup(i4);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (str5 != null) {
                    composerStartRestartGroup.startReplaceGroup(-858258829);
                    ChaloSpacersKt.o(composerStartRestartGroup, 0);
                    str6 = str5;
                    ChaloFilledButtonKt.f(str6, false, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, 0.0f, 0L, onNegativeClick, composerStartRestartGroup, ((i3 >> 15) & 14) | 384 | (i3 & 29360128), 122);
                } else {
                    str6 = str5;
                    composerStartRestartGroup.startReplaceGroup(i4);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion2;
                str4 = str6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                str4 = str3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new kq(modifier2, iconType, title, str, positiveButtonText, str4, onPositiveClick, onNegativeClick, i, i2, 0));
            }
        }
        i7 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        str3 = str2;
        if ((1572864 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(onPositiveClick)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i7 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(onNegativeClick)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i7 |= i5;
        }
        if ((4793491 & i7) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i7 & 1)) {
            companion = Modifier.INSTANCE;
            if (i8 != 0) {
                str5 = null;
            } else {
                str5 = str3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(105732153, i7, -1, "app.chalo.home.ui.compose.CommonTemplateBottomSheet (CommonTemplateBottomSheet.kt:31)");
            }
            Modifier modifierM787paddingqDBjuR1 = PaddingKt.m787paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i10 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR1);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i10), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            if (iconType == null) {
                composerStartRestartGroup.startReplaceGroup(-859307715);
                composerStartRestartGroup.endReplaceGroup();
                i3 = i7;
                z2 = true;
                obj = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(-859307714);
                obj = null;
                i3 = i7;
                z2 = true;
                ImageKt.Image(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (title.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-859069572);
                i4 = -860889985;
                companion2 = companion;
                TextKt.m2623TextNvy7gAk(title, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i3 >> 6) & 14, 0, 130042);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                i4 = -860889985;
                companion2 = companion;
                composerStartRestartGroup.startReplaceGroup(-860889985);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (str != null) {
                composerStartRestartGroup.startReplaceGroup(-858839304);
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
                Composer composer3 = composerStartRestartGroup;
                TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.k(ChaloTheme.e(composerStartRestartGroup, 0)), composer3, (i3 >> 9) & 14, 0, 130042);
                composerStartRestartGroup = composer3;
            } else {
                composerStartRestartGroup.startReplaceGroup(i4);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (positiveButtonText.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-858534543);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), positiveButtonText, null, 0L, null, false, 0.0f, null, 0L, onPositiveClick, composerStartRestartGroup, ((i3 >> 9) & 112) | 6 | (1879048192 & (i3 << 9)), TypedValues.PositionType.TYPE_CURVE_FIT);
            } else {
                composerStartRestartGroup.startReplaceGroup(i4);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (str5 != null) {
                composerStartRestartGroup.startReplaceGroup(-858258829);
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
                str6 = str5;
                ChaloFilledButtonKt.f(str6, false, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, 0.0f, 0L, onNegativeClick, composerStartRestartGroup, ((i3 >> 15) & 14) | 384 | (i3 & 29360128), 122);
            } else {
                str6 = str5;
                composerStartRestartGroup.startReplaceGroup(i4);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion2;
            str4 = str6;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            str4 = str3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kq(modifier2, iconType, title, str, positiveButtonText, str4, onPositiveClick, onNegativeClick, i, i2, 0));
        }
    }
}
