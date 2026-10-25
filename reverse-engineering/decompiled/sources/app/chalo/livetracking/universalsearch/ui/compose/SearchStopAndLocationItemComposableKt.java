package app.chalo.livetracking.universalsearch.ui.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import app.chalo.compose.components.SpecialFeatureTagListComposableKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchRecentSearchedItemLayoutUiModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.gf;
import defpackage.i41;
import defpackage.n61;
import defpackage.nf1;
import defpackage.nl;
import defpackage.o01;
import defpackage.ph;
import defpackage.pk0;
import defpackage.s01;
import defpackage.t1;
import defpackage.vc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SearchStopAndLocationItemComposableKt {
    public static final void a(int i, Composer composer, Modifier modifier, String text, Function0 onClick) {
        int i2;
        Composer composer2;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(text, "text");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1648079685);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1648079685, i3, -1, "app.chalo.livetracking.universalsearch.ui.compose.PopUpItem (SearchStopAndLocationItemComposable.kt:163)");
            }
            long j = ChaloTheme.a(composerStartRestartGroup, 0).v;
            TextStyle textStyleB = ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 0));
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(modifier, ChaloTheme.a(composerStartRestartGroup, 0).x, null, 2, null);
            boolean z = (i3 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o01(onClick, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(text, PaddingKt.m785paddingVpY3zN4(ClickableKt.m299clickableoSLSa3U$default(modifierM264backgroundbw27NRU$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).m, ChaloTheme.b(composerStartRestartGroup, 0).g), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleB, composer2, (i3 >> 3) & 14, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new vc(modifier, text, onClick, i, 5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0227  */
    /* JADX WARN: Code duplicated, block: B:103:0x022b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0283  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:112:0x02df  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:118:0x030b  */
    /* JADX WARN: Code duplicated, block: B:129:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:132:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:134:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:136:0x042a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0432  */
    /* JADX WARN: Code duplicated, block: B:140:0x0454  */
    /* JADX WARN: Code duplicated, block: B:143:0x0484  */
    /* JADX WARN: Code duplicated, block: B:147:0x049a  */
    /* JADX WARN: Code duplicated, block: B:149:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:152:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:155:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:156:0x0503  */
    /* JADX WARN: Code duplicated, block: B:159:0x050f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0511  */
    /* JADX WARN: Code duplicated, block: B:167:0x0522  */
    /* JADX WARN: Code duplicated, block: B:170:0x053e  */
    /* JADX WARN: Code duplicated, block: B:172:0x0543  */
    /* JADX WARN: Code duplicated, block: B:175:0x054f  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:66:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x010c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0110  */
    /* JADX WARN: Code duplicated, block: B:79:0x0147  */
    /* JADX WARN: Code duplicated, block: B:80:0x0149  */
    /* JADX WARN: Code duplicated, block: B:85:0x0156  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01de  */
    /* JADX WARN: Code duplicated, block: B:99:0x021b  */
    public static final void b(UniversalSearchRecentSearchedItemLayoutUiModel universalSearchRecentSearchedItemLayoutUiModel, boolean z, Function0 onClick, Function0 onRemoveClick, Function1 onSaveClick, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        Function1 function1;
        boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean z4;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        Object objRememberedValue2;
        MutableState mutableState2;
        ArrayList arrayList;
        boolean z5;
        List list;
        Modifier.Companion companion2;
        boolean z6;
        Object objRememberedValue3;
        Alignment.Companion companion3;
        ComposeUiNode.Companion companion4;
        Function0<ComposeUiNode> constructor;
        ComposeUiNode.Companion companion5;
        int i4;
        Modifier modifier;
        Function0<ComposeUiNode> constructor2;
        List list2;
        int i5;
        String str;
        Object objRememberedValue4;
        boolean z7;
        Object objRememberedValue5;
        boolean z8;
        boolean z9;
        Object objRememberedValue6;
        Object objRememberedValue7;
        Object objRememberedValue8;
        Function0<ComposeUiNode> constructor3;
        int i6;
        int i7;
        int i8;
        IconType iconType = universalSearchRecentSearchedItemLayoutUiModel.d;
        IconType iconType2 = universalSearchRecentSearchedItemLayoutUiModel.f5004a;
        String str2 = universalSearchRecentSearchedItemLayoutUiModel.f;
        List list3 = universalSearchRecentSearchedItemLayoutUiModel.h;
        Intrinsics.i(onClick, "onClick");
        Intrinsics.i(onRemoveClick, "onRemoveClick");
        Intrinsics.i(onSaveClick, "onSaveClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(583366110);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(universalSearchRecentSearchedItemLayoutUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i3 |= i8;
            }
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changedInstance(onRemoveClick)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changedInstance(onSaveClick)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                if (i9 != 0) {
                    z4 = false;
                } else {
                    z4 = z;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(583366110, i3, -1, "app.chalo.livetracking.universalsearch.ui.compose.SearchStopAndLocationItemComposable (SearchStopAndLocationItemComposable.kt:42)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState2 = (MutableState) objRememberedValue2;
                arrayList = new ArrayList();
                z5 = z4;
                if (universalSearchRecentSearchedItemLayoutUiModel.g) {
                    composerStartRestartGroup.startReplaceGroup(-2025868402);
                    arrayList.add(StringResourcesHelperKt.c(StringEnum.AC, new Object[0], composerStartRestartGroup, 6));
                } else {
                    composerStartRestartGroup.startReplaceGroup(1620503300);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (list3 != null) {
                    list = list3;
                } else {
                    list = EmptyList.f17557a;
                }
                arrayList.addAll(list);
                if (universalSearchRecentSearchedItemLayoutUiModel.i && str2 != null && str2.length() != 0) {
                    arrayList.add(str2);
                }
                companion2 = Modifier.INSTANCE;
                Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
                if ((i3 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new o01(onClick, 13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(modifierM264backgroundbw27NRU$default, false, null, null, null, (Function0) objRememberedValue3, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
                companion3 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i10 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
                companion4 = ComposeUiNode.INSTANCE;
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
                pk0.v(companion4, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i10), composerM3915constructorimpl));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                if (iconType2 != null) {
                    composerStartRestartGroup.startReplaceGroup(-1614267641);
                    Modifier modifierM830sizeVpY3zN4 = SizeKt.m830sizeVpY3zN4(companion2, ChaloTheme.b(composerStartRestartGroup, 0).k, ChaloTheme.b(composerStartRestartGroup, 0).l);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i11 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM830sizeVpY3zN4);
                    constructor3 = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion4, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i11), composerM3915constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    companion5 = companion4;
                    modifier = null;
                    i4 = 0;
                    ImageKt.Image(PainterResourceHelperKt.a(iconType2, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    nf1.t(companion2, ChaloTheme.b(composerStartRestartGroup, 0).g, composerStartRestartGroup, 0);
                } else {
                    companion5 = companion4;
                    i4 = 0;
                    modifier = null;
                    composerStartRestartGroup.startReplaceGroup(-1616906144);
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierA = i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, i4);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i4);
                int i12 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
                ComposeUiNode.Companion companion6 = companion5;
                pk0.v(companion6, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl3, Integer.valueOf(i12), composerM3915constructorimpl3));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                list2 = list3;
                if (list2 != null || list2.isEmpty()) {
                    i5 = 0;
                    composerStartRestartGroup.startReplaceGroup(1166658634);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1169835886);
                    i5 = 0;
                    SpecialFeatureTagListComposableKt.a(0, 2, composerStartRestartGroup, modifier, arrayList);
                    gf.r(companion2, ChaloTheme.b(composerStartRestartGroup, 0).c, composerStartRestartGroup, 0);
                }
                Composer composer2 = composerStartRestartGroup;
                TextKt.m2624TextZ58ophY(universalSearchRecentSearchedItemLayoutUiModel.b, null, ChaloTheme.a(composerStartRestartGroup, i5).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, i5)), composer2, 0, 24576, 245754);
                composerStartRestartGroup = composer2;
                str = universalSearchRecentSearchedItemLayoutUiModel.c;
                if (str != null || str.length() == 0) {
                    composerStartRestartGroup.startReplaceGroup(1166658634);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1170268460);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).c), composerStartRestartGroup, 0);
                    TextKt.m2623TextNvy7gAk(universalSearchRecentSearchedItemLayoutUiModel.c, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 24576, 114682);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (universalSearchRecentSearchedItemLayoutUiModel.e) {
                    composerStartRestartGroup.startReplaceGroup(-1612928565);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
                    Painter painterA = PainterResourceHelperKt.a(IconType.FAVORITE_ADD, composerStartRestartGroup, 6);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new t1(mutableState2, 27);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    IconKt.m2070Iconww6aTOc(painterA, (String) null, ClickableKt.m299clickableoSLSa3U$default(companion2, false, null, null, null, (Function0) objRememberedValue8, 15, null), 0L, composerStartRestartGroup, Painter.$stable | 48, 8);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1612581613);
                    if (iconType != null) {
                        composerStartRestartGroup.startReplaceGroup(-1612533904);
                        SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
                        Painter painterA2 = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new t1(mutableState, 28);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        IconKt.m2070Iconww6aTOc(painterA2, (String) null, ClickableKt.m299clickableoSLSa3U$default(companion2, false, null, null, null, (Function0) objRememberedValue4, 15, null), 0L, composerStartRestartGroup, Painter.$stable | 48, 8);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1616906144);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(-1612095998);
                    Alignment bottomEnd = companion3.getBottomEnd();
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new t1(mutableState, 29);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    z7 = true;
                    Composer composer3 = composerStartRestartGroup;
                    AndroidPopup_androidKt.m7536PopupK5zGePQ(bottomEnd, 0L, (Function0) objRememberedValue7, null, ComposableLambdaKt.rememberComposableLambda(1271715090, true, new nl(z5, onRemoveClick, mutableState, (MutableState) r42), composerStartRestartGroup, 54), composer3, 24966, 10);
                    composerStartRestartGroup = composer3;
                } else {
                    z7 = true;
                    composerStartRestartGroup.startReplaceGroup(-1616906144);
                }
                composerStartRestartGroup.endReplaceGroup();
                boolean zBooleanValue = ((Boolean) r42.getValue()).booleanValue();
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    z8 = false;
                    objRememberedValue5 = new n61(r42, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    z8 = false;
                }
                Function0 function0 = (Function0) objRememberedValue5;
                if ((i3 & 57344) == 16384) {
                    z9 = z7;
                } else {
                    z9 = z8;
                }
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!z9 || objRememberedValue6 == companion.getEmpty()) {
                    function1 = onSaveClick;
                    objRememberedValue6 = new s01(function1, 18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    function1 = onSaveClick;
                }
                AddToFavoriteComposeDialogKt.a(zBooleanValue, function0, (Function1) objRememberedValue6, composerStartRestartGroup, 432);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z5;
            } else {
                function1 = onSaveClick;
                composerStartRestartGroup.skipToGroupEnd();
                z3 = z;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new ph(universalSearchRecentSearchedItemLayoutUiModel, z3, onClick, onRemoveClick, function1, i, i2));
            }
        }
        i3 |= 48;
        if ((i & 384) == 0) {
            if (composerStartRestartGroup.changedInstance(onClick)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changedInstance(onRemoveClick)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i & 24576) == 0) {
            if (composerStartRestartGroup.changedInstance(onSaveClick)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
            if (i9 != 0) {
                z4 = false;
            } else {
                z4 = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(583366110, i3, -1, "app.chalo.livetracking.universalsearch.ui.compose.SearchStopAndLocationItemComposable (SearchStopAndLocationItemComposable.kt:42)");
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState2 = (MutableState) objRememberedValue2;
            arrayList = new ArrayList();
            z5 = z4;
            if (universalSearchRecentSearchedItemLayoutUiModel.g) {
                composerStartRestartGroup.startReplaceGroup(-2025868402);
                arrayList.add(StringResourcesHelperKt.c(StringEnum.AC, new Object[0], composerStartRestartGroup, 6));
            } else {
                composerStartRestartGroup.startReplaceGroup(1620503300);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (list3 != null) {
                list = list3;
            } else {
                list = EmptyList.f17557a;
            }
            arrayList.addAll(list);
            if (universalSearchRecentSearchedItemLayoutUiModel.i) {
                arrayList.add(str2);
            }
            companion2 = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default2 = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            if ((i3 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z6) {
                objRememberedValue3 = new o01(onClick, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new o01(onClick, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierM784padding3ABfNKs2 = PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(modifierM264backgroundbw27NRU$default2, false, null, null, null, (Function0) objRememberedValue3, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            companion3 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i13 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs2);
            companion4 = ComposeUiNode.INSTANCE;
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
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i13), composerM3915constructorimpl4));
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            if (iconType2 != null) {
                composerStartRestartGroup.startReplaceGroup(-1614267641);
                Modifier modifierM830sizeVpY3zN5 = SizeKt.m830sizeVpY3zN4(companion2, ChaloTheme.b(composerStartRestartGroup, 0).k, ChaloTheme.b(composerStartRestartGroup, 0).l);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i14 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM830sizeVpY3zN5);
                constructor3 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl5, currentCompositionLocalMap5);
                Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl5, Integer.valueOf(i14), composerM3915constructorimpl5));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                companion5 = companion4;
                modifier = null;
                i4 = 0;
                ImageKt.Image(PainterResourceHelperKt.a(iconType2, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                nf1.t(companion2, ChaloTheme.b(composerStartRestartGroup, 0).g, composerStartRestartGroup, 0);
            } else {
                companion5 = companion4;
                i4 = 0;
                modifier = null;
                composerStartRestartGroup.startReplaceGroup(-1616906144);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierA2 = i41.a(rowScopeInstance2, companion2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), companion3.getStart(), composerStartRestartGroup, i4);
            long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i4);
            int i15 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA2);
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
            Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composerStartRestartGroup);
            ComposeUiNode.Companion companion7 = companion5;
            pk0.v(companion7, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl6, currentCompositionLocalMap6);
            Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl6, Integer.valueOf(i15), composerM3915constructorimpl6));
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            list2 = list3;
            if (list2 != null) {
                i5 = 0;
                composerStartRestartGroup.startReplaceGroup(1166658634);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i5 = 0;
                composerStartRestartGroup.startReplaceGroup(1166658634);
                composerStartRestartGroup.endReplaceGroup();
            }
            Composer composer4 = composerStartRestartGroup;
            TextKt.m2624TextZ58ophY(universalSearchRecentSearchedItemLayoutUiModel.b, null, ChaloTheme.a(composerStartRestartGroup, i5).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 2, 0, null, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, i5)), composer4, 0, 24576, 245754);
            composerStartRestartGroup = composer4;
            str = universalSearchRecentSearchedItemLayoutUiModel.c;
            if (str != null) {
                composerStartRestartGroup.startReplaceGroup(1166658634);
            } else {
                composerStartRestartGroup.startReplaceGroup(1166658634);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (universalSearchRecentSearchedItemLayoutUiModel.e) {
                composerStartRestartGroup.startReplaceGroup(-1612928565);
                SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
                Painter painterA3 = PainterResourceHelperKt.a(IconType.FAVORITE_ADD, composerStartRestartGroup, 6);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new t1(mutableState2, 27);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                IconKt.m2070Iconww6aTOc(painterA3, (String) null, ClickableKt.m299clickableoSLSa3U$default(companion2, false, null, null, null, (Function0) objRememberedValue8, 15, null), 0L, composerStartRestartGroup, Painter.$stable | 48, 8);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1612581613);
                if (iconType != null) {
                    composerStartRestartGroup.startReplaceGroup(-1612533904);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
                    Painter painterA4 = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, 0);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new t1(mutableState, 28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    IconKt.m2070Iconww6aTOc(painterA4, (String) null, ClickableKt.m299clickableoSLSa3U$default(companion2, false, null, null, null, (Function0) objRememberedValue4, 15, null), 0L, composerStartRestartGroup, Painter.$stable | 48, 8);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1616906144);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-1612095998);
                Alignment bottomEnd2 = companion3.getBottomEnd();
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new t1(mutableState, 29);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                z7 = true;
                Composer composer5 = composerStartRestartGroup;
                AndroidPopup_androidKt.m7536PopupK5zGePQ(bottomEnd2, 0L, (Function0) objRememberedValue7, null, ComposableLambdaKt.rememberComposableLambda(1271715090, true, new nl(z5, onRemoveClick, mutableState, (MutableState) r42), composerStartRestartGroup, 54), composer5, 24966, 10);
                composerStartRestartGroup = composer5;
            } else {
                z7 = true;
                composerStartRestartGroup.startReplaceGroup(-1616906144);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean zBooleanValue2 = ((Boolean) r42.getValue()).booleanValue();
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                z8 = false;
                objRememberedValue5 = new n61(r42, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                z8 = false;
            }
            Function0 function2 = (Function0) objRememberedValue5;
            if ((i3 & 57344) == 16384) {
                z9 = z7;
            } else {
                z9 = z8;
            }
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z9) {
                function1 = onSaveClick;
                objRememberedValue6 = new s01(function1, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                function1 = onSaveClick;
                objRememberedValue6 = new s01(function1, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            AddToFavoriteComposeDialogKt.a(zBooleanValue2, function2, (Function1) objRememberedValue6, composerStartRestartGroup, 432);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z5;
        } else {
            function1 = onSaveClick;
            composerStartRestartGroup.skipToGroupEnd();
            z3 = z;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ph(universalSearchRecentSearchedItemLayoutUiModel, z3, onClick, onRemoveClick, function1, i, i2));
        }
    }
}
