package app.chalo.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import app.chalo.compose.components.ChaloDividerComposableKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.UserSelfReviewComposableKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.usecase.FeedbackData;
import app.chalo.usecase.FeedbackTags;
import defpackage.bn;
import defpackage.cn;
import defpackage.dq;
import defpackage.fi;
import defpackage.fk;
import defpackage.g5;
import defpackage.i41;
import defpackage.pk0;
import defpackage.qg;
import defpackage.r1;
import defpackage.u;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "tellUsMoreText", "", "shouldEnableSubmitBtn", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloUserReviewFormComposableKt {
    public static final void a(Modifier modifier, IconType headerImageId, String title, String subTitle, String userReviewTitle, FeedbackData feedbackData, String ctaTitle, Function2 onReviewOptionsClicked, Function0 onOkayClick, Composer composer, int i) {
        int i2;
        Composer composer2;
        Object next;
        SnapshotStateList snapshotStateList;
        Intrinsics.i(modifier, "modifier");
        Intrinsics.i(headerImageId, "headerImageId");
        Intrinsics.i(title, "title");
        Intrinsics.i(subTitle, "subTitle");
        Intrinsics.i(userReviewTitle, "userReviewTitle");
        Intrinsics.i(ctaTitle, "ctaTitle");
        Intrinsics.i(onReviewOptionsClicked, "onReviewOptionsClicked");
        Intrinsics.i(onOkayClick, "onOkayClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1546573637);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(headerImageId.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(title) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(subTitle) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(userReviewTitle) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(feedbackData) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(ctaTitle) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onReviewOptionsClicked) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onOkayClick) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1546573637, i2, -1, "app.chalo.compose.ChaloUserReviewFormComposable (ChaloUserReviewFormComposable.kt:51)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.derivedStateOf(new fi(snapshotStateList2, 11));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            State state = (State) objRememberedValue3;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
            int i4 = i2;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxSize$default(BackgroundKt.m264backgroundbw27NRU$default(modifier, ChaloTheme.a(composerStartRestartGroup, 6).t, null, 2, null), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).h), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            b(headerImageId, title, subTitle, composerStartRestartGroup, (i4 >> 3) & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            c(composerStartRestartGroup, (i4 >> 12) & 14, userReviewTitle);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            Iterator<T> it = snapshotStateList2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.x(((FeedbackTags) next).b, "Other", true));
            boolean z = next != null;
            boolean z2 = (i4 & 29360128) == 8388608;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                snapshotStateList = snapshotStateList2;
                objRememberedValue4 = new u(12, snapshotStateList, onReviewOptionsClicked, mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                snapshotStateList = snapshotStateList2;
            }
            Function1 function1 = (Function1) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objRememberedValue5 == companion5.getEmpty()) {
                objRememberedValue5 = new g5(mutableState, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            int i6 = i4 >> 15;
            UserSelfReviewComposableKt.b(feedbackData, snapshotStateList, function1, (Function1) objRememberedValue5, z, false, composerStartRestartGroup, (i6 & 14) | 199728, 0);
            Modifier.Companion companion6 = Modifier.INSTANCE;
            SpacerKt.Spacer(dq.a(columnScopeInstance, companion6, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            boolean zBooleanValue = ((Boolean) state.getValue()).booleanValue();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
            boolean z3 = (i4 & 234881024) == 67108864;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue6 == companion5.getEmpty()) {
                objRememberedValue6 = new fk(onOkayClick, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composer2 = composerStartRestartGroup;
            ChaloFilledButtonKt.j(modifierFillMaxWidth$default, ctaTitle, null, 0L, 0L, 0L, 0L, null, 0.0f, zBooleanValue, null, (Function0) objRememberedValue6, composer2, (i6 & 112) | 6, 0, 1532);
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bn(modifier, headerImageId, title, subTitle, userReviewTitle, feedbackData, ctaTitle, onReviewOptionsClicked, onOkayClick, i));
        }
    }

    public static final void b(IconType iconType, String str, String str2, Composer composer, int i) {
        int i2;
        String str3;
        String str4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1052032724);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(iconType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1052032724, i2, -1, "app.chalo.compose.MissedTapOutHeaderComposable (ChaloUserReviewFormComposable.kt:113)");
            }
            ImageKt.Image(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, i2 & 14), "", SizeKt.m828size3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).Y), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 6)), composer2, (i2 >> 3) & 14, 0, 131070);
            ChaloSpacersKt.m(composer2, 0);
            TextKt.m2623TextNvy7gAk(str4, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composer2, 6)), composer2, (i2 >> 6) & 14, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cn(iconType, str, str2, i, 0));
        }
    }

    public static final void c(Composer composer, int i, String str) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1695397617);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1695397617, i2, -1, "app.chalo.compose.MissedTapOutTitleComposable (ChaloUserReviewFormComposable.kt:132)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ChaloDividerComposableKt.a(ChaloTheme.b(composerStartRestartGroup, 6).b, 0, ChaloTheme.a(composerStartRestartGroup, 6).m, composerStartRestartGroup, i41.a(rowScopeInstance, companion, 1.0f, false, 2, null));
            TextKt.m2623TextNvy7gAk(str, PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composerStartRestartGroup, 6).h, 0.0f, 2, null), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 6)), composerStartRestartGroup, i2 & 14, 0, 131068);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloDividerComposableKt.a(ChaloTheme.b(composerStartRestartGroup, 6).b, 0, ChaloTheme.a(composerStartRestartGroup, 6).m, composerStartRestartGroup, i41.a(rowScopeInstance, companion, 1.0f, false, 2, null));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qg(str, i, 4));
        }
    }
}
