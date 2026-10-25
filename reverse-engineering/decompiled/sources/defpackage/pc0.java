package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TooltipKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.PopupPositionProvider;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pc0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19022a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pc0(long j, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f19022a = i;
        this.b = j;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f19022a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj7;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                Function2 function2 = (Function2) obj4;
                Modifier cardModifier = (Modifier) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(cardModifier, "cardModifier");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer.changed(cardModifier) ? 4 : 2;
                }
                if (composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1692270781, iIntValue, -1, "app.chalo.validationsdk.blevalidation.ui.common.JourneyTripPlannerDefaultLegSection.<anonymous> (JourneyDetailsBottomSheet.kt:205)");
                    }
                    Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(cardModifier, null, false, 3, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierWrapContentHeight$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m263backgroundbw27NRU(companion2, this.b, ChaloTheme.d(composer, 0).b), ChaloTheme.b(composer, 0).f, ChaloTheme.b(composer, 0).d);
                    TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
                    TextKt.m2623TextNvy7gAk(str, modifierM785paddingVpY3zN4, ChaloTheme.a(composer, 0).t, null, 0L, null, null, null, 0L, null, null, 0L, companion3.m7225getClipgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.i(ChaloTheme.e(composer, 0)), composer, 0, 24960, 110584);
                    ChaloSpacersKt.t(composer, 0);
                    Modifier.Companion companion4 = companion2;
                    TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TO_, new Object[]{str2}, composer, 6), SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), ChaloTheme.a(composer, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, companion3.m7225getClipgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composer, 0)), composer, 48, 24960, 110584);
                    if (str3 == null) {
                        composer.startReplaceGroup(-549465734);
                    } else {
                        composer.startReplaceGroup(-549465733);
                        ChaloSpacersKt.t(composer, 0);
                        TextKt.m2623TextNvy7gAk(str3, companion4, ChaloTheme.a(composer, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, companion3.m7225getClipgIe3tQ8(), false, 1, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composer, 0)), composer, 48, 24960, 110584);
                        companion4 = companion4;
                    }
                    composer.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composer, 0).h), composer, 0);
                    function2.invoke(composer, 0);
                    SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion4, ChaloTheme.b(composer, 0).h), composer, 0);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            default:
                return TooltipKt.layoutCaret_J5j9r9c$lambda$22(this.b, (Function1) obj7, (Density) obj6, (PopupPositionProvider) obj5, (MutableState) obj4, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
        }
    }
}
