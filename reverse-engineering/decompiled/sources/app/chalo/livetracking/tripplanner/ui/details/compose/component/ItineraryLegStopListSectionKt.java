package app.chalo.livetracking.tripplanner.ui.details.compose.component;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
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
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.BulletListComponentWithLineIconKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.ItineraryLegStopListSectionKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.bc0;
import defpackage.dc0;
import defpackage.ec0;
import defpackage.hq0;
import defpackage.ic;
import defpackage.p80;
import defpackage.pk0;
import defpackage.yx;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0005²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "isStopsListExpanded", "", "", "stopsListToShow", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ItineraryLegStopListSectionKt {
    public static final void a(String str, int i, String str2, String str3, boolean z, boolean z2, Function0 function0, Modifier modifier, TextStyle textStyle, int i2, String str4, Composer composer, int i3, int i4) {
        int i5;
        String str5;
        String str6;
        char c;
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1399004045);
        if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            str5 = str2;
            i5 |= composerStartRestartGroup.changed(str5) ? 256 : 128;
        } else {
            str5 = str2;
        }
        if ((i3 & 3072) == 0) {
            str6 = str3;
            i5 |= composerStartRestartGroup.changed(str6) ? 2048 : 1024;
        } else {
            str6 = str3;
        }
        if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changed(modifier) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changed(textStyle) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            c = ' ';
            i5 |= composerStartRestartGroup.changed(i2) ? 536870912 : 268435456;
        } else {
            c = ' ';
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (composerStartRestartGroup.changed(str4) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if (composerStartRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true, i5 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1399004045, i5, i6, "app.chalo.livetracking.tripplanner.ui.details.compose.component.IntermediateStopLayout (ItineraryLegStopListSection.kt:128)");
            }
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(modifier, null, false, 3, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> c));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            int i8 = i5;
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i9 = i8 >> 3;
            TextKt.m2623TextNvy7gAk(str, PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(str4 != null ? PlotlineComposeWidgetKt.a(Modifier.INSTANCE, str4) : Modifier.INSTANCE, 0.0f, 1, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).c, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composerStartRestartGroup, i8 & 14, i9 & 29360128, 131064);
            composer2 = composerStartRestartGroup;
            if (z) {
                composer2.startReplaceGroup(1841239793);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                int i10 = (i9 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i9 & 112) | (i9 & 896);
                int i11 = i8 >> 6;
                b(i, str5, str6, z2, function0, modifierFillMaxWidth$default, i2, composer2, i10 | (i11 & 7168) | (i11 & 57344) | ((i8 >> 9) & 3670016));
            } else {
                composer2.startReplaceGroup(1836108549);
            }
            composer2.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new dc0(str, i, str2, str3, z, z2, function0, modifier, textStyle, i2, str4, i3, i4, 0));
        }
    }

    public static final void b(int i, String str, String str2, boolean z, Function0 function0, Modifier modifier, int i2, Composer composer, int i3) {
        int i4;
        int i5;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(1250800018);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1250800018, i4, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.IntermediateStopsDropdownSection (ItineraryLegStopListSection.kt:169)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion.getCenterVertically(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Modifier modifierC = hq0.c("PL_Bus_Leg_Drop_Down_", i2, Modifier.INSTANCE);
            boolean z2 = (57344 & i4) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new p80(function0, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(ClickableKt.m299clickableoSLSa3U$default(modifierC, false, null, null, null, (Function0) objRememberedValue, 15, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).d, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
            if (i > 0) {
                composerStartRestartGroup.startReplaceGroup(1131499809);
                if (i == 1) {
                    composerStartRestartGroup.startReplaceGroup(1131543023);
                    i5 = 0;
                    strC = StringResourcesHelperKt.c(StringEnum.STOP_1, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    i5 = 0;
                    composerStartRestartGroup.startReplaceGroup(1131622135);
                    strC = StringResourcesHelperKt.c(StringEnum.X_STOPS, new Object[]{Integer.valueOf(i)}, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                int i8 = i5;
                TextKt.m2623TextNvy7gAk(strC, null, ChaloTheme.a(composerStartRestartGroup, i5).B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, i5)), composerStartRestartGroup, 0, 0, 131066);
                ImageKt.Image(PainterResourceHelperKt.a(z ? IconType.ARROW_PICK_ROUTE_SEARCH_LESS : IconType.ARROW_PICK_ROUTE_SEARCH_MORE, composerStartRestartGroup, i8), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(1125192952);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            TripDetailsFareAndTravelTimeComponentKt.a(i2, ((i4 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | ((i4 >> 9) & 7168), composerStartRestartGroup, null, str, str2);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ec0(i, str, str2, z, function0, modifier, i2, i3, 0));
        }
    }

    public static final void c(final String str, final String travelTimeString, int i, List stopsList, Modifier modifier, int i2, final Function2 getPLabelString, Composer composer, int i3) {
        int i4;
        int i5;
        int i6;
        Composer composer2;
        Intrinsics.i(travelTimeString, "travelTimeString");
        Intrinsics.i(stopsList, "stopsList");
        Intrinsics.i(getPLabelString, "getPLabelString");
        Composer composerStartRestartGroup = composer.startRestartGroup(900262874);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(travelTimeString) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 = i;
            i4 |= composerStartRestartGroup.changed(i5) ? 256 : 128;
        } else {
            i5 = i;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(stopsList) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i6 = i2;
            i4 |= composerStartRestartGroup.changed(i6) ? 131072 : 65536;
        } else {
            i6 = i2;
        }
        if ((1572864 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(getPLabelString) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(900262874, i4, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.ItineraryLegStopListSection (ItineraryLegStopListSection.kt:42)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new bc0(stopsList, mutableState, 0));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final State state = (State) objRememberedValue2;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int size = ((List) state.getValue()).size();
            float f = ChaloTheme.b(composerStartRestartGroup, 0).g;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            float f2 = ChaloTheme.b(composerStartRestartGroup, 0).f;
            float f3 = ChaloTheme.b(composerStartRestartGroup, 0).b;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new yx(state, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final int i8 = i5;
            final int i9 = i6;
            composer2 = composerStartRestartGroup;
            BulletListComponentWithLineIconKt.b(size, modifierFillMaxWidth$default, f, f2, f3, 0.0f, (Function1) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(-369936481, true, new Function4() { // from class: cc0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i10;
                    TextStyle textStyleG;
                    Modifier modifier2 = (Modifier) obj;
                    Integer num = (Integer) obj2;
                    int iIntValue = num.intValue();
                    Composer composer3 = (Composer) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    Intrinsics.i(modifier2, "modifier");
                    if ((iIntValue2 & 6) == 0) {
                        i10 = (composer3.changed(modifier2) ? 4 : 2) | iIntValue2;
                    } else {
                        i10 = iIntValue2;
                    }
                    if ((iIntValue2 & 48) == 0) {
                        i10 |= composer3.changed(iIntValue) ? 32 : 16;
                    }
                    if (composer3.shouldExecute((i10 & 147) != 146, i10 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-369936481, i10, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.component.ItineraryLegStopListSection.<anonymous>.<anonymous> (ItineraryLegStopListSection.kt:75)");
                        }
                        State state2 = state;
                        if (iIntValue == 0 || iIntValue == CollectionsKt.K((List) state2.getValue())) {
                            composer3.startReplaceGroup(108484195);
                            textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composer3, 0));
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(108553728);
                            textStyleG = ChaloTypographyKt.c(ChaloTheme.e(composer3, 0));
                            composer3.endReplaceGroup();
                        }
                        TextStyle textStyle = textStyleG;
                        String strC = "";
                        if (iIntValue == 0) {
                            composer3.startReplaceGroup(108694313);
                            StringEnum stringEnum = StringEnum.FROM_;
                            String str2 = (String) CollectionsKt.L(iIntValue, (List) state2.getValue());
                            strC = StringResourcesHelperKt.c(stringEnum, new Object[]{str2 != null ? str2 : ""}, composer3, 6);
                            composer3.endReplaceGroup();
                        } else if (iIntValue == CollectionsKt.K((List) state2.getValue())) {
                            composer3.startReplaceGroup(108865867);
                            StringEnum stringEnum2 = StringEnum.TO_;
                            String str3 = (String) CollectionsKt.L(iIntValue, (List) state2.getValue());
                            strC = StringResourcesHelperKt.c(stringEnum2, new Object[]{str3 != null ? str3 : ""}, composer3, 6);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(109012125);
                            composer3.endReplaceGroup();
                            String str4 = (String) CollectionsKt.L(iIntValue, (List) state2.getValue());
                            if (str4 != null) {
                                strC = str4;
                            }
                        }
                        boolean z = iIntValue == 0;
                        MutableState mutableState2 = mutableState;
                        boolean zBooleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                        String str5 = (String) getPLabelString.invoke(num, Integer.valueOf(CollectionsKt.K((List) state2.getValue())));
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new t1(mutableState2, 18);
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        ItineraryLegStopListSectionKt.a(strC, i8, str, travelTimeString, z, zBooleanValue, (Function0) objRememberedValue4, modifierFillMaxWidth$default2, textStyle, i9, str5, composer3, 1572864, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composer2, 14155824, 32);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ic(str, travelTimeString, i, stopsList, modifier, i2, getPLabelString, i3));
        }
    }
}
