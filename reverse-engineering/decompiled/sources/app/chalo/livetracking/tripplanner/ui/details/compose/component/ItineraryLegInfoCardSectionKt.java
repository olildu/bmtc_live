package app.chalo.livetracking.tripplanner.ui.details.compose.component;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.SpecialFeatureTagListComposableKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.hp;
import defpackage.pk0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ItineraryLegInfoCardSectionKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4749a;

        static {
            int[] iArr = new int[RouteNamingSchemeType.values().length];
            try {
                iArr[RouteNamingSchemeType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteNamingSchemeType.VIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4749a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0325  */
    /* JADX WARN: Code duplicated, block: B:104:0x0335  */
    /* JADX WARN: Code duplicated, block: B:106:0x033b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0347  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x0102  */
    /* JADX WARN: Code duplicated, block: B:79:0x0183  */
    /* JADX WARN: Code duplicated, block: B:82:0x018f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0193  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:94:0x028a  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b5  */
    public static final void a(String routeName, String routeLastStopName, RouteNamingSchemeType routeSchemeType, String str, List tagsList, Modifier modifier, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        boolean z;
        Composer composer2;
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier3;
        int i4;
        String strC;
        Function0<ComposeUiNode> constructor;
        Modifier.Companion companion;
        Function0<ComposeUiNode> constructor2;
        TextOverflow.Companion companion2;
        int i5;
        int i6;
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(routeLastStopName, "routeLastStopName");
        Intrinsics.i(routeSchemeType, "routeSchemeType");
        Intrinsics.i(tagsList, "tagsList");
        Composer composerStartRestartGroup = composer.startRestartGroup(10481573);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(routeName) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(routeLastStopName) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(routeSchemeType.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(tagsList) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 == 0) {
            if ((196608 & i) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(10481573, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.ItineraryLegInfoCardSection (ItineraryLegInfoCardSection.kt:36)");
                }
                i4 = WhenMappings.f4749a[routeSchemeType.ordinal()];
                if (i4 != 1) {
                    composerStartRestartGroup.startReplaceGroup(1482868366);
                    composerStartRestartGroup.endReplaceGroup();
                    strC = routeName;
                } else {
                    if (i4 == 2) {
                        throw pk0.p(composerStartRestartGroup, 1482866419);
                    }
                    composerStartRestartGroup.startReplaceGroup(1482869916);
                    strC = StringResourcesHelperKt.c(StringEnum.TOWARDS_X, new Object[]{routeLastStopName}, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                String str2 = strC;
                Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m786paddingVpY3zN4$default(ScrollKt.horizontalScroll$default(SizeKt.wrapContentWidth$default(modifier3, null, false, 3, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).n, RoundedCornerShapeKt.getCircleShape()), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).g);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion3.getStart(), composerStartRestartGroup, 6);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN4);
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
                Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                constructor2 = companion4.getConstructor();
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
                pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                function3.invoke(companion, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | 6));
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).e), composerStartRestartGroup, 0);
                TextStyle textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0));
                long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
                companion2 = TextOverflow.INSTANCE;
                Modifier modifier4 = modifier3;
                i5 = i3;
                TextKt.m2623TextNvy7gAk(str2, null, j, null, 0L, null, null, null, 0L, null, null, 0L, companion2.m7226getEllipsisgIe3tQ8(), false, 0, 0, null, textStyleG, composerStartRestartGroup, 0, 384, 126970);
                composer2 = composerStartRestartGroup;
                if (tagsList.isEmpty()) {
                    composer2.startReplaceGroup(-688980445);
                } else {
                    composer2.startReplaceGroup(-686382800);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composer2, 0).f), composer2, 0);
                    SpecialFeatureTagListComposableKt.a((i5 >> 12) & 14, 2, composer2, null, tagsList);
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (str != null) {
                    composer2.startReplaceGroup(1802792309);
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.VIA_, new Object[]{str}, composer2, 6), PaddingKt.m788paddingqDBjuR0$default(companion, ChaloTheme.b(composer2, 0).i, 0.0f, ChaloTheme.b(composer2, 0).f, 0.0f, 10, null), ChaloTheme.a(composer2, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, companion2.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer2, 0)), composer2, 0, 24960, 110584);
                    composer2 = composer2;
                } else {
                    composer2.startReplaceGroup(1799926855);
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                modifier2 = modifier;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new hp(routeName, routeLastStopName, routeSchemeType, str, tagsList, modifier2, function3, i, i2));
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        if ((1572864 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(10481573, i3, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.ItineraryLegInfoCardSection (ItineraryLegInfoCardSection.kt:36)");
            }
            i4 = WhenMappings.f4749a[routeSchemeType.ordinal()];
            if (i4 != 1) {
                composerStartRestartGroup.startReplaceGroup(1482868366);
                composerStartRestartGroup.endReplaceGroup();
                strC = routeName;
            } else {
                if (i4 == 2) {
                    throw pk0.p(composerStartRestartGroup, 1482866419);
                }
                composerStartRestartGroup.startReplaceGroup(1482869916);
                strC = StringResourcesHelperKt.c(StringEnum.TOWARDS_X, new Object[]{routeLastStopName}, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            String str3 = strC;
            Modifier modifierM785paddingVpY3zN5 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(PaddingKt.m786paddingVpY3zN4$default(ScrollKt.horizontalScroll$default(SizeKt.wrapContentWidth$default(modifier3, null, false, 3, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).n, RoundedCornerShapeKt.getCircleShape()), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).g);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical center2 = arrangement2.getCenter();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center2, companion5.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN5);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
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
            pk0.v(companion6, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i10), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
            companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i11 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            constructor2 = companion6.getConstructor();
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
            pk0.v(companion6, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl4, Integer.valueOf(i11), composerM3915constructorimpl4));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            function3.invoke(companion, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | 6));
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).e), composerStartRestartGroup, 0);
            TextStyle textStyleG2 = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0));
            long j2 = ChaloTheme.a(composerStartRestartGroup, 0).e;
            companion2 = TextOverflow.INSTANCE;
            Modifier modifier5 = modifier3;
            i5 = i3;
            TextKt.m2623TextNvy7gAk(str3, null, j2, null, 0L, null, null, null, 0L, null, null, 0L, companion2.m7226getEllipsisgIe3tQ8(), false, 0, 0, null, textStyleG2, composerStartRestartGroup, 0, 384, 126970);
            composer2 = composerStartRestartGroup;
            if (tagsList.isEmpty()) {
                composer2.startReplaceGroup(-686382800);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composer2, 0).f), composer2, 0);
                SpecialFeatureTagListComposableKt.a((i5 >> 12) & 14, 2, composer2, null, tagsList);
            } else {
                composer2.startReplaceGroup(-688980445);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (str != null) {
                composer2.startReplaceGroup(1802792309);
                TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.VIA_, new Object[]{str}, composer2, 6), PaddingKt.m788paddingqDBjuR0$default(companion, ChaloTheme.b(composer2, 0).i, 0.0f, ChaloTheme.b(composer2, 0).f, 0.0f, 10, null), ChaloTheme.a(composer2, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, companion2.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer2, 0)), composer2, 0, 24960, 110584);
                composer2 = composer2;
            } else {
                composer2.startReplaceGroup(1799926855);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hp(routeName, routeLastStopName, routeSchemeType, str, tagsList, modifier2, function3, i, i2));
        }
    }
}
