package app.chalo.core.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.BackHandlerKt;
import app.chalo.core.compose.NetworkInspectorScreenKt;
import app.chalo.core.networkinspector.NetworkInspectorComponent;
import app.chalo.core.networkinspector.NetworkInspectorState;
import app.chalo.network.logging.NetworkCallInfo;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.fk0;
import defpackage.h3;
import defpackage.im0;
import defpackage.nf;
import defpackage.ob;
import defpackage.pk;
import defpackage.pk0;
import defpackage.u50;
import defpackage.um0;
import defpackage.wi0;
import defpackage.wm0;
import defpackage.za0;
import defpackage.zk0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/core/networkinspector/NetworkInspectorState;", RemoteConfigConstants.ResponseFieldKey.STATE, "core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NetworkInspectorScreenKt {
    public static final void a(String str, String str2, Composer composer, int i) {
        int i2;
        String str3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(687962399);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(687962399, i2, -1, "app.chalo.core.compose.DetailRow (NetworkInspectorScreen.kt:273)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m672spacedBy0680j_4(Dp.m7278constructorimpl(4)), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleSmall(), composerStartRestartGroup, i2 & 14, 0, 131070);
            composer2 = composerStartRestartGroup;
            str3 = str2;
            SelectionContainerKt.SelectionContainer(null, ComposableLambdaKt.rememberComposableLambda(1443986982, true, new pk(str3, 9), composer2, 54), composer2, 48, 1);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str3 = str2;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nf(str, str3, i, 3));
        }
    }

    public static final void b(String str, Modifier modifier, Function3 function3, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-528099282);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-528099282, i3, -1, "app.chalo.core.compose.DetailSection (NetworkInspectorScreen.kt:254)");
            }
            CardKt.OutlinedCard(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1979684922, true, new u50(13, str, function3), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wm0(i, 0, str, modifier2, function3));
        }
    }

    public static final void c(NetworkCallInfo networkCallInfo, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1132735832);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(networkCallInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1132735832, i2, -1, "app.chalo.core.compose.NetworkInspectorDetails (NetworkInspectorScreen.kt:216)");
            }
            float f = 12;
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(modifier, Dp.m7278constructorimpl(16), Dp.m7278constructorimpl(f));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM672spacedBy0680j_4 = Arrangement.INSTANCE.m672spacedBy0680j_4(Dp.m7278constructorimpl(f));
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(networkCallInfo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wi0(networkCallInfo, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(modifierM785paddingVpY3zN4, null, null, false, horizontalOrVerticalM672spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 24576, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk0(i, 9, modifier, networkCallInfo));
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01d8  */
    public static final void d(final List list, final boolean z, final String str, final Function1 function1, final Modifier modifier, Composer composer, final int i) {
        int i2;
        List list2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1629441736);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1629441736, i2, -1, "app.chalo.core.compose.NetworkInspectorList (NetworkInspectorScreen.kt:134)");
            }
            if (list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-978140353);
                Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(modifier, Dp.m7278constructorimpl(16));
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m672spacedBy0680j_4(Dp.m7278constructorimpl(8)), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
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
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(1510512134);
                    TextKt.m2623TextNvy7gAk("Refreshing...", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 6, 0, 262142);
                    composer3.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1510570879);
                    TextKt.m2623TextNvy7gAk("No network calls yet", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 6, 0, 262142);
                    composer3.endReplaceGroup();
                }
                if (str != null) {
                    composer3 = composerStartRestartGroup;
                    if (StringsKt.F(str)) {
                        composer3 = composerStartRestartGroup;
                        composer3 = composerStartRestartGroup;
                        composer3 = composerStartRestartGroup;
                        composer3.startReplaceGroup(1505343163);
                    } else {
                        composer3 = composerStartRestartGroup;
                        composer3.startReplaceGroup(1510680991);
                        Composer composer4 = composer3;
                        TextKt.m2623TextNvy7gAk(str, null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getError(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, (i2 >> 6) & 14, 0, 262138);
                        composer3 = composer4;
                    }
                } else {
                    composer3 = composerStartRestartGroup;
                    composer3 = composerStartRestartGroup;
                    composer3 = composerStartRestartGroup;
                    composer3.startReplaceGroup(1505343163);
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                composer3.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i4 = 0;
                function2 = new Function2() { // from class: zm0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).getClass();
                                NetworkInspectorScreenKt.d(list, z, str, function1, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                NetworkInspectorScreenKt.d(list, z, str, function1, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                list2 = list;
                int i5 = i2;
                composerStartRestartGroup.startReplaceGroup(-983156246);
                composerStartRestartGroup.endReplaceGroup();
                boolean zChangedInstance = ((i5 & 896) == 256) | composerStartRestartGroup.changedInstance(list2) | ((i5 & 7168) == 2048);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new za0(15, list2, str, function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                LazyDslKt.LazyColumn(modifier, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i5 >> 12) & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
                composer2 = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
        list2 = list;
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i6 = 1;
            final List list3 = list2;
            function2 = new Function2() { // from class: zm0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i6) {
                        case 0:
                            ((Integer) obj2).getClass();
                            NetworkInspectorScreenKt.d(list3, z, str, function1, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            NetworkInspectorScreenKt.d(list3, z, str, function1, modifier, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(NetworkInspectorComponent networkInspectorComponent, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1415195567);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(networkInspectorComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1415195567, i2, -1, "app.chalo.core.compose.NetworkInspectorScreen (NetworkInspectorScreen.kt:43)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(networkInspectorComponent.t0(), composerStartRestartGroup);
            ClipboardManager clipboardManager = (ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager());
            NetworkCallInfo networkCallInfo = ((NetworkInspectorState) mutableStateA.getValue()).b;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(networkInspectorComponent) | composerStartRestartGroup.changedInstance(clipboardManager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new NetworkInspectorScreenKt$NetworkInspectorScreen$1$1(networkInspectorComponent, clipboardManager, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(networkInspectorComponent, clipboardManager, (Function2) objRememberedValue, composerStartRestartGroup, i2 & 14);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(networkInspectorComponent);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new um0(networkInspectorComponent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.a(false, (Function0) objRememberedValue2, 0, 0, composerStartRestartGroup, 3);
            ScaffoldKt.m2316ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1442158733, true, new h3(27, networkInspectorComponent, networkCallInfo), composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-379046530, true, new ob(13, networkCallInfo, networkInspectorComponent, mutableStateA), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fk0(networkInspectorComponent, i, 3));
        }
    }

    public static final String f(Map map) {
        return (map == null || map.isEmpty()) ? "No headers" : CollectionsKt.O(map.entrySet(), IOUtils.LINE_SEPARATOR_UNIX, null, null, new im0(20), 30);
    }
}
