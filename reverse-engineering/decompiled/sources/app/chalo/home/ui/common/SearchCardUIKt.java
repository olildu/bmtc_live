package app.chalo.home.ui.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import app.chalo.compose.components.ChaloSearchBarKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.homescreen.data.model.app.SearchCardAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken_androidKt;
import defpackage.ey0;
import defpackage.i61;
import defpackage.pk0;
import defpackage.t8;
import defpackage.xm0;
import defpackage.zj0;
import defpackage.zt0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "artworkFailed", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SearchCardUIKt {
    /* JADX WARN: Code duplicated, block: B:48:0x00c4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(SearchCardAppModel card, String searchBarText, Function0 onClick, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        long jM4640getTransparent0d7_KjU;
        Intrinsics.i(card, "card");
        String str = card.c;
        Intrinsics.i(searchBarText, "searchBarText");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1153078004);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(card) : composerStartRestartGroup.changedInstance(card) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(searchBarText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (composerStartRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1153078004, i3, -1, "app.chalo.home.ui.common.SearchCardUI (SearchCardUI.kt:46)");
            }
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            String str2 = card.d;
            if (str2 == null) {
                jM4640getTransparent0d7_KjU = Color.INSTANCE.m4640getTransparent0d7_KjU();
            } else {
                String str3 = StringsKt.F(str2) ? null : str2;
                if (str3 != null) {
                    jM4640getTransparent0d7_KjU = ChaloColorToken_androidKt.a(Color.INSTANCE, str3, Color.INSTANCE.m4640getTransparent0d7_KjU());
                } else {
                    jM4640getTransparent0d7_KjU = Color.INSTANCE.m4640getTransparent0d7_KjU();
                }
            }
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(ClickableKt.m299clickableoSLSa3U$default(ClipKt.clip(BackgroundKt.m263backgroundbw27NRU(modifierM786paddingVpY3zN4$default, jM4640getTransparent0d7_KjU, ChaloTheme.d(composerStartRestartGroup, 0).g), ChaloTheme.d(composerStartRestartGroup, 0).g), false, null, null, null, onClick, 15, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1675021586, true, new xm0(card, 14), composerStartRestartGroup, 54);
            if (StringsKt.F(str) || ((Boolean) mutableState.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(1424402409);
                composableLambdaRememberComposableLambda.invoke(composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1423939858);
                b(composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(-57318540, true, new zt0(5, card, mutableState), composerStartRestartGroup, 54), composerStartRestartGroup, 54);
                composerStartRestartGroup.endReplaceGroup();
            }
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            ChaloSearchBarKt.a(null, searchBarText, PainterResourceHelperKt.a(IconType.IC_HOME_SEARCH, composerStartRestartGroup, 6), companion, composer2, (i3 & 112) | 3078 | (Painter.$stable << 6));
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ey0(card, searchBarText, onClick, modifier2, i, 7));
        }
    }

    public static final void b(Function2 function2, Function2 function3, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1642766069);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1642766069, i2, -1, "app.chalo.home.ui.common.TextWithArtworkRow (SearchCardUI.kt:120)");
            }
            composerStartRestartGroup.startReplaceGroup(1849776335);
            final int iMo398roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo398roundToPx0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).h);
            composerStartRestartGroup.endReplaceGroup();
            List listS = CollectionsKt.S(function2, function3);
            boolean zChanged = composerStartRestartGroup.changed(iMo398roundToPx0680j_4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MultiContentMeasurePolicy() { // from class: app.chalo.home.ui.common.SearchCardUIKt$TextWithArtworkRow$1$1
                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    public final /* bridge */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                        return zj0.a(this, intrinsicMeasureScope, list, i3);
                    }

                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    public final /* bridge */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                        return zj0.b(this, intrinsicMeasureScope, list, i3);
                    }

                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo731measure3p2s80s(MeasureScope Layout, List list, long j) {
                        Intrinsics.i(Layout, "$this$Layout");
                        Intrinsics.i(list, "<destruct>");
                        List list2 = (List) list.get(0);
                        List list3 = (List) list.get(1);
                        Measurable measurable = (Measurable) CollectionsKt.F(list2);
                        Measurable measurable2 = (Measurable) CollectionsKt.F(list3);
                        final int iM7243getMaxWidthimpl = Constraints.m7243getMaxWidthimpl(j);
                        int iF = MathKt.f(iM7243getMaxWidthimpl * 0.4f);
                        final Ref.IntRef intRef = new Ref.IntRef();
                        int iMin = Math.min(MathKt.f(measurable.minIntrinsicHeight(iM7243getMaxWidthimpl) * 2.0f), iF);
                        intRef.element = iMin;
                        int i3 = iMo398roundToPx0680j_4;
                        int i4 = (iM7243getMaxWidthimpl - iMin) - i3;
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        int iMin2 = Math.min(MathKt.f(measurable.minIntrinsicHeight(i4) * 2.0f), iF);
                        intRef.element = iMin2;
                        final int iF2 = MathKt.f(iMin2 / 2.0f);
                        int i5 = (iM7243getMaxWidthimpl - intRef.element) - i3;
                        final Placeable placeableMo5939measureBRTryo0 = measurable.mo5939measureBRTryo0(ConstraintsKt.Constraints$default(0, i5 < 0 ? 0 : i5, 0, Constraints.m7242getMaxHeightimpl(j), 5, null));
                        final Placeable placeableMo5939measureBRTryo1 = measurable2.mo5939measureBRTryo0(Constraints.INSTANCE.m7253fixedJhjzzOo(intRef.element, iF2));
                        final int iMax = Math.max(placeableMo5939measureBRTryo0.getHeight(), iF2);
                        return MeasureScope.CC.s(Layout, iM7243getMaxWidthimpl, iMax, null, new Function1() { // from class: j61
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                                Intrinsics.i(layout, "$this$layout");
                                Placeable placeable = placeableMo5939measureBRTryo0;
                                int height = placeable.getHeight();
                                int i6 = iMax;
                                Placeable.PlacementScope.place$default(layout, placeable, 0, (i6 - height) / 2, 0.0f, 4, null);
                                Placeable.PlacementScope.place$default(layout, placeableMo5939measureBRTryo1, iM7243getMaxWidthimpl - intRef.element, (i6 - iF2) / 2, 0.0f, 4, null);
                                return Unit.f17538a;
                            }
                        }, 4, null);
                    }

                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    public final /* bridge */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                        return zj0.c(this, intrinsicMeasureScope, list, i3);
                    }

                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    public final /* bridge */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i3) {
                        return zj0.d(this, intrinsicMeasureScope, list, i3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listS);
            boolean zChanged2 = composerStartRestartGroup.changed(multiContentMeasurePolicy);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            if (t8.w(composerStartRestartGroup, 0, function2CombineAsVirtualLayouts)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new i61(function2, function3, i, 0));
        }
    }
}
