package app.chalo.home.ui.chalobus;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.theme.ChaloTheme;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.bu0;
import defpackage.iw0;
import defpackage.lu0;
import defpackage.pk0;
import defpackage.yu0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/PremiumBusTutorialViewState;", "viewState", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusTutorialScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(PremiumBusTutorialComponent premiumBusTutorialComponent, Composer composer, int i) {
        int i2;
        PremiumBusTutorialComponent premiumBusTutorialComponent2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1091198136);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(premiumBusTutorialComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091198136, i2, -1, "app.chalo.home.ui.chalobus.PremiumBusTutorialScreen (PremiumBusTutorialScreen.kt:21)");
            }
            PremiumBusTutorialViewState premiumBusTutorialViewState = (PremiumBusTutorialViewState) SubscribeAsStateKt.a(premiumBusTutorialComponent.t0(), composerStartRestartGroup).getValue();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(premiumBusTutorialComponent);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                premiumBusTutorialComponent2 = premiumBusTutorialComponent;
                PremiumBusTutorialScreenKt$PremiumBusTutorialScreen$1$1 premiumBusTutorialScreenKt$PremiumBusTutorialScreen$1$1 = new PremiumBusTutorialScreenKt$PremiumBusTutorialScreen$1$1(1, premiumBusTutorialComponent2, PremiumBusTutorialComponent.class, "processIntent", "processIntent(Lapp/chalo/home/ui/chalobus/PremiumBusTutorialViewIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(premiumBusTutorialScreenKt$PremiumBusTutorialScreen$1$1);
                objRememberedValue = premiumBusTutorialScreenKt$PremiumBusTutorialScreen$1$1;
            } else {
                premiumBusTutorialComponent2 = premiumBusTutorialComponent;
            }
            b(premiumBusTutorialViewState, (Function1) ((KFunction) objRememberedValue), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            premiumBusTutorialComponent2 = premiumBusTutorialComponent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yu0(premiumBusTutorialComponent2, i, 11));
        }
    }

    public static final void b(PremiumBusTutorialViewState premiumBusTutorialViewState, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function2;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(-309179956);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(premiumBusTutorialViewState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-309179956, i2, -1, "app.chalo.home.ui.chalobus.PremiumBusTutorialScreen (PremiumBusTutorialScreen.kt:34)");
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new iw0(function1, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue, 0, 0, composerStartRestartGroup, 3);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposableLambda composableLambda = ComposableSingletons$PremiumBusTutorialScreenKt.f3289a;
            float f = ChaloTheme.b(composerStartRestartGroup, 0).f1916a;
            boolean z2 = i3 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new iw0(function1, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ChaloToolBarKt.a(null, composableLambda, null, null, f, 0L, null, (Function0) objRememberedValue2, false, null, composerStartRestartGroup, 48, 0, 1901);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            PaddingValues paddingValuesM777PaddingValues0680j_4 = PaddingKt.m777PaddingValues0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM672spacedBy0680j_4 = arrangement.m672spacedBy0680j_4(ChaloTheme.b(composerStartRestartGroup, 0).h);
            obj = premiumBusTutorialViewState;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(obj) | (i3 == 32);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                function2 = function1;
                objRememberedValue3 = new lu0(8, obj, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                function2 = function1;
            }
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, paddingValuesM777PaddingValues0680j_4, false, horizontalOrVerticalM672spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, 6, 490);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function2 = function1;
            obj = premiumBusTutorialViewState;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new bu0(obj, function2, i, 20));
        }
    }
}
