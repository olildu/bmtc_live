package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.TabKt;
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
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.BulletListComponentWithLineIconKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qu0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19156a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Function e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qu0(float f, Modifier modifier, List list, Function0 function0, String str) {
        this.c = f;
        this.d = modifier;
        this.b = list;
        this.e = function0;
        this.f = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19156a;
        Unit unit = Unit.f17538a;
        int i2 = 0;
        Object obj3 = this.f;
        final float f = this.c;
        Function function = this.e;
        Object obj4 = this.d;
        List list = this.b;
        int i3 = 3;
        switch (i) {
            case 0:
                Modifier modifier = (Modifier) obj4;
                Function0 function0 = (Function0) function;
                String str = (String) obj3;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-456283980, iIntValue, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusRouteListDialogue.<anonymous> (PremiumBusRouteListDialogue.kt:45)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierThen = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.m816heightInVpY3zN4$default(ClipKt.clip(companion, ChaloTheme.d(composer, 0).c), 0.0f, f, 1, null), ChaloTheme.a(composer, 0).t, null, 2, null).then(modifier);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierThen);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                    pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer, 54);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer);
                    pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ROUTE_LIST, new Object[0], composer, 6), null, ChaloTheme.a(composer, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer, 0).getHeadlineMedium(), composer, 0, 0, 131066);
                    boolean zChanged = composer.changed(function0);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ar0(function0, 11);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null);
                    Painter painterA = PainterResourceHelperKt.a(IconType.IC_CLOSE, composer, 6);
                    int i6 = Painter.$stable | 48;
                    ImageKt.Image(painterA, (String) null, modifierM299clickableoSLSa3U$default, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, i6, 120);
                    composer.endNode();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).g), composer, 0);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
                    long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i7 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor3);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer);
                    pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                    Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i7), composerM3915constructorimpl3));
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_CHALO_BUS, composer, 6), (String) null, ClipKt.clipToBounds(PaddingKt.m788paddingqDBjuR0$default(companion, 0.0f, 0.0f, ChaloTheme.b(composer, 0).e, 0.0f, 11, null)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, i6, 120);
                    SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, ChaloTheme.b(composer, 0).f), composer, 0);
                    TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composer, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer, 0).getHeadlineMedium(), composer, 0, 0, 131066);
                    composer.endNode();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer, 0).g), composer, 0);
                    Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), ChaloTheme.b(composer, 0).e, 0.0f, 0.0f, 0.0f, 14, null);
                    int size = list.size();
                    float f2 = ChaloTheme.b(composer, 0).h;
                    boolean zChangedInstance = composer.changedInstance(list);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new ud(list, 19);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    BulletListComponentWithLineIconKt.b(size, modifierM788paddingqDBjuR0$default, 0.0f, 0.0f, 0.0f, f2, (Function1) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(-1031707377, true, new rs(list, 3), composer, 54), composer, 12582912, 28);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            default:
                PagerState pagerState = (PagerState) obj4;
                Function1 function1 = (Function1) function;
                final Function5 function5 = (Function5) obj3;
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(442266333, iIntValue2, -1, "app.chalo.premiumbus.ui.slotselection.compose.PremiumBusScrollableTabRow.<anonymous> (PremiumBusScrollableTabRow.kt:63)");
                    }
                    final int i8 = 0;
                    for (final Object obj5 : list) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        boolean z = pagerState.getCurrentPage() == i8 ? 1 : i2;
                        boolean zChanged2 = composer2.changed(function1) | composer2.changed(i8);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new cf(i8, i3, function1);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        TabKt.m2513TabbogVsAg(z, (Function0) objRememberedValue3, SizeKt.m835widthInVpY3zN4$default(SizeKt.m835widthInVpY3zN4$default(SizeKt.m816heightInVpY3zN4$default(ZIndexModifierKt.zIndex(Modifier.INSTANCE, pagerState.getCurrentPage() == i8 ? 2.0f : 0.0f), ChaloTheme.b(composer2, i2).m, 0.0f, 2, null), f, 0.0f, 2, null), f, 0.0f, 2, null), false, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(2021383197, true, new Function3() { // from class: ru0
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                ColumnScope Tab = (ColumnScope) obj6;
                                Composer composer3 = (Composer) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                Intrinsics.i(Tab, "$this$Tab");
                                if (composer3.shouldExecute((iIntValue3 & 17) != 16, iIntValue3 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2021383197, iIntValue3, -1, "app.chalo.premiumbus.ui.slotselection.compose.PremiumBusScrollableTabRow.<anonymous>.<anonymous>.<anonymous> (PremiumBusScrollableTabRow.kt:75)");
                                    }
                                    Modifier modifierM835widthInVpY3zN4$default = SizeKt.m835widthInVpY3zN4$default(SizeKt.m816heightInVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer3, 0).m, 0.0f, 2, null), f, 0.0f, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                    long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                                    int i10 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                                    CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifierM835widthInVpY3zN4$default);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor4);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer3);
                                    pk0.v(companion4, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
                                    Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i10), composerM3915constructorimpl4));
                                    function5.invoke(BoxScopeInstance.INSTANCE, obj5, Integer.valueOf(i8), composer3, 6);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }, composer2, 54), composer2, 12582912, 120);
                        i8 = i9;
                        i2 = 0;
                        i3 = 3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
        }
    }

    public /* synthetic */ qu0(List list, PagerState pagerState, Function1 function1, float f, Function5 function5) {
        this.b = list;
        this.d = pagerState;
        this.e = function1;
        this.c = f;
        this.f = function5;
    }
}
