package app.chalo.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.data.BackgroundShape;
import app.chalo.data.ChaloTextDataKt;
import app.chalo.data.ChaloTextWithBackgroundData;
import app.chalo.data.PaddingAppModel;
import app.chalo.data.TextFormatAppModel;
import app.chalo.data.TextStyleAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIStateKt;
import app.chalo.uistate.text.UITextStyle;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import defpackage.ff;
import defpackage.fj;
import defpackage.hn;
import defpackage.km;
import defpackage.kn;
import defpackage.pk0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "shouldRenderSpacer", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloWidgetCardKt {
    public static final void a(Modifier modifier, ChaloTextWithBackgroundData chaloTextWithBackgroundData, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1261166816);
        int i2 = i | 6;
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(chaloTextWithBackgroundData) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 131) != 130, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1261166816, i2, -1, "app.chalo.compose.components.AddChaloTextWithBackground (ChaloWidgetCard.kt:415)");
            }
            TextStyleAppModel textStyleAppModel = chaloTextWithBackgroundData.h;
            PaddingAppModel paddingAppModel = chaloTextWithBackgroundData.c;
            long jD = ComposeUtils_androidKt.d(chaloTextWithBackgroundData.f2337a);
            float fM7278constructorimpl = Dp.m7278constructorimpl(chaloTextWithBackgroundData.g);
            float fM7278constructorimpl2 = Dp.m7278constructorimpl(chaloTextWithBackgroundData.e);
            BackgroundShape backgroundShape = chaloTextWithBackgroundData.b;
            Shape shapeD = backgroundShape != null ? ChaloTextDataKt.d(backgroundShape) : null;
            if (shapeD == null) {
                composerStartRestartGroup.startReplaceGroup(-800514961);
                shapeD = ChaloTheme.d(composerStartRestartGroup, 6).f1919a;
            } else {
                composerStartRestartGroup.startReplaceGroup(-800516790);
            }
            composerStartRestartGroup.endReplaceGroup();
            ChaloTextKt.a(companion, textStyleAppModel, paddingAppModel, jD, chaloTextWithBackgroundData.f, fM7278constructorimpl, chaloTextWithBackgroundData.d, fM7278constructorimpl2, shapeD, composerStartRestartGroup, ((i2 << 3) & 112) | 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(modifier, chaloTextWithBackgroundData, i, 22));
        }
    }

    public static final void b(Modifier modifier, Color color, String str, ChaloTextWithBackgroundData chaloTextWithBackgroundData, List list, List list2, IconType iconType, Composer composer, int i) {
        Object obj;
        int i2;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Composer composerStartRestartGroup = composer.startRestartGroup(886093000);
        if ((i & 6) == 0) {
            obj = modifier;
            i2 = (composerStartRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj2 = color;
            i2 |= composerStartRestartGroup.changed(obj2) ? 32 : 16;
        } else {
            obj2 = color;
        }
        if ((i & 384) == 0) {
            obj3 = str;
            i2 |= composerStartRestartGroup.changed(obj3) ? 256 : 128;
        } else {
            obj3 = str;
        }
        if ((i & 3072) == 0) {
            obj4 = chaloTextWithBackgroundData;
            i2 |= composerStartRestartGroup.changedInstance(obj4) ? 2048 : 1024;
        } else {
            obj4 = chaloTextWithBackgroundData;
        }
        if ((i & 24576) == 0) {
            obj5 = list;
            i2 |= composerStartRestartGroup.changedInstance(obj5) ? 16384 : 8192;
        } else {
            obj5 = list;
        }
        if ((196608 & i) == 0) {
            obj6 = list2;
            i2 |= composerStartRestartGroup.changedInstance(obj6) ? 131072 : 65536;
        } else {
            obj6 = list2;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(886093000, i2, -1, "app.chalo.compose.components.ChaloHorizontalWidgetCard (ChaloWidgetCard.kt:320)");
            }
            ChaloRoundedCardKt.b(null, ChaloTheme.d(composerStartRestartGroup, 6).d, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-768374327, true, new kn(obj, obj2, obj3, iconType, obj4, obj5, obj6, 0), composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new km(modifier, color, str, chaloTextWithBackgroundData, list, list2, iconType, i, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void c(final Modifier modifier, final Color color, final String str, final ChaloTextWithBackgroundData chaloTextWithBackgroundData, final List list, final List list2, final IconType iconType, boolean z, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final boolean z4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1153472088);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(color) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(chaloTextWithBackgroundData) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 == 0) {
            if ((12582912 & i) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
                if (i4 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1153472088, i3, -1, "app.chalo.compose.components.ChaloWidgetCard (ChaloWidgetCard.kt:54)");
                }
                ChaloRoundedCardKt.b(null, ChaloTheme.d(composerStartRestartGroup, 6).g, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1504021225, true, new Function3() { // from class: dn
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                        if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1504021225, iIntValue, -1, "app.chalo.compose.components.ChaloWidgetCard.<anonymous> (ChaloWidgetCard.kt:58)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
                            Color color2 = color;
                            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxWidth$default, color2 != null ? color2.m4615unboximpl() : Color.INSTANCE.m4640getTransparent0d7_KjU(), null, 2, null), ChaloTheme.b(composer2, 6).h);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composer2, 0);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM784padding3ABfNKs);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer2.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                            pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ChaloTextWithBackgroundData chaloTextWithBackgroundData2 = chaloTextWithBackgroundData;
                            if (chaloTextWithBackgroundData2 == null || !ChaloTextDataKt.c(chaloTextWithBackgroundData2.h.f2406a)) {
                                composer2.startReplaceGroup(540462991);
                            } else {
                                composer2.startReplaceGroup(543028644);
                                ChaloWidgetCardKt.a(null, chaloTextWithBackgroundData2, composer2, 48);
                            }
                            composer2.endReplaceGroup();
                            List<ChaloTextWithBackgroundData> list3 = list;
                            if (list3 == null) {
                                composer2.startReplaceGroup(543195361);
                            } else {
                                composer2.startReplaceGroup(543195362);
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion3);
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
                                ChaloSpacersKt.t(composer2, 0);
                                composer2.startReplaceGroup(426099513);
                                for (ChaloTextWithBackgroundData chaloTextWithBackgroundData3 : list3) {
                                    if (ChaloTextDataKt.c(chaloTextWithBackgroundData3.h.f2406a)) {
                                        composer2.startReplaceGroup(755527409);
                                        ChaloWidgetCardKt.a(null, chaloTextWithBackgroundData3, composer2, 48);
                                    } else {
                                        composer2.startReplaceGroup(752624693);
                                    }
                                    composer2.endReplaceGroup();
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                            }
                            composer2.endReplaceGroup();
                            List<ChaloTextWithBackgroundData> list4 = list2;
                            if (list4 == null) {
                                composer2.startReplaceGroup(543639808);
                            } else {
                                composer2.startReplaceGroup(543639809);
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                                int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion4);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                                pk0.v(companion5, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                ChaloSpacersKt.n(composer2, 0);
                                composer2.startReplaceGroup(1859536066);
                                for (ChaloTextWithBackgroundData chaloTextWithBackgroundData4 : list4) {
                                    if (ChaloTextDataKt.c(chaloTextWithBackgroundData4.h.f2406a)) {
                                        composer2.startReplaceGroup(-264688792);
                                        ChaloWidgetCardKt.a(null, chaloTextWithBackgroundData4, composer2, 48);
                                    } else {
                                        composer2.startReplaceGroup(-268036916);
                                    }
                                    composer2.endReplaceGroup();
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                            }
                            composer2.endReplaceGroup();
                            Object objRememberedValue = composer2.rememberedValue();
                            Composer.Companion companion6 = Composer.INSTANCE;
                            if (objRememberedValue == companion6.getEmpty()) {
                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            MutableState mutableState = (MutableState) objRememberedValue;
                            Object objRememberedValue2 = composer2.rememberedValue();
                            Object empty = companion6.getEmpty();
                            boolean z5 = z4;
                            if (objRememberedValue2 == empty) {
                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                objRememberedValue2 = companion7.then(z5 ? SizeKt.m828size3ABfNKs(companion7, Dp.m7278constructorimpl(72)) : SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion7, Dp.m7278constructorimpl(61)), Dp.m7278constructorimpl(105)));
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            Modifier modifier2 = (Modifier) objRememberedValue2;
                            String str2 = str;
                            if (str2 == null) {
                                composer2.startReplaceGroup(544576070);
                            } else {
                                composer2.startReplaceGroup(544576071);
                                if (((Boolean) mutableState.getValue()).booleanValue()) {
                                    composer2.startReplaceGroup(-976743481);
                                    ChaloSpacersKt.n(composer2, 0);
                                } else {
                                    composer2.startReplaceGroup(-980862327);
                                }
                                composer2.endReplaceGroup();
                                if (z5) {
                                    composer2.startReplaceGroup(-976642917);
                                    SpacerKt.Spacer(dq.a(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                                } else {
                                    composer2.startReplaceGroup(-980862327);
                                }
                                composer2.endReplaceGroup();
                                ContentScale fit = ContentScale.INSTANCE.getFit();
                                Alignment centerStart = Alignment.INSTANCE.getCenterStart();
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1398061494, true, new en(iconType, modifier2, mutableState, 0), composer2, 54);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (objRememberedValue3 == companion6.getEmpty()) {
                                    objRememberedValue3 = new g5(mutableState, 12);
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                SingletonSubcomposeAsyncImageKt.a(str2, null, modifier2, null, null, composableLambdaRememberComposableLambda, (Function1) objRememberedValue3, null, centerStart, fit, composer2, 102236592, 54, 62136);
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer2.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 13);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new ff(modifier, color, str, chaloTextWithBackgroundData, list, list2, iconType, z2, i, i2));
            }
        }
        i3 |= 12582912;
        z2 = z;
        if ((4793491 & i3) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z3, i3 & 1)) {
            if (i4 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1153472088, i3, -1, "app.chalo.compose.components.ChaloWidgetCard (ChaloWidgetCard.kt:54)");
            }
            ChaloRoundedCardKt.b(null, ChaloTheme.d(composerStartRestartGroup, 6).g, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(1504021225, true, new Function3() { // from class: dn
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                    if (composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1504021225, iIntValue, -1, "app.chalo.compose.components.ChaloWidgetCard.<anonymous> (ChaloWidgetCard.kt:58)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
                        Color color2 = color;
                        Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxWidth$default, color2 != null ? color2.m4615unboximpl() : Color.INSTANCE.m4640getTransparent0d7_KjU(), null, 2, null), ChaloTheme.b(composer2, 6).h);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), composer2, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM784padding3ABfNKs);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ChaloTextWithBackgroundData chaloTextWithBackgroundData2 = chaloTextWithBackgroundData;
                        if (chaloTextWithBackgroundData2 == null || !ChaloTextDataKt.c(chaloTextWithBackgroundData2.h.f2406a)) {
                            composer2.startReplaceGroup(540462991);
                        } else {
                            composer2.startReplaceGroup(543028644);
                            ChaloWidgetCardKt.a(null, chaloTextWithBackgroundData2, composer2, 48);
                        }
                        composer2.endReplaceGroup();
                        List<ChaloTextWithBackgroundData> list3 = list;
                        if (list3 == null) {
                            composer2.startReplaceGroup(543195361);
                        } else {
                            composer2.startReplaceGroup(543195362);
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                            int i6 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion3);
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i6), composerM3915constructorimpl2));
                            ChaloSpacersKt.t(composer2, 0);
                            composer2.startReplaceGroup(426099513);
                            for (ChaloTextWithBackgroundData chaloTextWithBackgroundData3 : list3) {
                                if (ChaloTextDataKt.c(chaloTextWithBackgroundData3.h.f2406a)) {
                                    composer2.startReplaceGroup(755527409);
                                    ChaloWidgetCardKt.a(null, chaloTextWithBackgroundData3, composer2, 48);
                                } else {
                                    composer2.startReplaceGroup(752624693);
                                }
                                composer2.endReplaceGroup();
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                        }
                        composer2.endReplaceGroup();
                        List<ChaloTextWithBackgroundData> list4 = list2;
                        if (list4 == null) {
                            composer2.startReplaceGroup(543639808);
                        } else {
                            composer2.startReplaceGroup(543639809);
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                            int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion4);
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                            pk0.v(companion5, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl3, currentCompositionLocalMap3);
                            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            ChaloSpacersKt.n(composer2, 0);
                            composer2.startReplaceGroup(1859536066);
                            for (ChaloTextWithBackgroundData chaloTextWithBackgroundData4 : list4) {
                                if (ChaloTextDataKt.c(chaloTextWithBackgroundData4.h.f2406a)) {
                                    composer2.startReplaceGroup(-264688792);
                                    ChaloWidgetCardKt.a(null, chaloTextWithBackgroundData4, composer2, 48);
                                } else {
                                    composer2.startReplaceGroup(-268036916);
                                }
                                composer2.endReplaceGroup();
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                        }
                        composer2.endReplaceGroup();
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion6 = Composer.INSTANCE;
                        if (objRememberedValue == companion6.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        MutableState mutableState = (MutableState) objRememberedValue;
                        Object objRememberedValue2 = composer2.rememberedValue();
                        Object empty = companion6.getEmpty();
                        boolean z5 = z4;
                        if (objRememberedValue2 == empty) {
                            Modifier.Companion companion7 = Modifier.INSTANCE;
                            objRememberedValue2 = companion7.then(z5 ? SizeKt.m828size3ABfNKs(companion7, Dp.m7278constructorimpl(72)) : SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion7, Dp.m7278constructorimpl(61)), Dp.m7278constructorimpl(105)));
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        Modifier modifier2 = (Modifier) objRememberedValue2;
                        String str2 = str;
                        if (str2 == null) {
                            composer2.startReplaceGroup(544576070);
                        } else {
                            composer2.startReplaceGroup(544576071);
                            if (((Boolean) mutableState.getValue()).booleanValue()) {
                                composer2.startReplaceGroup(-976743481);
                                ChaloSpacersKt.n(composer2, 0);
                            } else {
                                composer2.startReplaceGroup(-980862327);
                            }
                            composer2.endReplaceGroup();
                            if (z5) {
                                composer2.startReplaceGroup(-976642917);
                                SpacerKt.Spacer(dq.a(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                            } else {
                                composer2.startReplaceGroup(-980862327);
                            }
                            composer2.endReplaceGroup();
                            ContentScale fit = ContentScale.INSTANCE.getFit();
                            Alignment centerStart = Alignment.INSTANCE.getCenterStart();
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1398061494, true, new en(iconType, modifier2, mutableState, 0), composer2, 54);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (objRememberedValue3 == companion6.getEmpty()) {
                                objRememberedValue3 = new g5(mutableState, 12);
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            SingletonSubcomposeAsyncImageKt.a(str2, null, modifier2, null, null, composableLambdaRememberComposableLambda, (Function1) objRememberedValue3, null, centerStart, fit, composer2, 102236592, 54, 62136);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24576, 13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ff(modifier, color, str, chaloTextWithBackgroundData, list, list2, iconType, z2, i, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:106:0x0131  */
    /* JADX WARN: Code duplicated, block: B:108:0x013f  */
    /* JADX WARN: Code duplicated, block: B:121:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0170  */
    /* JADX WARN: Code duplicated, block: B:123:0x0173  */
    /* JADX WARN: Code duplicated, block: B:126:0x0178  */
    /* JADX WARN: Code duplicated, block: B:127:0x0183  */
    /* JADX WARN: Code duplicated, block: B:129:0x0186  */
    /* JADX WARN: Code duplicated, block: B:132:0x018b  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01af  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:145:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:148:0x021d  */
    /* JADX WARN: Code duplicated, block: B:150:0x022a  */
    /* JADX WARN: Code duplicated, block: B:153:0x0241  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:99:0x011f  */
    public static final void d(Modifier modifier, final String str, TextStyle textStyle, String str2, TextStyle textStyle2, final IconType iconType, float f, float f2, Color color, float f3, float f4, final Function0 onClick, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        TextStyle textStyle3;
        String str3;
        TextStyle textStyleC;
        int i5;
        int i6;
        Color color2;
        int i7;
        int i8;
        boolean z;
        Composer composer2;
        final TextStyle textStyle4;
        final TextStyle textStyle5;
        final float f5;
        final float f6;
        float f7;
        final float f8;
        final Color color3;
        final String str4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier3;
        TextStyle textStyleG;
        float f9;
        final float f10;
        final String str5;
        Modifier modifier4;
        final TextStyle textStyle6;
        int i9;
        final float f11;
        final float f12;
        int i10;
        final Color color4;
        int i11;
        int iOrdinal;
        int i12;
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-120290067);
        int i13 = i3 & 1;
        if (i13 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                textStyle3 = textStyle;
                int i14 = composerStartRestartGroup.changed(textStyle3) ? 256 : 128;
                i4 |= i14;
            } else {
                textStyle3 = textStyle;
            }
            i4 |= i14;
        } else {
            textStyle3 = textStyle;
        }
        int i15 = i3 & 8;
        if (i15 == 0) {
            if ((i & 3072) == 0) {
                str3 = str2;
                i4 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    textStyleC = textStyle2;
                    int i16 = composerStartRestartGroup.changed(textStyleC) ? 16384 : 8192;
                    i4 |= i16;
                } else {
                    textStyleC = textStyle2;
                }
                i4 |= i16;
            } else {
                textStyleC = textStyle2;
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (iconType == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = iconType.ordinal();
                }
                if (composerStartRestartGroup.changed(iOrdinal)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i4 |= i12;
            }
            i5 = 14155776 | i4;
            i6 = i3 & 256;
            if (i6 != 0) {
                if ((100663296 & i) == 0) {
                    color2 = color;
                    if (composerStartRestartGroup.changed(color2)) {
                        i7 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i7 = 33554432;
                    }
                    i5 |= i7;
                }
                if ((i & 805306368) == 0) {
                    i5 |= 268435456;
                }
                if ((i2 & 6) == 0) {
                    i8 = i2 | (((i3 & 1024) == 0 || !composerStartRestartGroup.changed(f4)) ? 2 : 4);
                } else {
                    i8 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i8 |= i11;
                }
                if ((i5 & 306783379) == 306783378 || (i8 & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i5 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i13 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i3 & 4) != 0) {
                            textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 6));
                            i5 &= -897;
                        } else {
                            textStyleG = textStyle3;
                        }
                        if (i15 != 0) {
                            str3 = null;
                        }
                        if ((i3 & 16) != 0) {
                            textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 6));
                            i5 &= -57345;
                        }
                        float fM7278constructorimpl = Dp.m7278constructorimpl(32);
                        float fM7278constructorimpl2 = Dp.m7278constructorimpl(32);
                        if (i6 != 0) {
                            color2 = null;
                        }
                        float f13 = ChaloTheme.b(composerStartRestartGroup, 6).d;
                        int i17 = i5 & (-1879048193);
                        if ((i3 & 1024) != 0) {
                            i8 &= -15;
                            f9 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                        } else {
                            f9 = f4;
                        }
                        f10 = f13;
                        str5 = str3;
                        modifier4 = modifier3;
                        textStyle6 = textStyleG;
                        i9 = i17;
                        f11 = fM7278constructorimpl;
                        f12 = fM7278constructorimpl2;
                        i10 = i8;
                        textStyle4 = textStyleC;
                        color4 = color2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i5 &= -897;
                        }
                        if ((i3 & 16) != 0) {
                            i5 &= -57345;
                        }
                        i9 = i5 & (-1879048193);
                        if ((i3 & 1024) != 0) {
                            i8 &= -15;
                        }
                        f11 = f;
                        f10 = f3;
                        f9 = f4;
                        textStyle6 = textStyle3;
                        str5 = str3;
                        i10 = i8;
                        textStyle4 = textStyleC;
                        modifier4 = modifier2;
                        color4 = color2;
                        f12 = f2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-120290067, i9, i10, "app.chalo.compose.components.ChaloWidgetWithTitleAndIcon (ChaloWidgetCard.kt:216)");
                    }
                    int i18 = i9;
                    Color color5 = color4;
                    float f14 = f11;
                    float f15 = f12;
                    f7 = f10;
                    String str6 = str5;
                    Modifier modifier5 = modifier4;
                    float f16 = f9;
                    ChaloRoundedCardKt.b(modifier5, null, f16, 0.0f, ComposableLambdaKt.rememberComposableLambda(357669260, true, new Function3() { // from class: fn
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Composer composer3;
                            ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                            Composer composer4 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                            if (composer4.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(357669260, iIntValue, -1, "app.chalo.compose.components.ChaloWidgetWithTitleAndIcon.<anonymous> (ChaloWidgetCard.kt:221)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Function0 function0 = onClick;
                                boolean zChanged = composer4.changed(function0);
                                Object objRememberedValue = composer4.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new fk(function0, 10);
                                    composer4.updateRememberedValue(objRememberedValue);
                                }
                                Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null);
                                ColorFilter colorFilterM4646tintxETnrds$default = null;
                                Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(modifierM299clickableoSLSa3U$default, 0.0f, 1, null), ChaloTheme.b(composer4, 6).h);
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer4, 48);
                                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                int i19 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM784padding3ABfNKs);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer4);
                                pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i19), composerM3915constructorimpl));
                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                IconType iconType2 = iconType;
                                if (iconType2 == null) {
                                    composer4.startReplaceGroup(651566471);
                                    composer4.endReplaceGroup();
                                } else {
                                    composer4.startReplaceGroup(651566472);
                                    Painter painterA = PainterResourceHelperKt.a(iconType2, composer4, 0);
                                    Color color6 = color4;
                                    if (color6 != null) {
                                        colorFilterM4646tintxETnrds$default = ColorFilter.Companion.m4646tintxETnrds$default(ColorFilter.INSTANCE, color6.m4615unboximpl(), 0, 2, null);
                                    }
                                    ImageKt.Image(painterA, (String) null, SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion, f11), f12), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM4646tintxETnrds$default, composer4, Painter.$stable | 48, 56);
                                    ChaloSpacersKt.x(composer4, 0);
                                    composer4.endReplaceGroup();
                                }
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composer4, 6);
                                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                                int i20 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, companion);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer4);
                                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i20), composerM3915constructorimpl2));
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                String str7 = str;
                                if (str7 == null) {
                                    composer4.startReplaceGroup(-2087481536);
                                    composer4.endReplaceGroup();
                                } else {
                                    composer4.startReplaceGroup(-2087481535);
                                    TextKt.m2623TextNvy7gAk(str7, null, ChaloTheme.a(composer4, 6).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle6, composer4, 0, 0, 131066);
                                    composer4 = composer4;
                                    composer4.endReplaceGroup();
                                }
                                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, f10), composer4, 0);
                                String str8 = str5;
                                if (str8 == null) {
                                    composer4.startReplaceGroup(-2087165429);
                                    composer4.endReplaceGroup();
                                    composer3 = composer4;
                                } else {
                                    composer4.startReplaceGroup(-2087165428);
                                    composer3 = composer4;
                                    TextKt.m2623TextNvy7gAk(str8, null, ChaloTheme.a(composer4, 6).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composer3, 0, 0, 131066);
                                    composer3.endReplaceGroup();
                                }
                                if (r1.k(composer3)) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, (i18 & 14) | 24576 | ((i10 << 6) & 896), 10);
                    modifier2 = modifier5;
                    composer2 = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str4 = str6;
                    f8 = f16;
                    textStyle5 = textStyle6;
                    f5 = f14;
                    f6 = f15;
                    color3 = color5;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    TextStyle textStyle7 = textStyle3;
                    textStyle4 = textStyleC;
                    textStyle5 = textStyle7;
                    f5 = f;
                    f6 = f2;
                    f7 = f3;
                    f8 = f4;
                    color3 = color2;
                    str4 = str3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier6 = modifier2;
                    final TextStyle textStyle8 = textStyle4;
                    final float f17 = f7;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: gn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                            int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                            ChaloWidgetCardKt.d(modifier6, str, textStyle5, str4, textStyle8, iconType, f5, f6, color3, f17, f8, onClick, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i5 = 114819072 | i4;
            color2 = color;
            if ((i & 805306368) == 0) {
                i5 |= 268435456;
            }
            if ((i2 & 6) == 0) {
                i8 = i2 | (((i3 & 1024) == 0 || !composerStartRestartGroup.changed(f4)) ? 2 : 4);
            } else {
                i8 = i2;
            }
            if ((i2 & 48) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i11 = 32;
                } else {
                    i11 = 16;
                }
                i8 |= i11;
            }
            if ((i5 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (composerStartRestartGroup.shouldExecute(z, i5 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 4) != 0) {
                        textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 6));
                        i5 &= -897;
                    } else {
                        textStyleG = textStyle3;
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if ((i3 & 16) != 0) {
                        textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 6));
                        i5 &= -57345;
                    }
                    float fM7278constructorimpl3 = Dp.m7278constructorimpl(32);
                    float fM7278constructorimpl4 = Dp.m7278constructorimpl(32);
                    if (i6 != 0) {
                        color2 = null;
                    }
                    float f18 = ChaloTheme.b(composerStartRestartGroup, 6).d;
                    int i19 = i5 & (-1879048193);
                    if ((i3 & 1024) != 0) {
                        i8 &= -15;
                        f9 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                    } else {
                        f9 = f4;
                    }
                    f10 = f18;
                    str5 = str3;
                    modifier4 = modifier3;
                    textStyle6 = textStyleG;
                    i9 = i19;
                    f11 = fM7278constructorimpl3;
                    f12 = fM7278constructorimpl4;
                    i10 = i8;
                    textStyle4 = textStyleC;
                    color4 = color2;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 4) != 0) {
                        textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 6));
                        i5 &= -897;
                    } else {
                        textStyleG = textStyle3;
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if ((i3 & 16) != 0) {
                        textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 6));
                        i5 &= -57345;
                    }
                    float fM7278constructorimpl5 = Dp.m7278constructorimpl(32);
                    float fM7278constructorimpl6 = Dp.m7278constructorimpl(32);
                    if (i6 != 0) {
                        color2 = null;
                    }
                    float f19 = ChaloTheme.b(composerStartRestartGroup, 6).d;
                    int i110 = i5 & (-1879048193);
                    if ((i3 & 1024) != 0) {
                        i8 &= -15;
                        f9 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                    } else {
                        f9 = f4;
                    }
                    f10 = f19;
                    str5 = str3;
                    modifier4 = modifier3;
                    textStyle6 = textStyleG;
                    i9 = i110;
                    f11 = fM7278constructorimpl5;
                    f12 = fM7278constructorimpl6;
                    i10 = i8;
                    textStyle4 = textStyleC;
                    color4 = color2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-120290067, i9, i10, "app.chalo.compose.components.ChaloWidgetWithTitleAndIcon (ChaloWidgetCard.kt:216)");
                }
                int i111 = i9;
                Color color6 = color4;
                float f110 = f11;
                float f111 = f12;
                f7 = f10;
                String str7 = str5;
                Modifier modifier7 = modifier4;
                float f112 = f9;
                ChaloRoundedCardKt.b(modifier7, null, f112, 0.0f, ComposableLambdaKt.rememberComposableLambda(357669260, true, new Function3() { // from class: fn
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Composer composer3;
                        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                        Composer composer4 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                        if (composer4.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(357669260, iIntValue, -1, "app.chalo.compose.components.ChaloWidgetWithTitleAndIcon.<anonymous> (ChaloWidgetCard.kt:221)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Function0 function0 = onClick;
                            boolean zChanged = composer4.changed(function0);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new fk(function0, 10);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null);
                            ColorFilter colorFilterM4646tintxETnrds$default = null;
                            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(modifierM299clickableoSLSa3U$default, 0.0f, 1, null), ChaloTheme.b(composer4, 6).h);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer4, 48);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                            int i112 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM784padding3ABfNKs);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer4.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer4);
                            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i112), composerM3915constructorimpl));
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            IconType iconType2 = iconType;
                            if (iconType2 == null) {
                                composer4.startReplaceGroup(651566471);
                                composer4.endReplaceGroup();
                            } else {
                                composer4.startReplaceGroup(651566472);
                                Painter painterA = PainterResourceHelperKt.a(iconType2, composer4, 0);
                                Color color7 = color4;
                                if (color7 != null) {
                                    colorFilterM4646tintxETnrds$default = ColorFilter.Companion.m4646tintxETnrds$default(ColorFilter.INSTANCE, color7.m4615unboximpl(), 0, 2, null);
                                }
                                ImageKt.Image(painterA, (String) null, SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion, f11), f12), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM4646tintxETnrds$default, composer4, Painter.$stable | 48, 56);
                                ChaloSpacersKt.x(composer4, 0);
                                composer4.endReplaceGroup();
                            }
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composer4, 6);
                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                            int i20 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, companion);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer4.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer4);
                            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i20), composerM3915constructorimpl2));
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            String str8 = str;
                            if (str8 == null) {
                                composer4.startReplaceGroup(-2087481536);
                                composer4.endReplaceGroup();
                            } else {
                                composer4.startReplaceGroup(-2087481535);
                                TextKt.m2623TextNvy7gAk(str8, null, ChaloTheme.a(composer4, 6).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle6, composer4, 0, 0, 131066);
                                composer4 = composer4;
                                composer4.endReplaceGroup();
                            }
                            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, f10), composer4, 0);
                            String str9 = str5;
                            if (str9 == null) {
                                composer4.startReplaceGroup(-2087165429);
                                composer4.endReplaceGroup();
                                composer3 = composer4;
                            } else {
                                composer4.startReplaceGroup(-2087165428);
                                composer3 = composer4;
                                TextKt.m2623TextNvy7gAk(str9, null, ChaloTheme.a(composer4, 6).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composer3, 0, 0, 131066);
                                composer3.endReplaceGroup();
                            }
                            if (r1.k(composer3)) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer4.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i111 & 14) | 24576 | ((i10 << 6) & 896), 10);
                modifier2 = modifier7;
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str7;
                f8 = f112;
                textStyle5 = textStyle6;
                f5 = f110;
                f6 = f111;
                color3 = color6;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                TextStyle textStyle9 = textStyle3;
                textStyle4 = textStyleC;
                textStyle5 = textStyle9;
                f5 = f;
                f6 = f2;
                f7 = f3;
                f8 = f4;
                color3 = color2;
                str4 = str3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier8 = modifier2;
                final TextStyle textStyle10 = textStyle4;
                final float f113 = f7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: gn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                        ChaloWidgetCardKt.d(modifier8, str, textStyle5, str4, textStyle10, iconType, f5, f6, color3, f113, f8, onClick, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i4 |= 3072;
        str3 = str2;
        if ((i & 24576) == 0) {
            if ((i3 & 16) == 0) {
                textStyleC = textStyle2;
                if (composerStartRestartGroup.changed(textStyleC)) {
                }
                i4 |= i16;
            } else {
                textStyleC = textStyle2;
            }
            i4 |= i16;
        } else {
            textStyleC = textStyle2;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (iconType == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = iconType.ordinal();
            }
            if (composerStartRestartGroup.changed(iOrdinal)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i4 |= i12;
        }
        i5 = 14155776 | i4;
        i6 = i3 & 256;
        if (i6 != 0) {
            if ((100663296 & i) == 0) {
                color2 = color;
                if (composerStartRestartGroup.changed(color2)) {
                    i7 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i7 = 33554432;
                }
                i5 |= i7;
            }
            if ((i & 805306368) == 0) {
                i5 |= 268435456;
            }
            if ((i2 & 6) == 0) {
                i8 = i2 | (((i3 & 1024) == 0 || !composerStartRestartGroup.changed(f4)) ? 2 : 4);
            } else {
                i8 = i2;
            }
            if ((i2 & 48) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i11 = 32;
                } else {
                    i11 = 16;
                }
                i8 |= i11;
            }
            if ((i5 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (composerStartRestartGroup.shouldExecute(z, i5 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 4) != 0) {
                        textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 6));
                        i5 &= -897;
                    } else {
                        textStyleG = textStyle3;
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if ((i3 & 16) != 0) {
                        textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 6));
                        i5 &= -57345;
                    }
                    float fM7278constructorimpl7 = Dp.m7278constructorimpl(32);
                    float fM7278constructorimpl8 = Dp.m7278constructorimpl(32);
                    if (i6 != 0) {
                        color2 = null;
                    }
                    float f114 = ChaloTheme.b(composerStartRestartGroup, 6).d;
                    int i112 = i5 & (-1879048193);
                    if ((i3 & 1024) != 0) {
                        i8 &= -15;
                        f9 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                    } else {
                        f9 = f4;
                    }
                    f10 = f114;
                    str5 = str3;
                    modifier4 = modifier3;
                    textStyle6 = textStyleG;
                    i9 = i112;
                    f11 = fM7278constructorimpl7;
                    f12 = fM7278constructorimpl8;
                    i10 = i8;
                    textStyle4 = textStyleC;
                    color4 = color2;
                } else {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i3 & 4) != 0) {
                        textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 6));
                        i5 &= -897;
                    } else {
                        textStyleG = textStyle3;
                    }
                    if (i15 != 0) {
                        str3 = null;
                    }
                    if ((i3 & 16) != 0) {
                        textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 6));
                        i5 &= -57345;
                    }
                    float fM7278constructorimpl9 = Dp.m7278constructorimpl(32);
                    float fM7278constructorimpl10 = Dp.m7278constructorimpl(32);
                    if (i6 != 0) {
                        color2 = null;
                    }
                    float f115 = ChaloTheme.b(composerStartRestartGroup, 6).d;
                    int i113 = i5 & (-1879048193);
                    if ((i3 & 1024) != 0) {
                        i8 &= -15;
                        f9 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                    } else {
                        f9 = f4;
                    }
                    f10 = f115;
                    str5 = str3;
                    modifier4 = modifier3;
                    textStyle6 = textStyleG;
                    i9 = i113;
                    f11 = fM7278constructorimpl9;
                    f12 = fM7278constructorimpl10;
                    i10 = i8;
                    textStyle4 = textStyleC;
                    color4 = color2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-120290067, i9, i10, "app.chalo.compose.components.ChaloWidgetWithTitleAndIcon (ChaloWidgetCard.kt:216)");
                }
                int i114 = i9;
                Color color7 = color4;
                float f116 = f11;
                float f117 = f12;
                f7 = f10;
                String str8 = str5;
                Modifier modifier9 = modifier4;
                float f118 = f9;
                ChaloRoundedCardKt.b(modifier9, null, f118, 0.0f, ComposableLambdaKt.rememberComposableLambda(357669260, true, new Function3() { // from class: fn
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Composer composer3;
                        ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                        Composer composer4 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                        if (composer4.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(357669260, iIntValue, -1, "app.chalo.compose.components.ChaloWidgetWithTitleAndIcon.<anonymous> (ChaloWidgetCard.kt:221)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Function0 function0 = onClick;
                            boolean zChanged = composer4.changed(function0);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new fk(function0, 10);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null);
                            ColorFilter colorFilterM4646tintxETnrds$default = null;
                            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(modifierM299clickableoSLSa3U$default, 0.0f, 1, null), ChaloTheme.b(composer4, 6).h);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer4, 48);
                            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                            int i115 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM784padding3ABfNKs);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer4.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer4);
                            pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i115), composerM3915constructorimpl));
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            IconType iconType2 = iconType;
                            if (iconType2 == null) {
                                composer4.startReplaceGroup(651566471);
                                composer4.endReplaceGroup();
                            } else {
                                composer4.startReplaceGroup(651566472);
                                Painter painterA = PainterResourceHelperKt.a(iconType2, composer4, 0);
                                Color color8 = color4;
                                if (color8 != null) {
                                    colorFilterM4646tintxETnrds$default = ColorFilter.Companion.m4646tintxETnrds$default(ColorFilter.INSTANCE, color8.m4615unboximpl(), 0, 2, null);
                                }
                                ImageKt.Image(painterA, (String) null, SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion, f11), f12), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM4646tintxETnrds$default, composer4, Painter.$stable | 48, 56);
                                ChaloSpacersKt.x(composer4, 0);
                                composer4.endReplaceGroup();
                            }
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composer4, 6);
                            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                            int i20 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, companion);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer4.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer4);
                            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i20), composerM3915constructorimpl2));
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            String str9 = str;
                            if (str9 == null) {
                                composer4.startReplaceGroup(-2087481536);
                                composer4.endReplaceGroup();
                            } else {
                                composer4.startReplaceGroup(-2087481535);
                                TextKt.m2623TextNvy7gAk(str9, null, ChaloTheme.a(composer4, 6).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle6, composer4, 0, 0, 131066);
                                composer4 = composer4;
                                composer4.endReplaceGroup();
                            }
                            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, f10), composer4, 0);
                            String str10 = str5;
                            if (str10 == null) {
                                composer4.startReplaceGroup(-2087165429);
                                composer4.endReplaceGroup();
                                composer3 = composer4;
                            } else {
                                composer4.startReplaceGroup(-2087165428);
                                composer3 = composer4;
                                TextKt.m2623TextNvy7gAk(str10, null, ChaloTheme.a(composer4, 6).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composer3, 0, 0, 131066);
                                composer3.endReplaceGroup();
                            }
                            if (r1.k(composer3)) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer4.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i114 & 14) | 24576 | ((i10 << 6) & 896), 10);
                modifier2 = modifier9;
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str4 = str8;
                f8 = f118;
                textStyle5 = textStyle6;
                f5 = f116;
                f6 = f117;
                color3 = color7;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                TextStyle textStyle11 = textStyle3;
                textStyle4 = textStyleC;
                textStyle5 = textStyle11;
                f5 = f;
                f6 = f2;
                f7 = f3;
                f8 = f4;
                color3 = color2;
                str4 = str3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier10 = modifier2;
                final TextStyle textStyle12 = textStyle4;
                final float f119 = f7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: gn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                        int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                        ChaloWidgetCardKt.d(modifier10, str, textStyle5, str4, textStyle12, iconType, f5, f6, color3, f119, f8, onClick, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i5 = 114819072 | i4;
        color2 = color;
        if ((i & 805306368) == 0) {
            i5 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            i8 = i2 | (((i3 & 1024) == 0 || !composerStartRestartGroup.changed(f4)) ? 2 : 4);
        } else {
            i8 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerStartRestartGroup.changedInstance(onClick)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i8 |= i11;
        }
        if ((i5 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (composerStartRestartGroup.shouldExecute(z, i5 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 4) != 0) {
                    textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 6));
                    i5 &= -897;
                } else {
                    textStyleG = textStyle3;
                }
                if (i15 != 0) {
                    str3 = null;
                }
                if ((i3 & 16) != 0) {
                    textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 6));
                    i5 &= -57345;
                }
                float fM7278constructorimpl11 = Dp.m7278constructorimpl(32);
                float fM7278constructorimpl12 = Dp.m7278constructorimpl(32);
                if (i6 != 0) {
                    color2 = null;
                }
                float f1110 = ChaloTheme.b(composerStartRestartGroup, 6).d;
                int i115 = i5 & (-1879048193);
                if ((i3 & 1024) != 0) {
                    i8 &= -15;
                    f9 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                } else {
                    f9 = f4;
                }
                f10 = f1110;
                str5 = str3;
                modifier4 = modifier3;
                textStyle6 = textStyleG;
                i9 = i115;
                f11 = fM7278constructorimpl11;
                f12 = fM7278constructorimpl12;
                i10 = i8;
                textStyle4 = textStyleC;
                color4 = color2;
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i3 & 4) != 0) {
                    textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 6));
                    i5 &= -897;
                } else {
                    textStyleG = textStyle3;
                }
                if (i15 != 0) {
                    str3 = null;
                }
                if ((i3 & 16) != 0) {
                    textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 6));
                    i5 &= -57345;
                }
                float fM7278constructorimpl13 = Dp.m7278constructorimpl(32);
                float fM7278constructorimpl14 = Dp.m7278constructorimpl(32);
                if (i6 != 0) {
                    color2 = null;
                }
                float f1111 = ChaloTheme.b(composerStartRestartGroup, 6).d;
                int i116 = i5 & (-1879048193);
                if ((i3 & 1024) != 0) {
                    i8 &= -15;
                    f9 = ChaloTheme.c(composerStartRestartGroup, 6).c;
                } else {
                    f9 = f4;
                }
                f10 = f1111;
                str5 = str3;
                modifier4 = modifier3;
                textStyle6 = textStyleG;
                i9 = i116;
                f11 = fM7278constructorimpl13;
                f12 = fM7278constructorimpl14;
                i10 = i8;
                textStyle4 = textStyleC;
                color4 = color2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-120290067, i9, i10, "app.chalo.compose.components.ChaloWidgetWithTitleAndIcon (ChaloWidgetCard.kt:216)");
            }
            int i117 = i9;
            Color color8 = color4;
            float f1112 = f11;
            float f1113 = f12;
            f7 = f10;
            String str9 = str5;
            Modifier modifier11 = modifier4;
            float f1114 = f9;
            ChaloRoundedCardKt.b(modifier11, null, f1114, 0.0f, ComposableLambdaKt.rememberComposableLambda(357669260, true, new Function3() { // from class: fn
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer3;
                    ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                    Composer composer4 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                    if (composer4.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(357669260, iIntValue, -1, "app.chalo.compose.components.ChaloWidgetWithTitleAndIcon.<anonymous> (ChaloWidgetCard.kt:221)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Function0 function0 = onClick;
                        boolean zChanged = composer4.changed(function0);
                        Object objRememberedValue = composer4.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new fk(function0, 10);
                            composer4.updateRememberedValue(objRememberedValue);
                        }
                        Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null);
                        ColorFilter colorFilterM4646tintxETnrds$default = null;
                        Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(modifierM299clickableoSLSa3U$default, 0.0f, 1, null), ChaloTheme.b(composer4, 6).h);
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion2.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer4, 48);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                        int i118 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM784padding3ABfNKs);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer4);
                        pk0.v(companion3, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i118), composerM3915constructorimpl));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        IconType iconType2 = iconType;
                        if (iconType2 == null) {
                            composer4.startReplaceGroup(651566471);
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(651566472);
                            Painter painterA = PainterResourceHelperKt.a(iconType2, composer4, 0);
                            Color color9 = color4;
                            if (color9 != null) {
                                colorFilterM4646tintxETnrds$default = ColorFilter.Companion.m4646tintxETnrds$default(ColorFilter.INSTANCE, color9.m4615unboximpl(), 0, 2, null);
                            }
                            ImageKt.Image(painterA, (String) null, SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion, f11), f12), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM4646tintxETnrds$default, composer4, Painter.$stable | 48, 56);
                            ChaloSpacersKt.x(composer4, 0);
                            composer4.endReplaceGroup();
                        }
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion2.getStart(), composer4, 6);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
                        int i20 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, companion);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor2);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer4);
                        pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i20), composerM3915constructorimpl2));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        String str10 = str;
                        if (str10 == null) {
                            composer4.startReplaceGroup(-2087481536);
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(-2087481535);
                            TextKt.m2623TextNvy7gAk(str10, null, ChaloTheme.a(composer4, 6).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle6, composer4, 0, 0, 131066);
                            composer4 = composer4;
                            composer4.endReplaceGroup();
                        }
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, f10), composer4, 0);
                        String str11 = str5;
                        if (str11 == null) {
                            composer4.startReplaceGroup(-2087165429);
                            composer4.endReplaceGroup();
                            composer3 = composer4;
                        } else {
                            composer4.startReplaceGroup(-2087165428);
                            composer3 = composer4;
                            TextKt.m2623TextNvy7gAk(str11, null, ChaloTheme.a(composer4, 6).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle4, composer3, 0, 0, 131066);
                            composer3.endReplaceGroup();
                        }
                        if (r1.k(composer3)) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i117 & 14) | 24576 | ((i10 << 6) & 896), 10);
            modifier2 = modifier11;
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str4 = str9;
            f8 = f1114;
            textStyle5 = textStyle6;
            f5 = f1112;
            f6 = f1113;
            color3 = color8;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            TextStyle textStyle13 = textStyle3;
            textStyle4 = textStyleC;
            textStyle5 = textStyle13;
            f5 = f;
            f6 = f2;
            f7 = f3;
            f8 = f4;
            color3 = color2;
            str4 = str3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier12 = modifier2;
            final TextStyle textStyle14 = textStyle4;
            final float f1115 = f7;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: gn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    ChaloWidgetCardKt.d(modifier12, str, textStyle5, str4, textStyle14, iconType, f5, f6, color3, f1115, f8, onClick, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, i3);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void e(final Modifier modifier, final TextFormatAppModel textFormatAppModel, TextStyle textStyle, TextStyle textStyle2, final IconType iconType, float f, float f2, float f3, final Function0 onClick, Composer composer, final int i) {
        int i2;
        final TextStyle textStyle3;
        final TextStyle textStyle4;
        final float f4;
        final float f5;
        Composer composer2;
        final float f6;
        int i3;
        float fM7278constructorimpl;
        float f7;
        TextStyle textStyle5;
        TextStyle textStyle6;
        float f8;
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1439949485);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(textFormatAppModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 = i2 | 11264;
        }
        if ((196608 & i) == 0) {
            i4 |= composerStartRestartGroup.changed(iconType.ordinal()) ? 131072 : 65536;
        }
        int i5 = 14155776 | i4;
        if ((100663296 & i) == 0) {
            i5 = 47710208 | i4;
        }
        if ((805306368 & i) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onClick) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i5) != 306783378, i5 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                TextStyle textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 6));
                TextStyle textStyleC = ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 6));
                float fM7278constructorimpl2 = Dp.m7278constructorimpl(32);
                i3 = i5 & (-234939265);
                fM7278constructorimpl = Dp.m7278constructorimpl(32);
                f7 = fM7278constructorimpl2;
                textStyle5 = textStyleC;
                textStyle6 = textStyleG;
                f8 = ChaloTheme.b(composerStartRestartGroup, 6).d;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i3 = i5 & (-234939265);
                textStyle6 = textStyle;
                textStyle5 = textStyle2;
                f7 = f;
                fM7278constructorimpl = f2;
                f8 = f3;
            }
            int i6 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1439949485, i6, -1, "app.chalo.compose.components.ChaloWidgetWithTitleAndIcon (ChaloWidgetCard.kt:160)");
            }
            float f9 = f7;
            float f10 = fM7278constructorimpl;
            float f11 = f8;
            TextStyle textStyle7 = textStyle6;
            TextStyle textStyle8 = textStyle5;
            ChaloRoundedCardKt.b(modifier, null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1785293394, true, new hn(onClick, iconType, f7, fM7278constructorimpl, textFormatAppModel, f8, textStyle6, textStyle5), composerStartRestartGroup, 54), composerStartRestartGroup, (i6 & 14) | 24576, 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle3 = textStyle7;
            composer2 = composerStartRestartGroup;
            textStyle4 = textStyle8;
            f6 = f9;
            f4 = f10;
            f5 = f11;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            textStyle3 = textStyle;
            textStyle4 = textStyle2;
            f4 = f2;
            f5 = f3;
            composer2 = composerStartRestartGroup;
            f6 = f;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: in
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloWidgetCardKt.e(modifier, textFormatAppModel, textStyle3, textStyle4, iconType, f6, f4, f5, onClick, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0172  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:112:0x0236  */
    /* JADX WARN: Code duplicated, block: B:114:0x0240  */
    /* JADX WARN: Code duplicated, block: B:116:0x0249  */
    /* JADX WARN: Code duplicated, block: B:119:0x025a  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x0109  */
    /* JADX WARN: Code duplicated, block: B:89:0x011d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0130  */
    /* JADX WARN: Code duplicated, block: B:94:0x014e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0151  */
    /* JADX WARN: Code duplicated, block: B:99:0x0169  */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x0130, please report this as an issue */
    public static final void f(final TextFormatAppModel text, Modifier modifier, final TextStyle textStyle, long j, long j2, long j3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        TextStyle textStyle2;
        int i4;
        long j4;
        int i5;
        int i6;
        long j5;
        int i7;
        int i8;
        int i9;
        boolean z;
        Composer composer2;
        final Modifier modifier3;
        final long j6;
        final long j7;
        final long j8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        long jM4641getUnspecified0d7_KjU;
        long jM7479getUnspecifiedXSAIIZE;
        long jM7479getUnspecifiedXSAIIZE2;
        long j9;
        long j10;
        Modifier modifier4;
        TextFormatAppModel.HtmlFormatted htmlFormatted;
        Composer composer3;
        TextUnit textUnitM7458boximpl;
        long packedValue;
        TextUnit.Companion companion;
        Modifier modifier5;
        int i10;
        Intrinsics.i(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-281565456);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                textStyle2 = textStyle;
                if (composerStartRestartGroup.changed(textStyle2)) {
                    i10 = 256;
                } else {
                    i10 = 128;
                }
                i3 |= i10;
            } else {
                textStyle2 = textStyle;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    j4 = j;
                    if (composerStartRestartGroup.changed(j4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        j5 = j2;
                        if (composerStartRestartGroup.changed(j5)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        if (composerStartRestartGroup.changed(j3)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 74899) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                            } else {
                                jM4641getUnspecified0d7_KjU = j4;
                            }
                            if (i6 != 0) {
                                jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                            } else {
                                jM7479getUnspecifiedXSAIIZE = j5;
                            }
                            if (i8 != 0) {
                                j10 = jM7479getUnspecifiedXSAIIZE;
                                jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                                modifier4 = modifier2;
                                j9 = jM4641getUnspecified0d7_KjU;
                            } else {
                                jM7479getUnspecifiedXSAIIZE2 = j3;
                                j9 = jM4641getUnspecified0d7_KjU;
                                j10 = jM7479getUnspecifiedXSAIIZE;
                                modifier4 = modifier2;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            jM7479getUnspecifiedXSAIIZE2 = j3;
                            j10 = j5;
                            modifier4 = modifier2;
                            j9 = j4;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-281565456, i3, -1, "app.chalo.compose.components.Text (ChaloWidgetCard.kt:268)");
                        }
                        if (text instanceof TextFormatAppModel.HtmlFormatted) {
                            composerStartRestartGroup.startReplaceGroup(-45014881);
                            htmlFormatted = (TextFormatAppModel.HtmlFormatted) text;
                            if (htmlFormatted.b.isEmpty()) {
                                composer3 = composerStartRestartGroup;
                                composer3.startReplaceGroup(-44229527);
                                androidx.compose.material3.TextKt.m2623TextNvy7gAk(htmlFormatted.c, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle2, composer3, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                                composer3.endReplaceGroup();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-44979479);
                                textUnitM7458boximpl = TextUnit.m7458boximpl(j10);
                                packedValue = textUnitM7458boximpl.getPackedValue();
                                companion = TextUnit.INSTANCE;
                                if (TextUnit.m7465equalsimpl0(packedValue, companion.m7479getUnspecifiedXSAIIZE())) {
                                    textUnitM7458boximpl = null;
                                }
                                if (textUnitM7458boximpl == null) {
                                    textUnitM7458boximpl = TextUnit.m7458boximpl(textStyle2.m6771getFontSizeXSAIIZE());
                                    modifier5 = modifier4;
                                    if (TextUnit.m7465equalsimpl0(textUnitM7458boximpl.getPackedValue(), companion.m7479getUnspecifiedXSAIIZE())) {
                                        textUnitM7458boximpl = null;
                                    }
                                } else {
                                    modifier5 = modifier4;
                                }
                                composer3 = composerStartRestartGroup;
                                modifier4 = modifier5;
                                TextWithSpecialFeaturesTagsKt.a(TextWithSpecialFeaturesTagsUIStateKt.b(htmlFormatted.b, UITextStyle.BodySmall, textUnitM7458boximpl != null ? Integer.valueOf((int) TextUnit.m7468getValueimpl(textUnitM7458boximpl.getPackedValue())) : null, j9, composerStartRestartGroup, (i3 & 7168) | 48), modifier4, composer3, i3 & 112, 0);
                                composer3.endReplaceGroup();
                            }
                            composer3.endReplaceGroup();
                            composer2 = composer3;
                        } else {
                            if (text instanceof TextFormatAppModel.Simple) {
                                throw pk0.p(composerStartRestartGroup, -1453653);
                            }
                            composerStartRestartGroup.startReplaceGroup(-43889395);
                            androidx.compose.material3.TextKt.m2623TextNvy7gAk(((TextFormatAppModel.Simple) text).b, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle, composerStartRestartGroup, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        j6 = j9;
                        j7 = j10;
                        j8 = jM7479getUnspecifiedXSAIIZE2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        j6 = j4;
                        j7 = j5;
                        j8 = j3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jn
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ChaloWidgetCardKt.f(text, modifier3, textStyle, j6, j7, j8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                return Unit.f17538a;
                            }
                        });
                    }
                }
                i3 |= 24576;
                j5 = j2;
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    if (composerStartRestartGroup.changed(j3)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i3 & 74899) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                        } else {
                            jM4641getUnspecified0d7_KjU = j4;
                        }
                        if (i6 != 0) {
                            jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                        } else {
                            jM7479getUnspecifiedXSAIIZE = j5;
                        }
                        if (i8 != 0) {
                            j10 = jM7479getUnspecifiedXSAIIZE;
                            jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                            modifier4 = modifier2;
                            j9 = jM4641getUnspecified0d7_KjU;
                        } else {
                            jM7479getUnspecifiedXSAIIZE2 = j3;
                            j9 = jM4641getUnspecified0d7_KjU;
                            j10 = jM7479getUnspecifiedXSAIIZE;
                            modifier4 = modifier2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                        } else {
                            jM4641getUnspecified0d7_KjU = j4;
                        }
                        if (i6 != 0) {
                            jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                        } else {
                            jM7479getUnspecifiedXSAIIZE = j5;
                        }
                        if (i8 != 0) {
                            j10 = jM7479getUnspecifiedXSAIIZE;
                            jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                            modifier4 = modifier2;
                            j9 = jM4641getUnspecified0d7_KjU;
                        } else {
                            jM7479getUnspecifiedXSAIIZE2 = j3;
                            j9 = jM4641getUnspecified0d7_KjU;
                            j10 = jM7479getUnspecifiedXSAIIZE;
                            modifier4 = modifier2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-281565456, i3, -1, "app.chalo.compose.components.Text (ChaloWidgetCard.kt:268)");
                    }
                    if (text instanceof TextFormatAppModel.HtmlFormatted) {
                        composerStartRestartGroup.startReplaceGroup(-45014881);
                        htmlFormatted = (TextFormatAppModel.HtmlFormatted) text;
                        if (htmlFormatted.b.isEmpty()) {
                            composerStartRestartGroup.startReplaceGroup(-44979479);
                            textUnitM7458boximpl = TextUnit.m7458boximpl(j10);
                            packedValue = textUnitM7458boximpl.getPackedValue();
                            companion = TextUnit.INSTANCE;
                            if (TextUnit.m7465equalsimpl0(packedValue, companion.m7479getUnspecifiedXSAIIZE())) {
                                textUnitM7458boximpl = null;
                            }
                            if (textUnitM7458boximpl == null) {
                                textUnitM7458boximpl = TextUnit.m7458boximpl(textStyle2.m6771getFontSizeXSAIIZE());
                                modifier5 = modifier4;
                                if (TextUnit.m7465equalsimpl0(textUnitM7458boximpl.getPackedValue(), companion.m7479getUnspecifiedXSAIIZE())) {
                                    textUnitM7458boximpl = null;
                                }
                            } else {
                                modifier5 = modifier4;
                            }
                            composer3 = composerStartRestartGroup;
                            modifier4 = modifier5;
                            TextWithSpecialFeaturesTagsKt.a(TextWithSpecialFeaturesTagsUIStateKt.b(htmlFormatted.b, UITextStyle.BodySmall, textUnitM7458boximpl != null ? Integer.valueOf((int) TextUnit.m7468getValueimpl(textUnitM7458boximpl.getPackedValue())) : null, j9, composerStartRestartGroup, (i3 & 7168) | 48), modifier4, composer3, i3 & 112, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3 = composerStartRestartGroup;
                            composer3.startReplaceGroup(-44229527);
                            androidx.compose.material3.TextKt.m2623TextNvy7gAk(htmlFormatted.c, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle2, composer3, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                            composer3.endReplaceGroup();
                        }
                        composer3.endReplaceGroup();
                        composer2 = composer3;
                    } else {
                        if (text instanceof TextFormatAppModel.Simple) {
                            throw pk0.p(composerStartRestartGroup, -1453653);
                        }
                        composerStartRestartGroup.startReplaceGroup(-43889395);
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(((TextFormatAppModel.Simple) text).b, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle, composerStartRestartGroup, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    j6 = j9;
                    j7 = j10;
                    j8 = jM7479getUnspecifiedXSAIIZE2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    j6 = j4;
                    j7 = j5;
                    j8 = j3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ChaloWidgetCardKt.f(text, modifier3, textStyle, j6, j7, j8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i3 |= 3072;
            j4 = j;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    j5 = j2;
                    if (composerStartRestartGroup.changed(j5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    if (composerStartRestartGroup.changed(j3)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i3 & 74899) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                        } else {
                            jM4641getUnspecified0d7_KjU = j4;
                        }
                        if (i6 != 0) {
                            jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                        } else {
                            jM7479getUnspecifiedXSAIIZE = j5;
                        }
                        if (i8 != 0) {
                            j10 = jM7479getUnspecifiedXSAIIZE;
                            jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                            modifier4 = modifier2;
                            j9 = jM4641getUnspecified0d7_KjU;
                        } else {
                            jM7479getUnspecifiedXSAIIZE2 = j3;
                            j9 = jM4641getUnspecified0d7_KjU;
                            j10 = jM7479getUnspecifiedXSAIIZE;
                            modifier4 = modifier2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                        } else {
                            jM4641getUnspecified0d7_KjU = j4;
                        }
                        if (i6 != 0) {
                            jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                        } else {
                            jM7479getUnspecifiedXSAIIZE = j5;
                        }
                        if (i8 != 0) {
                            j10 = jM7479getUnspecifiedXSAIIZE;
                            jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                            modifier4 = modifier2;
                            j9 = jM4641getUnspecified0d7_KjU;
                        } else {
                            jM7479getUnspecifiedXSAIIZE2 = j3;
                            j9 = jM4641getUnspecified0d7_KjU;
                            j10 = jM7479getUnspecifiedXSAIIZE;
                            modifier4 = modifier2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-281565456, i3, -1, "app.chalo.compose.components.Text (ChaloWidgetCard.kt:268)");
                    }
                    if (text instanceof TextFormatAppModel.HtmlFormatted) {
                        composerStartRestartGroup.startReplaceGroup(-45014881);
                        htmlFormatted = (TextFormatAppModel.HtmlFormatted) text;
                        if (htmlFormatted.b.isEmpty()) {
                            composerStartRestartGroup.startReplaceGroup(-44979479);
                            textUnitM7458boximpl = TextUnit.m7458boximpl(j10);
                            packedValue = textUnitM7458boximpl.getPackedValue();
                            companion = TextUnit.INSTANCE;
                            if (TextUnit.m7465equalsimpl0(packedValue, companion.m7479getUnspecifiedXSAIIZE())) {
                                textUnitM7458boximpl = null;
                            }
                            if (textUnitM7458boximpl == null) {
                                textUnitM7458boximpl = TextUnit.m7458boximpl(textStyle2.m6771getFontSizeXSAIIZE());
                                modifier5 = modifier4;
                                if (TextUnit.m7465equalsimpl0(textUnitM7458boximpl.getPackedValue(), companion.m7479getUnspecifiedXSAIIZE())) {
                                    textUnitM7458boximpl = null;
                                }
                            } else {
                                modifier5 = modifier4;
                            }
                            composer3 = composerStartRestartGroup;
                            modifier4 = modifier5;
                            TextWithSpecialFeaturesTagsKt.a(TextWithSpecialFeaturesTagsUIStateKt.b(htmlFormatted.b, UITextStyle.BodySmall, textUnitM7458boximpl != null ? Integer.valueOf((int) TextUnit.m7468getValueimpl(textUnitM7458boximpl.getPackedValue())) : null, j9, composerStartRestartGroup, (i3 & 7168) | 48), modifier4, composer3, i3 & 112, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3 = composerStartRestartGroup;
                            composer3.startReplaceGroup(-44229527);
                            androidx.compose.material3.TextKt.m2623TextNvy7gAk(htmlFormatted.c, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle2, composer3, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                            composer3.endReplaceGroup();
                        }
                        composer3.endReplaceGroup();
                        composer2 = composer3;
                    } else {
                        if (text instanceof TextFormatAppModel.Simple) {
                            throw pk0.p(composerStartRestartGroup, -1453653);
                        }
                        composerStartRestartGroup.startReplaceGroup(-43889395);
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(((TextFormatAppModel.Simple) text).b, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle, composerStartRestartGroup, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    j6 = j9;
                    j7 = j10;
                    j8 = jM7479getUnspecifiedXSAIIZE2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    j6 = j4;
                    j7 = j5;
                    j8 = j3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ChaloWidgetCardKt.f(text, modifier3, textStyle, j6, j7, j8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i3 |= 24576;
            j5 = j2;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changed(j3)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i3 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                    } else {
                        jM4641getUnspecified0d7_KjU = j4;
                    }
                    if (i6 != 0) {
                        jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                    } else {
                        jM7479getUnspecifiedXSAIIZE = j5;
                    }
                    if (i8 != 0) {
                        j10 = jM7479getUnspecifiedXSAIIZE;
                        jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                        modifier4 = modifier2;
                        j9 = jM4641getUnspecified0d7_KjU;
                    } else {
                        jM7479getUnspecifiedXSAIIZE2 = j3;
                        j9 = jM4641getUnspecified0d7_KjU;
                        j10 = jM7479getUnspecifiedXSAIIZE;
                        modifier4 = modifier2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                    } else {
                        jM4641getUnspecified0d7_KjU = j4;
                    }
                    if (i6 != 0) {
                        jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                    } else {
                        jM7479getUnspecifiedXSAIIZE = j5;
                    }
                    if (i8 != 0) {
                        j10 = jM7479getUnspecifiedXSAIIZE;
                        jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                        modifier4 = modifier2;
                        j9 = jM4641getUnspecified0d7_KjU;
                    } else {
                        jM7479getUnspecifiedXSAIIZE2 = j3;
                        j9 = jM4641getUnspecified0d7_KjU;
                        j10 = jM7479getUnspecifiedXSAIIZE;
                        modifier4 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-281565456, i3, -1, "app.chalo.compose.components.Text (ChaloWidgetCard.kt:268)");
                }
                if (text instanceof TextFormatAppModel.HtmlFormatted) {
                    composerStartRestartGroup.startReplaceGroup(-45014881);
                    htmlFormatted = (TextFormatAppModel.HtmlFormatted) text;
                    if (htmlFormatted.b.isEmpty()) {
                        composerStartRestartGroup.startReplaceGroup(-44979479);
                        textUnitM7458boximpl = TextUnit.m7458boximpl(j10);
                        packedValue = textUnitM7458boximpl.getPackedValue();
                        companion = TextUnit.INSTANCE;
                        if (TextUnit.m7465equalsimpl0(packedValue, companion.m7479getUnspecifiedXSAIIZE())) {
                            textUnitM7458boximpl = null;
                        }
                        if (textUnitM7458boximpl == null) {
                            textUnitM7458boximpl = TextUnit.m7458boximpl(textStyle2.m6771getFontSizeXSAIIZE());
                            modifier5 = modifier4;
                            if (TextUnit.m7465equalsimpl0(textUnitM7458boximpl.getPackedValue(), companion.m7479getUnspecifiedXSAIIZE())) {
                                textUnitM7458boximpl = null;
                            }
                        } else {
                            modifier5 = modifier4;
                        }
                        composer3 = composerStartRestartGroup;
                        modifier4 = modifier5;
                        TextWithSpecialFeaturesTagsKt.a(TextWithSpecialFeaturesTagsUIStateKt.b(htmlFormatted.b, UITextStyle.BodySmall, textUnitM7458boximpl != null ? Integer.valueOf((int) TextUnit.m7468getValueimpl(textUnitM7458boximpl.getPackedValue())) : null, j9, composerStartRestartGroup, (i3 & 7168) | 48), modifier4, composer3, i3 & 112, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3 = composerStartRestartGroup;
                        composer3.startReplaceGroup(-44229527);
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(htmlFormatted.c, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle2, composer3, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                        composer3.endReplaceGroup();
                    }
                    composer3.endReplaceGroup();
                    composer2 = composer3;
                } else {
                    if (text instanceof TextFormatAppModel.Simple) {
                        throw pk0.p(composerStartRestartGroup, -1453653);
                    }
                    composerStartRestartGroup.startReplaceGroup(-43889395);
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(((TextFormatAppModel.Simple) text).b, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle, composerStartRestartGroup, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j6 = j9;
                j7 = j10;
                j8 = jM7479getUnspecifiedXSAIIZE2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                j6 = j4;
                j7 = j5;
                j8 = j3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ChaloWidgetCardKt.f(text, modifier3, textStyle, j6, j7, j8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
            textStyle2 = textStyle;
            if (composerStartRestartGroup.changed(textStyle2)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i3 |= i10;
        } else {
            textStyle2 = textStyle;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                j4 = j;
                if (composerStartRestartGroup.changed(j4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    j5 = j2;
                    if (composerStartRestartGroup.changed(j5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    if (composerStartRestartGroup.changed(j3)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((i3 & 74899) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                        } else {
                            jM4641getUnspecified0d7_KjU = j4;
                        }
                        if (i6 != 0) {
                            jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                        } else {
                            jM7479getUnspecifiedXSAIIZE = j5;
                        }
                        if (i8 != 0) {
                            j10 = jM7479getUnspecifiedXSAIIZE;
                            jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                            modifier4 = modifier2;
                            j9 = jM4641getUnspecified0d7_KjU;
                        } else {
                            jM7479getUnspecifiedXSAIIZE2 = j3;
                            j9 = jM4641getUnspecified0d7_KjU;
                            j10 = jM7479getUnspecifiedXSAIIZE;
                            modifier4 = modifier2;
                        }
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                        } else {
                            jM4641getUnspecified0d7_KjU = j4;
                        }
                        if (i6 != 0) {
                            jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                        } else {
                            jM7479getUnspecifiedXSAIIZE = j5;
                        }
                        if (i8 != 0) {
                            j10 = jM7479getUnspecifiedXSAIIZE;
                            jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                            modifier4 = modifier2;
                            j9 = jM4641getUnspecified0d7_KjU;
                        } else {
                            jM7479getUnspecifiedXSAIIZE2 = j3;
                            j9 = jM4641getUnspecified0d7_KjU;
                            j10 = jM7479getUnspecifiedXSAIIZE;
                            modifier4 = modifier2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-281565456, i3, -1, "app.chalo.compose.components.Text (ChaloWidgetCard.kt:268)");
                    }
                    if (text instanceof TextFormatAppModel.HtmlFormatted) {
                        composerStartRestartGroup.startReplaceGroup(-45014881);
                        htmlFormatted = (TextFormatAppModel.HtmlFormatted) text;
                        if (htmlFormatted.b.isEmpty()) {
                            composerStartRestartGroup.startReplaceGroup(-44979479);
                            textUnitM7458boximpl = TextUnit.m7458boximpl(j10);
                            packedValue = textUnitM7458boximpl.getPackedValue();
                            companion = TextUnit.INSTANCE;
                            if (TextUnit.m7465equalsimpl0(packedValue, companion.m7479getUnspecifiedXSAIIZE())) {
                                textUnitM7458boximpl = null;
                            }
                            if (textUnitM7458boximpl == null) {
                                textUnitM7458boximpl = TextUnit.m7458boximpl(textStyle2.m6771getFontSizeXSAIIZE());
                                modifier5 = modifier4;
                                if (TextUnit.m7465equalsimpl0(textUnitM7458boximpl.getPackedValue(), companion.m7479getUnspecifiedXSAIIZE())) {
                                    textUnitM7458boximpl = null;
                                }
                            } else {
                                modifier5 = modifier4;
                            }
                            composer3 = composerStartRestartGroup;
                            modifier4 = modifier5;
                            TextWithSpecialFeaturesTagsKt.a(TextWithSpecialFeaturesTagsUIStateKt.b(htmlFormatted.b, UITextStyle.BodySmall, textUnitM7458boximpl != null ? Integer.valueOf((int) TextUnit.m7468getValueimpl(textUnitM7458boximpl.getPackedValue())) : null, j9, composerStartRestartGroup, (i3 & 7168) | 48), modifier4, composer3, i3 & 112, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3 = composerStartRestartGroup;
                            composer3.startReplaceGroup(-44229527);
                            androidx.compose.material3.TextKt.m2623TextNvy7gAk(htmlFormatted.c, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle2, composer3, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                            composer3.endReplaceGroup();
                        }
                        composer3.endReplaceGroup();
                        composer2 = composer3;
                    } else {
                        if (text instanceof TextFormatAppModel.Simple) {
                            throw pk0.p(composerStartRestartGroup, -1453653);
                        }
                        composerStartRestartGroup.startReplaceGroup(-43889395);
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(((TextFormatAppModel.Simple) text).b, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle, composerStartRestartGroup, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    j6 = j9;
                    j7 = j10;
                    j8 = jM7479getUnspecifiedXSAIIZE2;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    j6 = j4;
                    j7 = j5;
                    j8 = j3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jn
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ChaloWidgetCardKt.f(text, modifier3, textStyle, j6, j7, j8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return Unit.f17538a;
                        }
                    });
                }
            }
            i3 |= 24576;
            j5 = j2;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changed(j3)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i3 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                    } else {
                        jM4641getUnspecified0d7_KjU = j4;
                    }
                    if (i6 != 0) {
                        jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                    } else {
                        jM7479getUnspecifiedXSAIIZE = j5;
                    }
                    if (i8 != 0) {
                        j10 = jM7479getUnspecifiedXSAIIZE;
                        jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                        modifier4 = modifier2;
                        j9 = jM4641getUnspecified0d7_KjU;
                    } else {
                        jM7479getUnspecifiedXSAIIZE2 = j3;
                        j9 = jM4641getUnspecified0d7_KjU;
                        j10 = jM7479getUnspecifiedXSAIIZE;
                        modifier4 = modifier2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                    } else {
                        jM4641getUnspecified0d7_KjU = j4;
                    }
                    if (i6 != 0) {
                        jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                    } else {
                        jM7479getUnspecifiedXSAIIZE = j5;
                    }
                    if (i8 != 0) {
                        j10 = jM7479getUnspecifiedXSAIIZE;
                        jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                        modifier4 = modifier2;
                        j9 = jM4641getUnspecified0d7_KjU;
                    } else {
                        jM7479getUnspecifiedXSAIIZE2 = j3;
                        j9 = jM4641getUnspecified0d7_KjU;
                        j10 = jM7479getUnspecifiedXSAIIZE;
                        modifier4 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-281565456, i3, -1, "app.chalo.compose.components.Text (ChaloWidgetCard.kt:268)");
                }
                if (text instanceof TextFormatAppModel.HtmlFormatted) {
                    composerStartRestartGroup.startReplaceGroup(-45014881);
                    htmlFormatted = (TextFormatAppModel.HtmlFormatted) text;
                    if (htmlFormatted.b.isEmpty()) {
                        composerStartRestartGroup.startReplaceGroup(-44979479);
                        textUnitM7458boximpl = TextUnit.m7458boximpl(j10);
                        packedValue = textUnitM7458boximpl.getPackedValue();
                        companion = TextUnit.INSTANCE;
                        if (TextUnit.m7465equalsimpl0(packedValue, companion.m7479getUnspecifiedXSAIIZE())) {
                            textUnitM7458boximpl = null;
                        }
                        if (textUnitM7458boximpl == null) {
                            textUnitM7458boximpl = TextUnit.m7458boximpl(textStyle2.m6771getFontSizeXSAIIZE());
                            modifier5 = modifier4;
                            if (TextUnit.m7465equalsimpl0(textUnitM7458boximpl.getPackedValue(), companion.m7479getUnspecifiedXSAIIZE())) {
                                textUnitM7458boximpl = null;
                            }
                        } else {
                            modifier5 = modifier4;
                        }
                        composer3 = composerStartRestartGroup;
                        modifier4 = modifier5;
                        TextWithSpecialFeaturesTagsKt.a(TextWithSpecialFeaturesTagsUIStateKt.b(htmlFormatted.b, UITextStyle.BodySmall, textUnitM7458boximpl != null ? Integer.valueOf((int) TextUnit.m7468getValueimpl(textUnitM7458boximpl.getPackedValue())) : null, j9, composerStartRestartGroup, (i3 & 7168) | 48), modifier4, composer3, i3 & 112, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3 = composerStartRestartGroup;
                        composer3.startReplaceGroup(-44229527);
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(htmlFormatted.c, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle2, composer3, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                        composer3.endReplaceGroup();
                    }
                    composer3.endReplaceGroup();
                    composer2 = composer3;
                } else {
                    if (text instanceof TextFormatAppModel.Simple) {
                        throw pk0.p(composerStartRestartGroup, -1453653);
                    }
                    composerStartRestartGroup.startReplaceGroup(-43889395);
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(((TextFormatAppModel.Simple) text).b, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle, composerStartRestartGroup, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j6 = j9;
                j7 = j10;
                j8 = jM7479getUnspecifiedXSAIIZE2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                j6 = j4;
                j7 = j5;
                j8 = j3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ChaloWidgetCardKt.f(text, modifier3, textStyle, j6, j7, j8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 3072;
        j4 = j;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                j5 = j2;
                if (composerStartRestartGroup.changed(j5)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changed(j3)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((i3 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                    } else {
                        jM4641getUnspecified0d7_KjU = j4;
                    }
                    if (i6 != 0) {
                        jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                    } else {
                        jM7479getUnspecifiedXSAIIZE = j5;
                    }
                    if (i8 != 0) {
                        j10 = jM7479getUnspecifiedXSAIIZE;
                        jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                        modifier4 = modifier2;
                        j9 = jM4641getUnspecified0d7_KjU;
                    } else {
                        jM7479getUnspecifiedXSAIIZE2 = j3;
                        j9 = jM4641getUnspecified0d7_KjU;
                        j10 = jM7479getUnspecifiedXSAIIZE;
                        modifier4 = modifier2;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                    } else {
                        jM4641getUnspecified0d7_KjU = j4;
                    }
                    if (i6 != 0) {
                        jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                    } else {
                        jM7479getUnspecifiedXSAIIZE = j5;
                    }
                    if (i8 != 0) {
                        j10 = jM7479getUnspecifiedXSAIIZE;
                        jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                        modifier4 = modifier2;
                        j9 = jM4641getUnspecified0d7_KjU;
                    } else {
                        jM7479getUnspecifiedXSAIIZE2 = j3;
                        j9 = jM4641getUnspecified0d7_KjU;
                        j10 = jM7479getUnspecifiedXSAIIZE;
                        modifier4 = modifier2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-281565456, i3, -1, "app.chalo.compose.components.Text (ChaloWidgetCard.kt:268)");
                }
                if (text instanceof TextFormatAppModel.HtmlFormatted) {
                    composerStartRestartGroup.startReplaceGroup(-45014881);
                    htmlFormatted = (TextFormatAppModel.HtmlFormatted) text;
                    if (htmlFormatted.b.isEmpty()) {
                        composerStartRestartGroup.startReplaceGroup(-44979479);
                        textUnitM7458boximpl = TextUnit.m7458boximpl(j10);
                        packedValue = textUnitM7458boximpl.getPackedValue();
                        companion = TextUnit.INSTANCE;
                        if (TextUnit.m7465equalsimpl0(packedValue, companion.m7479getUnspecifiedXSAIIZE())) {
                            textUnitM7458boximpl = null;
                        }
                        if (textUnitM7458boximpl == null) {
                            textUnitM7458boximpl = TextUnit.m7458boximpl(textStyle2.m6771getFontSizeXSAIIZE());
                            modifier5 = modifier4;
                            if (TextUnit.m7465equalsimpl0(textUnitM7458boximpl.getPackedValue(), companion.m7479getUnspecifiedXSAIIZE())) {
                                textUnitM7458boximpl = null;
                            }
                        } else {
                            modifier5 = modifier4;
                        }
                        composer3 = composerStartRestartGroup;
                        modifier4 = modifier5;
                        TextWithSpecialFeaturesTagsKt.a(TextWithSpecialFeaturesTagsUIStateKt.b(htmlFormatted.b, UITextStyle.BodySmall, textUnitM7458boximpl != null ? Integer.valueOf((int) TextUnit.m7468getValueimpl(textUnitM7458boximpl.getPackedValue())) : null, j9, composerStartRestartGroup, (i3 & 7168) | 48), modifier4, composer3, i3 & 112, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3 = composerStartRestartGroup;
                        composer3.startReplaceGroup(-44229527);
                        androidx.compose.material3.TextKt.m2623TextNvy7gAk(htmlFormatted.c, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle2, composer3, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                        composer3.endReplaceGroup();
                    }
                    composer3.endReplaceGroup();
                    composer2 = composer3;
                } else {
                    if (text instanceof TextFormatAppModel.Simple) {
                        throw pk0.p(composerStartRestartGroup, -1453653);
                    }
                    composerStartRestartGroup.startReplaceGroup(-43889395);
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(((TextFormatAppModel.Simple) text).b, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle, composerStartRestartGroup, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j6 = j9;
                j7 = j10;
                j8 = jM7479getUnspecifiedXSAIIZE2;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                j6 = j4;
                j7 = j5;
                j8 = j3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jn
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ChaloWidgetCardKt.f(text, modifier3, textStyle, j6, j7, j8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return Unit.f17538a;
                    }
                });
            }
        }
        i3 |= 24576;
        j5 = j2;
        i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            if (composerStartRestartGroup.changed(j3)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        if ((i3 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                } else {
                    jM4641getUnspecified0d7_KjU = j4;
                }
                if (i6 != 0) {
                    jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                } else {
                    jM7479getUnspecifiedXSAIIZE = j5;
                }
                if (i8 != 0) {
                    j10 = jM7479getUnspecifiedXSAIIZE;
                    jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                    modifier4 = modifier2;
                    j9 = jM4641getUnspecified0d7_KjU;
                } else {
                    jM7479getUnspecifiedXSAIIZE2 = j3;
                    j9 = jM4641getUnspecified0d7_KjU;
                    j10 = jM7479getUnspecifiedXSAIIZE;
                    modifier4 = modifier2;
                }
            } else {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    jM4641getUnspecified0d7_KjU = Color.INSTANCE.m4641getUnspecified0d7_KjU();
                } else {
                    jM4641getUnspecified0d7_KjU = j4;
                }
                if (i6 != 0) {
                    jM7479getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                } else {
                    jM7479getUnspecifiedXSAIIZE = j5;
                }
                if (i8 != 0) {
                    j10 = jM7479getUnspecifiedXSAIIZE;
                    jM7479getUnspecifiedXSAIIZE2 = TextUnit.INSTANCE.m7479getUnspecifiedXSAIIZE();
                    modifier4 = modifier2;
                    j9 = jM4641getUnspecified0d7_KjU;
                } else {
                    jM7479getUnspecifiedXSAIIZE2 = j3;
                    j9 = jM4641getUnspecified0d7_KjU;
                    j10 = jM7479getUnspecifiedXSAIIZE;
                    modifier4 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-281565456, i3, -1, "app.chalo.compose.components.Text (ChaloWidgetCard.kt:268)");
            }
            if (text instanceof TextFormatAppModel.HtmlFormatted) {
                composerStartRestartGroup.startReplaceGroup(-45014881);
                htmlFormatted = (TextFormatAppModel.HtmlFormatted) text;
                if (htmlFormatted.b.isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(-44979479);
                    textUnitM7458boximpl = TextUnit.m7458boximpl(j10);
                    packedValue = textUnitM7458boximpl.getPackedValue();
                    companion = TextUnit.INSTANCE;
                    if (TextUnit.m7465equalsimpl0(packedValue, companion.m7479getUnspecifiedXSAIIZE())) {
                        textUnitM7458boximpl = null;
                    }
                    if (textUnitM7458boximpl == null) {
                        textUnitM7458boximpl = TextUnit.m7458boximpl(textStyle2.m6771getFontSizeXSAIIZE());
                        modifier5 = modifier4;
                        if (TextUnit.m7465equalsimpl0(textUnitM7458boximpl.getPackedValue(), companion.m7479getUnspecifiedXSAIIZE())) {
                            textUnitM7458boximpl = null;
                        }
                    } else {
                        modifier5 = modifier4;
                    }
                    composer3 = composerStartRestartGroup;
                    modifier4 = modifier5;
                    TextWithSpecialFeaturesTagsKt.a(TextWithSpecialFeaturesTagsUIStateKt.b(htmlFormatted.b, UITextStyle.BodySmall, textUnitM7458boximpl != null ? Integer.valueOf((int) TextUnit.m7468getValueimpl(textUnitM7458boximpl.getPackedValue())) : null, j9, composerStartRestartGroup, (i3 & 7168) | 48), modifier4, composer3, i3 & 112, 0);
                    composer3.endReplaceGroup();
                } else {
                    composer3 = composerStartRestartGroup;
                    composer3.startReplaceGroup(-44229527);
                    androidx.compose.material3.TextKt.m2623TextNvy7gAk(htmlFormatted.c, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle2, composer3, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                    composer3.endReplaceGroup();
                }
                composer3.endReplaceGroup();
                composer2 = composer3;
            } else {
                if (text instanceof TextFormatAppModel.Simple) {
                    throw pk0.p(composerStartRestartGroup, -1453653);
                }
                composerStartRestartGroup.startReplaceGroup(-43889395);
                androidx.compose.material3.TextKt.m2623TextNvy7gAk(((TextFormatAppModel.Simple) text).b, modifier4, j9, null, j10, null, null, null, 0L, null, null, jM7479getUnspecifiedXSAIIZE2, 0, false, 0, 0, null, textStyle, composerStartRestartGroup, (i3 & 112) | ((i3 >> 3) & 896) | (i3 & 57344), ((i3 >> 12) & 112) | ((i3 << 15) & 29360128), 129000);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            j6 = j9;
            j7 = j10;
            j8 = jM7479getUnspecifiedXSAIIZE2;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
            j6 = j4;
            j7 = j5;
            j8 = j3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: jn
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloWidgetCardKt.f(text, modifier3, textStyle, j6, j7, j8, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return Unit.f17538a;
                }
            });
        }
    }
}
