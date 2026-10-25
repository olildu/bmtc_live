package defpackage;

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
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v11 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19794a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ IconType f;

    public /* synthetic */ v11(Modifier modifier, String str, IconType iconType, String str2, String str3) {
        this.b = modifier;
        this.c = str;
        this.f = iconType;
        this.d = str2;
        this.e = str3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer;
        int i = this.f19794a;
        Unit unit = Unit.f17538a;
        IconType iconType = this.f;
        Modifier modifier = this.b;
        switch (i) {
            case 0:
                ColumnScope ChaloRoundedCard = (ColumnScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard, "$this$ChaloRoundedCard");
                if (!composer2.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1932872953, iIntValue, -1, "app.chalo.home.ui.regularbus.compose.UpdatedProductHorizontalCard.<anonymous> (RegularBusScreenUI.kt:1075)");
                    }
                    Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composer2, 0).h);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 48);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    String str = this.c;
                    if (str != null) {
                        composer2.startReplaceGroup(-880127519);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, Dp.m7278constructorimpl(40)), Dp.m7278constructorimpl(56));
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        Modifier modifier2 = (Modifier) objRememberedValue;
                        SingletonSubcomposeAsyncImageKt.a(str, null, modifier2, null, null, ComposableLambdaKt.rememberComposableLambda(1104928512, true, new ay0(iconType, modifier2, 2), composer2, 54), null, null, companion.getCenterStart(), ContentScale.INSTANCE.getFit(), composer2, 1573296, 54, 62392);
                        ChaloSpacersKt.y(composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (iconType != null) {
                            composer2.startReplaceGroup(-878775423);
                            ImageKt.Image(PainterResourceHelperKt.a(iconType, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, Painter.$stable | 48, 124);
                            ChaloSpacersKt.y(composer2, 0);
                        } else {
                            composer2.startReplaceGroup(-928261715);
                        }
                        composer2.endReplaceGroup();
                    }
                    Modifier modifierA = i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierA);
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
                    pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String str2 = this.d;
                    if (str2 == null) {
                        composer2.startReplaceGroup(-1326139720);
                    } else {
                        composer2.startReplaceGroup(-1326139719);
                        TextKt.m2623TextNvy7gAk(str2, null, ChaloTheme.a(composer2, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composer2, 0).getHeadlineMedium()), composer2, 0, 0, 131066);
                        ChaloSpacersKt.t(composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    String str3 = this.e;
                    if (str3 == null) {
                        composer2.startReplaceGroup(-1325822342);
                    } else {
                        composer2.startReplaceGroup(-1325822341);
                        TextKt.m2623TextNvy7gAk(str3, null, ChaloTheme.a(composer2, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, 0).getBodySmall(), composer2, 0, 0, 131066);
                    }
                    composer2.endReplaceGroup();
                    if (r1.k(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                ColumnScope ChaloRoundedCard2 = (ColumnScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(ChaloRoundedCard2, "$this$ChaloRoundedCard");
                if (!composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    composer3.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(587560971, iIntValue2, -1, "app.chalo.home.ui.regularbus.compose.UpdatedProductVerticalCard.<anonymous> (RegularBusScreenUI.kt:994)");
                    }
                    Modifier modifierM784padding3ABfNKs2 = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ChaloTheme.b(composer3, 0).h);
                    Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                    int i4 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM784padding3ABfNKs2);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor3);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer3);
                    pk0.v(companion4, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i4), composerM3915constructorimpl3));
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    String str4 = this.c;
                    if (str4 == null) {
                        composer3.startReplaceGroup(-1502191842);
                        composer3.endReplaceGroup();
                        composer = composer3;
                    } else {
                        composer3.startReplaceGroup(-1502191841);
                        TextKt.m2623TextNvy7gAk(str4, null, ChaloTheme.a(composer3, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composer3, 0).getHeadlineMedium()), composer3, 0, 0, 131066);
                        composer = composer3;
                        ChaloSpacersKt.t(composer, 0);
                        composer.endReplaceGroup();
                    }
                    String str5 = this.d;
                    if (str5 == null) {
                        composer.startReplaceGroup(-1501906084);
                    } else {
                        composer.startReplaceGroup(-1501906083);
                        TextKt.m2623TextNvy7gAk(str5, null, ChaloTheme.a(composer, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer, 0).getBodySmall(), composer, 0, 0, 131066);
                    }
                    composer.endReplaceGroup();
                    ChaloSpacersKt.o(composer, 0);
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    SpacerKt.Spacer(dq.a(columnScopeInstance2, companion5, 1.0f, false, 2, null), composer, 0);
                    String str6 = this.e;
                    if (str6 != null) {
                        composer.startReplaceGroup(-1501528689);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion5, Dp.m7278constructorimpl(40)), Dp.m7278constructorimpl(56));
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Modifier modifier3 = (Modifier) objRememberedValue2;
                        SingletonSubcomposeAsyncImageKt.a(str6, null, modifier3, null, null, ComposableLambdaKt.rememberComposableLambda(224886280, true, new ay0(iconType, modifier3, 1), composer, 54), null, null, companion3.getCenterStart(), ContentScale.INSTANCE.getFit(), composer, 1573296, 54, 62392);
                        composer.endReplaceGroup();
                    } else {
                        if (iconType != null) {
                            composer.startReplaceGroup(-1500222225);
                            ImageKt.Image(PainterResourceHelperKt.a(iconType, composer, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, Painter.$stable | 48, 124);
                        } else {
                            composer.startReplaceGroup(-1547548499);
                        }
                        composer.endReplaceGroup();
                    }
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ v11(Modifier modifier, String str, String str2, String str3, IconType iconType) {
        this.b = modifier;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = iconType;
    }
}
